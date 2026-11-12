package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewDeviceDataManager", f = "NewDeviceDataManager.kt", l = {74}, m = "completeSync", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wo2.f f205679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f205681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f205681c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205680b = obj;
        this.f205682d |= Integer.MIN_VALUE;
        return this.f205681c.b(this, null, null);
    }
}
