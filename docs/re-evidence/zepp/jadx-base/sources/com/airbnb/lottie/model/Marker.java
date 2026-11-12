package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes2.dex */
public class Marker {
    private static String b = "\r";
    private final String a;
    public final float durationFrames;
    public final float startFrame;

    public Marker(String str, float f, float f2) {
        this.a = str;
        this.durationFrames = f2;
        this.startFrame = f;
    }

    public boolean matchesName(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith(b)) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
