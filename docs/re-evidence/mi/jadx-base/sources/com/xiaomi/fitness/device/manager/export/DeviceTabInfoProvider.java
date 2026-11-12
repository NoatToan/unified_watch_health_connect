package com.xiaomi.fitness.device.manager.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "", "tabName", "", "type", "", "deviceCount", "index", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceTabInfoProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEVICE_BOTH_EMPTY = 1;
    public static final int DEVICE_FILL = 4;
    public static final int DEVICE_THIRDPARTY_EMPTY = 3;
    public static final int DEVICE_WEARABLE_EMPTY = 2;
    public static final int INDEX_AB_TEST_FLAG = 2;
    public static final int INDEX_OTHER = 1;
    public static final int INDEX_OTHER_V4 = 4;
    public static final int INDEX_WEARABLE = 0;
    public static final int INDEX_WEARABLE_V4 = 3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider$Companion;", "", "<init>", "()V", "INDEX_WEARABLE", "", "INDEX_OTHER", "INDEX_AB_TEST_FLAG", "INDEX_WEARABLE_V4", "INDEX_OTHER_V4", "DEVICE_BOTH_EMPTY", "DEVICE_WEARABLE_EMPTY", "DEVICE_THIRDPARTY_EMPTY", "DEVICE_FILL", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DEVICE_BOTH_EMPTY = 1;
        public static final int DEVICE_FILL = 4;
        public static final int DEVICE_THIRDPARTY_EMPTY = 3;
        public static final int DEVICE_WEARABLE_EMPTY = 2;
        public static final int INDEX_AB_TEST_FLAG = 2;
        public static final int INDEX_OTHER = 1;
        public static final int INDEX_OTHER_V4 = 4;
        public static final int INDEX_WEARABLE = 0;
        public static final int INDEX_WEARABLE_V4 = 3;

        private Companion() {
        }
    }

    int deviceCount();

    int index();

    @NotNull
    String tabName(int type);
}
