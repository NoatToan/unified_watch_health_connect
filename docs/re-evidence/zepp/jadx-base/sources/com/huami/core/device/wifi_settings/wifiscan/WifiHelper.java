package com.huami.core.device.wifi_settings.wifiscan;

import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.wifiscan.broadcast.WifiBroadcastReceiver;
import com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegate;
import com.huami.core.device.wifi_settings.wifiscan.delegate.WifiDelegateImpl;
import com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener;
import com.huami.tools.analytics.DbUtils;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001!B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/WifiHelper;", "", "Landroidx/appcompat/app/AppCompatActivity;", DbUtils.Const.Table.CONTEXT, "", "a", "Landroid/content/IntentFilter;", "b", "startScan", "destroy", "", "Z", "filter5G", "Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", "Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "mContext", "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", GoogleApiAvailabilityLight.a, "Lcom/huami/core/device/wifi_settings/wifiscan/delegate/WifiDelegate;", "mDelegate", "Lcom/huami/core/device/wifi_settings/wifiscan/broadcast/WifiBroadcastReceiver;", "e", "Lcom/huami/core/device/wifi_settings/wifiscan/broadcast/WifiBroadcastReceiver;", SocialConstants.PARAM_RECEIVER, "f", "Landroid/content/IntentFilter;", "filter", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;ZLcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiHelper {

    @NotNull
    public static final String TAG = "WifiHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean filter5G;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ScanResultListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private WeakReference<AppCompatActivity> mContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private WifiDelegate mDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private WifiBroadcastReceiver receiver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private IntentFilter filter;

    public WifiHelper(@NotNull AppCompatActivity appCompatActivity, boolean z, @Nullable ScanResultListener scanResultListener) {
        this.filter5G = z;
        this.listener = scanResultListener;
        a(appCompatActivity);
    }

    private final void a(AppCompatActivity context) {
        AppCompatActivity appCompatActivity;
        this.mContext = new WeakReference<>(context);
        this.mDelegate = new WifiDelegateImpl(this.filter5G, null, null, 6, null);
        WifiDelegate wifiDelegate = this.mDelegate;
        if (wifiDelegate == null) {
            wifiDelegate = null;
        }
        this.receiver = new WifiBroadcastReceiver(wifiDelegate, this.listener);
        this.filter = b();
        WeakReference<AppCompatActivity> weakReference = this.mContext;
        if (weakReference == null || (appCompatActivity = weakReference.get()) == null) {
            return;
        }
        WifiBroadcastReceiver wifiBroadcastReceiver = this.receiver;
        IntentFilter intentFilter = this.filter;
        appCompatActivity.registerReceiver(wifiBroadcastReceiver, intentFilter != null ? intentFilter : null);
    }

    private final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        return intentFilter;
    }

    public final void destroy() {
        AppCompatActivity appCompatActivity;
        WeakReference<AppCompatActivity> weakReference = this.mContext;
        if (weakReference == null || (appCompatActivity = weakReference.get()) == null) {
            return;
        }
        WifiDelegate wifiDelegate = this.mDelegate;
        if (wifiDelegate == null) {
            wifiDelegate = null;
        }
        wifiDelegate.setWifiState(WifiDelegate.DelegateState.STOP);
        appCompatActivity.unregisterReceiver(this.receiver);
    }

    public final void startScan() {
        AppCompatActivity appCompatActivity;
        WeakReference<AppCompatActivity> weakReference = this.mContext;
        if (weakReference == null || (appCompatActivity = weakReference.get()) == null) {
            return;
        }
        WifiDelegate wifiDelegate = this.mDelegate;
        if (wifiDelegate == null) {
            wifiDelegate = null;
        }
        wifiDelegate.setWifiState(WifiDelegate.DelegateState.START);
        if (!WifiUtil.INSTANCE.checkWifiIsEnable(appCompatActivity)) {
            ScanResultListener scanResultListener = this.listener;
            if (scanResultListener == null) {
                return;
            }
            scanResultListener.onWifiSwitchDisable();
            return;
        }
        ScanResultListener scanResultListener2 = this.listener;
        if (scanResultListener2 != null) {
            scanResultListener2.onStartScan();
        }
        WifiDelegate wifiDelegate2 = this.mDelegate;
        (wifiDelegate2 != null ? wifiDelegate2 : null).wifiScan(appCompatActivity);
    }
}
