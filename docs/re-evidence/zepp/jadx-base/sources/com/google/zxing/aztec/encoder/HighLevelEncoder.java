package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class HighLevelEncoder {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    private static final int[][] i;
    public static final int[][] j;
    private final byte[] a;
    public static final String[] b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    public class a implements Comparator<c> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cVar.d() - cVar2.d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        i = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            i[0][i2] = (i2 - 65) + 2;
        }
        i[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            i[1][i3] = (i3 - 97) + 2;
        }
        i[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            i[2][i4] = (i4 - 48) + 2;
        }
        int[][] iArr2 = i;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            i[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            if (iArr4[i6] > 0) {
                i[4][iArr4[i6]] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        j = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = j;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.a = bArr;
    }

    private static Collection<c> a(Iterable<c> iterable) {
        LinkedList linkedList = new LinkedList();
        for (c cVar : iterable) {
            boolean z = true;
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                c cVar2 = (c) it2.next();
                if (cVar2.g(cVar)) {
                    z = false;
                    break;
                }
                if (cVar.g(cVar2)) {
                    it2.remove();
                }
            }
            if (z) {
                linkedList.add(cVar);
            }
        }
        return linkedList;
    }

    private void b(c cVar, int i2, Collection<c> collection) {
        char c2 = (char) (this.a[i2] & 255);
        boolean z = i[cVar.e()][c2] > 0;
        c cVarB = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = i[i3][c2];
            if (i4 > 0) {
                if (cVarB == null) {
                    cVarB = cVar.b(i2);
                }
                if (!z || i3 == cVar.e() || i3 == 2) {
                    collection.add(cVarB.h(i3, i4));
                }
                if (!z && j[cVar.e()][i3] >= 0) {
                    collection.add(cVarB.i(i3, i4));
                }
            }
        }
        if (cVar.c() > 0 || i[cVar.e()][c2] == 0) {
            collection.add(cVar.a(i2));
        }
    }

    private static void c(c cVar, int i2, int i3, Collection<c> collection) {
        c cVarB = cVar.b(i2);
        collection.add(cVarB.h(4, i3));
        if (cVar.e() != 4) {
            collection.add(cVarB.i(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(cVarB.h(2, 16 - i3).h(2, 1));
        }
        if (cVar.c() > 0) {
            collection.add(cVar.a(i2).a(i2 + 1));
        }
    }

    private Collection<c> d(Iterable<c> iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<c> it2 = iterable.iterator();
        while (it2.hasNext()) {
            b(it2.next(), i2, linkedList);
        }
        return a(linkedList);
    }

    private static Collection<c> e(Iterable<c> iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        Iterator<c> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c(it2.next(), i2, i3, linkedList);
        }
        return a(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public BitArray encode() {
        int i2;
        Collection<c> collectionSingletonList = Collections.singletonList(c.e);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i3 >= bArr.length) {
                return ((c) Collections.min(collectionSingletonList, new a())).j(this.a);
            }
            int i4 = i3 + 1;
            byte b2 = i4 < bArr.length ? bArr[i4] : (byte) 0;
            byte b3 = bArr[i3];
            if (b3 != 13) {
                if (b3 != 44) {
                    if (b3 != 46) {
                        if (b3 == 58 && b2 == 32) {
                            i2 = 5;
                        } else {
                            i2 = 0;
                        }
                    } else if (b2 == 32) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                } else if (b2 == 32) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
            } else if (b2 == 10) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                collectionSingletonList = e(collectionSingletonList, i3, i2);
                i3 = i4;
            } else {
                collectionSingletonList = d(collectionSingletonList, i3);
            }
            i3++;
        }
    }
}
