package b70;

import android.os.Parcelable;
import j61.i;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.reports.GetLatestCyclingAbilityDataUseCase", f = "GetLatestCyclingAbilityDataUseCase.kt", l = {29, 38, 41, 42, 47, 53}, m = "invoke", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f16294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcelable f16295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f16298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f16298e = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f16297d = obj;
        this.f16299f |= Integer.MIN_VALUE;
        return this.f16298e.f(this);
    }
}
