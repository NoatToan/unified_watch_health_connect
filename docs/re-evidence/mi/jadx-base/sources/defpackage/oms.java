package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class oms implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f29305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f29306b;
    public final /* synthetic */ boolean c;

    public oms(Context context, long j, boolean z) {
        this.f29305a = context;
        this.f29306b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ims.s(this.f29305a, this.f29306b, this.c);
        } catch (Exception e) {
            x9s.o("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
        }
    }
}
