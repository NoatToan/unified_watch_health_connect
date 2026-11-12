package x72;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.navigation.fragment.NavHostFragment;
import c80.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activity.details.presentation.overview.SelectTrailBottomSheet;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import kotlin.m3;
import m4.q;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p008y1.w;
import p008y1.x;
import p008y1.x3;
import p008y1.z;
import p13.h0;
import p3.l1;
import p3.m1;
import p3.n1;
import p3.p1;
import qr.t;
import ue.u;
import xm0.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f189475d;

    public /* synthetic */ k(q qVar, m3 m3Var, e23.l lVar) {
        this.f189472a = 13;
        this.f189474c = qVar;
        this.f189475d = m3Var;
        this.f189473b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        z zVar;
        String str;
        int i14;
        int i15 = this.f189472a;
        Object obj = this.f189473b;
        Object obj2 = this.f189475d;
        Object obj3 = this.f189474c;
        switch (i15) {
            case 0:
                ((e23.l) obj).invoke(e.a((e) obj3, null, null, ((m1) obj2).getFloatValue(), null, null, 27));
                return Unit.INSTANCE;
            case 1:
                ((l1) obj).u(((aa1.e) obj3).f2268j.f2258j);
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 2:
                ((xg0.n) obj).r6((wg0.a) obj3, (wg0.c) obj2);
                return Unit.INSTANCE;
            case 3:
                v vVar = (v) obj3;
                ((p1) obj2).setValue(Boolean.FALSE);
                vVar.getClass();
                ((xm0.z) obj).f191488a.k(null, vVar);
                return Unit.INSTANCE;
            case 4:
                SelectTrailBottomSheet selectTrailBottomSheet = (SelectTrailBottomSheet) obj2;
                ms1.d dVar = (ms1.d) ((p1) obj3).getF182175a();
                if (dVar != null) {
                    t tVar = (t) selectTrailBottomSheet.f30107g.getValue();
                    tVar.getClass();
                    Long l14 = dVar.f120483a;
                    if (l14 != null) {
                        tVar.b6(l14.longValue());
                    } else {
                        i2.f36769a.getClass();
                        i2.a.p(a2.ACTIVITIES, "ActivityDetailsViewModel", "Found null in curatedCourseId " + dVar);
                    }
                    NavHostFragment.f10124e.getClass();
                    NavHostFragment.a.a(selectTrailBottomSheet).n();
                } else {
                    a2 a2Var = a2.ACTIVITIES;
                    i2.f36769a.getClass();
                    i2.a.p(a2Var, "SelectTrailBottomSheet", "Found null in selectedTrailsData when 'Save' button has been clicked.");
                }
                return Unit.INSTANCE;
            case 5:
                z zVar2 = (z) obj;
                x3 x3Var = (x3) obj3;
                x xVar = (x) obj2;
                w wVar = zVar2.f193735f;
                while (true) {
                    q3.c<z.a> cVar = wVar.f193690a;
                    int i16 = cVar.f142358c;
                    if (i16 != 0) {
                        if (i16 == 0) {
                            n23.j.s("MutableVector is empty.");
                            return null;
                        }
                        n4.d dVarInvoke = cVar.f142356a[i16 - 1].f193741a.invoke();
                        if (dVarInvoke == null ? true : z.X1(zVar2, dVarInvoke, 0L, 0L, 3)) {
                            q3.c<z.a> cVar2 = wVar.f193690a;
                            o53.j<Unit> jVar = cVar2.k(cVar2.f142358c - 1).f193742b;
                            Unit unit = Unit.INSTANCE;
                            int i17 = o13.q.f128596b;
                            jVar.resumeWith(unit);
                        }
                    }
                }
                if (zVar2.f193737h) {
                    zVar = zVar2;
                    n4.d dVarW1 = zVar.W1();
                    if (dVarW1 != null && z.X1(zVar, dVarW1, 0L, 0L, 3)) {
                        zVar.f193737h = false;
                    }
                } else {
                    zVar = zVar2;
                }
                g6.k.f76003b.getClass();
                x3Var.f193716e = z.U1(zVar, xVar, 0L);
                return Unit.INSTANCE;
            case 6:
                Boolean bool = Boolean.FALSE;
                ((p1) obj3).setValue(bool);
                ((y22.j) obj).f0();
                ((p1) obj2).setValue(bool);
                return Unit.INSTANCE;
            case 7:
                ((y22.j) obj).G2((Context) obj3, ((y22.f.a) ((y22.f) obj2)).f194252a);
                return Unit.INSTANCE;
            case 8:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj3;
                ye.c cVar3 = (ye.c) obj2;
                if (((m0) obj).f105804a) {
                    u uVarA = u.a();
                    int i18 = ye.l.f196812a;
                    uVarA.getClass();
                    connectivityManager.unregisterNetworkCallback(cVar3);
                }
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) obj3;
                e23.p pVar = (e23.p) obj2;
                yx2.i iVar = (yx2.i) h0.d0(((s.b) ((s) obj)).f25559a);
                if (iVar == null || (str = iVar.f200094g) == null) {
                    Toast.makeText(context, "Error! metaPackageSku was null. This should not have happened.", 0).show();
                } else {
                    pVar.invoke(str, null);
                }
                return Unit.INSTANCE;
            case 10:
                yk1.i iVar2 = (yk1.i) obj;
                String str2 = (String) obj3;
                p1 p1Var = (p1) obj2;
                StrideLengthSettingsActivity.a aVar = StrideLengthSettingsActivity.f44198b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                    iVar2.D4(str2);
                }
                return Unit.INSTANCE;
            case 11:
                ((z3.c.a) obj).a();
                z3.b bVar = ((z3.c) obj3).f202081c;
                int i19 = ((p0) obj2).f105807a;
                do {
                    i14 = bVar.get();
                } while (!bVar.compareAndSet(i14, ((i14 >>> 27) & 15) == i19 ? i14 - 1 : i14));
                return Unit.INSTANCE;
            case 12:
                t41.f fVar = (t41.f) obj;
                p1 p1Var2 = (p1) obj3;
                p1 p1Var3 = (p1) obj2;
                if (fVar == t41.f.OTHER) {
                    p1Var2.setValue(Boolean.TRUE);
                } else {
                    p1Var3.setValue(fVar.name());
                }
                return Unit.INSTANCE;
            case 13:
                m3 m3Var = (m3) obj2;
                e23.l lVar = (e23.l) obj;
                ((q) obj3).y(false);
                if (m3Var != null) {
                    m3Var.hide();
                }
                lVar.invoke(a60.a.C0016a.f1527a);
                return Unit.INSTANCE;
            case 14:
                ((p1) obj3).setValue(Boolean.FALSE);
                ((e23.l) obj).invoke(Integer.valueOf(((n1) obj2).getIntValue()));
                return Unit.INSTANCE;
            case 15:
                ((zo1.b) obj).f206232e.invoke();
                ((p1) obj3).setValue(Boolean.FALSE);
                ((p1) obj2).setValue(null);
                return Unit.INSTANCE;
            default:
                zo1.q qVar = (zo1.q) obj;
                String groupRideUUID = ((yo1.j) obj3).getGroupRideUUID();
                qVar.getClass();
                groupRideUUID.getClass();
                qVar.z4(true);
                ge1.b.T(v1.a(qVar), null, null, new zo1.v(qVar, groupRideUUID, null), 3);
                ((p1) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Object obj, int i14, Object obj2, Object obj3) {
        this.f189472a = i14;
        this.f189473b = obj;
        this.f189474c = obj2;
        this.f189475d = obj3;
    }

    public /* synthetic */ k(xg0.n nVar, wg0.a aVar, wg0.c cVar, int i14) {
        this.f189472a = 2;
        this.f189473b = nVar;
        this.f189474c = aVar;
        this.f189475d = cVar;
    }
}
