package defpackage;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;

/* JADX INFO: loaded from: classes3.dex */
public class pft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public agt f30359a;

    public pft(jet jetVar) {
        this.f30359a = null;
        this.f30359a = new agt(jetVar);
    }

    public AuthResult a(xct xctVar, dts dtsVar) {
        AuthResult authResultD;
        this.f30359a.g(xctVar.a());
        if (hgt.f(this.f30359a.getPeripheral())) {
            agt agtVar = this.f30359a;
            agtVar.c(hgt.b(agtVar.getPeripheral()));
        }
        if (!this.f30359a.init()) {
            dtsVar.onAuthentication(new HMAuthState(1, 4));
            return new AuthResult(4, y.PROFILE_INIT_FAIL);
        }
        ydt ydtVarP = wbt.f37824b ? this.f30359a.p() : null;
        t5t.m("HMProAuthController", "AuthProfileInfo:" + ydtVarP);
        if (ydtVarP == null || ydtVarP.f() < 1) {
            authResultD = d(xctVar, dtsVar);
        } else {
            this.f30359a.h((byte) -128);
            authResultD = b(xctVar, ydtVarP, dtsVar);
        }
        this.f30359a.deInit();
        return authResultD;
    }

    public final AuthResult b(xct xctVar, ydt ydtVar, dts dtsVar) {
        byte[] bArrY;
        if (xctVar.f()) {
            xctVar.b(ydtVar.f());
            byte[] bArrR = this.f30359a.r();
            t5t.m("HMProAuthController", "randomValue:" + tet.x(bArrR));
            if (bArrR == null || bArrR.length != 16) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                this.f30359a.deInit();
                return new AuthResult(4, y.REQUEST_RANDOM_FAIL);
            }
            byte[] bArrD = agt.d(this.f30359a.getDevice().getAddress(), bArrR);
            t5t.m("HMProAuthController", "newRandom:" + tet.x(bArrD));
            if (bArrD == null) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                this.f30359a.deInit();
                return new AuthResult(4, y.GENERATE_RANDOM_FAIL);
            }
            byte[] bArrS = agt.s(bArrD);
            t5t.m("HMProAuthController", "sha256:" + tet.x(bArrS));
            if (bArrS == null || bArrS.length != 32) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                this.f30359a.deInit();
                return new AuthResult(4, y.GENERATE_SHA_256_FAIL);
            }
            byte[] bArrOnGetSignData = dtsVar.onGetSignData(bArrS, ydtVar.e(), ydtVar.a());
            StringBuilder sb = new StringBuilder();
            sb.append("signData:");
            sb.append(tet.x(bArrOnGetSignData));
            sb.append(",len:");
            sb.append(bArrOnGetSignData != null ? bArrOnGetSignData.length : 0);
            t5t.m("HMProAuthController", sb.toString());
            if (bArrOnGetSignData == null) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                this.f30359a.deInit();
                return new AuthResult(4, y.GET_SIGN_FAIL);
            }
            AuthResult authResultB = this.f30359a.b(bArrOnGetSignData, new byte[]{0, 0, 0, 0});
            if (!(authResultB.getAuthError() instanceof eu)) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                this.f30359a.deInit();
                authResultB.a(4);
                return authResultB;
            }
            dtsVar.onAuthentication(new HMAuthState(2));
            AuthResult authResultU = this.f30359a.u();
            int originCode = authResultU.getOriginCode();
            nbt authError = authResultU.getAuthError();
            if (authError instanceof y) {
                dtsVar.onAuthentication(new HMAuthState(1, 3));
                return authResultU;
            }
            if (authError instanceof mp) {
                if (originCode == 2) {
                    dtsVar.onAuthentication(new HMAuthState(4));
                    this.f30359a.deInit();
                    authResultU.a(6);
                } else {
                    dtsVar.onAuthentication(new HMAuthState(1, 3));
                    this.f30359a.deInit();
                    authResultU.a(3);
                }
                return authResultU;
            }
            if (authError instanceof eu) {
                dtsVar.onAuthentication(new HMAuthState(3));
            }
            bArrY = new byte[16];
            System.arraycopy(bArrS, 0, bArrY, 0, 16);
            xctVar.c(tet.B(bArrY));
        } else {
            bArrY = tet.y(xctVar.e());
            if (bArrY == null || bArrY.length != 16) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(5, y.KEY_ERROR);
            }
        }
        AuthResult authResultJ = this.f30359a.j(bArrY);
        if (authResultJ.getAuthError() instanceof eu) {
            HMAuthState hMAuthState = new HMAuthState(0);
            hMAuthState.setRandomValue(this.f30359a.t());
            dtsVar.onAuthentication(hMAuthState);
            authResultJ.a(0);
        } else {
            dtsVar.onAuthentication(new HMAuthState(1, 4));
            authResultJ.a(4);
        }
        return authResultJ;
    }

    public boolean c(xct xctVar) {
        if (xctVar == null || !this.f30359a.init()) {
            return false;
        }
        this.f30359a.g(xctVar.a());
        if (hgt.f(this.f30359a.getPeripheral())) {
            agt agtVar = this.f30359a;
            agtVar.c(hgt.b(agtVar.getPeripheral()));
        }
        ydt ydtVarP = wbt.f37824b ? this.f30359a.p() : null;
        if (ydtVarP != null && ydtVarP.f() >= 1) {
            this.f30359a.h((byte) -128);
        }
        this.f30359a.g(xctVar.a());
        boolean zI = this.f30359a.i(xctVar.e());
        this.f30359a.deInit();
        return zI;
    }

    public final AuthResult d(xct xctVar, dts dtsVar) {
        String strE = xctVar.e();
        if (TextUtils.isEmpty(strE)) {
            dtsVar.onAuthentication(new HMAuthState(1, 5));
            return new AuthResult(5, y.KEY_ERROR);
        }
        if (xctVar.f()) {
            AuthResult authResultF = this.f30359a.f(strE);
            if (!(authResultF.getAuthError() instanceof eu)) {
                dtsVar.onAuthentication(new HMAuthState(1, 4));
                authResultF.a(7);
                return authResultF;
            }
            dtsVar.onAuthentication(new HMAuthState(2));
            AuthResult authResultU = this.f30359a.u();
            int originCode = authResultU.getOriginCode();
            t5t.d("HMProAuthController", "response code:" + originCode);
            if (!(authResultU.getAuthError() instanceof eu)) {
                if ((authResultU.getAuthError() instanceof mp) && originCode == 2) {
                    dtsVar.onAuthentication(new HMAuthState(4, 0, originCode));
                } else {
                    dtsVar.onAuthentication(new HMAuthState(1, 3, originCode));
                }
                authResultU.a(7);
                return authResultU;
            }
            dtsVar.onAuthentication(new HMAuthState(3, 0, originCode));
        }
        AuthResult authResultA = this.f30359a.a(strE);
        t5t.d("HMProAuthController", "response code:" + authResultA.getOriginCode());
        if (authResultA.getAuthError() instanceof eu) {
            HMAuthState hMAuthState = new HMAuthState(0, 0, authResultA.getOriginCode());
            hMAuthState.setRandomValue(this.f30359a.t());
            dtsVar.onAuthentication(hMAuthState);
            authResultA.a(0);
        } else {
            dtsVar.onAuthentication(new HMAuthState(1, 4, authResultA.getOriginCode()));
            authResultA.a(4);
        }
        return authResultA;
    }
}
