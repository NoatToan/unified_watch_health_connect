package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/DeviceUtils;", "", "<init>", "()V", "isFlipFolded", "", "isFolded", "isMixFolded", "isMixUnFolded", "isMixFoldDevice", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceUtils {

    @NotNull
    public static final DeviceUtils INSTANCE = new DeviceUtils();

    private DeviceUtils() {
    }

    @JvmStatic
    public static final boolean isFlipFolded() {
        return com.miui.tsmclient.util.DeviceUtils.isFlipDevice() && INSTANCE.isFolded();
    }

    @JvmStatic
    public static final boolean isMixFoldDevice() {
        return SystemProperties.INSTANCE.isFoldDisplay();
    }

    @JvmStatic
    public static final boolean isMixFolded() {
        return SystemProperties.INSTANCE.isFoldDisplay() && INSTANCE.isFolded();
    }

    @JvmStatic
    public static final boolean isMixUnFolded() {
        return SystemProperties.INSTANCE.isFoldDisplay() && !INSTANCE.isFolded();
    }

    public final boolean isFolded() {
        return SettingsPropertiesUtil.INSTANCE.getPosture(ApplicationExtKt.getApplication()) == 1;
    }
}
