package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class mls implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f26989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26990b;

    public mls(Context context, long j) {
        this.f26989a = context;
        this.f26990b = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fls.p(this.f26989a, this.f26990b);
        } catch (Exception e) {
            x9s.o("DisconnectStatsSP onReconnection exception: " + e.getMessage());
        }
    }
}
