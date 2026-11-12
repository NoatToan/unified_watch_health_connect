package dy1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import p3.x1;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldy1/v;", "", "Lmx1/b;", "stpDay", "Ldy1/u;", "warmUpExercisesState", "Li53/c;", "primaryLiftsExercisesStates", "cooldownExercisesState", "Lkx1/a;", "selectExerciseBottomSheetState", "<init>", "(Lmx1/b;Ldy1/u;Li53/c;Ldy1/u;Li53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.b f61640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f61641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<u> f61642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f61643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<kx1.a> f61644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f61645f;

    public v(mx1.b bVar, u uVar, i53.c<u> cVar, u uVar2, i53.c<kx1.a> cVar2) {
        bVar.getClass();
        uVar.getClass();
        cVar.getClass();
        uVar2.getClass();
        cVar2.getClass();
        this.f61640a = bVar;
        this.f61641b = uVar;
        this.f61642c = cVar;
        this.f61643d = uVar2;
        this.f61644e = cVar2;
        i53.c<h> cVar3 = uVar.f61639a;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<u> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f61639a);
        }
        ArrayList arrayListC0 = h0.C0(h0.C0(cVar3, y.s(arrayList)), this.f61643d.f61639a);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListC0) {
            if (((h) obj).f61561f) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            i14 += ((h) it3.next()).f61565j;
        }
        this.f61645f = i14;
    }

    public static v a(v vVar, u uVar, i53.c cVar, u uVar2, i53.c cVar2, int i14) {
        u uVar3 = uVar;
        mx1.b bVar = vVar.f61640a;
        if ((i14 & 2) != 0) {
            uVar3 = vVar.f61641b;
        }
        if ((i14 & 4) != 0) {
            cVar = vVar.f61642c;
        }
        if ((i14 & 8) != 0) {
            uVar2 = vVar.f61643d;
        }
        if ((i14 & 16) != 0) {
            cVar2 = vVar.f61644e;
        }
        i53.c cVar3 = cVar2;
        bVar.getClass();
        uVar3.getClass();
        cVar.getClass();
        uVar2.getClass();
        cVar3.getClass();
        u uVar4 = uVar2;
        return new v(bVar, uVar3, cVar, uVar4, cVar3);
    }

    public final String b(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return wt1.r.b(this.f61645f, new l22.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)));
    }

    public final String c(int i14, Context context) {
        context.getClass();
        String string = context.getString(R.string.lbl_primary_lift_count, this.f61642c.size() > 1 ? String.valueOf(i14 + 1) : "");
        string.getClass();
        return string;
    }

    public final String d(Context context) {
        h next;
        context.getClass();
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f61642c) {
            mx1.a.C2299a c2299a = mx1.a.f121347g;
            Iterator<h> it = uVar.f61639a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.f61558c);
            h hVar = next;
            String str = hVar != null ? hVar.f61556a : null;
            c2299a.getClass();
            mx1.a aVarB = mx1.a.C2299a.b(str);
            String string = aVarB != null ? context.getString(aVarB.f121351a) : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        String strK0 = h0.k0(arrayList, ", ", null, null, null, 62);
        return strK0.length() > 50 ? d53.y.s0(47, strK0).concat("...") : strK0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f61640a == vVar.f61640a && p005kotlin.jvm.internal.s.g(this.f61641b, vVar.f61641b) && p005kotlin.jvm.internal.s.g(this.f61642c, vVar.f61642c) && p005kotlin.jvm.internal.s.g(this.f61643d, vVar.f61643d) && p005kotlin.jvm.internal.s.g(this.f61644e, vVar.f61644e);
    }

    public final int hashCode() {
        return this.f61644e.hashCode() + l2.a(this.f61643d.f61639a, l2.a(this.f61642c, l2.a(this.f61641b.f61639a, this.f61640a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutStepState(stpDay=");
        sb3.append(this.f61640a);
        sb3.append(", warmUpExercisesState=");
        sb3.append(this.f61641b);
        sb3.append(", primaryLiftsExercisesStates=");
        sb3.append(this.f61642c);
        sb3.append(", cooldownExercisesState=");
        sb3.append(this.f61643d);
        sb3.append(", selectExerciseBottomSheetState=");
        return l2.e(sb3, this.f61644e, ")");
    }

    public v(mx1.b bVar, u uVar, i53.c cVar, u uVar2, i53.c cVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, uVar, cVar, uVar2, (i14 & 16) != 0 ? j53.l.b() : cVar2);
    }
}
