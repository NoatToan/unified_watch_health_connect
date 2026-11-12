package com.huami.training.domain.repo;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.Resource;
import com.huami.tools.log.HMLog;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.converter.WebBeanToPoExKt;
import com.huami.training.db.po.Training;
import com.huami.training.domain.model.DomainDifficulty;
import com.huami.training.domain.model.DomainTrainingType;
import com.huami.training.domain.model.TrainingVo;
import com.huami.training.domain.repo.TrainingRepoImpl;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.huami.training.helper.AppExecutors;
import com.huami.training.vo.ApiEmptyResponse;
import com.huami.training.vo.ApiErrorResponse;
import com.huami.training.vo.ApiResponse;
import com.huami.training.vo.ApiSuccessResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/training/domain/repo/TrainingRepoImpl;", "Lcom/huami/training/domain/repo/TrainingRepo;", "", "size", "", "tag", "", "Lcom/huami/training/domain/model/DomainTrainingType;", "trainingTypes", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "Lcom/huami/training/domain/model/TrainingVo;", "getFemaleRecommendTrainings", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)Landroidx/lifecycle/LiveData;", "Lcom/huami/training/helper/AppExecutors;", "a", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/api/TrainingWebApi;", "b", "Lcom/huami/training/api/TrainingWebApi;", "webApi", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lcom/huami/training/api/TrainingWebApi;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingRepoImpl implements TrainingRepo {

    @NotNull
    public static final String TAG = "TrainingRepoImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TrainingWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DomainTrainingType.values().length];
            iArr[DomainTrainingType.ACTION.ordinal()] = 1;
            iArr[DomainTrainingType.YOGA.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TrainingType.values().length];
            iArr2[TrainingType.ACTION.ordinal()] = 1;
            iArr2[TrainingType.YOGA.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Difficulty.values().length];
            iArr3[Difficulty.JUNIOR.ordinal()] = 1;
            iArr3[Difficulty.INTERMEDIATE.ordinal()] = 2;
            iArr3[Difficulty.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public TrainingRepoImpl(@NotNull AppExecutors appExecutors, @NotNull TrainingWebApi trainingWebApi) {
        this.appExecutors = appExecutors;
        this.webApi = trainingWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    public static final void b(Set set, TrainingRepoImpl trainingRepoImpl, String str, Integer num, MutableLiveData mutableLiveData) {
        Resource resourceError$default;
        String female;
        String female2;
        DomainDifficulty domainDifficulty;
        DomainDifficulty domainDifficulty2;
        Integer contentCount;
        int iIntValue;
        Integer consumption;
        long jIntValue;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((DomainTrainingType) it2.next()).ordinal()];
            arrayList.add(i != 1 ? i != 2 ? TrainingTypeBo.FEATURED_COURSE : TrainingTypeBo.YOGA : TrainingTypeBo.ACTION);
        }
        ApiResponse apiResponseLoadTrainings$default = TrainingWebApi.DefaultImpls.loadTrainings$default(trainingRepoImpl.webApi, CollectionsKt___CollectionsKt.toSet(arrayList), null, null, null, null, null, null, null, null, null, null, null, str, null, null, num, 28670, null);
        if (apiResponseLoadTrainings$default instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseLoadTrainings$default;
            HMLog.w(TAG, Intrinsics.stringPlus("ApiSuccessResponse, resp=", apiSuccessResponse.getBody()), new Object[0]);
            Resource.Companion companion = Resource.INSTANCE;
            List items = ((Items) apiSuccessResponse.getBody()).getItems();
            ArrayList<Training> arrayList2 = new ArrayList();
            Iterator it3 = items.iterator();
            while (it3.hasNext()) {
                Training trainingPo = WebBeanToPoExKt.toTrainingPo((TrainingBean) it3.next());
                if (trainingPo != null) {
                    arrayList2.add(trainingPo);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            for (Training training : arrayList2) {
                long id = training.getId();
                int i2 = WhenMappings.$EnumSwitchMapping$1[training.getType().ordinal()];
                DomainTrainingType domainTrainingType = i2 != 1 ? i2 != 2 ? DomainTrainingType.FEATURED_COURSE : DomainTrainingType.YOGA : DomainTrainingType.ACTION;
                GenderPair<String> listImage = training.getListImage();
                String str2 = (listImage == null || (female = listImage.getFemale()) == null) ? "" : female;
                GenderPair<String> squareImage = training.getSquareImage();
                String str3 = (squareImage == null || (female2 = squareImage.getFemale()) == null) ? "" : female2;
                String name = training.getName();
                String str4 = name == null ? "" : name;
                Difficulty difficulty = training.getDifficulty();
                int i3 = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$2[difficulty.ordinal()];
                if (i3 == 1) {
                    domainDifficulty = DomainDifficulty.JUNIOR;
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        domainDifficulty2 = null;
                    } else {
                        domainDifficulty = DomainDifficulty.SENIOR;
                    }
                    contentCount = training.getContentCount();
                    if (contentCount == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = contentCount.intValue();
                    }
                    consumption = training.getConsumption();
                    if (consumption == null) {
                        jIntValue = 0;
                    } else {
                        jIntValue = consumption.intValue();
                    }
                    arrayList3.add(new TrainingVo(Long.valueOf(id), str2, str3, str4, domainDifficulty2, iIntValue, jIntValue, domainTrainingType, training.getLabel(), training.getParticipants()));
                } else {
                    domainDifficulty = DomainDifficulty.INTERMEDIATE;
                }
                domainDifficulty2 = domainDifficulty;
                contentCount = training.getContentCount();
                if (contentCount == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = contentCount.intValue();
                }
                consumption = training.getConsumption();
                if (consumption == null) {
                    jIntValue = 0;
                } else {
                    jIntValue = consumption.intValue();
                }
                arrayList3.add(new TrainingVo(Long.valueOf(id), str2, str3, str4, domainDifficulty2, iIntValue, jIntValue, domainTrainingType, training.getLabel(), training.getParticipants()));
            }
            resourceError$default = companion.success(arrayList3);
        } else if (apiResponseLoadTrainings$default instanceof ApiEmptyResponse) {
            HMLog.w(TAG, "ApiEmptyResponse", new Object[0]);
            resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
        } else {
            if (!(apiResponseLoadTrainings$default instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.w(TAG, Intrinsics.stringPlus("ApiErrorResponse, err=", ((ApiErrorResponse) apiResponseLoadTrainings$default).getErrorMessage()), new Object[0]);
            resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
        }
        mutableLiveData.postValue(resourceError$default);
    }

    @Override // com.huami.training.domain.repo.TrainingRepo
    @NotNull
    public LiveData<Resource<List<TrainingVo>>> getFemaleRecommendTrainings(@Nullable final Integer size, @Nullable final String tag, @NotNull final Set<? extends DomainTrainingType> trainingTypes) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ox7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingRepoImpl.b(trainingTypes, this, tag, size, mutableLiveData);
            }
        });
        return mutableLiveData;
    }
}
