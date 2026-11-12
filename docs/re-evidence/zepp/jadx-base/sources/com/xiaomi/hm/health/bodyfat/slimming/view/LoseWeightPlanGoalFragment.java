package com.xiaomi.hm.health.bodyfat.slimming.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityLoseWeightPlanBinding;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanGoalFragment;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSportDetail;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.WeightInfoStatus;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.view.RulerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0006\u0010\u0012\u001a\u00020\u0002R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/LoseWeightPlanGoalFragment;", "Landroidx/fragment/app/Fragment;", "", "loadData", z.j, hl.k, "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "initView", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "loseWeightGoalViewModel", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "b", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "activityViewModel", "", "c", LogUtil.I, "loseWeightGoal", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "loseWeightInfo", "Landroid/view/View;", "settingGoalView", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightPlanBinding;", "f", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightPlanBinding;", "binding", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightPlanGoalFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy loseWeightGoalViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int loseWeightGoal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoseWeightWeightInfo loseWeightInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View settingGoalView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ActivityLoseWeightPlanBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WeightInfoStatus.values().length];
            iArr[WeightInfoStatus.VALID.ordinal()] = 1;
            iArr[WeightInfoStatus.SMALLER__WEIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoseWeightPlanGoalFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.loseWeightGoalViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoseWeightViewModel>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanGoalFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LoseWeightViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(LoseWeightViewModel.class), qualifier, objArr);
            }
        });
        this.activityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LoseWeightPlanEnterViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanGoalFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanGoalFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.loseWeightGoal = 5;
    }

    private final LoseWeightPlanEnterViewModel d() {
        return (LoseWeightPlanEnterViewModel) this.activityViewModel.getValue();
    }

    private final LoseWeightViewModel e() {
        return (LoseWeightViewModel) this.loseWeightGoalViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final LoseWeightPlanGoalFragment loseWeightPlanGoalFragment, View view) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_TARGETOK_BUTTON_C));
        if (loseWeightPlanGoalFragment.loseWeightInfo == null) {
            loseWeightPlanGoalFragment.e().getLoseWeightPlan(loseWeightPlanGoalFragment.loseWeightGoal, null).observe(loseWeightPlanGoalFragment.requireActivity(), new Observer() { // from class: lt4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    LoseWeightPlanGoalFragment.g(this.a, (ArrayList) obj);
                }
            });
            return;
        }
        LoseWeightWeightInfo loseWeightWeightInfo = loseWeightPlanGoalFragment.loseWeightInfo;
        float fFloatValue = (loseWeightWeightInfo == null ? null : Float.valueOf(loseWeightWeightInfo.getWeight())).floatValue();
        LoseWeightWeightInfo loseWeightWeightInfo2 = loseWeightPlanGoalFragment.loseWeightInfo;
        float fFloatValue2 = (loseWeightWeightInfo2 == null ? null : Float.valueOf(loseWeightWeightInfo2.getHeight())).floatValue();
        LoseWeightWeightInfo loseWeightWeightInfo3 = loseWeightPlanGoalFragment.loseWeightInfo;
        int iIntValue = (loseWeightWeightInfo3 == null ? null : Integer.valueOf(loseWeightWeightInfo3.getEncryptImpedance())).intValue();
        LoseWeightWeightInfo loseWeightWeightInfo4 = loseWeightPlanGoalFragment.loseWeightInfo;
        int iIntValue2 = (loseWeightWeightInfo4 == null ? null : Integer.valueOf(loseWeightWeightInfo4.getAge())).intValue();
        LoseWeightWeightInfo loseWeightWeightInfo5 = loseWeightPlanGoalFragment.loseWeightInfo;
        int iIntValue3 = (loseWeightWeightInfo5 == null ? null : Integer.valueOf(loseWeightWeightInfo5.getGender())).intValue();
        LoseWeightWeightInfo loseWeightWeightInfo6 = loseWeightPlanGoalFragment.loseWeightInfo;
        LoseWeightWeightInfo loseWeightWeightInfo7 = new LoseWeightWeightInfo(fFloatValue, fFloatValue2, iIntValue, iIntValue2, iIntValue3, (loseWeightWeightInfo6 == null ? null : Integer.valueOf(loseWeightWeightInfo6.getIdentity())).intValue(), loseWeightPlanGoalFragment.loseWeightGoal);
        ArrayList<List<LoseWeightSportDetail>> loseWeightPlan = loseWeightPlanGoalFragment.e().getLoseWeightPlan(loseWeightWeightInfo7);
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightGoal(loseWeightPlanGoalFragment.loseWeightGoal);
        loseWeightPlanGoalFragment.d().setCurrentSportsList(loseWeightPlan);
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightInfo(loseWeightWeightInfo7);
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightPlan(null);
        ((LoseWeightPlanEnterActivity) loseWeightPlanGoalFragment.requireActivity()).showSportTypeFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(LoseWeightPlanGoalFragment loseWeightPlanGoalFragment, ArrayList arrayList) {
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightGoal(loseWeightPlanGoalFragment.loseWeightGoal);
        loseWeightPlanGoalFragment.d().setCurrentSportsList(arrayList);
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightInfo(loseWeightPlanGoalFragment.e().getCurrentLoseWeightWeightInfo());
        loseWeightPlanGoalFragment.d().setCurrentLoseWeightPlan(null);
        ((LoseWeightPlanEnterActivity) loseWeightPlanGoalFragment.requireActivity()).showSportTypeFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(LoseWeightPlanGoalFragment loseWeightPlanGoalFragment, WeightInfoStatus weightInfoStatus) {
        int i = weightInfoStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[weightInfoStatus.ordinal()];
        if (i == 1) {
            loseWeightPlanGoalFragment.j();
        } else if (i != 2) {
            loseWeightPlanGoalFragment.i();
        } else {
            loseWeightPlanGoalFragment.k();
        }
    }

    private final void i() {
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding);
        activityLoseWeightPlanBinding.rlLoadingWeightInfo.setVisibility(8);
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding2 = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding2);
        activityLoseWeightPlanBinding2.loseWeightWeightInfoInvalid.setText(getString(R.string.lose_weight_need_weight_info_new));
    }

    private final void j() {
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding);
        activityLoseWeightPlanBinding.rlLoadingWeightInfo.setVisibility(8);
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding2 = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding2);
        activityLoseWeightPlanBinding2.loseWeightWeightInfoInvalid.setVisibility(8);
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding3 = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding3);
        FrameLayout frameLayout = activityLoseWeightPlanBinding3.loseWeightFrameContainer;
        View view = this.settingGoalView;
        Objects.requireNonNull(view);
        if (view.getParent() != null) {
            View view2 = this.settingGoalView;
            Objects.requireNonNull(view2);
            frameLayout.removeView(view2);
        }
        View view3 = this.settingGoalView;
        Objects.requireNonNull(view3);
        frameLayout.addView(view3);
    }

    private final void k() {
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding);
        activityLoseWeightPlanBinding.rlLoadingWeightInfo.setVisibility(8);
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBinding2 = this.binding;
        Objects.requireNonNull(activityLoseWeightPlanBinding2);
        activityLoseWeightPlanBinding2.loseWeightWeightInfoInvalid.setText(getString(R.string.lose_weight_smaller_weight));
    }

    private final void loadData() {
        e().loadCurrentUserWeightInfo().observe(this, new Observer() { // from class: kt4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoseWeightPlanGoalFragment.h(this.a, (WeightInfoStatus) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initView() {
        View viewInflate = View.inflate(requireContext(), R.layout.fragment_lose_weight_confirm_goal, null);
        RulerView rulerView = (RulerView) viewInflate.findViewById(R.id.lose_weight_rulerView);
        rulerView.setOnChooseResultListener(new RulerView.OnChooseResultListener() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanGoalFragment$initView$1$1$1
            @Override // com.xiaomi.hm.health.bodyfat.view.RulerView.OnChooseResultListener
            public void onScrollResult(@NotNull String result) {
                this.a.loseWeightGoal = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) result, new char[]{'.'}, false, 0, 6, (Object) null).get(0));
            }
        });
        rulerView.setSelectPosition(this.loseWeightGoal);
        ((TextView) viewInflate.findViewById(R.id.lose_weight_goal_confirm)).setOnClickListener(new View.OnClickListener() { // from class: jt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoseWeightPlanGoalFragment.f(this.a, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.settingGoalView = viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_TARGETSET_PAGE_V));
        ActivityLoseWeightPlanBinding activityLoseWeightPlanBindingInflate = ActivityLoseWeightPlanBinding.inflate(inflater);
        this.binding = activityLoseWeightPlanBindingInflate;
        Objects.requireNonNull(activityLoseWeightPlanBindingInflate);
        return activityLoseWeightPlanBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.loseWeightInfo == null) {
            loadData();
        } else {
            j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.loseWeightInfo = d().getCurrentLoseWeightInfo();
        this.loseWeightGoal = d().getCurrentLoseWeightGoal();
        initView();
    }
}
