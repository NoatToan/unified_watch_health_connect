package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyc/s;", "currState", "invoke", "(Lyc/s;)Lyc/s;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class i1 extends p005kotlin.jvm.internal.w implements e23.l<s, s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f196055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f196056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f196057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f196058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(boolean z14, c1 c1Var, z0 z0Var, j1 j1Var) {
        super(1);
        this.f196055a = z14;
        this.f196056b = c1Var;
        this.f196057c = z0Var;
        this.f196058d = j1Var;
    }

    @Override // e23.l
    public final s invoke(s sVar) {
        b1 b1VarB;
        s sVar2 = sVar;
        if (sVar2 == null || (b1VarB = sVar2.f196388d) == null) {
            b1.f195767f.getClass();
            b1VarB = b1.f195768g;
        }
        b1 b1VarB2 = sVar2 != null ? sVar2.f196389e : null;
        boolean z14 = this.f196055a;
        z0 z0Var = this.f196057c;
        c1 c1Var = this.f196056b;
        if (z14) {
            b1.f195767f.getClass();
            b1VarB2 = b1.f195768g.b(c1Var, z0Var);
        } else {
            b1VarB = b1VarB.b(c1Var, z0Var);
        }
        return j1.a(this.f196058d, sVar2, b1VarB, b1VarB2);
    }
}
