package com.xiaomi.hm.health.bt.profile.gdsp.common.profile;

import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.GdspPieceData;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H&J\u0012\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH&J\u001b\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0010H&¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/GdspSyncProfile;", "", "", PointCategory.INIT, "Ljava/util/Calendar;", "startTime", "", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "readHeader", "withCompress", "Lkotlinx/coroutines/channels/Channel;", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "startTransfer", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspPieceData;", "getData", "", "code", "stopTransfer", "(Ljava/lang/Integer;)Z", "", "forceStop", "deInit", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/profile/DataTransferRate;", "getDataTransferRate", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GdspSyncProfile {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ boolean stopTransfer$default(GdspSyncProfile gdspSyncProfile, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopTransfer");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return gdspSyncProfile.stopTransfer(num);
        }
    }

    boolean deInit();

    void forceStop();

    @NotNull
    Channel<GdspPieceData> getData();

    @NotNull
    DataTransferRate getDataTransferRate(int type);

    boolean init();

    @Nullable
    DataHeader readHeader(@NotNull Calendar startTime, byte type);

    @Nullable
    DataHeader readHeader(@NotNull Calendar startTime, byte type, boolean withCompress);

    @Nullable
    Channel<HMNotifyResponse> startTransfer();

    boolean stopTransfer(@Nullable Integer code);
}
