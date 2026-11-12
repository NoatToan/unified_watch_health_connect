package com.huawei.hms.health;

import android.os.RemoteException;
import com.huawei.hms.hihealth.data.SamplePoint;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class aacf extends com.huawei.hms.hihealth.options.aab.AbstractBinderC0127aab {
    final /* synthetic */ aace.aaba aab;

    @Override // com.huawei.hms.hihealth.options.aab
    public void onStatusChange(int i) throws RemoteException {
        this.aab.aabb.onStatusChange(i);
    }

    @Override // com.huawei.hms.hihealth.options.aab
    public void onReceive(List<SamplePoint> list) throws RemoteException {
        this.aab.aabb.onReceive(list);
    }

    aacf(aace.aaba aabaVar) {
        this.aab = aabaVar;
    }
}
