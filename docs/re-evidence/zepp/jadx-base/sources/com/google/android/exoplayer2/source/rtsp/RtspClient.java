package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class RtspClient implements Closeable {
    private static final long p = 30000;
    private final SessionInfoListener a;
    private final PlaybackEventListener b;
    private final Uri c;

    @Nullable
    private final RtspMessageUtil.RtspAuthUserInfo d;
    private final String e;

    @Nullable
    private String j;

    @Nullable
    private b k;

    @Nullable
    private e l;
    private boolean m;
    private boolean n;
    private final ArrayDeque<h.d> f = new ArrayDeque<>();
    private final SparseArray<RtspRequest> g = new SparseArray<>();
    private final d h = new d();
    private long o = C.TIME_UNSET;
    private RtspMessageChannel i = new RtspMessageChannel(new c());

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException error);

        void onPlaybackStarted(long startPositionUs, ImmutableList<v> trackTimingList);

        void onRtspSetupCompleted();
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String message, @Nullable Throwable cause);

        void onSessionTimelineUpdated(t timing, ImmutableList<m> tracks);
    }

    public final class b implements Runnable, Closeable {
        private final Handler a = Util.createHandlerForCurrentLooper();
        private final long b;
        private boolean c;

        public b(long intervalMs) {
            this.b = intervalMs;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c = false;
            this.a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            RtspClient.this.h.d(RtspClient.this.c, RtspClient.this.j);
            this.a.postDelayed(this, this.b);
        }

        public void start() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.postDelayed(this, this.b);
        }
    }

    public final class c implements RtspMessageChannel.MessageListener {
        private final Handler a = Util.createHandlerForCurrentLooper();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void c(List<String> message) {
            s sVarJ = RtspMessageUtil.j(message);
            int i = Integer.parseInt((String) Assertions.checkNotNull(sVarJ.b.e(RtspHeaders.o)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.g.get(i);
            if (rtspRequest == null) {
                return;
            }
            RtspClient.this.g.remove(i);
            int i2 = rtspRequest.b;
            try {
                int i3 = sVarJ.a;
                if (i3 != 200) {
                    if (i3 == 401 && RtspClient.this.d != null && !RtspClient.this.n) {
                        String strE = sVarJ.b.e("WWW-Authenticate");
                        if (strE == null) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        RtspClient.this.l = RtspMessageUtil.m(strE);
                        RtspClient.this.h.b();
                        RtspClient.this.n = true;
                        return;
                    }
                    RtspClient rtspClient = RtspClient.this;
                    String strR = RtspMessageUtil.r(i2);
                    int i4 = sVarJ.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 12);
                    sb.append(strR);
                    sb.append(" ");
                    sb.append(i4);
                    rtspClient.z(new RtspMediaSource.RtspPlaybackException(sb.toString()));
                    return;
                }
                switch (i2) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        d(new g(i3, w.b(sVarJ.c)));
                        return;
                    case 4:
                        e(new p(i3, RtspMessageUtil.h(sVarJ.b.e(RtspHeaders.t))));
                        return;
                    case 5:
                        f();
                        return;
                    case 6:
                        String strE2 = sVarJ.b.e("Range");
                        t tVarD = strE2 == null ? t.c : t.d(strE2);
                        String strE3 = sVarJ.b.e(RtspHeaders.v);
                        g(new q(sVarJ.a, tVarD, strE3 == null ? ImmutableList.of() : v.a(strE3)));
                        return;
                    case 10:
                        String strE4 = sVarJ.b.e(RtspHeaders.y);
                        String strE5 = sVarJ.b.e(RtspHeaders.C);
                        if (strE4 == null || strE5 == null) {
                            throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                        }
                        h(new u(sVarJ.a, RtspMessageUtil.k(strE4), strE5));
                        return;
                    default:
                        throw new IllegalStateException();
                }
            } catch (ParserException e) {
                RtspClient.this.z(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        private void d(g response) {
            t tVarD = t.c;
            String str = response.b.a.get("range");
            if (str != null) {
                try {
                    tVarD = t.d(str);
                } catch (ParserException e) {
                    RtspClient.this.a.onSessionTimelineRequestFailed("SDP format error.", e);
                    return;
                }
            }
            ImmutableList<m> immutableListX = RtspClient.x(response.b, RtspClient.this.c);
            if (immutableListX.isEmpty()) {
                RtspClient.this.a.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.a.onSessionTimelineUpdated(tVarD, immutableListX);
                RtspClient.this.m = true;
            }
        }

        private void e(p response) {
            if (RtspClient.this.k != null) {
                return;
            }
            if (RtspClient.E(response.b)) {
                RtspClient.this.h.c(RtspClient.this.c, RtspClient.this.j);
            } else {
                RtspClient.this.a.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void f() {
            if (RtspClient.this.o != C.TIME_UNSET) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.H(C.usToMs(rtspClient.o));
            }
        }

        private void g(q response) {
            if (RtspClient.this.k == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.k = rtspClient.new b(30000L);
                RtspClient.this.k.start();
            }
            RtspClient.this.b.onPlaybackStarted(C.msToUs(response.b.a), response.c);
            RtspClient.this.o = C.TIME_UNSET;
        }

        private void h(u response) {
            RtspClient.this.j = response.b.sessionId;
            RtspClient.this.y();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onReceivingFailed(Exception exc) {
            n.a(this, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> message) {
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(message);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onSendingFailed(List list, Exception exc) {
            n.b(this, list, exc);
        }
    }

    public final class d {
        private int a;
        private RtspRequest b;

        private d() {
        }

        private RtspRequest a(int method, @Nullable String sessionId, Map<String, String> additionalHeaders, Uri uri) {
            RtspHeaders.Builder builder = new RtspHeaders.Builder();
            int i = this.a;
            this.a = i + 1;
            builder.add(RtspHeaders.o, String.valueOf(i));
            builder.add("User-Agent", RtspClient.this.e);
            if (sessionId != null) {
                builder.add(RtspHeaders.y, sessionId);
            }
            if (RtspClient.this.l != null) {
                Assertions.checkStateNotNull(RtspClient.this.d);
                try {
                    builder.add("Authorization", RtspClient.this.l.a(RtspClient.this.d, uri, method));
                } catch (ParserException e) {
                    RtspClient.this.z(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            builder.addAll(additionalHeaders);
            return new RtspRequest(uri, method, builder.build(), "");
        }

        private void g(RtspRequest request) {
            int i = Integer.parseInt((String) Assertions.checkNotNull(request.c.e(RtspHeaders.o)));
            Assertions.checkState(RtspClient.this.g.get(i) == null);
            RtspClient.this.g.append(i, request);
            RtspClient.this.i.f(RtspMessageUtil.o(request));
            this.b = request;
        }

        public void b() {
            Assertions.checkStateNotNull(this.b);
            ImmutableListMultimap<String, String> immutableListMultimapB = this.b.c.b();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapB.keySet()) {
                if (!str.equals(RtspHeaders.o) && !str.equals("User-Agent") && !str.equals(RtspHeaders.y) && !str.equals("Authorization")) {
                    map.put(str, (String) Iterables.getLast(immutableListMultimapB.get(str)));
                }
            }
            g(a(this.b.b, RtspClient.this.j, map, this.b.a));
        }

        public void c(Uri uri, @Nullable String sessionId) {
            g(a(2, sessionId, ImmutableMap.of(), uri));
        }

        public void d(Uri uri, @Nullable String sessionId) {
            g(a(4, sessionId, ImmutableMap.of(), uri));
        }

        public void e(Uri uri, String sessionId) {
            g(a(5, sessionId, ImmutableMap.of(), uri));
        }

        public void f(Uri uri, long offsetMs, String sessionId) {
            g(a(6, sessionId, ImmutableMap.of("Range", t.b(offsetMs)), uri));
        }

        public void h(Uri trackUri, String transport, @Nullable String sessionId) {
            g(a(10, sessionId, ImmutableMap.of(RtspHeaders.C, transport), trackUri));
        }

        public void i(Uri uri, String sessionId) {
            g(a(12, sessionId, ImmutableMap.of(), uri));
        }
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String userAgent, Uri uri) {
        this.a = sessionInfoListener;
        this.b = playbackEventListener;
        this.c = RtspMessageUtil.n(uri);
        this.d = RtspMessageUtil.l(uri);
        this.e = userAgent;
    }

    private static Socket A(Uri uri) throws IOException {
        Assertions.checkArgument(uri.getHost() != null);
        return SocketFactory.getDefault().createSocket((String) Assertions.checkNotNull(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : RtspMessageChannel.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(List<Integer> serverSupportedMethods) {
        return serverSupportedMethods.isEmpty() || serverSupportedMethods.contains(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<m> x(SessionDescription sessionDescription, Uri uri) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < sessionDescription.b.size(); i++) {
            MediaDescription mediaDescription = sessionDescription.b.get(i);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                builder.add(new m(mediaDescription, uri));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        h.d dVarPollFirst = this.f.pollFirst();
        if (dVarPollFirst == null) {
            this.b.onRtspSetupCompleted();
        } else {
            this.h.h(dVarPollFirst.c(), dVarPollFirst.d(), this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Throwable error) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = error instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) error : new RtspMediaSource.RtspPlaybackException(error);
        if (this.m) {
            this.b.onPlaybackError(rtspPlaybackException);
        } else {
            this.a.onSessionTimelineRequestFailed(Strings.nullToEmpty(error.getMessage()), error);
        }
    }

    public void B(int channel, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.i.e(channel, interleavedBinaryDataListener);
    }

    public void C() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new c());
            this.i = rtspMessageChannel;
            rtspMessageChannel.d(A(this.c));
            this.j = null;
            this.n = false;
            this.l = null;
        } catch (IOException e) {
            this.b.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e));
        }
    }

    public void D(long positionUs) {
        this.h.e(this.c, (String) Assertions.checkNotNull(this.j));
        this.o = positionUs;
    }

    public void F(List<h.d> loadInfos) {
        this.f.addAll(loadInfos);
        y();
    }

    public void G() throws IOException {
        try {
            this.i.d(A(this.c));
            this.h.d(this.c, this.j);
        } catch (IOException e) {
            Util.closeQuietly(this.i);
            throw e;
        }
    }

    public void H(long offsetMs) {
        this.h.f(this.c, offsetMs, (String) Assertions.checkNotNull(this.j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.k;
        if (bVar != null) {
            bVar.close();
            this.k = null;
            this.h.i(this.c, (String) Assertions.checkNotNull(this.j));
        }
        this.i.close();
    }
}
