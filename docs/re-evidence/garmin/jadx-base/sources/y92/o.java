package y92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository", f = "NfcDevicePasscodeRepository.kt", l = {241, 266}, m = "resetPasscode$suspendImpl", v = 1)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.s f195353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f195355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f195355c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195354b = obj;
        this.f195356d |= Integer.MIN_VALUE;
        return f.l(this.f195355c, this);
    }
}
