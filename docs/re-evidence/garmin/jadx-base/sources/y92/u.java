package y92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository", f = "NfcDevicePasscodeRepository.kt", l = {186, 208}, m = "verifyPasscode$suspendImpl", v = 1)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.s f195379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f195381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f fVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f195381c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195380b = obj;
        this.f195382d |= Integer.MIN_VALUE;
        return f.p(this.f195381c, null, this);
    }
}
