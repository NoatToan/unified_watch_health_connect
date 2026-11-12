package com.xiaomi.fitness.mijia.sdk;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ouf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "", "", "device", "setting", "", "getSettingsBoolean", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "unbindDevice", "(Ljava/lang/String;)V", "value", "setSettings", "(Ljava/lang/String;Ljava/lang/String;Z)Z", Constants.EXTRA_CLOSE_TAI, "()V", "Louf;", "deviceManger", "Louf;", "<init>", "Companion", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MiBleDeviceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SETTING_IMMEDIATE_ALERT_ALARM_ENABLED = "alert_alarm_enabled";

    @Nullable
    private ouf deviceManger;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager$Companion;", "", "<init>", "()V", "SETTING_IMMEDIATE_ALERT_ALARM_ENABLED", "", "createManager", "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManagerListener;", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiBleDeviceManager createManager(@NotNull Context context, @NotNull final MiBleDeviceManagerListener listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            final MiBleDeviceManager miBleDeviceManager = new MiBleDeviceManager(null);
            ouf.f(context, new ouf.b() { // from class: com.xiaomi.fitness.mijia.sdk.MiBleDeviceManager$Companion$createManager$1
                @Override // ouf.b
                public void onDestroy() {
                    listener.onDestroy();
                }

                @Override // ouf.b
                public void onInit(ouf manager) {
                    Intrinsics.checkNotNullParameter(manager, "manager");
                    Logger.i("createManager onInit(" + manager + ")", new Object[0]);
                    miBleDeviceManager.deviceManger = manager;
                    listener.onInit(miBleDeviceManager);
                }
            });
            return miBleDeviceManager;
        }
    }

    private MiBleDeviceManager() {
    }

    public /* synthetic */ MiBleDeviceManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void close() {
        ouf oufVar = this.deviceManger;
        if (oufVar != null) {
            oufVar.e();
        }
    }

    public final boolean getSettingsBoolean(@NotNull String device, @NotNull String setting) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(setting, "setting");
        ouf oufVar = this.deviceManger;
        if (oufVar != null) {
            return oufVar.i(device, setting);
        }
        return false;
    }

    public final boolean setSettings(@NotNull String device, @NotNull String setting, boolean value) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(setting, "setting");
        ouf oufVar = this.deviceManger;
        if (oufVar != null) {
            return oufVar.l(device, setting, value);
        }
        return false;
    }

    public final void unbindDevice(@NotNull String device) {
        Intrinsics.checkNotNullParameter(device, "device");
        ouf oufVar = this.deviceManger;
        if (oufVar != null) {
            oufVar.m(device);
        }
    }
}
