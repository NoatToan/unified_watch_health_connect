package com.huami.sky.lib.api;

import com.huami.mifit.sportlib.common.Constants;
import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.DeviceStatus;
import com.huami.sky.lib.entity.HeartRate;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.entity.UserAction;
import com.huami.watch.notification.data.NotificationData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/lib/api/UploadUserDataApi;", "", "", "Lcom/huami/sky/lib/entity/UserAction;", NotificationData.WearableExtrasData.KEY_ACTIONS, "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "records", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "data", "Lcom/huami/sky/lib/entity/HeartRate;", Constants.DATA_KEY_HR, "", "uploadData", "Lcom/huami/sky/lib/entity/DeviceStatus;", "deviceStatus", "uploadDeviceStatus", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface UploadUserDataApi {
    boolean uploadData(@Nullable List<UserAction> actions, @Nullable List<MusicPlayRecord> records, @Nullable DeviceDataEntity data, @Nullable List<HeartRate> hr);

    boolean uploadDeviceStatus(@NotNull DeviceStatus deviceStatus);
}
