package com.huami.femalehealth.uilib.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.uilib.viewmodel.TrainingViewModel;
import com.huami.tools.log.HMLog;
import com.huami.training.domain.model.DomainTrainingType;
import com.huami.training.domain.model.TrainingVo;
import com.huami.training.domain.repo.TrainingRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R?\u0010\u001c\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0017*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00050\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/TrainingViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "", "tag", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "Lcom/huami/training/domain/model/TrainingVo;", "b", "", "setTag", "Lcom/huami/training/domain/repo/TrainingRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/training/domain/repo/TrainingRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "e", "Landroidx/lifecycle/MutableLiveData;", "getTagLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setTagLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "tagLiveData", "kotlin.jvm.PlatformType", "f", "Landroidx/lifecycle/LiveData;", "getTrainings", "()Landroidx/lifecycle/LiveData;", "trainings", "<init>", "(Lcom/huami/training/domain/repo/TrainingRepo;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingViewModel extends FHBaseViewModel {

    @NotNull
    public static final String TAG_OTHER = "舒缓";

    @NotNull
    public static final String TAG_OVULATION = "燃脂";

    @NotNull
    public static final String TAG_PERIOD = "生理期";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TrainingRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<String> tagLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TrainingVo>>> trainings;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Set<DomainTrainingType> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, int i, Set<? extends DomainTrainingType> set) {
            super(0);
            this.a = str;
            this.b = i;
            this.c = set;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadTrainings, tag=" + this.a + ", size=" + this.b + ", types=" + this.c;
        }
    }

    public TrainingViewModel(@NotNull TrainingRepo trainingRepo) {
        this.repo = trainingRepo;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.tagLiveData = mutableLiveData;
        this.trainings = Transformations.switchMap(mutableLiveData, new Function() { // from class: ux7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingViewModel.c(this.a, (String) obj);
            }
        });
    }

    private final LiveData<Resource<List<TrainingVo>>> b(String tag) {
        Set<? extends DomainTrainingType> of = x.setOf(DomainTrainingType.FEATURED_COURSE);
        HMLog.info("TrainingViewModel", new a(tag, 2, of));
        return this.repo.getFemaleRecommendTrainings(2, tag, of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(TrainingViewModel trainingViewModel, String str) {
        if (str == null) {
            return null;
        }
        return trainingViewModel.b(str);
    }

    @NotNull
    public final MutableLiveData<String> getTagLiveData() {
        return this.tagLiveData;
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> getTrainings() {
        return this.trainings;
    }

    public final void setTag(@NotNull String tag) {
        this.tagLiveData.setValue(tag);
    }

    public final void setTagLiveData(@NotNull MutableLiveData<String> mutableLiveData) {
        this.tagLiveData = mutableLiveData;
    }
}
