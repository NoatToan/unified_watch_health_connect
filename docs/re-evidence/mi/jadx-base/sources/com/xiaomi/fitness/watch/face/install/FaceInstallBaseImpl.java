package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J&\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u0014R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallBaseImpl;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallController;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "findFile", "", FaceInfoBase.FACE_ID, "", "fileHash", "result", "Lkotlin/Function2;", "Ljava/io/File;", "getFilePath", "hash", "validFile", "", "did", "deleteBinFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TAG", "getTAG", "()Ljava/lang/String;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FaceInstallBaseImpl implements FaceInstallController {

    @NotNull
    private final String TAG = "FaceInstallBaseImpl";

    @Nullable
    private final WearableDeviceModel deviceModel;

    public FaceInstallBaseImpl(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBinFile$lambda$2(File file, File file2) {
        if (file != null) {
            FileUtils.INSTANCE.deleteFile(file);
        }
        if (file2 != null) {
            FileUtils.INSTANCE.deleteFile(file2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object deleteBinFile$suspendImpl(FaceInstallBaseImpl faceInstallBaseImpl, String str, String str2, Continuation<? super Unit> continuation) {
        faceInstallBaseImpl.findFile(str, str2, new Function2() { // from class: x09
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceInstallBaseImpl.deleteBinFile$lambda$2((File) obj, (File) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    @Nullable
    public Object deleteBinFile(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        return deleteBinFile$suspendImpl(this, str, str2, continuation);
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void findFile(@NotNull String faceId, @Nullable String fileHash, @NotNull Function2<? super File, ? super File, Unit> result) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(result, "result");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (!validFile(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, faceId, fileHash)) {
            result.invoke(null, null);
        } else {
            Intrinsics.checkNotNull(fileHash);
            result.invoke(getFilePath(faceId, fileHash), null);
        }
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
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
        return new File(faceManager.getWatchFaceBinPath(did, faceId, hash));
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public boolean validFile(@Nullable String did, @Nullable String faceId, @Nullable String fileHash) {
        if (did == null || did.length() == 0 || faceId == null || faceId.length() == 0 || fileHash == null || fileHash.length() == 0) {
            return false;
        }
        File file = new File(FaceManager.INSTANCE.getWatchFaceBinPath(did, faceId, fileHash));
        Intrinsics.areEqual(fileHash, MD5Util.getFileMD5(file));
        return file.exists();
    }
}
