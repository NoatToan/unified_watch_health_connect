package com.github.tamir7.contacts;

/* JADX INFO: loaded from: classes2.dex */
public class Email {
    private final String a;
    private final Type b;
    private final String c;

    public enum Type {
        CUSTOM,
        HOME,
        WORK,
        OTHER,
        MOBILE,
        UNKNOWN;

        public static Type a(int i) {
            if (i == 0) {
                return CUSTOM;
            }
            if (i == 1) {
                return HOME;
            }
            if (i == 2) {
                return WORK;
            }
            if (i != 3) {
                return i != 4 ? UNKNOWN : MOBILE;
            }
            return OTHER;
        }
    }

    public Email(String str, Type type) {
        this.a = str;
        this.b = type;
        this.c = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Email email = (Email) obj;
        if (this.a.equals(email.a) && this.b == email.b) {
            String str = this.c;
            if (str != null) {
                if (str.equals(email.c)) {
                    return true;
                }
            } else if (email.c == null) {
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return this.a;
    }

    public String getLabel() {
        return this.c;
    }

    public Type getType() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public Email(String str, String str2) {
        this.a = str;
        this.b = Type.CUSTOM;
        this.c = str2;
    }
}
