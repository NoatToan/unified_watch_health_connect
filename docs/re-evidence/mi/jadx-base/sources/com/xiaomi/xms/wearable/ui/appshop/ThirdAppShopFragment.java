package com.xiaomi.xms.wearable.ui.appshop;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.xms.wearable.ui.appshop.ThirdAppShopFragment;
import com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalFragment;
import com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketListFragment;
import defpackage.ftr;
import defpackage.psi;
import defpackage.wvi;
import defpackage.x1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/ThirdAppShopFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "updateRadioGroup", "()V", "Lkotlin/Function0;", "action", "checkConnect", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "setListener", "Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalFragment;", "localFragment", "Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketListFragment;", "marketFragment", "Lcom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketListFragment;", "Lftr;", "mDataBinding", "Lftr;", "", "Landroidx/fragment/app/Fragment;", "fragments", "Ljava/util/List;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdAppShopFragment extends BaseFragment {

    @NotNull
    public static final String KEY_DID = "key_did";

    @NotNull
    private final List<Fragment> fragments;

    @NotNull
    private final ThirdAppLocalFragment localFragment;
    private ftr mDataBinding;

    @NotNull
    private final ThirdAppMarketListFragment marketFragment;

    public ThirdAppShopFragment() {
        super(0, 1, null);
        ThirdAppLocalFragment thirdAppLocalFragment = new ThirdAppLocalFragment();
        this.localFragment = thirdAppLocalFragment;
        ThirdAppMarketListFragment thirdAppMarketListFragment = new ThirdAppMarketListFragment();
        this.marketFragment = thirdAppMarketListFragment;
        this.fragments = CollectionsKt__CollectionsKt.mutableListOf(thirdAppLocalFragment, thirdAppMarketListFragment);
    }

    private final void checkConnect(Function0<Unit> action) {
        if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
            action.invoke();
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, x1j.d);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ThirdAppShopFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTitle(x1j.q);
        ftr ftrVar = this$0.mDataBinding;
        if (ftrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            ftrVar = null;
        }
        ViewPager viewPager = ftrVar.D;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        viewPager.setAdapter(new ThirdAppFragmentAdapter(childFragmentManager, this$0.fragments));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(ThirdAppShopFragment this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ftr ftrVar = null;
        if (i == psi.t) {
            ftr ftrVar2 = this$0.mDataBinding;
            if (ftrVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            } else {
                ftrVar = ftrVar2;
            }
            ftrVar.D.L(0, true);
            return;
        }
        ftr ftrVar3 = this$0.mDataBinding;
        if (ftrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
        } else {
            ftrVar = ftrVar3;
        }
        ftrVar.D.L(1, true);
    }

    private final void updateRadioGroup() {
        ftr ftrVar = this.mDataBinding;
        ftr ftrVar2 = null;
        if (ftrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            ftrVar = null;
        }
        ViewGroup.LayoutParams layoutParams = ftrVar.C.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        Context context = getContext();
        layoutParams.width = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? -1 : ExtUtilsKt.getDp(420);
        ftr ftrVar3 = this.mDataBinding;
        if (ftrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
        } else {
            ftrVar2 = ftrVar3;
        }
        ftrVar2.C.setLayoutParams(layoutParams);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRadioGroup();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        ftr ftrVarA0 = ftr.A0(inflater, container, false);
        this.mDataBinding = ftrVarA0;
        if (ftrVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            ftrVarA0 = null;
        }
        View root = ftrVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        checkConnect(new Function0() { // from class: fbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdAppShopFragment.onViewCreated$lambda$0(this.f17633a);
            }
        });
        setListener();
        updateRadioGroup();
    }

    public final void setListener() {
        ftr ftrVar = this.mDataBinding;
        ftr ftrVar2 = null;
        if (ftrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
            ftrVar = null;
        }
        ftrVar.D.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.xms.wearable.ui.appshop.ThirdAppShopFragment.setListener.1
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                ftr ftrVar3 = ThirdAppShopFragment.this.mDataBinding;
                if (ftrVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
                    ftrVar3 = null;
                }
                ftrVar3.C.check(position == 0 ? psi.t : psi.w);
            }
        });
        ftr ftrVar3 = this.mDataBinding;
        if (ftrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataBinding");
        } else {
            ftrVar2 = ftrVar3;
        }
        ftrVar2.C.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: gbp
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                ThirdAppShopFragment.setListener$lambda$1(this.f18815a, radioGroup, i);
            }
        });
    }
}
