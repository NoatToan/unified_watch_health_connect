package y92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.device.passcode.data.DevicePasscodeProtobufHandler", f = "DevicePasscodeProtobufHandler.kt", l = {91}, m = "sendResetPasscodeRequest", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f195297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f195297b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195296a = obj;
        this.f195298c |= Integer.MIN_VALUE;
        return this.f195297b.l(this);
    }
}
