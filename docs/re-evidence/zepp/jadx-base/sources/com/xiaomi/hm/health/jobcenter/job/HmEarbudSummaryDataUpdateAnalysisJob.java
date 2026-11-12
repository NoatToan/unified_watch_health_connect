package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HMDateUtil;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudSummaryDataUpdateAnalysisJob;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.HMMonthSummery;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.HMWeekSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B]\b\u0016\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*¢\u0006\u0004\b,\u0010-BW\b\u0016\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b,\u00100J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000f\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0011\u0010#¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmEarbudSummaryDataUpdateAnalysisJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "dayData", "", "oldSummary", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "summaryList", "", "g", "run", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mEarbudDaySummaryArrayList", GoogleApiAvailabilityLight.a, "mBandDaySummaryArrayList", "e", "mDaySummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMWeekSummery;", "f", "mWeekSummeryArrayList", "Lcom/xiaomi/hm/health/model/summery/HMMonthSummery;", "mMonthSummeryArrayList", "Ljava/util/ArrayList;", "h", "Ljava/util/ArrayList;", "syncDayList", "Lcom/xiaomi/hm/health/databases/model/DateDataDao;", "i", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/databases/model/DateDataDao;", "dao", "Lcom/xiaomi/hm/health/databases/model/EarbudDateDataDao;", z.j, "()Lcom/xiaomi/hm/health/databases/model/EarbudDateDataDao;", "earbudDao", "earbudDaySummaryArrayList", "bandDaySummaryArrayList", "summeryArrayList", "weekSummeryArrayList", "monthSummeryArrayList", "", "dsdList", "<init>", "(Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/List;)V", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "day", "(Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Ljava/util/concurrent/CopyOnWriteArrayList;Lcom/xiaomi/hm/health/dataprocess/SportDay;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudSummaryDataUpdateAnalysisJob extends ThreadJobObject {

    @NotNull
    private static final String k = "HMSummeryDataUpdateAnalisisJob";
    private static final int l = 6;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mEarbudDaySummaryArrayList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mBandDaySummaryArrayList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMSummery> mDaySummeryArrayList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMWeekSummery> mWeekSummeryArrayList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<HMMonthSummery> mMonthSummeryArrayList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<DaySportData> syncDayList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy dao;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy earbudDao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/DateDataDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DateDataDao> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DateDataDao getA() {
            return HMDaoManager.getInstance().getDateDataDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/EarbudDateDataDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<EarbudDateDataDao> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudDateDataDao getA() {
            return HMDaoManager.getInstance().getEarbudDateDataDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步的最大日期，仍在最后当前月数据范围内，更新该月的数据即可";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMonthSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMMonthSummery hMMonthSummery) {
            super(0);
            this.a = hMMonthSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "本月最新活动数据如下：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步的最大日期，不在最后一月数据范围内，更新该月的数据，添加下个月的数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMonthSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMMonthSummery hMMonthSummery) {
            super(0);
            this.a = hMMonthSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "本月最新活动数据如下：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMonthSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMMonthSummery hMMonthSummery) {
            super(0);
            this.a = hMMonthSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "新增月活动数据如下：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "分析活动结束，summery组装完成********************************* time used : " + (System.currentTimeMillis() - this.a);
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
            return "error in update summary " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ SportDay a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SportDay sportDay) {
            super(0);
            this.a = sportDay;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            SportDay sportDay = this.a;
            return "maxDay = " + (sportDay == null ? null : sportDay.getKey());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "maxDay is null,error in update";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "update error recentWeek is null,list is empty ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ HMWeekSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HMWeekSummery hMWeekSummery) {
            super(0);
            this.a = hMWeekSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "同步的最大日期，仍在最后一周数据范围内，更新该周的数据即可\nold data" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ HMWeekSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMWeekSummery hMWeekSummery) {
            super(0);
            this.a = hMWeekSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "更新该周数据结束\nnew data" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "offsetWeekTotal : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "remove first sunday";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMonthSummery a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(HMMonthSummery hMMonthSummery) {
            super(0);
            this.a = hMMonthSummery;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "该月老数据：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<HMSummery> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Ref.ObjectRef<HMSummery> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "更新day数据： " + this.a.element;
        }
    }

    public HmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList, @NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList2, @NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList3, @NotNull CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList4, @NotNull CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList5, @NotNull List<? extends DaySportData> list) {
        super(4);
        ArrayList<DaySportData> arrayList = new ArrayList<>();
        this.syncDayList = arrayList;
        this.dao = LazyKt__LazyJVMKt.lazy(a.a);
        this.earbudDao = LazyKt__LazyJVMKt.lazy(b.a);
        this.mEarbudDaySummaryArrayList = copyOnWriteArrayList;
        this.mBandDaySummaryArrayList = copyOnWriteArrayList2;
        this.mDaySummeryArrayList = copyOnWriteArrayList3;
        this.mWeekSummeryArrayList = copyOnWriteArrayList4;
        this.mMonthSummeryArrayList = copyOnWriteArrayList5;
        arrayList.addAll(list);
    }

    private final DateDataDao d() {
        return (DateDataDao) this.dao.getValue();
    }

    private final EarbudDateDataDao e() {
        return (EarbudDateDataDao) this.earbudDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(DaySportData daySportData, DaySportData daySportData2) {
        return daySportData.getSportDay().offsetDay(daySportData2.getSportDay());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.xiaomi.hm.health.model.summery.HMSummery] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    private final void g(DaySportData dayData, String oldSummary, CopyOnWriteArrayList<HMSummery> summaryList) {
        T next;
        boolean z;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Iterator it2 = summaryList.iterator();
        do {
            if (!it2.hasNext()) {
                next = 0;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((HMSummery) next).date, dayData.getKey()));
        objectRef.element = next;
        if (next == 0) {
            ?? hMSummery = new HMSummery();
            hMSummery.date = dayData.getKey();
            Unit unit = Unit.INSTANCE;
            objectRef.element = hMSummery;
            z = true;
        } else {
            z = false;
        }
        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(dayData.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
        if (manualDataUnique == null || TextUtils.isEmpty(manualDataUnique.getSummary()) || !Utils.isManualDataSlpValid(manualDataUnique.getSummary(), oldSummary)) {
            HMSummery.parseDBSummery((HMSummery) objectRef.element, oldSummary);
        } else {
            HMSummery.parseUsrSummery((HMSummery) objectRef.element, oldSummary, manualDataUnique.getSummary());
        }
        HMLog.info(k, new r(objectRef));
        if (z) {
            return;
        }
        summaryList.add(objectRef.element);
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        EventBus eventBus;
        EventSummeryAnalysisJobFinished eventSummeryAnalysisJobFinished;
        EventBus eventBus2;
        EventSummeryAnalysisJobFinished eventSummeryAnalysisJobFinished2;
        Object obj;
        Object next;
        Object next2;
        Sleep sleep;
        HMSummery hMSummery;
        super.run();
        try {
            if (this.syncDayList.isEmpty()) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                DaySportData daySportData = (DaySportData) CollectionsKt.maxWithOrNull(this.syncDayList, new Comparator() { // from class: j74
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return HmEarbudSummaryDataUpdateAnalysisJob.f((DaySportData) obj2, (DaySportData) obj3);
                    }
                });
                String str = null;
                SportDay sportDay = daySportData == null ? null : daySportData.getSportDay();
                Iterator<T> it2 = this.syncDayList.iterator();
                while (true) {
                    boolean z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    DaySportData daySportData2 = (DaySportData) it2.next();
                    DateData dateDataLoad = d().load(daySportData2.getKey());
                    if (dateDataLoad != null) {
                        g(daySportData2, dateDataLoad.getSummary(), this.mBandDaySummaryArrayList);
                    }
                    EarbudDateData earbudDateDataLoad = e().load(daySportData2.getKey());
                    if (earbudDateDataLoad != null) {
                        g(daySportData2, earbudDateDataLoad.getSummary(), this.mEarbudDaySummaryArrayList);
                    }
                    Iterator<T> it3 = this.mDaySummeryArrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next3 = it3.next();
                        if (Intrinsics.areEqual(((HMSummery) next3).date, daySportData2.getKey())) {
                            obj = next3;
                            break;
                        }
                    }
                    Iterator<T> it4 = this.mBandDaySummaryArrayList.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!Intrinsics.areEqual(((HMSummery) next).date, daySportData2.getKey()));
                    HMSummery hMSummery2 = (HMSummery) next;
                    Iterator<T> it5 = this.mEarbudDaySummaryArrayList.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (!Intrinsics.areEqual(((HMSummery) next2).date, daySportData2.getKey()));
                    HMSummery hMSummery3 = (HMSummery) next2;
                    Object obj2 = obj;
                    if (obj == null) {
                        hMSummery = new HMSummery();
                        hMSummery.date = daySportData2.getKey();
                        Unit unit = Unit.INSTANCE;
                        z = true;
                    }
                    if (hMSummery2 == null) {
                        obj2 = hMSummery;
                    } else {
                        obj2 = hMSummery;
                        ((HMSummery) obj2).pai = hMSummery2.pai;
                        ((HMSummery) obj2).mStatus = hMSummery2.mStatus;
                        ((HMSummery) obj2).goal = hMSummery2.goal;
                        ((HMSummery) obj2).steps = hMSummery2.steps;
                        ((HMSummery) obj2).nap = hMSummery2.nap;
                    }
                    HMSummery hMSummery4 = (HMSummery) obj2;
                    if (HmEarbudDateDataUtil.INSTANCE.getSelectData(daySportData2.getKey()).getIsEarbud()) {
                        sleep = hMSummery3 == null ? null : hMSummery3.sleep;
                    } else if (hMSummery2 != null) {
                        sleep = hMSummery2.sleep;
                    }
                    hMSummery4.sleep = sleep;
                    if (z) {
                        this.mDaySummeryArrayList.add((HMSummery) obj2);
                    }
                }
                HMDataCacheCenter.getInstance().calculateReachGoalDays();
                String str2 = k;
                HMLog.debug(str2, new j(sportDay));
                if (sportDay == null) {
                    HMLog.info(str2, k.a);
                    eventBus2 = EventBus.getDefault();
                    eventSummeryAnalysisJobFinished2 = new EventSummeryAnalysisJobFinished();
                } else {
                    HMWeekSummery hMWeekSummery = (HMWeekSummery) CollectionsKt.lastOrNull((List) this.mWeekSummeryArrayList);
                    if ((hMWeekSummery == null ? null : hMWeekSummery.weekEndDate) == null) {
                        HMLog.debug(str2, l.a);
                        eventBus2 = EventBus.getDefault();
                        eventSummeryAnalysisJobFinished2 = new EventSummeryAnalysisJobFinished();
                    } else {
                        if (sportDay.offsetWeek(SportDay.fromString(hMWeekSummery.weekEndDate)) == 0) {
                            HMLog.debug(str2, new m(hMWeekSummery));
                            hMWeekSummery.weekEndDate = SportDay.getToday().getKey();
                            HMWeekSummery.fillWeekSummary(hMWeekSummery);
                            HMLog.debug(str2, new n(hMWeekSummery));
                        } else {
                            this.mWeekSummeryArrayList.clear();
                            String dateSimple = HMDateUtil.formatDateSimple(HMDateUtil.getCreateTime().longValue());
                            int iOffsetWeek = SportDay.getToday().offsetWeek(SportDay.fromString(dateSimple));
                            HMLog.debug(str2, new o(iOffsetWeek));
                            if (iOffsetWeek >= 0) {
                                int i2 = iOffsetWeek;
                                while (true) {
                                    int i3 = i2 - 1;
                                    HMWeekSummery hMWeekSummery2 = new HMWeekSummery();
                                    hMWeekSummery2.weekStartDate = i2 == iOffsetWeek ? dateSimple : HMDateUtil.getWeekStartDate(-i2);
                                    hMWeekSummery2.weekEndDate = i2 == 0 ? SportDay.getToday().getKey() : HMDateUtil.getWeekEndDate(-i2);
                                    if (i2 == 0 && SportDay.getToday().getWeek() == l) {
                                        HMLog.debug(k, p.a);
                                    } else {
                                        this.mWeekSummeryArrayList.add(hMWeekSummery2);
                                        HMWeekSummery.fillWeekSummary(hMWeekSummery2);
                                    }
                                    if (i3 < 0) {
                                        break;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                            }
                        }
                        HMMonthSummery hMMonthSummery = (HMMonthSummery) CollectionsKt.lastOrNull((List) this.mMonthSummeryArrayList);
                        String str3 = k;
                        HMLog.debug(str3, new q(hMMonthSummery));
                        if (hMMonthSummery != null) {
                            str = hMMonthSummery.monthEndDate;
                        }
                        if (str != null) {
                            if (sportDay.offsetMonth(SportDay.fromString(hMMonthSummery.monthEndDate)) == 0) {
                                HMLog.debug(str3, c.a);
                                hMMonthSummery.monthEndDate = SportDay.getToday().getKey();
                                HMMonthSummery.fillMonth(hMMonthSummery);
                                HMLog.debug(str3, new d(hMMonthSummery));
                            } else {
                                HMLog.debug(str3, e.a);
                                hMMonthSummery.monthEndDate = HMDateUtil.getMonthEnd(-1);
                                HMMonthSummery.fillMonth(hMMonthSummery);
                                HMLog.debug(str3, new f(hMMonthSummery));
                                HMMonthSummery hMMonthSummery2 = new HMMonthSummery();
                                hMMonthSummery2.monthStartDate = HMDateUtil.getMonthStart(0);
                                hMMonthSummery2.monthEndDate = SportDay.getToday().getKey();
                                this.mMonthSummeryArrayList.add(HMMonthSummery.fillMonth(hMMonthSummery2));
                                HMLog.debug(str3, new g(hMMonthSummery));
                            }
                            HMLog.debug(str3, new h(jCurrentTimeMillis));
                            eventBus = EventBus.getDefault();
                            eventSummeryAnalysisJobFinished = new EventSummeryAnalysisJobFinished();
                            eventBus.post(eventSummeryAnalysisJobFinished);
                            return;
                        }
                        eventBus2 = EventBus.getDefault();
                        eventSummeryAnalysisJobFinished2 = new EventSummeryAnalysisJobFinished();
                    }
                }
                eventBus2.post(eventSummeryAnalysisJobFinished2);
            } catch (Exception e2) {
                e2.printStackTrace();
                HMLog.info(k, new i(e2));
                eventBus = EventBus.getDefault();
                eventSummeryAnalysisJobFinished = new EventSummeryAnalysisJobFinished();
            }
        } catch (Throwable th) {
            EventBus.getDefault().post(new EventSummeryAnalysisJobFinished());
            throw th;
        }
    }

    public HmEarbudSummaryDataUpdateAnalysisJob(@NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList, @NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList2, @NotNull CopyOnWriteArrayList<HMSummery> copyOnWriteArrayList3, @NotNull CopyOnWriteArrayList<HMWeekSummery> copyOnWriteArrayList4, @NotNull CopyOnWriteArrayList<HMMonthSummery> copyOnWriteArrayList5, @NotNull SportDay sportDay) {
        super(4);
        ArrayList<DaySportData> arrayList = new ArrayList<>();
        this.syncDayList = arrayList;
        this.dao = LazyKt__LazyJVMKt.lazy(a.a);
        this.earbudDao = LazyKt__LazyJVMKt.lazy(b.a);
        this.mEarbudDaySummaryArrayList = copyOnWriteArrayList;
        this.mBandDaySummaryArrayList = copyOnWriteArrayList2;
        this.mDaySummeryArrayList = copyOnWriteArrayList3;
        this.mWeekSummeryArrayList = copyOnWriteArrayList4;
        this.mMonthSummeryArrayList = copyOnWriteArrayList5;
        arrayList.add(new DaySportData(sportDay));
    }
}
