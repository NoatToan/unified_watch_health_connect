package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmSleepSelectInitJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "", "c", GoogleApiAvailabilityLight.a, "run", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/DeviceDataSelectInfo;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "sleepInfos", "selectDays", "", "e", "Z", "isEarbud", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Z)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmSleepSelectInitJob extends ThreadJobObject {

    @NotNull
    private static final String f = "HmSleepSelectInitJob";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<DeviceDataSelectInfo> sleepInfos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<DeviceDataSelectInfo> selectDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isEarbud;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "band select days:" + TextUtils.join(",", HmSleepSelectInitJob.this.sleepInfos);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "earbud select days:" + TextUtils.join(",", HmSleepSelectInitJob.this.sleepInfos);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "time use:" + (System.currentTimeMillis() - this.a);
        }
    }

    public HmSleepSelectInitJob(@NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> copyOnWriteArrayList, @NotNull CopyOnWriteArrayList<DeviceDataSelectInfo> copyOnWriteArrayList2, boolean z) {
        this.sleepInfos = copyOnWriteArrayList;
        this.selectDays = copyOnWriteArrayList2;
        this.isEarbud = z;
    }

    private final void c() {
        List<DateData> list = HMDaoManager.getInstance().getDateDataDao().queryBuilder().orderDesc(DateDataDao.Properties.Date).list();
        if (list != null) {
            for (DateData dateData : list) {
                SportDay.fromString(dateData.getDate()).isToday();
                HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
                boolean zIsSelect = hmEarbudDateDataUtil.isSelect(dateData.getSummary());
                boolean zHasSleep = hmEarbudDateDataUtil.hasSleep(dateData.getSummary(), false);
                if (zHasSleep) {
                    String date = dateData.getDate();
                    Integer source = dateData.getSource();
                    DeviceDataSelectInfo deviceDataSelectInfo = new DeviceDataSelectInfo(date, source == null ? -1 : source.intValue(), zHasSleep, zIsSelect);
                    this.sleepInfos.add(deviceDataSelectInfo);
                    if (zIsSelect) {
                        this.selectDays.add(deviceDataSelectInfo);
                    }
                }
            }
        }
        HMLog.info(f, new a());
    }

    private final void d() {
        List<EarbudDateData> list = HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().orderDesc(EarbudDateDataDao.Properties.Date).list();
        if (list != null) {
            for (EarbudDateData earbudDateData : list) {
                SportDay.fromString(earbudDateData.getDate()).isToday();
                HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
                boolean zIsSelect = hmEarbudDateDataUtil.isSelect(earbudDateData.getSummary());
                boolean zHasSleep = hmEarbudDateDataUtil.hasSleep(earbudDateData.getSummary(), true);
                if (zHasSleep) {
                    String date = earbudDateData.getDate();
                    Integer source = earbudDateData.getSource();
                    DeviceDataSelectInfo deviceDataSelectInfo = new DeviceDataSelectInfo(date, source == null ? -1 : source.intValue(), zHasSleep, zIsSelect);
                    this.sleepInfos.add(deviceDataSelectInfo);
                    if (zIsSelect) {
                        this.selectDays.add(deviceDataSelectInfo);
                    }
                }
            }
        }
        HMLog.info(f, new b());
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        super.run();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.sleepInfos.clear();
        this.selectDays.clear();
        if (this.isEarbud) {
            d();
        } else {
            c();
        }
        HMLog.debug(f, new c(jCurrentTimeMillis));
    }
}
