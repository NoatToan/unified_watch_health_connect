package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ae5<T extends Entry> extends LineDataSet {
    public int P;

    public ae5(List<Entry> list, String str) {
        super(list, str);
        this.P = -1;
    }

    public static List<ae5> E1(List<SportRecordEntry> list, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= f2) {
                arrayList2.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= f3) {
                arrayList3.add(sportRecordEntry);
            } else {
                arrayList4.add(sportRecordEntry);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(L1(arrayList2, 0));
        arrayList5.add(L1(arrayList3, 1));
        arrayList5.add(L1(arrayList4, 3));
        return arrayList5;
    }

    public static List<ae5> F1(List<SportRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= 0.0f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= 125.0f) {
                arrayList2.add(sportRecordEntry);
            } else {
                arrayList3.add(sportRecordEntry);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(L1(arrayList, -1));
        arrayList4.add(L1(arrayList2, 1));
        arrayList4.add(L1(arrayList3, 3));
        return arrayList4;
    }

    public static List<ae5> G1(List<SportRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= 0.0f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() < 200.0f) {
                arrayList2.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= 350.0f) {
                arrayList3.add(sportRecordEntry);
            } else {
                arrayList4.add(sportRecordEntry);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(L1(arrayList, -1));
        arrayList5.add(L1(arrayList2, 0));
        arrayList5.add(L1(arrayList3, 1));
        arrayList5.add(L1(arrayList4, 3));
        return arrayList5;
    }

    public static List<ae5> H1(List<SportRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= 0.0f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() > 1.6f) {
                arrayList2.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() > 1.0f) {
                arrayList3.add(sportRecordEntry);
            } else {
                arrayList4.add(sportRecordEntry);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(L1(arrayList, -1));
        arrayList5.add(L1(arrayList2, 0));
        arrayList5.add(L1(arrayList3, 1));
        arrayList5.add(L1(arrayList4, 3));
        return arrayList5;
    }

    public static List<ae5> I1(List<SportRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= 0.0f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() < 160.0f) {
                arrayList2.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= 180.0f) {
                arrayList3.add(sportRecordEntry);
            } else {
                arrayList4.add(sportRecordEntry);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(L1(arrayList, -1));
        arrayList5.add(L1(arrayList2, 0));
        arrayList5.add(L1(arrayList3, 1));
        arrayList5.add(L1(arrayList4, 3));
        return arrayList5;
    }

    public static List<ae5> J1(List<SportRecordEntry> list) {
        new ArrayList();
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        ae5 ae5Var = new ae5(list, "type_middle", 1);
        N1(ae5Var, x44.a(aji.W));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ae5Var);
        return arrayList2;
    }

    public static List<ae5> K1(List<SportRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SportRecordEntry sportRecordEntry = list.get(i);
            if (sportRecordEntry.getY() <= 0.0f) {
                arrayList.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() < 80.0f) {
                arrayList2.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= 100.0f) {
                arrayList3.add(sportRecordEntry);
            } else if (sportRecordEntry.getY() <= 120.0f) {
                arrayList5.add(sportRecordEntry);
            } else {
                arrayList4.add(sportRecordEntry);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(L1(arrayList, -1));
        arrayList6.add(L1(arrayList2, 0));
        arrayList6.add(L1(arrayList3, 1));
        arrayList6.add(L1(arrayList5, 3));
        arrayList6.add(L1(arrayList4, 2));
        return arrayList6;
    }

    public static ae5 L1(List<SportRecordEntry> list, int i) {
        if (i == -1) {
            ae5 ae5Var = new ae5(list, "type_invalid", -1);
            N1(ae5Var, M1(i));
            return ae5Var;
        }
        if (i == 0) {
            ae5 ae5Var2 = new ae5(list, "type_low", 0);
            N1(ae5Var2, M1(i));
            return ae5Var2;
        }
        if (i == 1) {
            ae5 ae5Var3 = new ae5(list, "type_middle", 1);
            N1(ae5Var3, M1(i));
            return ae5Var3;
        }
        if (i != 2) {
            ae5 ae5Var4 = new ae5(list, "type_high", 3);
            N1(ae5Var4, M1(i));
            return ae5Var4;
        }
        ae5 ae5Var5 = new ae5(list, "type_high", 2);
        N1(ae5Var5, M1(i));
        return ae5Var5;
    }

    public static int M1(int i) {
        if (i == 0) {
            return x44.a(aji.Z);
        }
        if (i == 1) {
            return x44.a(aji.a0);
        }
        if (i != 2) {
            return i != 3 ? x44.a(aji.common_transparent) : x44.a(aji.Y);
        }
        return x44.a(aji.X);
    }

    public static void N1(ae5 ae5Var, int i) {
        ae5Var.z1(0.2f);
        ae5Var.X0(false);
        ae5Var.V0(x44.a(aji.common_transparent));
        ae5Var.m1(false);
        ae5Var.s1(2.0f);
        ae5Var.a1(4.0f);
        ae5Var.B1(true);
        ae5Var.v1(i);
        ae5Var.A1(false);
        ae5Var.y1(2.0f);
        ae5Var.Y0(false);
        ae5Var.o1(false);
        ae5Var.Z0(false);
        ae5Var.D1(LineDataSet.Mode.LINEAR);
    }

    public ae5(List<Entry> list, String str, int i) {
        super(list, str);
        this.P = i;
    }
}
