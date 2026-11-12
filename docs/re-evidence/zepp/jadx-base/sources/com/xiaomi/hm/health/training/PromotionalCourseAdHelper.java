package com.xiaomi.hm.health.training;

import android.annotation.SuppressLint;
import com.huami.ad.db.AdProvider;
import com.huami.ad.web.AdAPI;
import com.huami.tools.log.HMLog;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.PromotionDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.Promotion;
import com.huami.training.db.po.Training;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.PromotePlace;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.training.PromotionalCourseAdHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/training/PromotionalCourseAdHelper;", "", "", "adType", "", "c", "Lcom/huami/training/dto/PromotePlace;", "b", "loadPromotionalCourses", "a", "Ljava/lang/String;", "TAG", "TRAINING_PATTERN", "", "Ljava/util/List;", "AD_TYPES", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PromotionalCourseAdHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Train-PromotionalCourseAdHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TRAINING_PATTERN = "sport:(training|yoga|course):(\\d+)";

    @NotNull
    public static final PromotionalCourseAdHelper INSTANCE = new PromotionalCourseAdHelper();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final List<String> AD_TYPES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{AdAPI.TYPE_WALK_BKE, AdAPI.TYPE_RUN_INBKE, AdAPI.TYPE_RUN_OUTBKE, AdAPI.TYPE_RIDE_BKE, AdAPI.TYPE_FITNESS_BKE, AdAPI.TYPE_WALK_AKE, AdAPI.TYPE_RUN_INAKE, AdAPI.TYPE_RUN_OUTAKE, AdAPI.TYPE_RIDE_AKE});

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Set<Long> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Set<Long> set) {
            super(0);
            this.a = str;
            this.b = set;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "请求课程推广位数据为空, type: " + this.a + ", ids: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Set<Long> b;
        public final /* synthetic */ ApiResponse<Items<TrainingBean>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set<Long> set, ApiResponse<Items<TrainingBean>> apiResponse) {
            super(0);
            this.a = str;
            this.b = set;
            this.c = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "请求课程推广位数据失败, type: " + this.a + ", ids: " + this.b + ", msg: " + ((ApiErrorResponse) this.c).getErrorMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Set<Long> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Set<Long> set) {
            super(0);
            this.a = str;
            this.b = set;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "请求课程推广位数据成功，并成功插入训练数据库, type: " + this.a + ", ids: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.training.PromotionalCourseAdHelper$loadPromotionalCourses$1", f = "PromotionalCourseAdHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it2 = PromotionalCourseAdHelper.AD_TYPES.iterator();
            while (it2.hasNext()) {
                PromotionalCourseAdHelper.INSTANCE.c((String) it2.next());
            }
            return Unit.INSTANCE;
        }
    }

    private PromotionalCourseAdHelper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final PromotePlace b(String adType) {
        switch (adType.hashCode()) {
            case -1807925343:
                if (adType.equals(AdAPI.TYPE_RUN_OUTAKE)) {
                    return PromotePlace.AFTER_RUNNING_OUTDOOR;
                }
                return null;
            case -1807924382:
                if (adType.equals(AdAPI.TYPE_RUN_OUTBKE)) {
                    return PromotePlace.BEFORE_RUNNING_OUTDOOR;
                }
                return null;
            case -1525361228:
                if (adType.equals(AdAPI.TYPE_RIDE_AKE)) {
                    return PromotePlace.AFTER_CYCLING;
                }
                return null;
            case -1525360267:
                if (adType.equals(AdAPI.TYPE_RIDE_BKE)) {
                    return PromotePlace.BEFORE_CYCLING;
                }
                return null;
            case -479729790:
                if (adType.equals(AdAPI.TYPE_RUN_INAKE)) {
                    return PromotePlace.AFTER_RUNNING_INDOOR;
                }
                return null;
            case -479728829:
                if (adType.equals(AdAPI.TYPE_RUN_INBKE)) {
                    return PromotePlace.BEFORE_RUNNING_INDOOR;
                }
                return null;
            case 9838181:
                if (adType.equals(AdAPI.TYPE_FITNESS_BKE)) {
                    return PromotePlace.BEFORE_FITNESS;
                }
                return null;
            case 323235333:
                if (adType.equals(AdAPI.TYPE_WALK_AKE)) {
                    return PromotePlace.AFTER_RACE_WALKING;
                }
                return null;
            case 323236294:
                if (adType.equals(AdAPI.TYPE_WALK_BKE)) {
                    return PromotePlace.BEFORE_RACE_WALKING;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final String adType) {
        List<String> groupValues;
        String str;
        final PromotePlace promotePlaceB = b(adType);
        if (promotePlaceB == null) {
            return;
        }
        List<AdEntity> homePagesAdByType = AdProvider.getHomePagesAdByType(adType);
        Koin orNull = GlobalContext.INSTANCE.getOrNull();
        if (orNull == null) {
            return;
        }
        Regex regex = new Regex(TRAINING_PATTERN);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = homePagesAdByType.iterator();
        while (true) {
            Long lValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            MatchResult matchResultFind$default = Regex.find$default(regex, ((AdEntity) it2.next()).getTarget(), 0, 2, null);
            if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null && (str = groupValues.get(2)) != null) {
                lValueOf = Long.valueOf(Long.parseLong(str));
            }
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        final Set<Long> set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (set.isEmpty()) {
            return;
        }
        ApiResponse<Items<TrainingBean>> apiResponseBatchLoadTrainings = ScopesAndQualifersKt.trainingWebApi(orNull).batchLoadTrainings(set);
        if (apiResponseBatchLoadTrainings instanceof ApiEmptyResponse) {
            HMLog.warn$default(TAG, null, new a(adType, set), 2, null);
            return;
        }
        if (apiResponseBatchLoadTrainings instanceof ApiErrorResponse) {
            HMLog.warn$default(TAG, null, new b(adType, set, apiResponseBatchLoadTrainings), 2, null);
            return;
        }
        if (apiResponseBatchLoadTrainings instanceof ApiSuccessResponse) {
            final List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(((Items) ((ApiSuccessResponse) apiResponseBatchLoadTrainings).getBody()).getItems(), new Comparator() { // from class: com.xiaomi.hm.health.training.PromotionalCourseAdHelper$loadAdDetails$lambda-7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(CollectionsKt___CollectionsKt.indexOf(set, Long.valueOf(((TrainingBean) t).getId()))), Integer.valueOf(CollectionsKt___CollectionsKt.indexOf(set, Long.valueOf(((TrainingBean) t2).getId()))));
                }
            });
            if (listSortedWith == null || listSortedWith.isEmpty()) {
                return;
            }
            final TrainingDb trainingDb = ScopesAndQualifersKt.trainingDb(orNull);
            trainingDb.runInTransaction(new Runnable() { // from class: p46
                @Override // java.lang.Runnable
                public final void run() {
                    PromotionalCourseAdHelper.d(trainingDb, listSortedWith, promotePlaceB, adType, set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TrainingDb trainingDb, List list, PromotePlace promotePlace, String str, Set set) {
        TrainingDao trainingDao = trainingDb.trainingDao();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it2.next());
            if (trainingPo != null) {
                arrayList.add(trainingPo);
            }
        }
        trainingDao.insertOrUpdateTrainings(arrayList);
        PromotionDao promotionDao = trainingDb.promotionDao();
        promotionDao.deletePromotionalTrainings(promotePlace);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new Promotion(promotePlace, ((TrainingBean) it3.next()).getId()));
        }
        promotionDao.insertPromotions(arrayList2);
        HMLog.verbose(TAG, new c(str, set));
    }

    @SuppressLint({"CheckResult"})
    public final void loadPromotionalCourses() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new d(null), 2, null);
    }
}
