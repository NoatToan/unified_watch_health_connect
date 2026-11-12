package com.xiaomi.fitness.device.manager.ui.bind;

import android.provider.Settings;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"CONFIGNET_INDICATE_POP_SWITCH", "", "CONFIGNET_INDICATE_POP_ON", "", "CONFIGNET_INDICATE_POP_OFF", "disableSystemBindDialog", "", "enableSystemBindDialog", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BindSystemConfigKt {
    public static final int CONFIGNET_INDICATE_POP_OFF = 0;
    public static final int CONFIGNET_INDICATE_POP_ON = 1;

    @NotNull
    public static final String CONFIGNET_INDICATE_POP_SWITCH = "confignet_pop_switch";

    public static final void disableSystemBindDialog() {
        try {
            if (RomUtils.isXiaomi()) {
                Settings.Global.putInt(ApplicationExtKt.getApplication().getContentResolver(), "confignet_pop_switch", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void enableSystemBindDialog() {
        try {
            if (RomUtils.isXiaomi()) {
                Settings.Global.putInt(ApplicationExtKt.getApplication().getContentResolver(), "confignet_pop_switch", 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
