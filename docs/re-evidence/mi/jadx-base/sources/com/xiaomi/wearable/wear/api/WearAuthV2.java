package com.xiaomi.wearable.wear.api;

import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.wearable.core.ConnectTrackerKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.utils.ByteUtil;
import defpackage.ca0;
import defpackage.dc0;
import defpackage.dsf;
import defpackage.iql;
import defpackage.me4;
import defpackage.pm5;
import defpackage.q90;
import defpackage.t7r;
import defpackage.t90;
import defpackage.ucb;
import defpackage.w6r;
import defpackage.w90;
import defpackage.z90;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class WearAuthV2 extends w6r {
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f14453k;
    public byte[] l;
    public byte[] m;
    public final String n;
    public final String o;

    public WearAuthV2(String str, byte[] bArr, String str2, String str3, boolean z, WearApiCall wearApiCall, int i) {
        super(str, bArr, z, wearApiCall, i, str2);
        this.o = str2;
        this.n = str3;
    }

    @Override // defpackage.w6r
    public void c(me4 me4Var) {
        super.c(me4Var);
    }

    public void h(byte[] bArr, byte[] bArr2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CoreExtKt.logger.i("WearAuth", "start sendAppConfirm");
        t7r t7rVar = new t7r();
        t7rVar.e = 1;
        t7rVar.f = 27;
        q90 q90Var = new q90();
        t90 t90Var = new t90();
        t90Var.c = bArr;
        t90Var.d = bArr2;
        CoreExtKt.logger.d("WearAuth", "_encryptCompanionDevice:" + ByteUtil.byteToString(bArr2));
        q90Var.w(t90Var);
        t7rVar.s(q90Var);
        this.c.call(100, dsf.i(t7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.wearable.wear.api.WearAuthV2.2
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (WearAuthV2.this.b()) {
                    return;
                }
                ConnectTrackerKt.trackConnectTime("sendAppConfirm", System.currentTimeMillis() - jCurrentTimeMillis);
                CoreExtKt.logger.i("WearAuth", "sendAppConfirm result = " + wearApiResult.d() + ", cost = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f));
                if (!wearApiResult.d()) {
                    WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppConfirm apiCode: " + wearApiResult.a());
                    return;
                }
                t7r t7rVarA = pm5.a(wearApiResult.c());
                if (t7rVarA == null) {
                    return;
                }
                if (!t7rVarA.o().s()) {
                    WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "not expected response for sendAppConfirm code = " + t7rVarA.p());
                    return;
                }
                z90 z90VarO = t7rVarA.o().o();
                CoreExtKt.logger.i("WearAuth", "WearAuth deviceConfirm.deviceCapability = " + z90VarO.d + ", deviceCapabilityV2 = " + z90VarO.e);
                if (!z90VarO.c) {
                    WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "device confirm failed");
                    return;
                }
                WearAuthV2.this.c.setDeviceCapability(z90VarO.d);
                WearAuthV2.this.c.setDeviceCapabilityV2(z90VarO.e);
                WearAuthV2 wearAuthV2 = WearAuthV2.this;
                ((CipherApiCall) wearAuthV2.c).updateKeys(wearAuthV2.j, WearAuthV2.this.f14453k, WearAuthV2.this.l, WearAuthV2.this.m);
                WearAuthV2.this.g.b(2004, "device ready");
            }
        }, 15000);
    }

    public void i() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CoreExtKt.logger.i("WearAuth", "start sendAppVerify");
        t7r t7rVar = new t7r();
        t7rVar.e = 1;
        t7rVar.f = 26;
        q90 q90Var = new q90();
        w90 w90Var = new w90();
        final byte[] bArrK = iql.k(16);
        w90Var.c = bArrK;
        CoreExtKt.logger.d("WearAuth", "_Token:" + ByteUtil.byteToString(this.f37672b));
        String str = this.o;
        if (str != null) {
            w90Var.d = str;
            w90Var.e = true ^ TextUtils.isEmpty(this.n);
        }
        q90Var.x(w90Var);
        t7rVar.s(q90Var);
        this.c.call(100, dsf.i(t7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.wearable.wear.api.WearAuthV2.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) throws RemoteException {
                if (WearAuthV2.this.b()) {
                    return;
                }
                ConnectTrackerKt.trackConnectTime("sendAppVerify", System.currentTimeMillis() - jCurrentTimeMillis);
                CoreExtKt.logger.i("WearAuth", "sendAppVerify result = " + wearApiResult.d() + " cost = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f));
                if (!wearApiResult.d()) {
                    WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppVerify apiCode: " + wearApiResult.a());
                    return;
                }
                t7r t7rVarA = pm5.a(wearApiResult.c());
                if (t7rVarA == null) {
                    return;
                }
                if (!t7rVarA.o().u()) {
                    if (!t7rVarA.o().t()) {
                        WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "not expected response for sendAppVerify");
                        return;
                    } else {
                        ca0 ca0VarP = t7rVarA.o().p();
                        WearAuthV2.this.j(bArrK, ca0VarP.c, ca0VarP.d);
                        return;
                    }
                }
                int iQ = t7rVarA.o().q();
                if (iQ == 4) {
                    WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_NOT_EXIST, "device not bound");
                    return;
                }
                WearAuthV2.this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppVerify errorCode: " + iQ);
            }
        }, 15000);
    }

    public void j(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        CoreExtKt.logger.i("WearAuth", "start verify");
        byte[] bArr5 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        byte[] bArrI = iql.i("miwear-auth", this.f37672b, bArr5);
        byte[] bArr6 = new byte[16];
        this.j = bArr6;
        this.f14453k = new byte[16];
        this.l = new byte[4];
        this.m = new byte[4];
        System.arraycopy(bArrI, 0, bArr6, 0, 16);
        System.arraycopy(bArrI, 16, this.f14453k, 0, 16);
        System.arraycopy(bArrI, 32, this.l, 0, 4);
        System.arraycopy(bArrI, 36, this.m, 0, 4);
        CoreExtKt.logger.d("WearAuth", "_DeviceKey:" + ByteUtil.byteToString(this.j));
        CoreExtKt.logger.d("WearAuth", "_DeviceIV:" + ByteUtil.byteToString(this.l));
        CoreExtKt.logger.d("WearAuth", "_AppKey:" + ByteUtil.byteToString(this.f14453k));
        CoreExtKt.logger.d("WearAuth", "_AppIV:" + ByteUtil.byteToString(this.m));
        try {
            if (TextUtils.isEmpty(this.n)) {
                bArr4 = new byte[bArr.length + bArr2.length];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                System.arraycopy(bArr, 0, bArr4, bArr2.length, bArr.length);
            } else {
                byte[] bytes = this.n.getBytes();
                byte[] bArr7 = new byte[bArr.length + bArr2.length + bytes.length];
                System.arraycopy(bArr2, 0, bArr7, 0, bArr2.length);
                System.arraycopy(bArr, 0, bArr7, bArr2.length, bArr.length);
                System.arraycopy(bytes, 0, bArr7, bArr2.length + bArr.length, bytes.length);
                bArr4 = bArr7;
            }
            CoreExtKt.logger.d("WearAuth", "_RandomApp:" + ByteUtil.byteToString(bArr));
            CoreExtKt.logger.d("WearAuth", "_RandomDevice:" + ByteUtil.byteToString(bArr2));
            CoreExtKt.logger.d("WearAuth", "_message:" + ByteUtil.byteToString(bArr4));
            byte[] bArrA = ucb.a(this.j, bArr4);
            CoreExtKt.logger.d("WearAuth", "_sign:" + ByteUtil.byteToString(bArrA));
            CoreExtKt.logger.d("WearAuth", "_deviceSign:" + ByteUtil.byteToString(bArr3));
            if (!ByteUtil.equals(bArrA, bArr3)) {
                CoreExtKt.logger.d("WearAuth", "verify device confirm failed");
                this.g.b(CommonConstants.Mgc.PUB_KEY_NOT_EXIST, "verify device confirm failed");
                return;
            }
            CoreExtKt.logger.i("WearAuth", "verify sign success cost = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f));
            CoreExtKt.logger.d("WearAuth", "_AppKey" + ByteUtil.byteToString(this.f14453k));
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
            byte[] bArrA2 = ucb.a(this.f14453k, bArr4);
            CoreExtKt.logger.d("WearAuth", "_SignApp" + ByteUtil.byteToString(bArrA2));
            dc0 dc0Var = new dc0();
            dc0Var.c = 0;
            dc0Var.d = (float) Build.VERSION.SDK_INT;
            dc0Var.e = Build.MODEL;
            dc0Var.f = this.c.getDeviceInfo().getRegion();
            dc0Var.h = this.c.getAppCapability();
            CoreExtKt.logger.i("WearAuth", "capability:" + this.c.getAppCapability() + " region " + dc0Var.f);
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(this.m);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            h(bArrA2, iql.d(this.f14453k, byteBufferOrder.array(), dsf.i(dc0Var)));
        } catch (Exception e) {
            e.printStackTrace();
            this.g.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, e.getMessage());
        }
    }
}
