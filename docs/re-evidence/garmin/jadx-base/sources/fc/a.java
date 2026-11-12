package fc;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b71.i;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import fa.g;
import fa.k;
import fa.r;
import fa.z;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import yb.c;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f70385a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f70391g;

    public a(List<byte[]> list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f70387c = 0;
            this.f70388d = -1;
            this.f70389e = C.SANS_SERIF_NAME;
            this.f70386b = false;
            this.f70390f = 0.85f;
            this.f70391g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f70387c = bArr[24];
        this.f70388d = ((bArr[26] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[27] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[28] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[29] & UnsignedBytes.MAX_VALUE);
        int length = bArr.length - 43;
        int i14 = z.f70071a;
        this.f70389e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? C.SERIF_NAME : str;
        int i15 = bArr[25] * Ascii.DC4;
        this.f70391g = i15;
        boolean z14 = (bArr[0] & 32) != 0;
        this.f70386b = z14;
        if (z14) {
            this.f70390f = z.h(((bArr[11] & UnsignedBytes.MAX_VALUE) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8)) / i15, 0.0f, 0.95f);
        } else {
            this.f70390f = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i14, int i15, int i16, int i17, int i18) {
        if (i14 != i15) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i14 >>> 8) | ((i14 & 255) << 24)), i16, i17, i18 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i14, int i15, int i16, int i17, int i18) {
        if (i14 != i15) {
            int i19 = i18 | 33;
            boolean z14 = (i14 & 1) != 0;
            boolean z15 = (i14 & 2) != 0;
            if (z14) {
                if (z15) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i16, i17, i19);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i16, i17, i19);
                }
            } else if (z15) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i16, i17, i19);
            }
            boolean z16 = (i14 & 4) != 0;
            if (z16) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i16, i17, i19);
            }
            if (z16 || z14 || z15) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i16, i17, i19);
        }
    }

    @Override // yb.n
    public final int a() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, g<c> gVar) {
        String strS;
        r rVar = this.f70385a;
        rVar.E(bArr, i14 + i15);
        rVar.G(i14);
        int i16 = 1;
        int i17 = 0;
        fa.a.a(rVar.a() >= 2);
        int iA = rVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i18 = rVar.f70055b;
            Charset charsetC = rVar.C();
            int i19 = iA - (rVar.f70055b - i18);
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strS = rVar.s(i19, charsetC);
        }
        if (strS.isEmpty()) {
            gVar.accept(new c(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        e(spannableStringBuilder, this.f70387c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.f70388d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f70389e;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f70390f;
        while (rVar.a() >= 8) {
            int i24 = rVar.f70055b;
            int iG = rVar.g();
            int iG2 = rVar.g();
            if (iG2 == 1937013100) {
                fa.a.a(rVar.a() >= 2 ? i16 : i17);
                int iA2 = rVar.A();
                int i25 = i17;
                while (i25 < iA2) {
                    fa.a.a(rVar.a() >= 12 ? i16 : i17);
                    int iA3 = rVar.A();
                    int iA4 = rVar.A();
                    rVar.H(2);
                    int i26 = i25;
                    int iU = rVar.u();
                    rVar.H(i16);
                    int iG3 = rVar.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbI = i.i(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbI.append(spannableStringBuilder.length());
                        sbI.append(").");
                        k.g(sbI.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        k.g("Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                    } else {
                        int i27 = iA4;
                        e(spannableStringBuilder, iU, this.f70387c, iA3, i27, 0);
                        d(spannableStringBuilder, iG3, this.f70388d, iA3, i27, 0);
                    }
                    i25 = i26 + 1;
                    i16 = 1;
                    i17 = 0;
                }
            } else if (iG2 == 1952608120 && this.f70386b) {
                fa.a.a(rVar.a() >= 2);
                fH = z.h(rVar.A() / this.f70391g, 0.0f, 0.95f);
            }
            rVar.G(i24 + iG);
            i16 = 1;
            i17 = 0;
        }
        ea.a.b bVar2 = new ea.a.b();
        bVar2.f63568a = spannableStringBuilder;
        bVar2.f63572e = fH;
        bVar2.f63573f = 0;
        bVar2.f63574g = 0;
        gVar.accept(new c(ImmutableList.of(bVar2.a()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
