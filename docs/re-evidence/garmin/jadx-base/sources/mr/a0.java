package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase", f = "GetCompactActivityDetailsUseCase.kt", l = {169}, m = "getActivityTypedSplits", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ps.p f120235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f120237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var, t13.d<? super a0> dVar) {
        super(dVar);
        this.f120237c = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120236b = obj;
        this.f120238d |= Integer.MIN_VALUE;
        return this.f120237c.e(0L, null, this);
    }
}
