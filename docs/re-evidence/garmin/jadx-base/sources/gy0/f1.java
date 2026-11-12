package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetSleepDataUseCase", f = "GetSleepDataUseCase.kt", l = {26}, m = "invoke", v = 2)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f80158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(e1 e1Var, t13.d<? super f1> dVar) {
        super(dVar);
        this.f80158c = e1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80157b = obj;
        this.f80159d |= Integer.MIN_VALUE;
        return this.f80158c.a(null, null, null, null, this);
    }
}
