package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k4q extends odm {
    public final okh o;
    public final boolean p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f23444r;
    public final String s;
    public final float t;
    public final int u;

    public k4q(List<byte[]> list) {
        super("Tx3gDecoder");
        this.o = new okh();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.q = 0;
            this.f23444r = -1;
            this.s = "sans-serif";
            this.p = false;
            this.t = 0.85f;
            this.u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.q = bArr[24];
        this.f23444r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.s = "Serif".equals(wlq.F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.u = i;
        boolean z = (bArr[0] & 32) != 0;
        this.p = z;
        if (z) {
            this.t = wlq.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.t = 0.85f;
        }
    }

    public static void C(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    public static String G(okh okhVar) throws SubtitleDecoderException {
        char cG;
        C(okhVar.a() >= 2);
        int iJ = okhVar.J();
        if (iJ == 0) {
            return "";
        }
        return (okhVar.a() < 2 || !((cG = okhVar.g()) == 65279 || cG == 65534)) ? okhVar.B(iJ, bu3.c) : okhVar.B(iJ, bu3.f);
    }

    public final void B(okh okhVar, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        C(okhVar.a() >= 12);
        int iJ = okhVar.J();
        int iJ2 = okhVar.J();
        okhVar.Q(2);
        int iD = okhVar.D();
        okhVar.Q(1);
        int iN = okhVar.n();
        if (iJ2 > spannableStringBuilder.length()) {
            int length = spannableStringBuilder.length();
            StringBuilder sb = new StringBuilder(68);
            sb.append("Truncating styl end (");
            sb.append(iJ2);
            sb.append(") to cueText.length() (");
            sb.append(length);
            sb.append(").");
            toe.h("Tx3gDecoder", sb.toString());
            iJ2 = spannableStringBuilder.length();
        }
        if (iJ < iJ2) {
            int i = iJ2;
            E(spannableStringBuilder, iD, this.q, iJ, i, 0);
            D(spannableStringBuilder, iN, this.f23444r, iJ, i, 0);
            return;
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("Ignoring styl with start (");
        sb2.append(iJ);
        sb2.append(") >= end (");
        sb2.append(iJ2);
        sb2.append(").");
        toe.h("Tx3gDecoder", sb2.toString());
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.o.N(bArr, i);
        String strG = G(this.o);
        if (strG.isEmpty()) {
            return l4q.f24667b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        E(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f23444r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float fQ = this.t;
        while (this.o.a() >= 8) {
            int iE = this.o.e();
            int iN = this.o.n();
            int iN2 = this.o.n();
            if (iN2 == 1937013100) {
                C(this.o.a() >= 2);
                int iJ = this.o.J();
                for (int i2 = 0; i2 < iJ; i2++) {
                    B(this.o, spannableStringBuilder);
                }
            } else if (iN2 == 1952608120 && this.p) {
                C(this.o.a() >= 2);
                fQ = wlq.q(this.o.J() / this.u, 0.0f, 0.95f);
            }
            this.o.P(iE + iN);
        }
        return new l4q(new h55.b().o(spannableStringBuilder).h(fQ, 0).i(0).a());
    }
}
