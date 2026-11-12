package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.api.Phone;

/* JADX INFO: loaded from: classes7.dex */
public enum NameType {
    NORMAL("NORMAL"),
    DIGIT("DIGIT"),
    FAMOUS("FAMOUS"),
    RELATIVE("RELATIVE"),
    YELLOW_PAGE("YELLOW_PAGE");

    private String text;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11028b;

        static {
            int[] iArr = new int[Phone.NameType.values().length];
            f11028b = iArr;
            try {
                iArr[Phone.NameType.DIGIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11028b[Phone.NameType.FAMOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11028b[Phone.NameType.RELATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11028b[Phone.NameType.YELLOW_PAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[NameType.values().length];
            f11027a = iArr2;
            try {
                iArr2[NameType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11027a[NameType.DIGIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11027a[NameType.FAMOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11027a[NameType.RELATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11027a[NameType.YELLOW_PAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    NameType(String str) {
        this.text = str;
    }

    public static NameType fromString(String str) {
        for (NameType nameType : values()) {
            if (nameType.getText().equals(str)) {
                return nameType;
            }
        }
        return null;
    }

    public static NameType toNameType(Phone.NameType nameType) {
        int i = a.f11028b[nameType.ordinal()];
        if (i == 1) {
            return DIGIT;
        }
        if (i == 2) {
            return FAMOUS;
        }
        if (i != 3) {
            return i != 4 ? NORMAL : YELLOW_PAGE;
        }
        return RELATIVE;
    }

    public static Phone.NameType toPhoneNameType(NameType nameType) {
        int i = a.f11027a[nameType.ordinal()];
        if (i == 1) {
            return Phone.NameType.NORMAL;
        }
        if (i == 2) {
            return Phone.NameType.DIGIT;
        }
        if (i == 3) {
            return Phone.NameType.FAMOUS;
        }
        if (i != 4) {
            return i != 5 ? Phone.NameType.UNKNOWN : Phone.NameType.YELLOW_PAGE;
        }
        return Phone.NameType.RELATIVE;
    }

    public String getText() {
        return this.text;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
