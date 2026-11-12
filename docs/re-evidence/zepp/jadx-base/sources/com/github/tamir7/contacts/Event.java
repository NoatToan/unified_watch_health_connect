package com.github.tamir7.contacts;

/* JADX INFO: loaded from: classes2.dex */
public class Event {
    private final String a;
    private final Type b;
    private final String c;

    public enum Type {
        CUSTOM,
        ANNIVERSARY,
        OTHER,
        BIRTHDAY,
        UNKNOWN;

        public static Type a(int i) {
            if (i == 0) {
                return CUSTOM;
            }
            if (i == 1) {
                return ANNIVERSARY;
            }
            if (i != 2) {
                return i != 3 ? UNKNOWN : BIRTHDAY;
            }
            return OTHER;
        }
    }

    public Event(String str, Type type) {
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
        Event event = (Event) obj;
        if (this.a.equals(event.a) && this.b == event.b) {
            String str = this.c;
            if (str != null) {
                if (str.equals(event.c)) {
                    return true;
                }
            } else if (event.c == null) {
                return true;
            }
        }
        return false;
    }

    public String getLabel() {
        return this.c;
    }

    public String getStartDate() {
        return this.a;
    }

    public Type getType() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public Event(String str, String str2) {
        this.a = str;
        this.b = Type.CUSTOM;
        this.c = str2;
    }
}
