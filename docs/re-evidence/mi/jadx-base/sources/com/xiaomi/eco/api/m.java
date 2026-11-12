package com.xiaomi.eco.api;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import android.util.Base64;
import com.google.gson.Gson;
import com.xiaomi.eco.EcoApplyBindInfo;
import com.xiaomi.eco.EcoBindResult;
import com.xiaomi.eco.EcoVerifyBindInfo;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.m;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import defpackage.ab0;
import defpackage.ch7;
import defpackage.csc;
import defpackage.db0;
import defpackage.dsf;
import defpackage.gb0;
import defpackage.ib0;
import defpackage.iql;
import defpackage.lb0;
import defpackage.qu6;
import defpackage.r90;
import defpackage.rb0;
import defpackage.u7r;
import defpackage.ucb;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11279b;
    public String c;
    public String d;
    public byte[] e;
    public String f;
    public String g;
    public byte[] h;
    public int i;
    public EcoBindToServer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11280k;

    public class a extends csc.a {
        public a() {
        }

        @Override // defpackage.csc
        public void onCancel() throws RemoteException {
            Logger.d("PSKEcoBinderV2", "onCancel() called oob");
            m.this.D();
        }

        @Override // defpackage.csc
        public void onConfirm() throws RemoteException {
            Logger.i("PSKEcoBinderV2", "onConfirm() called oob");
            if (!m.this.f11280k || m.this.h == null) {
                m.this.f11280k = true;
                return;
            }
            m.this.mCallback.onBondSuccess();
            m mVar = m.this;
            mVar.H(mVar.h);
        }
    }

    public m(String str, com.xiaomi.eco.api.a aVar) {
        super(str, aVar);
        this.f11280k = false;
        this.j = (EcoBindToServer) EcoApiCallManager.get().mEcoApiCallConfig;
    }

    private void E(int i, String str) {
        Logger.i("PSKEcoBinderV2", "onApplyBindFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        M(18, i);
        this.mCallback.onBindFailure(1010, str);
    }

    private void G(String str) {
        Logger.i("PSKEcoBinderV2", "onDeviceConfirmFailed message : " + str);
        r();
        this.mCallback.onBindFailure(1013, str);
    }

    private void I(String str) {
        this.mCallback.onBindFailure(1009, str);
        this.j.unbind(this.d, this.f11278a, new Function1() { // from class: gv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m.x((EcoBindResult) obj);
            }
        }, new Function1() { // from class: hv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return m.w((Exception) obj);
            }
        });
    }

    private void J(int i, String str) {
        Logger.i("PSKEcoBinderV2", "onVerifyDeviceFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        M(19, i);
        this.mCallback.onBindFailure(1012, str);
    }

    private void K() {
        Logger.i("PSKEcoBinderV2", "start sendBindResult called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 25;
        r90 r90Var = new r90();
        rb0 rb0Var = new rb0();
        ib0 ib0Var = new ib0();
        ib0Var.c = this.mUserId;
        rb0Var.c = iql.e(this.e, f.f, dsf.i(ib0Var), "bind-data".getBytes());
        r90Var.P(rb0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, true, new p.a() { // from class: ev7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f17095a.y(ecoApiResult);
            }
        });
    }

    private void M(int i, int i2) {
        Logger.i("PSKEcoBinderV2", "sendErrorCode() called with: accountId = [" + i + "], errorCode = [" + i2 + "]");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = i;
        r90 r90Var = new r90();
        r90Var.R(i2);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, false, (p.a) null);
    }

    public static /* synthetic */ Unit w(Exception exc) {
        Logger.i("PSKEcoBinderV2", "onSendBindResultFailed: unbind fail");
        return null;
    }

    public static /* synthetic */ Unit x(EcoBindResult ecoBindResult) {
        Logger.i("PSKEcoBinderV2", "onSendBindResultFailed: unbind success");
        return null;
    }

    public final /* synthetic */ Unit A(EcoVerifyBindInfo ecoVerifyBindInfo) {
        Logger.i("PSKEcoBinderV2", "verifyDevice success");
        this.e = Base64.decode(ecoVerifyBindInfo.getDeviceKey(), 10);
        this.g = String.format(Locale.ENGLISH, "%06d", Integer.valueOf(ecoVerifyBindInfo.getOobCode()));
        try {
            L(ecoVerifyBindInfo.getBindKey().getBytes());
            return null;
        } catch (Exception e) {
            J(100, e.getMessage());
            return null;
        }
    }

    public final /* synthetic */ Unit B(Exception exc) {
        Logger.i("PSKEcoBinderV2", "verifyDevice fail message = " + exc.getMessage());
        J(100, "verifyDevice e = " + exc.getMessage());
        return null;
    }

    public final /* synthetic */ void C(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            this.mCallback.onBindFailure(1011, "verifyServer apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().D()) {
            if (!ecoApiResult.e().o().H()) {
                this.mCallback.onBindFailure(1011, "not expected response for verifyServer");
                return;
            } else {
                gb0 gb0VarX = ecoApiResult.e().o().x();
                O(gb0VarX.c, gb0VarX.d);
                return;
            }
        }
        int iT = ecoApiResult.e().o().t();
        if (iT == 7) {
            this.mCallback.onBindFailure(1011, "verify server signature failed");
            return;
        }
        this.mCallback.onBindFailure(1011, "verifyServer errorCode: " + iT);
    }

    public final void D() {
        Logger.d("PSKEcoBinderV2", "onAppCancelled() called");
        b bVar = this.mApiTask;
        if (bVar != null) {
            bVar.a();
            this.mApiTask = null;
        }
        F(6, "app cancel");
    }

    public final void F(int i, String str) {
        M(25, i);
        r();
        this.mCallback.onBindFailure(1014, str);
    }

    public final void H(byte[] bArr) {
        r();
        Logger.i("PSKEcoBinderV2", "start confirmBind called");
        this.j.confirmBind(LocaleUtil.getCurrentLocale(), this.f, this.d, Base64.encodeToString(bArr, 10), this.f11278a, new Function1() { // from class: ov7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29720a.u((EcoBindResult) obj);
            }
        }, new Function1() { // from class: fv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18282a.v((Exception) obj);
            }
        });
    }

    public final void L(byte[] bArr) throws Exception {
        Logger.i("PSKEcoBinderV2", "start sendConfirm() called bindKey = [" + ByteUtil.byteToString(bArr) + "]");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 19;
        r90 r90Var = new r90();
        ab0 ab0Var = new ab0();
        byte[] bArrK = iql.k(16);
        final byte[] bytes = this.g.getBytes();
        byte[] bArr2 = new byte[bArrK.length + bytes.length];
        System.arraycopy(bArrK, 0, bArr2, 0, bArrK.length);
        System.arraycopy(bytes, 0, bArr2, bArrK.length, bytes.length);
        byte[] bArrA = ucb.a(this.e, bArr2);
        ab0Var.c = bArrK;
        ab0Var.d = bArrA;
        ab0Var.e = bArr;
        r90Var.U(ab0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: nv7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f28469a.z(bytes, ecoApiResult);
            }
        }, 60000);
        int i = this.i;
        if (i == 1) {
            N();
            return;
        }
        if (i != 3) {
            if (i == 0) {
                this.f11280k = true;
            }
        } else {
            this.f11280k = true;
            if (qu6.b(this.f11278a)) {
                N();
            }
        }
    }

    public final void N() {
        if (this.mApiCall.isBindAbandon()) {
            D();
            return;
        }
        try {
            Logger.i("PSKEcoBinderV2", "showOOB: " + this);
            this.mApiCall.mCallbackProxy.t(this.g, new a());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final void O(byte[] bArr, byte[] bArr2) {
        Logger.i("PSKEcoBinderV2", "start verifyDevice called ");
        this.j.verifyBind(this.f, this.d, Base64.encodeToString(bArr, 10), Base64.encodeToString(bArr2, 10), this.f11278a, new Function1() { // from class: lv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25463a.A((EcoVerifyBindInfo) obj);
            }
        }, new Function1() { // from class: mv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27247a.B((Exception) obj);
            }
        });
    }

    public final void P(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Logger.i("PSKEcoBinderV2", "start verifyServer called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 18;
        r90 r90Var = new r90();
        lb0 lb0Var = new lb0();
        lb0Var.c = bArr;
        lb0Var.d = bArr2;
        lb0Var.e = bArr3;
        r90Var.V(lb0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, true, new p.a() { // from class: kv7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f24326a.C(ecoApiResult);
            }
        });
    }

    public void q(int i, int i2, String str, String str2, String str3, String str4, byte[] bArr, ch7 ch7Var) {
        Logger.i("PSKEcoBinderV2", "bindHello() called");
        this.f11278a = str;
        this.f11279b = str2;
        this.c = str3;
        this.d = str4;
        this.i = i;
        this.mCallback = ch7Var;
        this.j.applyBind(i2, str, str2, "", "", str3, str4, bArr, new Function1() { // from class: iv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22123a.s((EcoApplyBindInfo) obj);
            }
        }, new Function1() { // from class: jv7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23168a.t((Exception) obj);
            }
        });
    }

    public final void r() {
        try {
            this.mApiCall.mCallbackProxy.dismissOOB();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ Unit s(EcoApplyBindInfo ecoApplyBindInfo) {
        Logger.i("PSKEcoBinderV2", "bind hello result success");
        this.f = ecoApplyBindInfo.getBindIndex();
        this.d = ecoApplyBindInfo.getBindDid();
        P(Base64.decode(ecoApplyBindInfo.getServerPublicKey(), 10), Base64.decode(ecoApplyBindInfo.getServerSign(), 10), Base64.decode(ecoApplyBindInfo.getServerRandom(), 10));
        return null;
    }

    public final /* synthetic */ Unit t(Exception exc) {
        Logger.i("PSKEcoBinderV2", "bind hello fail message: " + exc.getMessage());
        E(5, "bind hello error = " + exc.getMessage());
        return null;
    }

    public final /* synthetic */ Unit u(EcoBindResult ecoBindResult) {
        if (ecoBindResult.isSuccess()) {
            Logger.i("PSKEcoBinderV2", "confirmBind success ");
            K();
            return null;
        }
        Logger.i("PSKEcoBinderV2", "confirmBind fail ");
        F(5, "result");
        return null;
    }

    public final /* synthetic */ Unit v(Exception exc) {
        Logger.i("PSKEcoBinderV2", "confirmBind fail message = " + exc.getMessage());
        F(5, exc.getMessage());
        return null;
    }

    public final /* synthetic */ void y(EcoApiResult ecoApiResult) {
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            I("sendBindResult apiCode: " + ecoApiResult.a());
            return;
        }
        if (ecoApiResult.e().v() && ecoApiResult.e().o().D() && ecoApiResult.e().o().t() != 0) {
            I("sendBindResult errorCode: " + ecoApiResult.e().o().t());
            return;
        }
        this.mApiCall.updateDid(this.d);
        this.mCallback.onBindSuccess(this.f11278a, this.d, this.f11279b, this.c);
        Logger.i("PSKEcoBinderV2", "onBindSuccess did = " + this.d);
    }

    public final /* synthetic */ void z(byte[] bArr, EcoApiResult ecoApiResult) {
        Logger.i("PSKEcoBinderV2", "result : " + new Gson().toJson(ecoApiResult));
        if (isCancelled()) {
            return;
        }
        if (!ecoApiResult.f()) {
            G("confirmOOB apiCode: " + ecoApiResult.a());
            return;
        }
        if (ecoApiResult.e().o().D()) {
            int iT = ecoApiResult.e().o().t();
            if (iT == 6) {
                G("device cancelled");
                return;
            }
            if (iT == 7) {
                G("verify app sign failed");
                return;
            }
            G("confirm errorCode: " + iT);
            return;
        }
        if (!ecoApiResult.e().o().G()) {
            G("not expected response for confirmOOB");
            return;
        }
        db0 db0VarW = ecoApiResult.e().o().w();
        byte[] bArr2 = db0VarW.c;
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, db0VarW.c.length, bArr.length);
        try {
            if (!ByteUtil.equals(ucb.a(this.e, bArr3), db0VarW.d)) {
                F(7, "verify device sign failed");
                return;
            }
            this.h = db0VarW.e;
            if (!this.f11280k) {
                this.f11280k = true;
            } else {
                this.mCallback.onBondSuccess();
                H(this.h);
            }
        } catch (Exception e) {
            e.printStackTrace();
            F(100, e.getMessage());
        }
    }
}
