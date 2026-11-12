package com.xiaomi.eco.api;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import android.util.Base64;
import com.google.gson.Gson;
import com.xiaomi.eco.EcoBindResult;
import com.xiaomi.eco.EcoVerifyBindInfo;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.n;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.ch7;
import defpackage.jc0;
import defpackage.kc0;
import defpackage.lc0;
import defpackage.r90;
import defpackage.u7r;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class n extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserInfoManager f11282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11283b;
    public String c;
    public String d;
    public byte[] e;
    public String f;
    public int g;
    public EcoBindToServer h;
    public EcoVerifyBindInfo i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11284k;
    public String l;
    public String m;
    public boolean n;

    public interface a {
        UserInfoManager getUserInfoManager();
    }

    public n(String str, String str2, i iVar) {
        super(str2, iVar);
        this.n = false;
        this.f11284k = str;
        this.f11282a = ((a) EntryPointAccessors.fromApplication(AppUtil.getApp(), a.class)).getUserInfoManager();
        this.h = (EcoBindToServer) EcoApiCallManager.get().mEcoApiCallConfig;
    }

    private void j() {
        try {
            this.mApiCall.mCallbackProxy.dismissOOB();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit l(Exception exc) {
        Logger.i("PSKEcoBinderV3ForShareBind", "confirmShareBind fail message = " + exc.getMessage());
        t(5, exc.getMessage());
        return null;
    }

    public static /* synthetic */ Unit m(EcoBindResult ecoBindResult) {
        Logger.i("PSKEcoBinderV3ForShareBind", "onSendBindResultFailed: unbind success");
        return null;
    }

    public static /* synthetic */ Unit n(Exception exc) {
        Logger.i("PSKEcoBinderV3ForShareBind", "onSendBindResultFailed: unbind fail");
        return null;
    }

    private void t(int i, String str) {
        z(25, i);
        j();
        this.mCallback.onBindFailure(1014, str);
    }

    private void u(String str) {
        j();
        this.mCallback.onBindFailure(1013, str);
    }

    private void w(String str) {
        Logger.e("PSKEcoBinderV3ForShareBind", "onSendBindResultFailed, message = " + str);
        this.mCallback.onBindFailure(1009, str);
        this.h.unbind(this.d, this.f11283b, new Function1() { // from class: wv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.m((EcoBindResult) obj);
            }
        }, new Function1() { // from class: xv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.n((Exception) obj);
            }
        });
    }

    private void x(int i, String str) {
        Logger.i("PSKEcoBinderV3ForShareBind", "onVerifyDeviceFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        z(19, i);
        this.mCallback.onBindFailure(1012, str);
    }

    private void z(int i, int i2) {
        Logger.i("PSKEcoBinderV3ForShareBind", "sendErrorCode() called with: accountId = [" + i + "], errorCode = [" + i2 + "]");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = i;
        r90 r90Var = new r90();
        r90Var.R(i2);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, false, (p.a) null);
    }

    public final void A(final EcoVerifyBindInfo ecoVerifyBindInfo, final String str) {
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareStart() called verifyBindInfo = " + ecoVerifyBindInfo);
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 32;
        r90 r90Var = new r90();
        final jc0 jc0Var = new jc0();
        jc0Var.e = this.j;
        jc0Var.d = this.f11282a.getUserId();
        jc0Var.c = this.l;
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareStart() called ShareID = " + new Gson().toJson(jc0Var));
        r90Var.W(jc0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: rv7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f32938a.p(ecoVerifyBindInfo, jc0Var, str, ecoApiResult);
            }
        }, 15000);
        int i = this.g;
        if (i == 1) {
            return;
        }
        if (i == 3) {
            this.n = true;
        } else if (i == 0) {
            this.n = true;
        }
    }

    public final void B(EcoVerifyBindInfo ecoVerifyBindInfo, final jc0 jc0Var, final String str) {
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareDevKey = " + ecoVerifyBindInfo.getDeviceKey());
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareTokenKey = " + ecoVerifyBindInfo.getShaTokenKey());
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareSignData = " + ecoVerifyBindInfo.getSignShareData());
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareEncData = " + ecoVerifyBindInfo.getEncShareData());
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 33;
        r90 r90Var = new r90();
        lc0 lc0Var = new lc0();
        lc0Var.c = ByteUtil.hexStringToBytes(ecoVerifyBindInfo.getDeviceKey());
        lc0Var.d = ByteUtil.hexStringToBytes(ecoVerifyBindInfo.getShaTokenKey());
        lc0Var.e = ByteUtil.hexStringToBytes(ecoVerifyBindInfo.getSignShareData());
        lc0Var.f = ByteUtil.hexStringToBytes(ecoVerifyBindInfo.getEncShareData());
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareDevKey.length = " + ByteUtil.bytesToHexString(lc0Var.c));
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareTokenKey.length = " + lc0Var.d.length + ", serverShareTokenKey = " + ByteUtil.bytesToHexString(lc0Var.d));
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareSignData.length = " + lc0Var.e.length + ", serverShareSignData = " + ByteUtil.bytesToHexString(lc0Var.e));
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendShareVerify() called serverShareEncData.length = " + lc0Var.f.length + ", serverShareEncData = " + ByteUtil.bytesToHexString(lc0Var.f));
        r90Var.Y(lc0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: sv7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f34016a.q(jc0Var, str, ecoApiResult);
            }
        }, 15000);
    }

    @SuppressLint({"DefaultLocale"})
    public void C(byte[] bArr, byte[] bArr2, String str, String str2, final String str3, String str4, ch7 ch7Var) {
        this.j = Integer.parseInt(str);
        this.l = str2;
        this.m = str4;
        this.d = str3;
        this.mCallback = ch7Var;
        Logger.i("PSKEcoBinderV3ForShareBind", "start verifyDevice called ");
        this.h.verifyShareBind(str, new Function1() { // from class: pv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f30821a.r(str3, (EcoVerifyBindInfo) obj);
            }
        }, new Function1() { // from class: qv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f31876a.s((Exception) obj);
            }
        });
    }

    public final /* synthetic */ Unit k(String str, EcoBindResult ecoBindResult) {
        if (ecoBindResult.isSuccess()) {
            Logger.i("PSKEcoBinderV3ForShareBind", "confirmShareBind success ");
            y(str);
            return null;
        }
        Logger.i("PSKEcoBinderV3ForShareBind", "confirmShareBind fail ");
        t(5, "result");
        return null;
    }

    public final /* synthetic */ void o(String str, EcoApiResult ecoApiResult) {
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendBindResultToFirmware() called result = " + new Gson().toJson(ecoApiResult));
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            w("sendBindResultToFirmware apiCode: " + ecoApiResult.c());
            return;
        }
        u7r u7rVarE = ecoApiResult.e();
        r90 r90VarO = u7rVarE.o();
        if (!u7rVarE.v() || r90VarO == null) {
            w("sendBindResultToFirmware resultPacket.hasAccount() == false");
            return;
        }
        if (r90VarO.I()) {
            kc0 kc0VarY = r90VarO.y();
            if (kc0VarY.d != 1 && kc0VarY.c.f != 1) {
                w("sendBindResultToFirmware shareResult.sharedStatus != 1");
                return;
            }
            this.mApiCall.updateDid(str);
            this.mCallback.onBindSuccess(this.m, str, this.f11284k, this.c);
            Logger.i("PSKEcoBinderV3ForShareBind", "sendBindResultToFirmware, onBindSuccess did = " + str);
        }
    }

    public final /* synthetic */ void p(EcoVerifyBindInfo ecoVerifyBindInfo, jc0 jc0Var, String str, EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            if (ecoApiResult.a() == -1) {
                u("sendShareStart timeout");
                return;
            }
            u("sendShareStart failed: " + ecoApiResult);
            return;
        }
        if (ecoApiResult.e().o().D()) {
            int iT = ecoApiResult.e().o().t();
            if (iT == 0) {
                B(ecoVerifyBindInfo, jc0Var, str);
                return;
            }
            u("sendShareStart, errorCode: " + iT);
        }
    }

    public final /* synthetic */ void q(jc0 jc0Var, String str, EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            u("sendShareVerify apiCode: " + ecoApiResult.c());
            return;
        }
        if (ecoApiResult.e().o().D()) {
            int iT = ecoApiResult.e().o().t();
            if (iT == 0) {
                this.mCallback.onBondSuccess();
                v(jc0Var, str);
            } else {
                u("sendShareVerify errorCode: " + iT);
            }
        }
    }

    public final /* synthetic */ Unit r(String str, EcoVerifyBindInfo ecoVerifyBindInfo) {
        Logger.i("PSKEcoBinderV3ForShareBind", "verifyDevice success");
        this.i = ecoVerifyBindInfo;
        this.e = Base64.decode(ecoVerifyBindInfo.getDeviceKey(), 10);
        this.f = String.format(Locale.ENGLISH, "%06d", Integer.valueOf(ecoVerifyBindInfo.getOobCode()));
        try {
            A(ecoVerifyBindInfo, str);
            return null;
        } catch (Exception e) {
            x(100, e.getMessage());
            return null;
        }
    }

    public final /* synthetic */ Unit s(Exception exc) {
        Logger.i("PSKEcoBinderV3ForShareBind", "verifyDevice fail message = " + exc.getMessage());
        x(100, "verifyDevice e = " + exc.getMessage());
        return null;
    }

    public final void v(jc0 jc0Var, final String str) {
        j();
        Logger.i("PSKEcoBinderV3ForShareBind", "start onDeviceConfirmSuccess called");
        this.h.confirmShareBind(String.valueOf(jc0Var.e), this.d, new Function1() { // from class: tv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f35098a.k(str, (EcoBindResult) obj);
            }
        }, new Function1() { // from class: uv7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f36181a.l((Exception) obj);
            }
        });
    }

    public final void y(final String str) {
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendBindResultToFirmware called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 34;
        r90 r90Var = new r90();
        kc0 kc0Var = new kc0();
        kc0Var.d = 0;
        jc0 jc0Var = new jc0();
        jc0Var.c = this.l;
        jc0Var.d = this.f11282a.getUserId();
        jc0Var.e = this.j;
        kc0Var.c = jc0Var;
        r90Var.X(kc0Var);
        u7rVar.z(r90Var);
        Logger.i("PSKEcoBinderV3ForShareBind", "start sendBindResultToFirmware() called packet = " + new Gson().toJson(u7rVar));
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: vv7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f37263a.o(str, ecoApiResult);
            }
        }, 15000);
    }
}
