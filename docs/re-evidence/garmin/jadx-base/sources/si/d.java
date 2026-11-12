package si;

import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f159337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f159338c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f159336a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f159339d = 0;

    public final boolean a() {
        return this.f159338c.f159326b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f159337b == null) {
            h.z("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.f159338c;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < 6; i14++) {
            sb3.append((char) c());
        }
        boolean zStartsWith = sb3.toString().startsWith("GIF");
        c cVar = this.f159338c;
        if (zStartsWith) {
            cVar.f159330f = this.f159337b.getShort();
            this.f159338c.f159331g = this.f159337b.getShort();
            int iC = c();
            c cVar2 = this.f159338c;
            cVar2.f159332h = (iC & 128) != 0;
            cVar2.f159333i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f159338c.f159334j = c();
            c cVar3 = this.f159338c;
            c();
            cVar3.getClass();
            if (this.f159338c.f159332h && !a()) {
                c cVar4 = this.f159338c;
                cVar4.f159325a = e(cVar4.f159333i);
                c cVar5 = this.f159338c;
                cVar5.f159335k = cVar5.f159325a[cVar5.f159334j];
            }
        } else {
            cVar.f159326b = 1;
        }
        if (!a()) {
            boolean z14 = false;
            while (!z14 && !a() && this.f159338c.f159327c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f159338c.f159328d = new b();
                        c();
                        int iC4 = c();
                        b bVar = this.f159338c.f159328d;
                        int i15 = (iC4 & 28) >> 2;
                        bVar.f159320g = i15;
                        if (i15 == 0) {
                            bVar.f159320g = 1;
                        }
                        bVar.f159319f = (iC4 & 1) != 0;
                        short s8 = this.f159337b.getShort();
                        if (s8 < 2) {
                            s8 = 10;
                        }
                        b bVar2 = this.f159338c.f159328d;
                        bVar2.f159322i = s8 * 10;
                        bVar2.f159321h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb4 = new StringBuilder();
                        int i16 = 0;
                        while (true) {
                            bArr = this.f159336a;
                            if (i16 >= 11) {
                                break;
                            }
                            sb4.append((char) bArr[i16]);
                            i16++;
                        }
                        if (sb4.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b14 = bArr[1];
                                    byte b15 = bArr[2];
                                    this.f159338c.getClass();
                                }
                                if (this.f159339d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    c cVar6 = this.f159338c;
                    if (cVar6.f159328d == null) {
                        cVar6.f159328d = new b();
                    }
                    this.f159338c.f159328d.f159314a = this.f159337b.getShort();
                    this.f159338c.f159328d.f159315b = this.f159337b.getShort();
                    this.f159338c.f159328d.f159316c = this.f159337b.getShort();
                    this.f159338c.f159328d.f159317d = this.f159337b.getShort();
                    int iC5 = c();
                    boolean z15 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    b bVar3 = this.f159338c.f159328d;
                    bVar3.f159318e = (iC5 & 64) != 0;
                    if (z15) {
                        bVar3.f159324k = e(iPow);
                    } else {
                        bVar3.f159324k = null;
                    }
                    this.f159338c.f159328d.f159323j = this.f159337b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar7 = this.f159338c;
                        cVar7.f159327c++;
                        cVar7.f159329e.add(cVar7.f159328d);
                    }
                } else if (iC2 != 59) {
                    this.f159338c.f159326b = 1;
                } else {
                    z14 = true;
                }
            }
            c cVar8 = this.f159338c;
            if (cVar8.f159327c < 0) {
                cVar8.f159326b = 1;
            }
        }
        return this.f159338c;
    }

    public final int c() {
        try {
            return this.f159337b.get() & UnsignedBytes.MAX_VALUE;
        } catch (Exception unused) {
            this.f159338c.f159326b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f159339d = iC;
        if (iC <= 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            try {
                int i15 = this.f159339d;
                if (i14 >= i15) {
                    return;
                }
                int i16 = i15 - i14;
                this.f159337b.get(this.f159336a, i14, i16);
                i14 += i16;
            } catch (Exception unused) {
                this.f159338c.f159326b = 1;
                return;
            }
        }
    }

    public final int[] e(int i14) {
        byte[] bArr = new byte[i14 * 3];
        int[] iArr = null;
        try {
            this.f159337b.get(bArr);
            iArr = new int[256];
            int i15 = 0;
            int i16 = 0;
            while (i15 < i14) {
                int i17 = bArr[i16] & UnsignedBytes.MAX_VALUE;
                int i18 = i16 + 2;
                int i19 = bArr[i16 + 1] & UnsignedBytes.MAX_VALUE;
                i16 += 3;
                int i24 = i15 + 1;
                iArr[i15] = (i19 << 8) | (i17 << 16) | (-16777216) | (bArr[i18] & UnsignedBytes.MAX_VALUE);
                i15 = i24;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f159338c.f159326b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f159337b.position(Math.min(this.f159337b.position() + iC, this.f159337b.limit()));
        } while (iC > 0);
    }
}
