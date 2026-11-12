package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class bos implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4429b;
    public final /* synthetic */ boolean c;

    public bos(Context context, long j, boolean z) {
        this.f4428a = context;
        this.f4429b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ims.u(this.f4428a, this.f4429b, this.c);
        } catch (Exception e) {
            x9s.o("PowerStatsSP onPong exception: " + e.getMessage());
        }
    }
}
