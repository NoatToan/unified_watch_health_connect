package defpackage;

import com.xiaomi.hm.health.bt.classic.ClassicConnection;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ ClassicConnection a;

    public /* synthetic */ fp0(ClassicConnection classicConnection) {
        this.a = classicConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j();
    }
}
