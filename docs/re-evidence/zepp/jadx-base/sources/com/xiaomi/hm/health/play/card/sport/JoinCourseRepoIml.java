package com.xiaomi.hm.health.play.card.sport;

import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.tools.log.HMLog;
import com.huami.training.api.DtoConvertersKt;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.GenderStringPair;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.huami.training.repo.FitRepo;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import com.huami.training.vo.Resource;
import com.xiaomi.hm.health.di.koin.scope.ScopesKt;
import com.xiaomi.hm.health.play.bean.PlayJoinCourseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/JoinCourseRepoIml;", "Lcom/xiaomi/hm/health/play/card/sport/IJoinCourseRepo;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "getJoinCourseList", "getJoinCourseListFromWeb", "Lcom/huami/training/repo/FitRepo;", "a", "Lkotlin/Lazy;", "()Lcom/huami/training/repo/FitRepo;", "fitRepo", "Lcom/huami/training/api/TrainingWebApi;", "b", "()Lcom/huami/training/api/TrainingWebApi;", "trainingWebApi", "Lkotlin/Function0;", "", "c", "Lkotlin/jvm/functions/Function0;", "isMale", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JoinCourseRepoIml implements IJoinCourseRepo, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingWebApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isMale;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Resource<List<JoinedTraining>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Resource<? extends List<JoinedTraining>> resource) {
            super(0);
            this.a = resource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "loadAllJoinedTrainings: " + this.a.getStatus() + this.a.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/api/TrainingWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TrainingWebApi> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingWebApi getA() {
            return (TrainingWebApi) ScopesAndQualifersKt.trainingScope(JoinCourseRepoIml.this.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JoinCourseRepoIml() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.fitRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FitRepo>() { // from class: com.xiaomi.hm.health.play.card.sport.JoinCourseRepoIml$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.repo.FitRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FitRepo getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FitRepo.class), qualifier, objArr);
            }
        });
        this.trainingWebApi = LazyKt__LazyJVMKt.lazy(new b());
        this.isMale = (Function0) ScopesKt.userScope(getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Gender"), null);
    }

    private final FitRepo a() {
        return (FitRepo) this.fitRepo.getValue();
    }

    private final TrainingWebApi b() {
        return (TrainingWebApi) this.trainingWebApi.getValue();
    }

    @Override // com.xiaomi.hm.health.play.card.sport.IJoinCourseRepo
    @NotNull
    public LiveData<List<PlayJoinCourseBean>> getJoinCourseList() {
        return Transformations.map(a().loadAllJoinedTrainings(), new Function<Resource<? extends List<? extends JoinedTraining>>, List<? extends PlayJoinCourseBean>>() { // from class: com.xiaomi.hm.health.play.card.sport.JoinCourseRepoIml$getJoinCourseList$$inlined$map$1
            /* JADX WARN: Code duplicated, block: B:16:0x0060  */
            @Override // androidx.arch.core.util.Function
            public final List<? extends PlayJoinCourseBean> apply(Resource<? extends List<? extends JoinedTraining>> resource) {
                String female;
                String str;
                Resource<? extends List<? extends JoinedTraining>> resource2 = resource;
                HMLog.info("JoinCourseRepoIml", new JoinCourseRepoIml.a(resource2));
                List<? extends JoinedTraining> data = resource2.getData();
                if (data == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                for (JoinedTraining joinedTraining : data) {
                    long id = joinedTraining.getId();
                    TrainingType type = joinedTraining.getType();
                    if (((Boolean) this.a.isMale.getA()).booleanValue()) {
                        GenderPair<String> squareImage = joinedTraining.getSquareImage();
                        if (squareImage == null) {
                            str = null;
                        } else {
                            female = squareImage.getMale();
                            str = female;
                        }
                    } else {
                        GenderPair<String> squareImage2 = joinedTraining.getSquareImage();
                        if (squareImage2 == null) {
                            str = null;
                        } else {
                            female = squareImage2.getFemale();
                            str = female;
                        }
                    }
                    String name = joinedTraining.getName();
                    Integer contentCount = joinedTraining.getContentCount();
                    arrayList.add(new PlayJoinCourseBean(id, type, str, name, contentCount == null ? 0 : contentCount.intValue(), joinedTraining.getTrainTimes()));
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    @Override // com.xiaomi.hm.health.play.card.sport.IJoinCourseRepo
    @WorkerThread
    @Nullable
    public List<PlayJoinCourseBean> getJoinCourseListFromWeb() {
        TrainingType dto;
        PlayJoinCourseBean playJoinCourseBean;
        String male;
        String str;
        ApiResponse apiResponseLoadJoinedTrainings$default = TrainingWebApi.DefaultImpls.loadJoinedTrainings$default(b(), null, null, null, 7, null);
        if (!(apiResponseLoadJoinedTrainings$default instanceof ApiSuccessResponse)) {
            if ((apiResponseLoadJoinedTrainings$default instanceof ApiEmptyResponse) || (apiResponseLoadJoinedTrainings$default instanceof ApiErrorResponse)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<JoinedTrainingBean> items = ((Items) ((ApiSuccessResponse) apiResponseLoadJoinedTrainings$default).getBody()).getItems();
        ArrayList arrayList = new ArrayList();
        for (JoinedTrainingBean joinedTrainingBean : items) {
            TrainingTypeBo trainingType = joinedTrainingBean.getTrainingType();
            if (trainingType == null || (dto = DtoConvertersKt.toDto(trainingType)) == null) {
                playJoinCourseBean = null;
            } else {
                long id = joinedTrainingBean.getId();
                if (this.isMale.getA().booleanValue()) {
                    GenderStringPair squareImageUrl = joinedTrainingBean.getSquareImageUrl();
                    if (squareImageUrl == null) {
                        str = null;
                    } else {
                        male = squareImageUrl.getMale();
                        str = male;
                    }
                } else {
                    GenderStringPair squareImageUrl2 = joinedTrainingBean.getSquareImageUrl();
                    if (squareImageUrl2 == null) {
                        str = null;
                    } else {
                        male = squareImageUrl2.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String();
                        str = male;
                    }
                }
                String name = joinedTrainingBean.getName();
                Integer contentCount = joinedTrainingBean.getContentCount();
                int iIntValue = contentCount == null ? 0 : contentCount.intValue();
                Integer finishedTimes = joinedTrainingBean.getFinishedTimes();
                playJoinCourseBean = new PlayJoinCourseBean(id, dto, str, name, iIntValue, finishedTimes == null ? 0 : finishedTimes.intValue());
            }
            if (playJoinCourseBean != null) {
                arrayList.add(playJoinCourseBean);
            }
        }
        return arrayList;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
