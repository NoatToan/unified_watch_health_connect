package com.xiaomi.hm.health.device.headset.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareActivity;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel;
import com.xiaomi.hm.health.device.headset.ui.MozartUpgradeCheckFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/MozartUpgradeCheckFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "g", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onActivityCreated", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel;", "prepareViewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MozartUpgradeCheckFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "device_address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MozartUpgradePrepareViewModel prepareViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/MozartUpgradeCheckFragment$Companion;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/device/headset/ui/MozartUpgradeCheckFragment;", "newInstance", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MozartUpgradeCheckFragment newInstance(@NotNull String address) {
            MozartUpgradeCheckFragment mozartUpgradeCheckFragment = new MozartUpgradeCheckFragment();
            Bundle bundle = new Bundle();
            bundle.putString(MozartUpgradeCheckFragment.d, address);
            Unit unit = Unit.INSTANCE;
            mozartUpgradeCheckFragment.setArguments(bundle);
            return mozartUpgradeCheckFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MozartUpgradeCheckFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.MozartUpgradeCheckFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi d() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MozartUpgradeCheckFragment mozartUpgradeCheckFragment, View view) {
        mozartUpgradeCheckFragment.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MozartUpgradeCheckFragment mozartUpgradeCheckFragment, Boolean bool) {
        MozartUpgradePrepareActivity mozartUpgradePrepareActivity;
        if (bool.booleanValue()) {
            FragmentActivity activity = mozartUpgradeCheckFragment.getActivity();
            if (!(activity == null ? true : activity instanceof MozartUpgradePrepareActivity) || (mozartUpgradePrepareActivity = (MozartUpgradePrepareActivity) mozartUpgradeCheckFragment.getActivity()) == null) {
                return;
            }
            mozartUpgradePrepareActivity.setResult(-1);
            mozartUpgradePrepareActivity.onReady();
        }
    }

    private final void g() {
        MozartUpgradePrepareActivity mozartUpgradePrepareActivity;
        MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel = this.prepareViewModel;
        Objects.requireNonNull(mozartUpgradePrepareViewModel);
        if (!mozartUpgradePrepareViewModel.isReady()) {
            new AlertDialogFragment.Builder(getContext()).setTitle(R.string.headset_connect_failed).setMessage(R.string.headset_upgrade_out_box_tips).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: v85
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MozartUpgradeCheckFragment.h(dialogInterface, i);
                }
            }).create().show(getChildFragmentManager());
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null ? true : activity instanceof MozartUpgradePrepareActivity) || (mozartUpgradePrepareActivity = (MozartUpgradePrepareActivity) getActivity()) == null) {
            return;
        }
        mozartUpgradePrepareActivity.onReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DialogInterface dialogInterface, int i) {
    }

    @JvmStatic
    @NotNull
    public static final MozartUpgradeCheckFragment newInstance(@NotNull String str) {
        return INSTANCE.newInstance(str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        MozartUpgradePrepareActivity mozartUpgradePrepareActivity;
        super.onActivityCreated(savedInstanceState);
        String str = this.address;
        Objects.requireNonNull(str);
        if (m.isBlank(str)) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_upgrade))).setOnClickListener(new View.OnClickListener() { // from class: w85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MozartUpgradeCheckFragment.e(this.a, view2);
            }
        });
        MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel = (MozartUpgradePrepareViewModel) new ViewModelProvider(this).get(MozartUpgradePrepareViewModel.class);
        this.prepareViewModel = mozartUpgradePrepareViewModel;
        Objects.requireNonNull(mozartUpgradePrepareViewModel);
        DeviceManagerApi deviceManagerApiD = d();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str2 = this.address;
        Objects.requireNonNull(str2);
        mozartUpgradePrepareViewModel.setDevice(deviceManagerApiD.getBindDevice(hMDeviceType, str2));
        MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel2 = this.prepareViewModel;
        Objects.requireNonNull(mozartUpgradePrepareViewModel2);
        if (!mozartUpgradePrepareViewModel2.isReady()) {
            MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel3 = this.prepareViewModel;
            Objects.requireNonNull(mozartUpgradePrepareViewModel3);
            mozartUpgradePrepareViewModel3.getReadyLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: x85
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    MozartUpgradeCheckFragment.f(this.a, (Boolean) obj);
                }
            });
        } else {
            FragmentActivity activity2 = getActivity();
            if (!(activity2 == null ? true : activity2 instanceof MozartUpgradePrepareActivity) || (mozartUpgradePrepareActivity = (MozartUpgradePrepareActivity) getActivity()) == null) {
                return;
            }
            mozartUpgradePrepareActivity.onReady();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            savedInstanceState = arguments;
        }
        if (savedInstanceState == null) {
            return;
        }
        String string = savedInstanceState.getString(d);
        if (string == null) {
            string = "";
        }
        this.address = string;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mozart_upgrage_check, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        if (!m.isBlank(str)) {
            String str2 = this.address;
            Objects.requireNonNull(str2);
            outState.putString(d, str2);
        }
    }
}
