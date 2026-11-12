package com.xiaomi.accountsdk.diagnosis.b;

/* JADX INFO: loaded from: classes6.dex */
public enum c {
    VERBOSE("V"),
    DEBUG("D"),
    INFO("I"),
    WARN("W"),
    ERROR("E");

    private final String f;

    c(String str) {
        this.f = str;
    }

    public static c a(int i) {
        if (i == 2) {
            return VERBOSE;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return INFO;
        }
        if (i != 5) {
            return i != 6 ? VERBOSE : ERROR;
        }
        return WARN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }
}
