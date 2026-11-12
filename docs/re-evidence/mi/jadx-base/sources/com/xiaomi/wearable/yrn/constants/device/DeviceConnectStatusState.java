package com.xiaomi.wearable.yrn.constants.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/wearable/yrn/constants/device/DeviceConnectStatusState;", "", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public @interface DeviceConnectStatusState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String WEAR_DEVICE_STATUS_CONNECT_CONNECTED = "WEAR_DEVICE_STATUS_CONNECT_CONNECTED";

    @NotNull
    public static final String WEAR_DEVICE_STATUS_CONNECT_CONNECTING = "WEAR_DEVICE_STATUS_CONNECT_CONNECTING";

    @NotNull
    public static final String WEAR_DEVICE_STATUS_CONNECT_DISCONNECT = "WEAR_DEVICE_STATUS_DISCONNECT";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/yrn/constants/device/DeviceConnectStatusState$Companion;", "", "<init>", "()V", "WEAR_DEVICE_STATUS_CONNECT_CONNECTING", "", "WEAR_DEVICE_STATUS_CONNECT_CONNECTED", "WEAR_DEVICE_STATUS_CONNECT_DISCONNECT", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String WEAR_DEVICE_STATUS_CONNECT_CONNECTED = "WEAR_DEVICE_STATUS_CONNECT_CONNECTED";

        @NotNull
        public static final String WEAR_DEVICE_STATUS_CONNECT_CONNECTING = "WEAR_DEVICE_STATUS_CONNECT_CONNECTING";

        @NotNull
        public static final String WEAR_DEVICE_STATUS_CONNECT_DISCONNECT = "WEAR_DEVICE_STATUS_DISCONNECT";

        private Companion() {
        }
    }
}
