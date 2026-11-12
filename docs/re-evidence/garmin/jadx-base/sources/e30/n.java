package e30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCoursePowerGuideUseCase", f = "GetCoursePowerGuideUseCase.kt", l = {59}, m = "getPowerGuide", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f62701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f62702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f62702b = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f62701a = obj;
        this.f62703c |= Integer.MIN_VALUE;
        return p.b(this.f62702b, 0L, this);
    }
}
