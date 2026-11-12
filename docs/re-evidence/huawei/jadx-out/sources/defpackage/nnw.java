package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class nnw extends nnt {
    private nnw() {
        super(1, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), "AccountPicker-FileSystem-Pool");
    }

    static class b {
        private static final nnw e = new nnw();
    }

    public static nnw c() {
        return b.e;
    }
}
