package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class yns implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f40354b;
    public final /* synthetic */ boolean c;

    public yns(Context context, long j, boolean z) {
        this.f40353a = context;
        this.f40354b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ims.t(this.f40353a, this.f40354b, this.c);
        } catch (Exception e) {
            x9s.o("PowerStatsSP onPing exception: " + e.getMessage());
        }
    }
}
