package lo;

import android.content.Context;
import android.text.TextUtils;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p3 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113937a;

        static {
            int[] iArr = new int[l3.values().length];
            f113937a = iArr;
            try {
                iArr[l3.KILOMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113937a[l3.METER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113937a[l3.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113937a[l3.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113937a[l3.FOOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113937a[l3.NAUTICAL_MILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private p3() {
    }

    public static ArrayList<l3> a(Context context, List<String> list) {
        ArrayList<l3> arrayList = new ArrayList<>();
        for (String str : list) {
            l3 l3Var = l3.METER;
            for (l3 l3Var2 : l3.values()) {
                if (context.getString(l3Var2.f113908b).equals(str)) {
                    l3Var = l3Var2;
                    break;
                }
            }
            arrayList.add(l3Var);
        }
        return arrayList;
    }

    public static ArrayList<Integer> b(double d14, l3 l3Var, l3 l3Var2) {
        String str;
        int i14 = 1000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        int iOrdinal = l3Var.ordinal();
        l3 l3Var3 = l3.KILOMETER;
        if (iOrdinal == l3Var3.ordinal()) {
            i14 = 1609;
            arrayList.add(1609);
        } else if (l3Var.ordinal() != l3.MILE.ordinal() && l3Var.ordinal() == l3.METER.ordinal()) {
            i14 = 1600000;
            arrayList.add(1600000);
        } else {
            arrayList.add(1000);
        }
        arrayList.add(0);
        arrayList.add(99);
        if (l3Var.ordinal() == l3Var3.ordinal() && l3Var2.ordinal() == l3.MILE.ordinal()) {
            DecimalFormat decimalFormat = c22.l3.f23129g;
            c22.l3.f23124b.getClass();
            str = decimalFormat.format(d14 * 1.609344d);
        } else {
            int iOrdinal2 = l3Var.ordinal();
            l3 l3Var4 = l3.MILE;
            if (iOrdinal2 == l3Var4.ordinal() && l3Var2.ordinal() == l3Var3.ordinal()) {
                DecimalFormat decimalFormat2 = c22.l3.f23129g;
                c22.l3.f23124b.getClass();
                str = decimalFormat2.format(d14 / 1.609344d);
            } else {
                int iOrdinal3 = l3Var.ordinal();
                l3 l3Var5 = l3.NAUTICAL_MILES;
                if (iOrdinal3 == l3Var5.ordinal() && l3Var2.ordinal() == l3Var4.ordinal()) {
                    DecimalFormat decimalFormat3 = c22.l3.f23129g;
                    c22.l3.f23124b.getClass();
                    str = decimalFormat3.format(d14 / 1.15078d);
                } else if (l3Var.ordinal() == l3Var5.ordinal() && l3Var2.ordinal() == l3Var3.ordinal()) {
                    DecimalFormat decimalFormat4 = c22.l3.f23129g;
                    c22.l3.f23124b.getClass();
                    str = decimalFormat4.format(d14 / 1.852d);
                } else if (l3Var.ordinal() == l3Var3.ordinal() && l3Var2.ordinal() == l3Var5.ordinal()) {
                    DecimalFormat decimalFormat5 = c22.l3.f23129g;
                    c22.l3.f23124b.getClass();
                    str = decimalFormat5.format(d14 * 1.852d);
                } else if (l3Var.ordinal() == l3Var4.ordinal() && l3Var2.ordinal() == l3Var5.ordinal()) {
                    DecimalFormat decimalFormat6 = c22.l3.f23129g;
                    c22.l3.f23124b.getClass();
                    str = decimalFormat6.format(d14 * 1.15078d);
                } else {
                    int iOrdinal4 = l3Var2.ordinal();
                    l3 l3Var6 = l3.METER;
                    if (iOrdinal4 == l3Var6.ordinal() && l3Var.ordinal() == l3Var3.ordinal()) {
                        DecimalFormat decimalFormat7 = c22.l3.f23129g;
                        c22.l3.f23124b.getClass();
                        str = decimalFormat7.format(d14 / 1000.0d);
                    } else if (l3Var2.ordinal() == l3Var6.ordinal() && l3Var.ordinal() == l3Var4.ordinal()) {
                        DecimalFormat decimalFormat8 = c22.l3.f23129g;
                        c22.l3.f23124b.getClass();
                        str = decimalFormat8.format(d14 / 1609.344d);
                    } else if (l3Var2.ordinal() == l3Var3.ordinal() && l3Var.ordinal() == l3Var6.ordinal()) {
                        DecimalFormat decimalFormat9 = c22.l3.f23129g;
                        c22.l3.f23124b.getClass();
                        str = decimalFormat9.format(d14 * 1000.0d);
                    } else if (l3Var2.ordinal() == l3Var4.ordinal() && l3Var.ordinal() == l3Var6.ordinal()) {
                        DecimalFormat decimalFormat10 = c22.l3.f23129g;
                        c22.l3.f23124b.getClass();
                        str = decimalFormat10.format(d14 * 1609.344d);
                    } else {
                        str = null;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            int iIndexOf = str.indexOf(c22.b2.f23010b);
            if (iIndexOf >= 0) {
                int iC = c22.b1.c(str.substring(0, iIndexOf));
                int iC2 = c22.b1.c(str.substring(iIndexOf + 1));
                if (iC > i14) {
                    arrayList.add(Integer.valueOf(i14));
                    arrayList.add(0);
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(iC));
                arrayList.add(Integer.valueOf(iC2));
                return arrayList;
            }
            if (Integer.parseInt(str) > i14) {
                arrayList.add(Integer.valueOf(i14));
                arrayList.add(0);
                return arrayList;
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            arrayList.add(0);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0176 A[PHI: r15
      0x0176: PHI (r15v4 int) = (r15v3 int), (r15v7 int) binds: [B:49:0x0174, B:57:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0178 A[PHI: r1
      0x0178: PHI (r1v21 int) = (r1v19 int), (r1v24 int) binds: [B:49:0x0174, B:57:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    public static ArrayList<Integer> c(double d14, l3 l3Var, l3 l3Var2, boolean z14) {
        int i14;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (z14) {
            int i15 = 0;
            if (l3Var.ordinal() == l3.YARD.ordinal()) {
                switch (a.f113937a[l3Var2.ordinal()]) {
                    case 1:
                        c22.l3.a aVar = c22.l3.f23124b;
                        aVar.getClass();
                        aVar.getClass();
                        d14 = c22.l3.a.S1(d14 * 1000.0d);
                        break;
                    case 2:
                        c22.l3.f23124b.getClass();
                        d14 = c22.l3.a.S1(d14);
                        break;
                    case 3:
                        c22.l3.a aVar2 = c22.l3.f23124b;
                        aVar2.getClass();
                        aVar2.getClass();
                        d14 = c22.l3.a.S1(d14 * 1609.344d);
                        break;
                    case 4:
                        break;
                    case 5:
                        c22.l3.a aVar3 = c22.l3.f23124b;
                        aVar3.getClass();
                        aVar3.getClass();
                        d14 = c22.l3.a.S1(d14 / 3.2808399d);
                        break;
                    case 6:
                        c22.l3.a aVar4 = c22.l3.f23124b;
                        aVar4.getClass();
                        aVar4.getClass();
                        aVar4.getClass();
                        d14 = c22.l3.a.S1(d14 * 1.852d * 1000.0d);
                        break;
                    default:
                        d14 = 0.0d;
                        break;
                }
                i14 = Integer.parseInt(c22.l3.f23135m.format(d14));
            } else if (l3Var.ordinal() == l3.METER.ordinal()) {
                switch (a.f113937a[l3Var2.ordinal()]) {
                    case 1:
                        c22.l3.f23124b.getClass();
                        d14 *= 1000.0d;
                        break;
                    case 2:
                        break;
                    case 3:
                        c22.l3.f23124b.getClass();
                        d14 *= 1609.344d;
                        break;
                    case 4:
                        c22.l3.f23124b.getClass();
                        d14 *= 0.9144d;
                        break;
                    case 5:
                        c22.l3.f23124b.getClass();
                        d14 /= 3.2808399d;
                        break;
                    case 6:
                        c22.l3.a aVar5 = c22.l3.f23124b;
                        aVar5.getClass();
                        d14 *= 1.852d;
                        aVar5.getClass();
                        d14 *= 1000.0d;
                        break;
                    default:
                        d14 = 0.0d;
                        break;
                }
                i14 = Integer.parseInt(c22.l3.f23135m.format(d14));
            } else {
                i14 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int iD = 0; iD <= 25000; iD = e5.d(iD, iD, arrayList2, 25)) {
            }
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            if (i14 <= ((Integer) arrayList2.get(0)).intValue()) {
                iIntValue = ((Integer) arrayList2.get(0)).intValue();
            } else {
                int i16 = size - 1;
                if (i14 >= ((Integer) arrayList2.get(i16)).intValue()) {
                    iIntValue = ((Integer) arrayList2.get(i16)).intValue();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i15 < size) {
                            i17 = (i15 + size) / 2;
                            if (((Integer) arrayList2.get(i17)).intValue() == i14) {
                                iIntValue = ((Integer) arrayList2.get(i17)).intValue();
                            } else if (i14 < ((Integer) arrayList2.get(i17)).intValue()) {
                                if (i17 > 0) {
                                    int i18 = i17 - 1;
                                    if (i14 > ((Integer) arrayList2.get(i18)).intValue()) {
                                        iIntValue2 = ((Integer) arrayList2.get(i18)).intValue();
                                        iIntValue3 = ((Integer) arrayList2.get(i17)).intValue();
                                        if (i14 - iIntValue2 >= iIntValue3 - i14) {
                                            iIntValue = iIntValue3;
                                        } else {
                                            iIntValue = iIntValue2;
                                        }
                                    }
                                }
                                size = i17;
                            } else {
                                if (i17 < i16) {
                                    int i19 = i17 + 1;
                                    if (i14 < ((Integer) arrayList2.get(i19)).intValue()) {
                                        iIntValue2 = ((Integer) arrayList2.get(i17)).intValue();
                                        iIntValue3 = ((Integer) arrayList2.get(i19)).intValue();
                                        if (i14 - iIntValue2 >= iIntValue3 - i14) {
                                            iIntValue = iIntValue3;
                                        } else {
                                            iIntValue = iIntValue2;
                                        }
                                    }
                                }
                                i15 = i17 + 1;
                            }
                        } else {
                            iIntValue = ((Integer) arrayList2.get(i17)).intValue();
                        }
                    }
                }
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }
}
