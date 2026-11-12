package qr2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.r;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000bR0\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR$\u0010'\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\"\u0010/\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u00062"}, d2 = {"Lqr2/e;", "Landroidx/lifecycle/u1;", "Lps2/r;", "Lqr2/a;", "<init>", "()V", "", "onCleared", "Lhs2/b;", "status", "k4", "(Lhs2/b;)V", "", "deviceUnitId", "J2", "(J)V", "N1", "Lps2/n;", "a", "Lps2/n;", "deviceWallet", "value", "b", "Lhs2/b;", "G4", "deviceWalletStatus", "Landroidx/lifecycle/y0;", "", "c", "Landroidx/lifecycle/y0;", "B4", "()Landroidx/lifecycle/y0;", "isResettingWallet", "d", "A4", "wasWalletResetSuccessful", JWKParameterNames.RSA_EXPONENT, "Z", "()Z", "isDeviceConnected", "", "f", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "F4", "(Ljava/lang/String;)V", "deviceName", "isPhoneBluetoothTurnedOn", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 implements r, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f146972h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f146973i = "ResetWalletViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f146974j = gt2.c.b("ResetWalletViewModel");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private n deviceWallet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private hs2.b deviceWalletStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private y0<Boolean> isResettingWallet = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private y0<Boolean> wasWalletResetSuccessful = new y0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDeviceConnected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String deviceName;

    public e() {
        hs2.a aVar;
        String displayName;
        n nVar = this.deviceWallet;
        this.deviceName = (nVar == null || (aVar = nVar.f140498a) == null || (displayName = aVar.getDisplayName()) == null) ? "--" : displayName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(e eVar) {
        eVar.S1().m(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D4(e eVar, long j8, Throwable th3) {
        y0<Boolean> y0VarL2 = eVar.L2();
        Boolean bool = Boolean.FALSE;
        y0VarL2.m(bool);
        eVar.S1().m(bool);
        Logger logger = f146974j;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Something went wrong when trying to reset the wallet for device (", ", ", th3.getMessage());
        sbK.append(")");
        logger.error(sbK.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    private final void G4(hs2.b bVar) {
        this.deviceWalletStatus = bVar;
        this.isDeviceConnected = bVar == hs2.b.READY;
    }

    @Override // qr2.a
    /* JADX INFO: renamed from: A4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> S1() {
        return this.wasWalletResetSuccessful;
    }

    @Override // qr2.a
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> L2() {
        return this.isResettingWallet;
    }

    public void F4(String str) {
        str.getClass();
        this.deviceName = str;
    }

    @Override // qr2.a
    public void J2(long deviceUnitId) {
        w.f140538a.getClass();
        n nVarI = w.i(deviceUnitId);
        this.deviceWallet = nVarI;
        this.isDeviceConnected = (nVarI != null ? nVarI.h() : null) == hs2.b.READY;
        n nVar = this.deviceWallet;
        if (nVar != null) {
            nVar.m(this);
        }
    }

    @Override // qr2.a
    public void N1(long deviceUnitId) {
        L2().m(Boolean.TRUE);
        n nVar = this.deviceWallet;
        if (nVar != null) {
            nVar.n().k(l13.a.f108327b).h(r03.a.a()).i(new ps2.d(new bb2.b(this, deviceUnitId, 9), 28), new ps2.d(this, 27));
        }
    }

    @Override // qr2.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getIsDeviceConnected() {
        return this.isDeviceConnected;
    }

    @Override // qr2.a
    public boolean f() {
        xr2.a.f192031a.getClass();
        return xr2.a.a();
    }

    @Override // qr2.a
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override // ps2.r
    public void k4(hs2.b status) {
        status.getClass();
        G4(status);
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        n nVar = this.deviceWallet;
        if (nVar != null) {
            nVar.q(this);
        }
        super.onCleared();
    }
}
