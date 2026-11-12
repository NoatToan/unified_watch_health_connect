package defpackage;

import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class dlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f15653a = SystemProperties.getBoolean("log.miuix.haptic.enabled", false);

    public static void a(String str) {
        if (f15653a) {
            new Throwable();
        }
    }
}
