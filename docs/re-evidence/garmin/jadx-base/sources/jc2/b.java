package jc2;

/* JADX INFO: loaded from: classes11.dex */
public enum b {
    GARMIN("Garmin"),
    ANDROID("Android"),
    AUTH("GCM_AUTH"),
    BONDING("ANDROID_BONDING"),
    NONE("");

    public String jsonValue;

    b(String str) {
        this.jsonValue = str;
    }
}
