package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J8\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u001c\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00100\u0012H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleV2Impl;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "getFilePath", "Ljava/io/File;", FaceInfoBase.FACE_ID, "", "hash", "validFile", "", "did", "fileHash", "findFile", "", "result", "Lkotlin/Function2;", "TAG", "getTAG", "()Ljava/lang/String;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceInstallBleV2Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceInstallBleV2Impl.kt\ncom/xiaomi/fitness/watch/face/install/FaceInstallBleV2Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class FaceInstallBleV2Impl extends FaceInstallBleImpl {

    @Nullable
    private final WearableDeviceModel deviceModel;

    public FaceInstallBleV2Impl(@Nullable WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.deviceModel = wearableDeviceModel;
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl, com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void findFile(@NotNull String faceId, @Nullable String fileHash, @NotNull Function2<? super File, ? super File, Unit> result) {
        String did;
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(result, "result");
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        File fileCheckUnzipFiles$default = DialFileUtils.checkUnzipFiles$default(dialFileUtils, did, faceId, fileHash, false, 8, null);
        File file = null;
        if (fileCheckUnzipFiles$default == null) {
            WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
            if (!validFile(wearableDeviceModel2 != null ? wearableDeviceModel2.getDid() : null, faceId, fileHash)) {
                result.invoke(null, null);
                return;
            } else {
                Intrinsics.checkNotNull(fileHash);
                result.invoke(null, getFilePath(faceId, fileHash));
                return;
            }
        }
        File[] fileArrListFiles = fileCheckUnzipFiles$default.listFiles();
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt__StringsJVMKt.endsWith$default(name, ".bin", false, 2, null)) {
                file = file2;
                break;
            }
        }
        Intrinsics.checkNotNull(fileHash);
        result.invoke(file, getFilePath(faceId, fileHash));
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl, com.xiaomi.fitness.watch.face.install.FaceInstallController
    @NotNull
    public File getFilePath(@NotNull String faceId, @NotNull String hash) {
        String did;
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        FaceManager faceManager = FaceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        return new File(faceManager.getWatchFaceZipPath(did, faceId, hash));
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl
    @NotNull
    public String getTAG() {
        return "FaceInstallBleV2Impl";
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl, com.xiaomi.fitness.watch.face.install.FaceInstallController
    public boolean validFile(@Nullable String did, @Nullable String faceId, @Nullable String fileHash) {
        if (did == null || did.length() == 0 || faceId == null || faceId.length() == 0 || fileHash == null || fileHash.length() == 0) {
            return false;
        }
        File file = new File(FaceManager.INSTANCE.getWatchFaceZipPath(did, faceId, fileHash));
        Intrinsics.areEqual(fileHash, MD5Util.getFileMD5(file));
        return file.exists();
    }
}
