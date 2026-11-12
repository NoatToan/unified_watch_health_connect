package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lr1/l0;", "", "Lr1/u1;", "targetContentEnter", "Lr1/w1;", "initialContentExit", "", "targetContentZIndex", "Lr1/j2;", "sizeTransform", "<init>", "(Lr1/u1;Lr1/w1;FLr1/j2;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f149138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f149139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.z1 f149140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f149141d;

    public l0(u1 u1Var, w1 w1Var, float f14, j2 j2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        f14 = (i14 & 4) != 0 ? 0.0f : f14;
        if ((i14 & 8) != 0) {
            int i15 = b.f148979b;
            j2Var = new k2(true, j.f149125a);
        }
        this(u1Var, w1Var, f14, j2Var);
    }

    public l0(u1 u1Var, w1 w1Var, float f14, j2 j2Var) {
        this.f149138a = u1Var;
        this.f149139b = w1Var;
        this.f149140c = new p3.z1(f14);
        this.f149141d = j2Var;
    }
}
