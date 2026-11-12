package bu1;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.j;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.h0;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.common.y;
import androidx.media3.common.z;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.g;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.u;
import fa.k;
import i3.e5;
import j20.x;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import sa.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbu1/b;", "Lja/b;", "Landroidx/media3/common/z$d;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements ja.b, z.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21232d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final NumberFormat f21233e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.c f21234a = new d0.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.b f21235b = new d0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21236c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
        f21233e = numberFormat;
    }

    public static void f0(String str) {
        i2.a.c(i2.f36769a, "EventLogger", str);
    }

    public static void g0(w wVar, String str) {
        int length = wVar.f8574a.length;
        for (int i14 = 0; i14 < length; i14++) {
            f0(str + wVar.f8574a[i14]);
        }
    }

    @Override // ja.b
    public final void B(ja.b.a aVar, PlaybackException playbackException) {
        playbackException.getClass();
        i2.a.j(i2.f36769a, "EventLogger", d0(aVar, "playerFailed", null, playbackException));
    }

    @Override // ja.b
    public final void D(ja.b.a aVar, g gVar) {
        gVar.getClass();
        f0(d0(aVar, "videoEnabled", null, null));
    }

    @Override // ja.b
    public final void E(ja.b.a aVar, int i14) {
        d0 d0Var = aVar.f97943b;
        int iH = d0Var.h();
        int iO = d0Var.o();
        String strE0 = e0(aVar);
        a aVar2 = f21232d;
        aVar2.getClass();
        String str = i14 != 0 ? i14 != 1 ? CallerData.NA : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
        StringBuilder sbK = j.k(iH, "timeline [", strE0, ", periodCount=", ", windowCount=");
        sbK.append(iO);
        sbK.append(", reason=");
        sbK.append(str);
        f0(sbK.toString());
        int iMin = (int) Math.min(iH, 3.0d);
        for (int i15 = 0; i15 < iMin; i15++) {
            d0.b bVar = this.f21235b;
            d0Var.f(i15, bVar, false);
            f0("  period [" + a.b(aVar2, fa.z.Y(bVar.f8190d)) + "]");
        }
        if (iH > 3) {
            f0("  ...");
        }
        int iMin2 = (int) Math.min(iO, 3.0d);
        for (int i16 = 0; i16 < iMin2; i16++) {
            d0.c cVar = this.f21234a;
            d0Var.n(i16, cVar);
            String strB = a.b(aVar2, fa.z.Y(cVar.f8208m));
            boolean z14 = cVar.f8203h;
            boolean z15 = cVar.f8204i;
            StringBuilder sbD = zl.a.d("  window [", strB, ", seekable=", z14, ", dynamic=");
            sbD.append(z15);
            sbD.append("]");
            f0(sbD.toString());
        }
        if (iO > 3) {
            f0("  ...");
        }
        f0("]");
    }

    @Override // ja.b
    public final void F(ja.b.a aVar, int i14, int i15, boolean z14) {
        StringBuilder sbR = wr.g.r(i14, "rendererIndex=", ", ", fa.z.C(i15), ", ");
        sbR.append(z14);
        f0(d0(aVar, "rendererReady", sbR.toString(), null));
    }

    @Override // ja.b
    public final void H(ja.b.a aVar, boolean z14) {
        f0(d0(aVar, "shuffleModeEnabled", String.valueOf(z14), null));
    }

    @Override // ja.b
    public final void J(ja.b.a aVar, String str) {
        f0(d0(aVar, "videoDecoderInitialized", str, null));
    }

    @Override // ja.b
    public final void K(ja.b.a aVar, int i14) {
        String str;
        f21232d.getClass();
        if (i14 != 0) {
            str = i14 != 1 ? CallerData.NA : "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else {
            str = "NONE";
        }
        f0(d0(aVar, "playbackSuppressionReason", str, null));
    }

    @Override // ja.b
    public final void M(ja.b.a aVar, h0 h0Var) {
        w wVar;
        h0Var.getClass();
        f0("tracks [".concat(e0(aVar)));
        ImmutableList<h0.a> immutableList = h0Var.f8302a;
        immutableList.getClass();
        int size = immutableList.size();
        for (int i14 = 0; i14 < size; i14++) {
            h0.a aVar2 = immutableList.get(i14);
            f0("  group [");
            int i15 = aVar2.f8303a;
            for (int i16 = 0; i16 < i15; i16++) {
                boolean z14 = aVar2.f8307e[i16];
                f21232d.getClass();
                String str = z14 ? "[X]" : "[ ]";
                String strV = fa.z.v(aVar2.f8306d[i16]);
                String strD = q.d(aVar2.f8304b.f8217d[i16]);
                StringBuilder sbK = j.k(i16, "    ", str, " Track:", ", ");
                sbK.append(strD);
                sbK.append(", supported=");
                sbK.append(strV);
                f0(sbK.toString());
            }
            f0("  ]");
        }
        boolean z15 = false;
        for (int i17 = 0; !z15 && i17 < immutableList.size(); i17++) {
            h0.a aVar3 = immutableList.get(i17);
            for (int i18 = 0; !z15 && i18 < aVar3.f8303a; i18++) {
                if (aVar3.f8307e[i18] && (wVar = aVar3.f8304b.f8217d[i18].f8384l) != null && wVar.f8574a.length > 0) {
                    f0("  Metadata [");
                    g0(wVar, "    ");
                    f0("  ]");
                    z15 = true;
                }
            }
        }
        f0("]");
    }

    @Override // ja.b
    public final void N(ja.b.a aVar, q qVar) {
        qVar.getClass();
        f0(d0(aVar, "audioInputFormat", q.d(qVar), null));
    }

    @Override // ja.b
    public final void O(ja.b.a aVar, int i14) {
        f0(d0(aVar, "droppedFrames", String.valueOf(i14), null));
    }

    @Override // ja.b
    public final void Q(ja.b.a aVar) {
        f0(d0(aVar, "drmSessionReleased", null, null));
    }

    @Override // ja.b
    public final void R(ja.b.a aVar, Exception exc) {
        exc.getClass();
        i2.a.j(i2.f36769a, "EventLogger", d0(aVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // ja.b
    public final void T(ja.b.a aVar, int i14) {
        f0(d0(aVar, "drmSessionAcquired", am.j.h(i14, "state="), null));
    }

    @Override // ja.b
    public final void U(ja.b.a aVar, k0 k0Var) {
        k0Var.getClass();
        f0(d0(aVar, "videoSize", j.d(k0Var.f8335a, k0Var.f8336b, ", "), null));
    }

    @Override // ja.b
    public final void V(ja.b.a aVar, int i14) {
        String str;
        String strE0 = e0(aVar);
        f21232d.getClass();
        if (i14 == 0) {
            str = "REPEAT";
        } else if (i14 == 1) {
            str = "AUTO";
        } else if (i14 != 2) {
            str = i14 != 3 ? CallerData.NA : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        f0("mediaItem [" + strE0 + ", reason=" + str + "]");
    }

    @Override // ja.b
    public final void W(ja.b.a aVar, String str) {
        f0(d0(aVar, "audioDecoderReleased", str, null));
    }

    @Override // ja.b
    public final void X(ja.b.a aVar, String str) {
        f0(d0(aVar, "audioDecoderInitialized", str, null));
    }

    @Override // ja.b
    public final void Z(ja.b.a aVar) {
        f0(d0(aVar, "drmKeysRestored", null, null));
    }

    @Override // ja.b
    public final void a(ja.b.a aVar, Object obj) {
        obj.getClass();
        f0(d0(aVar, "renderedFirstFrame", obj.toString(), null));
    }

    @Override // ja.b
    public final void a0(ja.b.a aVar, int i14, int i15) {
        f0(d0(aVar, "surfaceSize", j.d(i14, i15, ", "), null));
    }

    @Override // ja.b
    public final void b(ja.b.a aVar, w wVar) {
        wVar.getClass();
        f0("metadata [".concat(e0(aVar)));
        g0(wVar, "  ");
        f0("]");
    }

    @Override // ja.b
    public final void b0(ja.b.a aVar, AudioSink.a aVar2) {
        f0(d0(aVar, "audioTrackInit", a.a(f21232d, aVar2), null));
    }

    @Override // ja.b
    public final void c(ja.b.a aVar, boolean z14) {
        f0(d0(aVar, "skipSilenceEnabled", String.valueOf(z14), null));
    }

    @Override // ja.b
    public final void c0(ja.b.a aVar, int i14) {
        String str;
        f21232d.getClass();
        if (i14 == 0) {
            str = "OFF";
        } else if (i14 != 1) {
            str = i14 != 2 ? CallerData.NA : Rule.ALL;
        } else {
            str = "ONE";
        }
        f0(d0(aVar, "repeatMode", str, null));
    }

    @Override // ja.b
    public final void d(ja.b.a aVar) {
        f0(d0(aVar, "drmKeysRemoved", null, null));
    }

    public final String d0(ja.b.a aVar, String str, String str2, Throwable th3) {
        String strG = e5.g(str, " [", e0(aVar));
        if (th3 instanceof PlaybackException) {
            strG = e5.g(strG, ", errorCode=", ((PlaybackException) th3).getErrorCodeName());
        }
        if (str2 != null) {
            strG = e5.g(strG, ", ", str2);
        }
        String strE = k.e(th3);
        if (!TextUtils.isEmpty(strE)) {
            strG = com.nimbusds.jose.shaded.gson.internal.a.h(strG, "\n  ", strE != null ? u.v(strE, "\n", "\n  ", false) : null, "\n");
        }
        return strG.concat("]");
    }

    @Override // ja.b
    public final void e(ja.b.a aVar, q qVar) {
        qVar.getClass();
        f0(d0(aVar, "videoInputFormat", q.d(qVar), null));
    }

    public final String e0(ja.b.a aVar) {
        Object obj;
        String strH = am.j.h(aVar.f97944c, "window=");
        androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
        if (bVar != null) {
            if (bVar != null && (obj = bVar.f9519a) != null) {
                strH = ((Object) strH) + ", period=" + aVar.f97943b.b(obj);
            }
            if (bVar != null && bVar.b()) {
                String str = ((Object) strH) + ", adGroup=" + (bVar != null ? Integer.valueOf(bVar.f9520b) : null);
                strH = ((Object) str) + ", ad=" + (bVar != null ? Integer.valueOf(bVar.f9521c) : null);
            }
        }
        long j8 = aVar.f97942a - this.f21236c;
        a aVar2 = f21232d;
        StringBuilder sbI = p6.b.i("eventTime=", a.b(aVar2, j8), ", mediaPos=", a.b(aVar2, aVar.f97946e), ", ");
        sbI.append((Object) strH);
        return sbI.toString();
    }

    @Override // ja.b
    public final void f(ja.b.a aVar, g gVar) {
        gVar.getClass();
        f0(d0(aVar, "audioDisabled", null, null));
    }

    @Override // ja.b
    public final void g(ja.b.a aVar, i iVar, sa.j jVar, IOException iOException) {
        iOException.getClass();
        i2.a.j(i2.f36769a, "EventLogger", d0(aVar, "internalError", "loadError", iOException));
    }

    @Override // ja.b
    public final void h(ja.b.a aVar, int i14) {
        String str;
        f21232d.getClass();
        if (i14 == 1) {
            str = "IDLE";
        } else if (i14 == 2) {
            str = "BUFFERING";
        } else if (i14 != 3) {
            str = i14 != 4 ? CallerData.NA : "ENDED";
        } else {
            str = "READY";
        }
        f0(d0(aVar, RemoteConfigConstants.ResponseFieldKey.STATE, str, null));
    }

    @Override // ja.b
    public final void i(ja.b.a aVar, AudioSink.a aVar2) {
        f0(d0(aVar, "audioTrackReleased", a.a(f21232d, aVar2), null));
    }

    @Override // ja.b
    public final void j(ja.b.a aVar, g gVar) {
        gVar.getClass();
        f0(d0(aVar, "audioEnabled", null, null));
    }

    @Override // ja.b
    public final void l(ja.b.a aVar, y yVar) {
        yVar.getClass();
        f0(d0(aVar, "playbackParameters", yVar.toString(), null));
    }

    @Override // ja.b
    public final void m(ja.b.a aVar, boolean z14) {
        f0(d0(aVar, "isPlaying", String.valueOf(z14), null));
    }

    @Override // ja.b
    public final void o(ja.b.a aVar) {
        f0(d0(aVar, "drmKeysLoaded", null, null));
    }

    @Override // ja.b
    public final void q(ja.b.a aVar, sa.j jVar) {
        f0(d0(aVar, "downstreamFormat", q.d(jVar.f158120c), null));
    }

    @Override // ja.b
    public final void r(ja.b.a aVar, String str) {
        f0(d0(aVar, "videoDecoderReleased", str, null));
    }

    @Override // ja.b
    public final void s(ja.b.a aVar, g gVar) {
        gVar.getClass();
        f0(d0(aVar, "videoDisabled", null, null));
    }

    @Override // ja.b
    public final void t(ja.b.a aVar, boolean z14, int i14) {
        String str;
        f21232d.getClass();
        if (i14 == 1) {
            str = "USER_REQUEST";
        } else if (i14 == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i14 == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i14 != 4) {
            str = i14 != 5 ? CallerData.NA : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        f0(d0(aVar, "playWhenReady", z14 + ", " + str, null));
    }

    @Override // ja.b
    public final void u(ja.b.a aVar, sa.j jVar) {
        f0(d0(aVar, "upstreamDiscarded", q.d(jVar.f158120c), null));
    }

    @Override // ja.b
    public final void v(ja.b.a aVar, z.e eVar, z.e eVar2, int i14) {
        String str;
        int i15 = eVar.f8597h;
        int i16 = eVar2.f8597h;
        StringBuilder sb3 = new StringBuilder("reason=");
        f21232d.getClass();
        switch (i14) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = CallerData.NA;
                break;
        }
        sb3.append(str);
        sb3.append(", PositionInfo:old [mediaItem=");
        sb3.append(eVar.f8591b);
        sb3.append(", period=");
        sb3.append(eVar.f8594e);
        sb3.append(", pos=");
        sb3.append(eVar.f8595f);
        if (i15 != -1) {
            sb3.append(", contentPos=");
            sb3.append(eVar.f8596g);
            sb3.append(", adGroup=");
            sb3.append(i15);
            sb3.append(", ad=");
            sb3.append(eVar.f8598i);
        }
        sb3.append("], PositionInfo:new [mediaItem=");
        sb3.append(eVar2.f8591b);
        sb3.append(", period=");
        sb3.append(eVar2.f8594e);
        sb3.append(", pos=");
        sb3.append(eVar2.f8595f);
        if (i16 != -1) {
            sb3.append(", contentPos=");
            sb3.append(eVar2.f8596g);
            sb3.append(", adGroup=");
            sb3.append(i16);
            sb3.append(", ad=");
            sb3.append(eVar2.f8598i);
        }
        sb3.append("]");
        f0(d0(aVar, "positionDiscontinuity", sb3.toString(), null));
    }

    @Override // ja.b
    public final void x(ja.b.a aVar, boolean z14) {
        f0(d0(aVar, "loading", String.valueOf(z14), null));
    }

    @Override // ja.b
    public final void y(ja.b.a aVar, int i14, long j8, long j14) {
        i2.a.j(i2.f36769a, "EventLogger", d0(aVar, "audioTrackUnderrun", i14 + ", " + j8 + ", " + j14, null));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbu1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_TIMELINE_ITEM_LINES", "I", "Ljava/text/NumberFormat;", "TIME_FORMAT", "Ljava/text/NumberFormat;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final String a(a aVar, AudioSink.a aVar2) {
            aVar.getClass();
            int i14 = aVar2.f8668a;
            int i15 = aVar2.f8670c;
            int i16 = aVar2.f8669b;
            boolean z14 = aVar2.f8671d;
            boolean z15 = aVar2.f8672e;
            int i17 = aVar2.f8673f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            sb3.append(",");
            sb3.append(i15);
            sb3.append(",");
            sb3.append(i16);
            com.airbnb.lottie.animation.keyframe.a.v(",", ",", sb3, z14, z15);
            return x.e(sb3, i17, ",");
        }

        public static final String b(a aVar, long j8) {
            aVar.getClass();
            return j8 == C.TIME_UNSET ? CallerData.NA : b.f21233e.format(j8 / 1000.0f);
        }

        private a() {
        }
    }
}
