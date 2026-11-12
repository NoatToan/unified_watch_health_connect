package com.facebook.internal;

import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.alipay.sdk.m.u.i;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.xiaomi.ai.core.AivsConfig;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.m;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 42\u00020\u0001:\b\b\u00074\t56\u001c!B\u0017\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b2\u00103J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0087\u0002J\u001c\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010#\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0013\u00101\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/facebook/internal/FileLruCache;", "", "", "key", "Ljava/io/File;", "buffer", "", "b", "a", "c", "", "sizeInBytesForTest", "contentTag", "Ljava/io/InputStream;", "get", "Ljava/io/OutputStream;", "openPutStream", "clearCache", "input", "interceptAndPut", "toString", "Ljava/io/File;", "directory", "", "Z", "isTrimPending", "isTrimInProgress", "Ljava/util/concurrent/locks/ReentrantLock;", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "e", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/atomic/AtomicLong;", "f", "Ljava/util/concurrent/atomic/AtomicLong;", "lastClearCacheTime", "g", "Ljava/lang/String;", "tag", "Lcom/facebook/internal/FileLruCache$Limits;", "h", "Lcom/facebook/internal/FileLruCache$Limits;", "limits", "getLocation", "()Ljava/lang/String;", "location", "<init>", "(Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V", "Companion", "Limits", "ModifiedFile", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FileLruCache {
    private static final String j = "key";
    private static final String k = "tag";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File directory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isTrimPending;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isTrimInProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Condition condition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AtomicLong lastClearCacheTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Limits limits;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String i = FileLruCache.class.getSimpleName();
    private static final AtomicLong l = new AtomicLong();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/FileLruCache$Companion;", "", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "HEADER_CACHEKEY_KEY", "HEADER_CACHE_CONTENT_TAG_KEY", "Ljava/util/concurrent/atomic/AtomicLong;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getTAG() {
            return FileLruCache.i;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/FileLruCache$Limits;", "", "", "value", "a", LogUtil.I, "getByteCount", "()I", "setByteCount", "(I)V", "byteCount", "b", "getFileCount", "setFileCount", "fileCount", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Limits {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int byteCount = 1048576;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setByteCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i;
        }

        public final void setFileCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile;", "", "another", "", "a", "", "", "equals", "hashCode", "", "J", "c", "()J", "modified", "Ljava/io/File;", "b", "Ljava/io/File;", "()Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "e", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifiedFile implements Comparable<ModifiedFile> {
        private static final int c = 29;
        private static final int d = 37;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long modified;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final File file;

        public ModifiedFile(@NotNull File file) {
            this.file = file;
            this.modified = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull ModifiedFile another) {
            long j = this.modified;
            long j2 = another.modified;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.file.compareTo(another.file);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getModified() {
            return this.modified;
        }

        public boolean equals(@Nullable Object another) {
            return (another instanceof ModifiedFile) && compareTo((ModifiedFile) another) == 0;
        }

        public int hashCode() {
            return ((RaceId.RACE_STORAGE_GET_PARTITION_SHA256 + this.file.hashCode()) * 37) + ((int) (this.modified % ((long) Integer.MAX_VALUE)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0012"}, d2 = {"com/facebook/internal/FileLruCache$a", "", "Ljava/io/File;", RootDescription.ROOT_ELEMENT, "", "a", "Ljava/io/FilenameFilter;", "b", "c", GoogleApiAvailabilityLight.a, "", "Ljava/lang/String;", "FILE_NAME_PREFIX", "Ljava/io/FilenameFilter;", "filterExcludeBufferFiles", "filterExcludeNonBufferFiles", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static final String FILE_NAME_PREFIX = "buffer";

        @NotNull
        public static final a d = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final FilenameFilter filterExcludeBufferFiles = C0132a.a;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final FilenameFilter filterExcludeNonBufferFiles = b.a;

        /* JADX INFO: renamed from: com.facebook.internal.FileLruCache$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "dir", "", FileDownloadModel.FILENAME, "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0132a implements FilenameFilter {
            public static final C0132a a = new C0132a();

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return !m.startsWith$default(str, a.FILE_NAME_PREFIX, false, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "dir", "", FileDownloadModel.FILENAME, "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b implements FilenameFilter {
            public static final b a = new b();

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return m.startsWith$default(str, a.FILE_NAME_PREFIX, false, 2, null);
            }
        }

        private a() {
        }

        public final void a(@NotNull File root) {
            File[] fileArrListFiles = root.listFiles(c());
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        @NotNull
        public final FilenameFilter b() {
            return filterExcludeBufferFiles;
        }

        @NotNull
        public final FilenameFilter c() {
            return filterExcludeNonBufferFiles;
        }

        @NotNull
        public final File d(@Nullable File root) {
            return new File(root, FILE_NAME_PREFIX + String.valueOf(FileLruCache.l.incrementAndGet()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0019\u0010\u0010\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0017"}, d2 = {"com/facebook/internal/FileLruCache$b", "Ljava/io/OutputStream;", "", "close", "flush", "", "buffer", "", "offset", "count", "write", "oneByte", "a", "Ljava/io/OutputStream;", "b", "()Ljava/io/OutputStream;", "innerStream", "Lcom/facebook/internal/FileLruCache$d;", "Lcom/facebook/internal/FileLruCache$d;", "()Lcom/facebook/internal/FileLruCache$d;", "callback", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$d;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final OutputStream innerStream;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final d callback;

        public b(@NotNull OutputStream outputStream, @NotNull d dVar) {
            this.innerStream = outputStream;
            this.callback = dVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getCallback() {
            return this.callback;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.innerStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer, int offset, int count) throws IOException {
            this.innerStream.write(buffer, offset, count);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer) throws IOException {
            this.innerStream.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int oneByte) throws IOException {
            this.innerStream.write(oneByte);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"com/facebook/internal/FileLruCache$d", "", "", "onClose", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface d {
        void onClose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"com/facebook/internal/FileLruCache$e", "", "Ljava/io/OutputStream;", AivsConfig.Tts.AUDIO_TYPE_STREAM, "Lorg/json/JSONObject;", "header", "", "b", "Ljava/io/InputStream;", "a", "", LogUtil.I, "HEADER_VERSION", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static final int HEADER_VERSION = 0;

        @NotNull
        public static final e b = new e();

        private e() {
        }

        @Nullable
        public final JSONObject a(@NotNull InputStream stream) throws IOException {
            if (stream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = stream.read();
                if (i4 == -1) {
                    Logger.INSTANCE.log(LoggingBehavior.CACHE, FileLruCache.INSTANCE.getTAG(), "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (i4 & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int i5 = stream.read(bArr, i, i2 - i);
                if (i5 < 1) {
                    Logger.INSTANCE.log(LoggingBehavior.CACHE, FileLruCache.INSTANCE.getTAG(), "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += i5;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                Logger.INSTANCE.log(LoggingBehavior.CACHE, FileLruCache.INSTANCE.getTAG(), "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void b(@NotNull OutputStream stream, @NotNull JSONObject header) throws IOException {
            String string = header.toString();
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = string.getBytes(charset);
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write((bytes.length >> 0) & 255);
            stream.write(bytes);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f implements Runnable {
        public final /* synthetic */ File[] a;

        public f(File[] fileArr) {
            this.a = fileArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                for (File file : this.a) {
                    file.delete();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "com/facebook/internal/FileLruCache$postTrim$1$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                FileLruCache.this.c();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public FileLruCache(@NotNull String str, @NotNull Limits limits) {
        this.tag = str;
        this.limits = limits;
        File file = new File(FacebookSdk.getCacheDir(), str);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            a.d.a(file);
        }
    }

    private final void a() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk.getExecutor().execute(new g());
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String key, File buffer) {
        if (!buffer.renameTo(new File(this.directory, Utility.md5hash(key)))) {
            buffer.delete();
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        long j2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            try {
                Logger.INSTANCE.log(LoggingBehavior.CACHE, i, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] fileArrListFiles = this.directory.listFiles(a.d.b());
                long length = 0;
                if (fileArrListFiles != null) {
                    j2 = 0;
                    for (File file : fileArrListFiles) {
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        Logger.INSTANCE.log(LoggingBehavior.CACHE, i, "  trim considering time=" + Long.valueOf(modifiedFile.getModified()) + " name=" + modifiedFile.getFile().getName());
                        length += file.length();
                        j2++;
                    }
                } else {
                    j2 = 0;
                }
                while (true) {
                    if (length <= this.limits.getByteCount() && j2 <= this.limits.getFileCount()) {
                        ReentrantLock reentrantLock2 = this.lock;
                        reentrantLock2.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                    Logger.INSTANCE.log(LoggingBehavior.CACHE, i, "  trim removing " + file2.getName());
                    length -= file2.length();
                    j2 += -1;
                    file2.delete();
                }
            } catch (Throwable th) {
                ReentrantLock reentrantLock3 = this.lock;
                reentrantLock3.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    public final void clearCache() {
        File[] fileArrListFiles = this.directory.listFiles(a.d.b());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (fileArrListFiles != null) {
            FacebookSdk.getExecutor().execute(new f(fileArrListFiles));
        }
    }

    @JvmOverloads
    @Nullable
    public final InputStream get(@NotNull String str) throws IOException {
        return get$default(this, str, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final InputStream get(@NotNull String key, @Nullable String contentTag) throws IOException {
        File file = new File(this.directory, Utility.md5hash(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject jSONObjectA = e.b.a(bufferedInputStream);
                if (jSONObjectA == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!Intrinsics.areEqual(jSONObjectA.optString("key"), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectA.optString("tag", null);
                if (contentTag == null && (!Intrinsics.areEqual(contentTag, strOptString))) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                Logger.INSTANCE.log(LoggingBehavior.CACHE, i, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NotNull
    public final String getLocation() {
        return this.directory.getPath();
    }

    @NotNull
    public final InputStream interceptAndPut(@NotNull String key, @NotNull InputStream input) throws IOException {
        return new c(input, openPutStream$default(this, key, null, 2, null));
    }

    @JvmOverloads
    @NotNull
    public final OutputStream openPutStream(@NotNull String str) throws IOException {
        return openPutStream$default(this, str, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final OutputStream openPutStream(@NotNull final String key, @Nullable String contentTag) throws IOException {
        final File fileD = a.d.d(this.directory);
        fileD.delete();
        if (!fileD.createNewFile()) {
            throw new IOException("Could not create file at " + fileD.getAbsolutePath());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileD);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(fileOutputStream, new d() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                @Override // com.facebook.internal.FileLruCache.d
                public void onClose() {
                    if (jCurrentTimeMillis < this.a.lastClearCacheTime.get()) {
                        fileD.delete();
                    } else {
                        this.a.b(key, fileD);
                    }
                }
            }), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", key);
                    if (!Utility.isNullOrEmpty(contentTag)) {
                        jSONObject.put("tag", contentTag);
                    }
                    e.b.b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, i, "Error creating JSON header for cache file: " + e2);
                    throw new IOException(e2.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e3) {
            Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, i, "Error creating buffer output stream: " + e3);
            throw new IOException(e3.getMessage());
        }
    }

    public final long sizeInBytesForTest() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        reentrantLock.unlock();
        File[] fileArrListFiles = this.directory.listFiles();
        long length = 0;
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                length += file.length();
            }
        }
        return length;
    }

    @NotNull
    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + i.d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\u0016\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u001b\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"com/facebook/internal/FileLruCache$c", "Ljava/io/InputStream;", "", "available", "", "close", "readlimit", "mark", "", "markSupported", "", "buffer", "read", "offset", SessionDescription.p, Configs.Params.RESET, "", "byteCount", PointCategory.SKIP, "a", "Ljava/io/InputStream;", "()Ljava/io/InputStream;", "input", "Ljava/io/OutputStream;", "b", "Ljava/io/OutputStream;", "()Ljava/io/OutputStream;", "output", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final InputStream input;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final OutputStream output;

        public c(@NotNull InputStream inputStream, @NotNull OutputStream outputStream) {
            this.input = inputStream;
            this.output = outputStream;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InputStream getInput() {
            return this.input;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.input.available();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final OutputStream getOutput() {
            return this.output;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int readlimit) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer) throws IOException {
            int i = this.input.read(buffer);
            if (i > 0) {
                this.output.write(buffer, 0, i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long byteCount) throws IOException {
            int i;
            byte[] bArr = new byte[1024];
            long j = 0;
            while (j < byteCount && (i = read(bArr, 0, (int) Math.min(byteCount - j, 1024))) >= 0) {
                j += (long) i;
            }
            return j;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.input.read();
            if (i >= 0) {
                this.output.write(i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer, int offset, int length) throws IOException {
            int i = this.input.read(buffer, offset, length);
            if (i > 0) {
                this.output.write(buffer, offset, i);
            }
            return i;
        }
    }
}
