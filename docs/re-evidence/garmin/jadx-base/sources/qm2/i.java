package qm2;

import com.garmin.device.pairing.PairingException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqm2/i;", "Llm2/i$b;", "", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements lm2.i.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f145712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.d f145713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f145714c;

    public i(h hVar, bm2.d dVar, byte[] bArr) {
        this.f145712a = hVar;
        this.f145713b = dVar;
        this.f145714c = bArr;
    }

    @Override // lm2.i.b
    public final void a(String str) {
        String str2 = str;
        nm2.a aVar = this.f145712a.f145711f;
        if (aVar == null) {
            s.m("mNonSetupDelegate");
            throw null;
        }
        aVar.b(this.f145713b, this.f145714c, str2);
        h.f145710g.debug("checkForFirmwareUpdate: onSucceed");
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        if (!(th3 instanceof PairingException)) {
            com.airbnb.lottie.animation.keyframe.a.z("checkForFirmwareUpdate: onFail: [", th3.getMessage(), "]", h.f145710g);
        } else {
            yl2.e pairingFailure = ((PairingException) th3).getPairingFailure();
            pairingFailure.getClass();
            com.airbnb.lottie.animation.keyframe.a.z("checkForFirmwareUpdate: onFail: [", pairingFailure.name(), "]", h.f145710g);
        }
    }
}
