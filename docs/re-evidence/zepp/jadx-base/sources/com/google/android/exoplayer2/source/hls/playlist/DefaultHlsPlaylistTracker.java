package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final HlsPlaylistTracker.Factory FACTORY = new HlsPlaylistTracker.Factory() { // from class: w51
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory
        public final HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
            return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
        }
    };
    private final HlsDataSourceFactory a;
    private final HlsPlaylistParserFactory b;
    private final LoadErrorHandlingPolicy c;
    private final HashMap<Uri, c> d;
    private final CopyOnWriteArrayList<HlsPlaylistTracker.PlaylistEventListener> e;
    private final double f;

    @Nullable
    private MediaSourceEventListener.EventDispatcher g;

    @Nullable
    private Loader h;

    @Nullable
    private Handler i;

    @Nullable
    private HlsPlaylistTracker.PrimaryPlaylistListener j;

    @Nullable
    private HlsMasterPlaylist k;

    @Nullable
    private Uri l;

    @Nullable
    private HlsMediaPlaylist m;
    private boolean n;
    private long o;

    public class b implements HlsPlaylistTracker.PlaylistEventListener {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
            DefaultHlsPlaylistTracker.this.e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(Uri url, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
            c cVar;
            if (DefaultHlsPlaylistTracker.this.m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<HlsMasterPlaylist.Variant> list = ((HlsMasterPlaylist) Util.castNonNull(DefaultHlsPlaylistTracker.this.k)).variants;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    c cVar2 = (c) DefaultHlsPlaylistTracker.this.d.get(list.get(i2).url);
                    if (cVar2 != null && jElapsedRealtime < cVar2.h) {
                        i++;
                    }
                }
                LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = DefaultHlsPlaylistTracker.this.c.getFallbackSelectionFor(new LoadErrorHandlingPolicy.FallbackOptions(1, 0, DefaultHlsPlaylistTracker.this.k.variants.size(), i), loadErrorInfo);
                if (fallbackSelectionFor != null && fallbackSelectionFor.type == 2 && (cVar = (c) DefaultHlsPlaylistTracker.this.d.get(url)) != null) {
                    cVar.h(fallbackSelectionFor.exclusionDurationMs);
                }
            }
            return false;
        }
    }

    public final class c implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {
        private static final String l = "_HLS_msn";
        private static final String m = "_HLS_part";
        private static final String n = "_HLS_skip";
        private final Uri a;
        private final Loader b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final DataSource c;

        @Nullable
        private HlsMediaPlaylist d;
        private long e;
        private long f;
        private long g;
        private long h;
        private boolean i;

        @Nullable
        private IOException j;

        public c(Uri playlistUrl) {
            this.a = playlistUrl;
            this.c = DefaultHlsPlaylistTracker.this.a.createDataSource(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long exclusionDurationMs) {
            this.h = SystemClock.elapsedRealtime() + exclusionDurationMs;
            return this.a.equals(DefaultHlsPlaylistTracker.this.l) && !DefaultHlsPlaylistTracker.this.w();
        }

        private Uri i() {
            HlsMediaPlaylist hlsMediaPlaylist = this.d;
            if (hlsMediaPlaylist != null) {
                HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
                if (serverControl.skipUntilUs != C.TIME_UNSET || serverControl.canBlockReload) {
                    Uri.Builder builderBuildUpon = this.a.buildUpon();
                    HlsMediaPlaylist hlsMediaPlaylist2 = this.d;
                    if (hlsMediaPlaylist2.serverControl.canBlockReload) {
                        builderBuildUpon.appendQueryParameter(l, String.valueOf(hlsMediaPlaylist2.mediaSequence + ((long) hlsMediaPlaylist2.segments.size())));
                        HlsMediaPlaylist hlsMediaPlaylist3 = this.d;
                        if (hlsMediaPlaylist3.partTargetDurationUs != C.TIME_UNSET) {
                            List<HlsMediaPlaylist.Part> list = hlsMediaPlaylist3.trailingParts;
                            int size = list.size();
                            if (!list.isEmpty() && ((HlsMediaPlaylist.Part) Iterables.getLast(list)).isPreload) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter(m, String.valueOf(size));
                        }
                    }
                    HlsMediaPlaylist.ServerControl serverControl2 = this.d.serverControl;
                    if (serverControl2.skipUntilUs != C.TIME_UNSET) {
                        builderBuildUpon.appendQueryParameter(n, serverControl2.canSkipDateRanges ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Uri uri) {
            this.i = false;
            n(uri);
        }

        private void n(Uri playlistRequestUri) {
            ParsingLoadable parsingLoadable = new ParsingLoadable(this.c, playlistRequestUri, 4, DefaultHlsPlaylistTracker.this.b.createPlaylistParser(DefaultHlsPlaylistTracker.this.k, this.d));
            DefaultHlsPlaylistTracker.this.g.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.b.startLoading(parsingLoadable, this, DefaultHlsPlaylistTracker.this.c.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(final Uri playlistRequestUri) {
            this.h = 0L;
            if (this.i || this.b.isLoading() || this.b.hasFatalError()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.g) {
                n(playlistRequestUri);
            } else {
                this.i = true;
                DefaultHlsPlaylistTracker.this.i.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(playlistRequestUri);
                    }
                }, this.g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(HlsMediaPlaylist loadedPlaylist, LoadEventInfo loadEventInfo) {
            IOException playlistStuckException;
            boolean z;
            HlsMediaPlaylist hlsMediaPlaylist = this.d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.e = jElapsedRealtime;
            HlsMediaPlaylist hlsMediaPlaylistR = DefaultHlsPlaylistTracker.this.r(hlsMediaPlaylist, loadedPlaylist);
            this.d = hlsMediaPlaylistR;
            if (hlsMediaPlaylistR != hlsMediaPlaylist) {
                this.j = null;
                this.f = jElapsedRealtime;
                DefaultHlsPlaylistTracker.this.z(this.a, hlsMediaPlaylistR);
            } else if (!hlsMediaPlaylistR.hasEndTag) {
                long size = loadedPlaylist.mediaSequence + ((long) loadedPlaylist.segments.size());
                HlsMediaPlaylist hlsMediaPlaylist2 = this.d;
                if (size < hlsMediaPlaylist2.mediaSequence) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.a);
                    z = true;
                } else {
                    playlistStuckException = ((double) (jElapsedRealtime - this.f)) > ((double) C.usToMs(hlsMediaPlaylist2.targetDurationUs)) * DefaultHlsPlaylistTracker.this.f ? new HlsPlaylistTracker.PlaylistStuckException(this.a) : null;
                    z = false;
                }
                if (playlistStuckException != null) {
                    this.j = playlistStuckException;
                    DefaultHlsPlaylistTracker.this.y(this.a, new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(4), playlistStuckException, 1), z);
                }
            }
            long j = 0;
            HlsMediaPlaylist hlsMediaPlaylist3 = this.d;
            if (!hlsMediaPlaylist3.serverControl.canBlockReload) {
                j = hlsMediaPlaylist3 != hlsMediaPlaylist ? hlsMediaPlaylist3.targetDurationUs : hlsMediaPlaylist3.targetDurationUs / 2;
            }
            this.g = jElapsedRealtime + C.usToMs(j);
            if (!(this.d.partTargetDurationUs != C.TIME_UNSET || this.a.equals(DefaultHlsPlaylistTracker.this.l)) || this.d.hasEndTag) {
                return;
            }
            o(i());
        }

        @Nullable
        public HlsMediaPlaylist j() {
            return this.d;
        }

        public boolean k() {
            int i;
            if (this.d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, C.usToMs(this.d.durationUs));
            HlsMediaPlaylist hlsMediaPlaylist = this.d;
            return hlsMediaPlaylist.hasEndTag || (i = hlsMediaPlaylist.playlistType) == 2 || i == 1 || this.e + jMax > jElapsedRealtime;
        }

        public void m() {
            o(this.a);
        }

        public void p() throws IOException {
            this.b.maybeThrowError();
            IOException iOException = this.j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onLoadCanceled(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
            LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
            DefaultHlsPlaylistTracker.this.c.onLoadTaskConcluded(loadable.loadTaskId);
            DefaultHlsPlaylistTracker.this.g.loadCanceled(loadEventInfo, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void onLoadCompleted(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
            HlsPlaylist result = loadable.getResult();
            LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
            if (result instanceof HlsMediaPlaylist) {
                t((HlsMediaPlaylist) result, loadEventInfo);
                DefaultHlsPlaylistTracker.this.g.loadCompleted(loadEventInfo, 4);
            } else {
                this.j = ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                DefaultHlsPlaylistTracker.this.g.loadError(loadEventInfo, 4, this.j, true);
            }
            DefaultHlsPlaylistTracker.this.c.onLoadTaskConcluded(loadable.loadTaskId);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            Loader.LoadErrorAction loadErrorActionCreateRetryAction;
            LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
            boolean z = error instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((loadable.getUri().getQueryParameter(l) != null) || z) {
                int i = error instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) error).responseCode : Integer.MAX_VALUE;
                if (z || i == 400 || i == 503) {
                    this.g = SystemClock.elapsedRealtime();
                    m();
                    ((MediaSourceEventListener.EventDispatcher) Util.castNonNull(DefaultHlsPlaylistTracker.this.g)).loadError(loadEventInfo, loadable.type, error, true);
                    return Loader.DONT_RETRY;
                }
            }
            LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type), error, errorCount);
            if (DefaultHlsPlaylistTracker.this.y(this.a, loadErrorInfo, false)) {
                long retryDelayMsFor = DefaultHlsPlaylistTracker.this.c.getRetryDelayMsFor(loadErrorInfo);
                loadErrorActionCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
            } else {
                loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
            }
            boolean zIsRetry = true ^ loadErrorActionCreateRetryAction.isRetry();
            DefaultHlsPlaylistTracker.this.g.loadError(loadEventInfo, loadable.type, error, zIsRetry);
            if (zIsRetry) {
                DefaultHlsPlaylistTracker.this.c.onLoadTaskConcluded(loadable.loadTaskId);
            }
            return loadErrorActionCreateRetryAction;
        }

        public void u() {
            this.b.release();
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory dataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory playlistParserFactory) {
        this(dataSourceFactory, loadErrorHandlingPolicy, playlistParserFactory, 3.5d);
    }

    private void p(List<Uri> urls) {
        int size = urls.size();
        for (int i = 0; i < size; i++) {
            Uri uri = urls.get(i);
            this.d.put(uri, new c(uri));
        }
    }

    private static HlsMediaPlaylist.Segment q(HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
        int i = (int) (loadedPlaylist.mediaSequence - oldPlaylist.mediaSequence);
        List<HlsMediaPlaylist.Segment> list = oldPlaylist.segments;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HlsMediaPlaylist r(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
        if (loadedPlaylist.isNewerThan(oldPlaylist)) {
            return loadedPlaylist.copyWith(t(oldPlaylist, loadedPlaylist), s(oldPlaylist, loadedPlaylist));
        }
        return loadedPlaylist.hasEndTag ? oldPlaylist.copyWithEndTag() : oldPlaylist;
    }

    private int s(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
        HlsMediaPlaylist.Segment segmentQ;
        if (loadedPlaylist.hasDiscontinuitySequence) {
            return loadedPlaylist.discontinuitySequence;
        }
        HlsMediaPlaylist hlsMediaPlaylist = this.m;
        int i = hlsMediaPlaylist != null ? hlsMediaPlaylist.discontinuitySequence : 0;
        return (oldPlaylist == null || (segmentQ = q(oldPlaylist, loadedPlaylist)) == null) ? i : (oldPlaylist.discontinuitySequence + segmentQ.relativeDiscontinuitySequence) - loadedPlaylist.segments.get(0).relativeDiscontinuitySequence;
    }

    private long t(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
        if (loadedPlaylist.hasProgramDateTime) {
            return loadedPlaylist.startTimeUs;
        }
        HlsMediaPlaylist hlsMediaPlaylist = this.m;
        long j = hlsMediaPlaylist != null ? hlsMediaPlaylist.startTimeUs : 0L;
        if (oldPlaylist == null) {
            return j;
        }
        int size = oldPlaylist.segments.size();
        HlsMediaPlaylist.Segment segmentQ = q(oldPlaylist, loadedPlaylist);
        if (segmentQ != null) {
            return oldPlaylist.startTimeUs + segmentQ.relativeStartTimeUs;
        }
        return ((long) size) == loadedPlaylist.mediaSequence - oldPlaylist.mediaSequence ? oldPlaylist.getEndTimeUs() : j;
    }

    private Uri u(Uri newPrimaryPlaylistUri) {
        HlsMediaPlaylist.RenditionReport renditionReport;
        HlsMediaPlaylist hlsMediaPlaylist = this.m;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.serverControl.canBlockReload || (renditionReport = hlsMediaPlaylist.renditionReports.get(newPrimaryPlaylistUri)) == null) {
            return newPrimaryPlaylistUri;
        }
        Uri.Builder builderBuildUpon = newPrimaryPlaylistUri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(renditionReport.lastMediaSequence));
        int i = renditionReport.lastPartIndex;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    private boolean v(Uri playlistUrl) {
        List<HlsMasterPlaylist.Variant> list = this.k.variants;
        for (int i = 0; i < list.size(); i++) {
            if (playlistUrl.equals(list.get(i).url)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        List<HlsMasterPlaylist.Variant> list = this.k.variants;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) Assertions.checkNotNull(this.d.get(list.get(i).url));
            if (jElapsedRealtime > cVar.h) {
                Uri uri = cVar.a;
                this.l = uri;
                cVar.o(u(uri));
                return true;
            }
        }
        return false;
    }

    private void x(Uri url) {
        if (url.equals(this.l) || !v(url)) {
            return;
        }
        HlsMediaPlaylist hlsMediaPlaylist = this.m;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.hasEndTag) {
            this.l = url;
            c cVar = this.d.get(url);
            HlsMediaPlaylist hlsMediaPlaylist2 = cVar.d;
            if (hlsMediaPlaylist2 == null || !hlsMediaPlaylist2.hasEndTag) {
                cVar.o(u(url));
            } else {
                this.m = hlsMediaPlaylist2;
                this.j.onPrimaryPlaylistRefreshed(hlsMediaPlaylist2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(Uri playlistUrl, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
        Iterator<HlsPlaylistTracker.PlaylistEventListener> it2 = this.e.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z |= !it2.next().onPlaylistError(playlistUrl, loadErrorInfo, forceRetry);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Uri url, HlsMediaPlaylist newSnapshot) {
        if (url.equals(this.l)) {
            if (this.m == null) {
                this.n = !newSnapshot.hasEndTag;
                this.o = newSnapshot.startTimeUs;
            }
            this.m = newSnapshot;
            this.j.onPrimaryPlaylistRefreshed(newSnapshot);
        }
        Iterator<HlsPlaylistTracker.PlaylistEventListener> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().onPlaylistChanged();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void addListener(HlsPlaylistTracker.PlaylistEventListener listener) {
        Assertions.checkNotNull(listener);
        this.e.add(listener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(Uri playlistUrl, long exclusionDurationMs) {
        c cVar = this.d.get(playlistUrl);
        if (cVar != null) {
            return !cVar.h(exclusionDurationMs);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public HlsMasterPlaylist getMasterPlaylist() {
        return this.k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public HlsMediaPlaylist getPlaylistSnapshot(Uri url, boolean isForPlayback) {
        HlsMediaPlaylist hlsMediaPlaylistJ = this.d.get(url).j();
        if (hlsMediaPlaylistJ != null && isForPlayback) {
            x(url);
        }
        return hlsMediaPlaylistJ;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri url) {
        return this.d.get(url).k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri url) throws IOException {
        this.d.get(url).p();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        Loader loader = this.h;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.l;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri url) {
        this.d.get(url).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void removeListener(HlsPlaylistTracker.PlaylistEventListener listener) {
        this.e.remove(listener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void start(Uri initialPlaylistUri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
        this.i = Util.createHandlerForCurrentLooper();
        this.g = eventDispatcher;
        this.j = primaryPlaylistListener;
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.a.createDataSource(4), initialPlaylistUri, 4, this.b.createPlaylistParser());
        Assertions.checkState(this.h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.h = loader;
        eventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, loader.startLoading(parsingLoadable, this, this.c.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.l = null;
        this.m = null;
        this.k = null;
        this.o = C.TIME_UNSET;
        this.h.release();
        this.h = null;
        Iterator<c> it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            it2.next().u();
        }
        this.i.removeCallbacksAndMessages(null);
        this.i = null;
        this.d.clear();
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory dataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory playlistParserFactory, double playlistStuckTargetDurationCoefficient) {
        this.a = dataSourceFactory;
        this.b = playlistParserFactory;
        this.c = loadErrorHandlingPolicy;
        this.f = playlistStuckTargetDurationCoefficient;
        this.e = new CopyOnWriteArrayList<>();
        this.d = new HashMap<>();
        this.o = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.c.onLoadTaskConcluded(loadable.loadTaskId);
        this.g.loadCanceled(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        HlsPlaylist result = loadable.getResult();
        boolean z = result instanceof HlsMediaPlaylist;
        HlsMasterPlaylist hlsMasterPlaylistCreateSingleVariantMasterPlaylist = z ? HlsMasterPlaylist.createSingleVariantMasterPlaylist(result.baseUri) : (HlsMasterPlaylist) result;
        this.k = hlsMasterPlaylistCreateSingleVariantMasterPlaylist;
        this.l = hlsMasterPlaylistCreateSingleVariantMasterPlaylist.variants.get(0).url;
        this.e.add(new b());
        p(hlsMasterPlaylistCreateSingleVariantMasterPlaylist.mediaPlaylistUrls);
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        c cVar = this.d.get(this.l);
        if (z) {
            cVar.t((HlsMediaPlaylist) result, loadEventInfo);
        } else {
            cVar.m();
        }
        this.c.onLoadTaskConcluded(loadable.loadTaskId);
        this.g.loadCompleted(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        long retryDelayMsFor = this.c.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type), error, errorCount));
        boolean z = retryDelayMsFor == C.TIME_UNSET;
        this.g.loadError(loadEventInfo, loadable.type, error, z);
        if (z) {
            this.c.onLoadTaskConcluded(loadable.loadTaskId);
        }
        return z ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
    }
}
