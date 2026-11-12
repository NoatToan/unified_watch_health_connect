package com.xiaomi.hm.health.restheart.api;

import com.app.restheartrate.service.api.RestHeartApi;
import com.app.restheartrate.service.api.RestHeartSyncApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRateSyncParam;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.restheart.RestHeartSyncTimeProperties;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/restheart/api/RestHeartSyncApiImpl;", "Lcom/app/restheartrate/service/api/RestHeartSyncApi;", "Ljava/util/Calendar;", "getLastSyncTime", "", "syncDataFromDevice", "Lcom/app/restheartrate/service/api/RestHeartApi;", "a", "Lcom/app/restheartrate/service/api/RestHeartApi;", "api", "", "b", "Ljava/lang/String;", "tag", "<init>", "(Lcom/app/restheartrate/service/api/RestHeartApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RestHeartSyncApiImpl implements RestHeartSyncApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RestHeartApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "RestHeartSyncApiImpl";

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

    public RestHeartSyncApiImpl(@NotNull RestHeartApi restHeartApi) {
        this.api = restHeartApi;
    }

    @Override // com.app.restheartrate.service.api.RestHeartSyncApi
    @NotNull
    public Calendar getLastSyncTime() {
        Long l = RestHeartSyncTimeProperties.INSTANCE.getLastSyncTime().get();
        if (l == null) {
            return HMDeviceManager.getInstance().getBoundDeviceSyncTime(HMDeviceType.MILI);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue());
        return calendar;
    }

    @Override // com.app.restheartrate.service.api.RestHeartSyncApi
    public void syncDataFromDevice() throws InterruptedException {
        Calendar lastSyncTime = getLastSyncTime();
        lastSyncTime.setTimeInMillis(HealthDataTimeUtils.INSTANCE.getDayStartTime(lastSyncTime.getTimeInMillis()));
        HMLog.info(this.tag, new a(lastSyncTime));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice != null) {
            hMMiLiProDevice.syncGdspListData(new RestHeartRateSyncParam(lastSyncTime), new HMCallback<List<? extends RestHeartRate>>() { // from class: com.xiaomi.hm.health.restheart.api.RestHeartSyncApiImpl.syncDataFromDevice.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.restheart.api.RestHeartSyncApiImpl$syncDataFromDevice$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ List<RestHeartRate> a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(List<RestHeartRate> list) {
                        super(0);
                        this.a = list;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "receive restheartrate list=" + this.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(false);
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onData(List<? extends RestHeartRate> list) {
                    onData2((List<RestHeartRate>) list);
                }

                /* JADX INFO: renamed from: onData, reason: avoid collision after fix types in other method */
                public void onData2(@Nullable List<RestHeartRate> list) {
                    ArrayList arrayList;
                    RestHeartRate restHeartRate;
                    super.onData(list);
                    HMLog.info(RestHeartSyncApiImpl.this.tag, new a(list));
                    RestHeartApi restHeartApi = RestHeartSyncApiImpl.this.api;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (RestHeartRate restHeartRate2 : list) {
                            arrayList.add(new com.app.restheartrate.service.entity.RestHeartRate(restHeartRate2.getCalendar().getTimeInMillis(), restHeartRate2.getHr()));
                        }
                    }
                    restHeartApi.saveHeartRateData(arrayList);
                    if (list != null && (restHeartRate = (RestHeartRate) CollectionsKt.lastOrNull((List) list)) != null) {
                        RestHeartSyncTimeProperties.INSTANCE.getLastSyncTime().set(Long.valueOf(restHeartRate.getCalendar().getTimeInMillis()));
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await(600000L, TimeUnit.MILLISECONDS);
    }
}
