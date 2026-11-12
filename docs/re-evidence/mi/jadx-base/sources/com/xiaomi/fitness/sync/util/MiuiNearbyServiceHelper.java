package com.xiaomi.fitness.sync.util;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener;
import defpackage.ouc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sync/util/MiuiNearbyServiceHelper;", "", "", "bind", "()V", "Lcom/xiaomi/fitness/sync/impl/MiuiNearbyServiceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "init", "(Lcom/xiaomi/fitness/sync/impl/MiuiNearbyServiceListener;)V", "", "ssid", "getWifiPassword", "(Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "miuiNearbyServiceListener", "Lcom/xiaomi/fitness/sync/impl/MiuiNearbyServiceListener;", "Louc;", "miuiNearbyApiService", "Louc;", "getMiuiNearbyApiService", "()Louc;", "setMiuiNearbyApiService", "(Louc;)V", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "SERVER_PACKAGE", "SERVER_ACTION", "<init>", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MiuiNearbyServiceHelper {

    @NotNull
    private static final String SERVER_ACTION = "miui.bluetooth.mible.MiuiNearbyApiService";

    @NotNull
    private static final String SERVER_PACKAGE = "com.xiaomi.bluetooth";

    @NotNull
    private static final String TAG = "MiuiNearbyServiceHelper";

    @Nullable
    private static ouc miuiNearbyApiService;

    @Nullable
    private static MiuiNearbyServiceListener miuiNearbyServiceListener;

    @NotNull
    public static final MiuiNearbyServiceHelper INSTANCE = new MiuiNearbyServiceHelper();

    @NotNull
    private static final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.sync.util.MiuiNearbyServiceHelper$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName name) {
            MiuiNearbyServiceHelper.INSTANCE.bind();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder iBinder) {
            Logger.i("MiuiNearbyServiceHelper", "onServiceConnected");
            MiuiNearbyServiceHelper miuiNearbyServiceHelper = MiuiNearbyServiceHelper.INSTANCE;
            miuiNearbyServiceHelper.setMiuiNearbyApiService(ouc.a.s2(iBinder));
            MiuiNearbyServiceListener miuiNearbyServiceListener2 = MiuiNearbyServiceHelper.miuiNearbyServiceListener;
            if (miuiNearbyServiceListener2 != null) {
                miuiNearbyServiceListener2.onInit(miuiNearbyServiceHelper);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Logger.i("MiuiNearbyServiceHelper", "onServiceDisconnected");
            MiuiNearbyServiceHelper.INSTANCE.setMiuiNearbyApiService(null);
            MiuiNearbyServiceListener miuiNearbyServiceListener2 = MiuiNearbyServiceHelper.miuiNearbyServiceListener;
            if (miuiNearbyServiceListener2 != null) {
                miuiNearbyServiceListener2.onDestroy();
            }
        }
    };

    private MiuiNearbyServiceHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind() {
        if (miuiNearbyApiService != null) {
            Logger.i(TAG, "miuiNearbyApiService != null");
            MiuiNearbyServiceListener miuiNearbyServiceListener2 = miuiNearbyServiceListener;
            if (miuiNearbyServiceListener2 != null) {
                miuiNearbyServiceListener2.onInit(this);
                return;
            }
            return;
        }
        Logger.i(TAG, "miuiNearbyApiService == null, bind service");
        Intent intent = new Intent();
        intent.setAction(SERVER_ACTION);
        intent.setPackage("com.xiaomi.bluetooth");
        boolean z = ApplicationExtKt.getApplication().getPackageManager().resolveService(intent, 0) != null;
        Logger.i(TAG, "get supportMiuiNearbyService: " + z);
        if (!z) {
            MiuiNearbyServiceListener miuiNearbyServiceListener3 = miuiNearbyServiceListener;
            if (miuiNearbyServiceListener3 != null) {
                miuiNearbyServiceListener3.onDestroy();
                return;
            }
            return;
        }
        try {
            if (ApplicationExtKt.getApplication().bindService(intent, serviceConnection, 1)) {
                Unit unit = Unit.INSTANCE;
                return;
            }
            MiuiNearbyServiceListener miuiNearbyServiceListener4 = miuiNearbyServiceListener;
            if (miuiNearbyServiceListener4 != null) {
                miuiNearbyServiceListener4.onDestroy();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MiuiNearbyServiceListener miuiNearbyServiceListener5 = miuiNearbyServiceListener;
            if (miuiNearbyServiceListener5 != null) {
                miuiNearbyServiceListener5.onDestroy();
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @Nullable
    public final ouc getMiuiNearbyApiService() {
        return miuiNearbyApiService;
    }

    @Nullable
    public final String getWifiPassword(@NotNull String ssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Logger.i("REQ_WIFI_TAG service: " + miuiNearbyApiService, new Object[0]);
        ouc oucVar = miuiNearbyApiService;
        if (oucVar != null) {
            return oucVar.R1(ssid);
        }
        return null;
    }

    public final void init(@NotNull MiuiNearbyServiceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logger.i(TAG, "init");
        miuiNearbyServiceListener = listener;
        bind();
    }

    public final void setMiuiNearbyApiService(@Nullable ouc oucVar) {
        miuiNearbyApiService = oucVar;
    }
}
