package com.xiaomi.hm.health.device.headset.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareActivity;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel;
import com.xiaomi.hm.health.device.headset.ui.HeadsetStateCheckFragment;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0017\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetStateCheckFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareViewModel;", "prepareViewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/databases/model/Device;", "e", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/huami/devicex/manager/DeviceManagerApi;", "f", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetStateCheckFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "device_address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MozartUpgradePrepareViewModel prepareViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetStateCheckFragment$Companion;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/device/headset/ui/HeadsetStateCheckFragment;", "newInstance", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HeadsetStateCheckFragment newInstance(@NotNull String address) {
            HeadsetStateCheckFragment headsetStateCheckFragment = new HeadsetStateCheckFragment();
            Bundle bundle = new Bundle();
            bundle.putString(HeadsetStateCheckFragment.g, address);
            Unit unit = Unit.INSTANCE;
            headsetStateCheckFragment.setArguments(bundle);
            return headsetStateCheckFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetStateCheckFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetStateCheckFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(HeadsetStateCheckFragment headsetStateCheckFragment, Boolean bool) {
        MozartUpgradePrepareActivity mozartUpgradePrepareActivity;
        if (bool.booleanValue()) {
            FragmentActivity activity = headsetStateCheckFragment.getActivity();
            if (!(activity == null ? true : activity instanceof MozartUpgradePrepareActivity) || (mozartUpgradePrepareActivity = (MozartUpgradePrepareActivity) headsetStateCheckFragment.getActivity()) == null) {
                return;
            }
            mozartUpgradePrepareActivity.setResult(-1);
            mozartUpgradePrepareActivity.onReady();
        }
    }

    @JvmStatic
    @NotNull
    public static final HeadsetStateCheckFragment newInstance(@NotNull String str) {
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
        MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel = (MozartUpgradePrepareViewModel) new ViewModelProvider(this).get(MozartUpgradePrepareViewModel.class);
        this.prepareViewModel = mozartUpgradePrepareViewModel;
        Objects.requireNonNull(mozartUpgradePrepareViewModel);
        DeviceManagerApi deviceManagerApiB = b();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str2 = this.address;
        Objects.requireNonNull(str2);
        mozartUpgradePrepareViewModel.setDevice(deviceManagerApiB.getBindDevice(hMDeviceType, str2));
        MozartUpgradePrepareViewModel mozartUpgradePrepareViewModel2 = this.prepareViewModel;
        Objects.requireNonNull(mozartUpgradePrepareViewModel2);
        mozartUpgradePrepareViewModel2.getReadyLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: lu3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetStateCheckFragment.c(this.a, (Boolean) obj);
            }
        });
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
        String string = savedInstanceState.getString(g);
        if (string == null) {
            string = "";
        }
        this.address = string;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_headset_state_check, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(g, str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ImageView imageView = (ImageView) (view2 == null ? null : view2.findViewById(R.id.bind_headset_search_image));
        try {
            DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(imageView);
            DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
            configBuilderWith.diskCacheStrategy(diskCacheStrategy).load(R.drawable.gif_headset_search_loading).diskCacheStrategy(diskCacheStrategy).crossFade().into(imageView);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
    }
}
