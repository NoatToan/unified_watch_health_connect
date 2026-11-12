package kw2;

import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.base.DeviceServiceCalls", f = "DeviceServiceCalls.kt", l = {94}, m = "getRealtimeSettingsNotificationService", v = 1)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f106983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f106985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f106986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, t13.d<? super a> dVar2) {
        super(dVar2);
        this.f106985c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106984b = obj;
        this.f106986d |= Integer.MIN_VALUE;
        return this.f106985c.b(null, this);
    }
}
