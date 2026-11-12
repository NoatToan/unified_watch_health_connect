package de2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {466}, m = "updateMetaConfiguration", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveTrackProto.LiveTrackService.Builder f59360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f59361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f59363d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59362c = obj;
        this.f59364e |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59363d.t(0L, null, this);
    }
}
