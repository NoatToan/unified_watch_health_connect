package com.huami.watch.wifi;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(23)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/wifi/ScanObserver;", "Lcom/huami/watch/wifi/WifiObserver;", "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/watch/wifi/IWifiScanListener;", "g", "Lcom/huami/watch/wifi/IWifiScanListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "app", "<init>", "(Landroid/content/Context;Lcom/huami/watch/wifi/IWifiScanListener;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public class ScanObserver extends WifiObserver {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final IWifiScanListener listener;

    public ScanObserver(@NotNull Context context, @Nullable IWifiScanListener iWifiScanListener) {
        super(context, "android.net.wifi.SCAN_RESULTS");
        this.listener = iWifiScanListener;
    }

    @Override // com.huami.watch.wifi.WifiObserver
    public void onReceive(@Nullable Intent intent) {
        if (intent != null ? intent.getBooleanExtra("resultsUpdated", false) : false) {
            IWifiScanListener iWifiScanListener = this.listener;
            if (iWifiScanListener != null) {
                iWifiScanListener.onSuccess();
                return;
            }
            return;
        }
        IWifiScanListener iWifiScanListener2 = this.listener;
        if (iWifiScanListener2 != null) {
            iWifiScanListener2.onFailed();
        }
    }
}
