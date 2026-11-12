package com.huawei.android.hicloud.sync.logic;

import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import defpackage.bbz;
import defpackage.bcp;
import defpackage.bcw;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SyncProcessAdapter implements SyncProcessInterface {
    @Override // com.huawei.android.hicloud.sync.logic.SyncProcessInterface
    public bbz addCompare(String str, List<String> list, SyncData syncData) throws bcp {
        bcw.e("SyncProcessAdapter", "addCompare is deprecated");
        return null;
    }

    @Override // com.huawei.android.hicloud.sync.logic.SyncProcessInterface
    public bbz conflictCompare(String str, String str2, SyncData syncData) throws bcp {
        bcw.e("SyncProcessAdapter", "conflictCompare is deprecated");
        return null;
    }

    @Override // com.huawei.android.hicloud.sync.logic.SyncProcessInterface
    public List<bbz> processLocalModifyCloudDelete(String str, List<String> list) throws bcp {
        bcw.e("SyncProcessAdapter", "processLocalModifyCloudDelete is deprecated");
        return null;
    }
}
