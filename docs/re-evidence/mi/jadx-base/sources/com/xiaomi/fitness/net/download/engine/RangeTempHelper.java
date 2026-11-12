package com.xiaomi.fitness.net.download.engine;

import android.util.Pair;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.utils.HttpUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.api.b;
import defpackage.prk;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u000232B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b0\u00101J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00072\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u000e2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001e\u0010*\u001a\f\u0012\b\u0012\u00060)R\u00020\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u0010/\u001a\f\u0012\b\u0012\u00060)R\u00020\u00000,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;", "", "Lokio/BufferedSink;", "sink", "", "totalSize", "sliceCount", "", "writeHeader", "(Lokio/BufferedSink;JJ)V", "buffer", "rangeSize", "writeContent", "(Lokio/BufferedSink;JJJ)V", "", "check", "(JJ)Z", "Lokio/BufferedSource;", "bufferedSource", "readContent", "(Lokio/BufferedSource;J)V", "readHeader", "(Lokio/BufferedSource;)V", "downloadSize", "()J", "Lprk;", b.I, "write", "(Lprk;)V", "read", "(Lprk;)Z", "Landroid/util/Pair;", "lastProgress", "()Landroid/util/Pair;", "Ljava/io/File;", "mTmp", "Ljava/io/File;", "mTotalSize", "J", "mSliceCount", "", "Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;", "mSegments", "Ljava/util/List;", "", "getSegments", "()Ljava/util/List;", "segments", "<init>", "(Ljava/io/File;)V", "Companion", "Segment", "net_release"}, k = 1, mv = {2, 0, 0})
public final class RangeTempHelper {

    @NotNull
    private static final String FILE_HEADER_MAGIC_NUMBER = "a1b2c3d4e5f6";
    private static final long FILE_HEADER_MAGIC_NUMBER_SIZE = 6;
    private static final long FILE_HEADER_SIZE = 22;
    private static final long RANGE_SIZE = 5242880;
    public static final long SEGMENT_SIZE = 32;

    @NotNull
    private final List<Segment> mSegments;
    private long mSliceCount;

    @NotNull
    private final File mTmp;
    private long mTotalSize;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0012\u0010\u0018\u001a\u00060\u0000R\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;", "", "<init>", "(Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;)V", "index", "", StatConstants.PARAM_START, "current", StatConstants.PARAM_END, "(Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;JJJJ)V", "getIndex", "()J", "setIndex", "(J)V", "getStart", "setStart", "getCurrent", "setCurrent", "getEnd", "setEnd", "write", "", "sink", "Lokio/BufferedSink;", "read", "Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;", "source", "Lokio/BufferedSource;", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "", "()Z", "completeSize", "startByte", "remainSize", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Segment {
        private long current;
        private long end;
        private long index;
        private long start;

        public Segment() {
        }

        public final long completeSize() {
            return this.current - this.start;
        }

        public final long getCurrent() {
            return this.current;
        }

        public final long getEnd() {
            return this.end;
        }

        public final long getIndex() {
            return this.index;
        }

        public final long getStart() {
            return this.start;
        }

        public final boolean isComplete() {
            return this.current - this.end == 1;
        }

        @NotNull
        public final Segment read(@NotNull BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            Buffer buffer = new Buffer();
            try {
                source.readFully(buffer, 32L);
                this.index = buffer.readLong();
                this.start = buffer.readLong();
                this.current = buffer.readLong();
                this.end = buffer.readLong();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return this;
        }

        public final long remainSize() {
            return (this.end - this.current) + 1;
        }

        public final void setCurrent(long j) {
            this.current = j;
        }

        public final void setEnd(long j) {
            this.end = j;
        }

        public final void setIndex(long j) {
            this.index = j;
        }

        public final void setStart(long j) {
            this.start = j;
        }

        public final long startByte() {
            return (this.index * 32) + RangeTempHelper.FILE_HEADER_SIZE;
        }

        public final void write(@Nullable BufferedSink sink) {
            try {
                Intrinsics.checkNotNull(sink);
                sink.writeLong(this.index);
                sink.writeLong(this.start);
                sink.writeLong(this.current);
                sink.writeLong(this.end);
                sink.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Segment(long j, long j2, long j3, long j4) {
            this.index = j;
            this.start = j2;
            this.current = j3;
            this.end = j4;
        }
    }

    public RangeTempHelper(@NotNull File mTmp) {
        Intrinsics.checkNotNullParameter(mTmp, "mTmp");
        this.mTmp = mTmp;
        this.mSegments = new ArrayList();
    }

    private final boolean check(long totalSize, long sliceCount) {
        return this.mTotalSize == totalSize && this.mSliceCount == sliceCount;
    }

    private final long downloadSize() {
        Iterator<Segment> it = this.mSegments.iterator();
        long jCompleteSize = 0;
        while (it.hasNext()) {
            jCompleteSize += it.next().completeSize();
        }
        return jCompleteSize;
    }

    private final void readContent(BufferedSource bufferedSource, long sliceCount) {
        this.mSegments.clear();
        for (long j = 0; j < sliceCount; j++) {
            this.mSegments.add(new Segment().read(bufferedSource));
        }
    }

    private final void readHeader(BufferedSource bufferedSource) {
        try {
            Intrinsics.checkNotNull(bufferedSource);
            if (!Intrinsics.areEqual(FILE_HEADER_MAGIC_NUMBER, bufferedSource.readByteString(6L).hex())) {
                Logger.d("this is not a temp file, create new.", new Object[0]);
            } else {
                this.mTotalSize = bufferedSource.readLong();
                this.mSliceCount = bufferedSource.readLong();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final void writeContent(BufferedSink buffer, long totalSize, long sliceCount, long rangeSize) {
        RangeTempHelper rangeTempHelper = this;
        rangeTempHelper.mSegments.clear();
        long j = 0;
        long j2 = 0;
        while (j < sliceCount) {
            rangeTempHelper.mSegments.add(new Segment(j, j2, j2, j == sliceCount - 1 ? totalSize - 1 : (j2 + rangeSize) - 1));
            j2 += rangeSize;
            j++;
            rangeTempHelper = this;
        }
        Iterator<Segment> it = rangeTempHelper.mSegments.iterator();
        while (it.hasNext()) {
            it.next().write(buffer);
        }
    }

    private final void writeHeader(BufferedSink sink, long totalSize, long sliceCount) {
        this.mTotalSize = totalSize;
        this.mSliceCount = sliceCount;
        try {
            sink.write(ByteString.INSTANCE.decodeHex(FILE_HEADER_MAGIC_NUMBER));
            sink.writeLong(totalSize);
            sink.writeLong(sliceCount);
            sink.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.mSegments;
    }

    @NotNull
    public final Pair<Long, Long> lastProgress() {
        return new Pair<>(Long.valueOf(downloadSize()), Long.valueOf(this.mTotalSize));
    }

    public final boolean read(@NotNull prk<?> response) throws Throwable {
        Closeable closeable;
        Intrinsics.checkNotNullParameter(response, "response");
        HttpUtil httpUtil = HttpUtil.INSTANCE;
        long contentLength = httpUtil.getContentLength(response);
        long sliceCount = httpUtil.getSliceCount(response, RANGE_SIZE);
        Closeable closeable2 = null;
        bufferedSourceBuffer = null;
        BufferedSource bufferedSourceBuffer = null;
        closeable2 = null;
        try {
            Source source = Okio.source(this.mTmp);
            try {
                bufferedSourceBuffer = Okio.buffer(source);
                readHeader(bufferedSourceBuffer);
                readContent(bufferedSourceBuffer, sliceCount);
                IOExtKt.closeSilently(this, source, bufferedSourceBuffer);
            } catch (FileNotFoundException e) {
                e = e;
                closeable = bufferedSourceBuffer;
                closeable2 = source;
                try {
                    e.printStackTrace();
                    IOExtKt.closeSilently(this, closeable2, closeable);
                } catch (Throwable th) {
                    th = th;
                    IOExtKt.closeSilently(this, closeable2, closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = bufferedSourceBuffer;
                closeable2 = source;
                IOExtKt.closeSilently(this, closeable2, closeable);
                throw th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            closeable = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
        return check(contentLength, sliceCount);
    }

    public final void write(@NotNull prk<?> response) throws Throwable {
        BufferedSink bufferedSinkBuffer;
        Intrinsics.checkNotNullParameter(response, "response");
        HttpUtil httpUtil = HttpUtil.INSTANCE;
        long contentLength = httpUtil.getContentLength(response);
        long sliceCount = httpUtil.getSliceCount(response, RANGE_SIZE);
        Sink sink = null;
        try {
            Sink sinkSink$default = Okio__JvmOkioKt.sink$default(this.mTmp, false, 1, null);
            try {
                bufferedSinkBuffer = Okio.buffer(sinkSink$default);
                try {
                    writeHeader(bufferedSinkBuffer, contentLength, sliceCount);
                    writeContent(bufferedSinkBuffer, contentLength, sliceCount, RANGE_SIZE);
                    IOExtKt.closeSilently(this, sinkSink$default, bufferedSinkBuffer);
                } catch (FileNotFoundException e) {
                    e = e;
                    sink = sinkSink$default;
                    try {
                        e.printStackTrace();
                        IOExtKt.closeSilently(this, sink, bufferedSinkBuffer);
                    } catch (Throwable th) {
                        th = th;
                        IOExtKt.closeSilently(this, sink, bufferedSinkBuffer);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sink = sinkSink$default;
                    IOExtKt.closeSilently(this, sink, bufferedSinkBuffer);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
                bufferedSinkBuffer = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedSinkBuffer = null;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            bufferedSinkBuffer = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedSinkBuffer = null;
        }
    }
}
