package lo;

import android.os.Bundle;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class b0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var) {
        super(f0Var, 0);
        this.f113713b = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0215  */
    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113713b;
        String str = f0Var.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.f4324r, str);
        int iRound = f0Var.P1;
        if (zB) {
            if (iRound % 25 != 0) {
                int i14 = 25;
                int i15 = 0;
                for (int i16 = 0; i16 < 25000; i16 += 25) {
                    int iAbs = Math.abs(i16 - iRound);
                    if (iAbs < i14) {
                        i15 = i16;
                        i14 = iAbs;
                    }
                }
                iRound = i15;
            }
            l3 l3Var = f0Var.S1;
            t tVar = (t) dVar;
            tVar.getClass();
            List listAsList = Arrays.asList(tVar.getString(l3.YARD.f113908b), tVar.getString(l3.METER.f113908b));
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 <= 25000; i17 += 25) {
                arrayList.add(String.valueOf(i17));
            }
            r22.e eVarY6 = r22.e.y6(true);
            eVarY6.v6(arrayList.indexOf(String.valueOf(iRound)));
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            eVarY6.f149836j = true;
            eVarY6.f149842p = true;
            eVarY6.f149835i = strArr;
            eVarY6.f149840n = arrayList.size() - 1;
            eVarY6.f149836j = true;
            eVarY6.f149843q = true;
            if (l3Var != null) {
                eVarY6.E = l3Var;
            }
            eVarY6.Y = true;
            eVarY6.f149833g = arrayList.indexOf(String.valueOf(iRound));
            eVarY6.f149834h = 0;
            eVarY6.w6(p3.a(tVar.requireActivity(), listAsList));
            eVarY6.X = new m(tVar, 2);
            eVarY6.show(tVar.getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
            return;
        }
        int i18 = f0Var.Q1;
        l3 l3Var2 = f0Var.S1;
        t tVar2 = (t) dVar;
        tVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (!am.z0.b(am.x0.I0, tVar2.f113949a.J1.f4358a)) {
            if (!am.z0.b(am.x0.f4297k1, tVar2.f113949a.J1.f4358a)) {
                if (!am.z0.b(am.x0.f4301l1, tVar2.f113949a.J1.f4358a)) {
                    if (!am.z0.Q(tVar2.f113949a.J1.f4358a)) {
                        l3 l3Var3 = l3.NAUTICAL_MILES;
                        if (l3Var2 == l3Var3) {
                            arrayList2.add(tVar2.getString(l3Var3.f113908b));
                        } else {
                            arrayList2.addAll(Arrays.asList(tVar2.getString(l3.MILE.f113908b), tVar2.getString(l3.KILOMETER.f113908b)));
                        }
                        if (i18 > 99) {
                            i18 = 99;
                        }
                        r22.e eVarY7 = r22.e.y6(false);
                        eVarY7.v6(iRound);
                        eVarY7.f149837k = true;
                        eVarY7.f149834h = i18;
                        if (l3Var2 != null) {
                            eVarY7.E = l3Var2;
                        }
                        int i19 = (l3Var2.equals(l3.MILE) || l3Var2.equals(l3Var3)) ? 1000 : 1609;
                        eVarY7.f149839m = 0;
                        eVarY7.f149840n = i19;
                        eVarY7.f149836j = true;
                        eVarY7.f149843q = true;
                        eVarY7.f149841o = 99;
                        eVarY7.f149837k = true;
                        eVarY7.f149844r = true;
                        eVarY7.w6(p3.a(tVar2.requireActivity(), arrayList2));
                        eVarY7.X = new m(tVar2, 4);
                        eVarY7.show(tVar2.getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
                        return;
                    }
                    arrayList2.add(tVar2.getString(l3Var2.f113908b));
                    r22.b.f149582t.getClass();
                    Bundle bundle = new Bundle();
                    r22.b bVar = new r22.b();
                    bundle.putBoolean("EXTRA_IS_SWIMMING", false);
                    bVar.setArguments(bundle);
                    bVar.f149805c = 1609344.0d;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(iRound);
                    stringBuffer.append(c22.b2.f23010b);
                    if (i18 < 10) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(i18);
                    NumberFormat numberFormat = NumberFormat.getInstance();
                    Number rVar = new r(tVar2);
                    try {
                        rVar = numberFormat.parse(stringBuffer.toString());
                        bVar.f149806d = rVar.doubleValue();
                    } catch (Exception e4) {
                        com.garmin.android.apps.connectmobile.i2.e(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "BaseActivityManagerActivity", e4);
                        bVar.f149806d = rVar.doubleValue();
                    }
                    bVar.f149817o = l3Var2;
                    bVar.u6(p3.a(tVar2.requireActivity(), arrayList2));
                    bVar.f149583r = new m(tVar2, 3);
                    bVar.show(tVar2.getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
                    return;
                }
            }
        }
        if (am.z0.b(am.x0.f4297k1, tVar2.f113949a.J1.f4358a)) {
            iRound = Math.round((i18 / 100.0f) + iRound);
        } else if (am.z0.b(am.x0.f4301l1, tVar2.f113949a.J1.f4358a)) {
            iRound = Math.round((i18 / 100.0f) + iRound);
        }
        arrayList2.add(tVar2.getString(l3Var2.f113908b));
        r22.c.f149622t.getClass();
        r22.c cVar = new r22.c();
        cVar.f149805c = 1609344.0d;
        cVar.f149806d = iRound;
        cVar.f149817o = l3Var2;
        cVar.u6(p3.a(tVar2.requireActivity(), arrayList2));
        cVar.f149623r = new m(tVar2, 3);
        cVar.show(tVar2.getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
    }
}
