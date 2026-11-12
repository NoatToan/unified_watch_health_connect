package bb;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f17266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f17267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.w f17268l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f17269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f17270b;

        public a(long[] jArr, long[] jArr2) {
            this.f17269a = jArr;
            this.f17270b = jArr2;
        }
    }

    public v(byte[] bArr, int i14) {
        fa.q qVar = new fa.q(bArr);
        qVar.m(i14 * 8);
        this.f17257a = qVar.g(16);
        this.f17258b = qVar.g(16);
        this.f17259c = qVar.g(24);
        this.f17260d = qVar.g(24);
        int iG = qVar.g(20);
        this.f17261e = iG;
        this.f17262f = g(iG);
        this.f17263g = qVar.g(3) + 1;
        int iG2 = qVar.g(5) + 1;
        this.f17264h = iG2;
        this.f17265i = d(iG2);
        this.f17266j = qVar.i(36);
        this.f17267k = null;
        this.f17268l = null;
    }

    public static int d(int i14) {
        if (i14 == 8) {
            return 1;
        }
        if (i14 == 12) {
            return 2;
        }
        if (i14 == 16) {
            return 4;
        }
        if (i14 != 20) {
            return i14 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int g(int i14) {
        switch (i14) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public final v a(ImmutableList immutableList) {
        androidx.media3.common.w wVar = new androidx.media3.common.w(immutableList);
        androidx.media3.common.w wVar2 = this.f17268l;
        if (wVar2 != null) {
            wVar = wVar2.d(wVar);
        }
        androidx.media3.common.w wVar3 = wVar;
        return new v(this.f17257a, this.f17258b, this.f17259c, this.f17260d, this.f17261e, this.f17263g, this.f17264h, this.f17266j, this.f17267k, wVar3);
    }

    public final v b(a aVar) {
        return new v(this.f17257a, this.f17258b, this.f17259c, this.f17260d, this.f17261e, this.f17263g, this.f17264h, this.f17266j, aVar, this.f17268l);
    }

    public final v c(List<String> list) {
        androidx.media3.common.w wVarA = o0.a(list);
        androidx.media3.common.w wVar = this.f17268l;
        if (wVar != null) {
            wVarA = wVar.d(wVarA);
        }
        androidx.media3.common.w wVar2 = wVarA;
        return new v(this.f17257a, this.f17258b, this.f17259c, this.f17260d, this.f17261e, this.f17263g, this.f17264h, this.f17266j, this.f17267k, wVar2);
    }

    public final long e() {
        long j8 = this.f17266j;
        return j8 == 0 ? C.TIME_UNSET : (j8 * 1000000) / ((long) this.f17261e);
    }

    public final androidx.media3.common.q f(byte[] bArr, androidx.media3.common.w wVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i14 = this.f17260d;
        if (i14 <= 0) {
            i14 = -1;
        }
        androidx.media3.common.w wVar2 = this.f17268l;
        if (wVar2 != null) {
            wVar = wVar2.d(wVar);
        }
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.AUDIO_FLAC);
        bVar.f8412n = i14;
        bVar.B = this.f17263g;
        bVar.C = this.f17261e;
        bVar.D = fa.z.x(this.f17264h);
        bVar.f8414p = Collections.singletonList(bArr);
        bVar.f8409k = wVar;
        return bVar.a();
    }

    private v(int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j8, a aVar, androidx.media3.common.w wVar) {
        this.f17257a = i14;
        this.f17258b = i15;
        this.f17259c = i16;
        this.f17260d = i17;
        this.f17261e = i18;
        this.f17262f = g(i18);
        this.f17263g = i19;
        this.f17264h = i24;
        this.f17265i = d(i24);
        this.f17266j = j8;
        this.f17267k = aVar;
        this.f17268l = wVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j8, ArrayList<String> arrayList, ArrayList<nb.a> arrayList2) {
        androidx.media3.common.w wVarA = o0.a(arrayList);
        this(i14, i15, i16, i17, i18, i19, i24, j8, (a) null, (wVarA == null && arrayList2.isEmpty()) ? null : new androidx.media3.common.w(arrayList2).d(wVarA));
    }
}
