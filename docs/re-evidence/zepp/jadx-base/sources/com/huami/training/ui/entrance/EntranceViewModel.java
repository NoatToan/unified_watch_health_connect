package com.huami.training.ui.entrance;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.repo.ConfigRepo;
import com.huami.training.repo.EntranceRepo;
import com.huami.training.repo.PlanRepo;
import com.huami.training.ui.entrance.EntranceViewModel;
import com.huami.training.util.ConfigManager;
import com.huami.training.utils.CombinedLiveData;
import com.huami.training.vo.EntranceKingVo;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingPlanVo;
import com.huami.training.vo.TrainingVo;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R3\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u001c*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R+\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R+\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\"0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R3\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. \u001c*\n\u0012\u0004\u0012\u00020.\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 R3\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000205 \u001c*\n\u0012\u0004\u0012\u000205\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 Ro\u0010?\u001aX\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. \u001c*\n\u0012\u0004\u0012\u00020.\u0018\u00010\u001b0\u001b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000205 \u001c*\n\u0012\u0004\u0012\u000205\u0018\u00010\u001b0\u001b\u0012 \u0012\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040:\u0012\u0004\u0012\u00020\u00020:098\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R+\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\"0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010\u001e\u001a\u0004\bB\u0010 R3\u0010F\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u001c*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\u001e\u001a\u0004\bE\u0010 R\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR+\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\"0\u001b0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010\u001e\u001a\u0004\bM\u0010 R0\u0010Q\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020K \u001c*\n\u0012\u0004\u0012\u00020K\u0018\u00010O0O0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u001eR3\u0010U\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020K \u001c*\n\u0012\u0004\u0012\u00020K\u0018\u00010R0R0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010\u001e\u001a\u0004\bT\u0010 R<\u0010Z\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u001c*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u001e\u001a\u0004\bW\u0010 \"\u0004\bX\u0010YR<\u0010^\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u001c*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b0\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001e\u001a\u0004\b\\\u0010 \"\u0004\b]\u0010YR\u0016\u0010a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0016\u0010e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010`R\u0016\u0010g\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010`R\u0016\u0010h\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010`¨\u0006o"}, d2 = {"Lcom/huami/training/ui/entrance/EntranceViewModel;", "Landroidx/lifecycle/ViewModel;", "", "y", "", "tagId", "", "setTodayTag", "refresh", "Lcom/huami/training/repo/EntranceRepo;", "a", "Lcom/huami/training/repo/EntranceRepo;", "entranceRepo", "Lcom/huami/training/repo/ConfigRepo;", "b", "Lcom/huami/training/repo/ConfigRepo;", "configRepo", "Landroidx/lifecycle/MediatorLiveData;", "", "c", "Landroidx/lifecycle/MediatorLiveData;", "refreshTrigger", GoogleApiAvailabilityLight.a, "getRefreshState", "()Landroidx/lifecycle/MediatorLiveData;", "refreshState", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "kotlin.jvm.PlatformType", "e", "Landroidx/lifecycle/LiveData;", "getEntranceCard", "()Landroidx/lifecycle/LiveData;", "entranceCard", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "f", "getBanners", "banners", "g", "getSubjects", "subjects", "Lcom/huami/training/vo/EntranceKingVo;", "h", "getKingIcons", "kingIcons", "Lcom/huami/training/vo/TrainingPlanVo;", "i", "getTrainingPlan", "trainingPlan", z.j, "getPlanBgImage", "planBgImage", "", hl.k, "getAllJoinedCourse", "allJoinedCourse", "Lcom/huami/training/utils/CombinedLiveData;", "Lkotlin/Pair;", "l", "Lcom/huami/training/utils/CombinedLiveData;", "getPlanAndJoinedCourseVisible", "()Lcom/huami/training/utils/CombinedLiveData;", "planAndJoinedCourseVisible", "Lcom/huami/training/vo/TagVo;", "m", "getTodayTagResult", "todayTagResult", GoogleApiAvailabilityLight.b, "getConfigFetchResult", "configFetchResult", "Landroidx/lifecycle/MutableLiveData;", "o", "Landroidx/lifecycle/MutableLiveData;", "todayTag", "Lcom/huami/training/vo/TrainingVo;", b.r, "getTodayTrainingResult", "todayTrainingResult", "Lcom/huami/training/vo/Listing;", DTransferConstants.SEARCH_KEY, "kankanResult", "Landroidx/paging/PagedList;", "r", "getKankanPagedList", "kankanPagedList", SOAP.XMLNS, "getKankanNetworkState", "setKankanNetworkState", "(Landroidx/lifecycle/LiveData;)V", "kankanNetworkState", "t", "getKankanRefreshState", "setKankanRefreshState", "kankanRefreshState", "u", "Z", "entranceCardState", "v", "trainingPlanState", "w", "allJoinedState", "x", "kankanState", "configsFetchState", "Lcom/huami/training/repo/PlanRepo;", "planRepo", "Lcom/huami/training/util/ConfigManager;", "configManager", "<init>", "(Lcom/huami/training/repo/EntranceRepo;Lcom/huami/training/repo/ConfigRepo;Lcom/huami/training/repo/PlanRepo;Lcom/huami/training/util/ConfigManager;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class EntranceViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EntranceRepo entranceRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConfigRepo configRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<String> refreshTrigger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> refreshState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> entranceCard;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<EntranceSubjectVo>>> banners;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<EntranceSubjectVo>>> subjects;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<EntranceKingVo>>> kingIcons;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<TrainingPlanVo>> trainingPlan;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> planBgImage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Integer>> allJoinedCourse;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final CombinedLiveData<Resource<TrainingPlanVo>, Resource<Integer>, Pair<Pair<Boolean, Long>, Boolean>> planAndJoinedCourseVisible;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TagVo>>> todayTagResult;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> configFetchResult;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> todayTag;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TrainingVo>>> todayTrainingResult;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TrainingVo>> kankanResult;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TrainingVo>> kankanPagedList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> kankanNetworkState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> kankanRefreshState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean entranceCardState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean trainingPlanState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean allJoinedState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean kankanState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean configsFetchState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\u0010\b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/vo/Resource;", "Lcom/huami/training/vo/TrainingPlanVo;", "plan", "", "joinedCourses", "Lkotlin/Pair;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Resource<? extends TrainingPlanVo>, Resource<? extends Integer>, Pair<? extends Pair<? extends Boolean, ? extends Long>, ? extends Boolean>> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<Pair<Boolean, Long>, Boolean> invoke(@Nullable Resource<TrainingPlanVo> resource, @Nullable Resource<Integer> resource2) {
            Object objValueOf;
            Integer data;
            Object obj = null;
            boolean z = false;
            if (resource == null || ((resource.getStatus() != Status.LOADING || resource.getData() == null) && resource.getStatus() != Status.SUCCESS)) {
                objValueOf = null;
            } else {
                Boolean boolValueOf = Boolean.valueOf(resource.getData() != null);
                TrainingPlanVo data2 = resource.getData();
                objValueOf = data2 != null ? Long.valueOf(data2.getId()) : null;
                obj = boolValueOf;
            }
            if (resource2 != null && (data = resource2.getData()) != null) {
                if (!(data.intValue() > 0)) {
                    z = true;
                }
            }
            return new Pair<>(new Pair(obj, objValueOf), Boolean.valueOf(!z));
        }
    }

    public EntranceViewModel(@NotNull EntranceRepo entranceRepo, @NotNull ConfigRepo configRepo, @NotNull final PlanRepo planRepo, @NotNull ConfigManager configManager) {
        this.entranceRepo = entranceRepo;
        this.configRepo = configRepo;
        MediatorLiveData<String> mediatorLiveData = new MediatorLiveData<>();
        this.refreshTrigger = mediatorLiveData;
        MediatorLiveData<Boolean> mediatorLiveData2 = new MediatorLiveData<>();
        this.refreshState = mediatorLiveData2;
        LiveData liveDataSwitchMap = Transformations.switchMap(mediatorLiveData, new Function() { // from class: io1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.x(this.a, (String) obj);
            }
        });
        this.entranceCard = liveDataSwitchMap;
        this.banners = entranceRepo.loadBannerData();
        this.subjects = entranceRepo.loadSubjectData();
        this.kingIcons = entranceRepo.loadKingData();
        LiveData liveDataSwitchMap2 = Transformations.switchMap(mediatorLiveData, new Function() { // from class: vn1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.E(planRepo, (String) obj);
            }
        });
        this.trainingPlan = liveDataSwitchMap2;
        this.planBgImage = configManager.getPlanBackgroundImageInCoursePage();
        LiveData liveDataSwitchMap3 = Transformations.switchMap(mediatorLiveData, new Function() { // from class: ho1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.v(this.a, (String) obj);
            }
        });
        this.allJoinedCourse = liveDataSwitchMap3;
        this.planAndJoinedCourseVisible = new CombinedLiveData<>(liveDataSwitchMap2, liveDataSwitchMap3, a.a);
        this.todayTagResult = entranceRepo.loadTodayTag();
        LiveData liveDataSwitchMap4 = Transformations.switchMap(mediatorLiveData, new Function() { // from class: jo1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.w(this.a, (String) obj);
            }
        });
        this.configFetchResult = liveDataSwitchMap4;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.todayTag = mutableLiveData;
        this.todayTrainingResult = Transformations.switchMap(mutableLiveData, new Function() { // from class: fo1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.D(this.a, (Long) obj);
            }
        });
        LiveData<Listing<TrainingVo>> map = Transformations.map(mediatorLiveData, new Function() { // from class: go1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.C(this.a, (String) obj);
            }
        });
        this.kankanResult = map;
        this.kankanPagedList = Transformations.switchMap(map, new Function() { // from class: ko1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.A((Listing) obj);
            }
        });
        this.kankanNetworkState = Transformations.switchMap(map, new Function() { // from class: mo1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.z((Listing) obj);
            }
        });
        this.kankanRefreshState = Transformations.switchMap(map, new Function() { // from class: lo1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EntranceViewModel.B((Listing) obj);
            }
        });
        mediatorLiveData.setValue("");
        mediatorLiveData2.addSource(liveDataSwitchMap4, new Observer() { // from class: zn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceViewModel.u(this.a, (Resource) obj);
            }
        });
        mediatorLiveData2.addSource(liveDataSwitchMap, new Observer() { // from class: xn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceViewModel.q(this.a, (Resource) obj);
            }
        });
        mediatorLiveData2.addSource(liveDataSwitchMap2, new Observer() { // from class: yn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceViewModel.r(this.a, (Resource) obj);
            }
        });
        mediatorLiveData2.addSource(liveDataSwitchMap3, new Observer() { // from class: wn1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceViewModel.s(this.a, (Resource) obj);
            }
        });
        mediatorLiveData2.addSource(this.kankanRefreshState, new Observer() { // from class: no1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EntranceViewModel.t(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData A(Listing listing) {
        return listing.getPagedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData B(Listing listing) {
        return listing.getRefreshState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Listing C(EntranceViewModel entranceViewModel, String str) {
        return entranceViewModel.entranceRepo.loadKanKanList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData D(EntranceViewModel entranceViewModel, Long l) {
        return entranceViewModel.entranceRepo.loadTodayTraining(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData E(PlanRepo planRepo, String str) {
        return planRepo.loadTrainingPlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EntranceViewModel entranceViewModel, Resource resource) {
        entranceViewModel.entranceCardState = resource.getStatus() != Status.LOADING;
        entranceViewModel.getRefreshState().setValue(Boolean.valueOf(entranceViewModel.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EntranceViewModel entranceViewModel, Resource resource) {
        entranceViewModel.trainingPlanState = resource.getStatus() != Status.LOADING;
        entranceViewModel.getRefreshState().setValue(Boolean.valueOf(entranceViewModel.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EntranceViewModel entranceViewModel, Resource resource) {
        entranceViewModel.allJoinedState = resource.getStatus() != Status.LOADING;
        entranceViewModel.getRefreshState().setValue(Boolean.valueOf(entranceViewModel.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EntranceViewModel entranceViewModel, Resource resource) {
        entranceViewModel.kankanState = resource.getStatus() != Status.LOADING;
        entranceViewModel.getRefreshState().setValue(Boolean.valueOf(entranceViewModel.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EntranceViewModel entranceViewModel, Resource resource) {
        entranceViewModel.configsFetchState = resource.getStatus() != Status.LOADING;
        entranceViewModel.getRefreshState().setValue(Boolean.valueOf(entranceViewModel.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData v(EntranceViewModel entranceViewModel, String str) {
        return entranceViewModel.entranceRepo.loadAllJoinedCourse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData w(EntranceViewModel entranceViewModel, String str) {
        entranceViewModel.configRepo.setShouldFetchConfigs(true);
        return entranceViewModel.configRepo.loadConfigurationsOnActive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData x(EntranceViewModel entranceViewModel, String str) {
        return entranceViewModel.entranceRepo.loadEntranceCards();
    }

    private final boolean y() {
        if (!this.configsFetchState || !this.entranceCardState || !this.trainingPlanState || !this.allJoinedState || !this.kankanState) {
            return false;
        }
        this.configsFetchState = false;
        this.entranceCardState = false;
        this.trainingPlanState = false;
        this.allJoinedState = false;
        this.kankanState = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData z(Listing listing) {
        return listing.getNetworkState();
    }

    @NotNull
    public final LiveData<Resource<Integer>> getAllJoinedCourse() {
        return this.allJoinedCourse;
    }

    @NotNull
    public final LiveData<Resource<List<EntranceSubjectVo>>> getBanners() {
        return this.banners;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getConfigFetchResult() {
        return this.configFetchResult;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getEntranceCard() {
        return this.entranceCard;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getKankanNetworkState() {
        return this.kankanNetworkState;
    }

    @NotNull
    public final LiveData<PagedList<TrainingVo>> getKankanPagedList() {
        return this.kankanPagedList;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getKankanRefreshState() {
        return this.kankanRefreshState;
    }

    @NotNull
    public final LiveData<Resource<List<EntranceKingVo>>> getKingIcons() {
        return this.kingIcons;
    }

    @NotNull
    public final CombinedLiveData<Resource<TrainingPlanVo>, Resource<Integer>, Pair<Pair<Boolean, Long>, Boolean>> getPlanAndJoinedCourseVisible() {
        return this.planAndJoinedCourseVisible;
    }

    @NotNull
    public final LiveData<String> getPlanBgImage() {
        return this.planBgImage;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getRefreshState() {
        return this.refreshState;
    }

    @NotNull
    public final LiveData<Resource<List<EntranceSubjectVo>>> getSubjects() {
        return this.subjects;
    }

    @NotNull
    public final LiveData<Resource<List<TagVo>>> getTodayTagResult() {
        return this.todayTagResult;
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> getTodayTrainingResult() {
        return this.todayTrainingResult;
    }

    @NotNull
    public final LiveData<Resource<TrainingPlanVo>> getTrainingPlan() {
        return this.trainingPlan;
    }

    public final void refresh() {
        Function0<Unit> refresh;
        this.refreshTrigger.setValue(null);
        Listing<TrainingVo> value = this.kankanResult.getValue();
        if (value == null || (refresh = value.getRefresh()) == null) {
            return;
        }
        refresh.invoke();
    }

    public final void setKankanNetworkState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.kankanNetworkState = liveData;
    }

    public final void setKankanRefreshState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.kankanRefreshState = liveData;
    }

    public final void setTodayTag(long tagId) {
        Long value = this.todayTag.getValue();
        if (value != null && tagId == value.longValue()) {
            return;
        }
        this.todayTag.setValue(Long.valueOf(tagId));
    }
}
