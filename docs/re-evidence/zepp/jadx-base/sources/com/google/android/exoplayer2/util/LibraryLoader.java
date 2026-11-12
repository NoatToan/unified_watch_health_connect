package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LibraryLoader {
    private static final String d = "LibraryLoader";
    private String[] a;
    private boolean b;
    private boolean c;

    public LibraryLoader(String... libraries) {
        this.a = libraries;
    }

    public synchronized boolean isAvailable() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        try {
            for (String str : this.a) {
                System.loadLibrary(str);
            }
            this.c = true;
        } catch (UnsatisfiedLinkError unused) {
            String strValueOf = String.valueOf(Arrays.toString(this.a));
            Log.w(d, strValueOf.length() != 0 ? "Failed to load ".concat(strValueOf) : new String("Failed to load "));
        }
        return this.c;
    }

    public synchronized void setLibraries(String... libraries) {
        Assertions.checkState(!this.b, "Cannot set libraries after loading");
        this.a = libraries;
    }
}
