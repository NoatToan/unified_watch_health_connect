package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataRetriever {

    public static final class b {
        private static final int e = 0;
        private static final int f = 1;
        private static final int g = 2;
        private static final int h = 3;
        private final MediaSourceFactory a;
        private final HandlerThread b;
        private final HandlerWrapper c;
        private final SettableFuture<TrackGroupArray> d;

        public final class a implements Handler.Callback {
            private static final int e = 100;
            private final C0143a a = new C0143a();
            private MediaSource b;
            private MediaPeriod c;

            /* JADX INFO: renamed from: com.google.android.exoplayer2.MetadataRetriever$b$a$a, reason: collision with other inner class name */
            public final class C0143a implements MediaSource.MediaSourceCaller {
                private final C0144a a = new C0144a();
                private final Allocator b = new DefaultAllocator(true, 65536);
                private boolean c;

                /* JADX INFO: renamed from: com.google.android.exoplayer2.MetadataRetriever$b$a$a$a, reason: collision with other inner class name */
                public final class C0144a implements MediaPeriod.Callback {
                    private C0144a() {
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        b.this.c.obtainMessage(2).sendToTarget();
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        b.this.d.set(mediaPeriod.getTrackGroups());
                        b.this.c.obtainMessage(3).sendToTarget();
                    }
                }

                public C0143a() {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    a.this.c = source.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.b, 0L);
                    a.this.c.prepare(this.a, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message msg) {
                int i = msg.what;
                if (i == 0) {
                    MediaSource mediaSourceCreateMediaSource = b.this.a.createMediaSource((MediaItem) msg.obj);
                    this.b = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.a, null);
                    b.this.c.sendEmptyMessage(1);
                    return true;
                }
                if (i == 1) {
                    try {
                        MediaPeriod mediaPeriod = this.c;
                        if (mediaPeriod == null) {
                            ((MediaSource) Assertions.checkNotNull(this.b)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        b.this.c.sendEmptyMessageDelayed(1, 100);
                    } catch (Exception e2) {
                        b.this.d.setException(e2);
                        b.this.c.obtainMessage(3).sendToTarget();
                    }
                    return true;
                }
                if (i == 2) {
                    ((MediaPeriod) Assertions.checkNotNull(this.c)).continueLoading(0L);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                if (this.c != null) {
                    ((MediaSource) Assertions.checkNotNull(this.b)).releasePeriod(this.c);
                }
                ((MediaSource) Assertions.checkNotNull(this.b)).releaseSource(this.a);
                b.this.c.removeCallbacksAndMessages(null);
                b.this.b.quit();
                return true;
            }
        }

        public b(MediaSourceFactory mediaSourceFactory, Clock clock) {
            this.a = mediaSourceFactory;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.b = handlerThread;
            handlerThread.start();
            this.c = clock.createHandler(handlerThread.getLooper(), new a());
            this.d = SettableFuture.create();
        }

        public ListenableFuture<TrackGroupArray> e(MediaItem mediaItem) {
            this.c.obtainMessage(0, mediaItem).sendToTarget();
            return this.d;
        }
    }

    private MetadataRetriever() {
    }

    @VisibleForTesting
    public static ListenableFuture<TrackGroupArray> a(Context context, MediaItem mediaItem, Clock clock) {
        return b(new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static ListenableFuture<TrackGroupArray> b(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem, Clock clock) {
        return new b(mediaSourceFactory, clock).e(mediaItem);
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem) {
        return a(context, mediaItem, Clock.DEFAULT);
    }

    public static ListenableFuture<TrackGroupArray> retrieveMetadata(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem) {
        return b(mediaSourceFactory, mediaItem, Clock.DEFAULT);
    }
}
