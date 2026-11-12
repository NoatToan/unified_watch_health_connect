package com.xiaomi.ai.api.intent;

/* JADX INFO: loaded from: classes7.dex */
public enum CategoryType {
    Default(-2, "Default"),
    All(-1, "All"),
    SoundBox(0, "SoundBox"),
    TV(1, "TV"),
    StoryTeller(2, "StoryTeller"),
    Kids(3, "Kids"),
    Appliances(4, "Appliances"),
    SmartHome(5, AIApiConstants.SmartHome.NAME),
    Wearables(6, "Wearables"),
    Phone(7, com.xiaomi.ai.api.AIApiConstants.Phone.NAME),
    Robots(8, "Robots"),
    Headphones(9, "Headphones"),
    Automotive(10, "Automotive"),
    Transportations(11, "Transportations"),
    PC(12, "PC"),
    ScreenSoundBox(13, "ScreenSoundBox"),
    NoScreenSoundBox(14, "NoScreenSoundBox"),
    PAD(15, "PAD");

    private int id;
    private String name;

    CategoryType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static CategoryType find(String str) {
        for (CategoryType categoryType : values()) {
            if (categoryType.name.equals(str)) {
                return categoryType;
            }
        }
        return Default;
    }

    public static CategoryType read(String str) {
        return find(str);
    }

    public static String write(CategoryType categoryType) {
        return categoryType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
