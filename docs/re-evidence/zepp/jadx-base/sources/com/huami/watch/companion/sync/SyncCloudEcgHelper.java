package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.ecg.EcgDataRepo;
import com.huami.passport.AccountManager;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudEcgHelper extends BaseSyncHelper {
    public static SyncCloudEcgHelper getHelper(Context context) {
        return (SyncCloudEcgHelper) BaseSyncHelper.getHelper(context, null, SyncCloudEcgHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        new EcgDataRepo().checkData(false);
        AccountManager.getDefault(this.mContext).getCurrentUid();
        return true;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return "DataFlow-Ecg-SyncCloud";
    }
}
