package defpackage;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jqq<T> implements tqk<T, Bitmap> {
    public static final wbh<Long> d = wbh.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final wbh<Integer> e = wbh.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f f = new f();
    public static final List<String> g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f23032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f23033b;
    public final f c;

    public class a implements wbh.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f23034a = ByteBuffer.allocate(8);

        @Override // wbh.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f23034a) {
                this.f23034a.position(0);
                messageDigest.update(this.f23034a.putLong(l.longValue()).array());
            }
        }
    }

    public class b implements wbh.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f23035a = ByteBuffer.allocate(4);

        @Override // wbh.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f23035a) {
                this.f23035a.position(0);
                messageDigest.update(this.f23035a.putInt(num.intValue()).array());
            }
        }
    }

    @RequiresApi(16)
    public static final class c implements e<AssetFileDescriptor> {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // jqq.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // jqq.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @RequiresApi(23)
    public static final class d implements e<ByteBuffer> {

        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f23036a;

            public a(ByteBuffer byteBuffer) {
                this.f23036a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f23036a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f23036a.limit()) {
                    return -1;
                }
                this.f23036a.position((int) j);
                int iMin = Math.min(i2, this.f23036a.remaining());
                this.f23036a.get(bArr, i, iMin);
                return iMin;
            }
        }

        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // jqq.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // jqq.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    @VisibleForTesting
    public interface e<T> {
        @RequiresApi(16)
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @VisibleForTesting
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // jqq.e
        @RequiresApi(16)
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // jqq.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public jqq(cq2 cq2Var, e<T> eVar) {
        this(cq2Var, eVar, f);
    }

    @RequiresApi(16)
    public static tqk<AssetFileDescriptor, Bitmap> c(cq2 cq2Var) {
        return new jqq(cq2Var, new c(null));
    }

    @RequiresApi(api = 23)
    public static tqk<ByteBuffer, Bitmap> d(cq2 cq2Var) {
        return new jqq(cq2Var, new d());
    }

    @TargetApi(30)
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (NumberFormatException unused) {
            Log.isLoggable("VideoDecoder", 3);
        }
        return bitmap;
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fB = downsampleStrategy.b(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fB), Math.round(fB * i5));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    @RequiresApi(30)
    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i = Integer.parseInt(strExtractMetadata);
        return (i == 7 || i == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    @VisibleForTesting
    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i = Build.VERSION.SDK_INT;
        return i >= 30 && i < 33;
    }

    public static boolean k() {
        Iterator<String> it = g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static tqk<ParcelFileDescriptor, Bitmap> m(cq2 cq2Var) {
        return new jqq(cq2Var, new g());
    }

    @Override // defpackage.tqk
    public boolean a(T t, cch cchVar) {
        return true;
    }

    @Override // defpackage.tqk
    public kqk<Bitmap> b(T t, int i, int i2, cch cchVar) throws IOException {
        long jLongValue = ((Long) cchVar.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) cchVar.c(e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) cchVar.c(DownsampleStrategy.h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.c.a();
        try {
            this.f23032a.b(mediaMetadataRetrieverA, t);
            return gq2.c(f(t, mediaMetadataRetrieverA, jLongValue, num.intValue(), i, i2, downsampleStrategy2), this.f23033b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverA.release();
            } else {
                mediaMetadataRetrieverA.release();
            }
        }
    }

    public final Bitmap f(T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        if (l(t, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f) ? null : h(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j, i);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056 A[DONT_GENERATE] */
    public final boolean l(T t, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f23032a.a(mediaExtractor2, t);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable unused) {
                    mediaExtractor = mediaExtractor2;
                    Log.isLoggable("VideoDecoder", 3);
                }
                return false;
            } catch (Throwable unused2) {
            }
            Log.isLoggable("VideoDecoder", 3);
            return false;
        } finally {
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
    }

    @VisibleForTesting
    public jqq(cq2 cq2Var, e<T> eVar, f fVar) {
        this.f23033b = cq2Var;
        this.f23032a = eVar;
        this.c = fVar;
    }
}
