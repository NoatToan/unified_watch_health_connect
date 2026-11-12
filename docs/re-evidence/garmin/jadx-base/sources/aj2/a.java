package aj2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0061a[] f3493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3495c;

        public b(int i14, int i15) {
            this.f3493a = new C0061a[1 << i14];
            this.f3494b = i15;
            this.f3495c = i15;
            int i16 = 0;
            while (true) {
                C0061a[] c0061aArr = this.f3493a;
                if (i16 >= c0061aArr.length) {
                    break;
                }
                c0061aArr[i16] = new C0061a(a.this, (byte) 0, -1);
                i16++;
            }
            for (int i17 = 0; i17 < i15; i17++) {
                this.f3493a[i17].f3492c = (byte) i17;
            }
        }
    }

    public static int b(int i14, int i15, ArrayList arrayList, int i16) {
        while (i15 > 0) {
            if (i16 == 0) {
                arrayList.add(Byte.valueOf((byte) (i14 & 255)));
                if (i15 < 8) {
                    i16 += i15;
                    i15 = 0;
                } else {
                    i15 -= 8;
                    i14 >>>= 8;
                }
            } else {
                int size = arrayList.size() - 1;
                arrayList.set(size, Byte.valueOf((byte) ((((byte) ((i14 << i16) & 255)) | ((Byte) arrayList.get(size)).byteValue()) & 255)));
                int i17 = 8 - i16;
                if (i15 < i17) {
                    i16 += i15;
                    i15 = 0;
                } else {
                    i15 -= i17;
                    i14 >>>= i17;
                    i16 = 0;
                }
            }
        }
        return i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    public final void a(ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2, int i14) {
        int i15;
        byte b14;
        boolean z14;
        int i16;
        int i17;
        int size = arrayList.size();
        arrayList2.clear();
        byte[] bArr = new byte[256];
        boolean[] zArr = new boolean[256];
        byte b15 = 0;
        int i18 = 0;
        while (true) {
            i15 = -1;
            if (i18 >= 256) {
                break;
            }
            bArr[i18] = -1;
            i18++;
            b15 = 0;
        }
        int i19 = b15;
        while (true) {
            b14 = UnsignedBytes.MAX_VALUE;
            z14 = true;
            if (i19 >= size) {
                break;
            }
            zArr[arrayList.get(i19).byteValue() & UnsignedBytes.MAX_VALUE] = true;
            i19++;
            this = this;
            bArr = bArr;
            b15 = 0;
            i15 = -1;
        }
        int i24 = b15;
        int i25 = i24;
        int i26 = i15;
        while (i24 < 256) {
            int i27 = size;
            byte[] bArr2 = bArr;
            boolean z15 = z14 ? 1 : 0;
            if (zArr[i24]) {
                i25++;
            } else {
                i26 = i24;
            }
            i24++;
            this = this;
            z14 = z15 ? 1 : 0;
            size = i27;
            bArr = bArr2;
            b15 = 0;
            i15 = -1;
            b14 = UnsignedBytes.MAX_VALUE;
        }
        if (i25 < b14 && ((i25 + 3) & (i25 + 2)) != 0) {
            zArr[i26] = z14;
        }
        int i28 = b15;
        int i29 = i28;
        ?? r14 = z14;
        while (i28 < 256) {
            int i30 = size;
            byte[] bArr3 = bArr;
            ?? r16 = r14;
            if (zArr[i28]) {
                bArr3[i28] = (byte) i29;
                i29++;
            }
            i28++;
            this = this;
            r14 = r16 == true ? 1 : 0;
            size = i30;
            bArr = bArr3;
            b15 = 0;
            i15 = -1;
            b14 = UnsignedBytes.MAX_VALUE;
        }
        int i34 = i29 + 2;
        ?? r15 = r14;
        while (true) {
            i34 >>= r14;
            if (i34 <= 0) {
                break;
            }
            this = this;
            b15 = 0;
            i15 = -1;
            b14 = UnsignedBytes.MAX_VALUE;
            r15++;
        }
        int i35 = i29 + 1;
        ?? r17 = i14 < r15 ? r15 : i14;
        arrayList2.add(Byte.valueOf(Ascii.DLE));
        arrayList2.add(Byte.valueOf((byte) (r17 & 255)));
        arrayList2.add(Byte.valueOf((byte) (i29 & 255)));
        if (i29 < 256) {
            for (int i36 = b15; i36 < 256; i36++) {
                if ((bArr[i36] & b14) < b14) {
                    arrayList2.add(Byte.valueOf((byte) (i36 & 255)));
                }
            }
        }
        b bVar = this.new b(r17, i35);
        C0061a c0061a = new C0061a(this, b15, i15);
        ?? r18 = (r14 << r15) - r14;
        int i37 = b15;
        ?? r19 = r14;
        int iB = i37;
        ?? r24 = r15;
        int i38 = r18;
        while (i37 < size) {
            byte b16 = bArr[arrayList.get(i37).byteValue() & b14];
            c0061a.f3492c = b16;
            int i39 = c0061a.f3490a;
            a aVar = a.this;
            int i44 = size;
            if (-1 == i39) {
                i17 = -1;
                i16 = b16 & UnsignedBytes.MAX_VALUE;
            } else {
                C0061a[] c0061aArr = bVar.f3493a;
                C0061a c0061a2 = c0061aArr[i39 & 65535];
                int i45 = c0061a2.f3491b;
                if (-1 == i45) {
                    c0061a2.f3491b = bVar.f3495c & 65535;
                } else {
                    int i46 = i45;
                    while (true) {
                        if (i46 < bVar.f3495c) {
                            int i47 = c0061a.f3490a;
                            C0061a c0061a3 = c0061aArr[i46 & 65535];
                            int i48 = i46;
                            if (i47 == c0061a3.f3490a && c0061a.f3492c == c0061a3.f3492c) {
                                i16 = i48;
                                break;
                            }
                            i46 = i48 + 1;
                        }
                    }
                    i17 = -1;
                }
                int i49 = bVar.f3495c;
                bVar.f3495c = i49 + 1;
                c0061aArr[i49] = new C0061a(aVar, c0061a);
                i16 = -1;
                i17 = -1;
            }
            if (i17 == i16) {
                iB = b(c0061a.f3490a, r24, arrayList2, iB);
                c0061a.f3490a = c0061a.f3492c & UnsignedBytes.MAX_VALUE;
                if (bVar.f3495c == i38) {
                    if (r24 == r17) {
                        int i54 = bVar.f3494b;
                        bVar.f3495c = i54;
                        for (int i55 = 0; i55 < i54; i55++) {
                            bVar.f3493a[i55] = new C0061a(aVar, (byte) i55, -1);
                        }
                        r24 = r15;
                    } else {
                        r24++;
                    }
                    i38 = ((r19 == true ? 1 : 0) << r24) - 1;
                }
            } else {
                c0061a.f3490a = i16;
            }
            i37++;
            size = i44;
            bArr = bArr;
            b14 = UnsignedBytes.MAX_VALUE;
            i38 = i38;
            r24 = r24;
        }
        int iB2 = b(c0061a.f3490a, r24, arrayList2, iB);
        ?? r25 = r24;
        if (bVar.f3495c == i38 - 1) {
            r25 = r24 + 1;
        }
        b(i29, r25, arrayList2, iB2);
    }

    /* JADX INFO: renamed from: aj2.a$a, reason: collision with other inner class name */
    public class C0061a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f3492c;

        public C0061a(a aVar, C0061a c0061a) {
            this.f3490a = c0061a.f3490a;
            this.f3492c = c0061a.f3492c;
            this.f3491b = c0061a.f3491b;
        }

        public C0061a(a aVar, byte b14, int i14) {
            this.f3490a = i14;
            this.f3492c = b14;
            this.f3491b = -1;
        }
    }
}
