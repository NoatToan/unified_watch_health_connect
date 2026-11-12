package g3;

import fe2.z;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.d0;
import p3.p0;
import p3.x3;
import p3.z1;
import u1.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg3/f;", "", "Lo53/b0;", "animationScope", "Lp3/x3;", "Lkotlin/Function0;", "", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(Lo53/b0;Lp3/x3;FF)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f75595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3<e23.a<Unit>> f75596b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f75601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f75602h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f75597c = p0.f(new z(this, 10));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f75598d = p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1 f75599e = new z1(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1 f75600f = new z1(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1 f75603i = new l1();

    /* JADX WARN: Multi-variable type inference failed */
    public f(b0 b0Var, x3<? extends e23.a<Unit>> x3Var, float f14, float f15) {
        this.f75595a = b0Var;
        this.f75596b = x3Var;
        this.f75601g = new z1(f15);
        this.f75602h = new z1(f14);
    }

    public final float a() {
        return ((Number) this.f75597c.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f75598d.getF182175a()).booleanValue();
    }
}
