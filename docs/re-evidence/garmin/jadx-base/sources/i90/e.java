package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SimpleSetupProtobufDataHandler", f = "SimpleSetupProtobufDataHandler.kt", l = {119}, m = "sendSensorListNotification", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f92287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f92287b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92286a = obj;
        this.f92288c |= Integer.MIN_VALUE;
        return this.f92287b.m(null, this);
    }
}
