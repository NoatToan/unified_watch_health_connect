package a03;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.SwipeableV2State", f = "SwipeableV2.kt", l = {376}, m = "animateTo")
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<Object> f195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0<Object> r0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f195c = r0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f194b = obj;
        this.f196d |= Integer.MIN_VALUE;
        return this.f195c.a(null, 0.0f, null, this);
    }
}
