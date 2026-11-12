package po;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import dm.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.w3;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.q1;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpo/u;", "Lpo/h;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends h {
    public static final /* synthetic */ int G1 = 0;
    public boolean F1 = true;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138983a;

        static {
            int[] iArr = new int[qw0.v.values().length];
            try {
                iArr[qw0.v.LAPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qw0.v.TIMING_GATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qw0.v.OBSTACLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qw0.v.JUMPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qw0.v.CLIMBS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f138983a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f138984a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f138984a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f138984a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f138984a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // po.h
    public final void A7() {
        B7();
        Q7();
    }

    @Override // po.h
    public final void F6() {
        super.F6();
        if (R7()) {
            List<x1> list = this.V0;
            list.getClass();
            P7(list);
        }
    }

    @Override // po.h
    public final void G6(ArrayList arrayList) {
        super.G6(arrayList);
        if (R7()) {
            List<x1> list = this.V0;
            ArrayList arrayListL = androidx.core.view.j.l(list);
            for (Object obj : list) {
                if (cq.z.c((x1) obj)) {
                    arrayListL.add(obj);
                }
            }
            int i14 = 0;
            for (Object obj2 : arrayListL) {
                int i15 = i14 + 1;
                Object obj3 = null;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                x1 x1Var = (x1) obj2;
                DateTime startDateTime = x1Var.getStartDateTime();
                Long lValueOf = startDateTime != null ? Long.valueOf(startDateTime.getMillis()) : null;
                DateTime endDateTime = x1Var.getEndDateTime();
                Long lValueOf2 = endDateTime != null ? Long.valueOf(endDateTime.getMillis()) : null;
                if (lValueOf != null && lValueOf2 != null) {
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC = this.T0.D().C();
                    listC.getClass();
                    for (Object obj4 : listC) {
                        long jLongValue = lValueOf.longValue();
                        long jLongValue2 = lValueOf2.longValue();
                        long jG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj4).G();
                        if (jLongValue <= jG && jG < jLongValue2) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj3;
                    if (a0Var != null) {
                        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(a0Var.C(), a0Var.F(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((com.garmin.android.library.mapsdkadapter.f) it.next()).d(fVar, -1.0f)) {
                                    O7(fVar, i14);
                                    break;
                                }
                            }
                        }
                    }
                }
                i14 = i15;
            }
        }
    }

    @Override // po.h, xf1.d, com.garmin.android.library.mapsdkadapter.i.m
    public final boolean O2(ie2.j jVar) {
        ComposeView composeView;
        String title = jVar.getTitle();
        if (title == null) {
            title = "";
        }
        String string = getString(R.string.lbl_climb_indicator);
        string.getClass();
        if (!d53.u.y(title, string, false)) {
            return super.O2(jVar);
        }
        Bundle bundle = (Bundle) jVar.mo329getTag();
        int i14 = bundle != null ? bundle.getInt("CLIMB_NUMBER") : 0;
        List<x1> list = this.V0;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (cq.z.c((x1) obj)) {
                arrayListL.add(obj);
            }
        }
        x1 x1Var = (x1) arrayListL.get(i14);
        List<x1> list2 = this.V0;
        list2.getClass();
        x1Var.getClass();
        ArrayList arrayListA = cq.z.a(list2, x1Var);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String strG = new m00.a(contextRequireContext, null, 2, null).g(Integer.valueOf(i14 + 1));
        View view2 = getView();
        if (view2 != null && (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) != null) {
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(w3.b.f91619b);
            composeView.setContent(new z3.e(-685385526, true, new t(strG, this, arrayListA, x1Var, composeView, 0)));
        }
        return true;
    }

    public final void O7(com.garmin.android.library.mapsdkadapter.f fVar, int i14) {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            pVar.b(2131232659);
            pVar.a(0.5f, 0.9f);
            pVar.d(fVar);
            String strH = vb.h.h(i14 + 1, getString(R.string.lbl_climb_indicator), StringUtils.SPACE);
            com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
            oVar.f50312d = strH;
            Bundle bundleE = am.j.e(i14, "CLIMB_NUMBER");
            Unit unit = Unit.INSTANCE;
            oVar.f50322n = bundleE;
            hVar.x(pVar);
        }
    }

    public final void P7(List<x1> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (cq.z.c((x1) obj)) {
                arrayList.add(obj);
            }
        }
        int i14 = 0;
        for (Object obj2 : arrayList) {
            int i15 = i14 + 1;
            Object obj3 = null;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            x1 x1Var = (x1) obj2;
            DateTime startDateTime = x1Var.getStartDateTime();
            Long lValueOf = startDateTime != null ? Long.valueOf(startDateTime.getMillis()) : null;
            DateTime endDateTime = x1Var.getEndDateTime();
            Long lValueOf2 = endDateTime != null ? Long.valueOf(endDateTime.getMillis()) : null;
            if (lValueOf != null && lValueOf2 != null) {
                List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC = this.T0.D().C();
                listC.getClass();
                for (Object obj4 : listC) {
                    long jLongValue = lValueOf.longValue();
                    long jLongValue2 = lValueOf2.longValue();
                    long jG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj4).G();
                    if (jLongValue <= jG && jG < jLongValue2) {
                        obj3 = obj4;
                        break;
                    }
                }
                com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj3;
                if (a0Var != null) {
                    O7(new com.garmin.android.library.mapsdkadapter.f(a0Var.C(), a0Var.F(), com.garmin.android.library.mapsdkadapter.i.b.WGS84), i14);
                }
            }
            i14 = i15;
        }
    }

    public final void Q7() {
        ArrayList<ie2.j> arrayList;
        List<ie2.j> listQ;
        qe2.h hVar = this.f148294e;
        if (hVar == null || (listQ = hVar.f144584a.Q()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listQ) {
                String title = ((ie2.j) obj).getTitle();
                if (title != null) {
                    String string = getString(R.string.lbl_climb_indicator);
                    string.getClass();
                    if (d53.u.y(title, string, false)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        if (arrayList != null) {
            for (ie2.j jVar : arrayList) {
                qe2.h hVar2 = this.f148294e;
                if (hVar2 != null) {
                    hVar2.n(jVar);
                }
            }
        }
    }

    public final boolean R7() {
        List<x1> list = this.V0;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (cq.z.c((x1) it.next())) {
                return this.F1;
            }
        }
        return false;
    }

    @Override // po.h
    public final void h7() {
        s sVar = this.f138866u1;
        long j8 = this.f138857p.f29448a;
        w0 w0VarK = sVar.f138976e;
        if (w0VarK == null) {
            cw.a.M().getClass();
            w0VarK = new n0(j8, true).k();
            w0VarK.getClass();
            sVar.f138976e = w0VarK;
        }
        w0VarK.f(this, new c(new q1(this, 21)));
    }

    @Override // po.h
    public final ArrayList j7() {
        ArrayList arrayListJ7 = super.j7();
        List<x1> list = this.V0;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (cq.z.c((x1) it.next())) {
                    arrayListJ7.add(new qw0.u(qw0.v.CLIMBS, this.F1, true, null, 8, null));
                    break;
                }
            }
        }
        return arrayListJ7;
    }

    @Override // po.h
    public final void p7() {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.clear();
        }
        if (this.f138857p != null) {
            i7();
        }
    }

    @Override // po.h
    public final void x7(qw0.v vVar, boolean z14) {
        vVar.getClass();
        int i14 = b.f138983a[vVar.ordinal()];
        am.e eVar = this.f138868v1;
        if (i14 == 1) {
            eVar.a(z14);
            F7(z14);
            return;
        }
        if (i14 == 2) {
            this.f138860q1 = z14;
            K7(z14);
            return;
        }
        if (i14 == 3) {
            eVar.f(z14);
            H7(z14);
            return;
        }
        if (i14 == 4) {
            this.f138858p1 = z14;
            if (this.f148294e == null) {
                return;
            }
            if (z14) {
                M6();
                return;
            } else {
                B7();
                return;
            }
        }
        if (i14 != 5) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.f(a2.ACTIVITIES, "ClimbsMapFragment", "Error! Did not handle switch type" + vVar + ".");
            return;
        }
        this.F1 = z14;
        if (this.f148294e == null) {
            return;
        }
        if (!z14) {
            Q7();
            return;
        }
        List<x1> list = this.V0;
        list.getClass();
        P7(list);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpo/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CLIMB_NUMBER", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
