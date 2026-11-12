package com.xiaomi.hm.health.bt.classic;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.AuthProfileInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;

/* JADX INFO: loaded from: classes19.dex */
public class HMProAuthController {
    private static final String b = "HMProAuthController";
    private HMProAuthProfile a;

    public HMProAuthController(ITransport classicTransport) {
        this.a = null;
        this.a = new HMProAuthProfile(classicTransport);
    }

    private boolean a(AuthInfo info, AuthProfileInfo authProfileInfo, IHMAuthCallback callback) {
        byte[] bArrHexStringToBytes;
        if (info.isPair()) {
            byte[] random = this.a.getRandom();
            Debug.i(b, "randomValue:" + GattUtils.bytesToHexString(random));
            if (random == null || random.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return false;
            }
            byte[] bArrC = HMProAuthProfile.c(this.a.getDevice().getAddress(), random);
            Debug.i(b, "newRandom:" + GattUtils.bytesToHexString(bArrC));
            if (bArrC == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return false;
            }
            byte[] bArrR = HMProAuthProfile.r(bArrC);
            Debug.i(b, "sha256:" + GattUtils.bytesToHexString(bArrR));
            if (bArrR == null || bArrR.length != 32) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return false;
            }
            byte[] bArrOnGetSignData = callback.onGetSignData(bArrR, authProfileInfo.getPublicKeyHash(), authProfileInfo.getAlgorithm());
            StringBuilder sb = new StringBuilder();
            sb.append("signData:");
            sb.append(GattUtils.bytesToHexString(bArrOnGetSignData));
            sb.append(",len:");
            sb.append(bArrOnGetSignData != null ? bArrOnGetSignData.length : 0);
            Debug.i(b, sb.toString());
            if (bArrOnGetSignData == null) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return false;
            }
            if (!this.a.n(bArrOnGetSignData, new byte[]{0, 0, 0, 0})) {
                callback.onAuthentication(new HMAuthState(1, 4));
                this.a.deInit();
                return false;
            }
            callback.onAuthentication(new HMAuthState(2));
            int iF = this.a.f();
            if (iF != 1) {
                if (iF == 2) {
                    callback.onAuthentication(new HMAuthState(4));
                    this.a.deInit();
                    return false;
                }
                callback.onAuthentication(new HMAuthState(1, 3));
                this.a.deInit();
                return false;
            }
            callback.onAuthentication(new HMAuthState(3));
            bArrHexStringToBytes = new byte[16];
            System.arraycopy(bArrR, 0, bArrHexStringToBytes, 0, 16);
            info.setKey(GattUtils.bytesToHexStringNoSpace(bArrHexStringToBytes));
        } else {
            bArrHexStringToBytes = GattUtils.hexStringToBytes(info.getKey());
            if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 16) {
                callback.onAuthentication(new HMAuthState(1, 4));
                return false;
            }
        }
        if (this.a.a(bArrHexStringToBytes) != 1) {
            callback.onAuthentication(new HMAuthState(1, 4));
            return false;
        }
        HMAuthState hMAuthState = new HMAuthState(0);
        hMAuthState.setRandomValue(this.a.e());
        callback.onAuthentication(hMAuthState);
        return true;
    }

    private boolean b(AuthInfo info, IHMAuthCallback callback) {
        String key = info.getKey();
        if (TextUtils.isEmpty(key)) {
            callback.onAuthentication(new HMAuthState(1, 4));
            return false;
        }
        boolean z = !info.isPair();
        if (info.isPair()) {
            if (this.a.g(key)) {
                callback.onAuthentication(new HMAuthState(2));
                int iF = this.a.f();
                Debug.fi(b, "response code:" + iF);
                if (iF == 1) {
                    callback.onAuthentication(new HMAuthState(3, 0, iF));
                    z = true;
                } else if (iF == 2) {
                    callback.onAuthentication(new HMAuthState(4, 0, iF));
                } else if (iF == 5) {
                    callback.onAuthentication(new HMAuthState(10, 7, iF));
                } else if ((iF & 255) == 254) {
                    callback.onAuthentication(new HMAuthState(11, 7, iF));
                } else {
                    callback.onAuthentication(new HMAuthState(1, 3, iF));
                }
            } else {
                callback.onAuthentication(new HMAuthState(1, 4));
            }
        }
        if (!z) {
            return false;
        }
        int iAuth = this.a.auth(key);
        Debug.fi(b, "response code:" + iAuth);
        if (iAuth != 1) {
            callback.onAuthentication(new HMAuthState(1, 4, iAuth));
            return false;
        }
        HMAuthState hMAuthState = new HMAuthState(0, 0, iAuth);
        hMAuthState.setRandomValue(this.a.e());
        callback.onAuthentication(hMAuthState);
        return true;
    }

    public boolean auth(AuthInfo info, IHMAuthCallback callback) {
        if (info == null || callback == null) {
            return false;
        }
        this.a.p(info.getAppId());
        if (!this.a.init()) {
            callback.onAuthentication(new HMAuthState(1, 4));
            return false;
        }
        boolean zB = b(info, callback);
        this.a.deInit();
        return zB;
    }

    public boolean unbind(AuthInfo info) {
        if (info == null || !this.a.init()) {
            return false;
        }
        boolean zUnbind = this.a.unbind(info.getKey());
        this.a.deInit();
        return zUnbind;
    }
}
