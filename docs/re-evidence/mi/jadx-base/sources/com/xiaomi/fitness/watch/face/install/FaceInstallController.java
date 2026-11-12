package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H&J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\f0\u000eH&Jy\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192 \u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u001bH&¢\u0006\u0002\u0010\u001cJ3\u0010\u001d\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 H&¢\u0006\u0002\u0010!J \u0010\"\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010#¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallController;", "", "getFilePath", "Ljava/io/File;", FaceInfoBase.FACE_ID, "", "hash", "validFile", "", "did", "fileHash", "findFile", "", "result", "Lkotlin/Function2;", "preInstall", "id", "path", "version", "", MediaStoreUtil.MediaInfo.SIZE, "needCheckStorage", "license", "sign", "trialDuration", "", "action", "Lkotlin/Function3;", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "doInstall", "segmentLength", "callback", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;)V", "deleteBinFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceInstallController {
    @Nullable
    Object deleteBinFile(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation);

    void doInstall(@Nullable String path, @Nullable String id, @Nullable Integer segmentLength, @NotNull FaceInstallPushCallback callback);

    void findFile(@NotNull String faceId, @Nullable String fileHash, @NotNull Function2<? super File, ? super File, Unit> result);

    @NotNull
    File getFilePath(@NotNull String faceId, @NotNull String hash);

    void preInstall(@Nullable String id, @Nullable String path, long version, long size, boolean needCheckStorage, @Nullable String license, @Nullable String sign, @Nullable Integer trialDuration, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action);

    boolean validFile(@Nullable String did, @Nullable String faceId, @Nullable String fileHash);
}
