package com.xiaomi.hm.health.play.card.health;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.activity.ChangeSportGoalActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightGoalsSetActivity;
import com.xiaomi.hm.health.databinding.LayoutToolTargetSettingBinding;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.TargetSettingRender;
import com.xiaomi.hm.health.play.health.HealthViewModel;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.goal.ui.SetCalorieGoalActivity;
import com.xiaomi.hm.health.ui.goal.ui.SetSleepGoalActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\b\u0007*\u0001'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/TargetSettingRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolTargetSettingBinding;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", SOAP.XMLNS, "r", "onClear", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "onCardClick", "initData", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "h", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "healthViewModel", "", "i", LogUtil.I, "mGoalStepValue", z.j, "mGoalCalorieValue", hl.k, "mGoalWeightValue", "l", "mGoalSleepValue", "com/xiaomi/hm/health/play/card/health/TargetSettingRender$mLifeCycleObserver$1", "m", "Lcom/xiaomi/hm/health/play/card/health/TargetSettingRender$mLifeCycleObserver$1;", "mLifeCycleObserver", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TargetSettingRender extends AbstractCardRender<LayoutToolTargetSettingBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mGoalStepValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mGoalCalorieValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mGoalWeightValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mGoalSleepValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final TargetSettingRender$mLifeCycleObserver$1 mLifeCycleObserver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.LifecycleObserver, com.xiaomi.hm.health.play.card.health.TargetSettingRender$mLifeCycleObserver$1] */
    public TargetSettingRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.health.TargetSettingRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthViewModel>() { // from class: com.xiaomi.hm.health.play.card.health.TargetSettingRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.health.HealthViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(HealthViewModel.class), function0, objArr);
            }
        });
        this.mGoalStepValue = 8000;
        this.mGoalCalorieValue = 300;
        this.mGoalWeightValue = -1;
        this.mGoalSleepValue = 480;
        ?? r0 = new LifecycleObserver() { // from class: com.xiaomi.hm.health.play.card.health.TargetSettingRender$mLifeCycleObserver$1
            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                this.a.q().requestGoalValue();
            }
        };
        this.mLifeCycleObserver = r0;
        q().getGoalStepValue().observe(lifecycleOwner, new Observer() { // from class: el7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TargetSettingRender.m(this.a, (Integer) obj);
            }
        });
        q().getGoalCalorieValue().observe(lifecycleOwner, new Observer() { // from class: bl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TargetSettingRender.n(this.a, (Integer) obj);
            }
        });
        q().getGoalWeightValue().observe(lifecycleOwner, new Observer() { // from class: dl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TargetSettingRender.o(this.a, (Integer) obj);
            }
        });
        q().getGoalSleepValue().observe(lifecycleOwner, new Observer() { // from class: cl7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TargetSettingRender.p(this.a, (Integer) obj);
            }
        });
        lifecycleOwner.getLifecycle().addObserver(r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TargetSettingRender targetSettingRender, Integer num) {
        targetSettingRender.mGoalStepValue = num.intValue();
        targetSettingRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TargetSettingRender targetSettingRender, Integer num) {
        targetSettingRender.mGoalCalorieValue = num.intValue();
        targetSettingRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TargetSettingRender targetSettingRender, Integer num) {
        targetSettingRender.mGoalWeightValue = num.intValue();
        targetSettingRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TargetSettingRender targetSettingRender, Integer num) {
        targetSettingRender.mGoalSleepValue = num.intValue();
        targetSettingRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthViewModel q() {
        return (HealthViewModel) this.healthViewModel.getValue();
    }

    private final void r(Context context) {
        String string = context.getResources().getString(R.string.play_tool_not_set);
        getBinding().toolTargetSettingStep.setText(String.valueOf(this.mGoalStepValue));
        AppCompatTextView appCompatTextView = getBinding().toolTargetSettingStepUnit;
        Resources resources = context.getResources();
        int i = this.mGoalStepValue;
        appCompatTextView.setText(resources.getQuantityString(R.plurals.play_tool_step_unit, i, Integer.valueOf(i)));
        getBinding().toolTargetSettingKcal.setText(String.valueOf(this.mGoalCalorieValue));
        AppCompatTextView appCompatTextView2 = getBinding().toolTargetSettingKcalUnit;
        Resources resources2 = context.getResources();
        int i2 = this.mGoalCalorieValue;
        appCompatTextView2.setText(resources2.getQuantityString(R.plurals.play_tool_kcal_unit, i2, Integer.valueOf(i2)));
        if (this.mGoalWeightValue > 0) {
            getBinding().toolTargetSettingWeight.setText(String.valueOf(this.mGoalWeightValue));
            getBinding().toolTargetSettingWeightUnit.setText(GoalFunctionsKt.getGoalWeightValueUnit());
            getBinding().toolTargetSettingWeight.setVisibility(0);
        } else {
            getBinding().toolTargetSettingWeightUnit.setText(string);
            getBinding().toolTargetSettingWeight.setVisibility(8);
        }
        int i3 = this.mGoalSleepValue;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        getBinding().toolTargetSettingHour.setText(String.valueOf(i4));
        if (i5 <= 0) {
            getBinding().toolTargetSettingMinute.setVisibility(8);
            getBinding().toolTargetSettingMinuteUnit.setVisibility(8);
            getBinding().toolTargetSettingHourUnit.setText(context.getString(R.string.hm_common_hour_long));
        } else {
            getBinding().toolTargetSettingMinute.setText(String.valueOf(i5));
            getBinding().toolTargetSettingMinuteUnit.setText(context.getString(R.string.hm_common_minute_long));
            getBinding().toolTargetSettingMinute.setVisibility(0);
            getBinding().toolTargetSettingMinuteUnit.setVisibility(0);
            getBinding().toolTargetSettingHourUnit.setText(context.getString(R.string.hm_common_hour_long));
        }
    }

    private final void s(final Context context) {
        getBinding().toolTargetSettingStepLayout.setOnClickListener(new View.OnClickListener() { // from class: zk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TargetSettingRender.t(context, this, view);
            }
        });
        getBinding().toolTargetSettingKcalLayout.setOnClickListener(new View.OnClickListener() { // from class: yk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TargetSettingRender.u(context, this, view);
            }
        });
        getBinding().toolTargetSettingWeightLayout.setOnClickListener(new View.OnClickListener() { // from class: xk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TargetSettingRender.v(context, this, view);
            }
        });
        getBinding().toolTargetSettingSleepLayout.setOnClickListener(new View.OnClickListener() { // from class: al7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TargetSettingRender.w(context, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Context context, TargetSettingRender targetSettingRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) ChangeSportGoalActivity.class));
        targetSettingRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Context context, TargetSettingRender targetSettingRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        SetCalorieGoalActivity.INSTANCE.start(context);
        targetSettingRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Context context, TargetSettingRender targetSettingRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) WeightGoalsSetActivity.class));
        targetSettingRender.recordClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Context context, TargetSettingRender targetSettingRender, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        SetSleepGoalActivity.INSTANCE.start(context);
        targetSettingRender.recordClickEvent();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        s(context);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        q().getGoalStepValue().removeObservers(this.lifecycleOwner);
        q().getGoalCalorieValue().removeObservers(this.lifecycleOwner);
        q().getGoalWeightValue().removeObservers(this.lifecycleOwner);
        q().getGoalSleepValue().removeObservers(this.lifecycleOwner);
        this.lifecycleOwner.getLifecycle().removeObserver(this.mLifeCycleObserver);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        r(BraceletApp.getContext());
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolTargetSettingBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolTargetSettingBinding.inflate(inflater, rootView, true);
    }
}
