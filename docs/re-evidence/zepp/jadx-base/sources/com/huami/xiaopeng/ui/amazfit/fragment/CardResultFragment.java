package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.p010navigation.NavArgsLazy;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentCarResultBinding;
import com.huami.xiaopeng.ui.amazfit.fragment.CardResultFragment;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.huami.xiaopeng.ui.amazfit.utils.RainbowTitleBarExtKt;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CardResultFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", GoogleApiAvailabilityLight.b, "", "setViewId", "", "showBleStatusMaskView", "initView", "onBackButtonClick", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "e", "Lkotlin/Lazy;", "l", "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "Lcom/huami/xiaopeng/ui/amazfit/fragment/CardResultFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", hl.k, "()Lcom/huami/xiaopeng/ui/amazfit/fragment/CardResultFragmentArgs;", "args", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarResultBinding;", "g", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarResultBinding;", "binding", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CardResultFragment extends XpBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FragmentCarResultBinding binding;

    /* JADX WARN: Multi-variable type inference failed */
    public CardResultFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardResultFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XpNavigationApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(XpNavigationApi.class), qualifier, objArr);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(CardResultFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardResultFragment$special$$inlined$navArgs$1
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
    private final CardResultFragmentArgs k() {
        return (CardResultFragmentArgs) this.args.getValue();
    }

    private final XpNavigationApi l() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CardResultFragment cardResultFragment, View view) {
        cardResultFragment.n();
    }

    private final void n() {
        if (k().getIsSuccess()) {
            l().resultToDetail(getNavController(), Boolean.TRUE);
        } else {
            l().toXpAppCardManager(requireContext(), false);
            requireActivity().finish();
        }
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBarInitTitleBar = super.initTitleBar();
        if (rainbowTitleBarInitTitleBar == null) {
            return null;
        }
        rainbowTitleBarInitTitleBar.setTitle(R.string.car_s_xiaopeng_title);
        rainbowTitleBarInitTitleBar.setBackgroundResource(R.color.xp_theme_black);
        RainbowTitleBarExtKt.useWhiteMode(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initView() {
        this.binding = FragmentCarResultBinding.bind(findBindingView());
        if (!k().getIsSuccess()) {
            FragmentCarResultBinding fragmentCarResultBinding = this.binding;
            Objects.requireNonNull(fragmentCarResultBinding);
            fragmentCarResultBinding.carResultIv.setImageResource(R.drawable.xp_fail);
            FragmentCarResultBinding fragmentCarResultBinding2 = this.binding;
            Objects.requireNonNull(fragmentCarResultBinding2);
            fragmentCarResultBinding2.carResultBt.setText(getText(R.string.car_s_xiaopeng_i_know));
            FragmentCarResultBinding fragmentCarResultBinding3 = this.binding;
            Objects.requireNonNull(fragmentCarResultBinding3);
            fragmentCarResultBinding3.carResultReminds.setText(getText(R.string.car_s_xiaopeng_tips_fail));
            String errorMsg = k().getErrorMsg();
            boolean z = true;
            if (!(errorMsg == null || errorMsg.length() == 0)) {
                FragmentCarResultBinding fragmentCarResultBinding4 = this.binding;
                Objects.requireNonNull(fragmentCarResultBinding4);
                fragmentCarResultBinding4.carResultError.setVisibility(0);
                FragmentCarResultBinding fragmentCarResultBinding5 = this.binding;
                Objects.requireNonNull(fragmentCarResultBinding5);
                fragmentCarResultBinding5.carResultError.setText(k().getErrorMsg());
            }
            String errorCode = k().getErrorCode();
            if (errorCode != null && errorCode.length() != 0) {
                z = false;
            }
            if (!z) {
                FragmentCarResultBinding fragmentCarResultBinding6 = this.binding;
                Objects.requireNonNull(fragmentCarResultBinding6);
                fragmentCarResultBinding6.carResultErrorCode.setVisibility(0);
                FragmentCarResultBinding fragmentCarResultBinding7 = this.binding;
                Objects.requireNonNull(fragmentCarResultBinding7);
                fragmentCarResultBinding7.carResultErrorCode.setText(k().getErrorCode());
            }
        }
        FragmentCarResultBinding fragmentCarResultBinding8 = this.binding;
        Objects.requireNonNull(fragmentCarResultBinding8);
        fragmentCarResultBinding8.carResultBt.setOnClickListener(new View.OnClickListener() { // from class: ol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardResultFragment.m(this.a, view);
            }
        });
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void onBackButtonClick() {
        n();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_car_result;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public boolean showBleStatusMaskView() {
        return false;
    }
}
