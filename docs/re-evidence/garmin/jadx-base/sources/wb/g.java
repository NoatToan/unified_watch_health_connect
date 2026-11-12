package wb;

import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.common.x;
import bb.e0;
import bb.o0;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import fa.r;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f183839o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f183840p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f183841n;

    public static boolean e(r rVar, byte[] bArr) {
        if (rVar.a() < bArr.length) {
            return false;
        }
        int i14 = rVar.f70055b;
        byte[] bArr2 = new byte[bArr.length];
        rVar.e(bArr2, 0, bArr.length);
        rVar.G(i14);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // wb.h
    public final long b(r rVar) {
        byte[] bArr = rVar.f70054a;
        return (((long) this.f183850i) * e0.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // wb.h
    public final boolean c(r rVar, long j8, h.b bVar) {
        if (e(rVar, f183839o)) {
            byte[] bArrCopyOf = Arrays.copyOf(rVar.f70054a, rVar.f70056c);
            int i14 = bArrCopyOf[9] & UnsignedBytes.MAX_VALUE;
            ArrayList arrayListA = e0.a(bArrCopyOf);
            if (bVar.f183855a == null) {
                q.b bVar2 = new q.b();
                bVar2.f8411m = x.n(MimeTypes.AUDIO_OPUS);
                bVar2.B = i14;
                bVar2.C = OpusUtil.SAMPLE_RATE;
                bVar2.f8414p = arrayListA;
                bVar.f183855a = bVar2.a();
                return true;
            }
        } else {
            if (!e(rVar, f183840p)) {
                fa.a.f(bVar.f183855a);
                return false;
            }
            fa.a.f(bVar.f183855a);
            if (!this.f183841n) {
                this.f183841n = true;
                rVar.H(8);
                w wVarA = o0.a(ImmutableList.copyOf(o0.b(rVar, false, false).f17244a));
                if (wVarA != null) {
                    q.b bVarA = bVar.f183855a.a();
                    bVarA.f8409k = wVarA.d(bVar.f183855a.f8384l);
                    bVar.f183855a = bVarA.a();
                    return true;
                }
            }
        }
        return true;
    }

    @Override // wb.h
    public final void d(boolean z14) {
        super.d(z14);
        if (z14) {
            this.f183841n = false;
        }
    }
}
