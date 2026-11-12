package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum MichatAlarmKeywordType {
    Exam_special(1, "exam_special"),
    Birthday(2, "birthday"),
    Loveday(3, "loveday"),
    Weddingday(4, "weddingday");

    private int id;
    private String name;

    MichatAlarmKeywordType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static MichatAlarmKeywordType find(String str) {
        for (MichatAlarmKeywordType michatAlarmKeywordType : values()) {
            if (michatAlarmKeywordType.name.equals(str)) {
                return michatAlarmKeywordType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static MichatAlarmKeywordType read(String str) {
        return find(str);
    }

    public static String write(MichatAlarmKeywordType michatAlarmKeywordType) {
        return michatAlarmKeywordType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
