package com.xiaomi.eco.api;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.eco.EcoLocalBindResult;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.l;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import defpackage.ch7;
import defpackage.dsf;
import defpackage.ec0;
import defpackage.iql;
import defpackage.ma0;
import defpackage.pa0;
import defpackage.r90;
import defpackage.rb0;
import defpackage.u7r;
import defpackage.ucb;
import defpackage.va0;
import defpackage.w77;
import defpackage.wrc;
import defpackage.xa0;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class l extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11276b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public KeyPair g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f11277k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public final String o;
    public int p;
    public EcoBindToServer q;

    public l(String str, i iVar, String str2) {
        super(str, iVar);
        this.o = str2;
        this.q = (EcoBindToServer) EcoApiCallManager.get().mEcoApiCallConfig;
    }

    public static /* synthetic */ Unit j(EcoLocalBindResult ecoLocalBindResult) {
        Logger.i("LocalEcoBinderV2", "recordToServer success ");
        return null;
    }

    public static /* synthetic */ Unit k(Exception exc) {
        Logger.e("LocalEcoBinderV2", "recordToServer fail message = " + exc.getMessage(), exc);
        exc.printStackTrace();
        return null;
    }

    @SuppressLint({"DefaultLocale"})
    public final void A(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrA;
        Logger.i("LocalEcoBinderV2", "start verifyDevice called");
        try {
            byte[] bArr4 = new byte[65];
            bArr4[0] = 4;
            System.arraycopy(bArr, 0, bArr4, 1, bArr.length);
            SecretKey secretKeyM = iql.m(w77.b(bArr4, ((ECPublicKey) this.g.getPublic()).getParams()), this.g.getPrivate());
            if (secretKeyM == null) {
                r(100, "ecdh failed");
                return;
            }
            this.h = secretKeyM.getEncoded();
            Logger.d("LocalEcoBinderV2_deviceSign:" + ByteUtil.bytesToHexString(bArr2), new Object[0]);
            Logger.d("LocalEcoBinderV2_devRandom:" + ByteUtil.bytesToHexString(bArr3), new Object[0]);
            Logger.d("LocalEcoBinderV2_shareKey:" + ByteUtil.bytesToHexString(this.h), new Object[0]);
            if (TextUtils.isEmpty(this.o)) {
                bArrA = ucb.a(this.h, bArr3);
                Logger.d("LocalEcoBinderV2_deviceSign_byApp_oob_isEmpty:" + ByteUtil.bytesToHexString(bArrA), new Object[0]);
            } else {
                byte[] bytes = this.o.getBytes();
                byte[] bArr5 = new byte[bArr3.length + bytes.length];
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                System.arraycopy(bytes, 0, bArr5, bArr3.length, bytes.length);
                bArrA = ucb.a(this.h, bArr5);
                Logger.d("LocalEcoBinderV2_deviceSign:" + ByteUtil.bytesToHexString(bArrA), new Object[0]);
            }
            if (!ByteUtil.equals(bArrA, bArr2)) {
                r(7, "verify signature failed");
                return;
            }
            byte[] bArrK = iql.k(16);
            this.f11277k = bArrK;
            byte[] bArr6 = new byte[32];
            System.arraycopy(bArrK, 0, bArr6, 0, 16);
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
            x();
        } catch (Exception e) {
            e.printStackTrace();
            r(100, e.getMessage());
        }
    }

    public void g(int i, String str, String str2, String str3, String str4, ch7 ch7Var) {
        Logger.i("LocalEcoBinderV2", "bindHello() called");
        this.f11275a = str;
        this.p = i;
        this.f11276b = str2;
        this.c = str3;
        this.d = str4;
        this.mCallback = ch7Var;
        KeyPair keyPairJ = iql.j();
        this.g = keyPairJ;
        if (keyPairJ == null) {
            o(100, "generate ecc key pair failed");
            return;
        }
        this.f = iql.l(keyPairJ.getPublic());
        try {
            v();
        } catch (Exception e) {
            e.printStackTrace();
            o(100, e.getMessage());
        }
    }

    public final String h() {
        return this.f11275a.startsWith(SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX) ? this.c : this.d;
    }

    public final /* synthetic */ Unit i(String str) {
        Logger.d("DEVICE_DID", "recordDevices sid:" + str);
        this.d = str;
        if (!TextUtils.isEmpty(str)) {
            this.mApiCall.updateDid(this.d);
        }
        Logger.d("LocalEcoBinderV2recordDevices ECO _onLocalBindSuccess", new Object[0]);
        this.mCallback.onBondSuccess();
        this.mCallback.dismissButtonConfirmDialog();
        u();
        t();
        return null;
    }

    public final /* synthetic */ void l(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            this.mCallback.onBindFailure(1012, "verifyDevice apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().D()) {
            if (!ecoApiResult.e().o().F()) {
                this.mCallback.onBindFailure(1012, "not expected response for verifyDevice");
                return;
            } else {
                va0 va0VarV = ecoApiResult.e().o().v();
                A(va0VarV.c, va0VarV.e, va0VarV.d);
                return;
            }
        }
        int iT = ecoApiResult.e().o().t();
        if (iT == 7) {
            this.mCallback.onBindFailure(1012, "verify device signature failed");
            return;
        }
        this.mCallback.onBindFailure(1012, "verifyDevice errorCode: " + iT);
    }

    public final /* synthetic */ void m(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            q("sendBindResult apiCode: " + ecoApiResult.a());
            return;
        }
        if (ecoApiResult.e().v() && ecoApiResult.e().o().D() && ecoApiResult.e().o().t() != 0) {
            q("sendBindResult errorCode: " + ecoApiResult.e().o().t());
            return;
        }
        ((i) this.mApiCall).updateKeys(this.j, this.l, this.n, this.m);
        if (this.f11275a.startsWith(SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX) || this.f11275a.equals("runmi.exbike.jscrm1") || this.f11275a.equals("yesoul.exbike.jsc01y")) {
            s();
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.mApiCall.updateDid(this.d);
        }
        Logger.d("LocalEcoBinderV2ECO _onLocalBindSuccess", new Object[0]);
        this.mCallback.onBondSuccess();
        this.mCallback.dismissButtonConfirmDialog();
        u();
    }

    public final /* synthetic */ void n(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            Logger.d("LocalEcoBinderV2_sendConfirm error:" + ecoApiResult.a(), new Object[0]);
            p("confirmOOB apiCode: " + ecoApiResult.a());
            return;
        }
        Logger.d("LocalEcoBinderV2_sendConfirm success", new Object[0]);
        if (ecoApiResult.e().o().D() && ecoApiResult.e().o().t() == 6) {
            p("device cancelled");
        }
        if (!ecoApiResult.e().o().E()) {
            p("not expected response for confirmOOB");
        } else if (ecoApiResult.e().o().u().c) {
            w();
        }
    }

    public final void o(int i, String str) {
        y(18, i);
        this.mCallback.onBindFailure(1010, str);
    }

    public final void p(String str) {
        Logger.i("LocalEcoBinderV2", "onDeviceConfirmFailed called");
        this.mCallback.onBindFailure(1013, str);
    }

    public final void q(String str) {
        Logger.d("LocalEcoBinderV2", "onSendBindResultFailed() called with: message = [" + str + "]");
        this.mCallback.onBindFailure(1009, str);
    }

    public final void r(int i, String str) {
        Logger.i("LocalEcoBinderV2", "onVerifyDeviceFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        y(19, i);
        this.mCallback.onBindFailure(1012, str);
    }

    public final void s() {
        Logger.i("LocalEcoBinderV2", "recordDevices mDeviceSN = " + this.c + "---mDeviceModel = " + this.f11275a);
        String strH = h();
        StringBuilder sb = new StringBuilder();
        sb.append("mBindDid = ");
        sb.append(this.d);
        Logger.d("DEVICE_DID", sb.toString());
        this.q.recordDevices(strH, this.f11275a, "", new Function1() { // from class: lu7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25436a.i((String) obj);
            }
        });
    }

    public final void t() {
        Logger.i("LocalEcoBinderV2", "recordToEcoServer");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.q.recordToEcoServer(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), this.f11276b, this.d, this.c, "跳绳", this.f11275a, "", jCurrentTimeMillis, "", jCurrentTimeMillis, jCurrentTimeMillis);
    }

    public final void u() {
        this.mCallback.onLocalBindSuccess(this.f11275a, this.d, this.f11276b, this.c, this.e, this.i);
        Logger.i("LocalEcoBinderV2", "start recordToServer");
        this.q.recordToServer(this.c, this.d, this.f11275a, new Function1() { // from class: ju7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return l.j((EcoLocalBindResult) obj);
            }
        }, new Function1() { // from class: ku7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return l.k((Exception) obj);
            }
        });
    }

    public final void v() {
        Logger.i("LocalEcoBinderV2", "start sendAppVerify called");
        this.e = EcoLocalBindTool.INSTANCE.generateAppDeviceId(this.f11276b, this.mUserId);
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 18;
        r90 r90Var = new r90();
        pa0 pa0Var = new pa0();
        pa0Var.c = this.e;
        pa0Var.d = this.f;
        r90Var.T(pa0Var);
        Logger.d("LocalEcoBinderV2sendAppVerify(),appDeviceId:" + this.e + " publickKey:" + ByteUtil.bytesToHexString(this.f), new Object[0]);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: gu7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f19330a.l(ecoApiResult);
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
        if (this.p == 3) {
            z();
        }
    }

    public final void w() {
        Logger.d("LocalEcoBinderV2", "start sendBindResult called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 25;
        r90 r90Var = new r90();
        rb0 rb0Var = new rb0();
        xa0 xa0Var = new xa0();
        xa0Var.c = this.mUserId;
        ec0 ec0Var = new ec0();
        ec0Var.c = 0;
        ec0Var.d = Build.VERSION.SDK_INT;
        ec0Var.e = Build.MODEL;
        xa0Var.d = ec0Var;
        rb0Var.c = iql.e(this.l, f.f, dsf.i(xa0Var), "bind-data".getBytes());
        r90Var.P(rb0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, true, new p.a() { // from class: iu7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f22095a.m(ecoApiResult);
            }
        });
    }

    public final void x() throws Exception {
        byte[] bArrA;
        Logger.d("LocalEcoBinderV2", "start sendConfirm called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 19;
        r90 r90Var = new r90();
        ma0 ma0Var = new ma0();
        if (TextUtils.isEmpty(this.o)) {
            bArrA = ucb.a(this.h, this.f11277k);
        } else {
            byte[] bytes = this.o.getBytes();
            byte[] bArr = this.f11277k;
            byte[] bArr2 = new byte[bArr.length + bytes.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(bytes, 0, bArr2, this.f11277k.length, bytes.length);
            bArrA = ucb.a(this.h, bArr2);
        }
        ma0Var.c = this.f11277k;
        ma0Var.d = bArrA;
        r90Var.S(ma0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: hu7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f20463a.n(ecoApiResult);
            }
        }, 15000);
    }

    public final void y(int i, int i2) {
        Logger.i("LocalEcoBinderV2", "sendErrorCode() called with: accountId = [" + i + "], errorCode = [" + i2 + "]");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = i;
        r90 r90Var = new r90();
        r90Var.R(i2);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, false, (p.a) null);
    }

    public final void z() {
        try {
            wrc wrcVar = this.mApiCall.mCallback;
            if (wrcVar != null) {
                wrcVar.showButtonConfirmDialog();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
