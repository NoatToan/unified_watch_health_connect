package com.huami.third.wechat.ui.entry;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ui.AnalyzeUtilsKt;
import com.huami.third.wechat.ui.R;
import com.huami.third.wechat.ui.UtilsKt;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.third.wechat.ui.entry.WeChatEntryFragment;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/third/wechat/ui/entry/WeChatEntryFragment;", "Landroidx/fragment/app/Fragment;", "", "r", "l", z.j, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "a", "Lkotlin/Lazy;", "i", "()Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "viewModel", "Lcom/huami/third/wechat/ui/WeChatParams;", "b", "h", "()Lcom/huami/third/wechat/ui/WeChatParams;", "params", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatEntryFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy params;

    /* JADX WARN: Multi-variable type inference failed */
    public WeChatEntryFragment() {
        super(R.layout.fragment_entry_wechat);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.third.wechat.ui.entry.WeChatEntryFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeChatEntryViewModel>() { // from class: com.huami.third.wechat.ui.entry.WeChatEntryFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.third.wechat.ui.entry.WeChatEntryViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeChatEntryViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WeChatEntryViewModel.class), function0, objArr);
            }
        });
        Koin koinProxy = KoinProxyKt.getKoinProxy();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koinProxy.getScopeRegistry().getRootScope();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.params = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeChatParams>() { // from class: com.huami.third.wechat.ui.entry.WeChatEntryFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.third.wechat.ui.WeChatParams, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeChatParams getA() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(WeChatParams.class), objArr2, objArr3);
            }
        });
    }

    private final WeChatParams h() {
        return (WeChatParams) this.params.getValue();
    }

    private final WeChatEntryViewModel i() {
        return (WeChatEntryViewModel) this.viewModel.getValue();
    }

    private final void j() {
        i().checkShowWeChatSportBindEntry().observe(getViewLifecycleOwner(), new Observer() { // from class: rn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatEntryFragment.k(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WeChatEntryFragment weChatEntryFragment, Boolean bool) {
        if (bool.booleanValue()) {
            View view = weChatEntryFragment.getView();
            ListTile listTile = view == null ? null : (ListTile) view.findViewById(R.id.item_device_sports_bind);
            if (listTile == null) {
                return;
            }
            listTile.setVisibility(0);
        }
    }

    private final void l() {
        i().checkBindState().observe(getViewLifecycleOwner(), new Observer() { // from class: tn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatEntryFragment.m(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final WeChatEntryFragment weChatEntryFragment, Boolean bool) {
        View view = weChatEntryFragment.getView();
        final ListTile listTile = view == null ? null : (ListTile) view.findViewById(R.id.item_steps);
        if (bool.booleanValue()) {
            if (listTile == null) {
                return;
            }
            listTile.setTips(R.string.bind_wechat_status);
            listTile.setOnClickListener(new View.OnClickListener() { // from class: pn8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WeChatEntryFragment.n(this.a, listTile, view2);
                }
            });
            return;
        }
        if (listTile == null) {
            return;
        }
        listTile.setTips(R.string.wechat_device_unbind);
        listTile.setOnClickListener(new View.OnClickListener() { // from class: qn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatEntryFragment.o(this.a, listTile, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(WeChatEntryFragment weChatEntryFragment, ListTile listTile, View view) {
        if (UtilsKt.checkNet(weChatEntryFragment.requireContext())) {
            androidx.p010navigation.View.findNavController(listTile).navigate(R.id.weChatBindSuccessFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WeChatEntryFragment weChatEntryFragment, ListTile listTile, View view) {
        if (UtilsKt.checkNet(weChatEntryFragment.requireContext())) {
            androidx.p010navigation.View.findNavController(listTile).navigate(R.id.weChatBindFragment);
            AnalyzeUtilsKt.analytics$default(AnalyzeUtilsKt.EVENT_ENTER_WECHAT_STEP, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeChatEntryFragment weChatEntryFragment, View view) {
        FragmentActivity activity = weChatEntryFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WeChatEntryFragment weChatEntryFragment, View view) {
        if (UtilsKt.checkNet(weChatEntryFragment.requireContext())) {
            androidx.p010navigation.View.findNavController(view).navigate(R.id.weChatBindDevicesFragment);
            AnalyzeUtilsKt.analytics$default(AnalyzeUtilsKt.EVENT_ENTER_WECHAT_SPORT, null, 2, null);
        }
    }

    private final void r() {
        i().getShowRequestLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: sn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatEntryFragment.s(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WeChatEntryFragment weChatEntryFragment, Boolean bool) {
        if (bool.booleanValue()) {
            weChatEntryFragment.h().getLoadingView().showLoading(weChatEntryFragment.requireActivity());
        } else {
            weChatEntryFragment.h().getLoadingView().hideLoading(weChatEntryFragment.requireActivity());
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ((RainbowTitleBar) view.findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: nn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatEntryFragment.p(this.a, view2);
            }
        });
        r();
        l();
        j();
        ((ListTile) view.findViewById(R.id.item_device_sports_bind)).setOnClickListener(new View.OnClickListener() { // from class: on8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeChatEntryFragment.q(this.a, view2);
            }
        });
    }
}
