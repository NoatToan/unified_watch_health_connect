package com.xiaomi.fit.device.bind;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.device.bind.LocalWearBinderV2;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.ApiCallConfigImpl;
import com.xiaomi.wearable.LocalBindResult;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.cc0;
import defpackage.dsf;
import defpackage.iql;
import defpackage.ka0;
import defpackage.kj2;
import defpackage.na0;
import defpackage.om5;
import defpackage.p90;
import defpackage.pb0;
import defpackage.s7r;
import defpackage.ta0;
import defpackage.ucb;
import defpackage.w77;
import defpackage.wa0;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class LocalWearBinderV2 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11292b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public KeyPair g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f11293k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public final String o;
    public int p;
    public BindToServer q;

    public LocalWearBinderV2(DeviceInfo deviceInfo, String str) {
        super(deviceInfo);
        this.o = str;
        this.q = ApiCallConfigImpl.INSTANCE;
    }

    public static /* synthetic */ Unit i(LocalBindResult localBindResult) {
        Logger.i("DeviceBinderLocalV2", "recordToServer success ");
        return null;
    }

    public static /* synthetic */ Unit j(Exception exc) {
        Logger.e("DeviceBinderLocalV2", "recordToServer fail message = " + exc.getMessage(), exc);
        exc.printStackTrace();
        return null;
    }

    public void h(int i, String str, String str2, String str3, String str4, kj2 kj2Var) {
        Logger.i("DeviceBinderLocalV2", "bindHello() called");
        this.f11291a = str;
        this.p = i;
        this.f11292b = str2.toUpperCase(Locale.ENGLISH);
        this.c = str3;
        this.d = str4;
        this.mCallback = kj2Var;
        KeyPair keyPairJ = iql.j();
        this.g = keyPairJ;
        if (keyPairJ == null) {
            k(100, "generate ecc key pair failed");
            return;
        }
        this.f = iql.l(keyPairJ.getPublic());
        try {
            p();
        } catch (Exception e) {
            e.printStackTrace();
            k(100, e.getMessage());
        }
    }

    public final void k(int i, String str) {
        s(18, i);
        this.mCallback.onBindFailure(1010, str);
    }

    public final void l(String str) {
        Logger.i("DeviceBinderLocalV2", "onDeviceConfirmFailed called");
        this.mCallback.onBindFailure(1013, str);
    }

    public final void m(String str) {
        Logger.d("DeviceBinderLocalV2", "onSendBindResultFailed() called with: message = [" + str + "]");
        this.mCallback.onBindFailure(1009, str);
    }

    public final void n(int i, String str) {
        Logger.i("DeviceBinderLocalV2", "onVerifyDeviceFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        s(19, i);
        this.mCallback.onBindFailure(1012, str);
    }

    public final void o() {
        this.mCallback.onLocalBindSuccess(this.f11291a, this.d, this.f11292b.toLowerCase(Locale.ENGLISH), this.c, this.e, this.i);
        Logger.i("DeviceBinderLocalV2", "start recordToServer");
        this.q.recordToServer(this.c, this.d, this.f11291a, new Function1() { // from class: tne
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalWearBinderV2.i((LocalBindResult) obj);
            }
        }, new Function1() { // from class: une
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalWearBinderV2.j((Exception) obj);
            }
        });
    }

    public final void p() {
        Logger.i("DeviceBinderLocalV2", "start sendAppVerify called");
        this.e = LocalBindTool.INSTANCE.generateAppDeviceIdWithPhoneId(this.f11292b, this.mUserId);
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 18;
        p90 p90Var = new p90();
        na0 na0Var = new na0();
        na0Var.c = this.e;
        na0Var.d = this.f;
        p90Var.L(na0Var);
        Logger.d("DeviceBinderLocalV2", "sendAppVerify(),appDeviceId:" + this.e + " publickKey:" + ByteUtil.bytesToHexString(this.f));
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.f11292b, om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.LocalWearBinderV2.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (!wearApiResult.d()) {
                    LocalWearBinderV2.this.mCallback.onBindFailure(1012, "verifyDevice apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (!s7rVarB.o().y()) {
                    if (!s7rVarB.o().A()) {
                        LocalWearBinderV2.this.mCallback.onBindFailure(1012, "not expected response for verifyDevice");
                        return;
                    } else {
                        ta0 ta0VarT = s7rVarB.o().t();
                        LocalWearBinderV2.this.u(ta0VarT.c, ta0VarT.e, ta0VarT.d);
                        return;
                    }
                }
                int iR = s7rVarB.o().r();
                if (iR == 7) {
                    LocalWearBinderV2.this.mCallback.onBindFailure(1012, "verify device signature failed");
                    return;
                }
                LocalWearBinderV2.this.mCallback.onBindFailure(1012, "verifyDevice errorCode: " + iR);
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
        if (this.p == 3) {
            t();
        }
    }

    public final void q() {
        Logger.d("DeviceBinderLocalV2", "start sendBindResult called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 25;
        p90 p90Var = new p90();
        pb0 pb0Var = new pb0();
        wa0 wa0Var = new wa0();
        wa0Var.c = this.mUserId;
        cc0 cc0Var = new cc0();
        cc0Var.c = 0;
        cc0Var.d = Build.VERSION.SDK_INT;
        cc0Var.e = Build.MODEL;
        wa0Var.d = cc0Var;
        pb0Var.c = iql.e(this.l, WearBinderV2.f, dsf.i(wa0Var), "bind-data".getBytes());
        p90Var.G(pb0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.f11292b, om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.LocalWearBinderV2.3
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (!wearApiResult.d()) {
                    LocalWearBinderV2.this.m("sendBindResult apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (!s7rVarB.I() || !s7rVarB.o().y() || s7rVarB.o().r() == 0) {
                    Logger.d("DeviceBinderLocalV2_onLocalBindSuccess", new Object[0]);
                    LocalWearBinderV2.this.mCallback.onBondSuccess();
                    LocalWearBinderV2.this.mCallback.dismissButtonConfirmDialog();
                    LocalWearBinderV2.this.o();
                    return;
                }
                LocalWearBinderV2.this.m("sendBindResult errorCode: " + s7rVarB.o().r());
            }
        }, 15000);
    }

    public final void r() throws Exception {
        byte[] bArrA;
        Logger.d("DeviceBinderLocalV2", "start sendConfirm called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 19;
        p90 p90Var = new p90();
        ka0 ka0Var = new ka0();
        if (TextUtils.isEmpty(this.o)) {
            bArrA = ucb.a(this.h, this.f11293k);
        } else {
            byte[] bytes = this.o.getBytes();
            byte[] bArr = this.f11293k;
            byte[] bArr2 = new byte[bArr.length + bytes.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(bytes, 0, bArr2, this.f11293k.length, bytes.length);
            bArrA = ucb.a(this.h, bArr2);
        }
        ka0Var.c = this.f11293k;
        ka0Var.d = bArrA;
        p90Var.K(ka0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.f11292b, om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.LocalWearBinderV2.2
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (!wearApiResult.d()) {
                    Logger.d("DeviceBinderLocalV2_sendConfirm error:" + wearApiResult.a(), new Object[0]);
                    LocalWearBinderV2.this.l("confirmOOB apiCode: " + wearApiResult.a());
                    return;
                }
                Logger.d("DeviceBinderLocalV2_sendConfirm success", new Object[0]);
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (s7rVarB == null) {
                    LocalWearBinderV2.this.l("response error");
                    return;
                }
                if (s7rVarB.o().y() && s7rVarB.o().r() == 6) {
                    LocalWearBinderV2.this.l("device cancelled");
                }
                if (!s7rVarB.o().z()) {
                    LocalWearBinderV2.this.l("not expected response for confirmOOB");
                    return;
                }
                Logger.i("DeviceBinderLocalV2_sendConfirm response:" + s7rVarB.o().s().c, new Object[0]);
                if (s7rVarB.o().s().c) {
                    LocalWearBinderV2.this.q();
                }
            }
        }, 15000);
    }

    public final void s(int i, int i2) {
        Logger.i("DeviceBinderLocalV2", "sendErrorCode() called with: accountId = [" + i + "], errorCode = [" + i2 + "]");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = i;
        p90 p90Var = new p90();
        p90Var.J(i2);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.f11292b, om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.LocalWearBinderV2.4
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                Logger.i("DeviceBinderLocalV2", "onCallback() called with: result = [" + wearApiResult + "]");
            }
        }, 15000);
    }

    public final void t() {
        this.mCallback.showButtonConfirmDialog();
    }

    @SuppressLint({"DefaultLocale"})
    public final void u(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrA;
        Logger.i("DeviceBinderLocalV2", "start verifyDevice called");
        try {
            byte[] bArr4 = new byte[65];
            bArr4[0] = 4;
            System.arraycopy(bArr, 0, bArr4, 1, bArr.length);
            SecretKey secretKeyM = iql.m(w77.b(bArr4, ((ECPublicKey) this.g.getPublic()).getParams()), this.g.getPrivate());
            if (secretKeyM == null) {
                n(100, "ecdh failed");
                return;
            }
            this.h = secretKeyM.getEncoded();
            Logger.d("DeviceBinderLocalV2", "_deviceSign:" + ByteUtil.bytesToHexString(bArr2));
            Logger.d("DeviceBinderLocalV2", "_devRandom:" + ByteUtil.bytesToHexString(bArr3));
            Logger.d("DeviceBinderLocalV2", "_shareKey:" + ByteUtil.bytesToHexString(this.h));
            if (TextUtils.isEmpty(this.o)) {
                bArrA = ucb.a(this.h, bArr3);
                Logger.d("DeviceBinderLocalV2", "_deviceSign_byApp_oob_isEmpty:" + ByteUtil.bytesToHexString(bArrA));
            } else {
                byte[] bytes = this.o.getBytes();
                byte[] bArr5 = new byte[bArr3.length + bytes.length];
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                System.arraycopy(bytes, 0, bArr5, bArr3.length, bytes.length);
                bArrA = ucb.a(this.h, bArr5);
                Logger.d("DeviceBinderLocalV2", "_deviceSign:" + ByteUtil.bytesToHexString(bArrA));
            }
            if (!ByteUtil.equals(bArrA, bArr2)) {
                n(7, "verify signature failed");
                return;
            }
            this.f11293k = iql.k(16);
            Logger.d("DeviceBinderLocalV2", "_appRandom:" + ByteUtil.bytesToHexString(this.f11293k));
            byte[] bArr6 = new byte[32];
            System.arraycopy(this.f11293k, 0, bArr6, 0, 16);
            System.arraycopy(bArr3, 0, bArr6, 16, 16);
            byte[] bArrI = iql.i("miwear-bind", this.h, bArr6);
            byte[] bArr7 = new byte[16];
            this.j = bArr7;
            this.i = new byte[16];
            this.l = new byte[16];
            this.m = new byte[4];
            this.n = new byte[4];
            System.arraycopy(bArrI, 0, bArr7, 0, 16);
            System.arraycopy(bArrI, 16, this.l, 0, 16);
            System.arraycopy(bArrI, 32, this.n, 0, 4);
            System.arraycopy(bArrI, 36, this.m, 0, 4);
            System.arraycopy(bArrI, 40, this.i, 0, 16);
            r();
        } catch (Exception e) {
            e.printStackTrace();
            n(100, e.getMessage());
        }
    }
}
