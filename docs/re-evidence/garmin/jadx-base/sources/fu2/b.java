package fu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfu2/b;", "", "", "theFITWeatherSevereTypeValue", "<init>", "(Ljava/lang/String;IS)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    ASHFALL(66),
    /* JADX INFO: Fake field, exist only in values array */
    AIR_STAGNATION(81),
    /* JADX INFO: Fake field, exist only in values array */
    AIR_QUALITY(79),
    /* JADX INFO: Fake field, exist only in values array */
    BLOWING_SNOW(36),
    /* JADX INFO: Fake field, exist only in values array */
    BRISK_WIND(80),
    /* JADX INFO: Fake field, exist only in values array */
    BLIZZARD(16),
    /* JADX INFO: Fake field, exist only in values array */
    COASTAL_FLOOD(44),
    /* JADX INFO: Fake field, exist only in values array */
    STORM_SURGE(41),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_WATER_LEVEL(65),
    /* JADX INFO: Fake field, exist only in values array */
    DUST_STORM(21),
    /* JADX INFO: Fake field, exist only in values array */
    BLOWING_DUST(70),
    /* JADX INFO: Fake field, exist only in values array */
    EXTREME_COLD(25),
    /* JADX INFO: Fake field, exist only in values array */
    ARCTIC_OUTFLOW(38),
    /* JADX INFO: Fake field, exist only in values array */
    EXCESSIVE_HEAT(46),
    /* JADX INFO: Fake field, exist only in values array */
    AREAL_FLOOD(43),
    /* JADX INFO: Fake field, exist only in values array */
    FLASH_FLOOD(13),
    /* JADX INFO: Fake field, exist only in values array */
    DENSE_FOG(68),
    /* JADX INFO: Fake field, exist only in values array */
    FLOOD(75),
    /* JADX INFO: Fake field, exist only in values array */
    FROST(73),
    /* JADX INFO: Fake field, exist only in values array */
    FIRE_WEATHER(74),
    /* JADX INFO: Fake field, exist only in values array */
    FREEZE(72),
    /* JADX INFO: Fake field, exist only in values array */
    GALE(52),
    /* JADX INFO: Fake field, exist only in values array */
    HURRICANE_FORCE_WIND(7),
    /* JADX INFO: Fake field, exist only in values array */
    INLAND_HURRICANE(6),
    /* JADX INFO: Fake field, exist only in values array */
    HEAVY_SNOW(28),
    /* JADX INFO: Fake field, exist only in values array */
    HEAT(47),
    /* JADX INFO: Fake field, exist only in values array */
    HUMIDEX(51),
    /* JADX INFO: Fake field, exist only in values array */
    HUMIDEX_AND_HEALTH(50),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_HEAT_AND_HUMIDITY(49),
    /* JADX INFO: Fake field, exist only in values array */
    HURRICANE(3),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_WIND(22),
    /* JADX INFO: Fake field, exist only in values array */
    HYDROLOGICAL(83),
    /* JADX INFO: Fake field, exist only in values array */
    DEBRIS_FLOW(19),
    /* JADX INFO: Fake field, exist only in values array */
    HARD_FREEZE(71),
    /* JADX INFO: Fake field, exist only in values array */
    SLEET(33),
    /* JADX INFO: Fake field, exist only in values array */
    ICE_STORM(17),
    /* JADX INFO: Fake field, exist only in values array */
    LAKE_EFFECT_BLOWING_SNOW(29),
    /* JADX INFO: Fake field, exist only in values array */
    LAKE_EFFECT_SNOW(31),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_WATER(82),
    /* JADX INFO: Fake field, exist only in values array */
    LAKESHORE_FLOOD(45),
    /* JADX INFO: Fake field, exist only in values array */
    LAKE_WIND(57),
    /* JADX INFO: Fake field, exist only in values array */
    MARINE_WEATHER(58),
    /* JADX INFO: Fake field, exist only in values array */
    WATERSPOUT(8),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIAL_MARINE(54),
    /* JADX INFO: Fake field, exist only in values array */
    SQUALL(55),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW_AND_BLOWING_SNOW(35),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW_SQUALL(30),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_CRAFT(62),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_CRAFT_ROUGH_BAR(64),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_CRAFT_WINDS(63),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_CRAFT_HAZARDOUS_SEAS(60),
    /* JADX INFO: Fake field, exist only in values array */
    STRONG_WIND(56),
    /* JADX INFO: Fake field, exist only in values array */
    DENSE_SMOKE(69),
    /* JADX INFO: Fake field, exist only in values array */
    SMOG(78),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW(37),
    /* JADX INFO: Fake field, exist only in values array */
    SNOWFALL(34),
    /* JADX INFO: Fake field, exist only in values array */
    STORM(40),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_SURF(77),
    /* JADX INFO: Fake field, exist only in values array */
    SEVERE_THUNDERSTORM(9),
    /* JADX INFO: Fake field, exist only in values array */
    INLAND_TROPICAL_STORM(15),
    /* JADX INFO: Fake field, exist only in values array */
    TORNADO(1),
    /* JADX INFO: Fake field, exist only in values array */
    TROPICAL_STORM(14),
    /* JADX INFO: Fake field, exist only in values array */
    TSUNAMI(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPHOON(5),
    /* JADX INFO: Fake field, exist only in values array */
    FREEZING_SPRAY(53),
    /* JADX INFO: Fake field, exist only in values array */
    HEAVY_FREEZING_SPRAY(24),
    /* JADX INFO: Fake field, exist only in values array */
    WIND_CHILL(26),
    /* JADX INFO: Fake field, exist only in values array */
    COLD_WAVE(27),
    /* JADX INFO: Fake field, exist only in values array */
    WIND(59),
    /* JADX INFO: Fake field, exist only in values array */
    WINTER_STORM(23),
    /* JADX INFO: Fake field, exist only in values array */
    WINTER_WEATHER(32),
    /* JADX INFO: Fake field, exist only in values array */
    FREEZING_FOG(67),
    /* JADX INFO: Fake field, exist only in values array */
    FREEZING_RAIN(18),
    /* JADX INFO: Fake field, exist only in values array */
    FREEZING_DRIZZLE(39),
    /* JADX INFO: Fake field, exist only in values array */
    FLASH_FREEZE(20),
    /* JADX INFO: Fake field, exist only in values array */
    EXTREME_WIND(4),
    /* JADX INFO: Fake field, exist only in values array */
    LES_SUETES_WIND(11),
    /* JADX INFO: Fake field, exist only in values array */
    WRECKHOUSE_WINDS(10),
    /* JADX INFO: Fake field, exist only in values array */
    RAINFALL(42),
    /* JADX INFO: Fake field, exist only in values array */
    WEATHER(48),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIAL_WEATHER(84),
    /* JADX INFO: Fake field, exist only in values array */
    HAZARDOUS_SEAS(61),
    /* JADX INFO: Fake field, exist only in values array */
    AVALANCHE(12),
    /* JADX INFO: Fake field, exist only in values array */
    RIP_TIDE(76);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f73573a;

    b(short s8) {
        this.f73573a = s8;
    }
}
