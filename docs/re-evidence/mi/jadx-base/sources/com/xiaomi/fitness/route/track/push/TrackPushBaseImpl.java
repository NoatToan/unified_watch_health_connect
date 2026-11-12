package com.xiaomi.fitness.route.track.push;

import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.track.data.TrackManager;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016J&\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/route/track/push/TrackPushBaseImpl;", "Lcom/xiaomi/fitness/route/track/push/TrackPushController;", "<init>", "()V", "findFile", "", FaceInfoBase.FACE_ID, "", "fileHash", "result", "Lkotlin/Function2;", "Ljava/io/File;", "getFilePath", "hash", "validFile", "", "did", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TrackPushBaseImpl implements TrackPushController {

    @NotNull
    public static final String TAG = "TrackPushBaseImpl";

    @Override // com.xiaomi.fitness.route.track.push.TrackPushController
    public void findFile(@NotNull String faceId, @Nullable String fileHash, @NotNull Function2<? super File, ? super File, Unit> result) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(result, "result");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!validFile(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, faceId, fileHash)) {
            result.invoke(null, null);
        } else {
            Intrinsics.checkNotNull(fileHash);
            result.invoke(getFilePath(faceId, fileHash), null);
        }
    }

    @Override // com.xiaomi.fitness.route.track.push.TrackPushController
    @NotNull
    public File getFilePath(@NotNull String faceId, @NotNull String hash) {
        String did;
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        TrackManager trackManager = TrackManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        return new File(trackManager.getTrackRecorderPath(did, faceId, hash));
    }

    @Override // com.xiaomi.fitness.route.track.push.TrackPushController
    public boolean validFile(@Nullable String did, @Nullable String faceId, @Nullable String fileHash) {
        if (did == null || did.length() == 0 || faceId == null || faceId.length() == 0 || fileHash == null || fileHash.length() == 0) {
            return false;
        }
        File file = new File(TrackManager.INSTANCE.getTrackRecorderPath(did, faceId, fileHash));
        return file.exists() && Intrinsics.areEqual(fileHash, MD5Util.getFileMD5(file));
    }
}
