package io.github.serpro69.kfaker.app.cli

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.provider.Address
import io.github.serpro69.kfaker.provider.Dota
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldContainExactly
import kotlin.reflect.KClass

class IntrospectorTest : DescribeSpec() {
    private val faker = Faker()

    init {
        describe("Introspector class") {
            val introspector = Introspector(faker)

            context("list all Faker providers") {
                val providers = introspector.providers
                    .map { it.getter.returnType.classifier as KClass<*> }
                    .map { it.simpleName }

                it("should contain all providers") {
                    val expectedProviders = listOf(
                        "Address",
                        "Ancient",
                        "Animal",
                        "App",
                        "Appliance",
                        "AquaTeenHungerForce",
                        "Artist",
                        "BackToTheFuture",
                        "Bank",
                        "Barcode",
                        "Basketball",
                        "Beer",
                        "BigBangTheory",
                        "Blood",
                        "BojackHoreseman",
                        "Book",
                        "BossaNova",
                        "BreakingBad",
                        "Buffy",
                        "Business",
                        "Cannabis",
                        "Cat",
                        "Chiquito",
                        "ChuckNorris",
                        "Code",
                        "Coffee",
                        "Coin",
                        "Color",
                        "Commerce",
                        "Community",
                        "Company",
                        "Computer",
                        "Construction",
                        "Control",
                        "Cosmere",
                        "CryptoCoin",
                        "CultureSeries",
                        "Currency",
                        "DcComics",
                        "Demographic",
                        "Departed",
                        "Dessert",
                        "Device",
                        "DnD",
                        "Dog",
                        "Dota",
                        "DrWho",
                        "DragonBall",
                        "DrivingLicense",
                        "Drone",
                        "DumbAndDumber",
                        "Dune",
                        "ESport",
                        "Educator",
                        "ElderScrolls",
                        "ElectricalComponents",
                        "Fallout",
                        "FamilyGuy",
                        "File",
                        "Food",
                        "Football",
                        "FreshPriceOfBelAir",
                        "Friends",
                        "FunnyName",
                        "Futurama",
                        "Game",
                        "GameOfThrones",
                        "Gender",
                        "GhostBusters",
                        "GratefulDead",
                        "GreekPhilosophers",
                        "Hacker",
                        "HalfLife",
                        "HarryPotter",
                        "Heroes",
                        "HeroesOfTheStorm",
                        "HeyArnold",
                        "Hipster",
                        "HitchhikersGuideToTheGalaxy",
                        "Hobbit",
                        "Horse",
                        "House",
                        "HowIMetYourMother",
                        "IdNumber",
                        "IndustrySegments",
                        "Internet",
                        "Job",
                        "KPop",
                        "LeagueOfLegends",
                        "Lebowski",
                        "LordOfTheRings",
                        "Lorem",
                        "Lovecraft",
                        "Markdown",
                        "Marketing",
                        "Measurement",
                        "MichaelScott",
                        "Military",
                        "Minecraft",
                        "Movie",
                        "Music",
                        "Myst",
                        "Name",
                        "Nation",
                        "NatoPhoneticAlphabet",
                        "NewGirl",
                        "OnePiece",
                        "Opera",
                        "Overwatch",
                        "ParksAndRec",
                        "PearlJam",
                        "Phish",
                        "PhoneNumber",
                        "Pokemon",
                        "Prince",
                        "PrincessBride",
                        "ProgrammingLanguage",
                        "Quote",
                        "Rajnikanth",
                        "Relationship",
                        "Restaurant",
                        "RickAndMorty",
                        "RockBand",
                        "Rupaul",
                        "Rush",
                        "Science",
                        "Seinfeld",
                        "Separator",
                        "Shakespeare",
                        "Show",
                        "SiliconValley",
                        "Simpsons",
                        "SlackEmoji",
                        "SonicTheHedgehog",
                        "SouthPark",
                        "Space",
                        "StarTrek",
                        "StarWars",
                        "Stargate",
                        "StrangerThings",
                        "StreetFighter",
                        "Stripe",
                        "Subscription",
                        "Suits",
                        "SuperSmashBros",
                        "Superhero",
                        "SwordArtOnline",
                        "Team",
                        "TheExpanse",
                        "TheITCrowd",
                        "TheThickOfIt",
                        "TwinPeaks",
                        "UmphreysMcgee",
                        "University",
                        "VForVendetta",
                        "Vehicle",
                        "VentureBros",
                        "Verbs",
                        "WarhammerFantasy",
                        "Witcher",
                        "WorldCup",
                        "WorldOfWarcraft",
                        "Yoda",
                        "Zelda"
                    )
                    providers shouldContainExactly expectedProviders
                }
            }

            context("list available functions for each provider") {
                val providerFunctions = introspector.providerFunctions

                it("should contain all providers") {
                    val providers = providerFunctions.map { it.key.name }
                    val expectedProviders = listOf(
                        "address",
                        "ancient",
                        "animal",
                        "app",
                        "appliance",
                        "aquaTeenHungerForce",
                        "artist",
                        "backToTheFuture",
                        "bank",
                        "barcode",
                        "basketball",
                        "beer",
                        "bigBangTheory",
                        "blood",
                        "bojackHoreseman",
                        "book",
                        "bossaNova",
                        "breakingBad",
                        "buffy",
                        "business",
                        "cannabis",
                        "cat",
                        "chiquito",
                        "chuckNorris",
                        "code",
                        "coffee",
                        "coin",
                        "color",
                        "commerce",
                        "community",
                        "company",
                        "computer",
                        "construction",
                        "control",
                        "cosmere",
                        "cryptoCoin",
                        "cultureSeries",
                        "currency",
                        "dcComics",
                        "demographic",
                        "departed",
                        "dessert",
                        "device",
                        "dnd",
                        "dog",
                        "dota",
                        "drWho",
                        "dragonBall",
                        "drivingLicense",
                        "drone",
                        "dumbAndDumber",
                        "dune",
                        "eSport",
                        "educator",
                        "elderScrolls",
                        "electricalComponents",
                        "fallout",
                        "familyGuy",
                        "file",
                        "food",
                        "football",
                        "freshPriceOfBelAir",
                        "friends",
                        "funnyName",
                        "futurama",
                        "game",
                        "gameOfThrones",
                        "gender",
                        "ghostBusters",
                        "gratefulDead",
                        "greekPhilosophers",
                        "hacker",
                        "halfLife",
                        "harryPotter",
                        "heroes",
                        "heroesOfTheStorm",
                        "heyArnold",
                        "hipster",
                        "hitchhikersGuideToTheGalaxy",
                        "hobbit",
                        "horse",
                        "house",
                        "howIMetYourMother",
                        "idNumber",
                        "industrySegments",
                        "internet",
                        "job",
                        "kPop",
                        "leagueOfLegends",
                        "lebowski",
                        "lordOfTheRings",
                        "lorem",
                        "lovecraft",
                        "markdown",
                        "marketing",
                        "measurement",
                        "michaelScott",
                        "military",
                        "minecraft",
                        "movie",
                        "music",
                        "myst",
                        "name",
                        "nation",
                        "natoPhoneticAlphabet",
                        "newGirl",
                        "onePiece",
                        "opera",
                        "overwatch",
                        "parksAndRec",
                        "pearlJam",
                        "phish",
                        "phoneNumber",
                        "pokemon",
                        "prince",
                        "princessBride",
                        "programmingLanguage",
                        "quote",
                        "rajnikanth",
                        "relationship",
                        "restaurant",
                        "rickAndMorty",
                        "rockBand",
                        "rupaul",
                        "rush",
                        "science",
                        "seinfeld",
                        "separator",
                        "shakespeare",
                        "show",
                        "siliconValley",
                        "simpsons",
                        "slackEmoji",
                        "sonicTheHedgehog",
                        "southPark",
                        "space",
                        "starTrek",
                        "starWars",
                        "stargate",
                        "strangerThings",
                        "streetFighter",
                        "stripe",
                        "subscription",
                        "suits",
                        "superSmashBros",
                        "superhero",
                        "swordArtOnline",
                        "team",
                        "theExpanse",
                        "theITCrowd",
                        "theThickOfIt",
                        "twinPeaks",
                        "umphreysMcgee",
                        "university",
                        "vForVendetta",
                        "vehicle",
                        "ventureBros",
                        "verbs",
                        "warhammerFantasy",
                        "witcher",
                        "worldCup",
                        "worldOfWarcraft",
                        "yoda",
                        "zelda"
                    )

                    providers shouldContainExactly expectedProviders
                }

                it("should contain all functions of the provider") {
                    val addressFunctions = providerFunctions.entries.first {
                        (it.key.returnType.classifier as KClass<*>) == Address::class
                    }.value.map { it.name }

                    val expectedFunctions = listOf(
                        "buildingNumber",
                        "city",
                        "cityWithState",
                        "community",
                        "country",
                        "countryByCode",
                        "countryByName",
                        "countryCode",
                        "countryCodeLong",
                        "defaultCountry",
                        "fullAddress",
                        "mailbox",
                        "postcode",
                        "postcodeByState",
                        "secondaryAddress",
                        "state",
                        "stateAbbr",
                        "streetAddress",
                        "streetName",
                        "timeZone"
                    )

                    addressFunctions shouldContainExactly expectedFunctions
                }

                it("should not contain deprecated functions") {
                    val addressFunctions = providerFunctions.entries.first {
                        (it.key.returnType.classifier as KClass<*>) == Dota::class
                    }.value.map { it.name }

                    val expectedFunctions = listOf("hero", "item", "player", "team")

                    addressFunctions shouldContainExactly expectedFunctions
                }
            }
        }
    }
}
