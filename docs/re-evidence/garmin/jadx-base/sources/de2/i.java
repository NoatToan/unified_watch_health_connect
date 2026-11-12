package de2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {440}, m = "sendUpdatedSettingsNotification", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f59313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f59313c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59312b = obj;
        this.f59314d |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59313c.n(0L, this);
    }
}
