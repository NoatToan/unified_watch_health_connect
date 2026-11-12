package j40;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import qe2.h;
import sw0.f;
import sw0.j;
import u20.g;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f97003b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f97002a = i14;
        this.f97003b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Integer] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        i f104023a;
        com.garmin.android.library.mapsdkadapter.i.d f50264r;
        i f104023a2;
        ?? r14;
        int i14 = this.f97002a;
        c cVar = this.f97003b;
        switch (i14) {
            case 0:
                int i15 = c.V0;
                ((View) obj).getClass();
                g gVar = cVar.f97020y;
                if (gVar != null) {
                    gVar.q8();
                }
                g gVar2 = cVar.f97020y;
                if (gVar2 == null || (f104023a = gVar2.getF104023a()) == null) {
                    f104023a = i.ROAD_CYCLING;
                }
                m40.g.a aVar = m40.g.f116591h;
                boolean z14 = cVar.B;
                int i16 = cVar.V6().f109893a;
                h hVar = cVar.f148294e;
                if (hVar == null || (f50264r = hVar.f144584a.getF125703t()) == null) {
                    f50264r = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
                }
                m40.h hVar2 = new m40.h(i16, f50264r, cVar.f97021z.c(), false);
                m40.b bVar = new m40.b(cVar.V6().f109895c, f104023a.c(), cVar.V6().f109896d, f104023a.c(), cVar.V6().f109897e);
                boolean z15 = !cVar.P;
                boolean z16 = cVar.V6().f109894b;
                boolean z17 = cVar.D;
                boolean z18 = cVar.V6().f109898f;
                List<com.garmin.android.apps.connectmobile.courses.model.h> list = cVar.V6().f109899g;
                boolean z19 = f104023a.c() && cVar.F;
                boolean z24 = cVar.V6().f109900h;
                List<fn0.c> list2 = cVar.V6().f109901i;
                boolean z25 = f104023a.c() && cVar.I;
                boolean z26 = cVar.V6().f109902j;
                boolean z27 = f104023a.c() && cVar.E;
                boolean z28 = cVar.V6().f109903k;
                com.garmin.android.apps.connectmobile.courses.model.c cVar2 = cVar.T;
                if (cVar2 == null) {
                    cVar2 = com.garmin.android.apps.connectmobile.courses.model.c.PAVED;
                }
                m40.c cVar3 = new m40.c(z14, hVar2, bVar, new m40.a(z15, z16, z17, z18, list, z19, z24, list2, z25, z26, z27, z28, cVar2, cVar.X, cVar.Y));
                aVar.getClass();
                m40.g gVar3 = new m40.g();
                Bundle bundle = new Bundle();
                bundle.putParcelable("CourseMapSettings", cVar3);
                gVar3.setArguments(bundle);
                gVar3.f116592g = cVar.Q0;
                gVar3.show(cVar.requireActivity().getSupportFragmentManager(), "");
                break;
            case 1:
                int i17 = c.V0;
                ((View) obj).getClass();
                g gVar4 = cVar.f97020y;
                if (gVar4 != null) {
                    gVar4.q8();
                }
                Integer numValueOf = Integer.valueOf(R.dimen.map_legend_thin_line_height);
                Integer numValueOf2 = Integer.valueOf(R.drawable.legend_thin_line);
                ArrayList arrayListM = cVar.Z;
                Integer numValueOf3 = Integer.valueOf(R.dimen.icon_xsmall);
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("Screen", "Courses");
                ht.a.f85464a.getClass();
                ht.a.a(bundle2, "ViewMapLegend");
                g gVar5 = cVar.f97020y;
                if (gVar5 == null || (f104023a2 = gVar5.getF104023a()) == null) {
                    f104023a2 = i.ROAD_CYCLING;
                }
                i iVar = f104023a2;
                if (arrayListM.isEmpty()) {
                    c22.i iVarB = c22.i.b(R.string.title_course);
                    Integer numValueOf4 = Integer.valueOf(R.drawable.legend_thick_line);
                    Context context = cVar.getContext();
                    arrayListM = x.m(new sw0.g(iVarB, numValueOf4, context != null ? Integer.valueOf(context.getColor(R.color.blue_30_static)) : null, null, null, 24, null));
                }
                if (cVar.V6().f109895c) {
                    c22.i iVarB2 = c22.i.b(R.string.lbl_popularity_heatmap);
                    Context context2 = cVar.getContext();
                    arrayListM.add(new sw0.g(iVarB2, numValueOf2, context2 != null ? Integer.valueOf(context2.getColor(R.color.purple_30_static)) : null, null, numValueOf, 8, null));
                }
                if (cVar.V6().f109900h && iVar.c()) {
                    r14 = 0;
                    arrayListM.add(new sw0.g(c22.i.b(R.string.lbl_course_points_hazard), Integer.valueOf(R.drawable.course_legend_hazard), null, null, numValueOf3, 12, null));
                } else {
                    r14 = 0;
                }
                if (cVar.V6().f109903k && iVar.c() && cVar.E) {
                    arrayListM.add(new sw0.g(c22.i.b(R.string.start_of_climb), Integer.valueOf(R.drawable.course_legend_start_of_climb), null, null, numValueOf3, 12, null));
                }
                if (!h0.b1(cVar.f97011n.f102836b).isEmpty()) {
                    arrayListM.add(new sw0.g(c22.i.b(R.string.lbl_course_point), Integer.valueOf(R.drawable.legend_course_point_circle), null, null, numValueOf3, 12, null));
                }
                if (((s20.h) KoinJavaComponent.get$default(s20.h.class, r14, r14, 6, r14)).c()) {
                    if (cVar.V6().f109898f && cVar.D) {
                        x0.f23314a.getClass();
                        arrayListM.add(new sw0.g(g2.b(x0.Hc), Integer.valueOf(R.drawable.legend_poi_circle), null, null, numValueOf3, 12, null));
                    }
                    if (cVar.V6().f109896d && iVar.c()) {
                        ?? r15 = r14;
                        x0.f23314a.getClass();
                        g2 g2VarB = g2.b(x0.f23477jc);
                        Context context3 = cVar.getContext();
                        arrayListM.add(new sw0.g(g2VarB, numValueOf2, context3 != null ? Integer.valueOf(context3.getColor(R.color.red_10_static)) : r15, null, numValueOf, 8, null));
                    }
                }
                if (cVar.V6().f109897e && iVar.c()) {
                    arrayListM.add(new sw0.g(c22.i.b(R.string.lbl_unpaved_roads), Integer.valueOf(R.drawable.course_legend_unpaved_roads), null, null, null, 28, null));
                }
                ArrayList arrayListM2 = x.m(new f(arrayListM));
                if (cVar.V6().f109903k && iVar.c() && cVar.E) {
                    arrayListM2.add(new sw0.b());
                }
                j.f161084g.getClass();
                j jVar = new j();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelableArrayList("LIST_LEGEND_ITEMS", new ArrayList<>(arrayListM2));
                jVar.setArguments(bundle3);
                jVar.show(cVar.requireActivity().getSupportFragmentManager(), "");
                break;
            case 2:
                int i18 = c.V0;
                ((View) obj).getClass();
                h hVar3 = cVar.f148294e;
                c.C1850c c1850c = cVar.Q0;
                if (hVar3 != null) {
                    com.garmin.android.library.mapsdkadapter.i iVar2 = hVar3.f144584a;
                    boolean b14 = iVar2.getF125701k0();
                    boolean z29 = !b14;
                    if (b14) {
                        c1850c.a(z29);
                    } else {
                        com.garmin.android.library.mapsdkadapter.i.d f50264r2 = iVar2.getF125703t();
                        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
                        if (f50264r2 != dVar) {
                            c1850c.b(dVar);
                            hVar3.A(new a(cVar));
                        } else {
                            c1850c.a(z29);
                        }
                    }
                }
                break;
            case 3:
                int i19 = c.V0;
                ((View) obj).getClass();
                h hVar4 = cVar.f148294e;
                if (hVar4 != null) {
                    hVar4.g();
                }
                break;
            case 4:
                com.garmin.android.library.mapsdkadapter.i iVar3 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar3.getClass();
                iVar3.a0(cVar);
                break;
            default:
                com.garmin.android.library.mapsdkadapter.i iVar4 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar4.getClass();
                iVar4.W(cVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
