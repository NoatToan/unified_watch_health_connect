package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import defpackage.bw1;
import defpackage.eui;
import defpackage.sk5;
import defpackage.uf6;
import defpackage.wzi;
import defpackage.x8e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b:\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2$\u0010!\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060 \u0012\u0004\u0012\u00020\u00060\u001fH\u0004¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010*\u001a\n )*\u0004\u0018\u00010$0$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\"\u0010-\u001a\u00020,8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "", "initEnduranceLayout", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "hr", "initViews", "(Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;)V", "", "checked", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "switchView", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel$SwitchParams;", "switchParams", "Lkotlin/Function2;", "Lkotlin/Function1;", "syncFunc", "onSwitchChanged", "(ZLcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel$SwitchParams;Lkotlin/jvm/functions/Function2;)V", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "getTAG", "Lx8e;", "mEnduranceBinding", "Lx8e;", "getMEnduranceBinding", "()Lx8e;", "setMEnduranceBinding", "(Lx8e;)V", "Luf6;", "mRootBinding", "Luf6;", "getMRootBinding", "()Luf6;", "setMRootBinding", "(Luf6;)V", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseHuamiHealthMonitorFragment<VM extends BaseHuamiHealthMonitorViewModel<?>, VDB extends ViewDataBinding> extends BaseLoadableBindingFragment<VM, VDB> {
    private final String TAG;
    protected x8e mEnduranceBinding;
    protected uf6 mRootBinding;

    @NotNull
    private final String title;

    public BaseHuamiHealthMonitorFragment() {
        super(-1, bw1.f);
        String string = ApplicationExtKt.getApplication().getString(wzi.N4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.title = string;
        this.TAG = getClass().getSimpleName();
    }

    private final void initEnduranceLayout() {
        setMEnduranceBinding(getMRootBinding().A);
        if (AppUtil.INSTANCE.isPlayChannel() || !getMViewModel().isSupportEndurance()) {
            getMEnduranceBinding().getRoot().setVisibility(8);
            return;
        }
        getMEnduranceBinding().getRoot().setVisibility(0);
        getMEnduranceBinding().C.setTextVisible(false);
        getMEnduranceBinding().C.setLevels(EnduranceHelper.INSTANCE.defaultEnduranceLevels());
        VM mViewModel = getMViewModel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        mViewModel.observerEndurancePair(viewLifecycleOwner, new Observer() { // from class: d82
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseHuamiHealthMonitorFragment.initEnduranceLayout$lambda$2(this.f15204a, (Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEnduranceLayout$lambda$2(BaseHuamiHealthMonitorFragment this$0, Pair it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getMEnduranceBinding().C.setLevel(((Number) it.getFirst()).intValue());
        this$0.getMEnduranceBinding().A.setText((CharSequence) it.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchChanged$lambda$4(Function2 syncFunc, final boolean z, final BaseHuamiHealthMonitorFragment this$0, final SwitchButtonTwoLineTextView switchView) {
        Intrinsics.checkNotNullParameter(syncFunc, "$syncFunc");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchView, "$switchView");
        syncFunc.invoke(Boolean.valueOf(z), new Function1() { // from class: c82
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseHuamiHealthMonitorFragment.onSwitchChanged$lambda$4$lambda$3(z, this$0, switchView, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchChanged$lambda$4$lambda$3(boolean z, BaseHuamiHealthMonitorFragment this$0, SwitchButtonTwoLineTextView switchView, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchView, "$switchView");
        Logger.d("onSwitchChanged success:" + z2 + " checked:" + z + " ", new Object[0]);
        if (!z2) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
            switchView.setSwitch(!z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchChanged$lambda$5(SwitchButtonTwoLineTextView switchView, boolean z) {
        Intrinsics.checkNotNullParameter(switchView, "$switchView");
        switchView.setSwitch(!z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchChanged$lambda$6(boolean z, BaseHuamiHealthMonitorFragment this$0, SwitchButtonTwoLineTextView switchView, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(switchView, "$switchView");
        Logger.d("onSwitchChanged success:" + z2 + " checked:" + z + " ", new Object[0]);
        if (!z2) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
            switchView.setSwitch(!z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BaseHuamiHealthMonitorFragment this$0, HRDetect it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.initViews(it);
        return Unit.INSTANCE;
    }

    @NotNull
    public final x8e getMEnduranceBinding() {
        x8e x8eVar = this.mEnduranceBinding;
        if (x8eVar != null) {
            return x8eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEnduranceBinding");
        return null;
    }

    @NotNull
    public final uf6 getMRootBinding() {
        uf6 uf6Var = this.mRootBinding;
        if (uf6Var != null) {
            return uf6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRootBinding");
        return null;
    }

    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public void initViews(@NotNull HRDetect hr) {
        Intrinsics.checkNotNullParameter(hr, "hr");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayoutId() == -1) {
            throw new IllegalArgumentException("The layoutId must be passed in the constructor or override layoutId");
        }
        Intrinsics.checkNotNull(inflater);
        setMRootBinding((uf6) sk5.j(inflater, eui.R, container, false));
        setMBinding(sk5.j(inflater, getLayoutId(), getMRootBinding().B, true));
        setRootView(getMRootBinding().getRoot());
        return getRootView();
    }

    public final void onSwitchChanged(final boolean checked, @NotNull final SwitchButtonTwoLineTextView switchView, @Nullable BaseHuamiHealthMonitorViewModel.SwitchParams switchParams, @NotNull final Function2<? super Boolean, ? super Function1<? super Boolean, Unit>, Unit> syncFunc) {
        Intrinsics.checkNotNullParameter(switchView, "switchView");
        Intrinsics.checkNotNullParameter(syncFunc, "syncFunc");
        if (!getMViewModel().isDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            switchView.setSwitch(!checked);
            return;
        }
        if (!checked || switchParams == null || !switchParams.getNeedNotice()) {
            syncFunc.invoke(Boolean.valueOf(checked), new Function1() { // from class: g82
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseHuamiHealthMonitorFragment.onSwitchChanged$lambda$6(checked, this, switchView, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        int titleRes = switchParams.getTitleRes();
        int msgRes = switchParams.getMsgRes();
        Function0 function0 = new Function0() { // from class: e82
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseHuamiHealthMonitorFragment.onSwitchChanged$lambda$4(syncFunc, checked, this, switchView);
            }
        };
        Function0 function1 = new Function0() { // from class: f82
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseHuamiHealthMonitorFragment.onSwitchChanged$lambda$5(switchView, checked);
            }
        };
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showEnsureDialog(titleRes, msgRes, function0, function1, parentFragmentManager);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getTitle());
        initEnduranceLayout();
        getMViewModel().readDeviceConfig(new Function1() { // from class: b82
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseHuamiHealthMonitorFragment.onViewCreated$lambda$0(this.f3907a, (HRDetect) obj);
            }
        });
    }

    public final void setMEnduranceBinding(@NotNull x8e x8eVar) {
        Intrinsics.checkNotNullParameter(x8eVar, "<set-?>");
        this.mEnduranceBinding = x8eVar;
    }

    public final void setMRootBinding(@NotNull uf6 uf6Var) {
        Intrinsics.checkNotNullParameter(uf6Var, "<set-?>");
        this.mRootBinding = uf6Var;
    }
}
