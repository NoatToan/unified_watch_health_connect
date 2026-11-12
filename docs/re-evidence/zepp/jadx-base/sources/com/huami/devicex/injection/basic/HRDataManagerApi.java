package com.huami.devicex.injection.basic;

import com.huami.mifit.sportlib.common.Constants;
import com.xiaomi.hm.health.databases.model.HeartRate;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\r\u001a\u00020\bH&J\b\u0010\u000e\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/huami/devicex/injection/basic/HRDataManagerApi;", "", "", "syncToServer", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/databases/model/HeartRate;", "hrs", "insertHeartRateList", "", Constants.DATA_KEY_HR, "", "isValidHeartRate", "getEarliestSyncedHeartRate", "getMaxHr", "deleteFromServer", "isForce", "syncFromServer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface HRDataManagerApi {
    void deleteFromServer();

    @Nullable
    HeartRate getEarliestSyncedHeartRate();

    int getMaxHr();

    void insertHeartRateList(@NotNull ArrayList<HeartRate> hrs);

    boolean isValidHeartRate(int hr);

    void syncFromServer(boolean isForce);

    void syncToServer();
}
