package com.huami.watchfacesstore.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.ext.KoinExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/watchfacesstore/device/WFDeviceManagerFactory;", "", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WFDeviceManagerFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int WATCH_TYPE = 4;
    private static final int a = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WFDeviceManagerFactory$Companion;", "", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "getHMDeviceManager", "", "MILI_TYPE", LogUtil.I, "WATCH_TYPE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WFDeviceManager getHMDeviceManager() {
            return KoinExtKt.getDeviceManager().getDeviceFamilyValue() == 0 ? new MILIDeviceManager() : new WatchDeviceManager();
        }
    }
}
