package com.xiaomi.fitness.device.manager.di;

import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.hni;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/di/DeviceTabModule;", "", "<init>", "()V", "bindDeviceTabFragmentV4", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "deviceTabFragment", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabFragmentV4;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceTabModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/di/DeviceTabModule$Companion;", "", "<init>", "()V", "provideTab", "Lcom/xiaomi/fitness/main/export/MainTab;", "fragment", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MainTab provideTab(@NotNull DeviceTabParentFragmentV4 fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            MainTab.Companion companion = MainTab.INSTANCE;
            int index_device = companion.getINDEX_DEVICE();
            String name = fragment.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            companion.registerTabFragment(name, index_device);
            return new MainTab(index_device, uzi.U1, hni.n, fragment, -1);
        }
    }

    @JvmStatic
    @NotNull
    public static final MainTab provideTab(@NotNull DeviceTabParentFragmentV4 deviceTabParentFragmentV4) {
        return INSTANCE.provideTab(deviceTabParentFragmentV4);
    }

    @NotNull
    public abstract DeviceTabInfoProvider bindDeviceTabFragmentV4(@NotNull DeviceTabFragmentV4 deviceTabFragment);
}
