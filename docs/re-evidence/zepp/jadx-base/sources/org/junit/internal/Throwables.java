package org.junit.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class Throwables {
    private Throwables() {
    }

    private static <T extends Throwable> void a(Throwable th) throws Throwable {
        throw th;
    }

    public static Exception rethrowAsException(Throwable th) throws Exception {
        a(th);
        return null;
    }
}
