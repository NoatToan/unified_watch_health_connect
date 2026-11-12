package j0;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f95945g = "Exif\u0000\u0000".getBytes(i.f95920d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f95946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f95947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f95948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f95951f;

    public l(OutputStream outputStream, j jVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f95947b = new byte[1];
        this.f95948c = ByteBuffer.allocate(4);
        this.f95949d = 0;
        this.f95946a = jVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws IOException {
        j jVar;
        int i16;
        int[] iArr;
        int[] iArr2;
        int i17 = i14;
        int i18 = i15;
        while (true) {
            int i19 = this.f95950e;
            if ((i19 <= 0 && this.f95951f <= 0 && this.f95949d == 2) || i18 <= 0) {
                break;
            }
            if (i19 > 0) {
                int iMin = Math.min(i18, i19);
                i18 -= iMin;
                this.f95950e -= iMin;
                i17 += iMin;
            }
            int i24 = this.f95951f;
            if (i24 > 0) {
                int iMin2 = Math.min(i18, i24);
                ((FilterOutputStream) this).out.write(bArr, i17, iMin2);
                i18 -= iMin2;
                this.f95951f -= iMin2;
                i17 += iMin2;
            }
            if (i18 == 0) {
                return;
            }
            int i25 = this.f95949d;
            int i26 = 0;
            ByteBuffer byteBuffer = this.f95948c;
            if (i25 == 0) {
                int iMin3 = Math.min(i18, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i17, iMin3);
                i17 += iMin3;
                i18 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    vb.h.C("Not a valid jpeg image, cannot write exif");
                    return;
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.f95949d = 1;
                byteBuffer.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.c((short) -31);
                m[][] mVarArr = j.f95927d;
                int[] iArr3 = new int[mVarArr.length];
                int[] iArr4 = new int[mVarArr.length];
                m[] mVarArr2 = j.f95926c;
                int length = mVarArr2.length;
                int i27 = 0;
                while (true) {
                    jVar = this.f95946a;
                    if (i27 >= length) {
                        break;
                    }
                    m mVar = mVarArr2[i27];
                    for (int i28 = i26; i28 < j.f95927d.length; i28++) {
                        jVar.a(i28).remove(mVar.f95953b);
                    }
                    i27++;
                    i26 = 0;
                }
                Map<String, i> mapA = jVar.a(1);
                ByteOrder byteOrder = jVar.f95931b;
                if (mapA.isEmpty()) {
                    i16 = 0;
                } else {
                    i16 = 0;
                    jVar.a(0).put(j.f95926c[1].f95953b, i.a(0L, byteOrder));
                }
                if (!jVar.a(2).isEmpty()) {
                    jVar.a(i16).put(j.f95926c[2].f95953b, i.a(0L, byteOrder));
                }
                if (!jVar.a(3).isEmpty()) {
                    jVar.a(1).put(j.f95926c[3].f95953b, i.a(0L, byteOrder));
                }
                for (int i29 = 0; i29 < j.f95927d.length; i29++) {
                    Iterator<Map.Entry<String, i>> it = jVar.a(i29).entrySet().iterator();
                    int i30 = 0;
                    while (it.hasNext()) {
                        i value = it.next().getValue();
                        int i34 = i.f95922f[value.f95923a] * value.f95924b;
                        if (i34 > 4) {
                            i30 += i34;
                        }
                    }
                    iArr4[i29] = iArr4[i29] + i30;
                }
                int size = 8;
                for (int i35 = 0; i35 < j.f95927d.length; i35++) {
                    if (!jVar.a(i35).isEmpty()) {
                        iArr3[i35] = size;
                        size = (jVar.a(i35).size() * 12) + 6 + iArr4[i35] + size;
                    }
                }
                int i36 = size + 8;
                if (!jVar.a(1).isEmpty()) {
                    jVar.a(0).put(j.f95926c[1].f95953b, i.a(iArr3[1], byteOrder));
                }
                if (!jVar.a(2).isEmpty()) {
                    jVar.a(0).put(j.f95926c[2].f95953b, i.a(iArr3[2], byteOrder));
                }
                if (!jVar.a(3).isEmpty()) {
                    jVar.a(1).put(j.f95926c[3].f95953b, i.a(iArr3[3], byteOrder));
                }
                bVar.c((short) i36);
                bVar.write(f95945g);
                bVar.c(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                bVar.f95909b = byteOrder;
                bVar.c((short) 42);
                bVar.a((int) 8);
                int i37 = 0;
                while (i37 < j.f95927d.length) {
                    if (jVar.a(i37).isEmpty()) {
                        iArr = iArr3;
                    } else {
                        bVar.c((short) jVar.a(i37).size());
                        int size2 = (jVar.a(i37).size() * 12) + iArr3[i37] + 2 + 4;
                        for (Map.Entry<String, i> entry : jVar.a(i37).entrySet()) {
                            m mVar2 = (m) ((HashMap) j.b.f95936f.get(i37)).get(entry.getKey());
                            k7.h.e(mVar2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                            int i38 = mVar2.f95952a;
                            i value2 = entry.getValue();
                            int[] iArr5 = i.f95922f;
                            int i39 = value2.f95923a;
                            int i44 = value2.f95924b;
                            int i45 = iArr5[i39] * i44;
                            bVar.c((short) i38);
                            bVar.c((short) value2.f95923a);
                            bVar.a(i44);
                            if (i45 > 4) {
                                iArr2 = iArr3;
                                bVar.a(size2);
                                size2 += i45;
                            } else {
                                iArr2 = iArr3;
                                bVar.write(value2.f95925c);
                                if (i45 < 4) {
                                    for (int i46 = 4; i45 < i46; i46 = 4) {
                                        bVar.f95908a.write(0);
                                        i45++;
                                    }
                                }
                            }
                            iArr3 = iArr2;
                        }
                        iArr = iArr3;
                        bVar.a((int) 0);
                        Iterator<Map.Entry<String, i>> it3 = jVar.a(i37).entrySet().iterator();
                        while (it3.hasNext()) {
                            byte[] bArr2 = it3.next().getValue().f95925c;
                            if (bArr2.length > 4) {
                                bVar.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i37++;
                    iArr3 = iArr;
                }
                bVar.f95909b = ByteOrder.BIG_ENDIAN;
            } else if (i25 != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i18, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i17, iMin4);
                i17 += iMin4;
                i18 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s8 = byteBuffer.getShort();
                if (s8 == -31) {
                    this.f95950e = (byteBuffer.getShort() & 65535) - 2;
                    this.f95949d = 2;
                } else if (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f95951f = (byteBuffer.getShort() & 65535) - 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f95949d = 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i18 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i17, i18);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i14) throws IOException {
        byte[] bArr = this.f95947b;
        bArr[0] = (byte) (i14 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
