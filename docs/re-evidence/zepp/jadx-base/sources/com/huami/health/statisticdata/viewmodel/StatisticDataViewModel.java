package com.huami.health.statisticdata.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.constants.GenderType;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.health.statisticdata.repository.StatisticDataRepository;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/health/statisticdata/viewmodel/StatisticDataViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "distributionTypeEnum", "Lcom/huami/health/statisticdata/constants/GenderType;", "genderType", "", "ageGroup", "timeGroup", "", "setStatisticDataList", "(Ljava/lang/String;Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Lcom/huami/health/statisticdata/constants/GenderType;ILjava/lang/Integer;)V", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "a", "Landroidx/lifecycle/MutableLiveData;", "getStatisticDataListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statisticDataListLiveData", "Lcom/huami/health/statisticdata/repository/StatisticDataRepository;", "b", "Lcom/huami/health/statisticdata/repository/StatisticDataRepository;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/health/statisticdata/repository/StatisticDataRepository;)V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<StatisticDataModel>> statisticDataListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final StatisticDataRepository repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @DebugMetadata(c = "com.huami.health.statisticdata.viewmodel.StatisticDataViewModel$setStatisticDataList$1", f = "StatisticDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private CoroutineScope a;
        public int b;
        public final /* synthetic */ DistributionTypeEnum d;
        public final /* synthetic */ int e;
        public final /* synthetic */ GenderType f;
        public final /* synthetic */ Integer g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DistributionTypeEnum distributionTypeEnum, int i, GenderType genderType, Integer num, String str, Continuation continuation) {
            super(2, continuation);
            this.d = distributionTypeEnum;
            this.e = i;
            this.f = genderType;
            this.g = num;
            this.h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = StatisticDataViewModel.this.new a(this.d, this.e, this.f, this.g, this.h, continuation);
            aVar.a = (CoroutineScope) obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int version;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<StatisticDataModel> listQueryStatisticDataList = StatisticDataViewModel.this.repo.queryStatisticDataList(this.d.getTypeName(), this.e, this.f.getGender(), this.g);
            if (listQueryStatisticDataList == null || !(!listQueryStatisticDataList.isEmpty())) {
                version = 0;
            } else {
                MutableLiveData<List<StatisticDataModel>> statisticDataListLiveData = StatisticDataViewModel.this.getStatisticDataListLiveData();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryStatisticDataList, 10));
                for (StatisticDataModel statisticDataModel : listQueryStatisticDataList) {
                    arrayList.add(new StatisticDataModel(statisticDataModel.getVersion(), statisticDataModel.getAgeGroup(), statisticDataModel.getTimeGroup(), statisticDataModel.getItemType(), statisticDataModel.getGender(), statisticDataModel.getCategory(), statisticDataModel.getCount(), statisticDataModel.getLocation(), statisticDataModel.getCategoryCount()));
                }
                statisticDataListLiveData.postValue(arrayList);
                version = listQueryStatisticDataList.get(0).getVersion();
            }
            List<StatisticDataModel> listLoadStatisticDataFromServer = StatisticDataViewModel.this.repo.loadStatisticDataFromServer(this.d, this.h, this.e, this.g, this.f.getGender(), version);
            if (listLoadStatisticDataFromServer != null && (!listLoadStatisticDataFromServer.isEmpty())) {
                StatisticDataViewModel.this.repo.deleteStatisticDataList(this.d.getTypeName(), this.e, this.f.getGender(), this.g);
                StatisticDataViewModel.this.repo.saveStatisticDataList(listLoadStatisticDataFromServer);
                StatisticDataViewModel.this.getStatisticDataListLiveData().postValue(listLoadStatisticDataFromServer);
            }
            return Unit.INSTANCE;
        }
    }

    public StatisticDataViewModel(@NotNull StatisticDataRepository statisticDataRepository) {
        this.repo = statisticDataRepository;
    }

    @NotNull
    public final MutableLiveData<List<StatisticDataModel>> getStatisticDataListLiveData() {
        return this.statisticDataListLiveData;
    }

    public final void setStatisticDataList(@NotNull String userId, @NotNull DistributionTypeEnum distributionTypeEnum, @NotNull GenderType genderType, int ageGroup, @Nullable Integer timeGroup) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(distributionTypeEnum, ageGroup, genderType, timeGroup, userId, null), 2, null);
    }
}
