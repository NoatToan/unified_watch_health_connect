package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyc/s;", "currState", "invoke", "(Lyc/s;)Lyc/s;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class h1 extends p005kotlin.jvm.internal.w implements e23.l<s, s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f195999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f196000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f196001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, b1 b1Var, b1 b1Var2) {
        super(1);
        this.f195999a = j1Var;
        this.f196000b = b1Var;
        this.f196001c = b1Var2;
    }

    @Override // e23.l
    public final s invoke(s sVar) {
        b1 b1Var = this.f196000b;
        b1 b1Var2 = this.f196001c;
        return j1.a(this.f195999a, sVar, b1Var, b1Var2);
    }
}
