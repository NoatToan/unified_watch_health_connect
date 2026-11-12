package com.xiaomi.ai.api.intent.slots;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.GeneralType;

/* JADX INFO: loaded from: classes7.dex */
public class Miai {

    public static class Age extends GeneralType<String> {
        public Age() {
        }

        public static Age read(String str) {
            return new Age(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Age setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Age(String str) {
            this.value = str;
        }
    }

    public static class Artist extends GeneralType<String> {
        public Artist() {
        }

        public static Artist read(String str) {
            return new Artist(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Artist setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Artist(String str) {
            this.value = str;
        }
    }

    public static class Athlete extends GeneralType<String> {
        public Athlete() {
        }

        public static Athlete read(String str) {
            return new Athlete(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Athlete setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Athlete(String str) {
            this.value = str;
        }
    }

    public static class City extends GeneralType<String> {
        public City() {
        }

        public static City read(String str) {
            return new City(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public City setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public City(String str) {
            this.value = str;
        }
    }

    public static class Color extends GeneralType<String> {
        public Color() {
        }

        public static Color read(String str) {
            return new Color(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Color setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Color(String str) {
            this.value = str;
        }
    }

    public static class Composer extends GeneralType<String> {
        public Composer() {
        }

        public static Composer read(String str) {
            return new Composer(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Composer setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Composer(String str) {
            this.value = str;
        }
    }

    public static class ContentProvider extends GeneralType<MiaiContentProvider> {
        public ContentProvider() {
        }

        public static ContentProvider read(String str) {
            return new ContentProvider(MiaiContentProvider.valueOf(str));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public MiaiContentProvider getValue() {
            return (MiaiContentProvider) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public ContentProvider setValue(MiaiContentProvider miaiContentProvider) {
            this.value = miaiContentProvider;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentProvider(MiaiContentProvider miaiContentProvider) {
            this.value = miaiContentProvider;
        }
    }

    public static class Country extends GeneralType<String> {
        public Country() {
        }

        public static Country read(String str) {
            return new Country(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Country setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Country(String str) {
            this.value = str;
        }
    }

    public static class Currency extends GeneralType<String> {
        public Currency() {
        }

        public static Currency read(String str) {
            return new Currency(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Currency setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Currency(String str) {
            this.value = str;
        }
    }

    public static class Date extends GeneralType<String> {
        public Date() {
        }

        public static Date read(String str) {
            return new Date(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Date setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Date(String str) {
            this.value = str;
        }
    }

    public static class Datetime extends GeneralType<String> {
        public Datetime() {
        }

        public static Datetime read(String str) {
            return new Datetime(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Datetime setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Datetime(String str) {
            this.value = str;
        }
    }

    public static class District extends GeneralType<String> {
        public District() {
        }

        public static District read(String str) {
            return new District(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public District setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public District(String str) {
            this.value = str;
        }
    }

    public static class Duration extends GeneralType<String> {
        public Duration() {
        }

        public static Duration read(String str) {
            return new Duration(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Duration setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Duration(String str) {
            this.value = str;
        }
    }

    public static class Episode extends GeneralType<String> {
        public Episode() {
        }

        public static Episode read(String str) {
            return new Episode(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Episode setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Episode(String str) {
            this.value = str;
        }
    }

    public static class FictionalCharacter extends GeneralType<String> {
        public FictionalCharacter() {
        }

        public static FictionalCharacter read(String str) {
            return new FictionalCharacter(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public FictionalCharacter setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FictionalCharacter(String str) {
            this.value = str;
        }
    }

    public static class Fraction extends GeneralType<String> {
        public Fraction() {
        }

        public static Fraction read(String str) {
            return new Fraction(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Fraction setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Fraction(String str) {
            this.value = str;
        }
    }

    public static class Language extends GeneralType<String> {
        public Language() {
        }

        public static Language read(String str) {
            return new Language(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Language setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Language(String str) {
            this.value = str;
        }
    }

    public static class Location extends GeneralType<String> {
        public Location() {
        }

        public static Location read(String str) {
            return new Location(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Location setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Location(String str) {
            this.value = str;
        }
    }

    public static class Lyricist extends GeneralType<String> {
        public Lyricist() {
        }

        public static Lyricist read(String str) {
            return new Lyricist(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Lyricist setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Lyricist(String str) {
            this.value = str;
        }
    }

    public static class MeasureUnit extends GeneralType<String> {
        public MeasureUnit() {
        }

        public static MeasureUnit read(String str) {
            return new MeasureUnit(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public MeasureUnit setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MeasureUnit(String str) {
            this.value = str;
        }
    }

    public enum MiaiContentProvider {
        Default(0, "default"),
        Iqiyi(1, "iqiyi"),
        Tencent(2, "tencent"),
        Youku(3, "youku"),
        Bilibili(4, "bilibili"),
        Mangotv(5, "mangotv"),
        Sohu(6, "sohu"),
        Pptvjutiyu(7, "pptvjutiyu"),
        Xunleikankan(8, "xunleikankan"),
        Ximalaya(9, "ximalaya"),
        Qingting(10, "qingting"),
        Kaishu(11, "kaishu"),
        Dedao(12, "dedao"),
        Hongen(13, "hongen"),
        Beiwaradio(14, "beiwaradio"),
        Pinkfong(15, "pinkfong"),
        Qqfm(16, "qqfm"),
        Ifeng(17, "ifeng"),
        Tingtingradio(18, "tingtingradio"),
        Babybus(19, "babybus"),
        Dedaotingshu(20, "dedaotingshu"),
        Lanrentingshu(21, "lanrentingshu"),
        Bilinwaijiao(22, "bilinwaijiao"),
        Jingyasiting(23, "jingyasiting"),
        Autolearning(24, "autolearning"),
        Gongba(25, "gongba"),
        Miphone(26, "miphone");

        private int id;
        private String name;

        MiaiContentProvider(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MiaiContentProvider find(String str) {
            for (MiaiContentProvider miaiContentProvider : values()) {
                if (miaiContentProvider.name.equals(str)) {
                    return miaiContentProvider;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MiaiContentProvider read(String str) {
            return find(str);
        }

        public static String write(MiaiContentProvider miaiContentProvider) {
            return miaiContentProvider.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class MovieAward extends GeneralType<String> {
        public MovieAward() {
        }

        public static MovieAward read(String str) {
            return new MovieAward(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public MovieAward setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MovieAward(String str) {
            this.value = str;
        }
    }

    public static class MovieName extends GeneralType<String> {
        public MovieName() {
        }

        public static MovieName read(String str) {
            return new MovieName(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public MovieName setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MovieName(String str) {
            this.value = str;
        }
    }

    public static class Multiple extends GeneralType<String> {
        public Multiple() {
        }

        public static Multiple read(String str) {
            return new Multiple(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Multiple setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Multiple(String str) {
            this.value = str;
        }
    }

    public static class MusicAlbum extends GeneralType<String> {
        public MusicAlbum() {
        }

        public static MusicAlbum read(String str) {
            return new MusicAlbum(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public MusicAlbum setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MusicAlbum(String str) {
            this.value = str;
        }
    }

    public static class Number extends GeneralType<String> {
        public Number() {
        }

        public static Number read(String str) {
            return new Number(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Number setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Number(String str) {
            this.value = str;
        }
    }

    public static class Ordinal extends GeneralType<String> {
        public Ordinal() {
        }

        public static Ordinal read(String str) {
            return new Ordinal(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Ordinal setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ordinal(String str) {
            this.value = str;
        }
    }

    public static class Province extends GeneralType<String> {
        public Province() {
        }

        public static Province read(String str) {
            return new Province(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Province setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Province(String str) {
            this.value = str;
        }
    }

    public static class RadioChannel extends GeneralType<String> {
        public RadioChannel() {
        }

        public static RadioChannel read(String str) {
            return new RadioChannel(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public RadioChannel setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RadioChannel(String str) {
            this.value = str;
        }
    }

    public static class RadioName extends GeneralType<String> {
        public RadioName() {
        }

        public static RadioName read(String str) {
            return new RadioName(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public RadioName setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RadioName(String str) {
            this.value = str;
        }
    }

    public static class Rating extends GeneralType<String> {
        public Rating() {
        }

        public static Rating read(String str) {
            return new Rating(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Rating setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Rating(String str) {
            this.value = str;
        }
    }

    public static class Season extends GeneralType<String> {
        public Season() {
        }

        public static Season read(String str) {
            return new Season(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Season setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Season(String str) {
            this.value = str;
        }
    }

    public static class Song extends GeneralType<String> {
        public Song() {
        }

        public static Song read(String str) {
            return new Song(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Song setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Song(String str) {
            this.value = str;
        }
    }

    public static class Sport extends GeneralType<String> {
        public Sport() {
        }

        public static Sport read(String str) {
            return new Sport(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Sport setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sport(String str) {
            this.value = str;
        }
    }

    public static class Time extends GeneralType<String> {
        public Time() {
        }

        public static Time read(String str) {
            return new Time(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Time setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Time(String str) {
            this.value = str;
        }
    }

    public static class TimeInterval extends GeneralType<String> {
        public TimeInterval() {
        }

        public static TimeInterval read(String str) {
            return new TimeInterval(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public TimeInterval setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TimeInterval(String str) {
            this.value = str;
        }
    }

    public static class Timezone extends GeneralType<String> {
        public Timezone() {
        }

        public static Timezone read(String str) {
            return new Timezone(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Timezone setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Timezone(String str) {
            this.value = str;
        }
    }

    public static class Town extends GeneralType<String> {
        public Town() {
        }

        public static Town read(String str) {
            return new Town(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public String getValue() {
            return (String) this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Required
        public Town setValue(String str) {
            this.value = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Town(String str) {
            this.value = str;
        }
    }
}
