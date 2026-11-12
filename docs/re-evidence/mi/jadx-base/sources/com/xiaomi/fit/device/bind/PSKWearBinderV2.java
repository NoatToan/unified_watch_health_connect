package com.xiaomi.fit.device.bind;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.RemoteException;
import android.util.Base64;
import com.xiaomi.fit.device.bind.PSKWearBinderV2;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.ApiCallConfigImpl;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.wearable.ApplyBindInfo;
import com.xiaomi.wearable.BindResult;
import com.xiaomi.wearable.VerifyBindInfo;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.bb0;
import defpackage.cc0;
import defpackage.dsf;
import defpackage.eb0;
import defpackage.hb0;
import defpackage.iql;
import defpackage.jb0;
import defpackage.kj2;
import defpackage.om5;
import defpackage.p90;
import defpackage.pb0;
import defpackage.s7r;
import defpackage.ucb;
import defpackage.ya0;
import defpackage.z2h;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class PSKWearBinderV2 extends com.xiaomi.fit.device.bind.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11295b;
    public String c;
    public String d;
    public byte[] e;
    public String f;
    public String g;
    public byte[] h;
    public int i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BindToServer f11296k;
    public boolean l;

    public class a implements z2h {
        public a() {
        }

        @Override // defpackage.z2h
        public void onCanceled() {
            Logger.d("WearBinderV2", "onCancel() called oob");
            PSKWearBinderV2.this.G();
        }

        @Override // defpackage.z2h
        public void onConfirm() {
            Logger.i("WearBinderV2", "onConfirm() called oob");
            if (!PSKWearBinderV2.this.l || PSKWearBinderV2.this.h == null) {
                PSKWearBinderV2.this.l = true;
                return;
            }
            PSKWearBinderV2.this.mCallback.onBondSuccess();
            PSKWearBinderV2 pSKWearBinderV2 = PSKWearBinderV2.this;
            pSKWearBinderV2.K(pSKWearBinderV2.h);
        }
    }

    public PSKWearBinderV2(DeviceInfo deviceInfo) {
        super(deviceInfo);
        this.j = "U0WrPzABDoIaIaxn".getBytes();
        this.l = false;
        this.f11296k = ApiCallConfigImpl.INSTANCE;
    }

    public static /* synthetic */ Unit C(BindResult bindResult) {
        Logger.i("WearBinderV2", "onSendBindResultFailed: unbind success");
        return null;
    }

    public static /* synthetic */ Unit D(Exception exc) {
        Logger.i("WearBinderV2", "onSendBindResultFailed: unbind fail");
        return null;
    }

    private void H(int i, String str) {
        Logger.i("WearBinderV2", "onApplyBindFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        P(18, i);
        this.mCallback.onBindFailure(1010, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(String str) {
        this.mCallback.dismissOOB();
        this.mCallback.onBindFailure(1013, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str) {
        this.mCallback.onBindFailure(1009, str);
        this.f11296k.unbind(this.d, this.f11294a, new Function1() { // from class: sgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PSKWearBinderV2.C((BindResult) obj);
            }
        }, new Function1() { // from class: tgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PSKWearBinderV2.D((Exception) obj);
            }
        });
    }

    private void M(int i, String str) {
        Logger.i("WearBinderV2", "onVerifyDeviceFailed() called with: errorCode = [" + i + "], message = [" + str + "]");
        P(19, i);
        this.mCallback.onBindFailure(1012, str);
    }

    private void N() {
        Logger.i("WearBinderV2", "start sendBindResult called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 25;
        p90 p90Var = new p90();
        pb0 pb0Var = new pb0();
        hb0 hb0Var = new hb0();
        cc0 cc0Var = new cc0();
        cc0Var.c = 0;
        cc0Var.d = Build.VERSION.SDK_INT;
        cc0Var.e = Build.MODEL;
        cc0Var.h = 0;
        hb0Var.c = this.mUserId;
        hb0Var.d = cc0Var;
        pb0Var.c = iql.e(this.e, WearBinderV2.f, dsf.i(hb0Var), "bind-data".getBytes());
        p90Var.G(pb0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.mDeviceInfo.getAddress(), om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.PSKWearBinderV2.4
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (PSKWearBinderV2.this.isCancelled()) {
                    return;
                }
                if (!wearApiResult.d()) {
                    PSKWearBinderV2.this.L("sendBindResult apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (s7rVarB.I() && s7rVarB.o().y() && s7rVarB.o().r() != 0) {
                    PSKWearBinderV2.this.L("sendBindResult errorCode: " + s7rVarB.o().r());
                    return;
                }
                PSKWearBinderV2 pSKWearBinderV2 = PSKWearBinderV2.this;
                pSKWearBinderV2.mCallback.onBindSuccess(pSKWearBinderV2.f11294a, PSKWearBinderV2.this.d, PSKWearBinderV2.this.f11295b, PSKWearBinderV2.this.c);
                Logger.i("WearBinderV2", "onBindSuccess did = " + PSKWearBinderV2.this.d);
            }
        }, 15000);
    }

    private void P(int i, int i2) {
        Logger.i("WearBinderV2", "sendErrorCode() called with: accountId = [" + i + "], errorCode = [" + i2 + "]");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = i;
        p90 p90Var = new p90();
        p90Var.J(i2);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.mDeviceInfo.getAddress(), om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.PSKWearBinderV2.5
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
            }
        }, 15000);
    }

    public final /* synthetic */ Unit A(BindResult bindResult) {
        if (bindResult.isSuccess()) {
            Logger.i("WearBinderV2", "confirmBind success ");
            N();
            return null;
        }
        Logger.i("WearBinderV2", "confirmBind fail ");
        I(5, "result");
        return null;
    }

    public final /* synthetic */ Unit B(Exception exc) {
        Logger.i("WearBinderV2", "confirmBind fail message = " + exc.getMessage());
        I(5, exc.getMessage());
        return null;
    }

    public final /* synthetic */ Unit E(VerifyBindInfo verifyBindInfo) {
        Logger.i("WearBinderV2", "verifyDevice success");
        this.e = Base64.decode(verifyBindInfo.getDeviceKey(), 10);
        this.g = String.format(Locale.ENGLISH, "%06d", Integer.valueOf(verifyBindInfo.getOobCode()));
        try {
            O(verifyBindInfo.getBindKey().getBytes());
            return null;
        } catch (Exception e) {
            M(100, e.getMessage());
            return null;
        }
    }

    public final /* synthetic */ Unit F(Exception exc) {
        Logger.i("WearBinderV2", "verifyDevice fail message = " + exc.getMessage());
        M(100, "verifyDevice e = " + exc.getMessage());
        return null;
    }

    public final void G() {
        Logger.d("WearBinderV2", "onAppCancelled() called");
        WearApiTask wearApiTask = this.mApiTask;
        if (wearApiTask != null) {
            wearApiTask.cancel();
            this.mApiTask = null;
        }
        I(6, "app cancel");
    }

    public final void I(int i, String str) {
        P(25, i);
        this.mCallback.dismissOOB();
        this.mCallback.onBindFailure(1014, str);
    }

    public final void K(byte[] bArr) {
        this.mCallback.dismissOOB();
        Logger.i("WearBinderV2", "start confirmBind called");
        this.f11296k.confirmBind(LocaleUtil.getCurrentLocale(), this.f, this.d, Base64.encodeToString(bArr, 10), this.f11294a, new Function1() { // from class: qgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31504a.A((BindResult) obj);
            }
        }, new Function1() { // from class: rgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32521a.B((Exception) obj);
            }
        });
    }

    public final void O(byte[] bArr) throws Exception {
        Logger.i("WearBinderV2", "start sendConfirm() called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 19;
        p90 p90Var = new p90();
        ya0 ya0Var = new ya0();
        byte[] bArrK = iql.k(16);
        final byte[] bytes = this.g.getBytes();
        byte[] bArr2 = new byte[bArrK.length + bytes.length];
        System.arraycopy(bArrK, 0, bArr2, 0, bArrK.length);
        System.arraycopy(bytes, 0, bArr2, bArrK.length, bytes.length);
        byte[] bArrA = ucb.a(this.e, bArr2);
        ya0Var.c = bArrK;
        ya0Var.d = bArrA;
        ya0Var.e = bArr;
        p90Var.N(ya0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.mDeviceInfo.getAddress(), om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.PSKWearBinderV2.2
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) {
                if (PSKWearBinderV2.this.isCancelled()) {
                    return;
                }
                if (!wearApiResult.d()) {
                    PSKWearBinderV2.this.J("confirmOOB apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (s7rVarB.o().y()) {
                    int iR = s7rVarB.o().r();
                    if (iR == 6) {
                        PSKWearBinderV2.this.J("device cancelled");
                        return;
                    }
                    if (iR == 7) {
                        PSKWearBinderV2.this.J("verify app sign failed");
                        return;
                    }
                    PSKWearBinderV2.this.J("confirm errorCode: " + iR);
                    return;
                }
                if (!s7rVarB.o().B()) {
                    PSKWearBinderV2.this.J("not expected response for confirmOOB");
                    return;
                }
                bb0 bb0VarV = s7rVarB.o().v();
                byte[] bArr3 = bb0VarV.c;
                byte[] bArr4 = new byte[bArr3.length + bytes.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                byte[] bArr5 = bytes;
                System.arraycopy(bArr5, 0, bArr4, bb0VarV.c.length, bArr5.length);
                try {
                    if (!ByteUtil.equals(ucb.a(PSKWearBinderV2.this.e, bArr4), bb0VarV.d)) {
                        PSKWearBinderV2.this.I(7, "verify device sign failed");
                        return;
                    }
                    PSKWearBinderV2.this.h = bb0VarV.e;
                    if (!PSKWearBinderV2.this.l) {
                        PSKWearBinderV2.this.l = true;
                        return;
                    }
                    PSKWearBinderV2.this.mCallback.onBondSuccess();
                    PSKWearBinderV2 pSKWearBinderV2 = PSKWearBinderV2.this;
                    pSKWearBinderV2.K(pSKWearBinderV2.h);
                } catch (Exception e) {
                    e.printStackTrace();
                    PSKWearBinderV2.this.I(100, e.getMessage());
                }
            }
        }, 15000);
        int i = this.i;
        if (i == 1) {
            Q();
        } else if (i == 3) {
            this.l = true;
        } else if (i == 0) {
            this.l = true;
        }
    }

    public final void Q() {
        Logger.i("WearBinderV2", "showOOB: " + this);
        this.mCallback.showOOB(this.g, new a());
    }

    @SuppressLint({"DefaultLocale"})
    public final void R(byte[] bArr, byte[] bArr2) {
        Logger.i("WearBinderV2", "start verifyDevice called ");
        this.f11296k.verifyBind(this.f, this.d, Base64.encodeToString(bArr, 10), Base64.encodeToString(bArr2, 10), this.f11294a, new Function1() { // from class: ugh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35739a.E((VerifyBindInfo) obj);
            }
        }, new Function1() { // from class: vgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36876a.F((Exception) obj);
            }
        });
    }

    public final void S(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Logger.i("WearBinderV2", "start verifyServer called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 18;
        p90 p90Var = new p90();
        jb0 jb0Var = new jb0();
        jb0Var.c = bArr;
        jb0Var.d = bArr2;
        jb0Var.e = bArr3;
        p90Var.O(jb0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.mDeviceInfo.getAddress(), om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.PSKWearBinderV2.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (PSKWearBinderV2.this.isCancelled()) {
                    return;
                }
                if (!wearApiResult.d()) {
                    PSKWearBinderV2.this.mCallback.onBindFailure(1011, "verifyServer apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (!s7rVarB.o().y()) {
                    if (!s7rVarB.o().C()) {
                        PSKWearBinderV2.this.mCallback.onBindFailure(1011, "not expected response for verifyServer");
                        return;
                    } else {
                        eb0 eb0VarW = s7rVarB.o().w();
                        PSKWearBinderV2.this.R(eb0VarW.c, eb0VarW.d);
                        return;
                    }
                }
                int iR = s7rVarB.o().r();
                if (iR == 7) {
                    PSKWearBinderV2.this.mCallback.onBindFailure(1011, "verify server signature failed");
                    return;
                }
                PSKWearBinderV2.this.mCallback.onBindFailure(1011, "verifyServer errorCode: " + iR);
            }
        }, 15000);
    }

    public void x(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, kj2 kj2Var) {
        Logger.i("WearBinderV2", "bindHello() called");
        this.f11294a = str;
        this.f11295b = str2;
        this.c = str5;
        this.d = str6;
        this.i = i;
        this.mCallback = kj2Var;
        String uniqueIdentify = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
        Logger.i("WearBinderV2", "applyBind: phoneId = " + uniqueIdentify);
        this.f11296k.applyBind(i2, str, str2, str3, uniqueIdentify, str4, str5, str6, bArr, new Function1() { // from class: wgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37944a.y((ApplyBindInfo) obj);
            }
        }, new Function1() { // from class: xgh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39098a.z((Exception) obj);
            }
        });
    }

    public final /* synthetic */ Unit y(ApplyBindInfo applyBindInfo) {
        Logger.i("WearBinderV2", "bind hello result success");
        this.f = applyBindInfo.getBindIndex();
        this.d = applyBindInfo.getBindDid();
        S(Base64.decode(applyBindInfo.getServerPublicKey(), 10), Base64.decode(applyBindInfo.getServerSign(), 10), Base64.decode(applyBindInfo.getServerRandom(), 10));
        return null;
    }

    public final /* synthetic */ Unit z(Exception exc) {
        Logger.i("WearBinderV2", "bind hello fail message: " + exc.getMessage());
        H(5, "bind hello error = " + exc.getMessage());
        return null;
    }
}
