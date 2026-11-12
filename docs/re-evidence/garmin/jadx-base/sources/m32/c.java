package m32;

import android.content.Context;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final double a(ArrayList arrayList) {
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            String str = (String) obj;
            if (i14 == arrayList.size() - 1) {
                sb3.append(".");
            }
            sb3.append(str);
            i14 = i15;
        }
        return Double.parseDouble(sb3.toString());
    }

    public static final e b(Context context, Double d14, boolean z14, int i14, double d15, l lVar) {
        String string;
        context.getClass();
        lVar.getClass();
        p pVarR = zf.b.R(d14.doubleValue() >= 0.0d ? d14.doubleValue() : 0.0d);
        List list = (List) pVarR.f128594a;
        List list2 = (List) pVarR.f128595b;
        rk1.b.C2900b c2900b = new rk1.b.C2900b(context);
        String string2 = context.getString(i14);
        rk1.b.d dVar = c2900b.f153344b;
        dVar.f153346b = string2;
        dVar.f153345a = 4;
        c2900b.f153344b.f153350f = h0.C0(d(list), list2);
        ArrayList arrayList = new ArrayList(4);
        for (int iD = 0; iD < 4; iD = e5.d(0, iD, arrayList, 1)) {
        }
        c2900b.f153344b.f153348d = arrayList;
        ArrayList arrayList2 = new ArrayList(4);
        for (int iD2 = 0; iD2 < 4; iD2 = e5.d(9, iD2, arrayList2, 1)) {
        }
        c2900b.f153344b.f153349e = arrayList2;
        ArrayList arrayList3 = new ArrayList(4);
        for (int i15 = 0; i15 < 4; i15++) {
            if (i15 == 2) {
                string = ".";
            } else if (i15 != 3) {
                string = "";
            } else if (z14) {
                string = context.getString(R.string.lbl_kg);
                string.getClass();
            } else {
                string = context.getString(R.string.lbl_lbs);
                string.getClass();
            }
            arrayList3.add(string);
        }
        c2900b.f153344b.f153347c = arrayList3;
        ArrayList arrayList4 = new ArrayList(4);
        for (int i16 = 0; i16 < 4; i16++) {
            arrayList4.add(Boolean.FALSE);
        }
        c2900b.f153344b.f153351g = arrayList4;
        c2900b.f153344b.f153356l = new b(0.0d, d15);
        c2900b.f(new a(lVar, 0));
        e eVarB = c2900b.b();
        eVarB.getClass();
        return eVarB;
    }

    public static /* synthetic */ e c(Context context, Double d14, boolean z14, l lVar) {
        return b(context, d14, z14, R.string.lbl_weight, zS ? 453.5d : 999.5d, lVar);
    }

    public static final List<Integer> d(List<Integer> list) {
        if (list.size() >= 3) {
            return list;
        }
        int size = 3 - list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int iD = 0; iD < size; iD = e5.d(0, iD, arrayList, 1)) {
        }
        return h0.C0(arrayList, list);
    }
}
