package ja;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.h0;
import androidx.media3.common.k0;
import androidx.media3.common.t;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.C;
import com.google.common.collect.UnmodifiableIterator;
import fa.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ja.b {
    public int A;
    public int B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f98017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f98018c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f98024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f98025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f98026k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PlaybackException f98029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f98030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f98031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f98032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.media3.common.q f98033r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.media3.common.q f98034t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.media3.common.q f98035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f98036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f98037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f98038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f98039z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0.c f98020e = new d0.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0.b f98021f = new d0.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f98023h = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<String, Long> f98022g = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f98019d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f98027l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f98028m = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f98041b;

        public a(int i14, int i15) {
            this.f98040a = i14;
            this.f98041b = i15;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.q f98042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f98043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f98044c;

        public b(androidx.media3.common.q qVar, int i14, String str) {
            this.f98042a = qVar;
            this.f98043b = i14;
            this.f98044c = str;
        }
    }

    private p(Context context, PlaybackSession playbackSession) {
        this.f98016a = context.getApplicationContext();
        this.f98018c = playbackSession;
        n nVar = new n();
        this.f98017b = nVar;
        nVar.f98005e = this;
    }

    public static p n(Context context) {
        MediaMetricsManager mediaMetricsManagerA = j4.b.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new p(context, mediaMetricsManagerA.createPlaybackSession());
    }

    public final void A(ja.b.a aVar, String str) {
        androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f98024i)) {
            p();
        }
        this.f98022g.remove(str);
        this.f98023h.remove(str);
    }

    @Override // ja.b
    public final void B(ja.b.a aVar, PlaybackException playbackException) {
        this.f98029n = playbackException;
    }

    public final void C(int i14, long j8, androidx.media3.common.q qVar, int i15) {
        int i16;
        TrackChangeEvent.Builder timeSinceCreatedMillis = o.l(i14).setTimeSinceCreatedMillis(j8 - this.f98019d);
        if (qVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i15 != 1) {
                i16 = 3;
                if (i15 != 2) {
                    i16 = i15 != 3 ? 1 : 4;
                }
            } else {
                i16 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i16);
            String str = qVar.f8385m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qVar.f8386n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qVar.f8383k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i17 = qVar.f8382j;
            if (i17 != -1) {
                timeSinceCreatedMillis.setBitrate(i17);
            }
            int i18 = qVar.f8393u;
            if (i18 != -1) {
                timeSinceCreatedMillis.setWidth(i18);
            }
            int i19 = qVar.f8394v;
            if (i19 != -1) {
                timeSinceCreatedMillis.setHeight(i19);
            }
            int i24 = qVar.C;
            if (i24 != -1) {
                timeSinceCreatedMillis.setChannelCount(i24);
            }
            int i25 = qVar.D;
            if (i25 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i25);
            }
            String str4 = qVar.f8376d;
            if (str4 != null) {
                int i26 = z.f70071a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f14 = qVar.f8395w;
            if (f14 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f14);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.C = true;
        this.f98018c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* JADX WARN: Code duplicated, block: B:255:0x043f  */
    /* JADX WARN: Code duplicated, block: B:368:0x05b1 A[PHI: r2
      0x05b1: PHI (r2v30 int) = (r2v28 int), (r2v27 int) binds: [B:377:0x05c6, B:367:0x05af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:387:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:390:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:394:0x0611 A[Catch: all -> 0x0620, TryCatch #0 {all -> 0x0620, blocks: (B:392:0x060d, B:394:0x0611, B:397:0x0622, B:398:0x062c, B:400:0x0632, B:402:0x063f, B:404:0x0643), top: B:411:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0632 A[Catch: all -> 0x0620, TryCatch #0 {all -> 0x0620, blocks: (B:392:0x060d, B:394:0x0611, B:397:0x0622, B:398:0x062c, B:400:0x0632, B:402:0x063f, B:404:0x0643), top: B:411:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:410:0x064d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:411:0x060d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ja.b
    public final void L(androidx.media3.common.z zVar, ja.b.C1872b c1872b) {
        int i14;
        int i15;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        a aVar;
        a aVar2;
        int i25;
        int i26;
        int i27;
        a aVar3;
        int i28;
        b bVar;
        int i29;
        int i30;
        boolean z15;
        n nVar;
        String str;
        Iterator<n.a> it;
        n.a next;
        p pVar;
        androidx.media3.common.q qVar;
        androidx.media3.common.l lVar;
        int i34;
        if (c1872b.f97952a.f8347a.size() == 0) {
            return;
        }
        int i35 = 0;
        while (true) {
            i14 = 1;
            if (i35 >= c1872b.f97952a.f8347a.size()) {
                break;
            }
            int iA = c1872b.f97952a.a(i35);
            ja.b.a aVar4 = c1872b.f97953b.get(iA);
            aVar4.getClass();
            n nVar2 = this.f98017b;
            if (iA == 0) {
                synchronized (nVar2) {
                    try {
                        nVar2.f98005e.getClass();
                        d0 d0Var = nVar2.f98006f;
                        nVar2.f98006f = aVar4.f97943b;
                        Iterator<n.a> it3 = nVar2.f98003c.values().iterator();
                        while (it3.hasNext()) {
                            n.a next2 = it3.next();
                            if (!next2.b(d0Var, nVar2.f98006f) || next2.a(aVar4)) {
                                it3.remove();
                                if (next2.f98013e) {
                                    if (next2.f98009a.equals(nVar2.f98007g)) {
                                        nVar2.a(next2);
                                    }
                                    nVar2.f98005e.A(aVar4, next2.f98009a);
                                }
                            }
                        }
                        nVar2.d(aVar4);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else if (iA == 11) {
                int i36 = this.f98026k;
                synchronized (nVar2) {
                    try {
                        nVar2.f98005e.getClass();
                        if (i36 != 0) {
                            i14 = 0;
                        }
                        Iterator<n.a> it4 = nVar2.f98003c.values().iterator();
                        while (it4.hasNext()) {
                            n.a next3 = it4.next();
                            if (next3.a(aVar4)) {
                                it4.remove();
                                if (next3.f98013e) {
                                    boolean zEquals = next3.f98009a.equals(nVar2.f98007g);
                                    if (i14 != 0 && zEquals) {
                                        boolean z16 = next3.f98014f;
                                    }
                                    if (zEquals) {
                                        nVar2.a(next3);
                                    }
                                    nVar2.f98005e.A(aVar4, next3.f98009a);
                                }
                            }
                        }
                        nVar2.d(aVar4);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else {
                nVar2.e(aVar4);
            }
            i35++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1872b.a(0)) {
            ja.b.a aVar5 = c1872b.f97953b.get(0);
            aVar5.getClass();
            if (this.f98025j != null) {
                z(aVar5.f97943b, aVar5.f97945d);
            }
        }
        if (c1872b.a(2) && this.f98025j != null) {
            UnmodifiableIterator<h0.a> it5 = zVar.g().f8302a.iterator();
            loop3: while (true) {
                if (!it5.hasNext()) {
                    lVar = null;
                    break;
                }
                h0.a next4 = it5.next();
                for (int i37 = 0; i37 < next4.f8303a; i37++) {
                    if (next4.f8307e[i37] && (lVar = next4.f8304b.f8217d[i37].f8390r) != null) {
                        break loop3;
                    }
                }
            }
            if (lVar != null) {
                PlaybackMetrics.Builder builderJ = j4.b.j(this.f98025j);
                int i38 = 0;
                while (true) {
                    if (i38 >= lVar.f8341d) {
                        i34 = 1;
                        break;
                    }
                    UUID uuid = lVar.f8338a[i38].f8343b;
                    if (uuid.equals(androidx.media3.common.h.f8299d)) {
                        i34 = 3;
                        break;
                    } else if (uuid.equals(androidx.media3.common.h.f8300e)) {
                        i34 = 2;
                        break;
                    } else {
                        if (uuid.equals(androidx.media3.common.h.f8298c)) {
                            i34 = 6;
                            break;
                        }
                        i38++;
                    }
                }
                builderJ.setDrmType(i34);
            }
        }
        if (c1872b.a(1011)) {
            this.B++;
        }
        PlaybackException playbackException = this.f98029n;
        if (playbackException == null) {
            i18 = 4;
            i28 = 2;
            i24 = 13;
            i16 = 6;
            i17 = 8;
            i19 = 7;
        } else {
            Context context = this.f98016a;
            boolean z17 = this.f98037x == 4;
            if (playbackException.errorCode == 1001) {
                aVar = new a(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z14 = exoPlaybackException.type == 1;
                    i15 = exoPlaybackException.rendererFormatSupport;
                } else {
                    i15 = 0;
                    z14 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i39 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                        aVar3 = new a(5, ((HttpDataSource$InvalidResponseCodeException) cause).responseCode);
                    } else {
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i25 = 4;
                            i26 = 7;
                            i27 = 8;
                            i16 = 6;
                            aVar = new a(z17 ? 10 : 11, 0);
                        } else {
                            boolean z18 = cause instanceof HttpDataSource$HttpDataSourceException;
                            if (z18 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                                if (fa.o.b(context).c() == 1) {
                                    aVar = new a(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i16 = 6;
                                        aVar = new a(6, 0);
                                        i24 = 13;
                                        i17 = 8;
                                        i18 = 4;
                                        i19 = 7;
                                    } else {
                                        i16 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            aVar = new a(7, 0);
                                            i19 = 7;
                                            i24 = 13;
                                            i17 = 8;
                                            i18 = 4;
                                        } else {
                                            i26 = 7;
                                            if (z18 && ((HttpDataSource$HttpDataSourceException) cause).type == 1) {
                                                aVar = new a(4, 0);
                                                i18 = 4;
                                                i19 = 7;
                                                i24 = 13;
                                                i17 = 8;
                                            } else {
                                                i25 = 4;
                                                i27 = 8;
                                                aVar = new a(8, 0);
                                            }
                                        }
                                    }
                                }
                            } else if (playbackException.errorCode == 1002) {
                                aVar = new a(21, 0);
                            } else if (cause instanceof DrmSession.DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iU = z.u(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (z.t(iU)) {
                                        case 6002:
                                            i39 = 24;
                                            break;
                                        case 6003:
                                            i39 = 28;
                                            break;
                                        case 6004:
                                            i39 = 25;
                                            break;
                                        case 6005:
                                            i39 = 26;
                                            break;
                                    }
                                    aVar3 = new a(i39, iU);
                                } else if (z.f70071a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                    aVar = new a(27, 0);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    aVar = new a(24, 0);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    aVar = new a(29, 0);
                                } else if (cause3 instanceof UnsupportedDrmException) {
                                    aVar = new a(23, 0);
                                } else {
                                    aVar = cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
                                }
                            } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                aVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                            } else {
                                aVar = new a(9, 0);
                            }
                            i24 = 13;
                            i16 = 6;
                            i17 = 8;
                            i18 = 4;
                            i19 = 7;
                        }
                        i18 = i25;
                        i19 = i26;
                        i17 = i27;
                        i24 = 13;
                    }
                    aVar = aVar3;
                } else {
                    int i44 = 28;
                    i16 = 6;
                    i17 = 8;
                    i18 = 4;
                    i19 = 7;
                    if (z14 && (i15 == 0 || i15 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z14 && i15 == 3) {
                        aVar = new a(15, 0);
                    } else if (z14 && i15 == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            i24 = 13;
                            aVar2 = new a(13, z.u(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
                        } else {
                            i24 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                aVar2 = new a(14, ((MediaCodecDecoderException) cause).errorCode);
                            } else if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof AudioSink.InitializationException) {
                                aVar2 = new a(17, ((AudioSink.InitializationException) cause).audioTrackState);
                            } else if (cause instanceof AudioSink.WriteException) {
                                aVar2 = new a(18, ((AudioSink.WriteException) cause).errorCode);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (z.t(errorCode)) {
                                    case 6002:
                                        i44 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i44 = 25;
                                        break;
                                    case 6005:
                                        i44 = 26;
                                        break;
                                    default:
                                        i44 = 27;
                                        break;
                                }
                                aVar2 = new a(i44, errorCode);
                            } else {
                                aVar = new a(22, 0);
                            }
                        }
                        aVar = aVar2;
                    }
                    i24 = 13;
                }
                this.f98018c.reportPlaybackErrorEvent(o.e().setTimeSinceCreatedMillis(jElapsedRealtime - this.f98019d).setErrorCode(aVar.f98040a).setSubErrorCode(aVar.f98041b).setException(playbackException).build());
                i14 = 1;
                this.C = true;
                this.f98029n = null;
                i28 = 2;
            }
            i24 = 13;
            i16 = 6;
            i17 = 8;
            i18 = 4;
            i19 = 7;
            this.f98018c.reportPlaybackErrorEvent(o.e().setTimeSinceCreatedMillis(jElapsedRealtime - this.f98019d).setErrorCode(aVar.f98040a).setSubErrorCode(aVar.f98041b).setException(playbackException).build());
            i14 = 1;
            this.C = true;
            this.f98029n = null;
            i28 = 2;
        }
        if (c1872b.a(i28)) {
            h0 h0VarG = zVar.g();
            boolean zB = h0VarG.b(i28);
            boolean zB2 = h0VarG.b(i14);
            boolean zB3 = h0VarG.b(3);
            if (zB || zB2 || zB3) {
                if (zB) {
                    qVar = null;
                } else {
                    androidx.media3.common.q qVar2 = this.f98033r;
                    int i45 = z.f70071a;
                    qVar = null;
                    if (!Objects.equals(qVar2, null)) {
                        int i46 = this.f98033r == null ? 1 : 0;
                        this.f98033r = null;
                        C(1, jElapsedRealtime, null, i46);
                    }
                }
                if (!zB2) {
                    androidx.media3.common.q qVar3 = this.f98034t;
                    int i47 = z.f70071a;
                    if (!Objects.equals(qVar3, qVar)) {
                        int i48 = this.f98034t == null ? 1 : 0;
                        this.f98034t = qVar;
                        C(0, jElapsedRealtime, qVar, i48);
                    }
                }
                if (!zB3) {
                    androidx.media3.common.q qVar4 = this.f98035v;
                    int i49 = z.f70071a;
                    if (!Objects.equals(qVar4, qVar)) {
                        int i54 = this.f98035v == null ? 1 : 0;
                        this.f98035v = qVar;
                        C(2, jElapsedRealtime, qVar, i54);
                    }
                }
                bVar = qVar;
            } else {
                i18 = i18;
                bVar = 0;
            }
        } else {
            i18 = i18;
            bVar = 0;
        }
        if (k(this.f98030o)) {
            b bVar2 = this.f98030o;
            androidx.media3.common.q qVar5 = bVar2.f98042a;
            if (qVar5.f8394v != -1) {
                int i55 = bVar2.f98043b;
                androidx.media3.common.q qVar6 = this.f98033r;
                int i56 = z.f70071a;
                if (!Objects.equals(qVar6, qVar5)) {
                    int i57 = (this.f98033r == null && i55 == 0) ? 1 : i55;
                    this.f98033r = qVar5;
                    C(1, jElapsedRealtime, qVar5, i57);
                }
                this.f98030o = bVar;
            }
        }
        if (k(this.f98031p)) {
            b bVar3 = this.f98031p;
            androidx.media3.common.q qVar7 = bVar3.f98042a;
            int i58 = bVar3.f98043b;
            androidx.media3.common.q qVar8 = this.f98034t;
            int i59 = z.f70071a;
            if (!Objects.equals(qVar8, qVar7)) {
                int i64 = (this.f98034t == null && i58 == 0) ? 1 : i58;
                this.f98034t = qVar7;
                C(0, jElapsedRealtime, qVar7, i64);
            }
            this.f98031p = bVar;
        }
        if (k(this.f98032q)) {
            b bVar4 = this.f98032q;
            androidx.media3.common.q qVar9 = bVar4.f98042a;
            int i65 = bVar4.f98043b;
            androidx.media3.common.q qVar10 = this.f98035v;
            int i66 = z.f70071a;
            if (!Objects.equals(qVar10, qVar9)) {
                int i67 = (this.f98035v == null && i65 == 0) ? 1 : i65;
                this.f98035v = qVar9;
                C(2, jElapsedRealtime, qVar9, i67);
            }
            this.f98032q = bVar;
        }
        switch (fa.o.b(this.f98016a).c()) {
            case 0:
                i29 = 0;
                break;
            case 1:
                i29 = 9;
                break;
            case 2:
                i29 = 2;
                break;
            case 3:
                i29 = i18;
                break;
            case 4:
                i29 = 5;
                break;
            case 5:
                i29 = i16;
                break;
            case 6:
            case 8:
            default:
                i29 = 1;
                break;
            case 7:
                i29 = 3;
                break;
            case 9:
                i29 = i17;
                break;
            case 10:
                i29 = i19;
                break;
        }
        if (i29 != this.f98028m) {
            this.f98028m = i29;
            this.f98018c.reportNetworkEvent(o.d().setNetworkType(i29).setTimeSinceCreatedMillis(jElapsedRealtime - this.f98019d).build());
        }
        if (zVar.getPlaybackState() != 2) {
            this.f98036w = false;
        }
        if (zVar.getPlayerError() == null) {
            this.f98038y = false;
            i30 = 10;
        } else {
            i30 = 10;
            if (c1872b.a(10)) {
                this.f98038y = true;
            }
        }
        int playbackState = zVar.getPlaybackState();
        if (!this.f98036w) {
            if (!this.f98038y) {
                if (playbackState == i18) {
                    i24 = 11;
                } else {
                    i24 = 12;
                    if (playbackState == 2) {
                        int i68 = this.f98027l;
                        if (i68 == 0 || i68 == 2 || i68 == 12) {
                            i24 = 2;
                        } else if (!zVar.getPlayWhenReady()) {
                            i24 = i19;
                        } else if (zVar.getPlaybackSuppressionReason() != 0) {
                            i24 = i30;
                        } else {
                            i24 = i16;
                        }
                    } else {
                        i30 = 3;
                        if (playbackState != 3) {
                            z15 = true;
                            if (playbackState != 1 || this.f98027l == 0) {
                                i24 = this.f98027l;
                            }
                        } else if (!zVar.getPlayWhenReady()) {
                            i24 = i18;
                        } else if (zVar.getPlaybackSuppressionReason() != 0) {
                            i24 = 9;
                        } else {
                            i24 = i30;
                        }
                    }
                }
            }
            if (this.f98027l != i24) {
                this.f98027l = i24;
                this.C = z15;
                this.f98018c.reportPlaybackStateEvent(o.h().setState(this.f98027l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f98019d).build());
            }
            if (c1872b.a(1028)) {
                nVar = this.f98017b;
                ja.b.a aVar6 = c1872b.f97953b.get(1028);
                aVar6.getClass();
                synchronized (nVar) {
                    try {
                        str = nVar.f98007g;
                        if (str != null) {
                            n.a aVar7 = nVar.f98003c.get(str);
                            aVar7.getClass();
                            nVar.a(aVar7);
                        }
                        it = nVar.f98003c.values().iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it.remove();
                            if (!next.f98013e && (pVar = nVar.f98005e) != null) {
                                pVar.A(aVar6, next.f98009a);
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
        i24 = 5;
        z15 = true;
        if (this.f98027l != i24) {
            this.f98027l = i24;
            this.C = z15;
            this.f98018c.reportPlaybackStateEvent(o.h().setState(this.f98027l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f98019d).build());
        }
        if (c1872b.a(1028)) {
            nVar = this.f98017b;
            ja.b.a aVar8 = c1872b.f97953b.get(1028);
            aVar8.getClass();
            synchronized (nVar) {
                str = nVar.f98007g;
                if (str != null) {
                    n.a aVar9 = nVar.f98003c.get(str);
                    aVar9.getClass();
                    nVar.a(aVar9);
                }
                it = nVar.f98003c.values().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    it.remove();
                    if (!next.f98013e) {
                    }
                }
            }
        }
    }

    @Override // ja.b
    public final void U(ja.b.a aVar, k0 k0Var) {
        b bVar = this.f98030o;
        if (bVar != null) {
            androidx.media3.common.q qVar = bVar.f98042a;
            if (qVar.f8394v == -1) {
                androidx.media3.common.q.b bVarA = qVar.a();
                bVarA.f8418t = k0Var.f8335a;
                bVarA.f8419u = k0Var.f8336b;
                this.f98030o = new b(bVarA.a(), bVar.f98043b, bVar.f98044c);
            }
        }
    }

    @Override // ja.b
    public final void g(ja.b.a aVar, sa.i iVar, sa.j jVar, IOException iOException) {
        this.f98037x = jVar.f158118a;
    }

    public final boolean k(b bVar) {
        String str;
        if (bVar == null) {
            return false;
        }
        String str2 = bVar.f98044c;
        n nVar = this.f98017b;
        synchronized (nVar) {
            str = nVar.f98007g;
        }
        return str2.equals(str);
    }

    public final void p() {
        PlaybackMetrics.Builder builder = this.f98025j;
        if (builder != null && this.C) {
            builder.setAudioUnderrunCount(this.B);
            this.f98025j.setVideoFramesDropped(this.f98039z);
            this.f98025j.setVideoFramesPlayed(this.A);
            Long l14 = this.f98022g.get(this.f98024i);
            this.f98025j.setNetworkTransferDurationMillis(l14 == null ? 0L : l14.longValue());
            Long l15 = this.f98023h.get(this.f98024i);
            this.f98025j.setNetworkBytesRead(l15 == null ? 0L : l15.longValue());
            this.f98025j.setStreamSource((l15 == null || l15.longValue() <= 0) ? 0 : 1);
            this.f98018c.reportPlaybackMetrics(this.f98025j.build());
        }
        this.f98025j = null;
        this.f98024i = null;
        this.B = 0;
        this.f98039z = 0;
        this.A = 0;
        this.f98033r = null;
        this.f98034t = null;
        this.f98035v = null;
        this.C = false;
    }

    @Override // ja.b
    public final void q(ja.b.a aVar, sa.j jVar) {
        androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
        if (bVar == null) {
            return;
        }
        androidx.media3.common.q qVar = jVar.f158120c;
        qVar.getClass();
        int i14 = jVar.f158121d;
        d0 d0Var = aVar.f97943b;
        bVar.getClass();
        b bVar2 = new b(qVar, i14, this.f98017b.c(d0Var, bVar));
        int i15 = jVar.f158119b;
        if (i15 != 0) {
            if (i15 == 1) {
                this.f98031p = bVar2;
                return;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    return;
                }
                this.f98032q = bVar2;
                return;
            }
        }
        this.f98030o = bVar2;
    }

    @Override // ja.b
    public final void s(ja.b.a aVar, androidx.media3.exoplayer.g gVar) {
        this.f98039z += gVar.f8961g;
        this.A += gVar.f8959e;
    }

    @Override // ja.b
    public final void v(ja.b.a aVar, androidx.media3.common.z.e eVar, androidx.media3.common.z.e eVar2, int i14) {
        if (i14 == 1) {
            this.f98036w = true;
        }
        this.f98026k = i14;
    }

    @Override // ja.b
    public final void w(int i14, long j8, ja.b.a aVar) {
        androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
        if (bVar != null) {
            String strC = this.f98017b.c(aVar.f97943b, bVar);
            HashMap<String, Long> map = this.f98023h;
            Long l14 = map.get(strC);
            HashMap<String, Long> map2 = this.f98022g;
            Long l15 = map2.get(strC);
            map.put(strC, Long.valueOf((l14 == null ? 0L : l14.longValue()) + j8));
            map2.put(strC, Long.valueOf((l15 != null ? l15.longValue() : 0L) + ((long) i14)));
        }
    }

    public final void z(d0 d0Var, androidx.media3.exoplayer.source.j.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f98025j;
        if (bVar == null || (iB = d0Var.b(bVar.f9519a)) == -1) {
            return;
        }
        d0.b bVar2 = this.f98021f;
        int i14 = 0;
        d0Var.f(iB, bVar2, false);
        int i15 = bVar2.f8189c;
        d0.c cVar = this.f98020e;
        d0Var.n(i15, cVar);
        t.h hVar = cVar.f8198c.f8439b;
        if (hVar != null) {
            int iF = z.F(hVar.f8482a, hVar.f8483b);
            if (iF == 0) {
                i14 = 3;
            } else if (iF != 1) {
                i14 = iF != 2 ? 1 : 4;
            } else {
                i14 = 5;
            }
        }
        builder.setStreamType(i14);
        if (cVar.f8208m != C.TIME_UNSET && !cVar.f8206k && !cVar.f8204i && !cVar.a()) {
            builder.setMediaDurationMillis(z.Y(cVar.f8208m));
        }
        builder.setPlaybackType(cVar.a() ? 2 : 1);
        this.C = true;
    }
}
