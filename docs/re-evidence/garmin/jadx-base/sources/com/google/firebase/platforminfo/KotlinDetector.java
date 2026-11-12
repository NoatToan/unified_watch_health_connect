package com.google.firebase.platforminfo;

import o13.j;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return j.f128583e.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
