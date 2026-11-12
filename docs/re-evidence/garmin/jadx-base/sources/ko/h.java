package ko;

import am.x0;
import am.z0;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.p;
import qs.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lko/h;", "", "Ll22/a;", "resolver", "", "isRunningActivity", "<init>", "(Ll22/a;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f105725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105726b;

    public h(l22.a aVar, boolean z14) {
        aVar.getClass();
        this.f105725a = aVar;
        this.f105726b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final ArrayList a(x0 x0Var, p pVar, HashMap map, HashMap map2) {
        n nVarA;
        n nVar;
        String str;
        Double distance;
        double dDoubleValue;
        String strS;
        map.getClass();
        map2.getClass();
        ArrayList arrayList = new ArrayList();
        ?? r14 = 0;
        List<ps.x0> listG = pVar != null ? pVar.g() : null;
        LinkedHashMap linkedHashMapB = d.b(pVar);
        if (listG != null) {
            for (ps.x0 x0Var2 : listG) {
                Object[] objArr = {String.valueOf(x0Var2.getLapIndex())};
                l22.a aVar = this.f105725a;
                String strA = aVar.a(R.string.laps_num, objArr);
                String str2 = (String) map.get(Integer.valueOf(x0Var2.getLapIndex()));
                if (str2 != null) {
                    n.f147118b.getClass();
                    nVarA = n.a.a(str2);
                    if (nVarA == null) {
                        nVarA = (n) linkedHashMapB.get(Integer.valueOf(x0Var2.getLapIndex()));
                        if (nVarA == null) {
                            nVarA = d.a(x0Var2);
                        }
                    }
                } else {
                    nVarA = (n) linkedHashMapB.get(Integer.valueOf(x0Var2.getLapIndex()));
                    if (nVarA == null) {
                        nVarA = d.a(x0Var2);
                    }
                }
                String string = nVarA == n.WALK ? aVar.getString(R.string.activity_options_walk_title) : aVar.getString(nVarA.f147128a);
                if (nVarA == n.ACTIVE && !this.f105726b) {
                    string = aVar.getString(R.string.lbl_bike);
                }
                String str3 = string;
                l3.a aVar2 = l3.f23124b;
                Double duration = x0Var2.getDuration();
                double dDoubleValue2 = Double.NaN;
                String strT1 = l3.a.t1(aVar2, duration != null ? duration.doubleValue() : Double.NaN);
                l lVar = (l) KoinJavaComponent.get$default(l.class, r14, r14, 6, r14);
                if (x0Var != null) {
                    String str4 = x0Var.f4358a;
                    z0 z0Var = z0.f4390a;
                    if (z0.b(x0.I0, str4)) {
                        Double distance2 = x0Var2.getDistance();
                        nVar = nVarA;
                        str = strT1;
                        strS = l3.a.R(aVar, distance2 != null ? distance2.doubleValue() : Double.NaN, m3.METER, l3.f23131i, true, null);
                    } else {
                        nVar = nVarA;
                        str = strT1;
                        boolean zY = lVar.y();
                        distance = x0Var2.getDistance();
                        if (distance != null) {
                            dDoubleValue = distance.doubleValue();
                        } else {
                            dDoubleValue = Double.NaN;
                        }
                        strS = l3.a.S(aVar, dDoubleValue, l3.f23129g, true, zY);
                    }
                } else {
                    nVar = nVarA;
                    str = strT1;
                    boolean zY2 = lVar.y();
                    distance = x0Var2.getDistance();
                    if (distance != null) {
                        dDoubleValue = distance.doubleValue();
                    } else {
                        dDoubleValue = Double.NaN;
                    }
                    strS = l3.a.S(aVar, dDoubleValue, l3.f23129g, true, zY2);
                }
                Double averageSpeed = x0Var2.getAverageSpeed();
                if (averageSpeed != null) {
                    dDoubleValue2 = averageSpeed.doubleValue();
                }
                arrayList.add(new e(x0Var2.getLapIndex(), nVar.name(), strA, aVar.a(R.string.string_bullet_string_bullet_string_pattern, str, strS, l3.a.u0(dDoubleValue2, null, aVar, lVar.y(), true, false)), str3, false, 32, null));
                r14 = 0;
            }
        }
        return arrayList;
    }
}
