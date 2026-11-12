package lw;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.data.repository.BloodPressureRepositoryImpl", f = "BloodPressureRepositoryImpl.kt", l = {63}, m = "getBloodPressureUiData", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l22.a f115063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f115065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f115065c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115064b = obj;
        this.f115066d |= Integer.MIN_VALUE;
        return this.f115065c.b(this);
    }
}
