package f2;

import f5.v1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf2/u;", "Lf2/b0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.r0 f68304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f68305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f68306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f68307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f68309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f68310k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n nVar, g2.r0 r0Var, int i14, p0 p0Var, boolean z14, boolean z15, int i15, int i16, long j8) {
        super(nVar, r0Var, i14);
        this.f68304e = r0Var;
        this.f68305f = p0Var;
        this.f68306g = z14;
        this.f68307h = z15;
        this.f68308i = i15;
        this.f68309j = i16;
        this.f68310k = j8;
    }

    @Override // f2.b0
    public final a0 c(int i14, Object obj, Object obj2, int i15, int i16, List<? extends v1> list, long j8, int i17, int i18) {
        g6.o f68910b = this.f68304e.getF68910b();
        g2.b0<a0> b0Var = this.f68305f.f68273m;
        return new a0(i14, obj, this.f68306g, i15, i16, this.f68307h, f68910b, this.f68308i, this.f68309j, list, this.f68310k, obj2, b0Var, j8, i17, i18, null);
    }
}
