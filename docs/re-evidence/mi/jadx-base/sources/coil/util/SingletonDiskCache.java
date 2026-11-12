package coil.util;

import android.content.Context;
import coil.disk.DiskCache;
import kotlin.Metadata;
import kotlin.io.FilesKt__UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcoil/util/SingletonDiskCache;", "", "()V", "FOLDER_NAME", "", "instance", "Lcoil/disk/DiskCache;", "get", "context", "Landroid/content/Context;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SingletonDiskCache {

    @NotNull
    private static final String FOLDER_NAME = "image_cache";

    @NotNull
    public static final SingletonDiskCache INSTANCE = new SingletonDiskCache();

    @Nullable
    private static DiskCache instance;

    private SingletonDiskCache() {
    }

    @NotNull
    public final synchronized DiskCache get(@NotNull Context context) {
        DiskCache diskCacheBuild;
        diskCacheBuild = instance;
        if (diskCacheBuild == null) {
            diskCacheBuild = new DiskCache.Builder().directory(FilesKt__UtilsKt.resolve(Utils.getSafeCacheDir(context), FOLDER_NAME)).build();
            instance = diskCacheBuild;
        }
        return diskCacheBuild;
    }
}
