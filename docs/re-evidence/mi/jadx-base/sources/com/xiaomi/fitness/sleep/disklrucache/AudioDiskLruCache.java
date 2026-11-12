package com.xiaomi.fitness.sleep.disklrucache;

import com.mi.health.course.export.data.CourseConfigModel;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCache;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 ?2\u00020\u0001:\u0004<=>?B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\u0017\u0010&\u001a\b\u0018\u00010'R\u00020\u00002\u0006\u0010(\u001a\u00020\u0016H\u0086\u0002J\u0014\u0010)\u001a\b\u0018\u00010*R\u00020\u00002\u0006\u0010(\u001a\u00020\u0016J\u001e\u0010)\u001a\b\u0018\u00010*R\u00020\u00002\u0006\u0010(\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\bH\u0002J\u0006\u0010,\u001a\u00020\bJ\u000e\u0010-\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u001c\u0010.\u001a\u00020!2\n\u0010/\u001a\u00060*R\u00020\u00002\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\u000e\u00103\u001a\u0002012\u0006\u0010(\u001a\u00020\u0016J\b\u00106\u001a\u00020!H\u0002J\u0006\u00107\u001a\u00020!J\b\u00108\u001a\u00020!H\u0016J\b\u00109\u001a\u00020!H\u0002J\u0006\u0010:\u001a\u00020!J\u0010\u0010;\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0018\u00010\u0017R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "Ljava/io/Closeable;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "", "<init>", "(Ljava/io/File;IIJ)V", "getDirectory", "()Ljava/io/File;", "executorService", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutorService", "()Ljava/util/concurrent/ThreadPoolExecutor;", "journalFile", "journalFileTmp", "journalFileBackup", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Entry;", MediaStoreUtil.MediaInfo.SIZE, "journalWriter", "Ljava/io/Writer;", "redundantOpCount", "cleanupCallable", "Ljava/util/concurrent/Callable;", "Ljava/lang/Void;", "nextSequenceNumber", "readJournal", "", "readJournalLine", "line", "processJournal", "rebuildJournal", "get", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Snapshot;", "key", "edit", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;", "expectedSequenceNumber", "getMaxSize", "setMaxSize", "completeEdit", "editor", "success", "", "journalRebuildRequired", "remove", "isClosed", "()Z", "checkNotClosed", "flush", Constants.EXTRA_CLOSE_TAI, "trimToSize", "delete", "validateKey", "Snapshot", "Editor", "Entry", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioDiskLruCache.kt\ncom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,958:1\n37#2:959\n36#2,3:960\n1#3:963\n*S KotlinDebug\n*F\n+ 1 AudioDiskLruCache.kt\ncom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache\n*L\n187#1:959\n187#1:960,3\n*E\n"})
public final class AudioDiskLruCache implements Closeable {
    public static final long ANY_SEQUENCE_NUMBER = -1;

    @NotNull
    private static final String CLEAN = "CLEAN";

    @NotNull
    private static final String DIRTY = "DIRTY";

    @NotNull
    public static final String JOURNAL_FILE = "journal";

    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";

    @NotNull
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";

    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";

    @NotNull
    private static final String READ = "READ";

    @NotNull
    private static final String REMOVE = "REMOVE";

    @NotNull
    private static final String TAG = "DiskLruCache";

    @NotNull
    public static final String VERSION_1 = "1";
    private final int appVersion;

    @NotNull
    private final Callable<Void> cleanupCallable;

    @NotNull
    private final File directory;

    @NotNull
    private final ThreadPoolExecutor executorService;

    @NotNull
    private final File journalFile;

    @NotNull
    private final File journalFileBackup;

    @NotNull
    private final File journalFileTmp;

    @Nullable
    private Writer journalWriter;

    @NotNull
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String STRING_KEY_PATTERN = "[a-z0-9_-]{1,120}";
    private static final Pattern LEGAL_KEY_PATTERN = Pattern.compile(STRING_KEY_PATTERN);

    @NotNull
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCache$Companion$NULL_OUTPUT_STREAM$1
        @Override // java.io.OutputStream
        public void write(int b2) throws IOException {
        }
    };

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001dH\u0002J \u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Companion;", "", "<init>", "()V", "JOURNAL_FILE", "", "JOURNAL_FILE_TEMP", "JOURNAL_FILE_BACKUP", "MAGIC", "VERSION_1", "ANY_SEQUENCE_NUMBER", "", "STRING_KEY_PATTERN", "LEGAL_KEY_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getLEGAL_KEY_PATTERN", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "TAG", AudioDiskLruCache.CLEAN, AudioDiskLruCache.DIRTY, AudioDiskLruCache.REMOVE, AudioDiskLruCache.READ, "NULL_OUTPUT_STREAM", "Ljava/io/OutputStream;", "open", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "deleteIfExists", "", "file", "renameTo", "from", "to", "deleteDestination", "", "inputStreamToString", "in", "Ljava/io/InputStream;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAudioDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioDiskLruCache.kt\ncom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,958:1\n1#2:959\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deleteIfExists(File file) throws IOException {
            if (file.exists() && !file.delete()) {
                throw new IOException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String inputStreamToString(InputStream in) throws IOException {
            Util util2 = Util.INSTANCE;
            return util2.readFully(new InputStreamReader(in, util2.getUTF_8()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void renameTo(File from, File to, boolean deleteDestination) throws IOException {
            if (deleteDestination) {
                deleteIfExists(to);
            }
            if (!from.renameTo(to)) {
                throw new IOException();
            }
        }

        public final Pattern getLEGAL_KEY_PATTERN() {
            return AudioDiskLruCache.LEGAL_KEY_PATTERN;
        }

        @NotNull
        public final AudioDiskLruCache open(@NotNull File directory, int appVersion, int valueCount, long maxSize) throws IOException {
            Intrinsics.checkNotNullParameter(directory, "directory");
            if (maxSize <= 0) {
                throw new IllegalArgumentException("maxSize <= 0".toString());
            }
            if (valueCount <= 0) {
                throw new IllegalArgumentException("valueCount <= 0".toString());
            }
            File file = new File(directory, "journal.bkp");
            if (file.exists()) {
                File file2 = new File(directory, "journal");
                if (file2.exists()) {
                    file.delete();
                } else {
                    renameTo(file, file2, false);
                }
            }
            AudioDiskLruCache audioDiskLruCache = new AudioDiskLruCache(directory, appVersion, valueCount, maxSize, null);
            if (audioDiskLruCache.journalFile.exists()) {
                try {
                    audioDiskLruCache.readJournal();
                    audioDiskLruCache.processJournal();
                    return audioDiskLruCache;
                } catch (IOException e) {
                    Logger.e(AudioDiskLruCache.TAG, "DiskLruCache %s is corrupt: %s, removing", directory, e.getMessage());
                    audioDiskLruCache.delete();
                }
            }
            directory.mkdirs();
            AudioDiskLruCache audioDiskLruCache2 = new AudioDiskLruCache(directory, appVersion, valueCount, maxSize, null);
            audioDiskLruCache2.rebuildJournal();
            return audioDiskLruCache2;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013J\u001b\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0086\u0002J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\u0019R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;", "", "entry", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Entry;", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "<init>", "(Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Entry;)V", "getEntry", "()Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Entry;", "written", "", "getWritten", "()[Z", "hasErrors", "", "committed", "newInputStream", "Ljava/io/InputStream;", "index", "", "getString", "", "newOutputStream", "Ljava/io/OutputStream;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "value", "commit", "abort", "abortUnlessCommitted", "FaultHidingOutputStream", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Editor {
        private boolean committed;

        @NotNull
        private final Entry entry;
        private boolean hasErrors;
        final /* synthetic */ AudioDiskLruCache this$0;

        @Nullable
        private final boolean[] written;

        public Editor(@NotNull AudioDiskLruCache audioDiskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.this$0 = audioDiskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[audioDiskLruCache.valueCount];
        }

        public final void abort() throws IOException {
            this.this$0.completeEdit(this, false);
        }

        public final void abortUnlessCommitted() {
            if (this.committed) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public final void commit() throws IOException {
            if (this.hasErrors) {
                this.this$0.completeEdit(this, false);
                this.this$0.remove(this.entry.getKey());
            } else {
                this.this$0.completeEdit(this, true);
            }
            this.committed = true;
        }

        @NotNull
        public final Entry getEntry() {
            return this.entry;
        }

        @Nullable
        public final String getString(int index) throws IOException {
            InputStream inputStreamNewInputStream = newInputStream(index);
            if (inputStreamNewInputStream != null) {
                return AudioDiskLruCache.INSTANCE.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        @Nullable
        public final boolean[] getWritten() {
            return this.written;
        }

        @Nullable
        public final InputStream newInputStream(int index) throws IOException {
            FileInputStream fileInputStream;
            synchronized (this.this$0) {
                if (!Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    throw new IllegalStateException("Check failed.");
                }
                fileInputStream = null;
                if (this.entry.getReadable()) {
                    try {
                        fileInputStream = new FileInputStream(this.entry.getCleanFile(index));
                    } catch (FileNotFoundException unused) {
                    }
                }
            }
            return fileInputStream;
        }

        @NotNull
        public final OutputStream newOutputStream(int index) throws IOException {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            boolean z = index >= 0 && index < this.this$0.valueCount;
            AudioDiskLruCache audioDiskLruCache = this.this$0;
            if (!z) {
                throw new IllegalArgumentException(("Expected index " + index + " to be greater than 0 and less than the maximum value count of " + audioDiskLruCache.valueCount).toString());
            }
            synchronized (audioDiskLruCache) {
                try {
                    if (!Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!this.entry.getReadable()) {
                        boolean[] zArr = this.written;
                        Intrinsics.checkNotNull(zArr);
                        zArr[index] = true;
                    }
                    File dirtyFile = this.entry.getDirtyFile(index);
                    try {
                        fileOutputStream = new FileOutputStream(dirtyFile);
                    } catch (FileNotFoundException unused) {
                        audioDiskLruCache.getDirectory().mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(dirtyFile);
                        } catch (FileNotFoundException unused2) {
                            return AudioDiskLruCache.NULL_OUTPUT_STREAM;
                        }
                    }
                    faultHidingOutputStream = new FaultHidingOutputStream(this, fileOutputStream);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return faultHidingOutputStream;
        }

        public final void set(int index, @Nullable String value) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStream outputStreamNewOutputStream = newOutputStream(index);
                Util util2 = Util.INSTANCE;
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStreamNewOutputStream, util2.getUTF_8());
                try {
                    outputStreamWriter2.write(value);
                    util2.closeQuietly(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    Util.INSTANCE.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor$FaultHidingOutputStream;", "Ljava/io/FilterOutputStream;", "out", "Ljava/io/OutputStream;", "<init>", "(Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;Ljava/io/OutputStream;)V", "write", "", "oneByte", "", "buffer", "", "offset", "length", "flush", Constants.EXTRA_CLOSE_TAI, "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class FaultHidingOutputStream extends FilterOutputStream {
            final /* synthetic */ Editor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FaultHidingOutputStream(@NotNull Editor editor, OutputStream out) {
                super(out);
                Intrinsics.checkNotNullParameter(out, "out");
                this.this$0 = editor;
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    this.this$0.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    this.this$0.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int oneByte) {
                try {
                    ((FilterOutputStream) this).out.write(oneByte);
                } catch (IOException unused) {
                    this.this$0.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(@NotNull byte[] buffer, int offset, int length) {
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                try {
                    ((FilterOutputStream) this).out.write(buffer, offset, length);
                } catch (IOException unused) {
                    this.this$0.hasErrors = true;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003J\u0019\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\u0010#J\u001b\u0010$\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0002¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Entry;", "", "key", "", "<init>", "(Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "lengths", "", "getLengths", "()[J", "readable", "", "getReadable", "()Z", "setReadable", "(Z)V", "currentEditor", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "getCurrentEditor", "()Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;", "setCurrentEditor", "(Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;)V", "sequenceNumber", "", "getSequenceNumber", "()J", "setSequenceNumber", "(J)V", "setLengths", "", "strings", "", "([Ljava/lang/String;)V", "invalidLengths", "Ljava/io/IOException;", "([Ljava/lang/String;)Ljava/io/IOException;", "getCleanFile", "Ljava/io/File;", "i", "", "getDirtyFile", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Entry {

        @Nullable
        private Editor currentEditor;

        @NotNull
        private final String key;

        @NotNull
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ AudioDiskLruCache this$0;

        public Entry(@NotNull AudioDiskLruCache audioDiskLruCache, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = audioDiskLruCache;
            this.key = key;
            this.lengths = new long[audioDiskLruCache.valueCount];
        }

        private final IOException invalidLengths(String[] strings) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strings));
        }

        @NotNull
        public final File getCleanFile(int i) {
            return new File(this.this$0.getDirectory(), this.key);
        }

        @Nullable
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final File getDirtyFile(int i) {
            return new File(this.this$0.getDirectory(), this.key + ".tmp");
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final long[] getLengths() {
            return this.lengths;
        }

        public final boolean getReadable() {
            return this.readable;
        }

        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public final void setCurrentEditor(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths(@NotNull String[] strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.length != this.this$0.valueCount) {
                throw invalidLengths(strings);
            }
            try {
                int length = strings.length;
                for (int i = 0; i < length; i++) {
                    this.lengths[i] = Long.parseLong(strings[i]);
                }
            } catch (NumberFormatException unused) {
                throw invalidLengths(strings);
            }
        }

        public final void setReadable(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber(long j) {
            this.sequenceNumber = j;
        }

        @NotNull
        public final String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ');
                sb.append(j);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Snapshot;", "Ljava/io/Closeable;", "key", "", "sequenceNumber", "", "ins", "", "Ljava/io/InputStream;", "lengths", "", "<init>", "(Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[J)V", "[Ljava/io/InputStream;", "edit", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache$Editor;", "Lcom/xiaomi/fitness/sleep/disklrucache/AudioDiskLruCache;", "getInputStream", "index", "", "getString", "getLength", Constants.EXTRA_CLOSE_TAI, "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Snapshot implements Closeable {

        @NotNull
        private final InputStream[] ins;

        @NotNull
        private final String key;

        @NotNull
        private final long[] lengths;
        private final long sequenceNumber;
        final /* synthetic */ AudioDiskLruCache this$0;

        public Snapshot(@NotNull AudioDiskLruCache audioDiskLruCache, String key, @NotNull long j, @NotNull InputStream[] ins, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(ins, "ins");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.this$0 = audioDiskLruCache;
            this.key = key;
            this.sequenceNumber = j;
            this.ins = ins;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                Util.INSTANCE.closeQuietly(inputStream);
            }
        }

        @Nullable
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        @NotNull
        public final InputStream getInputStream(int index) {
            return this.ins[index];
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        @Nullable
        public final String getString(int index) throws IOException {
            return AudioDiskLruCache.INSTANCE.inputStreamToString(getInputStream(index));
        }
    }

    public /* synthetic */ AudioDiskLruCache(File file, int i, int i2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i, i2, j);
    }

    private final void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void cleanupCallable$lambda$1(AudioDiskLruCache this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            try {
                if (this$0.journalWriter == null) {
                    return null;
                }
                this$0.trimToSize();
                if (this$0.journalRebuildRequired()) {
                    this$0.rebuildJournal();
                    this$0.redundantOpCount = 0;
                }
                Unit unit = Unit.INSTANCE;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void completeEdit(Editor editor, boolean success) throws IOException {
        Entry entry = editor.getEntry();
        if (!Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] written = editor.getWritten();
                Intrinsics.checkNotNull(written);
                if (!written[i2]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!entry.getDirtyFile(i2).exists()) {
                    editor.abort();
                    return;
                }
            }
        }
        int i3 = this.valueCount;
        for (int i4 = 0; i4 < i3; i4++) {
            File dirtyFile = entry.getDirtyFile(i4);
            if (!success) {
                INSTANCE.deleteIfExists(dirtyFile);
            } else if (dirtyFile.exists()) {
                File cleanFile = entry.getCleanFile(i4);
                dirtyFile.renameTo(cleanFile);
                long j = entry.getLengths()[i4];
                long length = cleanFile.length();
                entry.getLengths()[i4] = length;
                this.size = (this.size - j) + length;
            }
        }
        this.redundantOpCount++;
        entry.setCurrentEditor(null);
        if (entry.getReadable() || success) {
            entry.setReadable(true);
            Writer writer = this.journalWriter;
            Intrinsics.checkNotNull(writer);
            writer.write("CLEAN " + entry.getKey() + entry.getLengths());
            if (success) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.setSequenceNumber(j2);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            Writer writer2 = this.journalWriter;
            Intrinsics.checkNotNull(writer2);
            writer2.write("REMOVE " + entry.getKey());
        }
        Writer writer3 = this.journalWriter;
        Intrinsics.checkNotNull(writer3);
        writer3.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    private final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processJournal() throws IOException {
        INSTANCE.deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkNotNull(next);
            int i = 0;
            if (next.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += next.getLengths()[i];
                    i++;
                }
            } else {
                next.setCurrentEditor(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    Companion companion = INSTANCE;
                    companion.deleteIfExists(next.getCleanFile(i));
                    companion.deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readJournal() throws IOException {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.INSTANCE.getUS_ASCII());
        try {
            String line = strictLineReader.readLine();
            String line2 = strictLineReader.readLine();
            String line3 = strictLineReader.readLine();
            String line4 = strictLineReader.readLine();
            String line5 = strictLineReader.readLine();
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", line) || !Intrinsics.areEqual("1", line2) || !Intrinsics.areEqual(Integer.toString(this.appVersion), line3) || !Intrinsics.areEqual(Integer.toString(this.valueCount), line4) || !Intrinsics.areEqual("", line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.INSTANCE.getUS_ASCII()));
                    }
                    Util.INSTANCE.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.INSTANCE.closeQuietly(strictLineReader);
            throw th;
        }
    }

    private final void readJournalLine(String line) throws IOException {
        String strSubstring;
        Intrinsics.checkNotNull(line);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) line, ' ', i, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = line.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iIndexOf$default == 6 && StringsKt__StringsJVMKt.startsWith$default(line, REMOVE, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt__StringsJVMKt.startsWith$default(line, CLEAN, false, 2, null)) {
            String strSubstring2 = line.substring(iIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring2, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
            entry.setReadable(true);
            entry.setCurrentEditor(null);
            entry.setLengths(strArr);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt__StringsJVMKt.startsWith$default(line, DIRTY, false, 2, null)) {
            entry.setCurrentEditor(new Editor(this, entry));
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt__StringsJVMKt.startsWith$default(line, READ, false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void rebuildJournal() throws IOException {
        try {
            Writer writer = this.journalWriter;
            if (writer != null) {
                Intrinsics.checkNotNull(writer);
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.INSTANCE.getUS_ASCII()));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.appVersion));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.valueCount));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (Entry entry : this.lruEntries.values()) {
                    Intrinsics.checkNotNull(entry);
                    if (entry.getCurrentEditor() != null) {
                        bufferedWriter.write("DIRTY " + entry.getKey() + "\n");
                    } else {
                        bufferedWriter.write("CLEAN " + entry.getKey() + entry.getLengths() + "\n");
                    }
                }
                bufferedWriter.close();
                if (this.journalFile.exists()) {
                    INSTANCE.renameTo(this.journalFile, this.journalFileBackup, true);
                }
                INSTANCE.renameTo(this.journalFileTmp, this.journalFile, false);
                this.journalFileBackup.delete();
                this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.INSTANCE.getUS_ASCII()));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            Map.Entry<String, Entry> next = this.lruEntries.entrySet().iterator().next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            remove(next.getKey());
        }
    }

    private final void validateKey(String key) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.journalWriter == null) {
                return;
            }
            Iterator it = new ArrayList(this.lruEntries.values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                Intrinsics.checkNotNull(entry);
                if (entry.getCurrentEditor() != null) {
                    Editor currentEditor = entry.getCurrentEditor();
                    Intrinsics.checkNotNull(currentEditor);
                    currentEditor.abort();
                }
            }
            trimToSize();
            Writer writer = this.journalWriter;
            Intrinsics.checkNotNull(writer);
            writer.close();
            this.journalWriter = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void delete() throws IOException {
        close();
        Util.INSTANCE.deleteContents(this.directory);
    }

    @Nullable
    public final Editor edit(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return edit(key, -1L);
    }

    public final synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        Writer writer = this.journalWriter;
        Intrinsics.checkNotNull(writer);
        writer.flush();
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        if (!entry.getReadable()) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[0];
        try {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                inputStreamArr[i2] = new FileInputStream(entry.getCleanFile(i2));
            }
            this.redundantOpCount++;
            Writer writer = this.journalWriter;
            Intrinsics.checkNotNull(writer);
            writer.append((CharSequence) ("READ " + key));
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(this, key, entry.getSequenceNumber(), inputStreamArr, entry.getLengths());
        } catch (FileNotFoundException unused) {
            for (int i3 = 0; i3 < this.valueCount; i3++) {
                Util.INSTANCE.closeQuietly(inputStreamArr[i3]);
            }
            return null;
        }
    }

    @NotNull
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    public final ThreadPoolExecutor getExecutorService() {
        return this.executorService;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized boolean isClosed() {
        return this.journalWriter == null;
    }

    public final synchronized boolean remove(@NotNull String key) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            checkNotClosed();
            validateKey(key);
            Entry entry = this.lruEntries.get(key);
            if (entry != null && entry.getCurrentEditor() == null) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    File cleanFile = entry.getCleanFile(i2);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    this.size -= entry.getLengths()[i2];
                    entry.getLengths()[i2] = 0;
                }
                this.redundantOpCount++;
                Writer writer = this.journalWriter;
                Intrinsics.checkNotNull(writer);
                writer.append((CharSequence) ("REMOVE " + key + "\n"));
                this.lruEntries.remove(key);
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
        this.executorService.submit(this.cleanupCallable);
    }

    public final synchronized long size() {
        return this.size;
    }

    private AudioDiskLruCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupCallable = new Callable() { // from class: tm1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AudioDiskLruCache.cleanupCallable$lambda$1(this.f34841a);
            }
        };
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized Editor edit(String key, long expectedSequenceNumber) throws IOException {
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != -1 && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(this, key);
            this.lruEntries.put(key, entry);
        } else if (entry.getCurrentEditor() != null) {
            return null;
        }
        Editor editor = new Editor(this, entry);
        entry.setCurrentEditor(editor);
        Writer writer = this.journalWriter;
        Intrinsics.checkNotNull(writer);
        writer.write("DIRTY " + key + "\n");
        Writer writer2 = this.journalWriter;
        Intrinsics.checkNotNull(writer2);
        writer2.flush();
        return editor;
    }
}
