package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import defpackage.et1;
import defpackage.kgg;
import defpackage.okh;
import defpackage.snp;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f7915b;
    public final okh c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public b(snp snpVar) {
        super(snpVar);
        this.f7915b = new okh(kgg.f23821a);
        this.c = new okh(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(okh okhVar) throws TagPayloadReader.UnsupportedFormatException {
        int iD = okhVar.D();
        int i = (iD >> 4) & 15;
        int i2 = iD & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(okh okhVar, long j) throws ParserException {
        int iD = okhVar.D();
        long jO = j + (((long) okhVar.o()) * 1000);
        if (iD == 0 && !this.e) {
            okh okhVar2 = new okh(new byte[okhVar.a()]);
            okhVar.j(okhVar2.d(), 0, okhVar.a());
            et1 et1VarB = et1.b(okhVar2);
            this.d = et1VarB.f17037b;
            this.f7913a.b(new Format.b().e0("video/avc").I(et1VarB.f).j0(et1VarB.c).Q(et1VarB.d).a0(et1VarB.e).T(et1VarB.f17036a).E());
            this.e = true;
            return false;
        }
        if (iD != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] bArrD = this.c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (okhVar.a() > 0) {
            okhVar.j(this.c.d(), i2, this.d);
            this.c.P(0);
            int iH = this.c.H();
            this.f7915b.P(0);
            this.f7913a.d(this.f7915b, 4);
            this.f7913a.d(okhVar, iH);
            i3 = i3 + 4 + iH;
        }
        this.f7913a.e(jO, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
