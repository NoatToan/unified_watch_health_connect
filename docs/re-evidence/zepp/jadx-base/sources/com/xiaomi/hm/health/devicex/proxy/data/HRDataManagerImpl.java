package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.basic.HRDataManagerApi;
import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/HRDataManagerImpl;", "Lcom/huami/devicex/injection/basic/HRDataManagerApi;", "", "syncToServer", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/databases/model/HeartRate;", "hrs", "insertHeartRateList", "", Constants.DATA_KEY_HR, "", "isValidHeartRate", "getEarliestSyncedHeartRate", "getMaxHr", "deleteFromServer", "isForce", "syncFromServer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HRDataManagerImpl implements HRDataManagerApi {
    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public void deleteFromServer() {
        HRDataManager.getInstance().deleteFromServer();
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    @Nullable
    public HeartRate getEarliestSyncedHeartRate() {
        return HRDataManager.getInstance().getEarliestSyncedHeartRate();
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public int getMaxHr() {
        return 220 - HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public void insertHeartRateList(@NotNull ArrayList<HeartRate> hrs) {
        HRDataManager.getInstance().insertHeartRateList(hrs);
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public boolean isValidHeartRate(int hr) {
        return HRDataManager.getInstance().isValidHeartRate(hr);
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public void syncFromServer(boolean isForce) {
        HRDataManager.getInstance().syncFromServer(isForce);
    }

    @Override // com.huami.devicex.injection.basic.HRDataManagerApi
    public void syncToServer() {
        HRDataManager.getInstance().syncToServer();
    }
}
