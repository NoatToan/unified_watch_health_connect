package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SportProfileSetupUseCase", f = "SportProfileSetupUseCase.kt", l = {52}, m = "sendSensorListNotification", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f92315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f92315b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92314a = obj;
        this.f92316c |= Integer.MIN_VALUE;
        return this.f92315b.e(null, this);
    }
}
