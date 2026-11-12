package androidx.media3.transformer;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.ConstantRateTimestampIterator;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.FutureCallback;
import defpackage.aqt;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public final class ImageAssetLoader implements AssetLoader {
    private static final int QUEUE_BITMAP_INTERVAL_MS = 10;
    private final BitmapLoader bitmapLoader;
    private final EditedMediaItem editedMediaItem;
    private final AssetLoader.Listener listener;
    private volatile int progress;
    private int progressState;
    private final boolean retainHdrFromUltraHdrImage;
    private SampleConsumer sampleConsumer;
    private final ScheduledExecutorService scheduledExecutorService;

    /* synthetic */ ImageAssetLoader(EditedMediaItem editedMediaItem, AssetLoader.Listener listener, BitmapLoader bitmapLoader, boolean z, AnonymousClass1 anonymousClass1) {
        this(editedMediaItem, listener, bitmapLoader, z);
    }

    public static final class Factory implements AssetLoader.Factory {
        private final BitmapLoader bitmapLoader;

        public Factory(BitmapLoader bitmapLoader) {
            this.bitmapLoader = bitmapLoader;
        }

        @Override // androidx.media3.transformer.AssetLoader.Factory
        public AssetLoader createAssetLoader(EditedMediaItem editedMediaItem, Looper looper, AssetLoader.Listener listener, AssetLoader.CompositionSettings compositionSettings) {
            return new ImageAssetLoader(editedMediaItem, listener, this.bitmapLoader, compositionSettings.retainHdrFromUltraHdrImage, null);
        }
    }

    private ImageAssetLoader(EditedMediaItem editedMediaItem, AssetLoader.Listener listener, BitmapLoader bitmapLoader, boolean z) {
        this.retainHdrFromUltraHdrImage = z;
        Assertions.checkState(editedMediaItem.durationUs != C.TIME_UNSET);
        Assertions.checkState(editedMediaItem.frameRate != -2147483647);
        this.editedMediaItem = editedMediaItem;
        this.listener = listener;
        this.bitmapLoader = bitmapLoader;
        this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        this.progressState = 0;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.progressState = 2;
        this.listener.onDurationUs(this.editedMediaItem.durationUs);
        this.listener.onTrackCount(1);
        aqt.e(this.bitmapLoader.loadBitmap(((MediaItem.LocalConfiguration) Assertions.checkNotNull(this.editedMediaItem.mediaItem.localConfiguration)).uri), new AnonymousClass1(), this.scheduledExecutorService);
    }

    /* JADX INFO: renamed from: androidx.media3.transformer.ImageAssetLoader$1, reason: invalid class name */
    class AnonymousClass1 implements FutureCallback<Bitmap> {
        AnonymousClass1() {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final Bitmap bitmap) {
            ImageAssetLoader.this.progress = 50;
            Format formatBuild = new Format.Builder().setHeight(bitmap.getHeight()).setWidth(bitmap.getWidth()).setSampleMimeType(MimeTypes.IMAGE_RAW).setColorInfo(ColorInfo.SRGB_BT709_FULL).build();
            final Format formatBuild2 = (ImageAssetLoader.this.retainHdrFromUltraHdrImage && Util.SDK_INT >= 34 && bitmap.hasGainmap()) ? formatBuild.buildUpon().setSampleMimeType(MimeTypes.IMAGE_JPEG_R).build() : formatBuild;
            try {
                ImageAssetLoader.this.listener.onTrackAdded(formatBuild, 2);
                ImageAssetLoader.this.scheduledExecutorService.submit(new Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m677x43001df4(bitmap, formatBuild2);
                    }
                });
            } catch (RuntimeException e) {
                ImageAssetLoader.this.listener.onError(ExportException.createForAssetLoader(e, 1000));
            }
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$androidx-media3-transformer-ImageAssetLoader$1, reason: not valid java name */
        /* synthetic */ void m677x43001df4(Bitmap bitmap, Format format) {
            ImageAssetLoader.this.m676x5369e40d(bitmap, format);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th) {
            ImageAssetLoader.this.listener.onError(ExportException.createForAssetLoader(th, 2000));
        }
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(ProgressHolder progressHolder) {
        if (this.progressState == 2) {
            progressHolder.progress = this.progress;
        }
        return this.progressState;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public ImmutableMap<Integer, String> getDecoderNames() {
        return ImmutableMap.of();
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void release() {
        this.progressState = 0;
        this.scheduledExecutorService.shutdownNow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queueBitmapInternal, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m676x5369e40d(final Bitmap bitmap, final Format format) {
        try {
            SampleConsumer sampleConsumer = this.sampleConsumer;
            if (sampleConsumer == null) {
                this.sampleConsumer = this.listener.onOutputFormat(format);
                this.scheduledExecutorService.schedule(new Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m675x99f2566e(bitmap, format);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            int iQueueInputBitmap = sampleConsumer.queueInputBitmap(bitmap, new ConstantRateTimestampIterator(this.editedMediaItem.durationUs, this.editedMediaItem.frameRate));
            if (iQueueInputBitmap == 1) {
                this.progress = 100;
                this.sampleConsumer.signalEndOfVideoInput();
            } else if (iQueueInputBitmap == 2) {
                this.scheduledExecutorService.schedule(new Runnable() { // from class: androidx.media3.transformer.ImageAssetLoader$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m676x5369e40d(bitmap, format);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (iQueueInputBitmap == 3) {
                    this.progress = 100;
                    return;
                }
                throw new IllegalStateException();
            }
        } catch (ExportException e) {
            this.listener.onError(e);
        } catch (RuntimeException e2) {
            this.listener.onError(ExportException.createForAssetLoader(e2, 1000));
        }
    }
}
