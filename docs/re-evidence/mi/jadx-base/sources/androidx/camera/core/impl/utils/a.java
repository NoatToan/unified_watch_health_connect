package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import defpackage.eh8;
import defpackage.g6i;
import defpackage.lh8;
import defpackage.m73;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class a extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(eh8.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExifData f1754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1755b;
    public final ByteBuffer c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.a$a, reason: collision with other inner class name */
    public static final class C0014a {
        public static boolean a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public a(OutputStream outputStream, ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f1755b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = 0;
        this.f1754a = exifData;
    }

    public final int a(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, i - this.c.position());
        this.c.put(bArr, i2, iMin);
        return iMin;
    }

    public final void b(m73 m73Var) throws IOException {
        lh8[][] lh8VarArr = ExifData.i;
        int[] iArr = new int[lh8VarArr.length];
        int[] iArr2 = new int[lh8VarArr.length];
        for (lh8 lh8Var : ExifData.g) {
            for (int i = 0; i < ExifData.i.length; i++) {
                this.f1754a.b(i).remove(lh8Var.f25071b);
            }
        }
        if (!this.f1754a.b(1).isEmpty()) {
            this.f1754a.b(0).put(ExifData.g[1].f25071b, eh8.f(0L, this.f1754a.c()));
        }
        if (!this.f1754a.b(2).isEmpty()) {
            this.f1754a.b(0).put(ExifData.g[2].f25071b, eh8.f(0L, this.f1754a.c()));
        }
        if (!this.f1754a.b(3).isEmpty()) {
            this.f1754a.b(1).put(ExifData.g[3].f25071b, eh8.f(0L, this.f1754a.c()));
        }
        for (int i2 = 0; i2 < ExifData.i.length; i2++) {
            Iterator<Map.Entry<String, eh8>> it = this.f1754a.b(i2).entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i3 += iJ;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < ExifData.i.length; i4++) {
            if (!this.f1754a.b(i4).isEmpty()) {
                iArr[i4] = size;
                size += (this.f1754a.b(i4).size() * 12) + 6 + iArr2[i4];
            }
        }
        int i5 = size + 8;
        if (!this.f1754a.b(1).isEmpty()) {
            this.f1754a.b(0).put(ExifData.g[1].f25071b, eh8.f(iArr[1], this.f1754a.c()));
        }
        if (!this.f1754a.b(2).isEmpty()) {
            this.f1754a.b(0).put(ExifData.g[2].f25071b, eh8.f(iArr[2], this.f1754a.c()));
        }
        if (!this.f1754a.b(3).isEmpty()) {
            this.f1754a.b(1).put(ExifData.g[3].f25071b, eh8.f(iArr[3], this.f1754a.c()));
        }
        m73Var.m(i5);
        m73Var.write(g);
        m73Var.d(this.f1754a.c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        m73Var.a(this.f1754a.c());
        m73Var.m(42);
        m73Var.l(8L);
        for (int i6 = 0; i6 < ExifData.i.length; i6++) {
            if (!this.f1754a.b(i6).isEmpty()) {
                m73Var.m(this.f1754a.b(i6).size());
                int size2 = iArr[i6] + 2 + (this.f1754a.b(i6).size() * 12) + 4;
                for (Map.Entry<String, eh8> entry : this.f1754a.b(i6).entrySet()) {
                    int i7 = ((lh8) g6i.h(ExifData.b.f.get(i6).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f25070a;
                    eh8 value = entry.getValue();
                    int iJ2 = value.j();
                    m73Var.m(i7);
                    m73Var.m(value.f16641a);
                    m73Var.c(value.f16642b);
                    if (iJ2 > 4) {
                        m73Var.l(size2);
                        size2 += iJ2;
                    } else {
                        m73Var.write(value.d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                m73Var.b(0);
                                iJ2++;
                            }
                        }
                    }
                }
                m73Var.l(0L);
                Iterator<Map.Entry<String, eh8>> it2 = this.f1754a.b(i6).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().d;
                    if (bArr.length > 4) {
                        m73Var.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        m73Var.a(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.e;
            if ((i3 <= 0 && this.f <= 0 && this.d == 2) || i2 <= 0) {
                break;
            }
            if (i3 > 0) {
                int iMin = Math.min(i2, i3);
                i2 -= iMin;
                this.e -= iMin;
                i += iMin;
            }
            int i4 = this.f;
            if (i4 > 0) {
                int iMin2 = Math.min(i2, i4);
                ((FilterOutputStream) this).out.write(bArr, i, iMin2);
                i2 -= iMin2;
                this.f -= iMin2;
                i += iMin2;
            }
            if (i2 == 0) {
                return;
            }
            int i5 = this.d;
            if (i5 == 0) {
                int iA = a(2, bArr, i, i2);
                i += iA;
                i2 -= iA;
                if (this.c.position() < 2) {
                    return;
                }
                this.c.rewind();
                if (this.c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.c.array(), 0, 2);
                this.d = 1;
                this.c.rewind();
                m73 m73Var = new m73(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                m73Var.d((short) -31);
                b(m73Var);
            } else if (i5 != 1) {
                continue;
            } else {
                int iA2 = a(4, bArr, i, i2);
                i += iA2;
                i2 -= iA2;
                if (this.c.position() == 2 && this.c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.c.array(), 0, 2);
                    this.c.rewind();
                }
                if (this.c.position() < 4) {
                    return;
                }
                this.c.rewind();
                short s = this.c.getShort();
                if (s == -31) {
                    this.e = (this.c.getShort() & UShort.MAX_VALUE) - 2;
                    this.d = 2;
                } else if (C0014a.a(s)) {
                    ((FilterOutputStream) this).out.write(this.c.array(), 0, 4);
                    this.d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.c.array(), 0, 4);
                    this.f = (this.c.getShort() & UShort.MAX_VALUE) - 2;
                }
                this.c.rewind();
            }
        }
        if (i2 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f1755b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
