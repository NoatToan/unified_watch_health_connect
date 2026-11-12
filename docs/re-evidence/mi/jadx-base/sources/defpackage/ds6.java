package defpackage;

import com.xiaomi.fitness.device.manager.di.DeviceTabModule;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4;
import com.xiaomi.fitness.main.export.MainTab;

/* JADX INFO: loaded from: classes8.dex */
public final class ds6 implements dei {
    public static MainTab a(DeviceTabParentFragmentV4 deviceTabParentFragmentV4) {
        return (MainTab) f6i.c(DeviceTabModule.provideTab(deviceTabParentFragmentV4));
    }
}
