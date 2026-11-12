package u21;

import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu21/l;", "Landroidx/lifecycle/u1;", "Ls21/o;", "micronutrientsSettings", "<init>", "(Ls21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s21.o f168025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f168026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f168027c;

    public l(s21.o oVar) {
        oVar.getClass();
        this.f168025a = oVar;
        p2 p2VarA = q2.a(new i(x4(oVar.f156160b), null, false, null, null, 30, null));
        this.f168026b = p2VarA;
        this.f168027c = p2VarA;
    }

    public static q13.b x4(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s21.n) obj).f156151a) {
                arrayList.add(obj);
            }
        }
        List listN0 = p13.h0.N0(arrayList, new j());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((s21.n) obj2).f156151a) {
                arrayList2.add(obj2);
            }
        }
        List listN1 = p13.h0.N0(arrayList2, new k());
        q13.b bVarB = p13.w.b();
        bVarB.add(new s21.m.b(R.string.lbl_show, "HEADER_MICRONUTRIENTS_SHOW"));
        ArrayList arrayList3 = new ArrayList(p13.y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList3.add(new s21.m.c((s21.n) it.next()));
        }
        bVarB.addAll(arrayList3);
        bVarB.add(new s21.m.b(R.string.lbl_hide, "HEADER_MICRONUTRIENTS_HIDE"));
        ArrayList arrayList4 = new ArrayList(p13.y.r(listN1, 10));
        Iterator it3 = listN1.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new s21.m.c((s21.n) it3.next()));
        }
        bVarB.addAll(arrayList4);
        return p13.w.a(bVarB);
    }

    public static ArrayList y4(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof s21.m.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s21.m.c) it.next()).f156150b);
        }
        return arrayList2;
    }

    public static ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((s21.n) obj).f156151a) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        int i14 = 0;
        for (Object obj2 : arrayList2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList3.add(s21.n.b((s21.n) obj2, false, null, i14, 31));
            i14 = i15;
        }
        int size = arrayList3.size();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((s21.n) obj3).f156151a) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayList4, 10));
        int i16 = 0;
        for (Object obj4 : arrayList4) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList5.add(s21.n.b((s21.n) obj4, false, null, i16 + size, 31));
            i16 = i17;
        }
        return p13.h0.C0(arrayList3, arrayList5);
    }
}
