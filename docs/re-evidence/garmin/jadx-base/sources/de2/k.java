package de2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {191, 193, 193}, m = "stopLiveTrack", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f59325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0.b f59326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f59327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f59328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f59329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f59329h = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59328g = obj;
        this.f59330i |= Integer.MIN_VALUE;
        return this.f59329h.f(0L, false, null, 0L, this);
    }
}
