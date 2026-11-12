package com.huami.sky.lib.repo;

import com.huami.mifit.sportlib.common.Constants;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.HeartRate;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.entity.UserAction;
import com.huami.watch.notification.data.NotificationData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004JM\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/lib/repo/DeviceDataRepository;", "", "", "receivedDeviceDataForUpload", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/sky/lib/entity/UserAction;", NotificationData.WearableExtrasData.KEY_ACTIONS, "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "records", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "data", "Lcom/huami/sky/lib/entity/HeartRate;", Constants.DATA_KEY_HR, "", "uploadDeviceData", "(Ljava/util/List;Ljava/util/List;Lcom/huami/sky/lib/entity/DeviceDataEntity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "getSleepStateFlow", "", WebConstant.QueryParam.CLIP_ID, "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "status", "uploadDeviceStatus", "(Ljava/lang/String;Lcom/huami/sky/lib/assist/SkyDeviceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceDataRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object uploadDeviceStatus$default(DeviceDataRepository deviceDataRepository, String str, SkyDeviceStatus skyDeviceStatus, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDeviceStatus");
            }
            if ((i & 2) != 0) {
                skyDeviceStatus = null;
            }
            return deviceDataRepository.uploadDeviceStatus(str, skyDeviceStatus, continuation);
        }
    }

    @NotNull
    Flow<Integer> getSleepStateFlow();

    @Nullable
    Object receivedDeviceDataForUpload(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object uploadDeviceData(@Nullable List<UserAction> list, @Nullable List<MusicPlayRecord> list2, @Nullable DeviceDataEntity deviceDataEntity, @Nullable List<HeartRate> list3, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object uploadDeviceStatus(@NotNull String str, @Nullable SkyDeviceStatus skyDeviceStatus, @NotNull Continuation<? super Unit> continuation);
}
