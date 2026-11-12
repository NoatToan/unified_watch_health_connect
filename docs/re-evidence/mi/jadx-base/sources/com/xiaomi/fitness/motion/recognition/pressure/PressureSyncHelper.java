package com.xiaomi.fitness.motion.recognition.pressure;

import android.content.Context;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.motion.recognition.pressure.PressureSyncHelper;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSyncHelper;", "", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mUploadingFiles", "", "", "asyncUpload", "", "fileName", "download", "Ljava/io/InputStream;", "cancelUpload", "createCloudDisk", "registerSyncCallback", "uploadFile", "", "name", "inputStream", "downloadFile", "upload", "pressureFolderPath", "getPressureFolderPath", "()Ljava/lang/String;", "pressureFolderTempPath", "getPressureFolderTempPath", "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPressureSyncHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureSyncHelper.kt\ncom/xiaomi/fitness/motion/recognition/pressure/PressureSyncHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
public final class PressureSyncHelper {

    @NotNull
    private static final String TAG = "PressureSyncHelper";

    @NotNull
    private final Context mContext;

    @NotNull
    private final Set<String> mUploadingFiles;

    public PressureSyncHelper(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mUploadingFiles = new HashSet();
        createCloudDisk();
        registerSyncCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asyncUpload$lambda$2(PressureSyncHelper this$0, String fileName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        try {
            this$0.upload(fileName);
            synchronized (this$0.mUploadingFiles) {
                this$0.mUploadingFiles.remove(fileName);
            }
        } catch (Throwable th) {
            synchronized (this$0.mUploadingFiles) {
                this$0.mUploadingFiles.remove(fileName);
                throw th;
            }
        }
    }

    private final void createCloudDisk() {
    }

    private final InputStream downloadFile(String name) {
        return null;
    }

    private final String getPressureFolderPath() {
        return PressureFileUtils.INSTANCE.getPressureFolderPath(this.mContext);
    }

    private final String getPressureFolderTempPath() {
        return getPressureFolderPath() + "temp";
    }

    private final void registerSyncCallback() {
    }

    private final void upload(String fileName) {
    }

    private final boolean uploadFile(String name, InputStream inputStream) {
        return false;
    }

    public final void asyncUpload(@NotNull final String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        synchronized (this.mUploadingFiles) {
            Set<String> set = this.mUploadingFiles;
            Objects.requireNonNull(fileName);
            Intrinsics.checkNotNullExpressionValue(fileName, "requireNonNull(...)");
            set.add(fileName);
        }
        ExecutorHelper.INSTANCE.getIoThreadPool().execute(new Runnable() { // from class: p7i
            @Override // java.lang.Runnable
            public final void run() {
                PressureSyncHelper.asyncUpload$lambda$2(this.f30088a, fileName);
            }
        });
    }

    public final void cancelUpload(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        synchronized (this.mUploadingFiles) {
            this.mUploadingFiles.remove(fileName);
        }
    }

    @Nullable
    public final InputStream download(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return null;
    }
}
