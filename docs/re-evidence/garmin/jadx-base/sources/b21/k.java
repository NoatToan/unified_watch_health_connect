package b21;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import i3.uj;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14788e;

    public /* synthetic */ k(p3.p1 p1Var, int i14, p3.x3 x3Var, p3.p1 p1Var2) {
        this.f14784a = 9;
        this.f14788e = p1Var;
        this.f14785b = i14;
        this.f14786c = x3Var;
        this.f14787d = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        ArrayList arrayList;
        n4.d dVarG;
        boolean z14;
        switch (this.f14784a) {
            case 0:
                u21.f fVar = (u21.f) this.f14786c;
                lc.m0 m0Var = (lc.m0) this.f14787d;
                p3.p1 p1Var = (p3.p1) this.f14788e;
                String str = ((u21.g) p1Var.getF182175a()).f167962b;
                boolean z15 = ((u21.g) p1Var.getF182175a()).f167963c;
                fVar.getClass();
                str.getClass();
                List<q01.e> list = fVar.f167950a;
                if (list != null) {
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    for (q01.e eVarA : list) {
                        if (eVarA.f141993a == this.f14785b) {
                            eVarA = q01.e.a(eVarA, str, false, z15 || eVarA.f141998f, null, null, null, 0, 4059);
                        }
                        arrayList.add(eVarA);
                    }
                } else {
                    arrayList = null;
                }
                fVar.f167950a = arrayList;
                lc.y.l(m0Var, c.C0211c.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                fo.q qVar = (fo.q) this.f14786c;
                wo0.a aVar = (wo0.a) this.f14787d;
                e23.p pVar = (e23.p) this.f14788e;
                int i14 = qVar.f72406e;
                boolean z16 = qVar.f72407f;
                boolean z17 = !d53.w.J(qVar.f72403b);
                boolean zP = lg.d.p(qVar);
                am.x0 x0Var = aVar.f186420f;
                int i15 = this.f14785b;
                new zn.a.j(i15, i14, z16, z17, zP, x0Var).a();
                pVar.invoke(Integer.valueOf(i15), aVar);
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) this.f14786c;
                g63.g gVar = (g63.g) this.f14787d;
                g63.f fVar2 = (g63.f) this.f14788e;
                StringBuilder sbL = hb.a.l("Can not interpret the string '", str2, "' as ");
                sbL.append(((g63.e) gVar.f76137a.get(this.f14785b)).f76131b);
                sbL.append(": ");
                sbL.append(fVar2.a());
                return sbL.toString();
            case 3:
                return "Expected " + ((g63.u) this.f14786c).f76168b + " but got " + ((CharSequence) this.f14787d).subSequence(this.f14785b, ((p005kotlin.jvm.internal.p0) this.f14788e).f105807a).toString();
            case 4:
                uj ujVar = (uj) this.f14786c;
                p3.p1 p1Var2 = (p3.p1) this.f14788e;
                p3.n1 n1Var = (p3.n1) this.f14787d;
                View view2 = ujVar.f89959a;
                Rect rect = new Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                g6.l lVar = new g6.l(rect.left, rect.top, rect.right, rect.bottom);
                f5.c0 c0Var = (f5.c0) p1Var2.getF182175a();
                if (c0Var == null || !c0Var.isAttached()) {
                    n4.d.f123545e.getClass();
                    dVarG = n4.d.f123546f;
                } else {
                    n4.c.f123541b.getClass();
                    dVarG = g8.i.g(c0Var.W(0L), g6.n.c(c0Var.a()));
                }
                n1Var.t(i3.h6.b(lVar, dVarG, this.f14785b));
                return Unit.INSTANCE;
            case 5:
                return km1.v.b((km1.v) this.f14786c, 0L, null, this.f14785b, ((DateTime) ((p3.p1) this.f14788e).getF182175a()).getMillis(), ((DateTime) ((p3.p1) this.f14787d).getF182175a()).getMillis(), null, -425, 8191);
            case 6:
                ge1.b.T((o53.b0) this.f14786c, null, null, new l02.m.a((h2.j0) this.f14787d, this.f14785b, (e23.l) this.f14788e, null), 3);
                return Unit.INSTANCE;
            case 7:
                e23.l lVar2 = (e23.l) this.f14786c;
                GroupDTO.d dVar = (GroupDTO.d) this.f14787d;
                ((p3.n1) this.f14788e).t(this.f14785b);
                lVar2.invoke(dVar);
                return Unit.INSTANCE;
            case 8:
                e23.l lVar3 = (e23.l) this.f14786c;
                GroupDTO.e eVar = (GroupDTO.e) this.f14787d;
                ((p3.n1) this.f14788e).t(this.f14785b);
                lVar3.invoke(eVar);
                return Unit.INSTANCE;
            case 9:
                p3.p1 p1Var3 = (p3.p1) this.f14788e;
                p3.x3 x3Var = (p3.x3) this.f14786c;
                p3.p1 p1Var4 = (p3.p1) this.f14787d;
                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                    z14 = true;
                } else {
                    z14 = false;
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        s5.q0 q0Var = (s5.q0) p1Var4.getF182175a();
                        if ((q0Var != null ? q0Var.f157281b.f157257f : 0) > this.f14785b) {
                            z14 = true;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            case 10:
                i53.c cVar = (i53.c) this.f14786c;
                e23.a aVar2 = (e23.a) this.f14787d;
                p3.p1 p1Var5 = (p3.p1) this.f14788e;
                if (cVar.size() >= this.f14785b) {
                    p1Var5.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
                aVar2.invoke();
                return Unit.INSTANCE;
            case 11:
                i53.c cVar2 = (i53.c) this.f14786c;
                ug2.k kVar = (ug2.k) this.f14787d;
                p3.p1 p1Var6 = (p3.p1) this.f14788e;
                if (cVar2.size() >= this.f14785b) {
                    p1Var6.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
                kVar.invoke();
                return Unit.INSTANCE;
            case 12:
                c.q qVar2 = (c.q) this.f14786c;
                c.q qVar3 = (c.q) this.f14787d;
                PermissionState permissionState = (PermissionState) this.f14788e;
                int i16 = Build.VERSION.SDK_INT;
                int i17 = this.f14785b;
                if (i16 <= 29 && !PermissionsUtilKt.isGranted(permissionState.getStatus())) {
                    permissionState.launchPermissionRequest();
                } else {
                    y22.e.d(i17, qVar2, qVar3);
                }
                return Unit.INSTANCE;
            case 13:
                e23.a aVar3 = (e23.a) this.f14786c;
                p3.p1 p1Var7 = (p3.p1) this.f14788e;
                p3.p1 p1Var8 = (p3.p1) this.f14787d;
                if (((i53.c) p1Var7.getF182175a()).size() >= this.f14785b) {
                    p1Var8.setValue(Boolean.TRUE);
                } else {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            default:
                ug2.k kVar2 = (ug2.k) this.f14786c;
                p3.p1 p1Var9 = (p3.p1) this.f14788e;
                p3.p1 p1Var10 = (p3.p1) this.f14787d;
                if (((i53.c) p1Var9.getF182175a()).size() >= this.f14785b) {
                    p1Var10.setValue(Boolean.TRUE);
                } else {
                    kVar2.invoke();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(int i14, Object obj, Object obj2, Object obj3, int i15) {
        this.f14784a = i15;
        this.f14785b = i14;
        this.f14786c = obj;
        this.f14787d = obj2;
        this.f14788e = obj3;
    }

    public /* synthetic */ k(Object obj, int i14, Object obj2, p3.p1 p1Var, int i15) {
        this.f14784a = i15;
        this.f14786c = obj;
        this.f14785b = i14;
        this.f14787d = obj2;
        this.f14788e = p1Var;
    }

    public /* synthetic */ k(Object obj, int i14, p3.p1 p1Var, p3.p1 p1Var2, int i15) {
        this.f14784a = i15;
        this.f14786c = obj;
        this.f14785b = i14;
        this.f14788e = p1Var;
        this.f14787d = p1Var2;
    }

    public /* synthetic */ k(Object obj, Object obj2, int i14, Object obj3, int i15) {
        this.f14784a = i15;
        this.f14786c = obj;
        this.f14787d = obj2;
        this.f14785b = i14;
        this.f14788e = obj3;
    }

    public /* synthetic */ k(int i14, e23.a aVar, p3.p1 p1Var, p3.p1 p1Var2, int i15) {
        this.f14784a = i15;
        this.f14785b = i14;
        this.f14786c = aVar;
        this.f14788e = p1Var;
        this.f14787d = p1Var2;
    }
}
