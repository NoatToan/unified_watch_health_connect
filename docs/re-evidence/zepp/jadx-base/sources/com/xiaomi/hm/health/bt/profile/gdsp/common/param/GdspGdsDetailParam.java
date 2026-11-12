package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import com.amap.api.mapcore.util.hl;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.ISportDetailDataParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetailParserFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B'\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/GdspGdsDetailParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "h", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "summary", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "i", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", z.j, "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", hl.k, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "", "version", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspGdsDetailParam extends BaseGdspSyncParam<SportDetail> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SportSummary summary;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final IGdspDataReceiver<SportDetail> dataReceiver;

    public GdspGdsDetailParam(@NotNull Calendar calendar, @NotNull SportSummary sportSummary, @NotNull HMDeviceSource hMDeviceSource, int i) {
        super(calendar, 6, i);
        this.summary = sportSummary;
        this.source = hMDeviceSource;
        this.dataReceiver = new BaseGdspDataReceiver<SportDetail>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspGdsDetailParam$dataReceiver$1

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            private SportDetail detail;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            private ISportDetailDataParser sportDetailDataParser;

            {
                this.sportDetailDataParser = SportDetailParserFactory.Companion.create(this.f.summary, HMDeviceFeature.TIMEX_DEVICE.contains(this.f.source));
            }

            @Nullable
            public final SportDetail getDetail() {
                return this.detail;
            }

            @Nullable
            public final ISportDetailDataParser getSportDetailDataParser() {
                return this.sportDetailDataParser;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver, com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            public void receiveData(@NotNull byte[] data) {
                super.receiveData(data);
                Debug.fi("GdspGdsDetailParam", Intrinsics.stringPlus("detail data: 00 ", ByteArrayKt.toHexString(data)));
                if (this.detail == null || this.sportDetailDataParser == null) {
                    this.detail = new SportDetail();
                    this.sportDetailDataParser = SportDetailParserFactory.Companion.create(this.f.summary, HMDeviceFeature.TIMEX_DEVICE.contains(this.f.source));
                }
                this.sportDetailDataParser.parser(this.detail, data, this.f.summary.getStartTime());
            }

            public final void setDetail(@Nullable SportDetail sportDetail) {
                this.detail = sportDetail;
            }

            public final void setSportDetailDataParser(@Nullable ISportDetailDataParser iSportDetailDataParser) {
                this.sportDetailDataParser = iSportDetailDataParser;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @Nullable
            /* JADX INFO: renamed from: getAllData, reason: from getter */
            public SportDetail getDetail() {
                return this.detail;
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    public IGdspDataReceiver<SportDetail> getDataReceiver() {
        return this.dataReceiver;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @Nullable
    public Calendar getStartSyncTime(@Nullable DataHeader header, @Nullable SportDetail data) {
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
