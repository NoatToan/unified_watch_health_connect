package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import android.app.Application;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.AudioFileCacheConfig;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCacheHelper;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioFileMigrate;", "", "<init>", "()V", "MIGRATE_FINISHED", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMigrateFinished", "", "()Z", "moveOldAudioFileToCache", "", "context", "Landroid/app/Application;", "doMoveAudioFile", "srcDir", "", "dstDir", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnoreAudioFileMigrate {

    @NotNull
    public static final SnoreAudioFileMigrate INSTANCE = new SnoreAudioFileMigrate();

    @NotNull
    private static final AtomicBoolean MIGRATE_FINISHED = new AtomicBoolean();

    private SnoreAudioFileMigrate() {
    }

    private final void doMoveAudioFile(String srcDir, String dstDir) throws Throwable {
        File[] fileArrListFiles;
        File file = new File(srcDir);
        if (file.isFile()) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNull(absolutePath);
            if (StringsKt__StringsJVMKt.endsWith$default(absolutePath, ".wav", false, 2, null)) {
                AudioDiskLruCacheHelper.INSTANCE.putCachedFile(dstDir, absolutePath);
                FileUtils.INSTANCE.deleteFile(absolutePath);
                return;
            }
            return;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
        while (it.hasNext()) {
            String absolutePath2 = ((File) it.next()).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            doMoveAudioFile(absolutePath2, dstDir);
        }
    }

    public final boolean isMigrateFinished() {
        return MIGRATE_FINISHED.get();
    }

    public final void moveOldAudioFileToCache(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            MIGRATE_FINISHED.set(false);
            String audioCacheDirAbsolutePath = AudioFileCacheConfig.INSTANCE.getAudioCacheDirAbsolutePath(context);
            String str = context.getCacheDir() + File.separator + BehaviorConfiguration.INSTANCE.getAudioRelativePath();
            if (FileUtils.isExists(str)) {
                doMoveAudioFile(str, audioCacheDirAbsolutePath);
            }
        } finally {
            MIGRATE_FINISHED.set(true);
        }
    }
}
