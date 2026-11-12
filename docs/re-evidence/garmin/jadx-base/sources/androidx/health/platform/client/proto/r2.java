package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f7770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0[] f7773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f7774e;

    public r2(q1 q1Var, boolean z14, int[] iArr, e0[] e0VarArr, Object obj) {
        this.f7770a = q1Var;
        this.f7771b = z14;
        this.f7772c = iArr;
        this.f7773d = e0VarArr;
        l0.a(obj, "defaultInstance");
        this.f7774e = (c1) obj;
    }

    @Override // androidx.health.platform.client.proto.a1
    public final c1 getDefaultInstance() {
        return this.f7774e;
    }

    @Override // androidx.health.platform.client.proto.a1
    public final q1 getSyntax() {
        return this.f7770a;
    }

    @Override // androidx.health.platform.client.proto.a1
    public final boolean isMessageSetWireFormat() {
        return this.f7771b;
    }
}
