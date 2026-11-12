package com.huawei.hms.network.embedded;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes34.dex */
public final class pb extends AbstractList<eb> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb[] f15209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15210b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15209a.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public eb get(int i) {
        return this.f15209a[i];
    }

    public static void a(long j, bb bbVar, int i, List<eb> list, int i2, int i3, List<Integer> list2) {
        int iIntValue;
        int i4;
        int i5;
        int i6;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i7 = i2; i7 < i3; i7++) {
            if (list.get(i7).j() < i) {
                throw new AssertionError();
            }
        }
        eb ebVar = list.get(i2);
        eb ebVar2 = list.get(i3 - 1);
        if (i == ebVar.j()) {
            int i8 = i2 + 1;
            i4 = i8;
            iIntValue = list2.get(i2).intValue();
            ebVar = list.get(i8);
        } else {
            iIntValue = -1;
            i4 = i2;
        }
        if (ebVar.a(i) == ebVar2.a(i)) {
            int iMin = Math.min(ebVar.j(), ebVar2.j());
            int i9 = 0;
            for (int i10 = i; i10 < iMin && ebVar.a(i10) == ebVar2.a(i10); i10++) {
                i9++;
            }
            long jA = 1 + j + ((long) a(bbVar)) + 2 + ((long) i9);
            bbVar.writeInt(-i9);
            bbVar.writeInt(iIntValue);
            int i11 = i;
            while (true) {
                i5 = i + i9;
                if (i11 >= i5) {
                    break;
                }
                bbVar.writeInt(ebVar.a(i11) & 255);
                i11++;
            }
            if (i4 + 1 == i3) {
                if (i5 != list.get(i4).j()) {
                    throw new AssertionError();
                }
                bbVar.writeInt(list2.get(i4).intValue());
                return;
            } else {
                bb bbVar2 = new bb();
                bbVar.writeInt((int) ((((long) a(bbVar2)) + jA) * (-1)));
                a(jA, bbVar2, i5, list, i4, i3, list2);
                bbVar.write(bbVar2, bbVar2.B());
                return;
            }
        }
        int i12 = 1;
        for (int i13 = i4 + 1; i13 < i3; i13++) {
            if (list.get(i13 - 1).a(i) != list.get(i13).a(i)) {
                i12++;
            }
        }
        long jA2 = j + ((long) a(bbVar)) + 2 + ((long) (i12 * 2));
        bbVar.writeInt(i12);
        bbVar.writeInt(iIntValue);
        for (int i14 = i4; i14 < i3; i14++) {
            byte bA = list.get(i14).a(i);
            if (i14 == i4 || bA != list.get(i14 - 1).a(i)) {
                bbVar.writeInt(bA & 255);
            }
        }
        bb bbVar3 = new bb();
        int i15 = i4;
        while (i15 < i3) {
            byte bA2 = list.get(i15).a(i);
            int i16 = i15 + 1;
            int i17 = i16;
            while (true) {
                if (i17 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bA2 != list.get(i17).a(i)) {
                        i6 = i17;
                        break;
                    }
                    i17++;
                }
            }
            if (i16 == i6 && i + 1 == list.get(i15).j()) {
                bbVar.writeInt(list2.get(i15).intValue());
            } else {
                bbVar.writeInt((int) ((((long) a(bbVar3)) + jA2) * (-1)));
                a(jA2, bbVar3, i + 1, list, i15, i6, list2);
            }
            bbVar3 = bbVar3;
            i15 = i6;
        }
        bb bbVar4 = bbVar3;
        bbVar.write(bbVar4, bbVar4.B());
    }

    public static pb a(eb... ebVarArr) {
        if (ebVarArr.length == 0) {
            return new pb(new eb[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(ebVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, ebVarArr[i2]), Integer.valueOf(i2));
        }
        if (((eb) arrayList.get(0)).j() == 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            eb ebVar = (eb) arrayList.get(i3);
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 < arrayList.size()) {
                eb ebVar2 = (eb) arrayList.get(i5);
                if (!ebVar2.h(ebVar)) {
                    break;
                }
                if (ebVar2.j() == ebVar.j()) {
                    throw new IllegalArgumentException("duplicate option: " + ebVar2);
                }
                if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                    arrayList.remove(i5);
                    arrayList2.remove(i5);
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        bb bbVar = new bb();
        a(0L, bbVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int iA = a(bbVar);
        int[] iArr = new int[iA];
        for (int i6 = 0; i6 < iA; i6++) {
            iArr[i6] = bbVar.readInt();
        }
        if (bbVar.i()) {
            return new pb((eb[]) ebVarArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    public static int a(bb bbVar) {
        return (int) (bbVar.B() / 4);
    }

    public pb(eb[] ebVarArr, int[] iArr) {
        this.f15209a = ebVarArr;
        this.f15210b = iArr;
    }
}
