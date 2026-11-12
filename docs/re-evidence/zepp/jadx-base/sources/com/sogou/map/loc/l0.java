package com.sogou.map.loc;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
final class l0 {
    private final Context a;
    private final s0 c = new s0();
    private final Handler b = j0.c("Touch Thread", 0);

    public l0(Context context) {
        this.a = context;
    }

    public final Executor a() {
        return this.c;
    }

    public final Handler b() {
        return this.b;
    }

    public final void c() {
        this.c.a();
        j0.i(this.b);
    }

    public final Context d() {
        return this.a;
    }
}
