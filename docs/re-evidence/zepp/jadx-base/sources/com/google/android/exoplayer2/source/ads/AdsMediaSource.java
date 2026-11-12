package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId v = new MediaSource.MediaPeriodId(new Object());
    private final MediaSource j;
    private final MediaSourceFactory k;
    private final AdsLoader l;
    private final AdViewProvider m;
    private final DataSpec n;
    private final Object o;

    @Nullable
    private c r;

    @Nullable
    private Timeline s;

    @Nullable
    private AdPlaybackState t;
    private final Handler p = new Handler(Looper.getMainLooper());
    private final Timeline.Period q = new Timeline.Period();
    private a[][] u = new a[0][];

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int type, Exception cause) {
            super(cause);
            this.type = type;
        }

        public static AdLoadException createForAd(Exception error) {
            return new AdLoadException(0, error);
        }

        public static AdLoadException createForAdGroup(Exception error, int adGroupIndex) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Failed to load ad group ");
            sb.append(adGroupIndex);
            return new AdLoadException(1, new IOException(sb.toString(), error));
        }

        public static AdLoadException createForAllAds(Exception error) {
            return new AdLoadException(2, error);
        }

        public static AdLoadException createForUnexpected(RuntimeException error) {
            return new AdLoadException(3, error);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) Assertions.checkNotNull(getCause());
        }
    }

    public final class a {
        private final MediaSource.MediaPeriodId a;
        private final List<MaskingMediaPeriod> b = new ArrayList();
        private Uri c;
        private MediaSource d;
        private Timeline e;

        public a(MediaSource.MediaPeriodId id) {
            this.a = id;
        }

        public MediaPeriod a(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(id, allocator, startPositionUs);
            this.b.add(maskingMediaPeriod);
            MediaSource mediaSource = this.d;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new b((Uri) Assertions.checkNotNull(this.c)));
            }
            Timeline timeline = this.e;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), id.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public long b() {
            Timeline timeline = this.e;
            return timeline == null ? C.TIME_UNSET : timeline.getPeriod(0, AdsMediaSource.this.q).getDurationUs();
        }

        public void c(Timeline timeline) {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            if (this.e == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < this.b.size(); i++) {
                    MaskingMediaPeriod maskingMediaPeriod = this.b.get(i);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.id.windowSequenceNumber));
                }
            }
            this.e = timeline;
        }

        public boolean d() {
            return this.d != null;
        }

        public void e(MediaSource adMediaSource, Uri adUri) {
            this.d = adMediaSource;
            this.c = adUri;
            for (int i = 0; i < this.b.size(); i++) {
                MaskingMediaPeriod maskingMediaPeriod = this.b.get(i);
                maskingMediaPeriod.setMediaSource(adMediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new b(adUri));
            }
            AdsMediaSource.this.prepareChildSource(this.a, adMediaSource);
        }

        public boolean f() {
            return this.b.isEmpty();
        }

        public void g() {
            if (d()) {
                AdsMediaSource.this.releaseChildSource(this.a);
            }
        }

        public void h(MaskingMediaPeriod maskingMediaPeriod) {
            this.b.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }
    }

    public final class b implements MaskingMediaPeriod.PrepareListener {
        private final Uri a;

        public b(Uri adUri) {
            this.a = adUri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.l.handlePrepareComplete(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource.this.l.handlePrepareError(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(mediaPeriodId);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final MediaSource.MediaPeriodId mediaPeriodId, final IOException exception) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), new DataSpec(this.a), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(exception), true);
            AdsMediaSource.this.p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(mediaPeriodId, exception);
                }
            });
        }
    }

    public final class c implements AdsLoader.EventListener {
        private final Handler a = Util.createHandlerForCurrentLooper();
        private volatile boolean b;

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdPlaybackState adPlaybackState) {
            if (this.b) {
                return;
            }
            AdsMediaSource.this.r(adPlaybackState);
        }

        public void c() {
            this.b = true;
            this.a.removeCallbacksAndMessages(null);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
            com.google.android.exoplayer2.source.ads.a.a(this);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(final AdLoadException error, DataSpec dataSpec) {
            if (this.b) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) error, true);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.b) {
                return;
            }
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(adPlaybackState);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
            com.google.android.exoplayer2.source.ads.a.d(this);
        }
    }

    public AdsMediaSource(MediaSource contentMediaSource, DataSpec adTagDataSpec, Object adsId, MediaSourceFactory adMediaSourceFactory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this.j = contentMediaSource;
        this.k = adMediaSourceFactory;
        this.l = adsLoader;
        this.m = adViewProvider;
        this.n = adTagDataSpec;
        this.o = adsId;
        adsLoader.setSupportedContentTypes(adMediaSourceFactory.getSupportedTypes());
    }

    private long[][] m() {
        long[][] jArr = new long[this.u.length][];
        int i = 0;
        while (true) {
            a[][] aVarArr = this.u;
            if (i >= aVarArr.length) {
                return jArr;
            }
            jArr[i] = new long[aVarArr[i].length];
            int i2 = 0;
            while (true) {
                a[][] aVarArr2 = this.u;
                if (i2 < aVarArr2[i].length) {
                    a aVar = aVarArr2[i][i2];
                    jArr[i][i2] = aVar == null ? C.TIME_UNSET : aVar.b();
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(c cVar) {
        this.l.start(this, this.n, this.o, this.m, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(c cVar) {
        this.l.stop(this, cVar);
    }

    private void p() {
        Uri uri;
        MediaItem.DrmConfiguration drmConfiguration;
        AdPlaybackState adPlaybackState = this.t;
        if (adPlaybackState == null) {
            return;
        }
        for (int i = 0; i < this.u.length; i++) {
            int i2 = 0;
            while (true) {
                a[][] aVarArr = this.u;
                if (i2 < aVarArr[i].length) {
                    a aVar = aVarArr[i][i2];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    if (aVar != null && !aVar.d()) {
                        Uri[] uriArr = adGroup.uris;
                        if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                            MediaItem.Builder uri2 = new MediaItem.Builder().setUri(uri);
                            MediaItem.PlaybackProperties playbackProperties = this.j.getMediaItem().playbackProperties;
                            if (playbackProperties != null && (drmConfiguration = playbackProperties.drmConfiguration) != null) {
                                uri2.setDrmUuid(drmConfiguration.uuid);
                                uri2.setDrmKeySetId(drmConfiguration.getKeySetId());
                                uri2.setDrmLicenseUri(drmConfiguration.licenseUri);
                                uri2.setDrmForceDefaultLicenseUri(drmConfiguration.forceDefaultLicenseUri);
                                uri2.setDrmLicenseRequestHeaders(drmConfiguration.requestHeaders);
                                uri2.setDrmMultiSession(drmConfiguration.multiSession);
                                uri2.setDrmPlayClearContentWithoutKey(drmConfiguration.playClearContentWithoutKey);
                                uri2.setDrmSessionForClearTypes(drmConfiguration.sessionForClearTypes);
                            }
                            aVar.e(this.k.createMediaSource(uri2.build()), uri);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    private void q() {
        Timeline timeline = this.s;
        AdPlaybackState adPlaybackState = this.t;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.t = adPlaybackState.withAdDurationsUs(m());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.t;
        if (adPlaybackState2 == null) {
            a[][] aVarArr = new a[adPlaybackState.adGroupCount][];
            this.u = aVarArr;
            Arrays.fill(aVarArr, new a[0]);
        } else {
            Assertions.checkState(adPlaybackState.adGroupCount == adPlaybackState2.adGroupCount);
        }
        this.t = adPlaybackState;
        p();
        q();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        if (((AdPlaybackState) Assertions.checkNotNull(this.t)).adGroupCount <= 0 || !id.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(id, allocator, startPositionUs);
            maskingMediaPeriod.setMediaSource(this.j);
            maskingMediaPeriod.createPeriod(id);
            return maskingMediaPeriod;
        }
        int i = id.adGroupIndex;
        int i2 = id.adIndexInAdGroup;
        a[][] aVarArr = this.u;
        if (aVarArr[i].length <= i2) {
            aVarArr[i] = (a[]) Arrays.copyOf(aVarArr[i], i2 + 1);
        }
        a aVar = this.u[i][i2];
        if (aVar == null) {
            aVar = new a(id);
            this.u[i][i2] = aVar;
            p();
        }
        return aVar.a(id, allocator, startPositionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.j.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        final c cVar = new c();
        this.r = cVar;
        prepareChildSource(v, this.j);
        this.p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        a aVar = (a) Assertions.checkNotNull(this.u[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
        aVar.h(maskingMediaPeriod);
        if (aVar.f()) {
            aVar.g();
            this.u[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        final c cVar = (c) Assertions.checkNotNull(this.r);
        this.r = null;
        cVar.c();
        this.s = null;
        this.t = null;
        this.u = new a[0][];
        this.p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o(cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId childId, MediaSource.MediaPeriodId mediaPeriodId) {
        return childId.isAd() ? childId : mediaPeriodId;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((a) Assertions.checkNotNull(this.u[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).c(timeline);
        } else {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.s = timeline;
        }
        q();
    }
}
