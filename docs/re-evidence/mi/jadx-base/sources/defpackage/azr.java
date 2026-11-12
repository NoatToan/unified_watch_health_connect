package defpackage;

import com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class azr<T extends YRNLoadRequest> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1d<T> f3623b;
    public int c = 3;
    public vxr d;

    public azr(T t, f1d<T> f1dVar, vxr vxrVar) {
        this.f3622a = t;
        this.f3623b = f1dVar;
        this.d = vxrVar;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsNeedVerify = this.f3622a.isNeedVerify();
        if (a() && ((!zIsNeedVerify || c()) && b())) {
            this.f3623b.onSuccess(this.f3622a);
            return;
        }
        int i = this.c - 1;
        this.c = i;
        if (i <= 0) {
            this.f3623b.onFailure(-1, "Net Request Retry Count ");
        } else {
            this.d.a(this);
        }
    }
}
