package nh;

import com.alipay.sdk.app.APayEntranceActivity;

/* JADX INFO: loaded from: classes7.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ APayEntranceActivity.a f126117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f126118b;

    public g(i iVar, APayEntranceActivity.a aVar) {
        this.f126118b = iVar;
        this.f126117a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f126118b;
        lh.a aVar = iVar.f126126e;
        if (aVar == null || aVar.f112383h) {
            return;
        }
        wg.a.g(aVar, "biz", "ErrActNotCreated", "");
        if (ah.a.g().f3261q) {
            iVar.f126126e.f112382g = true;
            this.f126117a.a(ug.b.a());
        }
    }
}
