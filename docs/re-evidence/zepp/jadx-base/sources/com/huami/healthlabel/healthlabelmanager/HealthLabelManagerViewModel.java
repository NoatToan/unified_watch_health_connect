package com.huami.healthlabel.healthlabelmanager;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEntity;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEntityKt;
import com.huami.healthlabel.repository.HealthLabelRepo;
import com.huami.healthlabel.repository.Resource;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b#\u0010$J,\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "showLabelDatas", "notShowLabelDatas", "", "isAddLabel", "", "updateLabels", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "markDeleteLabels", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", "a", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/LiveData;", "Lcom/huami/healthlabel/repository/Resource;", "", "Lcom/huami/healthlabel/entry/HomeHealthLabel;", "b", "Landroidx/lifecycle/LiveData;", "allLabel", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerViewModel$UpdateLabelState;", "c", "Landroidx/lifecycle/MutableLiveData;", "getUpdateLabelState", "()Landroidx/lifecycle/MutableLiveData;", "updateLabelState", GoogleApiAvailabilityLight.a, "getLabelData", "()Landroidx/lifecycle/LiveData;", "labelData", "<init>", "(Lcom/huami/healthlabel/repository/HealthLabelRepo;)V", "UpdateLabelState", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelManagerViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<HomeHealthLabel>>> allLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UpdateLabelState> updateLabelState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<HealthLabelEntity>> labelData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.healthlabelmanager.HealthLabelManagerViewModel$updateLabels$1", f = "HealthLabelManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<HealthLabelEntity> b;
        public final /* synthetic */ List<HealthLabelEntity> c;
        public final /* synthetic */ HealthLabelManagerViewModel d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<HealthLabelEntity> list, List<HealthLabelEntity> list2, HealthLabelManagerViewModel healthLabelManagerViewModel, boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = list2;
            this.d = healthLabelManagerViewModel;
            this.e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<HealthLabelEntity> listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.b, (Iterable) this.c);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
            for (HealthLabelEntity healthLabelEntity : listPlus) {
                arrayList.add(new HomeHealthLabel(healthLabelEntity.getLabelId(), healthLabelEntity.getLabelText(), healthLabelEntity.getLabelColor(), healthLabelEntity.getIsShow(), healthLabelEntity.getSort(), (String) null, 32, (DefaultConstructorMarker) null));
            }
            EntryExtKt.sort(arrayList);
            this.d.getUpdateLabelState().postValue(new UpdateLabelState(this.b, this.c, UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext()) ? this.d.repo.deleteAndUpdateHomeLabel(arrayList) : false, this.e));
            return Unit.INSTANCE;
        }
    }

    public HealthLabelManagerViewModel(@NotNull HealthLabelRepo healthLabelRepo) {
        this.repo = healthLabelRepo;
        LiveData<Resource<List<HomeHealthLabel>>> liveDataLoadAllManagerLabel = healthLabelRepo.loadAllManagerLabel(false);
        this.allLabel = liveDataLoadAllManagerLabel;
        this.updateLabelState = new MutableLiveData<>();
        this.labelData = Transformations.map(liveDataLoadAllManagerLabel, new Function<Resource<? extends List<? extends HomeHealthLabel>>, List<HealthLabelEntity>>() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<HealthLabelEntity> apply(Resource<? extends List<? extends HomeHealthLabel>> resource) {
                ArrayList arrayList = new ArrayList();
                List<? extends HomeHealthLabel> data = resource.getData();
                if (data != null) {
                    for (HomeHealthLabel homeHealthLabel : CollectionsKt___CollectionsKt.sortedWith(data, new Comparator<T>() { // from class: com.huami.healthlabel.healthlabelmanager.HealthLabelManagerViewModel$labelData$lambda-4$lambda-3$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HomeHealthLabel) t).getSort()), Long.valueOf(((HomeHealthLabel) t2).getSort()));
                        }
                    })) {
                        HealthLabelEntity healthLabelEntity = new HealthLabelEntity(homeHealthLabel.isShow() ? 2 : 4);
                        healthLabelEntity.setLabelColor(ColorExtKt.getTextColorChange(homeHealthLabel.getLabelColor()));
                        healthLabelEntity.setLabelId(homeHealthLabel.getLabelId());
                        healthLabelEntity.setLabelText(homeHealthLabel.getLabelText());
                        healthLabelEntity.setSort(homeHealthLabel.getSort());
                        healthLabelEntity.setShow(homeHealthLabel.isShow());
                        arrayList.add(healthLabelEntity);
                    }
                }
                return arrayList;
            }
        });
    }

    public static /* synthetic */ void updateLabels$default(HealthLabelManagerViewModel healthLabelManagerViewModel, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        healthLabelManagerViewModel.updateLabels(list, list2, z);
    }

    @NotNull
    public final LiveData<List<HealthLabelEntity>> getLabelData() {
        return this.labelData;
    }

    @NotNull
    public final MutableLiveData<UpdateLabelState> getUpdateLabelState() {
        return this.updateLabelState;
    }

    public final void markDeleteLabels(@NotNull ArrayList<HealthLabelEntity> markDeleteLabels) {
        this.repo.markDeleteHomeLabel(HealthLabelEntityKt.toDeleteJson(markDeleteLabels).toString());
    }

    public final void updateLabels(@NotNull List<HealthLabelEntity> showLabelDatas, @NotNull List<HealthLabelEntity> notShowLabelDatas, boolean isAddLabel) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(showLabelDatas, notShowLabelDatas, this, isAddLabel, null), 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J=\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/HealthLabelManagerViewModel$UpdateLabelState;", "", "", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "component1", "component2", "", "component3", "component4", "showLabelDatas", "notShowLabelDatas", "isUpdateLabelSuccess", "isAddLabel", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/util/List;", "getShowLabelDatas", "()Ljava/util/List;", "b", "getNotShowLabelDatas", "c", "Z", "()Z", GoogleApiAvailabilityLight.a, "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class UpdateLabelState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<HealthLabelEntity> showLabelDatas;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<HealthLabelEntity> notShowLabelDatas;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean isUpdateLabelSuccess;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final boolean isAddLabel;

        public UpdateLabelState(@NotNull List<HealthLabelEntity> list, @NotNull List<HealthLabelEntity> list2, boolean z, boolean z2) {
            this.showLabelDatas = list;
            this.notShowLabelDatas = list2;
            this.isUpdateLabelSuccess = z;
            this.isAddLabel = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateLabelState copy$default(UpdateLabelState updateLabelState, List list, List list2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateLabelState.showLabelDatas;
            }
            if ((i & 2) != 0) {
                list2 = updateLabelState.notShowLabelDatas;
            }
            if ((i & 4) != 0) {
                z = updateLabelState.isUpdateLabelSuccess;
            }
            if ((i & 8) != 0) {
                z2 = updateLabelState.isAddLabel;
            }
            return updateLabelState.copy(list, list2, z, z2);
        }

        @NotNull
        public final List<HealthLabelEntity> component1() {
            return this.showLabelDatas;
        }

        @NotNull
        public final List<HealthLabelEntity> component2() {
            return this.notShowLabelDatas;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsUpdateLabelSuccess() {
            return this.isUpdateLabelSuccess;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsAddLabel() {
            return this.isAddLabel;
        }

        @NotNull
        public final UpdateLabelState copy(@NotNull List<HealthLabelEntity> showLabelDatas, @NotNull List<HealthLabelEntity> notShowLabelDatas, boolean isUpdateLabelSuccess, boolean isAddLabel) {
            return new UpdateLabelState(showLabelDatas, notShowLabelDatas, isUpdateLabelSuccess, isAddLabel);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateLabelState)) {
                return false;
            }
            UpdateLabelState updateLabelState = (UpdateLabelState) other;
            return Intrinsics.areEqual(this.showLabelDatas, updateLabelState.showLabelDatas) && Intrinsics.areEqual(this.notShowLabelDatas, updateLabelState.notShowLabelDatas) && this.isUpdateLabelSuccess == updateLabelState.isUpdateLabelSuccess && this.isAddLabel == updateLabelState.isAddLabel;
        }

        @NotNull
        public final List<HealthLabelEntity> getNotShowLabelDatas() {
            return this.notShowLabelDatas;
        }

        @NotNull
        public final List<HealthLabelEntity> getShowLabelDatas() {
            return this.showLabelDatas;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = ((this.showLabelDatas.hashCode() * 31) + this.notShowLabelDatas.hashCode()) * 31;
            boolean z = this.isUpdateLabelSuccess;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            boolean z2 = this.isAddLabel;
            return i + (z2 ? 1 : z2);
        }

        public final boolean isAddLabel() {
            return this.isAddLabel;
        }

        public final boolean isUpdateLabelSuccess() {
            return this.isUpdateLabelSuccess;
        }

        @NotNull
        public String toString() {
            return "UpdateLabelState(showLabelDatas=" + this.showLabelDatas + ", notShowLabelDatas=" + this.notShowLabelDatas + ", isUpdateLabelSuccess=" + this.isUpdateLabelSuccess + ", isAddLabel=" + this.isAddLabel + ")";
        }

        public /* synthetic */ UpdateLabelState(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }
}
