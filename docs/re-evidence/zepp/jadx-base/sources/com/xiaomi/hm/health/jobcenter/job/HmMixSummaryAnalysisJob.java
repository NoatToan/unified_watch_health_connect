package com.xiaomi.hm.health.jobcenter.job;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import de.greenrobot.event.EventBus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B9\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0016\u0010\u001dR%\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmMixSummaryAnalysisJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "", GoogleApiAvailabilityLight.a, "e", "c", "f", "run", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDaySummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMWeekSummery;", "mWeekSummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMMonthSummery;", "mMonthSummeryArrayList", "", "Lkotlin/Lazy;", z.j, "()Ljava/lang/String;", "registerDate", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "g", "i", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "regisDay", "", "Lcom/xiaomi/hm/health/databases/model/DateData;", "h", "()Ljava/util/List;", "dataList", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "earbudDataList", "", "workType", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;I)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmMixSummaryAnalysisJob extends ThreadJobObject {

    @NotNull
    private static final String j = "HmMixSummaryAnalysisJob";
    private static final int k = 6;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy regisDay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "registerDay:" + HmMixSummaryAnalysisJob.this.j() + ",offsetMonth:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "registerDay:" + HmMixSummaryAnalysisJob.this.j() + ",offsetWeek:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "remove first sunday";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/DateData;", "kotlin.jvm.PlatformType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<DateData>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<DateData> getA() {
            return HMDaoManager.getInstance().getDateDataDao().queryBuilder().orderDesc(DateDataDao.Properties.Date).list();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "kotlin.jvm.PlatformType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<List<EarbudDateData>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<EarbudDateData> getA() {
            return HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().orderDesc(EarbudDateDataDao.Properties.Date).list();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SportDay;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<SportDay> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportDay getA() {
            return SportDay.fromString(HmMixSummaryAnalysisJob.this.j());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMDateUtil.formatDateSimple(HMDateUtil.getCreateTime().longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "没有summery数据，直接返回 : registerDate " + HmMixSummaryAnalysisJob.this.j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List listG = HmMixSummaryAnalysisJob.this.g();
            return "DateDataDao data节点,总共有数据：" + (listG == null ? 0 : listG.size()) + ";registerDate = " + HmMixSummaryAnalysisJob.this.j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List listH = HmMixSummaryAnalysisJob.this.h();
            return "EarbudDateDataDao data节点,总共有数据：" + (listH == null ? 0 : listH.size()) + ";registerDate = " + HmMixSummaryAnalysisJob.this.j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ HmMixSummaryAnalysisJob b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, HmMixSummaryAnalysisJob hmMixSummaryAnalysisJob) {
            super(0);
            this.a = j;
            this.b = hmMixSummaryAnalysisJob;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "分析活动结束，summery组装完成********************************* used :" + (System.currentTimeMillis() - this.a) + ";size day = " + this.b.mDaySummeryArrayList.size() + ";day = " + this.b.mDaySummeryArrayList.size() + ";wk = " + this.b.mWeekSummeryArrayList.size() + ";mon = " + this.b.mMonthSummeryArrayList.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Exception exc) {
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

    public HmMixSummaryAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList, @NotNull CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList2, @NotNull CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList3, int i2) {
        super(i2);
        this.mDaySummeryArrayList = copyOnWriteArrayList;
        this.mWeekSummeryArrayList = copyOnWriteArrayList2;
        this.mMonthSummeryArrayList = copyOnWriteArrayList3;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList2.clear();
        copyOnWriteArrayList3.clear();
        this.registerDate = LazyKt__LazyJVMKt.lazy(h.a);
        this.regisDay = LazyKt__LazyJVMKt.lazy(new g());
        this.dataList = LazyKt__LazyJVMKt.lazy(e.a);
        this.earbudDataList = LazyKt__LazyJVMKt.lazy(f.a);
    }

    private final void c() {
        this.mDaySummeryArrayList.clear();
        int iOffsetDay = SportDay.getToday().offsetDay(i());
        HMLog.info(j, new a(iOffsetDay));
        SportDay sportDayFromString = SportDay.fromString(j());
        if (iOffsetDay < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList = this.mDaySummeryArrayList;
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
        this.mMonthSummeryArrayList.clear();
        int iOffsetMonth = SportDay.getToday().offsetMonth(i());
        HMLog.info(j, new b(iOffsetMonth));
        if (iOffsetMonth < 0) {
            return;
        }
        int i2 = iOffsetMonth;
        while (true) {
            int i3 = i2 - 1;
            HMMonthSummery hMMonthSummery = new HMMonthSummery();
            CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList = this.mMonthSummeryArrayList;
            HMMonthSummery hMMonthSummery2 = new HMMonthSummery();
            hMMonthSummery2.monthStartDate = i2 == iOffsetMonth ? j() : HMDateUtil.getMonthStart(-i2);
            hMMonthSummery2.monthEndDate = i2 == 0 ? SportDay.getToday().getKey() : HMDateUtil.getMonthEnd(-i2);
            hMMonthSummery2.month = String.valueOf(SportDay.fromString(hMMonthSummery.monthStartDate).mon + 1);
            Unit unit = Unit.INSTANCE;
            copyOnWriteArrayList.add(hMMonthSummery2);
            if (i3 < 0) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private final void e() {
        this.mWeekSummeryArrayList.clear();
        int iOffsetWeek = SportDay.getToday().offsetWeek(i());
        HMLog.info(j, new c(iOffsetWeek));
        if (iOffsetWeek < 0) {
            return;
        }
        int i2 = iOffsetWeek;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0 && SportDay.getToday().getWeek() == 6) {
                HMLog.debug(j, d.a);
            } else {
                CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList = this.mWeekSummeryArrayList;
                HMWeekSummery hMWeekSummery = new HMWeekSummery();
                hMWeekSummery.weekStartDate = i2 == iOffsetWeek ? j() : HMDateUtil.getWeekStartDate(-i2);
                hMWeekSummery.weekEndDate = i2 == 0 ? SportDay.getToday().getKey() : HMDateUtil.getWeekEndDate(-i2);
                Unit unit = Unit.INSTANCE;
                copyOnWriteArrayList.add(hMWeekSummery);
            }
            if (i3 < 0) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private final void f() {
        HMSummery specifyDaySummary;
        for (HMSummery hMSummery : this.mDaySummeryArrayList) {
            boolean isEarbud = HmEarbudDateDataUtil.INSTANCE.getSelectData(hMSummery.date).getIsEarbud();
            HMSummery specifyDaySummary2 = HMDataCacheCenter.getInstance().getmBandUint().getSpecifyDaySummary(hMSummery.date);
            if (specifyDaySummary2 != null) {
                hMSummery.steps = specifyDaySummary2.steps;
                hMSummery.pai = specifyDaySummary2.pai;
                hMSummery.goal = specifyDaySummary2.goal;
                hMSummery.nap = specifyDaySummary2.nap;
                hMSummery.mStatus = 1;
                if (!isEarbud) {
                    hMSummery.sleep = specifyDaySummary2.sleep;
                }
            }
            if (isEarbud && (specifyDaySummary = HMDataCacheCenter.getInstance().getEarbudUnit().getSpecifyDaySummary(hMSummery.date)) != null) {
                hMSummery.sleep = specifyDaySummary.sleep;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DateData> g() {
        return (List) this.dataList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EarbudDateData> h() {
        return (List) this.earbudDataList.getValue();
    }

    private final SportDay i() {
        return (SportDay) this.regisDay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j() {
        return (String) this.registerDate.getValue();
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        EventBus eventBus;
        EventSummeryAnalysisJobFinished eventSummeryAnalysisJobFinished;
        super.run();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                d();
                e();
                c();
                List<DateData> listG = g();
                if (listG == null || listG.isEmpty()) {
                    List<EarbudDateData> listH = h();
                    if (listH == null || listH.isEmpty()) {
                        HMLog.info(j, new i());
                        EventBus.getDefault().post(new EventSummeryAnalysisJobFinished());
                        return;
                    }
                }
                HMLog.info(j, new j());
                HMLog.info(j, new k());
                f();
                Iterator<T> it2 = this.mWeekSummeryArrayList.iterator();
                while (it2.hasNext()) {
                    HMWeekSummery.fillWeekSummary((HMWeekSummery) it2.next());
                }
                Iterator<T> it3 = this.mMonthSummeryArrayList.iterator();
                while (it3.hasNext()) {
                    HMMonthSummery.fillMonth((HMMonthSummery) it3.next());
                }
                HMDataCacheCenter.getInstance().calculateReachGoalDays();
                HMLog.info(j, new l(jCurrentTimeMillis, this));
                eventBus = EventBus.getDefault();
                eventSummeryAnalysisJobFinished = new EventSummeryAnalysisJobFinished();
            } catch (Exception e2) {
                e2.printStackTrace();
                HMLog.info(j, new m(e2));
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
