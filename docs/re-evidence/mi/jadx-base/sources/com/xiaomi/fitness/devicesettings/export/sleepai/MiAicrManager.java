package com.xiaomi.fitness.devicesettings.export.sleepai;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\bH&J\b\u0010\u000e\u001a\u00020\bH&J\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sleepai/MiAicrManager;", "", "isSupportMIAIPhoneStateListen", "", "bindMIAIPhoneStateService", "", "bindMIAIPhoneStateServiceSuc", "startMIAIPhoneStateListen", "", "stopMIAIPhoneStateListen", "sendSceneMessage", "event", "startDeviceTrace", "stopDeviceTrace", "listenMode", "sendPhoneState", "phone", "", "interval", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MiAicrManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sleepai/MiAicrManager$Companion;", "", "<init>", "()V", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindMIAIPhoneStateService();

    boolean bindMIAIPhoneStateServiceSuc();

    boolean isSupportMIAIPhoneStateListen();

    int listenMode();

    void sendPhoneState(@NotNull String phone, @Nullable Boolean interval);

    int sendSceneMessage(int event);

    int startDeviceTrace();

    int startMIAIPhoneStateListen();

    int stopDeviceTrace();

    int stopMIAIPhoneStateListen();
}
