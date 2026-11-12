package com.xmlywind.sdk.nativead;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes22.dex */
public class u extends Handler {
    public long b;
    public boolean c;

    public u(Looper looper) {
        super(looper);
        this.b = 100L;
        this.c = true;
    }

    public void a() {
        sendEmptyMessageDelayed(87108, this.b);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean b() {
        return this.c;
    }
}
