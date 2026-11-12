package androidx.media3.common;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f8506a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f8507b = "media3.common";

    private u() {
    }

    public static synchronized void a(String str) {
        if (f8506a.add(str)) {
            f8507b += ", " + str;
        }
    }
}
