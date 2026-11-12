package com.huami.third.wechat.ui.bind.bind;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ui.R;
import com.huami.third.wechat.ui.StateEvent;
import com.huami.third.wechat.ui.UtilsKt;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.third.wechat.ui.bind.bind.WeChatBindDevicesFragment;
import com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment;
import com.huami.third.wechat.ui.databinding.FragmentBindDevicesBinding;
import com.huami.third.wechat.ui.entry.WeChatEntryViewModel;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/WeChatBindDevicesFragment;", "Landroidx/fragment/app/Fragment;", "", "o", "", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindInfo;", "data", "u", "w", "x", GoogleApiAvailabilityLight.b, "m", "Landroid/text/SpannableString;", z.j, "h", SOAP.XMLNS, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/huami/third/wechat/ui/databinding/FragmentBindDevicesBinding;", "a", "Lcom/huami/third/wechat/ui/databinding/FragmentBindDevicesBinding;", "binding", "Lcom/huami/third/wechat/ui/WeChatParams;", "b", "Lkotlin/Lazy;", "l", "()Lcom/huami/third/wechat/ui/WeChatParams;", "weChatParams", "Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "c", hl.k, "()Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "viewModel", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBindDevicesFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentBindDevicesBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy weChatParams;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceBindState.values().length];
            iArr[DeviceBindState.OTHER_BOUND.ordinal()] = 1;
            iArr[DeviceBindState.UNBIND.ordinal()] = 2;
            iArr[DeviceBindState.BOUND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeChatBindDevicesFragment() {
        Koin koinProxy = KoinProxyKt.getKoinProxy();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koinProxy.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.weChatParams = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WeChatParams>() { // from class: com.huami.third.wechat.ui.bind.bind.WeChatBindDevicesFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.third.wechat.ui.WeChatParams, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeChatParams getA() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(WeChatParams.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.third.wechat.ui.bind.bind.WeChatBindDevicesFragment$special$$inlined$sharedViewModel$default$1
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeChatEntryViewModel>() { // from class: com.huami.third.wechat.ui.bind.bind.WeChatBindDevicesFragment$special$$inlined$sharedViewModel$default$2
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
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(WeChatEntryViewModel.class), function0, objArr3);
            }
        });
    }

    private final void h() {
        StateEvent.INSTANCE.getNotifyRefreshDeviceList().observe(getViewLifecycleOwner(), new Observer() { // from class: an8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindDevicesFragment.i(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WeChatBindDevicesFragment weChatBindDevicesFragment, Boolean bool) {
        if (bool.booleanValue()) {
            weChatBindDevicesFragment.k().getSupportedDevice();
        }
    }

    private final SpannableString j() {
        StyleSpan styleSpan = new StyleSpan(1);
        String string = getString(R.string.thirdparty_sprot_bits);
        String string2 = getString(R.string.thirdparty_data_authorization_dialog_sport_detail);
        SpannableString spannableString = new SpannableString(string2 + string);
        spannableString.setSpan(styleSpan, string2.length(), string2.length() + string.length(), 17);
        return spannableString;
    }

    private final WeChatEntryViewModel k() {
        return (WeChatEntryViewModel) this.viewModel.getValue();
    }

    private final WeChatParams l() {
        return (WeChatParams) this.weChatParams.getValue();
    }

    private final void m(DeviceBindInfo data) {
        FragmentKt.findNavController(this).navigate(R.id.weChatBindSuccessFragment, BundleKt.bundleOf(TuplesKt.to("bind_type", WeChatBindSuccessFragment.TYPE_SPORTS), TuplesKt.to(WeChatBindSuccessFragment.DEVICE_NAME, data.getDeviceName()), TuplesKt.to(WeChatBindSuccessFragment.WX_DEVICE_ID, data.getWxDeviceId())));
    }

    private final void n(DeviceBindInfo data) {
        if (UtilsKt.checkNet(requireContext())) {
            k().goToWeChatDeviceBind(requireContext(), getViewLifecycleOwner().getLifecycle(), data);
        }
    }

    private final void o() {
        k().getSupportedDevice();
        k().getBindInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: cn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindDevicesFragment.p(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeChatBindDevicesFragment weChatBindDevicesFragment, List list) {
        weChatBindDevicesFragment.u(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WeChatBindDevicesFragment weChatBindDevicesFragment, View view) {
        FragmentActivity activity;
        if (androidx.p010navigation.View.findNavController(view).navigateUp() || (activity = weChatBindDevicesFragment.getActivity()) == null) {
            return;
        }
        activity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(WeChatBindDevicesFragment weChatBindDevicesFragment, View view, int i) {
        weChatBindDevicesFragment.k().showWechatSportType();
    }

    private final void s() {
        k().getShowRequestLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: bn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatBindDevicesFragment.t(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WeChatBindDevicesFragment weChatBindDevicesFragment, Boolean bool) {
        if (bool.booleanValue()) {
            weChatBindDevicesFragment.l().getLoadingView().showLoading(weChatBindDevicesFragment.requireActivity());
        } else {
            weChatBindDevicesFragment.l().getLoadingView().hideLoading(weChatBindDevicesFragment.requireActivity());
        }
    }

    private final void u(final List<DeviceBindInfo> data) {
        FragmentBindDevicesBinding fragmentBindDevicesBinding = this.binding;
        Objects.requireNonNull(fragmentBindDevicesBinding);
        fragmentBindDevicesBinding.listDevices.setAdapter((ListAdapter) new DeviceListAdapter(requireContext(), data));
        FragmentBindDevicesBinding fragmentBindDevicesBinding2 = this.binding;
        Objects.requireNonNull(fragmentBindDevicesBinding2);
        fragmentBindDevicesBinding2.listDevices.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: zm8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                WeChatBindDevicesFragment.v(data, this, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(List list, WeChatBindDevicesFragment weChatBindDevicesFragment, AdapterView adapterView, View view, int i, long j) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[((DeviceBindInfo) list.get(i)).getBindState().ordinal()];
        if (i2 == 1) {
            weChatBindDevicesFragment.w();
        } else if (i2 == 2) {
            weChatBindDevicesFragment.x((DeviceBindInfo) list.get(i));
        } else {
            if (i2 != 3) {
                return;
            }
            weChatBindDevicesFragment.m((DeviceBindInfo) list.get(i));
        }
    }

    private final void w() {
        CustomToast.showShort(requireContext(), R.string.msg_device_other_bind);
    }

    @SuppressLint({"InflateParams"})
    private final void x(final DeviceBindInfo data) {
        View viewInflate = getLayoutInflater().inflate(R.layout.view_data_authorization_dialog, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_wechat_sport)).setText(j());
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.thirdparty_data_authorization_dialog_title).setHeaderDividingLineVisible(false).setContentView(viewInflate).setNegativeButton(R.string.thirdparty_data_authorization_dialog_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.thirdparty_data_authorization_dialog_ok, new DialogInterface.OnClickListener() { // from class: xm8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WeChatBindDevicesFragment.y(this.a, data, dialogInterface, i);
            }
        }).setCancelable(true).show(getChildFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WeChatBindDevicesFragment weChatBindDevicesFragment, DeviceBindInfo deviceBindInfo, DialogInterface dialogInterface, int i) {
        weChatBindDevicesFragment.n(deviceBindInfo);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBindDevicesBinding fragmentBindDevicesBindingInflate = FragmentBindDevicesBinding.inflate(inflater);
        this.binding = fragmentBindDevicesBindingInflate;
        Objects.requireNonNull(fragmentBindDevicesBindingInflate);
        fragmentBindDevicesBindingInflate.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ym8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeChatBindDevicesFragment.q(this.a, view);
            }
        });
        FragmentBindDevicesBinding fragmentBindDevicesBinding = this.binding;
        Objects.requireNonNull(fragmentBindDevicesBinding);
        fragmentBindDevicesBinding.titleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: dn8
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                WeChatBindDevicesFragment.r(this.a, view, i);
            }
        });
        s();
        o();
        h();
        FragmentBindDevicesBinding fragmentBindDevicesBinding2 = this.binding;
        Objects.requireNonNull(fragmentBindDevicesBinding2);
        return fragmentBindDevicesBinding2.getRoot();
    }
}
