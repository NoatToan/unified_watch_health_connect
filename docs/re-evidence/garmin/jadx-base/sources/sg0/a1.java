package sg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyViewModel", f = "ManageFamilyViewModel.kt", l = {86}, m = "getCachedUserProfileFrameData", v = 2)
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f159024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f159025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f159026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1 f159027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1 e1Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f159027d = e1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159026c = obj;
        this.f159028e |= Integer.MIN_VALUE;
        return this.f159027d.y4(null, this);
    }
}
