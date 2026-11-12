package e2;

import f5.v1;
import g2.r0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le2/s;", "Le2/z;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f62512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f62513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f62514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f62515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h4.d.b f62516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h4.d.c f62517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f62518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f62520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f62521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0 f62522o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j8, boolean z14, o oVar, r0 r0Var, int i14, int i15, h4.d.b bVar, h4.d.c cVar, boolean z15, int i16, int i17, long j14, i0 i0Var) {
        super(j8, z14, oVar, r0Var, null);
        this.f62512e = z14;
        this.f62513f = r0Var;
        this.f62514g = i14;
        this.f62515h = i15;
        this.f62516i = bVar;
        this.f62517j = cVar;
        this.f62518k = z15;
        this.f62519l = i16;
        this.f62520m = i17;
        this.f62521n = j14;
        this.f62522o = i0Var;
    }

    @Override // e2.z
    public final y c(int i14, Object obj, Object obj2, List<? extends v1> list, long j8) {
        return new y(i14, list, this.f62512e, this.f62516i, this.f62517j, this.f62513f.getF69049a(), this.f62518k, this.f62519l, this.f62520m, i14 == this.f62514g + (-1) ? 0 : this.f62515h, this.f62521n, obj, obj2, this.f62522o.f62447n, j8, null);
    }
}
