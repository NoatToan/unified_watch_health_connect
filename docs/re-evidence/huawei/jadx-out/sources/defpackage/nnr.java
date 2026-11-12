package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class nnr extends nnt {
    private nnr() {
        super(2, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), "AccountPicker-Core-Pool");
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final nnr f43332a = new nnr();
    }

    public static nnr d() {
        return c.f43332a;
    }
}
