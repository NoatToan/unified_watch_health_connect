package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class nny extends nnt {
    public nny() {
        super(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), "AccountPicker-global-task-Pool");
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final nny f43341a = new nny();
    }

    public static nny e() {
        return b.f43341a;
    }
}
