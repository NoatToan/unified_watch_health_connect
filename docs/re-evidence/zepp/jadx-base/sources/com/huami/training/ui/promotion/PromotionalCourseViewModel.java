package com.huami.training.ui.promotion;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.PromotePlace;
import com.huami.training.repo.PromotionalCourseRepo;
import com.huami.training.ui.promotion.PromotionalCourseViewModel;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TrainingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR?\u0010\u0018\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011 \u0013*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00100\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00190\u00190\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010 R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010 R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010 ¨\u0006*"}, d2 = {"Lcom/huami/training/ui/promotion/PromotionalCourseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/training/dto/PromotePlace;", "newPlace", "", "setPromotePlace", "getPromotePlace", "Lcom/huami/training/repo/PromotionalCourseRepo;", "a", "Lcom/huami/training/repo/PromotionalCourseRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "promotePlace", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/TrainingVo;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "getCourses", "()Landroidx/lifecycle/LiveData;", "courses", "", GoogleApiAvailabilityLight.a, "getVisible", "visible", "", "e", "getTitleText", "()Landroidx/lifecycle/MutableLiveData;", "titleText", "f", "getShowViewMore", "showViewMore", "g", "getShowTitleBar", "showTitleBar", "<init>", "(Lcom/huami/training/repo/PromotionalCourseRepo;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionalCourseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PromotionalCourseRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PromotePlace> promotePlace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<TrainingVo>>> courses;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> visible;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> titleText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showViewMore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showTitleBar;

    public PromotionalCourseViewModel(@NotNull PromotionalCourseRepo promotionalCourseRepo) {
        this.repo = promotionalCourseRepo;
        MutableLiveData<PromotePlace> mutableLiveData = new MutableLiveData<>();
        this.promotePlace = mutableLiveData;
        LiveData<Resource<List<TrainingVo>>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: v46
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PromotionalCourseViewModel.c(this.a, (PromotePlace) obj);
            }
        });
        this.courses = liveDataSwitchMap;
        this.visible = Transformations.map(liveDataSwitchMap, new Function() { // from class: w46
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PromotionalCourseViewModel.e((Resource) obj);
            }
        });
        this.titleText = new MutableLiveData<>();
        this.showViewMore = new MutableLiveData<>();
        this.showTitleBar = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(PromotionalCourseViewModel promotionalCourseViewModel, PromotePlace promotePlace) {
        return promotionalCourseViewModel.repo.loadLatestThreePromotionalCourses(promotePlace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    public static final Boolean e(Resource resource) {
        boolean z;
        if (resource.getStatus() == Status.SUCCESS) {
            Collection collection = (Collection) resource.getData();
            z = collection == null || collection.isEmpty() ? false : true;
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public final LiveData<Resource<List<TrainingVo>>> getCourses() {
        return this.courses;
    }

    @Nullable
    public final PromotePlace getPromotePlace() {
        return this.promotePlace.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowTitleBar() {
        return this.showTitleBar;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowViewMore() {
        return this.showViewMore;
    }

    @NotNull
    public final MutableLiveData<String> getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final LiveData<Boolean> getVisible() {
        return this.visible;
    }

    public final void setPromotePlace(@NotNull PromotePlace newPlace) {
        if (newPlace == this.promotePlace.getValue()) {
            return;
        }
        this.promotePlace.setValue(newPlace);
    }
}
