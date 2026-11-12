package com.xiaomi.hm.health.bodyfat.slimming.view;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityMyLoseWeightPlanBinding;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSportDetail;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.WeightInfoStatus;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.view.popupmenu.CustomPopup;
import com.xiaomi.hm.health.bodyfat.view.popupmenu.TriangleDrawable;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0003J>\u0010\u0011\u001a\u00020\u00022\"\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00105¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/MyLoseWeightPlanFragment;", "Landroidx/fragment/app/Fragment;", "", "l", "initView", "m", "Landroid/view/View;", "g", "Ljava/util/ArrayList;", "", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "Lkotlin/collections/ArrayList;", "sportLists", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "weightInfo", "", "modifyType", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/bodyfat/slimming/view/OnCheckCallback;", "nextStep", "e", "", "message", "o", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityMyLoseWeightPlanBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityMyLoseWeightPlanBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup;", "b", "Lcom/xiaomi/hm/health/bodyfat/view/popupmenu/CustomPopup;", "customPopup", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "c", "Lkotlin/Lazy;", hl.k, "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "viewModel", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", GoogleApiAvailabilityLight.a, "f", "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "activityViewModel", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "loseWeightPlan", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MyLoseWeightPlanFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODIFY_SPORT_TIME = 101;
    public static final int MODIFY_SPORT_TYPE = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityMyLoseWeightPlanBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private CustomPopup customPopup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoseWeightPlan loseWeightPlan;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/MyLoseWeightPlanFragment$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "weightValue", "Lkotlin/Pair;", "", "getUnitPair", "MODIFY_SPORT_TIME", LogUtil.I, "MODIFY_SPORT_TYPE", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<String, String> getUnitPair(@NotNull Context context, int weightValue) {
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            return new Pair<>(HMWeightUtils.toUnitStr(context, weightUnit), HMWeightUtils.getWeightValueStringForDisplay(weightValue, weightUnit));
        }
    }

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
    public MyLoseWeightPlanFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoseWeightViewModel>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LoseWeightViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(LoseWeightViewModel.class), qualifier, objArr);
            }
        });
        this.activityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LoseWeightPlanEnterViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    private final void e(final OnCheckCallback nextStep) {
        k().loadCurrentUserWeightInfo().observe(requireActivity(), new Observer<T>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$checkoutWeightInfo$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                WeightInfoStatus weightInfoStatus = (WeightInfoStatus) t;
                int i = weightInfoStatus == null ? -1 : MyLoseWeightPlanFragment.WhenMappings.$EnumSwitchMapping$0[weightInfoStatus.ordinal()];
                if (i == 1) {
                    nextStep.onNextStep(this.k().getCurrentInfos());
                } else if (i != 2) {
                    MyLoseWeightPlanFragment myLoseWeightPlanFragment = this;
                    myLoseWeightPlanFragment.o(myLoseWeightPlanFragment.getString(R.string.lose_weight_need_weight_info_new));
                } else {
                    MyLoseWeightPlanFragment myLoseWeightPlanFragment2 = this;
                    myLoseWeightPlanFragment2.o(myLoseWeightPlanFragment2.getString(R.string.lose_weight_smaller_weight));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoseWeightPlanEnterViewModel f() {
        return (LoseWeightPlanEnterViewModel) this.activityViewModel.getValue();
    }

    @SuppressLint({"InflateParams"})
    private final View g() {
        View viewInflate = getLayoutInflater().inflate(R.layout.popup_menu_lose_weight_layout, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.modify_goal)).setOnClickListener(new View.OnClickListener() { // from class: wa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyLoseWeightPlanFragment.h(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.modify_sport_type)).setOnClickListener(new View.OnClickListener() { // from class: va5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyLoseWeightPlanFragment.i(this.a, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.modify_sport_time)).setOnClickListener(new View.OnClickListener() { // from class: xa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyLoseWeightPlanFragment.j(this.a, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final MyLoseWeightPlanFragment myLoseWeightPlanFragment, View view) {
        CustomPopup customPopup = myLoseWeightPlanFragment.customPopup;
        Objects.requireNonNull(customPopup);
        customPopup.dismiss();
        myLoseWeightPlanFragment.e(new OnCheckCallback() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$getMenuClickListener$1$1
            @Override // com.xiaomi.hm.health.bodyfat.slimming.view.OnCheckCallback
            public void onNextStep(@NotNull WeightInfos weightInfo) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_EDITTARGET_BUTTON_C));
                LoseWeightPlan loseWeightPlan = this.a.loseWeightPlan;
                Integer numValueOf = loseWeightPlan == null ? null : Integer.valueOf(loseWeightPlan.getLoseWeight());
                if (numValueOf == null) {
                    return;
                }
                int iIntValue = numValueOf.intValue();
                this.a.f().setCurrentLoseWeightInfo(LoseWeightViewModel.INSTANCE.getLoseWeightWeightInofs(weightInfo, iIntValue));
                this.a.f().setCurrentLoseWeightGoal(iIntValue);
                this.a.f().setCurrentModifyType(-1);
                ((LoseWeightPlanEnterActivity) this.a.requireActivity()).showGoalFragment();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final MyLoseWeightPlanFragment myLoseWeightPlanFragment, View view) {
        CustomPopup customPopup = myLoseWeightPlanFragment.customPopup;
        Objects.requireNonNull(customPopup);
        customPopup.dismiss();
        myLoseWeightPlanFragment.k().getLoseWeightWeightInfo().observe(myLoseWeightPlanFragment.requireActivity(), new Observer<T>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$getMenuClickListener$lambda-3$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoseWeightWeightInfo loseWeightWeightInfo = (LoseWeightWeightInfo) t;
                if (loseWeightWeightInfo == null) {
                    IconToast.showError(this.a.requireContext(), R.string.load_error);
                    return;
                }
                Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_EDITSPORT_BUTTON_C));
                this.a.n(this.a.k().getLoseWeightPlan(loseWeightWeightInfo), loseWeightWeightInfo, 100);
            }
        });
    }

    private final void initView() {
        this.loseWeightPlan = f().getCurrentLoseWeightPlan();
        Companion companion = INSTANCE;
        Context contextRequireContext = requireContext();
        LoseWeightPlan loseWeightPlan = this.loseWeightPlan;
        Pair<String, String> unitPair = companion.getUnitPair(contextRequireContext, loseWeightPlan == null ? 0 : loseWeightPlan.getLoseWeight());
        String strComponent1 = unitPair.component1();
        String strComponent2 = unitPair.component2();
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding);
        activityMyLoseWeightPlanBinding.myLoseWeightPlanGoal.setText(strComponent2);
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding2 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding2);
        activityMyLoseWeightPlanBinding2.myLoseWeightPlanGoalUnit.setText(strComponent1);
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding3 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding3);
        TextView textView = activityMyLoseWeightPlanBinding3.myLoseWeightPlanPeriod;
        LoseWeightPlan loseWeightPlan2 = this.loseWeightPlan;
        textView.setText(loseWeightPlan2 == null ? null : loseWeightPlan2.getDuration());
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding4 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding4);
        TextView textView2 = activityMyLoseWeightPlanBinding4.myLoseWeightPlanSportType;
        GridViewAdapter.Companion companion2 = GridViewAdapter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        LoseWeightPlan loseWeightPlan3 = this.loseWeightPlan;
        textView2.setText(companion2.getSportName(contextRequireContext2, loseWeightPlan3 == null ? null : loseWeightPlan3.getExerciseName()));
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding5 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding5);
        TextView textView3 = activityMyLoseWeightPlanBinding5.myLoseWeightPlanSportTimeDay;
        LoseWeightPlan loseWeightPlan4 = this.loseWeightPlan;
        textView3.setText(String.valueOf(loseWeightPlan4 != null ? Integer.valueOf(loseWeightPlan4.getExerciseMinutes()) : null));
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding6 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding6);
        TextView textView4 = activityMyLoseWeightPlanBinding6.myLoseWeightPlanSportTimeWeek;
        LoseWeightPlan loseWeightPlan5 = this.loseWeightPlan;
        textView4.setText(String.valueOf((loseWeightPlan5 != null ? loseWeightPlan5.getExerciseMinutes() : 0) * 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MyLoseWeightPlanFragment myLoseWeightPlanFragment, View view) {
        CustomPopup customPopup = myLoseWeightPlanFragment.customPopup;
        Objects.requireNonNull(customPopup);
        customPopup.dismiss();
        myLoseWeightPlanFragment.e(new MyLoseWeightPlanFragment$getMenuClickListener$3$1(myLoseWeightPlanFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoseWeightViewModel k() {
        return (LoseWeightViewModel) this.viewModel.getValue();
    }

    private final void l() {
        UserInfos ownerUserInfo = k().getOwnerUserInfo();
        BFCallback.IBFCallBack bFCallback = BFCallback.getInstance();
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding);
        bFCallback.updateAvatarUI(activityMyLoseWeightPlanBinding.myLoseWeightPersonInfoAvatar, ownerUserInfo.getAvatarPath(), ownerUserInfo.getAvatarUrl(), ownerUserInfo.getName());
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBinding2 = this.binding;
        Objects.requireNonNull(activityMyLoseWeightPlanBinding2);
        activityMyLoseWeightPlanBinding2.myLoseWeightPersonName.setText(ownerUserInfo.getName());
    }

    private final void m() {
        this.customPopup = CustomPopup.INSTANCE.create().setContext(requireContext()).setContentView(g()).setAnimationStyle(R.style.rightTopPopAnimStyle).setOnViewListener(new CustomPopup.OnViewListener() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$initPopupView$1
            @Override // com.xiaomi.hm.health.bodyfat.view.popupmenu.CustomPopup.OnViewListener
            public void initViews(@Nullable View view, @Nullable CustomPopup popup) {
                View viewFindViewById = view == null ? null : view.findViewById(R.id.v_arrow);
                if (viewFindViewById == null) {
                    return;
                }
                viewFindViewById.setBackground(new TriangleDrawable(12, Color.parseColor("#767677")));
            }
        }).setFocusAndOutsideEnable(true).apply();
        ((LoseWeightPlanEnterActivity) requireActivity()).setRightMenuClick(new View.OnClickListener() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$initPopupView$2
            @Override // android.view.View.OnClickListener
            public void onClick(@Nullable View v) {
                if (v == null) {
                    return;
                }
                int height = 100 - v.getHeight();
                CustomPopup customPopup = this.a.customPopup;
                Objects.requireNonNull(customPopup);
                customPopup.showAtAnchorView(v, 2, 4, -10, height);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(ArrayList<List<LoseWeightSportDetail>> sportLists, LoseWeightWeightInfo weightInfo, int modifyType) {
        f().setCurrentSportsList(sportLists);
        f().setCurrentLoseWeightInfo(weightInfo);
        f().setCurrentModifyType(modifyType);
        LoseWeightPlanEnterViewModel loseWeightPlanEnterViewModelF = f();
        LoseWeightPlan loseWeightPlan = this.loseWeightPlan;
        loseWeightPlanEnterViewModelF.setCurrentLoseWeightGoal((loseWeightPlan == null ? null : Integer.valueOf(loseWeightPlan.getLoseWeight())).intValue());
        ((LoseWeightPlanEnterActivity) requireActivity()).showSportTypeFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void o(String message) {
        AlertDialogFragment.Builder neutralButton;
        AlertDialogFragment.Builder message2 = new AlertDialogFragment.Builder(requireContext()).setMessage(message);
        if (message2 != null && (neutralButton = message2.setNeutralButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: ua5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MyLoseWeightPlanFragment.p(dialogInterface, i);
            }
        })) != null) {
            neutralButton.show(requireActivity().getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DialogInterface dialogInterface, int i) {
        if (dialogInterface == null) {
            return;
        }
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_PLANSHOW_PAGE_V));
        ActivityMyLoseWeightPlanBinding activityMyLoseWeightPlanBindingInflate = ActivityMyLoseWeightPlanBinding.inflate(inflater);
        this.binding = activityMyLoseWeightPlanBindingInflate;
        Objects.requireNonNull(activityMyLoseWeightPlanBindingInflate);
        return activityMyLoseWeightPlanBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        l();
        initView();
        m();
    }
}
