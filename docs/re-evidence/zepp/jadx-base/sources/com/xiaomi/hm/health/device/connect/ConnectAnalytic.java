package com.xiaomi.hm.health.device.connect;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldAppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.ProtocolAuthError;
import com.xiaomi.hm.health.device.connect.ConnectAnalytic;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class ConnectAnalytic {
    private static final String d = "ConnectAnalytic";
    private final Lazy<DeviceManagerApi> a = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private final HashMap<String, Status> c = new HashMap<>();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.SCAN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.SCAN_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.SCANNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.GATT_CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.GATT_DISCONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Status.GATT_CONNECT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Status.GATT_CONNECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Status.DISCOVERY_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Status.DISCOVERY_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Status.DISCOVERY_SUCCESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Status.INIT_START.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[Status.INIT_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[Status.INIT_SUCCESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[Status.AUTH_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[Status.AUTH_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[Status.AUTH_SUCCESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[Status.DISCONNECTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private void c(CountEventBuilder countEventBuilder, AuthResult authResult) {
        if (authResult == null) {
            countEventBuilder.addExtra("domain", String.valueOf(0)).addExtra("error_code", String.valueOf(0));
            return;
        }
        AuthError authError = authResult.getAuthError();
        if (authError instanceof OldAppAuthError) {
            countEventBuilder.addExtra("domain", String.valueOf(1));
        } else if (authError instanceof AppAuthError) {
            countEventBuilder.addExtra("domain", String.valueOf(2));
        } else if (authError instanceof ProtocolAuthError) {
            countEventBuilder.addExtra("domain", String.valueOf(3));
        }
        countEventBuilder.addExtra("error_code", String.valueOf(authError.getCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(HMDeviceType hMDeviceType, Status status) {
        return "analyticsForSession:" + hMDeviceType + ",status:" + status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Status status) {
        Toast.makeText(DeviceXFunctionsKt.getContext(), "authResult: " + status.getAuthResult(), 1).show();
    }

    public void analyticsForSession(final HMDeviceType hMDeviceType, final Status status) {
        String str;
        HMLog.info(d, new Function0() { // from class: wy0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectAnalytic.d(hMDeviceType, status);
            }
        });
        String strValueOf = String.valueOf(this.a.getValue().getBoundDeviceSource(hMDeviceType).getValue());
        String str2 = DeviceXFunctionsKt.getAppStateApi().isForeground() ? "front" : "back";
        boolean zIsInMainland = HMLoginManager.isInMainland();
        switch (a.a[status.ordinal()]) {
            case 1:
                str = StatEvent.BASE_LBE_SCAN_RESULT_SUCCESS;
                break;
            case 2:
                str = StatEvent.BASE_LBE_SCAN_RESULT_FAIL;
                break;
            case 3:
                this.b.put(strValueOf, UUID.randomUUID().toString());
                str = StatEvent.BASE_LBE_SCAN_START;
                break;
            case 4:
                Status status2 = this.c.get(strValueOf);
                if (status2 != Status.SCANNING && status2 != Status.SCAN_SUCCESS && status2 != Status.SCAN_FAIL) {
                    this.b.put(strValueOf, UUID.randomUUID().toString());
                }
                str = StatEvent.BASE_LBE_CONNECT_START;
                break;
            case 5:
                str = StatEvent.BASE_LBE_GATT_DISCONNECT;
                break;
            case 6:
                str = StatEvent.BASE_LBE_CONNECT_FAIL;
                break;
            case 7:
                str = StatEvent.BASE_LBE_CONNECT_SUCCESS;
                break;
            case 8:
                str = StatEvent.BASE_LBE_DISCOVERY_START;
                break;
            case 9:
                str = StatEvent.BASE_LBE_DISCOVERY_FAIL;
                break;
            case 10:
                str = StatEvent.BASE_LBE_DISCOVERY_SUCCESS;
                break;
            case 11:
                str = StatEvent.BASE_LBE_INIT_START;
                break;
            case 12:
                str = StatEvent.BASE_LBE_INIT_FAIL;
                break;
            case 13:
                str = StatEvent.BASE_LBE_INIT_SUCCESS;
                break;
            case 14:
                str = StatEvent.BASE_LBE_AUTH_START;
                break;
            case 15:
                str = StatEvent.BASE_LBE_AUTH_FAIL;
                break;
            case 16:
                str = StatEvent.BASE_LBE_AUTH_SUCCESS;
                break;
            case 17:
                str = StatEvent.BASE_LBE_DISCONNECT;
                break;
            default:
                str = null;
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.put(strValueOf, status);
        HMLog.i(d, "analyticsForSession eventId:" + str + ",isMainland:" + zIsInMainland + ",appStatus:" + str2 + ",sessionId:" + this.b.get(strValueOf) + ",errorCode:" + status.getValue() + ",scanReason:" + status.getScanReason(), new Object[0]);
        CountEventBuilder countEventBuilderAddExtra = new CountEventBuilder(str).setIdentified(zIsInMainland).setAnonymous(zIsInMainland ^ true).addExtra("source", strValueOf).addExtra("app_status", str2).addExtra("session_id", this.b.get(strValueOf)).addExtra("error_code", String.valueOf(status.getValue()));
        if (status == Status.SCANNING) {
            countEventBuilderAddExtra.addExtra(StatEvent.SCAN_REASON, String.valueOf(status.getScanReason().getCode()));
        }
        if (status == Status.SCAN_SUCCESS) {
            countEventBuilderAddExtra.addExtra(StatEvent.ADV_CONNECTABLE, String.valueOf(status.isAdvConnectable()));
        }
        if (status == Status.DISCONNECTED || status == Status.GATT_DISCONNECT) {
            countEventBuilderAddExtra.addExtra(StatEvent.BLUETOOTH_ON, String.valueOf(GattUtils.isBluetoothEnable()));
        }
        if (status == Status.GATT_CONNECTING) {
            countEventBuilderAddExtra.addExtra(StatEvent.PRECONNECT_STATE, status.getPreConnectState());
        }
        if (status == Status.AUTH_FAILED) {
            c(countEventBuilderAddExtra, status.getAuthResult());
            if (GlobalConfig.get().isBuildInner()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: vy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectAnalytic.e(status);
                    }
                });
            }
        }
        Analytics.recordEvent(countEventBuilderAddExtra);
    }

    @Nullable
    public String getCurrentSessionId(@Nullable HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == null) {
            return null;
        }
        return this.b.get(String.valueOf(hMDeviceSource.getValue()));
    }
}
