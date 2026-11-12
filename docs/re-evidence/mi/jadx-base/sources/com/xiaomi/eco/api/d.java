package com.xiaomi.eco.api;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import defpackage.da0;
import defpackage.dsf;
import defpackage.ec0;
import defpackage.ht2;
import defpackage.ic0;
import defpackage.iql;
import defpackage.qd7;
import defpackage.qj7;
import defpackage.qu6;
import defpackage.r90;
import defpackage.u7r;
import defpackage.u90;
import defpackage.ucb;
import defpackage.x90;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends qd7 {
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f11246k;
    public final String l;
    public final String m;
    public boolean n;

    public class a implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11247a;

        public a(long j) {
            this.f11247a = j;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r5) {
            if (d.this.c()) {
                return;
            }
            Logger.i("EcoAuthV2", "enableNotification success cost = " + ((System.currentTimeMillis() - this.f11247a) / 1000.0f));
            d.this.n();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            if (d.this.c()) {
                return;
            }
            Logger.i("EcoAuthV2", "enableNotification fail");
            d.this.e.b(2003, "enable notifications failed");
        }
    }

    public d(String str, boolean z, byte[] bArr, String str2, String str3, i iVar) {
        super(str, bArr, iVar);
        this.m = str2;
        this.n = z;
        this.l = str3;
    }

    @Override // defpackage.qd7
    public void d(qj7 qj7Var) {
        super.d(qj7Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthV2", "start auth enableNotification");
        ((i) this.c).E5(new a(jCurrentTimeMillis));
    }

    public final /* synthetic */ void i(long j, EcoApiResult ecoApiResult) {
        Logger.d("EcoAuthV2", "sendAppConfirm, result: " + new Gson().toJson(ecoApiResult));
        if (c()) {
            return;
        }
        Logger.i("EcoAuthV2", "sendAppConfirm result = " + ecoApiResult.f() + ", cost = " + ((System.currentTimeMillis() - j) / 1000.0f));
        if (!ecoApiResult.f()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppConfirm apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().A()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "not expected response for sendAppConfirm");
        } else if (!ecoApiResult.e().o().o().c) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "device confirm failed");
        } else {
            ((i) this.c).updateKeys(this.h, this.i, this.j, this.f11246k);
            this.e.b(2004, "device ready");
        }
    }

    public final /* synthetic */ void j(long j, byte[] bArr, EcoApiResult ecoApiResult) {
        Logger.d("EcoAuthV2", "sendAppVerify, result: " + new Gson().toJson(ecoApiResult));
        if (c()) {
            return;
        }
        Logger.i("EcoAuthV2", "sendAppVerify result = " + ecoApiResult.f() + " cost = " + ((System.currentTimeMillis() - j) / 1000.0f));
        if (!ecoApiResult.f()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppVerify apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().D()) {
            if (!ecoApiResult.e().o().B()) {
                this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "not expected response for sendAppVerify");
                return;
            } else {
                da0 da0VarP = ecoApiResult.e().o().p();
                p(bArr, da0VarP.c, da0VarP.d);
                return;
            }
        }
        int iT = ecoApiResult.e().o().t();
        if (iT == 4) {
            this.e.b(CommonConstants.Mgc.RECHARGE_NOT_EXIST, "device not bound");
            return;
        }
        this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppVerify errorCode: " + iT);
    }

    public final /* synthetic */ void k(long j, EcoApiResult ecoApiResult) {
        Logger.d("EcoAuthV2", "sendShareAppVerify, result: " + new Gson().toJson(ecoApiResult));
        if (c()) {
            return;
        }
        Logger.i("EcoAuthV2", "sendShareAppVerify result = " + ecoApiResult.f() + " cost = " + ((System.currentTimeMillis() - j) / 1000.0f));
        if (ecoApiResult.f()) {
            m();
            return;
        }
        this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendShareAppVerify apiCode: " + ecoApiResult.c());
    }

    public final void l(byte[] bArr, byte[] bArr2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthV2", "start sendAppConfirm");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 27;
        r90 r90Var = new r90();
        u90 u90Var = new u90();
        u90Var.c = bArr;
        u90Var.d = bArr2;
        Logger.d("EcoAuthV2_encryptCompanionDevice:" + ByteUtil.bytesToHexString(bArr2), new Object[0]);
        r90Var.K(u90Var);
        u7rVar.z(r90Var);
        this.f = this.c.call(u7rVar, true, new p.a() { // from class: vd7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f36765a.i(jCurrentTimeMillis, ecoApiResult);
            }
        });
    }

    public final void m() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthV2", "start sendAppVerify");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 26;
        r90 r90Var = new r90();
        x90 x90Var = new x90();
        final byte[] bArrK = iql.k(16);
        x90Var.c = bArrK;
        o(this.c.getDid());
        Logger.d("EcoAuthV2_Token:" + ByteUtil.bytesToHexString(this.f31405b), new Object[0]);
        String str = this.m;
        if (str != null) {
            x90Var.d = str;
            x90Var.e = !TextUtils.isEmpty(this.l);
            Logger.d("EcoAuthV2_AppDeviceId:" + this.m + " checkDynamicCode:" + x90Var.e, new Object[0]);
        }
        r90Var.L(x90Var);
        u7rVar.z(r90Var);
        this.f = this.c.callTimeout(u7rVar, true, new p.a() { // from class: ud7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f35651a.j(jCurrentTimeMillis, bArrK, ecoApiResult);
            }
        }, 15000);
    }

    public final void n() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthV2", "start sendShareAppVerify");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 35;
        r90 r90Var = new r90();
        ic0 ic0Var = new ic0();
        ic0Var.d = this.n;
        ic0Var.c = this.f31404a;
        r90Var.M(ic0Var);
        u7rVar.z(r90Var);
        Logger.d("EcoAuthV2", "sendShareAppVerify, packet: " + new Gson().toJson(u7rVar));
        this.f = this.c.callTimeout(u7rVar, true, new p.a() { // from class: td7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f34587a.k(jCurrentTimeMillis, ecoApiResult);
            }
        }, 15000);
    }

    public final void o(String str) {
        String strBytesToHexString = ByteUtil.bytesToHexString(this.f31405b);
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        Logger.d("EcoAuthV2_Update_Token_Before:" + strBytesToHexString, new Object[0]);
        if (!strBytesToHexString.isEmpty()) {
            Logger.d("EcoAuthV2_Update_Token_SAVE:" + strBytesToHexString, new Object[0]);
            qu6.c(str, userId, strBytesToHexString);
            return;
        }
        String strA = qu6.a(str, userId);
        Logger.d("EcoAuthV2_Update_Token_GET:" + strA, new Object[0]);
        this.f31405b = ByteUtil.hexStringToBytes(strA);
    }

    public final void p(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthV2", "start verify");
        byte[] bArr5 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        byte[] bArrI = iql.i("miwear-auth", this.f31405b, bArr5);
        byte[] bArr6 = new byte[16];
        this.h = bArr6;
        this.i = new byte[16];
        this.j = new byte[4];
        this.f11246k = new byte[4];
        System.arraycopy(bArrI, 0, bArr6, 0, 16);
        System.arraycopy(bArrI, 16, this.i, 0, 16);
        System.arraycopy(bArrI, 32, this.j, 0, 4);
        System.arraycopy(bArrI, 36, this.f11246k, 0, 4);
        Logger.d("EcoAuthV2_DeviceKey:" + ByteUtil.bytesToHexString(this.h), new Object[0]);
        Logger.d("EcoAuthV2_DeviceIV:" + ByteUtil.bytesToHexString(this.j), new Object[0]);
        Logger.d("EcoAuthV2_AppKey:" + ByteUtil.bytesToHexString(this.i), new Object[0]);
        Logger.d("EcoAuthV2_AppIV:" + ByteUtil.bytesToHexString(this.f11246k), new Object[0]);
        Logger.d("EcoAuthV2_Token:" + ByteUtil.bytesToHexString(this.f31405b), new Object[0]);
        try {
            if (TextUtils.isEmpty(this.l)) {
                bArr4 = new byte[bArr.length + bArr2.length];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                System.arraycopy(bArr, 0, bArr4, bArr2.length, bArr.length);
            } else {
                byte[] bytes = this.l.getBytes();
                byte[] bArr7 = new byte[bArr.length + bArr2.length + bytes.length];
                System.arraycopy(bArr2, 0, bArr7, 0, bArr2.length);
                System.arraycopy(bArr, 0, bArr7, bArr2.length, bArr.length);
                System.arraycopy(bytes, 0, bArr7, bArr2.length + bArr.length, bytes.length);
                bArr4 = bArr7;
            }
            Logger.d("EcoAuthV2_RandomApp:" + ByteUtil.bytesToHexString(bArr), new Object[0]);
            Logger.d("EcoAuthV2_RandomDevice:" + ByteUtil.bytesToHexString(bArr2), new Object[0]);
            Logger.d("EcoAuthV2_message:" + ByteUtil.bytesToHexString(bArr4), new Object[0]);
            byte[] bArrA = ucb.a(this.h, bArr4);
            Logger.d("EcoAuthV2_sign:" + ByteUtil.bytesToHexString(bArrA), new Object[0]);
            Logger.d("EcoAuthV2_deviceSign:" + ByteUtil.bytesToHexString(bArr3), new Object[0]);
            if (!ByteUtil.equals(bArrA, bArr3)) {
                Logger.d("EcoAuthV2verify device confirm failed", new Object[0]);
                this.e.b(CommonConstants.Mgc.PUB_KEY_NOT_EXIST, "verify device confirm failed");
                return;
            }
            Logger.i("EcoAuthV2", "verify sign success cost = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f));
            Logger.d("EcoAuthV2_AppKey" + ByteUtil.bytesToHexString(this.i), new Object[0]);
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
            byte[] bArrA2 = ucb.a(this.i, bArr4);
            Logger.d("EcoAuthV2_SignApp" + ByteUtil.bytesToHexString(bArrA2), new Object[0]);
            ec0 ec0Var = new ec0();
            ec0Var.c = 0;
            ec0Var.d = (float) Build.VERSION.SDK_INT;
            ec0Var.e = Build.MODEL;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(this.f11246k);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            l(bArrA2, iql.d(this.i, byteBufferOrder.array(), dsf.i(ec0Var)));
        } catch (Exception e) {
            e.printStackTrace();
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, e.getMessage());
        }
    }
}
