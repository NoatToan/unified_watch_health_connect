package ma;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.x;
import bb.f0;
import bb.g0;
import bb.l0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.w;
import fa.z;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r implements bb.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f117602i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f117603j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f117605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f117606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.n.a f117607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f117608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bb.p f117609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f117610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117611h;

    public r(String str, w wVar, yb.n.a aVar, boolean z14) {
        this.f117604a = str;
        this.f117605b = wVar;
        this.f117606c = new fa.r();
        this.f117610g = new byte[1024];
        this.f117607d = aVar;
        this.f117608e = z14;
    }

    @Override // bb.n
    public final int b(bb.o oVar, f0 f0Var) throws ParserException {
        String strH;
        this.f117609f.getClass();
        int length = (int) oVar.getLength();
        int i14 = this.f117611h;
        byte[] bArr = this.f117610g;
        if (i14 == bArr.length) {
            this.f117610g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f117610g;
        int i15 = this.f117611h;
        int i16 = oVar.read(bArr2, i15, bArr2.length - i15);
        if (i16 != -1) {
            int i17 = this.f117611h + i16;
            this.f117611h = i17;
            if (length == -1 || i17 != length) {
                return 0;
            }
        }
        fa.r rVar = new fa.r(this.f117610g);
        gc.g.d(rVar);
        String strH2 = rVar.h(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = rVar.h(StandardCharsets.UTF_8);
                    if (strH3 == null) {
                        break;
                    }
                    if (gc.g.f76827a.matcher(strH3).matches()) {
                        do {
                            strH = rVar.h(StandardCharsets.UTF_8);
                            if (strH == null) {
                                break;
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = gc.e.f76801a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = gc.g.c(strGroup);
                int i18 = z.f70071a;
                long jB = this.f117605b.b(z.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                l0 l0VarF = f(jB - jC2);
                byte[] bArr3 = this.f117610g;
                int i19 = this.f117611h;
                fa.r rVar2 = this.f117606c;
                rVar2.E(bArr3, i19);
                l0VarF.f(this.f117611h, rVar2);
                l0VarF.c(jB, 1, this.f117611h, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f117602i.matcher(strH2);
                if (!matcher3.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2), null);
                }
                Matcher matcher4 = f117603j.matcher(strH2);
                if (!matcher4.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = gc.g.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j8 = Long.parseLong(strGroup3);
                int i24 = z.f70071a;
                jU = z.U(j8, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strH2 = rVar.h(StandardCharsets.UTF_8);
        }
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        if (this.f117608e) {
            pVar = new yb.o(pVar, this.f117607d);
        }
        this.f117609f = pVar;
        pVar.a(new g0.b(C.TIME_UNSET));
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) {
        bb.i iVar = (bb.i) oVar;
        iVar.peekFully(this.f117610g, 0, 6, false);
        byte[] bArr = this.f117610g;
        fa.r rVar = this.f117606c;
        rVar.E(bArr, 6);
        if (gc.g.a(rVar)) {
            return true;
        }
        iVar.peekFully(this.f117610g, 6, 3, false);
        rVar.E(this.f117610g, 9);
        return gc.g.a(rVar);
    }

    public final l0 f(long j8) {
        l0 l0VarTrack = this.f117609f.track(0, 3);
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8411m = x.n(MimeTypes.TEXT_VTT);
        bVar.f8402d = this.f117604a;
        bVar.f8416r = j8;
        l0VarTrack.d(bVar.a());
        this.f117609f.endTracks();
        return l0VarTrack;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        throw new IllegalStateException();
    }

    @Deprecated
    public r(String str, w wVar) {
        this(str, wVar, yb.n.a.f195662a, false);
    }
}
