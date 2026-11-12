package com.google.typography.font.sfntly;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import defpackage.tzo;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9788a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f9789b;

    /* JADX INFO: renamed from: com.google.typography.font.sfntly.a$a, reason: collision with other inner class name */
    public enum EnumC0261a {
        TTCTag(0),
        Version(4),
        numFonts(8),
        OffsetTable(12),
        ulDsigTag(0),
        ulDsigLength(4),
        ulDsigOffset(8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9791a;

        EnumC0261a(int i2) {
            this.f9791a = i2;
        }
    }

    public static a b() {
        return new a();
    }

    public static boolean c(jgj jgjVar) {
        byte[] bArr = new byte[4];
        jgjVar.n(0, bArr, 0, 4);
        return tzo.f35225a == tzo.c(bArr);
    }

    public boolean a() {
        return this.f9788a;
    }

    public final Font[] d(apr aprVar) throws IOException {
        Font.b[] bVarArrE = e(aprVar);
        int length = bVarArrE.length;
        Font[] fontArr = new Font[length];
        for (int i = 0; i < length; i++) {
            fontArr[i] = bVarArrE[i].a();
        }
        return fontArr;
    }

    public final Font.b[] e(apr aprVar) throws IOException {
        aprVar.u(EnumC0261a.TTCTag.f9791a);
        aprVar.p(EnumC0261a.Version.f9791a);
        int iU = aprVar.u(EnumC0261a.numFonts.f9791a);
        Font.b[] bVarArr = new Font.b[iU];
        int size = EnumC0261a.OffsetTable.f9791a;
        int i = 0;
        while (i < iU) {
            bVarArr[i] = h(aprVar, aprVar.u(size));
            i++;
            size += FontData.DataSize.ULONG.size();
        }
        return bVarArr;
    }

    public Font[] f(byte[] bArr) throws IOException {
        apr aprVarD = apr.D(bArr);
        return c(aprVarD) ? d(aprVarD) : new Font[]{g(aprVarD)};
    }

    public final Font g(apr aprVar) throws IOException {
        return h(aprVar, 0).a();
    }

    public final Font.b h(apr aprVar, int i) throws IOException {
        a();
        return Font.b.e(this, aprVar, i);
    }

    public Font.b i() {
        return Font.b.d(this);
    }

    public void j(Font font, OutputStream outputStream) throws IOException {
        font.l(outputStream, this.f9789b);
    }
}
