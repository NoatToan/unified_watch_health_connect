package com.huami.jac.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p010navigation.NavArgsLazy;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.fragment.JacCardResultFragment;
import com.huami.jac.ui.amazfit.navigation.JacNavigationApi;
import com.huami.jac.ui.amazfit.utils.RainbowTitleBarExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacCardResultFragment;", "Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "", "l", "", "setViewId", "", "showBleStatusMaskView", "initView", "onBackButtonClick", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "e", "Lkotlin/Lazy;", z.j, "()Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "navigationApi", "Lcom/huami/jac/ui/amazfit/fragment/JacCardResultFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", "i", "()Lcom/huami/jac/ui/amazfit/fragment/JacCardResultFragmentArgs;", "args", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardResultFragment extends JacBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args;

    /* JADX WARN: Multi-variable type inference failed */
    public JacCardResultFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacNavigationApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardResultFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.jac.ui.amazfit.navigation.JacNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final JacNavigationApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacNavigationApi.class), qualifier, objArr);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(JacCardResultFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardResultFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Bundle invoke() {
                Bundle arguments = this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + this + " has null arguments");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JacCardResultFragmentArgs i() {
        return (JacCardResultFragmentArgs) this.args.getValue();
    }

    private final JacNavigationApi j() {
        return (JacNavigationApi) this.navigationApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(JacCardResultFragment jacCardResultFragment, View view) {
        jacCardResultFragment.l();
    }

    private final void l() {
        if (i().getIsSuccess()) {
            j().resultToDetail(getNavController(), Boolean.TRUE);
        } else {
            j().toJacAppCardManager(requireContext(), false);
            requireActivity().finish();
        }
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBarInitTitleBar = super.initTitleBar();
        if (rainbowTitleBarInitTitleBar == null) {
            return null;
        }
        rainbowTitleBarInitTitleBar.setTitle(R.string.jac_car_s_title);
        rainbowTitleBarInitTitleBar.setBackgroundResource(R.color.jac_theme_black);
        RainbowTitleBarExtKt.useWhiteMode(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initView() {
        if (!i().getIsSuccess()) {
            View view = getView();
            ((ImageView) (view == null ? null : view.findViewById(R.id.car_result_iv))).setImageResource(R.drawable.jac_fail);
            View view2 = getView();
            ((Button) (view2 == null ? null : view2.findViewById(R.id.car_result_bt))).setText(getText(R.string.jac_car_s_i_know));
            View view3 = getView();
            ((TextView) (view3 == null ? null : view3.findViewById(R.id.car_result_reminds))).setText(getText(R.string.jac_car_s_tips_fail));
            String errorMsg = i().getErrorMsg();
            boolean z = true;
            if (!(errorMsg == null || errorMsg.length() == 0)) {
                View view4 = getView();
                ((TextView) (view4 == null ? null : view4.findViewById(R.id.car_result_error))).setVisibility(0);
                View view5 = getView();
                ((TextView) (view5 == null ? null : view5.findViewById(R.id.car_result_error))).setText(i().getErrorMsg());
            }
            String errorCode = i().getErrorCode();
            if (errorCode != null && errorCode.length() != 0) {
                z = false;
            }
            if (!z) {
                View view6 = getView();
                ((TextView) (view6 == null ? null : view6.findViewById(R.id.car_result_error_code))).setVisibility(0);
                View view7 = getView();
                ((TextView) (view7 == null ? null : view7.findViewById(R.id.car_result_error_code))).setText(i().getErrorCode());
            }
        }
        View view8 = getView();
        ((Button) (view8 != null ? view8.findViewById(R.id.car_result_bt) : null)).setOnClickListener(new View.OnClickListener() { // from class: fi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                JacCardResultFragment.k(this.a, view9);
            }
        });
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void onBackButtonClick() {
        l();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public int setViewId() {
        return R.layout.jac_fragment_car_result;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public boolean showBleStatusMaskView() {
        return false;
    }
}
