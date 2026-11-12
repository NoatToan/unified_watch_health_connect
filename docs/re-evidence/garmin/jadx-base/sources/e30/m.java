package e30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCoursePowerGuideUseCase", f = "GetCoursePowerGuideUseCase.kt", l = {73}, m = "getNutritionAndHydration", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ab1.g f62696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f62698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f62699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f62699d = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f62698c = obj;
        this.f62700e |= Integer.MIN_VALUE;
        return p.a(this.f62699d, null, this);
    }
}
