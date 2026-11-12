package a83;

import android.content.Intent;
import androidx.lifecycle.v1;
import aq.a2;
import aq.b2;
import aq.d2;
import aq.h2;
import c30.a1;
import c30.b1;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseDrawingMethodActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseParametersActivity;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.compose.o;
import cy1.f;
import e23.p;
import e23.q;
import ey1.g;
import g02.t;
import ge1.b;
import h2.j0;
import j90.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jo.c;
import k23.d;
import k63.k;
import k63.m;
import lc.m0;
import lc.u0;
import m63.a0;
import me2.l;
import me2.z;
import mt0.k0;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.p1;
import pt1.x;
import r53.c2;
import r53.m1;
import r53.u;
import r53.v;
import x40.l0;
import x40.r1;
import x40.s1;
import x40.t1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2009d;

    public /* synthetic */ a(int i14, Object obj, Object obj2, int i15) {
        this.f2006a = i15;
        this.f2007b = i14;
        this.f2008c = obj;
        this.f2009d = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.a
    public final Object invoke() {
        Object bVar;
        GoogleMap googleMap;
        int i14 = this.f2006a;
        int i15 = 1;
        int i16 = this.f2007b;
        Object obj = this.f2009d;
        Object obj2 = this.f2008c;
        switch (i14) {
            case 0:
                return super/*org.koin.core.parameter.ParametersHolder*/.elementAt(i16, (d) obj);
            case 1:
                a2 a2Var = (a2) obj2;
                e eVar = (e) obj;
                k0 k0Var = a2Var.f11815d;
                ArrayList<e> arrayList = a2Var.f11814c;
                int i17 = this.f2007b;
                Long lH = arrayList.get(i17).H();
                long jLongValue = lH != null ? lH.longValue() : -2L;
                Long lZ = a2Var.f11814c.get(i17).Z();
                long jLongValue2 = lZ != null ? lZ.longValue() : -2L;
                Double D = a2Var.f11814c.get(i17).D();
                k0Var.b8(i17, jLongValue, jLongValue2, D != null ? D.doubleValue() : 0.0d);
                int size = a2Var.f11814c.size();
                for (int i18 = 0; i18 < size; i18++) {
                    if (eVar.I() == a2Var.f11814c.get(i18).I()) {
                        a2Var.f11815d.z7(i17, i18);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                b2 b2Var = (b2) obj2;
                e eVar2 = (e) obj;
                k0 k0Var2 = b2Var.f11839d;
                ArrayList<e> arrayList2 = b2Var.f11838c;
                int i19 = this.f2007b;
                Long lH2 = arrayList2.get(i19).H();
                long jLongValue3 = lH2 != null ? lH2.longValue() : -2L;
                Long lZ2 = b2Var.f11838c.get(i19).Z();
                long jLongValue4 = lZ2 != null ? lZ2.longValue() : -2L;
                Double D2 = b2Var.f11838c.get(i19).D();
                k0Var2.b8(i19, jLongValue3, jLongValue4, D2 != null ? D2.doubleValue() : 0.0d);
                int size2 = b2Var.f11838c.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    if (eVar2.I() == b2Var.f11838c.get(i24).I()) {
                        b2Var.f11839d.z7(i19, i24);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                d2 d2Var = (d2) obj2;
                e eVar3 = (e) obj;
                ArrayList<e> arrayList3 = d2Var.f11905b;
                int i25 = this.f2007b;
                Long lH3 = arrayList3.get(i25).H();
                Long lZ3 = d2Var.f11905b.get(i25).Z();
                Double D3 = d2Var.f11905b.get(i25).D();
                d2Var.f11907d.b8(i25, lH3 != null ? lH3.longValue() : -2L, lZ3 != null ? lZ3.longValue() : -2L, D3 != null ? D3.doubleValue() : 0.0d);
                for (int i26 = 0; i26 < d2Var.f11905b.size(); i26++) {
                    if (eVar3.I() == d2Var.f11905b.get(i26).I()) {
                        d2Var.f11907d.z7(i25, i26);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                h2 h2Var = (h2) obj2;
                e eVar4 = (e) obj;
                ArrayList<e> arrayList4 = h2Var.f11982c;
                int i27 = this.f2007b;
                Long lH4 = arrayList4.get(i27).H();
                long jLongValue5 = lH4 != null ? lH4.longValue() : -2L;
                Long lZ4 = h2Var.f11982c.get(i27).Z();
                long jLongValue6 = lZ4 != null ? lZ4.longValue() : -2L;
                Double D4 = h2Var.f11982c.get(i27).D();
                h2Var.f11983d.b8(i27, jLongValue5, jLongValue6, D4 != null ? D4.doubleValue() : 0.0d);
                int size3 = h2Var.f11982c.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    if (eVar4.I() == h2Var.f11982c.get(i28).I()) {
                        h2Var.f11983d.z7(i27, i28);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ey1.a aVar = (ey1.a) obj2;
                f fVar = f.f56801a;
                aVar.M4(i16, i16 - 1);
                if (!((m0) obj).m()) {
                    b.T(v1.a(aVar), null, null, new g(aVar, null), 3);
                }
                return Unit.INSTANCE;
            case 6:
                b.T((b0) obj2, null, null, new t.a((j0) obj, i16, null), 3);
                return Unit.INSTANCE;
            case 7:
                c cVar = (c) obj2;
                q qVar = (q) obj;
                c.AbstractC1918c abstractC1918c = (c.AbstractC1918c) cVar;
                if (abstractC1918c instanceof c.AbstractC1918c.a) {
                    Boolean bool = ((c.AbstractC1918c.a) cVar).f99729e;
                    bVar = new c.AbstractC1918c.a(Boolean.valueOf(bool == null || !bool.booleanValue()));
                } else {
                    if (!(abstractC1918c instanceof c.AbstractC1918c.b)) {
                        u0.r();
                        return null;
                    }
                    Boolean bool2 = ((c.AbstractC1918c.b) cVar).f99730e;
                    bVar = new c.AbstractC1918c.b(Boolean.valueOf(bool2 == null || !bool2.booleanValue()));
                }
                qVar.invoke(Integer.valueOf(i16), bVar, null);
                return Unit.INSTANCE;
            case 8:
                x xVar = (x) obj;
                ((q) obj2).invoke(Integer.valueOf(i16), xVar.f141012i, Boolean.valueOf(xVar.f141019p));
                return Unit.INSTANCE;
            case 9:
                ((p) obj2).invoke(Integer.valueOf(i16), (n) obj);
                return Unit.INSTANCE;
            case 10:
                String str = (String) obj2;
                a0 a0Var = (a0) obj;
                k63.e[] eVarArr = new k63.e[i16];
                for (int i29 = 0; i29 < i16; i29++) {
                    eVarArr[i29] = k.f(str + '.' + a0Var.f116987e[i29], m.d.f103256a, new k63.e[0]);
                }
                return eVarArr;
            case 11:
                com.garmin.android.library.mapsdkadapter.e eVar5 = (com.garmin.android.library.mapsdkadapter.e) obj2;
                l lVar = (l) obj;
                int i30 = l.Z;
                Objects.toString(eVar5);
                boolean z14 = lVar.P;
                eVar5.getClass();
                LatLngBounds latLngBoundsH = z14 ? z.h(eVar5) : new LatLngBounds(eVar5.f50273a.f50283a, eVar5.f50274b.f50283a);
                if (i16 == -1) {
                    i16 = lVar.X;
                }
                CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsH, i16);
                cameraUpdateNewLatLngBounds.getClass();
                if (lVar.f50240a && (googleMap = lVar.f118187v) != null) {
                    googleMap.setOnMapLoadedCallback(new o(lVar, i15));
                }
                GoogleMap googleMap2 = lVar.f118187v;
                if (googleMap2 != null) {
                    googleMap2.moveCamera(cameraUpdateNewLatLngBounds);
                }
                return Unit.INSTANCE;
            case 12:
                ItemPickerActivity.a.b.C0738a c0738a = (ItemPickerActivity.a.b.C0738a) obj2;
                ItemPickerActivity.a aVar2 = (ItemPickerActivity.a) obj;
                int i34 = ItemPickerActivity.a.f39975d;
                if (c0738a.equals(aVar2.u())) {
                    return Unit.INSTANCE;
                }
                ItemPickerActivity.a.b.C0738a c0738aU = aVar2.u();
                c0738aU.f39980b = false;
                c0738a.f39980b = true;
                aVar2.notifyItemChanged(aVar2.f10698a.f10426f.indexOf(c0738aU), new ItemPickerActivity.a.c(c0738aU.f39980b));
                aVar2.notifyItemChanged(i16, new ItemPickerActivity.a.c(c0738a.f39980b));
                aVar2.f39977c.invoke(c0738a.f39979a);
                return Unit.INSTANCE;
            case 13:
                t30.m mVar = (t30.m) obj2;
                ClimbDTO climbDTO = (ClimbDTO) obj;
                q<? super ClimbDTO, ? super Integer, ? super Integer, Unit> qVar2 = mVar.f162193k;
                if (qVar2 != null) {
                    Integer numValueOf = Integer.valueOf(i16);
                    List<ClimbDTO> list = mVar.f162195m;
                    if (list == null) {
                        s.m("climbs");
                        throw null;
                    }
                    qVar2.invoke(climbDTO, numValueOf, Integer.valueOf(list.size()));
                }
                return Unit.INSTANCE;
            case 14:
                List list2 = (List) obj2;
                p1 p1Var = (p1) obj;
                ArrayList arrayListD1 = h0.d1((List) p1Var.getF182175a());
                arrayListD1.set(i16, "");
                p1Var.setValue(arrayListD1);
                if (i16 > 0) {
                    m4.b0.a((m4.b0) list2.get(i16 - 1));
                }
                return Unit.INSTANCE;
            case 15:
                l0 l0Var = (l0) obj2;
                b1 b1Var = l0Var.f188737y;
                a50.g gVar = (a50.g) l0Var.F.getValue();
                i.d dVar = l0Var.Y;
                b1Var.getClass();
                gVar.getClass();
                dVar.getClass();
                u uVar = new u(new m1(new v(new r1(l0Var, null), new c2(new a1(b1Var, gVar, dVar, (com.garmin.android.library.mapsdkadapter.f) obj, this.f2007b, null))), new s1(l0Var, null)), new t1(l0Var, null));
                x53.c cVar2 = s0.f129406a;
                r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(l0Var));
                return Unit.INSTANCE;
            case 16:
                ((xz0.o) obj2).f192802a.b2((InboxRequestItem) obj, i16);
                return Unit.INSTANCE;
            default:
                CourseDrawingMethodActivity courseDrawingMethodActivity = (CourseDrawingMethodActivity) obj2;
                CourseDrawingMethodActivity.a aVar3 = CourseDrawingMethodActivity.f33101a;
                ht.a.f85464a.getClass();
                ht.a.a(null, "RoundTripCourseCreator");
                CourseParametersActivity.f33102c.getClass();
                Intent intent = new Intent(courseDrawingMethodActivity, (Class<?>) CourseParametersActivity.class);
                intent.putExtra("GCM_extra_course_type", (com.garmin.android.apps.connectmobile.courses.model.i) obj);
                intent.putExtra("GCM_create_course_flow", i16);
                courseDrawingMethodActivity.startActivity(intent);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, int i15) {
        this.f2006a = i15;
        this.f2008c = obj;
        this.f2007b = i14;
        this.f2009d = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i14, int i15) {
        this.f2006a = i15;
        this.f2008c = obj;
        this.f2009d = obj2;
        this.f2007b = i14;
    }
}
