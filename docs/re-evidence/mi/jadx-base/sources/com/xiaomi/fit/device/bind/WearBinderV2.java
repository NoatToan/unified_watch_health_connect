package com.xiaomi.fit.device.bind;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.ha0;
import defpackage.kj2;
import defpackage.om5;
import defpackage.p90;
import defpackage.s7r;
import defpackage.sb0;

/* JADX INFO: loaded from: classes7.dex */
public final class WearBinderV2 extends a {
    public static final byte[] f = {16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11299b;
    public a c;
    public final String d;
    public final boolean e;

    public WearBinderV2(String str, boolean z, DeviceInfo deviceInfo) {
        super(deviceInfo);
        this.d = str;
        this.e = z;
    }

    @Override // com.xiaomi.fit.device.bind.a
    public void cancel() {
        super.cancel();
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    public final void h() {
        Logger.i("WearBinderV2", "getBindInfo() called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 17;
        sb0 sb0Var = new sb0();
        sb0Var.c = this.e;
        sb0Var.d = MD5Util.MD5ForBytes(this.mUserId);
        Logger.i(LocalBindTool.TAG, "_checkDynamicCode:" + this.e);
        p90 p90Var = new p90();
        p90Var.H(sb0Var);
        s7rVar.M(p90Var);
        IMiWearCoreClient.INSTANCE.getInstance().unauthCall(this.mDeviceInfo.getAddress(), om5.a(s7rVar), true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.WearBinderV2.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult wearApiResult) {
                Logger.i("WearBinderV2", "getBindInfo result:" + wearApiResult.d());
                if (!wearApiResult.d()) {
                    WearBinderV2.this.mCallback.onBindFailure(1005, "getBindInfo apiCode: " + wearApiResult.a());
                    return;
                }
                s7r s7rVarB = om5.b(wearApiResult.c());
                if (s7rVarB == null) {
                    Logger.i("WearBinderV2", "getBindInfo packet == null");
                    return;
                }
                if (s7rVarB.o().y()) {
                    int iR = s7rVarB.o().r();
                    if (iR == 1) {
                        WearBinderV2.this.mCallback.onBindFailure(1003, "device have bound");
                        return;
                    }
                    WearBinderV2.this.mCallback.onBindFailure(1005, "getBindInfo errorCode: " + iR);
                    return;
                }
                if (!s7rVarB.o().x()) {
                    WearBinderV2.this.mCallback.onBindFailure(1005, "not expected response for getBindInfo");
                    return;
                }
                ha0 ha0VarP = s7rVarB.o().p();
                WearBinderV2.this.f11298a = ha0VarP.c;
                WearBinderV2.this.f11299b = ha0VarP.g;
                Logger.d("WearBinderV2", "getBindInfo: verifyMode = " + WearBinderV2.this.f11298a + ", oobMode = " + WearBinderV2.this.f11299b);
                if (WearBinderV2.this.f11298a == 2) {
                    if (WearBinderV2.this.f11299b == 3 || WearBinderV2.this.f11299b == 2 || WearBinderV2.this.f11299b == 0) {
                        WearBinderV2 wearBinderV2 = WearBinderV2.this;
                        wearBinderV2.c = new LocalWearBinderV2(wearBinderV2.mDeviceInfo, wearBinderV2.d);
                        ((LocalWearBinderV2) WearBinderV2.this.c).h(WearBinderV2.this.f11299b, ha0VarP.f, ha0VarP.e, ha0VarP.d, ha0VarP.i, WearBinderV2.this.mCallback);
                        return;
                    } else {
                        WearBinderV2.this.mCallback.onBindFailure(1006, "oob mode (" + ha0VarP.g + ") not support");
                        return;
                    }
                }
                if (WearBinderV2.this.f11298a != 1) {
                    WearBinderV2.this.mCallback.onBindFailure(1007, "verify mode (" + ha0VarP.c + ") not support");
                    return;
                }
                WearBinderV2 wearBinderV3 = WearBinderV2.this;
                wearBinderV3.c = new PSKWearBinderV2(wearBinderV3.mDeviceInfo);
                Logger.i("WearBinderV2", "getBindInfo: bindInfo.mac = " + ha0VarP.e + " , coreId = " + WearBinderV2.this.mDeviceInfo.getAddress());
                ((PSKWearBinderV2) WearBinderV2.this.c).x(WearBinderV2.this.f11299b, ha0VarP.c, ha0VarP.f, WearBinderV2.this.mDeviceInfo.getAddress(), WearBinderV2.this.mDeviceInfo.getAddress(), "", ha0VarP.d, ha0VarP.i, ha0VarP.h, WearBinderV2.this.mCallback);
            }
        }, 15000);
    }

    @Override // com.xiaomi.fit.device.bind.a
    public final void start(kj2 kj2Var) {
        super.start(kj2Var);
        Logger.i("WearBinderV2", "start: createBond");
        h();
    }
}
