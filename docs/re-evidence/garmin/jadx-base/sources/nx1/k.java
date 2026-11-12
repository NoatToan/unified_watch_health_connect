package nx1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.GetUserSettingsUseCase", f = "GetUserSettingsUseCase.kt", l = {15, 14}, m = "invoke", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f128238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f128240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f128240c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128239b = obj;
        this.f128241d |= Integer.MIN_VALUE;
        return this.f128240c.a(this);
    }
}
