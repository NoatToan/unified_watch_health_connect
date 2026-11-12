package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class scr implements il8 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rfp f33515b;
    public kl8 d;
    public int f;
    public final okh c = new okh();
    public byte[] e = new byte[1024];

    public scr(String str, rfp rfpVar) {
        this.f33514a = str;
        this.f33515b = rfpVar;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.d = kl8Var;
        kl8Var.k(new arl.b(-9223372036854775807L));
    }

    public final snp c(long j) {
        snp snpVarD = this.d.d(0, 3);
        snpVarD.b(new Format.b().e0("text/vtt").V(this.f33514a).i0(j).E());
        this.d.m();
        return snpVarD;
    }

    public final void d() throws ParserException {
        okh okhVar = new okh(this.e);
        tcr.e(okhVar);
        long jF = 0;
        long jD = 0;
        for (String strP = okhVar.p(); !TextUtils.isEmpty(strP); strP = okhVar.p()) {
            if (strP.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = g.matcher(strP);
                if (!matcher.find()) {
                    throw new ParserException(strP.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strP) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = h.matcher(strP);
                if (!matcher2.find()) {
                    throw new ParserException(strP.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strP) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                jD = tcr.d((String) rk1.e(matcher.group(1)));
                jF = rfp.f(Long.parseLong((String) rk1.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = tcr.a(okhVar);
        if (matcherA == null) {
            c(0L);
            return;
        }
        long jD2 = tcr.d((String) rk1.e(matcherA.group(1)));
        long jB = this.f33515b.b(rfp.j((jF + jD2) - jD));
        snp snpVarC = c(jB - jD2);
        this.c.N(this.e, this.f);
        snpVarC.d(this.c, this.f);
        snpVarC.e(jB, 1, this.f, 0, null);
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.e(this.d);
        int length = (int) jl8Var.getLength();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int i3 = jl8Var.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f + i3;
            this.f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        jl8Var.k(this.e, 0, 6, false);
        this.c.N(this.e, 6);
        if (tcr.b(this.c)) {
            return true;
        }
        jl8Var.k(this.e, 6, 3, false);
        this.c.N(this.e, 9);
        return tcr.b(this.c);
    }

    @Override // defpackage.il8
    public void release() {
    }
}
