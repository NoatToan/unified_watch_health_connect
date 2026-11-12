package com.xiaomi.fitness.sleep.disklrucache;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import defpackage.bvc;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCacheHelper;", "", "<init>", "()V", "TAG", "", "sDiskLruCache", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "INDEX_OUTPUTSTREAM", "", "createDiskCacheDir", "dir", "maxSize", "", "putCachedFile", "", "cacheDir", "srcFilePath", "getCachedFD", "Ljava/io/FileDescriptor;", "getCachedFilePath", "deleteCachedFile", "", "isCachedFileExits", "getCacheKey", "path", "getDiskLruCache", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioDiskLruCacheHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioDiskLruCacheHelper.kt\ncom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCacheHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class AudioDiskLruCacheHelper {
    private static final int INDEX_OUTPUTSTREAM = 0;

    @NotNull
    public static final AudioDiskLruCacheHelper INSTANCE = new AudioDiskLruCacheHelper();

    @NotNull
    private static final String TAG = "DiskLruCacheHelper";

    @Nullable
    private static AudioDiskLruCache sDiskLruCache;

    private AudioDiskLruCacheHelper() {
    }

    private final AudioDiskLruCache getDiskLruCache(String cacheDir) {
        AudioDiskLruCache audioDiskLruCache = sDiskLruCache;
        if (audioDiskLruCache != null) {
            return audioDiskLruCache;
        }
        throw new IllegalStateException("the cache instance not init " + cacheDir);
    }

    @Nullable
    public final AudioDiskLruCache createDiskCacheDir(@NotNull String dir, long maxSize) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (!(!TextUtils.isEmpty(dir))) {
            throw new IllegalStateException("dir is null or empty".toString());
        }
        AudioDiskLruCache audioDiskLruCacheOpen = sDiskLruCache;
        if (audioDiskLruCacheOpen == null) {
            try {
                audioDiskLruCacheOpen = AudioDiskLruCache.INSTANCE.open(new File(dir), 100, 1, maxSize);
                sDiskLruCache = audioDiskLruCacheOpen;
            } catch (IOException e) {
                throw new IllegalStateException("create disk cache failed, dir " + dir, e);
            }
        }
        return audioDiskLruCacheOpen;
    }

    public final boolean deleteCachedFile(@NotNull String cacheDir, @NotNull String srcFilePath) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(srcFilePath, "srcFilePath");
        try {
            return getDiskLruCache(cacheDir).remove(getCacheKey(srcFilePath));
        } catch (IOException unused) {
            Logger.e(TAG, "delete cached file error, %s", srcFilePath, new Object[0]);
            return false;
        }
    }

    @NotNull
    public final String getCacheKey(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!(!TextUtils.isEmpty(path))) {
            throw new IllegalArgumentException("path can not be null or empty".toString());
        }
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, separator, 0, false, 6, (Object) null);
        if (iLastIndexOf$default > 0) {
            String strSubstring = path.substring(iLastIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!TextUtils.isEmpty(strSubstring)) {
                return strSubstring;
            }
        }
        return path;
    }

    @Nullable
    public final FileDescriptor getCachedFD(@NotNull String cacheDir, @NotNull String srcFilePath) throws Throwable {
        InputStream inputStream;
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(srcFilePath, "srcFilePath");
        String cacheKey = getCacheKey(srcFilePath);
        AudioDiskLruCache diskLruCache = getDiskLruCache(cacheDir);
        AudioDiskLruCache audioDiskLruCache = null;
        try {
            try {
                AudioDiskLruCache.Snapshot snapshot = diskLruCache.get(cacheKey);
                if (snapshot != null) {
                    inputStream = snapshot.getInputStream(0);
                    try {
                        if (inputStream instanceof FileInputStream) {
                            FileDescriptor fd = ((FileInputStream) inputStream).getFD();
                            bvc.a(inputStream);
                            return fd;
                        }
                    } catch (Exception e) {
                        e = e;
                        Logger.e(TAG, "getCachedFD() has an error", e);
                        bvc.a(inputStream);
                    }
                } else {
                    inputStream = null;
                }
                bvc.a(inputStream);
            } catch (Throwable th) {
                th = th;
                audioDiskLruCache = diskLruCache;
                bvc.a(audioDiskLruCache);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            bvc.a(audioDiskLruCache);
            throw th;
        }
        return null;
    }

    @Nullable
    public final String getCachedFilePath(@NotNull String cacheDir, @NotNull String srcFilePath) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(srcFilePath, "srcFilePath");
        String cacheKey = getCacheKey(srcFilePath);
        if (!FileUtils.isExists(cacheDir)) {
            return null;
        }
        return cacheDir + File.separator + cacheKey;
    }

    public final boolean isCachedFileExits(@NotNull String cacheDir, @NotNull String srcFilePath) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(srcFilePath, "srcFilePath");
        return FileUtils.isExists(getCachedFilePath(cacheDir, srcFilePath));
    }

    public final void putCachedFile(@NotNull String cacheDir, @NotNull String srcFilePath) throws Throwable {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(srcFilePath, "srcFilePath");
        AudioDiskLruCache diskLruCache = getDiskLruCache(cacheDir);
        try {
            AudioDiskLruCache.Editor editorEdit = diskLruCache.edit(getCacheKey(srcFilePath));
            if (editorEdit == null) {
                Logger.w(TAG, "DiskLruCache.Editor is busy, " + srcFilePath);
                return;
            }
            boolean zWriteToFile = FileUtils.INSTANCE.writeToFile(srcFilePath, editorEdit.newOutputStream(0));
            Logger.d(TAG, srcFilePath + " saved " + zWriteToFile);
            if (zWriteToFile) {
                editorEdit.commit();
            } else {
                editorEdit.abort();
            }
            diskLruCache.flush();
        } catch (IOException e) {
            Logger.e(TAG, "save file error", e);
        }
    }
}
