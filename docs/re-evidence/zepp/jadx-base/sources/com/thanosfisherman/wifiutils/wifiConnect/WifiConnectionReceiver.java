package com.thanosfisherman.wifiutils.wifiConnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.thanosfisherman.elvis.Elvis;
import com.thanosfisherman.elvis.Objects;
import com.thanosfisherman.elvis.interfaces.Function;
import com.thanosfisherman.wifiutils.ConnectorUtils;
import com.thanosfisherman.wifiutils.WifiUtils;
import com.thanosfisherman.wifiutils.utils.VersionUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class WifiConnectionReceiver extends BroadcastReceiver {

    @NonNull
    private final WifiConnectionCallback a;

    @Nullable
    private ScanResult b;

    @NonNull
    private final WifiManager c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SupplicantState.values().length];
            a = iArr;
            try {
                iArr[SupplicantState.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SupplicantState.FOUR_WAY_HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SupplicantState.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WifiConnectionReceiver(@NonNull WifiConnectionCallback wifiConnectionCallback, @NonNull WifiManager wifiManager) {
        this.a = wifiConnectionCallback;
        this.c = wifiManager;
    }

    @NonNull
    public WifiConnectionReceiver connectWith(@NonNull ScanResult scanResult, @NonNull String str, @NonNull ConnectivityManager connectivityManager) {
        this.b = scanResult;
        return this;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, @NonNull Intent intent) {
        String action = intent.getAction();
        WifiUtils.wifiLog("Connection Broadcast action: " + action);
        if (VersionUtils.isAndroidQOrLater()) {
            if (Objects.equals("android.net.wifi.supplicant.STATE_CHANGE", action)) {
                SupplicantState supplicantState = (SupplicantState) intent.getParcelableExtra("newState");
                int intExtra = intent.getIntExtra("supplicantError", -1);
                WifiUtils.wifiLog("Connection Broadcast state: " + supplicantState);
                WifiUtils.wifiLog("suppl_error: " + intExtra);
                if (supplicantState == SupplicantState.DISCONNECTED && intExtra == 1) {
                    this.a.errorConnect(ConnectionErrorCode.AUTHENTICATION_ERROR_OCCURRED);
                    return;
                }
                return;
            }
            return;
        }
        if (Objects.equals("android.net.wifi.STATE_CHANGE", action)) {
            if (ConnectorUtils.isAlreadyConnected(this.c, (String) Elvis.of(this.b).next(new Function() { // from class: hv8
                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function andThen(Function function) {
                    return fc2.a(this, function);
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public final Object apply(Object obj) {
                    return ((ScanResult) obj).BSSID;
                }

                @Override // com.thanosfisherman.elvis.interfaces.Function
                public /* synthetic */ Function compose(Function function) {
                    return fc2.b(this, function);
                }
            }).get())) {
                this.a.successfulConnect();
                return;
            }
            return;
        }
        if (Objects.equals("android.net.wifi.supplicant.STATE_CHANGE", action)) {
            SupplicantState supplicantState2 = (SupplicantState) intent.getParcelableExtra("newState");
            int intExtra2 = intent.getIntExtra("supplicantError", -1);
            if (supplicantState2 == null) {
                this.a.errorConnect(ConnectionErrorCode.COULD_NOT_CONNECT);
                return;
            }
            WifiUtils.wifiLog("Connection Broadcast state: " + supplicantState2);
            int i = a.a[supplicantState2.ordinal()];
            if (i == 1 || i == 2) {
                if (ConnectorUtils.isAlreadyConnected(this.c, (String) Elvis.of(this.b).next(new Function() { // from class: gv8
                    @Override // com.thanosfisherman.elvis.interfaces.Function
                    public /* synthetic */ Function andThen(Function function) {
                        return fc2.a(this, function);
                    }

                    @Override // com.thanosfisherman.elvis.interfaces.Function
                    public final Object apply(Object obj) {
                        return ((ScanResult) obj).BSSID;
                    }

                    @Override // com.thanosfisherman.elvis.interfaces.Function
                    public /* synthetic */ Function compose(Function function) {
                        return fc2.b(this, function);
                    }
                }).get())) {
                    this.a.successfulConnect();
                }
            } else {
                if (i != 3) {
                    return;
                }
                if (intExtra2 == 1) {
                    WifiUtils.wifiLog("Authentication error...");
                    this.a.errorConnect(ConnectionErrorCode.AUTHENTICATION_ERROR_OCCURRED);
                } else {
                    WifiUtils.wifiLog("Disconnected. Re-attempting to connect...");
                    ConnectorUtils.reEnableNetworkIfPossible(this.c, this.b);
                }
            }
        }
    }
}
