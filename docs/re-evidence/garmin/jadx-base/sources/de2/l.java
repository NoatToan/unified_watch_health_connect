package de2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {436}, m = "updateAutoStartNotification", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveTrackProto.LiveTrackService.Builder f59331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f59332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f59334d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59333c = obj;
        this.f59335e |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59334d.o(0L, this, false);
    }
}
