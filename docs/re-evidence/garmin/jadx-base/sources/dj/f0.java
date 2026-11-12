package dj;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class f0<T> implements ui.j<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ui.g<Long> f59822d = ui.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ui.g<Integer> f59823e = ui.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f59824f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<String> f59825g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f59826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.d f59827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f59828c;

    public class a implements ui.g.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f59829a = ByteBuffer.allocate(8);

        @Override // ui.g.b
        public final void a(byte[] bArr, Long l14, MessageDigest messageDigest) {
            Long l15 = l14;
            messageDigest.update(bArr);
            synchronized (this.f59829a) {
                this.f59829a.position(0);
                messageDigest.update(this.f59829a.putLong(l15.longValue()).array());
            }
        }
    }

    public class b implements ui.g.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f59830a = ByteBuffer.allocate(4);

        @Override // ui.g.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f59830a) {
                this.f59830a.position(0);
                messageDigest.update(this.f59830a.putInt(num2.intValue()).array());
            }
        }
    }

    public static final class d implements e<ByteBuffer> {
        @Override // dj.f0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new g0(this, byteBuffer));
        }

        @Override // dj.f0.e
        public final void b(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new g0(this, byteBuffer));
        }
    }

    public interface e<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t7);

        void b(MediaExtractor mediaExtractor, T t7);
    }

    public static class f {
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // dj.f0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // dj.f0.e
        public final void b(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public f0(xi.d dVar, e<T> eVar, f fVar) {
        this.f59827b = dVar;
        this.f59826a = eVar;
        this.f59828c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ui.j
    public final wi.u<Bitmap> a(T t7, int i14, int i15, ui.h hVar) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) hVar.c(f59822d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            vb.h.s(org.apache.commons.lang3.e.e(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) hVar.c(f59823e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f59842f);
        if (lVar == null) {
            lVar = l.f59841e;
        }
        l lVar2 = lVar;
        this.f59828c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z14 = false;
        try {
            this.f59826a.a(mediaMetadataRetriever, t7);
            Bitmap bitmapC = c(t7, mediaMetadataRetriever, jLongValue, num.intValue(), i14, i15, lVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z14) {
                                executorService.shutdownNow();
                                z14 = true;
                            }
                        }
                    }
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return dj.e.c(bitmapC, this.f59827b);
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z14) {
                                executorService2.shutdownNow();
                                z14 = true;
                            }
                        }
                    }
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th3;
        }
    }

    @Override // ui.j
    public final boolean b(T t7, ui.h hVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    public final Bitmap c(T t7, MediaMetadataRetriever mediaMetadataRetriever, long j8, int i14, int i15, int i16, l lVar) {
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if (MimeTypes.VIDEO_WEBM.equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f59826a.b(mediaExtractor, t7);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i26 = 0; i26 < trackCount; i26++) {
                            if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i26).getString("mime"))) {
                                mediaExtractor.release();
                                vb.h.z("Cannot decode VP8 video on CrOS.");
                                return null;
                            }
                        }
                    } catch (Throwable unused) {
                        if (mediaExtractor != null) {
                        }
                        if (i15 != Integer.MIN_VALUE) {
                            try {
                                i19 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i24 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i25 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i25 != 90) {
                                    i24 = i19;
                                    i19 = i24;
                                } else {
                                    i24 = i19;
                                    i19 = i24;
                                }
                                float fB = lVar.b(i19, i24, i15, i16);
                                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j8, i14, Math.round(i19 * fB), Math.round(fB * i24));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j8, i14);
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i17 = Build.VERSION.SDK_INT;
                            if (i17 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i18 = Integer.parseInt(strExtractMetadata);
                                    int i27 = Integer.parseInt(strExtractMetadata2);
                                    if (i18 != 7) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                    } else {
                                        Matrix matrix2 = new Matrix();
                                        matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        } else {
                            i17 = Build.VERSION.SDK_INT;
                            if (i17 >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i18 = Integer.parseInt(strExtractMetadata3);
                                int i28 = Integer.parseInt(strExtractMetadata4);
                                if (i18 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            return bitmapCreateBitmap;
                        }
                        throw new h();
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (i15 != Integer.MIN_VALUE && i16 != Integer.MIN_VALUE && lVar != l.f59840d) {
            i19 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i24 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i25 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i25 != 90 || i25 == 270) {
                i24 = i19;
                i19 = i24;
            }
            float fB2 = lVar.b(i19, i24, i15, i16);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j8, i14, Math.round(i19 * fB2), Math.round(fB2 * i24));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j8, i14);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i17 = Build.VERSION.SDK_INT;
            if (i17 >= 30 && i17 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i18 = Integer.parseInt(strExtractMetadata5);
                int i29 = Integer.parseInt(strExtractMetadata6);
                if ((i18 != 7 || i18 == 6) && i29 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator<String> it = f59825g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith(it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i18 = Integer.parseInt(strExtractMetadata7);
            int i210 = Integer.parseInt(strExtractMetadata8);
            if (i18 != 7) {
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new h();
    }

    public static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        @Override // dj.f0.e
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // dj.f0.e
        public final void b(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public f0(xi.d dVar, e<T> eVar) {
        this(dVar, eVar, f59824f);
    }
}
