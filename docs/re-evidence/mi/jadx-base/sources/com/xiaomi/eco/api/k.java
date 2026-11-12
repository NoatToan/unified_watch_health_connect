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
public final class k extends qd7 {
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f11272k;
    public final String l;
    public final String m;
    public boolean n;

    public class a implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11273a;

        public a(long j) {
            this.f11273a = j;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r6) {
            if (k.this.c()) {
                Logger.i("EcoLocalAuthV2", "enableNotification success isCancelled " + k.this.c());
                return;
            }
            Logger.i("EcoLocalAuthV2", "enableNotification success cost = " + ((System.currentTimeMillis() - this.f11273a) / 1000.0f));
            k.this.k();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            if (!k.this.c()) {
                Logger.i("EcoLocalAuthV2", "enableNotification fail");
                k.this.e.b(2003, "enable notifications failed");
            } else {
                Logger.i("EcoLocalAuthV2", "enableNotification fail isCancelled " + k.this.c());
            }
        }
    }

    public k(String str, boolean z, byte[] bArr, String str2, String str3, i iVar) {
        super(str, bArr, iVar);
        this.m = str2;
        this.n = z;
        this.l = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(long j, byte[] bArr, EcoApiResult ecoApiResult) {
        Logger.d("EcoLocalAuthV2", "sendAppVerify, result: " + new Gson().toJson(ecoApiResult));
        if (c()) {
            return;
        }
        Logger.i("EcoLocalAuthV2", "sendAppVerify result = " + ecoApiResult.f() + " cost = " + ((System.currentTimeMillis() - j) / 1000.0f));
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
                m(bArr, da0VarP.c, da0VarP.d);
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

    private void j(byte[] bArr, byte[] bArr2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoLocalAuthV2", "start sendAppConfirm");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 27;
        r90 r90Var = new r90();
        u90 u90Var = new u90();
        u90Var.c = bArr;
        u90Var.d = bArr2;
        Logger.d("EcoLocalAuthV2_encryptCompanionDevice:" + ByteUtil.bytesToHexString(bArr2), new Object[0]);
        r90Var.K(u90Var);
        u7rVar.z(r90Var);
        this.f = this.c.call(u7rVar, true, new p.a() { // from class: du7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f15931a.h(jCurrentTimeMillis, ecoApiResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoLocalAuthV2", "start sendAppVerify");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 26;
        r90 r90Var = new r90();
        x90 x90Var = new x90();
        final byte[] bArrK = iql.k(16);
        x90Var.c = bArrK;
        l(this.c.getDid());
        Logger.d("EcoLocalAuthV2_Token:" + ByteUtil.bytesToHexString(this.f31405b), new Object[0]);
        String str = this.m;
        if (str != null) {
            x90Var.d = str;
            x90Var.e = !TextUtils.isEmpty(this.l);
            Logger.d("EcoLocalAuthV2_AppDeviceId:" + this.m + " checkDynamicCode:" + x90Var.e, new Object[0]);
        }
        r90Var.L(x90Var);
        u7rVar.z(r90Var);
        this.f = this.c.callTimeout(u7rVar, true, new p.a() { // from class: cu7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                this.f14720a.i(jCurrentTimeMillis, bArrK, ecoApiResult);
            }
        }, 15000);
    }

    private void l(String str) {
        String strBytesToHexString = ByteUtil.bytesToHexString(this.f31405b);
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        Logger.d("EcoLocalAuthV2_Update_Token_Before:" + strBytesToHexString, new Object[0]);
        if (!strBytesToHexString.isEmpty()) {
            Logger.d("EcoLocalAuthV2_Update_Token_SAVE:" + strBytesToHexString, new Object[0]);
            qu6.c(str, userId, strBytesToHexString);
            return;
        }
        String strA = qu6.a(str, userId);
        Logger.d("EcoLocalAuthV2_Update_Token_GET:" + strA, new Object[0]);
        this.f31405b = ByteUtil.hexStringToBytes(strA);
    }

    private void m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoLocalAuthV2", "start verify");
        byte[] bArr5 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        byte[] bArrI = iql.i("miwear-auth", this.f31405b, bArr5);
        byte[] bArr6 = new byte[16];
        this.h = bArr6;
        this.i = new byte[16];
        this.j = new byte[4];
        this.f11272k = new byte[4];
        System.arraycopy(bArrI, 0, bArr6, 0, 16);
        System.arraycopy(bArrI, 16, this.i, 0, 16);
        System.arraycopy(bArrI, 32, this.j, 0, 4);
        System.arraycopy(bArrI, 36, this.f11272k, 0, 4);
        Logger.d("EcoLocalAuthV2_DeviceKey:" + ByteUtil.bytesToHexString(this.h), new Object[0]);
        Logger.d("EcoLocalAuthV2_DeviceIV:" + ByteUtil.bytesToHexString(this.j), new Object[0]);
        Logger.d("EcoLocalAuthV2_AppKey:" + ByteUtil.bytesToHexString(this.i), new Object[0]);
        Logger.d("EcoLocalAuthV2_AppIV:" + ByteUtil.bytesToHexString(this.f11272k), new Object[0]);
        Logger.d("EcoLocalAuthV2_Token:" + ByteUtil.bytesToHexString(this.f31405b), new Object[0]);
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
            Logger.d("EcoLocalAuthV2_RandomApp:" + ByteUtil.bytesToHexString(bArr), new Object[0]);
            Logger.d("EcoLocalAuthV2_RandomDevice:" + ByteUtil.bytesToHexString(bArr2), new Object[0]);
            Logger.d("EcoLocalAuthV2_message:" + ByteUtil.bytesToHexString(bArr4), new Object[0]);
            byte[] bArrA = ucb.a(this.h, bArr4);
            Logger.d("EcoLocalAuthV2_sign:" + ByteUtil.bytesToHexString(bArrA), new Object[0]);
            Logger.d("EcoLocalAuthV2_deviceSign:" + ByteUtil.bytesToHexString(bArr3), new Object[0]);
            if (!ByteUtil.equals(bArrA, bArr3)) {
                Logger.d("EcoLocalAuthV2verify device confirm failed", new Object[0]);
                this.e.b(CommonConstants.Mgc.PUB_KEY_NOT_EXIST, "verify device confirm failed");
                return;
            }
            Logger.i("EcoLocalAuthV2", "verify sign success cost = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0f));
            Logger.d("EcoLocalAuthV2_AppKey" + ByteUtil.bytesToHexString(this.i), new Object[0]);
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
            byte[] bArrA2 = ucb.a(this.i, bArr4);
            Logger.d("EcoLocalAuthV2_SignApp" + ByteUtil.bytesToHexString(bArrA2), new Object[0]);
            ec0 ec0Var = new ec0();
            ec0Var.c = 0;
            ec0Var.d = (float) Build.VERSION.SDK_INT;
            ec0Var.e = Build.MODEL;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(this.f11272k);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            j(bArrA2, iql.d(this.i, byteBufferOrder.array(), dsf.i(ec0Var)));
        } catch (Exception e) {
            e.printStackTrace();
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, e.getMessage());
        }
    }

    @Override // defpackage.qd7
    public void d(qj7 qj7Var) {
        super.d(qj7Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoLocalAuthV2", "start auth enableNotification");
        ((i) this.c).E5(new a(jCurrentTimeMillis));
    }

    public final /* synthetic */ void h(long j, EcoApiResult ecoApiResult) {
        Logger.d("EcoLocalAuthV2", "sendAppConfirm, result: " + new Gson().toJson(ecoApiResult));
        if (c()) {
            return;
        }
        Logger.i("EcoLocalAuthV2", "sendAppConfirm result = " + ecoApiResult.f() + ", cost = " + ((System.currentTimeMillis() - j) / 1000.0f));
        if (!ecoApiResult.f()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "sendAppConfirm apiCode: " + ecoApiResult.a());
            return;
        }
        if (!ecoApiResult.e().o().A()) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "not expected response for sendAppConfirm");
        } else if (!ecoApiResult.e().o().o().c) {
            this.e.b(CommonConstants.Mgc.RECHARGE_STATUS_NOT_EXIST, "device confirm failed");
        } else {
            ((i) this.c).updateKeys(this.h, this.i, this.j, this.f11272k);
            this.e.b(2004, "device ready");
        }
    }
}
