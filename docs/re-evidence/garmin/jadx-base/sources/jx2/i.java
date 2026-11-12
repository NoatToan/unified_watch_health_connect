package jx2;

import android.content.Context;
import ue.i0;
import ue.x;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f101551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f101552c;

    public /* synthetic */ i(Context context, x xVar, int i14) {
        this.f101550a = i14;
        this.f101551b = context;
        this.f101552c = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101550a) {
            case 0:
                i0.f170088a.getClass();
                i0.a.a(this.f101551b).c("SaveGCUserPrefWrkr", ue.l.REPLACE, this.f101552c);
                break;
            default:
                Context applicationContext = this.f101551b.getApplicationContext();
                i0.f170088a.getClass();
                i0.a.a(applicationContext).a("NC#GCSaveUserTimezoneWorker", ue.l.REPLACE, this.f101552c).a();
                break;
        }
    }
}
