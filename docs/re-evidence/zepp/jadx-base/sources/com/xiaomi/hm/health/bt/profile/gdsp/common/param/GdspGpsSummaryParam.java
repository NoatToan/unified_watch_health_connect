package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummaryParserFactory;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\"\u0010\u000b\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspGpsSummaryParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "", "h", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "version", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspGpsSummaryParam extends BaseGdspSyncParam<SportSummary> {

    @NotNull
    private static final String j = "gps.HMSyncGpsDataTask";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<SportSummary> dataReceiver;

    public GdspGpsSummaryParam(@NotNull Calendar calendar, @NotNull final HMDeviceSource hMDeviceSource, int i) {
        super(calendar, (HMDeviceFeature.TIMEX_DEVICE.contains(hMDeviceSource) ? 14 : 5) & 255, i);
        this.dataReceiver = new BaseGdspDataReceiver<SportSummary>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGpsSummaryParam$dataReceiver$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @Nullable
            public SportSummary getAllData() {
                Object objM3845constructorimpl;
                DataHeader mDataHeader = getMDataHeader();
                if (mDataHeader == null) {
                    return null;
                }
                if (!(mDataHeader.size > 0)) {
                    mDataHeader = null;
                }
                if (mDataHeader == null) {
                    return null;
                }
                boolean z = mDataHeader.size == getMDataStream().size();
                if (!z) {
                    Debug.fi("gps.HMSyncGpsDataTask", "get size is not match target size<" + mDataHeader.size + ',' + getMDataStream().size() + Typography.greater);
                }
                if (!z) {
                    mDataHeader = null;
                }
                if (mDataHeader == null) {
                    return null;
                }
                HMDeviceSource hMDeviceSource2 = hMDeviceSource;
                try {
                    Result.Companion companion = Result.Companion;
                    byte[] byteArray = getMDataStream().toByteArray();
                    Debug.fi("gps.HMSyncGpsDataTask", Intrinsics.stringPlus("summary data: 00 ", ByteArrayKt.toHexString(byteArray)));
                    int i2 = ((byteArray[1] & 255) << 8) | (byteArray[0] & 255);
                    byte[] bArr = new byte[byteArray.length - 2];
                    System.arraycopy(byteArray, 2, bArr, 0, byteArray.length - 2);
                    SportSummary rVar = SportSummaryParserFactory.Companion.createSummaryParser(HMDeviceFeature.TIMEX_DEVICE.contains(hMDeviceSource2), i2).parser(bArr);
                    if (rVar == null) {
                        return null;
                    }
                    rVar.setTimezone(ProfileUtils.getTimezoneKey(mDataHeader.calendar.getTimeZone()));
                    long endTime = rVar.getEndTime() - rVar.getStartTime();
                    rVar.setStartTime(mDataHeader.calendar.getTimeInMillis());
                    rVar.setEndTime(rVar.getStartTime() + endTime);
                    objM3845constructorimpl = Result.m3845constructorimpl(rVar);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    Debug.fi("gps.HMSyncGpsDataTask", Intrinsics.stringPlus("同步Summary数据异常:", thM3848exceptionOrNullimpl));
                }
                return (SportSummary) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<SportSummary> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @Nullable SportSummary data) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public void setLoop(boolean z) {
        this.isLoop = z;
    }
}
