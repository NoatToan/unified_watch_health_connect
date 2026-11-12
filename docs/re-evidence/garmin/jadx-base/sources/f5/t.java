package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/t;", "Lf5/x1;", "", "rulers", "<init>", "([Lf5/x1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1[] f69107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f69108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f69109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q2 f69110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f69111f;

    public t(x1[] x1VarArr) {
        this.f69107b = x1VarArr;
        q2.a aVar = q2.f69078b;
        int length = x1VarArr.length;
        q2[] q2VarArr = new q2[length];
        for (int i14 = 0; i14 < length; i14++) {
            q2VarArr[i14] = this.f69107b[i14].getF69108c();
        }
        aVar.getClass();
        o2 o2Var = new o2(q2VarArr);
        p005kotlin.jvm.internal.j jVar = null;
        this.f69108c = new q2(o2Var, jVar);
        s.a aVar2 = s.f69102b;
        int length2 = this.f69107b.length;
        s[] sVarArr = new s[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            sVarArr[i15] = this.f69107b[i15].getF69109d();
        }
        aVar2.getClass();
        this.f69109d = new s(new q(sVarArr), jVar);
        q2.a aVar3 = q2.f69078b;
        int length3 = this.f69107b.length;
        q2[] q2VarArr2 = new q2[length3];
        for (int i16 = 0; i16 < length3; i16++) {
            q2VarArr2[i16] = this.f69107b[i16].getF69110e();
        }
        aVar3.getClass();
        this.f69110e = new q2(new p2(q2VarArr2), jVar);
        s.a aVar4 = s.f69102b;
        int length4 = this.f69107b.length;
        s[] sVarArr2 = new s[length4];
        for (int i17 = 0; i17 < length4; i17++) {
            sVarArr2[i17] = this.f69107b[i17].getF69111f();
        }
        aVar4.getClass();
        this.f69111f = new s(new r(sVarArr2), jVar);
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final q2 getF69108c() {
        return this.f69108c;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getF69111f() {
        return this.f69111f;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: c, reason: from getter */
    public final q2 getF69110e() {
        return this.f69110e;
    }

    @Override // f5.x1
    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getF69109d() {
        return this.f69109d;
    }

    public final String toString() {
        return p13.u.P(this.f69107b, null, "innermostOf(", ")", null, 57);
    }
}
