package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final Supplier<String> DEFAULT_SESSION_ID_GENERATOR = new Supplier() { // from class: y51
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return DefaultPlaybackSessionManager.d();
        }
    };
    private static final Random h = new Random();
    private static final int i = 12;
    private final Timeline.Window a;
    private final Timeline.Period b;
    private final HashMap<String, a> c;
    private final Supplier<String> d;
    private PlaybackSessionManager.Listener e;
    private Timeline f;

    @Nullable
    private String g;

    public final class a {
        private final String a;
        private int b;
        private long c;
        private MediaSource.MediaPeriodId d;
        private boolean e;
        private boolean f;

        public a(String sessionId, @Nullable int windowIndex, MediaSource.MediaPeriodId mediaPeriodId) {
            this.a = sessionId;
            this.b = windowIndex;
            this.c = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.d = mediaPeriodId;
        }

        private int l(Timeline oldTimeline, Timeline newTimeline, int windowIndex) {
            if (windowIndex >= oldTimeline.getWindowCount()) {
                if (windowIndex < newTimeline.getWindowCount()) {
                    return windowIndex;
                }
                return -1;
            }
            oldTimeline.getWindow(windowIndex, DefaultPlaybackSessionManager.this.a);
            for (int i = DefaultPlaybackSessionManager.this.a.firstPeriodIndex; i <= DefaultPlaybackSessionManager.this.a.lastPeriodIndex; i++) {
                int indexOfPeriod = newTimeline.getIndexOfPeriod(oldTimeline.getUidOfPeriod(i));
                if (indexOfPeriod != -1) {
                    return newTimeline.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.b).windowIndex;
                }
            }
            return -1;
        }

        public boolean i(int eventWindowIndex, @Nullable MediaSource.MediaPeriodId eventMediaPeriodId) {
            if (eventMediaPeriodId == null) {
                return eventWindowIndex == this.b;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.d;
            if (mediaPeriodId == null) {
                return !eventMediaPeriodId.isAd() && eventMediaPeriodId.windowSequenceNumber == this.c;
            }
            return eventMediaPeriodId.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && eventMediaPeriodId.adGroupIndex == mediaPeriodId.adGroupIndex && eventMediaPeriodId.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup;
        }

        public boolean j(AnalyticsListener.EventTime eventTime) {
            long j = this.c;
            if (j == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.b != eventTime.windowIndex;
            }
            if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.d.periodUid);
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.d.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaPeriodId2.isAd()) {
                int i = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i == -1 || i > this.d.adGroupIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            int i2 = mediaPeriodId3.adGroupIndex;
            int i3 = mediaPeriodId3.adIndexInAdGroup;
            MediaSource.MediaPeriodId mediaPeriodId4 = this.d;
            int i4 = mediaPeriodId4.adGroupIndex;
            return i2 > i4 || (i2 == i4 && i3 > mediaPeriodId4.adIndexInAdGroup);
        }

        public void k(int eventWindowIndex, @Nullable MediaSource.MediaPeriodId eventMediaPeriodId) {
            if (this.c == -1 && eventWindowIndex == this.b && eventMediaPeriodId != null) {
                this.c = eventMediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean m(Timeline oldTimeline, Timeline newTimeline) {
            int iL = l(oldTimeline, newTimeline, this.b);
            this.b = iL;
            if (iL == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.d;
            return mediaPeriodId == null || newTimeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a e(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVar = null;
        long j = Long.MAX_VALUE;
        for (a aVar2 : this.c.values()) {
            aVar2.k(windowIndex, mediaPeriodId);
            if (aVar2.i(windowIndex, mediaPeriodId)) {
                long j2 = aVar2.c;
                if (j2 == -1 || j2 < j) {
                    aVar = aVar2;
                    j = j2;
                } else if (j2 == j && ((a) Util.castNonNull(aVar)).d != null && aVar2.d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.d.get();
        a aVar3 = new a(str, windowIndex, mediaPeriodId);
        this.c.put(str, aVar3);
        return aVar3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void f(AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            this.g = null;
            return;
        }
        a aVar = this.c.get(this.g);
        a aVarE = e(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.g = aVarE.a;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (aVar != null && aVar.c == eventTime.mediaPeriodId.windowSequenceNumber && aVar.d != null && aVar.d.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && aVar.d.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.e.onAdPlaybackStarted(eventTime, e(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).a, aVarE.a);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String sessionId) {
        a aVar = this.c.get(sessionId);
        if (aVar == null) {
            return false;
        }
        aVar.k(eventTime.windowIndex, eventTime.mediaPeriodId);
        return aVar.i(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.g = null;
        Iterator<a> it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            it2.remove();
            if (next.e && (listener = this.e) != null) {
                listener.onSessionFinished(eventTime, next.a, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    @Nullable
    public synchronized String getActiveSessionId() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return e(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.b).windowIndex, mediaPeriodId).a;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.e = listener;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.EventTime eventTime2;
        a aVar;
        Assertions.checkNotNull(this.e);
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        a aVar2 = this.c.get(this.g);
        if (eventTime.mediaPeriodId != null && aVar2 != null) {
            boolean z = false;
            if (aVar2.c != -1 ? eventTime.mediaPeriodId.windowSequenceNumber < aVar2.c : aVar2.b != eventTime.windowIndex) {
                z = true;
            }
            if (z) {
                return;
            }
        }
        a aVarE = e(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.g == null) {
            this.g = aVarE.a;
        }
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null && mediaPeriodId.isAd()) {
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            MediaSource.MediaPeriodId mediaPeriodId3 = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex);
            a aVarE2 = e(eventTime.windowIndex, mediaPeriodId3);
            if (!aVarE2.e) {
                aVarE2.e = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.b);
                this.e.onSessionCreated(new AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId3, Math.max(0L, C.usToMs(this.b.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.b.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), aVarE2.a);
            }
        }
        if (aVarE.e) {
            eventTime2 = eventTime;
            aVar = aVarE;
        } else {
            aVar = aVarE;
            aVar.e = true;
            eventTime2 = eventTime;
            this.e.onSessionCreated(eventTime2, aVar.a);
        }
        if (aVar.a.equals(this.g) && !aVar.f) {
            aVar.f = true;
            this.e.onSessionActive(eventTime2, aVar.a);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int reason) {
        Assertions.checkNotNull(this.e);
        boolean z = reason == 0;
        Iterator<a> it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next.j(eventTime)) {
                it2.remove();
                if (next.e) {
                    boolean zEquals = next.a.equals(this.g);
                    boolean z2 = z && zEquals && next.f;
                    if (zEquals) {
                        this.g = null;
                    }
                    this.e.onSessionFinished(eventTime, next.a, z2);
                }
            }
        }
        f(eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        Assertions.checkNotNull(this.e);
        Timeline timeline = this.f;
        this.f = eventTime.timeline;
        Iterator<a> it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!next.m(timeline, this.f)) {
                it2.remove();
                if (next.e) {
                    if (next.a.equals(this.g)) {
                        this.g = null;
                    }
                    this.e.onSessionFinished(eventTime, next.a, false);
                }
            }
        }
        f(eventTime);
    }

    public DefaultPlaybackSessionManager(Supplier<String> sessionIdGenerator) {
        this.d = sessionIdGenerator;
        this.a = new Timeline.Window();
        this.b = new Timeline.Period();
        this.c = new HashMap<>();
        this.f = Timeline.EMPTY;
    }
}
