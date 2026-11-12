package com.huami.core.device.wifi_settings.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.WifiDeviceConnect;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.core.device.wifi_settings.ui.WifiDeviceStatusFragment;
import com.huami.tools.log.HMLog;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010%\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*¨\u00060"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", "Landroidx/fragment/app/Fragment;", "", "b", GoogleApiAvailabilityLight.a, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "g", "f", "c", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment$OnDeviceStatusChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDeviceStatusChangeListener", "onDetach", "", "Landroidx/fragment/app/FragmentManager;", "manager", "show", "a", "Landroid/view/View;", "mDeviceStatusView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mTvTopTitle", "mTvTopTips", LogUtil.I, "mSource", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "e", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "mWifiProxy", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment$OnDeviceStatusChangeListener;", "mListener", "<init>", "()V", "Companion", "OnDeviceStatusChangeListener", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiDeviceStatusFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "WifiDeviceStatusFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private View mDeviceStatusView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextView mTvTopTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView mTvTopTips;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private IWiFiControllerProxy mWifiProxy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OnDeviceStatusChangeListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment$Companion;", "", "", "source", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", "newInstance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WifiDeviceStatusFragment newInstance(int source) {
            WifiDeviceStatusFragment wifiDeviceStatusFragment = new WifiDeviceStatusFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("source", source);
            Unit unit = Unit.INSTANCE;
            wifiDeviceStatusFragment.setArguments(bundle);
            return wifiDeviceStatusFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment$OnDeviceStatusChangeListener;", "", "", "enable", "", "onDeviceStatusChange", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDeviceStatusChangeListener {
        void onDeviceStatusChange(boolean enable);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WifiDeviceConnect a;
        public final /* synthetic */ WifiDeviceStatusFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WifiDeviceConnect wifiDeviceConnect, WifiDeviceStatusFragment wifiDeviceStatusFragment) {
            super(0);
            this.a = wifiDeviceConnect;
            this.b = wifiDeviceStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceConnectEvent:" + this.a + ":mSource:" + this.b.mSource;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("StatusFragment show Exception : ", this.a.getMessage());
        }
    }

    private final void b() {
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        if (!iWiFiControllerProxy.isBluetoothEnable()) {
            f();
        }
        if (!iWiFiControllerProxy.isDeviceConnect()) {
            g();
        }
        OnDeviceStatusChangeListener onDeviceStatusChangeListener = this.mListener;
        if (onDeviceStatusChangeListener == null) {
            return;
        }
        onDeviceStatusChangeListener.onDeviceStatusChange(iWiFiControllerProxy.isBluetoothEnable() && iWiFiControllerProxy.isDeviceConnect());
    }

    private final void c() {
        View view = this.mDeviceStatusView;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
    }

    private final void d() {
        LiveEventBus.get(WiFiSettingInit.KEY_DEVICE_EVENT, WifiDeviceConnect.class).observe(this, new Observer() { // from class: nv8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WifiDeviceStatusFragment.e(this.a, (WifiDeviceConnect) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WifiDeviceStatusFragment wifiDeviceStatusFragment, WifiDeviceConnect wifiDeviceConnect) {
        if (wifiDeviceConnect == null) {
            return;
        }
        HMLog.info(TAG, new a(wifiDeviceConnect, wifiDeviceStatusFragment));
        if (wifiDeviceConnect.getDeviceSource() != wifiDeviceStatusFragment.mSource) {
            return;
        }
        OnDeviceStatusChangeListener onDeviceStatusChangeListener = wifiDeviceStatusFragment.mListener;
        if (onDeviceStatusChangeListener != null) {
            onDeviceStatusChangeListener.onDeviceStatusChange(wifiDeviceConnect.isConnected());
        }
        if (wifiDeviceConnect.isConnected()) {
            wifiDeviceStatusFragment.c();
            return;
        }
        IWiFiControllerProxy iWiFiControllerProxy = wifiDeviceStatusFragment.mWifiProxy;
        if (iWiFiControllerProxy != null && !iWiFiControllerProxy.isBluetoothEnable()) {
            wifiDeviceStatusFragment.f();
        } else if (wifiDeviceConnect.isDisconnected()) {
            wifiDeviceStatusFragment.g();
        }
    }

    private final void f() {
        h();
        TextView textView = this.mTvTopTitle;
        if (textView == null) {
            textView = null;
        }
        textView.setText(R.string.wifi_bluetooth_disable_msg);
        TextView textView2 = this.mTvTopTips;
        (textView2 != null ? textView2 : null).setVisibility(8);
    }

    private final void g() {
        h();
        TextView textView = this.mTvTopTips;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.mTvTopTitle;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(R.string.wifi_device_disconnect_title);
        TextView textView3 = this.mTvTopTips;
        (textView3 != null ? textView3 : null).setText(R.string.wifi_device_disconnect_msg);
    }

    private final void h() {
        View view = this.mDeviceStatusView;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
    }

    private final void initView(View view) {
        this.mDeviceStatusView = view.findViewById(R.id.status_layout);
        this.mTvTopTips = (TextView) view.findViewById(R.id.tv_top_tips);
        this.mTvTopTitle = (TextView) view.findViewById(R.id.tv_top_title);
    }

    @JvmStatic
    @NotNull
    public static final WifiDeviceStatusFragment newInstance(int i) {
        return INSTANCE.newInstance(i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSource = arguments.getInt("source");
        }
        IWiFiControllerProxy controllerProxy = WiFiSettingInit.INSTANCE.getControllerProxy(this.mSource);
        this.mWifiProxy = controllerProxy;
        if (controllerProxy == null) {
            return;
        }
        controllerProxy.eventBusConnect(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wifi_setting_fragment_status, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.eventBusConnect(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        b();
        d();
    }

    @NotNull
    public final WifiDeviceStatusFragment setOnDeviceStatusChangeListener(@NotNull OnDeviceStatusChangeListener listener) {
        this.mListener = listener;
        return this;
    }

    public final void show(int container, @NotNull FragmentManager manager) {
        try {
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.replace(container, this);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.error$default(TAG, null, null, new b(e), 6, null);
            e.printStackTrace();
        }
    }
}
