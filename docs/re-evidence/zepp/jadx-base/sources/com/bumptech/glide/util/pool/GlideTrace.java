package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideTrace {
    private static final boolean a = false;
    private static final int b = 127;

    private GlideTrace() {
    }

    private static String a(String str) {
        return str.length() > 127 ? str.substring(0, 126) : str;
    }

    public static void beginSection(String str) {
    }

    public static void beginSectionFormat(String str, Object obj) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2, Object obj3) {
    }

    public static void endSection() {
    }
}
