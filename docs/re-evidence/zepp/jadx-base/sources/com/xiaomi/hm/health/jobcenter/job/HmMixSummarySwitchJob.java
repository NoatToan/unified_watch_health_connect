package com.xiaomi.hm.health.jobcenter.job;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import de.greenrobot.event.EventBus;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B1\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmMixSummarySwitchJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "", "c", "run", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDaySummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMWeekSummery;", GoogleApiAvailabilityLight.a, "mWeekSummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMMonthSummery;", "e", "mMonthSummeryArrayList", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmMixSummarySwitchJob extends ThreadJobObject {

    @NotNull
    private static final String f = "HmMixSummarySwitchJob";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ HmMixSummarySwitchJob b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, HmMixSummarySwitchJob hmMixSummarySwitchJob) {
            super(0);
            this.a = j;
            this.b = hmMixSummarySwitchJob;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "分析活动结束，summery组装完成********************************* used :" + (System.currentTimeMillis() - this.a) + ";size day = " + this.b.mDaySummeryArrayList.size() + ";day = " + this.b.mDaySummeryArrayList.size() + ";wk = " + this.b.mWeekSummeryArrayList.size() + ";mon = " + this.b.mMonthSummeryArrayList.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "分析活动结束，summery组装完成********************************* error :" + this.a.getMessage();
        }
    }

    public HmMixSummarySwitchJob(@NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList2, @NotNull CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList3) {
        super(4);
        this.mDaySummeryArrayList = copyOnWriteArrayList;
        this.mWeekSummeryArrayList = copyOnWriteArrayList2;
        this.mMonthSummeryArrayList = copyOnWriteArrayList3;
    }

    private final void c() {
        HMSummery specifyDaySummary;
        String key = SportDay.getToday().getKey();
        Iterator<HMSummery> it2 = this.mDaySummeryArrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().date, key)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            HMSummery hMSummery = this.mDaySummeryArrayList.get(i);
            boolean isEarbud = HmEarbudDateDataUtil.INSTANCE.getSelectData(hMSummery.date).getIsEarbud();
            HMSummery specifyDaySummary2 = HMDataCacheCenter.getInstance().getmBandUint().getSpecifyDaySummary(hMSummery.date);
            if (specifyDaySummary2 != null) {
                hMSummery.steps = specifyDaySummary2.steps;
                hMSummery.pai = specifyDaySummary2.pai;
                hMSummery.goal = specifyDaySummary2.goal;
                hMSummery.mStatus = 1;
                if (!isEarbud) {
                    hMSummery.sleep = specifyDaySummary2.sleep;
                }
            }
            if (isEarbud && (specifyDaySummary = HMDataCacheCenter.getInstance().getEarbudUnit().getSpecifyDaySummary(hMSummery.date)) != null) {
                hMSummery.sleep = specifyDaySummary.sleep;
            }
            this.mDaySummeryArrayList.set(i, hMSummery);
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        EventBus eventBus;
        EventSummeryAnalysisJobFinished eventSummeryAnalysisJobFinished;
        HMMonthSummery hMMonthSummery;
        HMWeekSummery hMWeekSummery;
        super.run();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.mWeekSummeryArrayList);
                if (lastIndex >= 0 && (hMWeekSummery = this.mWeekSummeryArrayList.get(lastIndex)) != null) {
                    HMWeekSummery.fillWeekSummary(hMWeekSummery);
                    this.mWeekSummeryArrayList.set(lastIndex, hMWeekSummery);
                }
                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(this.mMonthSummeryArrayList);
                if (lastIndex2 >= 0 && (hMMonthSummery = this.mMonthSummeryArrayList.get(lastIndex2)) != null) {
                    HMMonthSummery.fillMonth(hMMonthSummery);
                    this.mMonthSummeryArrayList.set(lastIndex2, hMMonthSummery);
                }
                HMLog.info(f, new a(jCurrentTimeMillis, this));
                eventBus = EventBus.getDefault();
                eventSummeryAnalysisJobFinished = new EventSummeryAnalysisJobFinished();
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.info(f, new b(e));
                eventBus = EventBus.getDefault();
                eventSummeryAnalysisJobFinished = new EventSummeryAnalysisJobFinished();
            }
            eventBus.post(eventSummeryAnalysisJobFinished);
        } catch (Throwable th) {
            EventBus.getDefault().post(new EventSummeryAnalysisJobFinished());
            throw th;
        }
    }
}
