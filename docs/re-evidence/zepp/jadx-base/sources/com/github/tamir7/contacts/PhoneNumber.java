package com.github.tamir7.contacts;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneNumber {
    private final String a;
    private final Type b;
    private final String c;
    private final String d;

    public enum Type {
        CUSTOM,
        HOME,
        MOBILE,
        WORK,
        FAX_WORK,
        FAX_HOME,
        PAGER,
        OTHER,
        CALLBACK,
        CAR,
        COMPANY_MAIN,
        ISDN,
        MAIN,
        OTHER_FAX,
        RADIO,
        TELEX,
        TTY_TDD,
        WORK_MOBILE,
        WORK_PAGER,
        ASSISTANT,
        MMS,
        UNKNOWN;

        public static Type a(int i) {
            switch (i) {
                case 0:
                    return CUSTOM;
                case 1:
                    return HOME;
                case 2:
                    return MOBILE;
                case 3:
                    return WORK;
                case 4:
                    return FAX_WORK;
                case 5:
                    return FAX_HOME;
                case 6:
                    return PAGER;
                case 7:
                    return OTHER;
                case 8:
                    return CALLBACK;
                case 9:
                    return CAR;
                case 10:
                    return COMPANY_MAIN;
                case 11:
                    return ISDN;
                case 12:
                    return MAIN;
                case 13:
                    return OTHER_FAX;
                case 14:
                    return RADIO;
                case 15:
                    return TELEX;
                case 16:
                    return TTY_TDD;
                case 17:
                    return WORK_MOBILE;
                case 18:
                    return WORK_PAGER;
                case 19:
                    return ASSISTANT;
                case 20:
                    return MMS;
                default:
                    return UNKNOWN;
            }
        }
    }

    public PhoneNumber(String str, Type type, String str2) {
        this.a = str;
        this.b = type;
        this.c = null;
        this.d = str2;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        if (this.a.equals(phoneNumber.a) && this.b == phoneNumber.b && ((str = this.c) == null ? phoneNumber.c == null : str.equals(phoneNumber.c))) {
            String str2 = this.d;
            if (str2 != null) {
                if (str2.equals(phoneNumber.d)) {
                    return true;
                }
            } else if (phoneNumber.d == null) {
                return true;
            }
        }
        return false;
    }

    public String getLabel() {
        return this.c;
    }

    public String getNormalizedNumber() {
        return this.d;
    }

    public String getNumber() {
        return this.a;
    }

    public Type getType() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public PhoneNumber(String str, String str2, String str3) {
        this.a = str;
        this.b = Type.CUSTOM;
        this.c = str2;
        this.d = str3;
    }
}
