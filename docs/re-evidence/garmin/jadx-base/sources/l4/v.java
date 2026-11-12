package l4;

import ch.qos.logback.core.CoreConstants;
import h5.c1;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import o13.z;
import o4.d0;
import o4.r1;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll4/v;", "Lh5/x0;", "Lo4/v;", "Lg6/f;", "elevation", "Lo4/r1;", "shape", "", "clip", "Lo4/d0;", "ambientColor", "spotColor", "<init>", "(FLo4/r1;ZJJLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class v extends x0<o4.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f109873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f109874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f109877e;

    private v(float f14, r1 r1Var, boolean z14, long j8, long j14) {
        this.f109873a = f14;
        this.f109874b = r1Var;
        this.f109875c = z14;
        this.f109876d = j8;
        this.f109877e = j14;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o4.v(new u(this));
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return g6.f.c(this.f109873a, vVar.f109873a) && p005kotlin.jvm.internal.s.g(this.f109874b, vVar.f109874b) && this.f109875c == vVar.f109875c && d0.d(this.f109876d, vVar.f109876d) && d0.d(this.f109877e, vVar.f109877e);
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        int iG = q6.f.g((this.f109874b.hashCode() + (Float.hashCode(this.f109873a) * 31)) * 31, 31, this.f109875c);
        d0.a aVar2 = d0.f128823b;
        z.a aVar3 = z.f128618b;
        return Long.hashCode(this.f109877e) + q6.f.e(iG, 31, this.f109876d);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "shadow";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(g6.f.a(this.f109873a), "elevation");
        v3Var.c(this.f109874b, "shape");
        v3Var.c(Boolean.valueOf(this.f109875c), "clip");
        v3Var.c(d0.a(this.f109876d), "ambientColor");
        v3Var.c(d0.a(this.f109877e), "spotColor");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        tn.k.l(this.f109873a, ", shape=", sb3);
        sb3.append(this.f109874b);
        sb3.append(", clip=");
        sb3.append(this.f109875c);
        sb3.append(", ambientColor=");
        q2.m(this.f109876d, ", spotColor=", sb3);
        sb3.append((Object) d0.j(this.f109877e));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        c1 c1Var;
        o4.v vVar = (o4.v) cVar;
        u uVar = new u(this);
        vVar.f129014a = uVar;
        if (vVar.getNode().getIsAttached() && (c1Var = h5.k.e(vVar, 2).f81714t) != null) {
            c1Var.k2(uVar, true);
        }
    }

    public /* synthetic */ v(float f14, r1 r1Var, boolean z14, long j8, long j14, p005kotlin.jvm.internal.j jVar) {
        this(f14, r1Var, z14, j8, j14);
    }
}
