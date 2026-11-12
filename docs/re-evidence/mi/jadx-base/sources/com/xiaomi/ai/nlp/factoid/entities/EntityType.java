package com.xiaomi.ai.nlp.factoid.entities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public enum EntityType {
    Number("NumberParser"),
    Age("AgeParser"),
    Level("LevelParser"),
    Rating("RatingParser"),
    SeasonEpisode("SeasonEpisodeParser"),
    Temperature("TemperatureParser"),
    Fraction("FractionParser"),
    Currency("CurrencyParser"),
    MeasureUnit("MeasureUnitParser"),
    Year("YearParser"),
    Month("MonthParser"),
    Week("WeekParser"),
    Day("DayParser"),
    Hour("HourParser"),
    Minute("MinuteParser,QuarterParser"),
    Second("SecondParser"),
    DateTime("DateTimeParser"),
    Festival("FestivalParser"),
    LunarDate("LunarDateParser");

    private String parsers;

    EntityType(String str) {
        this.parsers = str;
    }

    public Set<String> getParsers() {
        return new HashSet(Arrays.asList(this.parsers.split(",")));
    }
}
