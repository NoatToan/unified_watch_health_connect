package uy0;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luy0/h0;", "", "Lm01/g;", "nutritionRepository", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lm01/g;Ls01/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f173186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s01.f f173187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty0.b f173188c;

    public h0(m01.g gVar, s01.f fVar) {
        gVar.getClass();
        fVar.getClass();
        this.f173186a = gVar;
        this.f173187b = fVar;
        this.f173188c = ty0.b.f166871f3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f173164c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f173164c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objY = f0Var.f173162a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f173164c;
        if (i15 == 0) {
            o13.r.b(objY);
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            f0Var.f173164c = 1;
            objY = this.f173186a.Y(oVarD, f0Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return Boolean.FALSE;
            }
            lc.u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        if (bVar.f47387b == 204) {
            return Boolean.FALSE;
        }
        l01.k kVar = (l01.k) bVar.f47386a;
        s21.s.Companion aVar2 = s21.s.INSTANCE;
        String str = kVar.f107878a;
        aVar2.getClass();
        return Boolean.valueOf(s21.s.Companion.a(str) != s21.s.NO_GOAL);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(v13.c cVar) {
        g0 g0Var;
        ArrayList arrayList;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f173176d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f173176d = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.f173174b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f173176d;
        if (i15 == 0) {
            o13.r.b(obj);
            ArrayList arrayListM = p13.x.m(ty0.b.X2, ty0.b.Y2, ty0.b.Z2, ty0.b.f166856a3, ty0.b.f166859b3, ty0.b.f166862c3, ty0.b.f166865d3, ty0.b.f166868e3);
            g0Var.f173173a = arrayListM;
            g0Var.f173176d = 1;
            Object objA = a(g0Var);
            if (objA == aVar) {
                return aVar;
            }
            arrayList = arrayListM;
            obj = objA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = g0Var.f173173a;
            o13.r.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            arrayList.remove(ty0.b.Z2);
            arrayList.remove(ty0.b.Y2);
            arrayList.remove(ty0.b.f166865d3);
        }
        if (this.f173187b.e()) {
            arrayList.remove(ty0.b.f166856a3);
            arrayList.remove(ty0.b.Y2);
        } else {
            arrayList.remove(ty0.b.f166859b3);
            arrayList.remove(ty0.b.Z2);
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173188c, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList2;
    }
}
