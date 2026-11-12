package com.xiaomi.hm.health.jobcenter.job;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.eventbus.EventEarbudSummaryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u001dR%\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmEarbudSummaryDataInitAnalysisJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "", "c", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/databases/model/ManualData;", "", "summary", "", "i", "run", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mEarbudDaySummaryArrayList", "", LogUtil.I, "mSummaryAnalysisType", "e", "Lkotlin/Lazy;", "h", "()Ljava/lang/String;", "registerDate", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "f", "g", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "regisDay", "Lcom/xiaomi/hm/health/databases/model/ManualDataDao;", "()Lcom/xiaomi/hm/health/databases/model/ManualDataDao;", "manualDao", "", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "()Ljava/util/List;", "earbudDataList", "type", "workType", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;II)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudSummaryDataInitAnalysisJob extends ThreadJobObject {

    @NotNull
    private static final String i = "HmEarbudSummaryDataInitAnalysisJob";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mEarbudDaySummaryArrayList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mSummaryAnalysisType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy regisDay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy manualDao;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy earbudDataList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            int i = this.a;
            return "registerDay:" + i + ",offsetWeek:" + i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "kotlin.jvm.PlatformType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<EarbudDateData>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<EarbudDateData> getA() {
            return HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().orderDesc(EarbudDateDataDao.Properties.Date).list();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/ManualDataDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ManualDataDao> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualDataDao getA() {
            return HMDaoManager.getInstance().getManualDataDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SportDay;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SportDay> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportDay getA() {
            return SportDay.fromString(HmEarbudSummaryDataInitAnalysisJob.this.h());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMDateUtil.formatDateSimple(HMDateUtil.getCreateTime().longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "没有summery数据，直接返回 : registerDate " + HmEarbudSummaryDataInitAnalysisJob.this.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List listE = HmEarbudSummaryDataInitAnalysisJob.this.e();
            return "EarbudDateDataDao data节点,总共有数据：" + (listE == null ? 0 : listE.size()) + ";registerDate = " + HmEarbudSummaryDataInitAnalysisJob.this.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ HmEarbudSummaryDataInitAnalysisJob b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j, HmEarbudSummaryDataInitAnalysisJob hmEarbudSummaryDataInitAnalysisJob) {
            super(0);
            this.a = j;
            this.b = hmEarbudSummaryDataInitAnalysisJob;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "分析活动结束，summery组装完成********************************* used :" + (System.currentTimeMillis() - this.a) + "earbudDay = " + this.b.mEarbudDaySummaryArrayList.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "分析活动结束，summery组装完成********************************* error :" + this.a.getMessage();
        }
    }

    public HmEarbudSummaryDataInitAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList, int i2, int i3) {
        super(i3);
        this.mEarbudDaySummaryArrayList = copyOnWriteArrayList;
        this.registerDate = LazyKt__LazyJVMKt.lazy(e.a);
        this.regisDay = LazyKt__LazyJVMKt.lazy(new d());
        this.manualDao = LazyKt__LazyJVMKt.lazy(c.a);
        this.earbudDataList = LazyKt__LazyJVMKt.lazy(b.a);
        copyOnWriteArrayList.clear();
        this.mSummaryAnalysisType = i2;
    }

    private final void c() {
        int iOffsetDay = SportDay.getToday().offsetDay(g());
        HMLog.info(i, new a(iOffsetDay));
        SportDay sportDayFromString = SportDay.fromString(h());
        if (iOffsetDay < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList = this.mEarbudDaySummaryArrayList;
            HMSummery hMSummery = new HMSummery();
            hMSummery.date = sportDayFromString.getKey();
            Unit unit = Unit.INSTANCE;
            copyOnWriteArrayList.add(hMSummery);
            sportDayFromString = sportDayFromString.getNextDay();
            if (i2 == iOffsetDay) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private final void d() {
        Object next;
        EarbudDateData earbudDateData;
        HmEarbudSummaryDataInitAnalysisJob hmEarbudSummaryDataInitAnalysisJob = this;
        Iterator it2 = hmEarbudSummaryDataInitAnalysisJob.mEarbudDaySummaryArrayList.iterator();
        while (it2.hasNext()) {
            HMSummery hMSummery = (HMSummery) it2.next();
            HMSummery hMSummery2 = new HMSummery();
            hMSummery2.date = hMSummery.date;
            List<EarbudDateData> listE = e();
            if (listE == null) {
                earbudDateData = null;
            } else {
                Iterator<T> it3 = listE.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(((EarbudDateData) next).getDate(), hMSummery.date));
                earbudDateData = (EarbudDateData) next;
            }
            ManualData manualDataUnique = f().queryBuilder().where(ManualDataDao.Properties.Date.eq(hMSummery.date), new WhereCondition[0]).unique();
            if (earbudDateData != null || hmEarbudSummaryDataInitAnalysisJob.i(manualDataUnique, null)) {
                if (hmEarbudSummaryDataInitAnalysisJob.i(manualDataUnique, earbudDateData == null ? null : earbudDateData.getSummary())) {
                    HMSummery.parseUsrSummery(hMSummery2, earbudDateData != null ? earbudDateData.getSummary() : null, manualDataUnique.getSummary());
                } else {
                    HMSummery.parseDBSummery(hMSummery2, earbudDateData != null ? earbudDateData.getSummary() : null);
                }
                hMSummery.goal = hMSummery2.goal;
                hMSummery.mStatus = 1;
                Sleep sleep = hMSummery2.sleep;
                if (sleep != null) {
                    hMSummery.sleep = new Sleep(sleep.lt, sleep.st, sleep.wk, sleep.dp, sleep.ed, sleep.rhr, sleep.is, sleep.lb, sleep.dt, sleep.score, sleep.wc);
                }
                hmEarbudSummaryDataInitAnalysisJob = this;
                it2 = it2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EarbudDateData> e() {
        return (List) this.earbudDataList.getValue();
    }

    private final ManualDataDao f() {
        return (ManualDataDao) this.manualDao.getValue();
    }

    private final SportDay g() {
        return (SportDay) this.regisDay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h() {
        return (String) this.registerDate.getValue();
    }

    private final boolean i(ManualData manualData, String str) {
        if (manualData == null) {
            return false;
        }
        return Utils.isManualDataSlpValid(manualData.getSummary(), str);
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        EventBus eventBus;
        EventEarbudSummaryAnalysisJobFinished eventEarbudSummaryAnalysisJobFinished;
        super.run();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c();
                List<EarbudDateData> listE = e();
                if (listE == null || listE.isEmpty()) {
                    HMLog.info(i, new f());
                    EventBus.getDefault().post(new EventEarbudSummaryAnalysisJobFinished(this.mSummaryAnalysisType));
                    return;
                }
                HMLog.info(i, new g());
                d();
                HMDataCacheCenter.getInstance().calculateReachGoalDays();
                HMLog.info(i, new h(jCurrentTimeMillis, this));
                eventBus = EventBus.getDefault();
                eventEarbudSummaryAnalysisJobFinished = new EventEarbudSummaryAnalysisJobFinished(this.mSummaryAnalysisType);
                eventBus.post(eventEarbudSummaryAnalysisJobFinished);
            } catch (Exception e2) {
                e2.printStackTrace();
                HMLog.info(i, new i(e2));
                eventBus = EventBus.getDefault();
                eventEarbudSummaryAnalysisJobFinished = new EventEarbudSummaryAnalysisJobFinished(this.mSummaryAnalysisType);
            }
        } catch (Throwable th) {
            EventBus.getDefault().post(new EventEarbudSummaryAnalysisJobFinished(this.mSummaryAnalysisType));
            throw th;
        }
    }
}
