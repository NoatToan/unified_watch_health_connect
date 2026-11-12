package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv01/r0;", "", "Lm01/g;", "repository", "Lf12/l;", "userSettings", "Ld01/c;", "nutritionStore", "<init>", "(Lm01/g;Lf12/l;Ld01/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f174517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d01.c f174518c;

    public r0(m01.g gVar, f12.l lVar, d01.c cVar) {
        gVar.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f174516a = gVar;
        this.f174517b = lVar;
        this.f174518c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(v13.c cVar) {
        q0 q0Var;
        int iU;
        boolean z14;
        String str;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f174511f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f174511f = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object obj = q0Var.f174509d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f174511f;
        d01.c cVar2 = this.f174518c;
        if (i15 == 0) {
            o13.r.b(obj);
            f12.l lVar = this.f174517b;
            iU = lVar.u();
            String strW = lVar.w();
            boolean zD1 = lVar.d1();
            s21.o oVarH = cVar2.h(iU, strW, zD1);
            if (oVarH != null) {
                return new v2.b(oVarH, 200, null, null, 12, null);
            }
            q0Var.f174507b = strW;
            q0Var.f174506a = iU;
            q0Var.f174508c = zD1;
            q0Var.f174511f = 1;
            Object objE = this.f174516a.E(iU, strW, zD1, q0Var);
            if (objE == aVar) {
                return aVar;
            }
            z14 = zD1;
            obj = objE;
            str = strW;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = q0Var.f174508c;
            iU = q0Var.f174506a;
            str = q0Var.f174507b;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        Iterable iterable = (Iterable) bVar.f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o72.t.Z((l01.g) it.next()));
        }
        s21.o oVar = new s21.o(true, arrayList);
        cVar2.e(z14, iU, str, oVar);
        return new v2.b(oVar, bVar.f47387b, null, null, 12, null);
    }
}
