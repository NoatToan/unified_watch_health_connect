package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.IsPrimaryDeviceScreenlessUseCase", f = "IsPrimaryDeviceScreenlessUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f204203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, t13.d<? super y> dVar) {
        super(dVar);
        this.f204203b = a0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204202a = obj;
        this.f204204c |= Integer.MIN_VALUE;
        return this.f204203b.a(this);
    }
}
