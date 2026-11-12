package de2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {344}, m = "notifyLivetrackStart", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f59265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f59266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f59268d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59267c = obj;
        this.f59269e |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59268d.j(null, this);
    }
}
