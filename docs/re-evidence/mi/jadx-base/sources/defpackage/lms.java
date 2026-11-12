package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class lms implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25228b;
    public final /* synthetic */ boolean c;

    public lms(Context context, long j, boolean z) {
        this.f25227a = context;
        this.f25228b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ims.r(this.f25227a, this.f25228b, this.c);
        } catch (Exception e) {
            x9s.o("PowerStatsSP onSendMsg exception: " + e.getMessage());
        }
    }
}
