package com.huami.bluetooth.feature.file_transfer;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.feature.file_transfer.impl.FileTransferAppletApiImpl;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/feature/file_transfer/FileTransferManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/feature/file_transfer/FileTransferAppletApi;", "loadApi", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Integer> a = new LinkedHashMap();

    @NotNull
    private static final Map<Integer, FileTransferAppletApi> b = new LinkedHashMap();

    @NotNull
    private static String c = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/feature/file_transfer/FileTransferManager$Companion;", "", "", "path", "", "configFileCacheDir", "fileCachedDir", "Ljava/lang/String;", "", "", "hashCode2DeviceID", "Ljava/util/Map;", "Lcom/huami/bluetooth/feature/file_transfer/FileTransferAppletApi;", "transferAppletApis", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void configFileCacheDir(@NotNull String path) {
            FileTransferManager.c = path;
        }
    }

    @WorkerThread
    @Nullable
    public final FileTransferAppletApi loadApi(@NotNull HMBaseDevice device) throws Exception {
        Object objM3845constructorimpl;
        Integer num;
        int iHashCode = device.hashCode();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        String deviceID = deviceInfo == null ? null : deviceInfo.getDeviceID();
        if (deviceID == null) {
            throw new Exception("Get device id failed");
        }
        Map<Integer, FileTransferAppletApi> map = b;
        if (map.containsKey(Integer.valueOf(iHashCode)) && (num = a.get(deviceID)) != null && num.intValue() == iHashCode) {
            return map.get(Integer.valueOf(iHashCode));
        }
        Map<String, Integer> map2 = a;
        Integer num2 = map2.get(deviceID);
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        TypeIntrinsics.asMutableMap(map).remove(num2);
        map2.remove(deviceID);
        try {
            Result.Companion companion = Result.Companion;
            FileTransferAppletApiImpl fileTransferAppletApiImpl = new FileTransferAppletApiImpl(device, c);
            map.put(Integer.valueOf(iHashCode), fileTransferAppletApiImpl);
            map2.put(deviceID, Integer.valueOf(iHashCode));
            objM3845constructorimpl = Result.m3845constructorimpl(fileTransferAppletApiImpl);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (FileTransferAppletApi) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
