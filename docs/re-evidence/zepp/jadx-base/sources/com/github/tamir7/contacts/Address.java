package com.github.tamir7.contacts;

/* JADX INFO: loaded from: classes2.dex */
public class Address {
    private final String a;
    private final Type b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public enum Type {
        CUSTOM,
        HOME,
        WORK,
        OTHER,
        UNKNOWN;

        public static Type a(int i) {
            if (i == 0) {
                return CUSTOM;
            }
            if (i == 1) {
                return HOME;
            }
            if (i != 2) {
                return i != 3 ? UNKNOWN : OTHER;
            }
            return WORK;
        }
    }

    private Address(String str, String str2, String str3, String str4, String str5, String str6, Type type, String str7) {
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.b = type;
        this.h = str7;
    }

    public String getCity() {
        return this.d;
    }

    public String getCountry() {
        return this.g;
    }

    public String getFormattedAddress() {
        return this.a;
    }

    public String getLabel() {
        return this.h;
    }

    public String getPostcode() {
        return this.f;
    }

    public String getRegion() {
        return this.e;
    }

    public String getStreet() {
        return this.c;
    }

    public Type getType() {
        return this.b;
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, Type type) {
        this(str, str2, str3, str4, str5, str6, type, null);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, Type.CUSTOM, str7);
    }
}
