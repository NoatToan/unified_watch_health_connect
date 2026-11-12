package com.xiaomi.hm.health.restheart.api;

import com.app.restheartrate.service.api.MaxHeartApi;
import com.app.restheartrate.service.api.MaxHeartSyncApi;
import com.app.restheartrate.service.entity.MaxHeartRate;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.BaseGdspDataReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl;", "Lcom/app/restheartrate/service/api/MaxHeartSyncApi;", "Ljava/util/Calendar;", "getLastSyncTime", "", "syncDataFromDevice", "Lcom/app/restheartrate/service/api/MaxHeartApi;", "a", "Lcom/app/restheartrate/service/api/MaxHeartApi;", "api", "<init>", "(Lcom/app/restheartrate/service/api/MaxHeartApi;)V", "Companion", "MaxSportHeartRateParser", "MaxSportHrSyncParam", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MaxSportHrSyncApiImpl implements MaxHeartSyncApi {
    private static final int b = 1000;
    private static final int c = 61;

    @NotNull
    private static final String d = "MaxSportHrSyncApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MaxHeartApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHeartRateParser;", "", "", "data", "", "Lcom/app/restheartrate/service/entity/MaxHeartRate;", "parse", "<init>", "()V", "a", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class MaxSportHeartRateParser {

        @Deprecated
        public static final int BYTE_SIZE_TIMESTAMP = 4;

        @Deprecated
        public static final int BYTE_SIZE_TIMEZONE = 1;

        @Deprecated
        public static final int BYTE_SIZE_VALUE = 1;

        @Deprecated
        public static final int DATA_UNIT_SIZE = 6;

        @Deprecated
        @NotNull
        public static final String TAG = "RestHeartRateParser";

        @NotNull
        private static final a a = new a(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHeartRateParser$a", "", "", "BYTE_SIZE_TIMESTAMP", LogUtil.I, "BYTE_SIZE_TIMEZONE", "BYTE_SIZE_VALUE", "DATA_UNIT_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Parser warn size! - " + this.a.length;
            }
        }

        @NotNull
        public final List<MaxHeartRate> parse(@NotNull byte[] data) {
            if (data.length < 6) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            int length = data.length / 6;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                Calendar calendar = Calendar.getInstance();
                int i3 = i * 6;
                long j = 1000;
                calendar.setTimeInMillis(ByteUtilsKt.toLong(data, 4, i3) * j);
                int i4 = i3 + 4;
                calendar.setTimeZone(ProfileUtils.getTimezone(data[i4]));
                arrayList.add(new MaxHeartRate(calendar.getTimeInMillis() / j, ByteUtilsKt.toInt(data, 1, i4 + 1)));
                i = i2;
            }
            if (data.length % 6 > 0) {
                HMLog.warn$default("RestHeartRateParser", null, new b(data), 2, null);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHrSyncParam;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", "", "Lcom/app/restheartrate/service/entity/MaxHeartRate;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHeartRateParser;", "h", "Lkotlin/Lazy;", "a", "()Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHeartRateParser;", "parser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "i", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "startTime", "<init>", "(Ljava/util/Calendar;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class MaxSportHrSyncParam extends BaseGdspSyncParam<List<? extends MaxHeartRate>> {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final Lazy parser;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        private final IGdspDataReceiver<List<MaxHeartRate>> dataReceiver;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/restheart/api/MaxSportHrSyncApiImpl$MaxSportHeartRateParser;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<MaxSportHeartRateParser> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MaxSportHeartRateParser getA() {
                return new MaxSportHeartRateParser();
            }
        }

        public MaxSportHrSyncParam(@NotNull Calendar calendar) {
            super(calendar, 61, 0, 4, null);
            this.parser = LazyKt__LazyJVMKt.lazy(a.a);
            this.dataReceiver = new BaseGdspDataReceiver<List<? extends MaxHeartRate>>() { // from class: com.xiaomi.hm.health.restheart.api.MaxSportHrSyncApiImpl$MaxSportHrSyncParam$dataReceiver$1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
                @NotNull
                /* JADX INFO: renamed from: getAllData */
                public List<MaxHeartRate> getDetail() {
                    DataHeader mDataHeader = getMDataHeader();
                    Integer numValueOf = mDataHeader == null ? null : Integer.valueOf(mDataHeader.size);
                    if (numValueOf == null) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                    numValueOf.intValue();
                    return this.d.a().parse(getMDataStream().toByteArray());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MaxSportHeartRateParser a() {
            return (MaxSportHeartRateParser) this.parser.getValue();
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
        @NotNull
        /* JADX INFO: renamed from: getDataReceiver */
        public IGdspDataReceiver<List<? extends MaxHeartRate>> getDataReceiver2() {
            return this.dataReceiver;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.param.BaseGdspSyncParam
        public /* bridge */ /* synthetic */ Calendar getStartSyncTime(DataHeader dataHeader, List<? extends MaxHeartRate> list) {
            return getStartSyncTime2(dataHeader, (List<MaxHeartRate>) list);
        }

        @Nullable
        /* JADX INFO: renamed from: getStartSyncTime, reason: avoid collision after fix types in other method */
        public Calendar getStartSyncTime2(@Nullable DataHeader header, @NotNull List<MaxHeartRate> data) {
            MaxHeartRate maxHeartRate = (MaxHeartRate) CollectionsKt.lastOrNull((List) data);
            if (maxHeartRate == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(maxHeartRate.getTime() + ((long) 1000));
            return calendar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "start sync time=" + this.a.getTimeInMillis();
        }
    }

    public MaxSportHrSyncApiImpl(@NotNull MaxHeartApi maxHeartApi) {
        this.api = maxHeartApi;
    }

    @Override // com.app.restheartrate.service.api.MaxHeartSyncApi
    @NotNull
    public Calendar getLastSyncTime() {
        Calendar boundDeviceSyncTime = HMDeviceManager.getInstance().getBoundDeviceSyncTime(HMDeviceType.MILI);
        boundDeviceSyncTime.setTimeInMillis(HealthDataTimeUtils.INSTANCE.getDayStartTime(boundDeviceSyncTime.getTimeInMillis()));
        return boundDeviceSyncTime;
    }

    @Override // com.app.restheartrate.service.api.MaxHeartSyncApi
    public void syncDataFromDevice() throws InterruptedException {
        Calendar lastSyncTime = getLastSyncTime();
        HMLog.info(d, new a(lastSyncTime));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice != null) {
            hMMiLiProDevice.syncGdspListData(new MaxSportHrSyncParam(lastSyncTime), new HMCallback<List<? extends MaxHeartRate>>() { // from class: com.xiaomi.hm.health.restheart.api.MaxSportHrSyncApiImpl.syncDataFromDevice.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.restheart.api.MaxSportHrSyncApiImpl$syncDataFromDevice$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ List<MaxHeartRate> a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(List<MaxHeartRate> list) {
                        super(0);
                        this.a = list;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "receive max sport heart rate list=" + this.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(false);
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onData(List<? extends MaxHeartRate> list) {
                    onData2((List<MaxHeartRate>) list);
                }

                /* JADX INFO: renamed from: onData, reason: avoid collision after fix types in other method */
                public void onData2(@Nullable List<MaxHeartRate> list) {
                    super.onData(list);
                    HMLog.info(MaxSportHrSyncApiImpl.d, new a(list));
                    MaxSportHrSyncApiImpl.this.api.saveHeartRateData(list);
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await(600000L, TimeUnit.MILLISECONDS);
    }
}
