package com.xiaomi.hm.health.bt.profile.auth;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.Success;
import com.xiaomi.hm.health.bt.profile.feature.HMFeatureProfile;

/* JADX INFO: loaded from: classes11.dex */
public class HMProAuthController {
    private static final String b = "HMProAuthController";
    private HMProAuthProfile a;

    public HMProAuthController(GattPeripheral gattPeripheral) {
        this.a = null;
        this.a = new HMProAuthProfile(gattPeripheral);
    }

    private AuthResult a(AuthInfo info, AuthProfileInfo authProfileInfo, IHMAuthCallback callback) {
        byte[] bArrHexStringToBytes;
        if (info.isPair()) {
            info.setAuthVersion(authProfileInfo.getVersion());
            byte[] random = this.a.getRandom();
            Debug.i(b, "randomValue:" + GattUtils.bytesToHexString(random));
            if (random == null || random.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return new AuthResult(4, AppAuthError.REQUEST_RANDOM_FAIL);
            }
            byte[] bArrD = HMProAuthProfile.d(this.a.getDevice().getAddress(), random);
            Debug.i(b, "newRandom:" + GattUtils.bytesToHexString(bArrD));
            if (bArrD == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return new AuthResult(4, AppAuthError.GENERATE_RANDOM_FAIL);
            }
            byte[] bArrU = HMProAuthProfile.u(bArrD);
            Debug.i(b, "sha256:" + GattUtils.bytesToHexString(bArrU));
            if (bArrU == null || bArrU.length != 32) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return new AuthResult(4, AppAuthError.GENERATE_SHA_256_FAIL);
            }
            byte[] bArrOnGetSignData = callback.onGetSignData(bArrU, authProfileInfo.getPublicKeyHash(), authProfileInfo.getAlgorithm());
            StringBuilder sb = new StringBuilder();
            sb.append("signData:");
            sb.append(GattUtils.bytesToHexString(bArrOnGetSignData));
            sb.append(",len:");
            sb.append(bArrOnGetSignData != null ? bArrOnGetSignData.length : 0);
            Debug.i(b, sb.toString());
            if (bArrOnGetSignData == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return new AuthResult(4, AppAuthError.GET_SIGN_FAIL);
            }
            AuthResult authResultP = this.a.p(bArrOnGetSignData, new byte[]{0, 0, 0, 0});
            if (!(authResultP.getAuthError() instanceof Success)) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                authResultP.setOriginCode(4);
                return authResultP;
            }
            callback.onAuthentication(new HMAuthState(2));
            AuthResult authResultG = this.a.g();
            int originCode = authResultG.getOriginCode();
            AuthError authError = authResultG.getAuthError();
            if (authError instanceof AppAuthError) {
                callback.onAuthentication(new HMAuthState(1, 3));
                return authResultG;
            }
            if (authError instanceof ProtocolAuthError) {
                if (originCode == 2) {
                    callback.onAuthentication(new HMAuthState(4));
                    this.a.deInit();
                    authResultG.setOriginCode(6);
                } else {
                    callback.onAuthentication(new HMAuthState(1, 3));
                    this.a.deInit();
                    authResultG.setOriginCode(3);
                }
                return authResultG;
            }
            if (authError instanceof Success) {
                callback.onAuthentication(new HMAuthState(3));
            }
            bArrHexStringToBytes = new byte[16];
            System.arraycopy(bArrU, 0, bArrHexStringToBytes, 0, 16);
            info.setKey(GattUtils.bytesToHexStringNoSpace(bArrHexStringToBytes));
        } else {
            bArrHexStringToBytes = GattUtils.hexStringToBytes(info.getKey());
            if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return new AuthResult(5, AppAuthError.KEY_ERROR);
            }
        }
        AuthResult authResultB = this.a.b(bArrHexStringToBytes);
        if (authResultB.getAuthError() instanceof Success) {
            HMAuthState hMAuthState = new HMAuthState(0);
            hMAuthState.setRandomValue(this.a.f());
            callback.onAuthentication(hMAuthState);
            authResultB.setOriginCode(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4));
            authResultB.setOriginCode(4);
        }
        return authResultB;
    }

    private AuthResult b(AuthInfo info, IHMAuthCallback callback) {
        String key = info.getKey();
        if (TextUtils.isEmpty(key)) {
            callback.onAuthentication(new HMAuthState(1, 5));
            return new AuthResult(5, AppAuthError.KEY_ERROR);
        }
        if (info.isPair()) {
            AuthResult authResultH = this.a.h(key);
            if (!(authResultH.getAuthError() instanceof Success)) {
                callback.onAuthentication(new HMAuthState(1, 4));
                authResultH.setOriginCode(7);
                return authResultH;
            }
            callback.onAuthentication(new HMAuthState(2));
            AuthResult authResultG = this.a.g();
            int originCode = authResultG.getOriginCode();
            Debug.fi(b, "response code:" + originCode);
            if (!(authResultG.getAuthError() instanceof Success)) {
                if ((authResultG.getAuthError() instanceof ProtocolAuthError) && originCode == 2) {
                    callback.onAuthentication(new HMAuthState(4, 0, originCode));
                } else {
                    callback.onAuthentication(new HMAuthState(1, 3, originCode));
                }
                authResultG.setOriginCode(7);
                return authResultG;
            }
            callback.onAuthentication(new HMAuthState(3, 0, originCode));
        }
        AuthResult authResultAuth = this.a.auth(key);
        Debug.fi(b, "response code:" + authResultAuth.getOriginCode());
        if (authResultAuth.getAuthError() instanceof Success) {
            HMAuthState hMAuthState = new HMAuthState(0, 0, authResultAuth.getOriginCode());
            hMAuthState.setRandomValue(this.a.f());
            callback.onAuthentication(hMAuthState);
            authResultAuth.setOriginCode(0);
        } else {
            callback.onAuthentication(new HMAuthState(1, 4, authResultAuth.getOriginCode()));
            authResultAuth.setOriginCode(4);
        }
        return authResultAuth;
    }

    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        AuthResult authResultB;
        this.a.r(info.getAppId());
        if (HMFeatureProfile.isSupport(this.a.getPeripheral())) {
            HMProAuthProfile hMProAuthProfile = this.a;
            hMProAuthProfile.t(HMFeatureProfile.getFeature(hMProAuthProfile.getPeripheral()));
        }
        if (!this.a.init()) {
            callback.onAuthentication(new HMAuthState(1, 4));
            return new AuthResult(4, AppAuthError.PROFILE_INIT_FAIL);
        }
        AuthProfileInfo authProfileInfoE = HMBleConfig.SUPPORT_NEW_AUTH ? this.a.e() : null;
        Debug.i(b, "AuthProfileInfo:" + authProfileInfoE);
        if (authProfileInfoE == null || authProfileInfoE.getVersion() < 1) {
            authResultB = b(info, callback);
        } else {
            this.a.s((byte) -128);
            authResultB = a(info, authProfileInfoE, callback);
        }
        this.a.deInit();
        return authResultB;
    }

    public boolean unbind(AuthInfo info) {
        if (info == null || !this.a.init()) {
            return false;
        }
        this.a.r(info.getAppId());
        if (HMFeatureProfile.isSupport(this.a.getPeripheral())) {
            HMProAuthProfile hMProAuthProfile = this.a;
            hMProAuthProfile.t(HMFeatureProfile.getFeature(hMProAuthProfile.getPeripheral()));
        }
        AuthProfileInfo authProfileInfoE = HMBleConfig.SUPPORT_NEW_AUTH ? this.a.e() : null;
        if (authProfileInfoE != null && authProfileInfoE.getVersion() >= 1) {
            this.a.s((byte) -128);
        }
        this.a.r(info.getAppId());
        boolean zUnbind = this.a.unbind(info.getKey());
        this.a.deInit();
        return zUnbind;
    }
}
