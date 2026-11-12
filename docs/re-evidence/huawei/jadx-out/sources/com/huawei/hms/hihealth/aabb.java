package com.huawei.hms.hihealth;

import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hms.health.aabz;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;

/* JADX INFO: loaded from: classes34.dex */
class aabb implements OnFailureListener {
    final /* synthetic */ HuaweiIdAuthService aab;
    final /* synthetic */ HiHealthKitClient aaba;

    @Override // com.huawei.hmf.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        aabz.aabb("HiHealthKitClient", "silentSignIn failed, begin sign in");
        this.aaba.aabd.startActivityForResult(this.aab.getSignInIntent(), 1);
    }

    aabb(HiHealthKitClient hiHealthKitClient, HuaweiIdAuthService huaweiIdAuthService) {
        this.aaba = hiHealthKitClient;
        this.aab = huaweiIdAuthService;
    }
}
