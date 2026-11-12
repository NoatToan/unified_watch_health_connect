package coil.disk;

import android.os.StatFs;
import androidx.annotation.FloatRange;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u001f !J\b\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH§\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001aH'R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, d2 = {"Lcoil/disk/DiskCache;", "", "directory", "Lokio/Path;", "getDirectory$annotations", "()V", "getDirectory", "()Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem$annotations", "getFileSystem", "()Lokio/FileSystem;", "maxSize", "", "getMaxSize$annotations", "getMaxSize", "()J", MediaStoreUtil.MediaInfo.SIZE, "getSize$annotations", "getSize", CervicalMucusRecord.Appearance.CLEAR, "", "edit", "Lcoil/disk/DiskCache$Editor;", "key", "", "get", "Lcoil/disk/DiskCache$Snapshot;", "remove", "", "Builder", "Editor", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface DiskCache {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0012J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil/disk/DiskCache$Builder;", "", "()V", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "directory", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "maxSizeBytes", "", "maxSizePercent", "", "maximumMaxSizeBytes", "minimumMaxSizeBytes", OneTrack.Param.BUILD, "Lcoil/disk/DiskCache;", "dispatcher", "Ljava/io/File;", MediaStoreUtil.MediaInfo.SIZE, "percent", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private Path directory;
        private long maxSizeBytes;

        @NotNull
        private FileSystem fileSystem = FileSystem.SYSTEM;
        private double maxSizePercent = 0.02d;
        private long minimumMaxSizeBytes = 10485760;
        private long maximumMaxSizeBytes = 262144000;

        @NotNull
        private CoroutineDispatcher cleanupDispatcher = Dispatchers.getIO();

        @NotNull
        public final DiskCache build() {
            long jCoerceIn;
            Path path = this.directory;
            if (path == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    StatFs statFs = new StatFs(path.toFile().getAbsolutePath());
                    jCoerceIn = RangesKt___RangesKt.coerceIn((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jCoerceIn = this.minimumMaxSizeBytes;
                }
            } else {
                jCoerceIn = this.maxSizeBytes;
            }
            return new RealDiskCache(jCoerceIn, path, this.fileSystem, this.cleanupDispatcher);
        }

        @NotNull
        public final Builder cleanupDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.cleanupDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder directory(@NotNull File directory) {
            return directory(Path.Companion.get$default(Path.INSTANCE, directory, false, 1, (Object) null));
        }

        @NotNull
        public final Builder fileSystem(@NotNull FileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        @NotNull
        public final Builder maxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.maxSizePercent = 0.0d;
            this.maxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0d, to = 1.0d) double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].".toString());
            }
            this.maxSizeBytes = 0L;
            this.maxSizePercent = percent;
            return this;
        }

        @NotNull
        public final Builder maximumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.maximumMaxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder minimumMaxSizeBytes(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.minimumMaxSizeBytes = size;
            return this;
        }

        @NotNull
        public final Builder directory(@NotNull Path directory) {
            this.directory = directory;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDirectory$annotations() {
        }

        public static /* synthetic */ void getFileSystem$annotations() {
        }

        public static /* synthetic */ void getMaxSize$annotations() {
        }

        public static /* synthetic */ void getSize$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"Lcoil/disk/DiskCache$Editor;", "", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "abort", "", "commit", "commitAndGet", "Lcoil/disk/DiskCache$Snapshot;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Editor {
        void abort();

        void commit();

        @Nullable
        Snapshot commitAndGet();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", Constants.EXTRA_CLOSE_TAI, "", "closeAndEdit", "Lcoil/disk/DiskCache$Editor;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Snapshot extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @Nullable
        Editor closeAndEdit();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    void clear();

    @Nullable
    Editor edit(@NotNull String key);

    @Nullable
    Snapshot get(@NotNull String key);

    @NotNull
    Path getDirectory();

    @NotNull
    FileSystem getFileSystem();

    long getMaxSize();

    long getSize();

    boolean remove(@NotNull String key);
}
