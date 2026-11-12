package bm;

import android.content.Context;
import c22.l3;

/* JADX INFO: loaded from: classes7.dex */
public class u extends q.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f18869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, boolean z14) {
        super();
        this.f18869c = qVar;
        this.f18868b = z14;
    }

    @Override // bm.q.d, gz.f
    public final String b(float f14) {
        int i14 = q.D;
        Context context = this.f18869c.f134441a;
        double d14 = f14;
        l3.f23124b.getClass();
        return l3.a.W0(d14, context, this.f18868b);
    }
}
