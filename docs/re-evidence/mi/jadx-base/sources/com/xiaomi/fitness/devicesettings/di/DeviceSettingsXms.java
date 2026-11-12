package com.xiaomi.fitness.devicesettings.di;

import com.xiaomi.fitness.devicesettings.xms.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXms;", "", "", "did", "Lcom/xiaomi/fitness/devicesettings/xms/b;", "callback", "", "startFindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/devicesettings/xms/b;)V", "stopFindDevice", "jumpToMainPage", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface DeviceSettingsXms {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsXms$Companion;", "", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void jumpToMainPage();

    void startFindDevice(@Nullable String did, @Nullable b callback);

    void stopFindDevice(@Nullable String did, @Nullable b callback);
}
