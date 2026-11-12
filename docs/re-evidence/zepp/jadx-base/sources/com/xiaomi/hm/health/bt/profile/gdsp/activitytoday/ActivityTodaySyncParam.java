package com.xiaomi.hm.health.bt.profile.gdsp.activitytoday;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activitytoday/ActivityTodaySyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "", "h", "Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activitytoday/ActivityTodayDataParser;", "i", "Lkotlin/Lazy;", "a", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/activitytoday/ActivityTodayDataParser;", "parser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/BaseGdspDataReceiver;", z.j, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/BaseGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/BaseGdspDataReceiver;", "dataReceiver", "startTime", "", "gpsVersion", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityTodaySyncParam extends BaseGdspSyncParam<List<? extends ActivityData>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy parser;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final BaseGdspDataReceiver<List<ActivityData>> dataReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activitytoday/ActivityTodayDataParser;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ActivityTodayDataParser> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityTodayDataParser invoke() {
            return new ActivityTodayDataParser();
        }
    }

    public /* synthetic */ ActivityTodaySyncParam(Calendar calendar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendar, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityTodayDataParser a() {
        return (ActivityTodayDataParser) this.parser.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends ActivityData> list) {
        return getStartSyncTime2(dataHeader, (List<ActivityData>) list);
    }

    public ActivityTodaySyncParam(@NotNull Calendar calendar, int i) {
        super(calendar, 63, i);
        this.tag = "ActivityTodaySyncParam";
        this.parser = LazyKt__LazyJVMKt.lazy(a.a);
        this.dataReceiver = new BaseGdspDataReceiver<List<? extends ActivityData>>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.activitytoday.ActivityTodaySyncParam$dataReceiver$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("data stream: ", GattUtils.bytesToHexString(getMDataStream().toByteArray()));
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
            @NotNull
            /* JADX INFO: renamed from: getAllData */
            public List<ActivityData> getDetail() {
                DataHeader mDataHeader = getMDataHeader();
                Integer numValueOf = mDataHeader == null ? null : Integer.valueOf(mDataHeader.size);
                if (numValueOf == null) {
                    return new ArrayList();
                }
                numValueOf.intValue();
                HMLog.info(this.d.tag, new a());
                Debug.fi(this.d.tag, Intrinsics.stringPlus("data size: ", Integer.valueOf(getMDataStream().size())));
                return this.d.a().parseData(getMDataStream().toByteArray());
            }
        };
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
    @NotNull
    /* JADX INFO: renamed from: getDataReceiver, reason: merged with bridge method [inline-methods] */
    public IGdspDataReceiver<List<? extends ActivityData>> getDataReceiver2() {
        return this.dataReceiver;
    }

    @Nullable
    /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
    public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<ActivityData> data) {
        Calendar startTime;
        Debug.fi(this.tag, Intrinsics.stringPlus("start time: ", getStartTime()));
        if (header == null) {
            startTime = getStartTime();
        } else {
            ActivityData activityData = (ActivityData) CollectionsKt.lastOrNull((List) data);
            if (activityData == null) {
                startTime = null;
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(activityData.getTime());
                startTime = calendar;
            }
        }
        if (startTime == null) {
            return null;
        }
        Debug.fi(this.tag, Intrinsics.stringPlus("final start time: ", Long.valueOf(startTime.getTimeInMillis())));
        return startTime;
    }
}
