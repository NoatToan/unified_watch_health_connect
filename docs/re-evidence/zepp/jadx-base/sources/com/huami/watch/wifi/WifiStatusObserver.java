package com.huami.watch.wifi;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/watch/wifi/WifiStatusObserver;", "Lcom/huami/watch/wifi/WifiObserver;", "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/watch/wifi/IWifiStatusListener;", "g", "Lcom/huami/watch/wifi/IWifiStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "app", "<init>", "(Landroid/content/Context;Lcom/huami/watch/wifi/IWifiStatusListener;)V", "i", "a", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiStatusObserver extends WifiObserver {
    private static final String h = "WifiStatusObserver";

    @NotNull
    private static final a i = new a(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final IWifiStatusListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/wifi/WifiStatusObserver$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WifiStatusObserver(@NotNull Context context, @Nullable IWifiStatusListener iWifiStatusListener) {
        super(context, "android.net.wifi.WIFI_STATE_CHANGED");
        this.listener = iWifiStatusListener;
    }

    @Override // com.huami.watch.wifi.WifiObserver
    public void onReceive(@Nullable Intent intent) {
        IWifiStatusListener iWifiStatusListener;
        super.onReceive(intent);
        LogUtils logUtils = LogUtils.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("intent: ");
        sb.append(intent);
        sb.append("; extra: ");
        sb.append(Utils.INSTANCE.getBundleString(intent != null ? intent.getExtras() : null));
        logUtils.log(h, sb.toString());
        if (intent != null) {
            int intExtra = intent.getIntExtra("wifi_state", 4);
            if (intExtra == 3) {
                IWifiStatusListener iWifiStatusListener2 = this.listener;
                if (iWifiStatusListener2 != null) {
                    iWifiStatusListener2.onWifiEnable();
                    return;
                }
                return;
            }
            if (intExtra != 1 || (iWifiStatusListener = this.listener) == null) {
                return;
            }
            iWifiStatusListener.onWifiDisable();
        }
    }
}
