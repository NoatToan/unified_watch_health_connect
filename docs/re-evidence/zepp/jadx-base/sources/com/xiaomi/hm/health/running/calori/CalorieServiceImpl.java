package com.xiaomi.hm.health.running.calori;

import android.text.TextUtils;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.app.calorie.service.CalorieEntry;
import com.app.calorie.service.CalorieService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.step.utils.StepTimeUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.running.EnergyDataProvider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CalorieServiceImpl;", "Lcom/app/calorie/service/CalorieService;", "", "date", "", GoogleApiAvailabilityLight.a, "", "time", "b", "", "Lcom/app/calorie/service/CalorieEntry;", "activity", "sport", "a", "Ljava/util/Date;", "start", "end", "c", "checkCalorie", "Lkotlinx/coroutines/flow/Flow;", "loadCalories", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "calorieServiceScope", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CalorieServiceImpl implements CalorieService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope calorieServiceScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.running.calori.CalorieServiceImpl$checkCalorie$1", f = "CalorieServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ CalorieServiceImpl d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.running.calori.CalorieServiceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0996a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0996a(String str, String str2) {
                super(0);
                this.a = str;
                this.b = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "查询卡路里数据 开始日期-" + this.a + " 结束日期-" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, CalorieServiceImpl calorieServiceImpl, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = date;
            this.c = date2;
            this.d = calorieServiceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b.getTime() > this.c.getTime()) {
                return Unit.INSTANCE;
            }
            String strB = this.d.b(this.b.getTime());
            String strB2 = this.d.b(this.c.getTime());
            HMLog.info("CalorieServiceImpl", new C0996a(strB, strB2));
            QueryBuilder<DateData> queryBuilder = HMDaoManager.getInstance().getDateDataDao().queryBuilder();
            Property property = DateDataDao.Properties.Date;
            List<DateData> list = queryBuilder.where(property.ge(strB), property.le(strB2)).build().list();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.b.getTime());
            while (!Intrinsics.areEqual(strB, strB2)) {
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Boxing.boxBoolean(Intrinsics.areEqual(((DateData) next).getDate(), strB)).booleanValue());
                DateData dateData = (DateData) next;
                if (dateData != null && TextUtils.isEmpty(dateData.getStageStepsSummary())) {
                    this.d.d(strB);
                }
                calendar.add(6, 1);
                strB = this.d.b(calendar.getTimeInMillis());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<CalorieEntry> a;
        public final /* synthetic */ List<CalorieEntry> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<CalorieEntry> list, List<CalorieEntry> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List<CalorieEntry> list = this.a;
            Integer numValueOf = list == null ? null : Integer.valueOf(list.size());
            List<CalorieEntry> list2 = this.b;
            return "combineList start getCalorieData-" + numValueOf + "--" + (list2 != null ? Integer.valueOf(list2.size()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<CalorieEntry> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<CalorieEntry> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "combineList end getCalorieData-" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/app/calorie/service/CalorieEntry;", "activity", "sport", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.running.calori.CalorieServiceImpl$loadCalories$1", f = "CalorieServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<List<? extends CalorieEntry>, List<? extends CalorieEntry>, Continuation<? super List<? extends CalorieEntry>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable List<CalorieEntry> list, @Nullable List<CalorieEntry> list2, @Nullable Continuation<? super List<CalorieEntry>> continuation) {
            d dVar = CalorieServiceImpl.this.new d(continuation);
            dVar.b = list;
            dVar.c = list2;
            return dVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CalorieServiceImpl.this.a((List) this.b, (List) this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/app/calorie/service/CalorieEntry;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<? extends CalorieEntry>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Date a;
            public final /* synthetic */ Date b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Date date, Date date2) {
                super(0);
                this.a = date;
                this.b = date2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "DateDataDao getCalorieData-" + this.a + "--" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Date date, Date date2) {
            super(0);
            this.b = date;
            this.c = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends CalorieEntry> getA() {
            HMLog.info("CalorieServiceImpl", new a(this.b, this.c));
            return CalorieServiceImpl.this.c(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/app/calorie/service/CalorieEntry;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<List<? extends CalorieEntry>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Date a;
            public final /* synthetic */ Date b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Date date, Date date2) {
                super(0);
                this.a = date;
                this.b = date2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "TrainingRecordDao getCalorieData-" + this.a + "--" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Date date, Date date2) {
            super(0);
            this.b = date;
            this.c = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends CalorieEntry> getA() {
            HMLog.info("CalorieServiceImpl", new a(this.b, this.c));
            return CalorieServiceImpl.this.c(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "start job " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CalorieEntry> a(List<CalorieEntry> activity, List<CalorieEntry> sport) {
        HMLog.info("CalorieServiceImpl", new b(activity, sport));
        ArrayList arrayList = new ArrayList();
        long time = 0;
        long time2 = (activity != null && (activity.isEmpty() ^ true)) ? ((CalorieEntry) CollectionsKt.first((List) activity)).getTime() : 0L;
        if (sport != null && (!sport.isEmpty())) {
            time = ((CalorieEntry) CollectionsKt.first((List) sport)).getTime();
        }
        if (time2 > time) {
            if (activity != null) {
                arrayList.addAll(activity);
            }
        } else if (time2 < time) {
            if (sport != null) {
                arrayList.addAll(sport);
            }
        } else if (time2 == time && activity != null) {
            arrayList.addAll(activity);
        }
        HMLog.info("CalorieServiceImpl", new c(arrayList));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(long time) {
        return StepTimeUtils.INSTANCE.formatDate(time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CalorieEntry> c(Date start, Date end) {
        float weight;
        float f2;
        int age;
        EnergyDataProvider energyDataProvider = new EnergyDataProvider();
        energyDataProvider.setFilterType(SportFilterType.WEEK);
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        if (userInfo.getGender() == 1) {
            weight = 67 + (userInfo.getWeight() * 13.73f) + (userInfo.getHeight() * 5);
            f2 = 6.9f;
            age = userInfo.getAge();
        } else {
            weight = 661 + (userInfo.getWeight() * 9.6f) + (userInfo.getHeight() * 1.72f);
            f2 = 4.7f;
            age = userInfo.getAge();
        }
        float f3 = weight - (age * f2);
        List<EnergyDataProvider.EnergyData> listLoadDayOfCalorie = energyDataProvider.loadDayOfCalorie(start.getTime(), end.getTime());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadDayOfCalorie, 10));
        for (EnergyDataProvider.EnergyData energyData : listLoadDayOfCalorie) {
            arrayList.add(new CalorieEntry(energyData.getStartTime(), (int) energyData.getCal(), energyData.getCal() / (energyData.getCal() + f3)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String date) {
        HMLog.info("CalorieServiceImpl", new g(date));
        HMDataCacheCenter.getInstance().getmBandUint().checkDateDataDownloadStatus(SportDay.fromString(date));
        new HMDataAnalisisJob(date, 0, HMDeviceType.MILI.getValue(), 0).start();
    }

    @Override // com.app.calorie.service.CalorieService
    public void checkCalorie(@NotNull Date start, @NotNull Date end) {
        kotlinx.coroutines.e.f(this.calorieServiceScope, null, null, new a(start, end, this, null), 3, null);
    }

    @Override // com.app.calorie.service.CalorieService
    @NotNull
    public Flow<List<CalorieEntry>> loadCalories(@NotNull Date start, @NotNull Date end) {
        return FlowKt.flowCombine(FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA"}, new e(start, end))), FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"TRAINING_RECORD"}, new f(start, end))), new d(null));
    }
}
