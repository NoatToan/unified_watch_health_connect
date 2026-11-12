package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.truetype.Glyph;
import com.google.typography.font.sfntly.table.truetype.GlyphTable;
import com.google.typography.font.sfntly.table.truetype.a;
import com.google.typography.font.sfntly.table.truetype.b;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class q0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayOutputStream f30951b;
    public final ByteArrayOutputStream c;
    public final ByteArrayOutputStream d;

    public q0b() {
        this(true);
    }

    public static void g(OutputStream outputStream, int i) throws IOException {
        short s = (short) i;
        if (s >= 750 || s <= -750) {
            outputStream.write(253);
            outputStream.write((byte) (s >> 8));
            outputStream.write((byte) (s & 255));
            return;
        }
        if (s < 0) {
            outputStream.write(250);
            s = (short) (-s);
        }
        if (s >= 250) {
            s = (short) (s - 250);
            if (s >= 250) {
                s = (short) (s - 250);
                outputStream.write(254);
            } else {
                outputStream.write(255);
            }
        }
        outputStream.write((byte) s);
    }

    public static void h(OutputStream outputStream, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < 253) {
            outputStream.write((byte) i);
            return;
        }
        if (i < 506) {
            outputStream.write(255);
            outputStream.write((byte) (i - 253));
        } else if (i < 762) {
            outputStream.write(254);
            outputStream.write((byte) (i - 506));
        } else {
            outputStream.write(253);
            outputStream.write((byte) (i >> 8));
            outputStream.write((byte) (i & 255));
        }
    }

    public void a(Font font) {
        tie tieVar = (tie) font.h(tzo.m);
        int iR = tieVar.r();
        GlyphTable glyphTable = (GlyphTable) font.h(tzo.l);
        for (int i = 0; i < iR; i++) {
            j(glyphTable.l(tieVar.o(i), tieVar.m(i)));
        }
    }

    public final void b(OutputStream outputStream, List<Integer> list) throws IOException {
        int i;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if ((i2 & 1) == 0) {
                int iIntValue = list.get(i3).intValue();
                if (i2 == 0 && i3 >= 2 && (i = i3 + 2) < size && iIntValue == list.get(i3 - 2).intValue() && iIntValue == list.get(i).intValue()) {
                    int i4 = i3 + 4;
                    if (i4 >= size || iIntValue != list.get(i4).intValue()) {
                        outputStream.write(VibrateModeSetViewModel.DEFAULT_BBJI);
                        i2 = 4;
                    } else {
                        outputStream.write(252);
                        i2 = 20;
                    }
                } else {
                    g(outputStream, list.get(i3).intValue());
                }
            }
            i2 >>= 1;
        }
    }

    public byte[] c() {
        return this.d.toByteArray();
    }

    public byte[] d() {
        return this.f30951b.toByteArray();
    }

    public byte[] e() {
        return this.c.toByteArray();
    }

    public final void f(Glyph glyph) throws IOException {
        int i;
        int iS;
        int iR = glyph.r();
        jgj jgjVarT = glyph.t();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iR) {
                break;
            }
            int iS2 = jgjVarT.s(i2);
            if (iS2 == 64 || iS2 == 65) {
                i = (iS2 & 1) + 1;
                iS = jgjVarT.s(i3);
                i3 = i2 + 2;
            } else {
                if (iS2 < 176 || iS2 >= 192) {
                    break;
                }
                iS = (iS2 & 7) + 1;
                i = ((iS2 & 8) >> 3) + 1;
            }
            if ((i * iS) + i2 > iR) {
                break;
            }
            i2 = i3;
            for (int i4 = 0; i4 < iS; i4++) {
                if (i == 1) {
                    arrayList.add(Integer.valueOf(jgjVarT.s(i2)));
                } else {
                    arrayList.add(Integer.valueOf(jgjVarT.r(i2)));
                }
                i2 += i;
            }
        }
        int i5 = iR - i2;
        h(this.f30951b, arrayList.size());
        h(this.f30951b, i5);
        b(this.c, arrayList);
        if (i5 > 0) {
            jgjVarT.z(i2).k(this.d);
        }
    }

    public final void i(a aVar) throws IOException {
        n(-1);
        n(aVar.x());
        n(aVar.A());
        n(aVar.w());
        n(aVar.z());
        int i = 0;
        boolean z = false;
        while (i < aVar.G()) {
            int iE = aVar.E(i);
            n(iE);
            boolean z2 = (iE & 256) != 0;
            n(aVar.F(i));
            if ((iE & 1) == 0) {
                this.f30951b.write(aVar.B(i));
                this.f30951b.write(aVar.C(i));
            } else {
                n(aVar.B(i));
                n(aVar.C(i));
            }
            if (aVar.I(i) != 0) {
                try {
                    this.f30951b.write(aVar.H(i));
                } catch (IOException unused) {
                }
            }
            i++;
            z = z2;
        }
        if (z) {
            k(aVar);
        }
    }

    public final void j(Glyph glyph) {
        if (glyph != null) {
            try {
                if (glyph.e() == 0) {
                    n(0);
                } else if (glyph instanceof b) {
                    l((b) glyph);
                } else if (glyph instanceof a) {
                    i((a) glyph);
                }
            } catch (IOException e) {
                throw new RuntimeException("unexpected IOException writing glyph data", e);
            }
        } else {
            n(0);
        }
    }

    public final void k(Glyph glyph) throws IOException {
        if (this.f30950a) {
            f(glyph);
            return;
        }
        int iR = glyph.r();
        h(this.f30951b, 0);
        h(this.f30951b, iR);
        if (iR > 0) {
            glyph.t().k(this.d);
        }
    }

    public final void l(b bVar) throws IOException {
        int iU = bVar.u();
        n(iU);
        int i = 0;
        while (i < iU) {
            h(this.f30951b, bVar.E(i) - (i == 0 ? 1 : 0));
            i++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iU; i4++) {
            int iE = bVar.E(i4);
            int i5 = 0;
            while (i5 < iE) {
                int iH = bVar.H(i4, i5);
                int I = bVar.I(i4, i5);
                m(byteArrayOutputStream, bVar.F(i4, i5), iH - i2, I - i3);
                i5++;
                i2 = iH;
                i3 = I;
            }
        }
        byteArrayOutputStream.writeTo(this.f30951b);
        if (iU > 0) {
            k(bVar);
        }
    }

    public void m(OutputStream outputStream, boolean z, int i, int i2) throws IOException {
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int i3 = z ? 0 : 128;
        int i4 = i < 0 ? 0 : 1;
        int i5 = i2 >= 0 ? 1 : 0;
        int i6 = (i5 * 2) + i4;
        if (i == 0 && iAbs2 < 1280) {
            this.f30951b.write(i3 + ((iAbs2 & 3840) >> 7) + i5);
            outputStream.write(iAbs2 & 255);
            return;
        }
        if (i2 == 0 && iAbs < 1280) {
            this.f30951b.write(i3 + 10 + ((iAbs & 3840) >> 7) + i4);
            outputStream.write(iAbs & 255);
            return;
        }
        if (iAbs < 65 && iAbs2 < 65) {
            int i7 = iAbs - 1;
            int i8 = iAbs2 - 1;
            this.f30951b.write(i3 + 20 + (i7 & 48) + ((i8 & 48) >> 2) + i6);
            outputStream.write(((i7 & 15) << 4) | (i8 & 15));
            return;
        }
        if (iAbs < 769 && iAbs2 < 769) {
            int i9 = iAbs - 1;
            int i10 = iAbs2 - 1;
            this.f30951b.write(i3 + 84 + (((i9 & 768) >> 8) * 12) + ((i10 & 768) >> 6) + i6);
            outputStream.write(i9 & 255);
            outputStream.write(i10 & 255);
            return;
        }
        if (iAbs < 4096 && iAbs2 < 4096) {
            this.f30951b.write(i3 + 120 + i6);
            outputStream.write(iAbs >> 4);
            outputStream.write(((iAbs & 15) << 4) | (iAbs2 >> 8));
            outputStream.write(iAbs2 & 255);
            return;
        }
        this.f30951b.write(i3 + 124 + i6);
        outputStream.write(iAbs >> 8);
        outputStream.write(iAbs & 255);
        outputStream.write(iAbs2 >> 8);
        outputStream.write(iAbs2 & 255);
    }

    public final void n(int i) {
        this.f30951b.write(i >> 8);
        this.f30951b.write(i & 255);
    }

    public q0b(boolean z) {
        this.f30950a = z;
        this.f30951b = new ByteArrayOutputStream();
        this.c = new ByteArrayOutputStream();
        this.d = new ByteArrayOutputStream();
    }
}
