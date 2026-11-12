package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum MusicEmotion {
    DEFAULT(0, "DEFAULT"),
    NEGATIVE(1, "NEGATIVE"),
    SAD(2, "SAD"),
    IRRITATING(3, "IRRITATING"),
    ANXIOUS(4, "ANXIOUS"),
    TIRED(5, "TIRED"),
    ILLNESS(6, "ILLNESS"),
    ANNOYED(7, "ANNOYED"),
    DELIGHTED(8, "DELIGHTED"),
    AWKWARD(9, "AWKWARD"),
    SLEEPY(10, "SLEEPY"),
    EXCITED(11, "EXCITED"),
    INLOVE(12, "INLOVE"),
    BROKEUP(13, "BROKEUP"),
    POSITIVE(14, "POSITIVE"),
    RELAXED(15, "RELAXED"),
    HAPPY(16, "HAPPY"),
    UNTIRED(17, "UNTIRED"),
    COMFORTABLE(18, "COMFORTABLE"),
    FEARLESS(19, "FEARLESS"),
    UNANNOYED(20, "UNANNOYED"),
    UNLONELY(21, "UNLONELY"),
    UNAWKWARD(22, "UNAWKWARD"),
    FAVOURITE(23, "FAVOURITE"),
    TEMPERAMENTAL(24, "TEMPERAMENTAL"),
    POLITE(25, "POLITE"),
    UPSET(26, "UPSET"),
    FEARFUL(27, "FEARFUL"),
    LONELY(28, "LONELY"),
    DISGUSTING(29, "DISGUSTING");

    private int id;
    private String name;

    MusicEmotion(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static MusicEmotion find(String str) {
        for (MusicEmotion musicEmotion : values()) {
            if (musicEmotion.name.equals(str)) {
                return musicEmotion;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static MusicEmotion read(String str) {
        return find(str);
    }

    public static String write(MusicEmotion musicEmotion) {
        return musicEmotion.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
