package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class ils implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21284b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public ils(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        this.f21283a = context;
        this.f21284b = str;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = i2;
        this.h = str2;
        this.i = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fls.q(this.f21283a, this.f21284b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        } catch (Exception e) {
            x9s.o("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
        }
    }
}
