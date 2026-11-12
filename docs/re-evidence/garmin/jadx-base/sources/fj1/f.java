package fj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.network.PrimaryDeviceRepo", f = "PrimaryDeviceRepo.kt", l = {35}, m = "updatePrimaryWearable", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f71839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f71840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f71841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f71841c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71840b = obj;
        this.f71842d |= Integer.MIN_VALUE;
        return this.f71841c.c(0L, this);
    }
}
