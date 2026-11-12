package q30;

import am.j;
import am.x0;
import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k30.q;
import k30.w;
import o13.p;
import o4.f0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lq30/b;", "Lqz/c;", "Lk30/q;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.c<q, ILineDataSet> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f142378f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f142379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f142380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f142381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f142382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f142383e;

    /* JADX INFO: renamed from: q30.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2674b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Float.valueOf(((Entry) t7).getX()), Float.valueOf(((Entry) t14).getX()));
        }
    }

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f142379a = context;
        x0 x0Var = x0.f4312o;
        String string = context.getString(R.string.chart_distance_title, context.getString(ar.b.b(x0Var, null).f23164e));
        string.getClass();
        xz.g.f fVar = xz.g.f.f192751a;
        this.f142381c = x.m(new xz.f(string, null, null, null, fVar, null, null, 110, null), new xz.f("", null, null, null, fVar, null, null, 110, null));
        String string2 = context.getString(R.string.chart_distance_title, context.getString(ar.b.b(x0Var, null).f23164e));
        string2.getClass();
        xz.f fVar2 = new xz.f(string2, null, null, null, fVar, null, null, 110, null);
        String string3 = context.getString(R.string.lbl_climb_cat4_and_easier);
        string3.getClass();
        xz.g.a aVar = xz.g.a.f192745a;
        xz.f fVar3 = new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, R.color.lime_20_static)), null, aVar, null, null, 106, null);
        String string4 = context.getString(R.string.lbl_abbreviated_category, "3");
        string4.getClass();
        xz.f fVar4 = new xz.f(string4, null, Integer.valueOf(a7.b.getColor(context, R.color.yellow_50_static)), null, aVar, null, null, 106, null);
        String string5 = context.getString(R.string.lbl_abbreviated_category, "2");
        string5.getClass();
        xz.f fVar5 = new xz.f(string5, null, Integer.valueOf(a7.b.getColor(context, R.color.orange_30_static)), null, aVar, null, null, 106, null);
        String string6 = context.getString(R.string.lbl_abbreviated_category, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        string6.getClass();
        xz.f fVar6 = new xz.f(string6, null, Integer.valueOf(a7.b.getColor(context, R.color.red_30_static)), null, aVar, null, null, 106, null);
        String string7 = context.getString(R.string.lbl_horse_cat);
        string7.getClass();
        this.f142382d = x.m(fVar2, fVar3, fVar4, fVar5, fVar6, new xz.f(string7, null, Integer.valueOf(a7.b.getColor(context, R.color.red_70_static)), null, aVar, null, null, 106, null));
        String string8 = context.getString(R.string.chart_distance_title, context.getString(ar.b.b(x0Var, null).f23164e));
        string8.getClass();
        xz.f fVar7 = new xz.f(string8, null, null, null, fVar, null, null, 110, null);
        String string9 = context.getString(R.string.lbl_paved_unknown);
        string9.getClass();
        xz.g.C3605g c3605g = xz.g.C3605g.f192752a;
        gl.c.f77766a.getClass();
        gl.e eVar = gl.c.f77767b;
        xz.f fVar8 = new xz.f(string9, null, Integer.valueOf(f0.j(eVar.f77817y)), null, c3605g, null, null, 106, null);
        String string10 = context.getString(R.string.unpaved);
        string10.getClass();
        this.f142383e = x.m(fVar7, fVar8, new xz.f(string10, null, Integer.valueOf(f0.j(eVar.D)), null, c3605g, null, null, 106, null));
    }

    public static p x(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        double dDoubleValue = Double.MAX_VALUE;
        double dDoubleValue2 = Double.MIN_VALUE;
        double dDoubleValue3 = Double.MIN_VALUE;
        double dDoubleValue4 = Double.MAX_VALUE;
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
            Double d14 = geoPointDTO.distance;
            Double d15 = geoPointDTO.elevation;
            if (d14 != null && d15 != null) {
                if (d14.doubleValue() > dDoubleValue2) {
                    dDoubleValue2 = d14.doubleValue();
                }
                if (d14.doubleValue() < dDoubleValue) {
                    dDoubleValue = d14.doubleValue();
                }
                if (d15.doubleValue() > dDoubleValue3) {
                    dDoubleValue3 = d15.doubleValue();
                }
                if (d15.doubleValue() < dDoubleValue4) {
                    dDoubleValue4 = d15.doubleValue();
                }
            }
        }
        return new p(new p(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2)), new p(Double.valueOf(dDoubleValue4), Double.valueOf(dDoubleValue3)));
    }

    public static List y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
            Double d14 = geoPointDTO.distance;
            Double d15 = geoPointDTO.elevation;
            if (d14 != null && d15 != null) {
                arrayList.add(new Entry((float) d14.doubleValue(), (float) d15.doubleValue(), new r30.c(d14.doubleValue(), d15.doubleValue())));
            }
        }
        return h0.N0(arrayList, new C2674b());
    }

    public final void A(LineDataSet lineDataSet, com.garmin.android.apps.connectmobile.courses.model.b bVar) {
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setHighlightEnabled(false);
        Context context = this.f142379a;
        lineDataSet.setColor(context.getColor(R.color.gcm_chart_default_data_set));
        lineDataSet.setLineWidth(2.0f);
        if (bVar == null) {
            lineDataSet.setFillAlpha(0);
        } else {
            lineDataSet.setFillColor(context.getColor(bVar.f32829b));
            lineDataSet.setFillAlpha(255);
        }
        lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setFillFormatter(new p6.b(25));
    }

    @Override // qz.c
    public final List<ILineDataSet> a(q qVar) {
        ArrayList arrayList;
        List<GeoPointDTO> list;
        List<GeoPointDTO> list2;
        Iterator it;
        ArrayList<GeoPointDTO> arrayList2;
        q qVar2 = qVar;
        Object obj = this.f142380b;
        int i14 = 1;
        String str = "";
        if (obj == r30.a.CLIMBS) {
            List<GeoPointDTO> list3 = qVar2 != null ? qVar2.f102582a : null;
            List<ClimbDTO> list4 = qVar2 != null ? qVar2.f102583b : null;
            arrayList = new ArrayList();
            if (list3 != null && list4 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((GeoPointDTO) obj2).distance != null) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it3 = list4.iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        x.q();
                        throw null;
                    }
                    ClimbDTO climbDTO = (ClimbDTO) next;
                    if (i15 > i14) {
                        ClimbDTO climbDTO2 = list4.get(i15 - 1);
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            GeoPointDTO geoPointDTO = (GeoPointDTO) obj3;
                            Double d14 = geoPointDTO.distance;
                            if (((int) (d14 != null ? d14.doubleValue() : 0.0d)) <= ((int) climbDTO.getStartDistance())) {
                                Double d15 = geoPointDTO.distance;
                                if (((int) (d15 != null ? d15.doubleValue() : 0.0d)) >= ((int) climbDTO2.getStartDistance()) + ((int) climbDTO2.getDistance())) {
                                    arrayList2.add(obj3);
                                }
                            }
                            it3 = it3;
                        }
                        it = it3;
                    } else {
                        it = it3;
                        arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            Double d16 = ((GeoPointDTO) obj4).distance;
                            if (((int) (d16 != null ? d16.doubleValue() : 0.0d)) <= ((int) climbDTO.getStartDistance())) {
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (GeoPointDTO geoPointDTO2 : arrayList2) {
                        if (geoPointDTO2.elevation != null) {
                            Double d17 = geoPointDTO2.distance;
                            float fDoubleValue = (float) (d17 != null ? d17.doubleValue() : 0.0d);
                            Double d18 = geoPointDTO2.elevation;
                            arrayList4.add(new Entry(fDoubleValue, d18 != null ? (float) d18.doubleValue() : 0.0f));
                        }
                    }
                    ArrayList<GeoPointDTO> arrayList5 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        GeoPointDTO geoPointDTO3 = (GeoPointDTO) obj5;
                        Double d19 = geoPointDTO3.distance;
                        ClimbDTO climbDTO3 = climbDTO;
                        if (((int) (d19 != null ? d19.doubleValue() : 0.0d)) >= ((int) climbDTO3.getStartDistance())) {
                            Double d24 = geoPointDTO3.distance;
                            if (((int) (d24 != null ? d24.doubleValue() : 0.0d)) <= ((int) climbDTO3.getStartDistance()) + ((int) climbDTO3.getDistance())) {
                                arrayList5.add(obj5);
                            }
                        }
                        climbDTO = climbDTO3;
                    }
                    ClimbDTO climbDTO4 = climbDTO;
                    ArrayList arrayList6 = new ArrayList();
                    for (GeoPointDTO geoPointDTO4 : arrayList5) {
                        if (geoPointDTO4.elevation != null) {
                            Double d25 = geoPointDTO4.distance;
                            float fDoubleValue2 = d25 != null ? (float) d25.doubleValue() : 0.0f;
                            Double d26 = geoPointDTO4.elevation;
                            arrayList6.add(new Entry(fDoubleValue2, d26 != null ? (float) d26.doubleValue() : 0.0f));
                        }
                        str = str;
                    }
                    String str2 = str;
                    LineDataSet lineDataSet = new LineDataSet(h0.N0(arrayList6, new c()), str2);
                    A(lineDataSet, climbDTO4.getCategory());
                    arrayList.add(lineDataSet);
                    if (!arrayList5.isEmpty() && ((GeoPointDTO) arrayList5.get(0)).elevation != null) {
                        Double d27 = ((GeoPointDTO) arrayList5.get(0)).distance;
                        float fDoubleValue3 = d27 != null ? (float) d27.doubleValue() : 0.0f;
                        Double d28 = ((GeoPointDTO) arrayList5.get(0)).elevation;
                        arrayList4.add(new Entry(fDoubleValue3, d28 != null ? (float) d28.doubleValue() : 0.0f));
                    }
                    LineDataSet lineDataSet2 = new LineDataSet(h0.N0(arrayList4, new d()), str2);
                    A(lineDataSet2, null);
                    arrayList.add(lineDataSet2);
                    if (i16 == list4.size()) {
                        ArrayList<GeoPointDTO> arrayList7 = new ArrayList();
                        for (Object obj6 : arrayList3) {
                            Double d29 = ((GeoPointDTO) obj6).distance;
                            if (((int) (d29 != null ? d29.doubleValue() : 0.0d)) >= ((int) climbDTO4.getDistance()) + ((int) climbDTO4.getStartDistance())) {
                                arrayList7.add(obj6);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList();
                        for (GeoPointDTO geoPointDTO5 : arrayList7) {
                            if (geoPointDTO5.elevation != null) {
                                Double d34 = geoPointDTO5.distance;
                                float fDoubleValue4 = d34 != null ? (float) d34.doubleValue() : 0.0f;
                                Double d35 = geoPointDTO5.elevation;
                                arrayList8.add(new Entry(fDoubleValue4, d35 != null ? (float) d35.doubleValue() : 0.0f));
                            }
                        }
                        if (!arrayList5.isEmpty() && ((GeoPointDTO) j.f(1, arrayList5)).elevation != null) {
                            Double d36 = ((GeoPointDTO) j.f(1, arrayList5)).distance;
                            float fDoubleValue5 = d36 != null ? (float) d36.doubleValue() : 0.0f;
                            Double d37 = ((GeoPointDTO) j.f(1, arrayList5)).elevation;
                            arrayList8.add(new Entry(fDoubleValue5, d37 != null ? (float) d37.doubleValue() : 0.0f));
                        }
                        LineDataSet lineDataSet3 = new LineDataSet(h0.N0(arrayList8, new e()), str2);
                        A(lineDataSet3, null);
                        arrayList.add(lineDataSet3);
                    }
                    i15 = i16;
                    str = str2;
                    it3 = it;
                    i14 = 1;
                }
            }
        } else if (obj == r30.a.ROAD_SURFACE) {
            arrayList = new ArrayList();
            if (qVar2 != null && (list2 = qVar2.f102582a) != null) {
                List listJ = qVar2.f102585d > 40000.0d ? zf.b.J(y(list2)) : y(list2);
                if (!listJ.isEmpty()) {
                    LineDataSet lineDataSet4 = new LineDataSet(listJ, "");
                    z(lineDataSet4);
                    arrayList.add(lineDataSet4);
                    List<w> list5 = qVar2.f102584c;
                    if (list5 != null) {
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            w wVar = (w) it4.next();
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj7 : listJ) {
                                float x14 = ((Entry) obj7).getX();
                                double startDistance = wVar.getStartDistance();
                                double endDistance = wVar.getEndDistance();
                                Iterator it5 = it4;
                                List list6 = listJ;
                                double d38 = x14;
                                if (startDistance <= d38 && d38 <= endDistance) {
                                    arrayList9.add(obj7);
                                }
                                listJ = list6;
                                it4 = it5;
                            }
                            Iterator it6 = it4;
                            LineDataSet lineDataSet5 = new LineDataSet(arrayList9, "");
                            lineDataSet5.setDrawValues(false);
                            lineDataSet5.setDrawCircleHole(false);
                            lineDataSet5.setDrawCircles(false);
                            lineDataSet5.setDrawHorizontalHighlightIndicator(false);
                            lineDataSet5.setDrawFilled(true);
                            lineDataSet5.setLineWidth(2.0f);
                            gl.c.f77766a.getClass();
                            gl.e eVar = gl.c.f77767b;
                            lineDataSet5.setColor(f0.j(eVar.f77817y));
                            lineDataSet5.setFillColor(f0.j(eVar.D));
                            lineDataSet5.setFillAlpha(255);
                            lineDataSet5.setHighLightColor(this.f142379a.getColor(R.color.gcm_chart_highlight_line));
                            lineDataSet5.setHighlightLineWidth(1.0f);
                            lineDataSet5.setFillFormatter(new p6.b(27));
                            arrayList.add(lineDataSet5);
                            listJ = listJ;
                            it4 = it6;
                        }
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            if (qVar2 != null && (list = qVar2.f102582a) != null) {
                List listJ2 = qVar2.f102585d > 40000.0d ? zf.b.J(y(list)) : y(list);
                if (!listJ2.isEmpty()) {
                    LineDataSet lineDataSet6 = new LineDataSet(listJ2, "");
                    z(lineDataSet6);
                    arrayList.add(lineDataSet6);
                }
            }
        }
        return h0.Z(arrayList);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(q qVar) {
        return 6;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float e(q qVar) {
        p pVar;
        q qVar2 = qVar;
        p pVarX = x(qVar2 != null ? qVar2.f102582a : null);
        if (pVarX == null || (pVar = (p) pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) ((Number) pVar.f128594a).doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(q qVar) {
        return null;
    }

    @Override // qz.c
    public final List g(q qVar) {
        List<com.garmin.android.apps.connectmobile.courses.model.g> list;
        ArrayList<GeoPointDTO> arrayList;
        List<ClimbDTO> list2;
        List<GeoPointDTO> list3;
        q qVar2 = qVar;
        Object obj = this.f142380b;
        r30.a aVar = r30.a.CLIMBS;
        Context context = this.f142379a;
        ArrayList arrayList2 = null;
        if (obj != aVar) {
            if (obj == r30.a.COURSE_POINTS) {
                if (qVar2 != null && (list = qVar2.f102586e) != null) {
                    ArrayList<com.garmin.android.apps.connectmobile.courses.model.g> arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj2;
                        if (gVar.getDistance() != null && !gVar.g()) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                    for (com.garmin.android.apps.connectmobile.courses.model.g gVar2 : arrayList3) {
                        com.garmin.android.apps.connectmobile.courses.model.f.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                        String coursePointType = gVar2.getCoursePointType();
                        aVar2.getClass();
                        u40.d dVar = new u40.d(context, com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType), false, gVar2.name, 0.0f, 20, null);
                        Double distance = gVar2.getDistance();
                        arrayList4.add(new xz.h(distance != null ? (int) distance.doubleValue() : 0, dVar, ""));
                    }
                    arrayList2 = arrayList4;
                }
                if (arrayList2 == null) {
                    return j0.f134944a;
                }
            }
            return arrayList2;
        }
        if (qVar2 == null || (list3 = qVar2.f102582a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (((GeoPointDTO) obj3).distance != null) {
                    arrayList.add(obj3);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (qVar2 != null && (list2 = qVar2.f102583b) != null) {
            for (ClimbDTO climbDTO : list2) {
                if (arrayList != null) {
                    GeoPointDTO geoPointDTO = null;
                    for (GeoPointDTO geoPointDTO2 : arrayList) {
                        if (geoPointDTO != null) {
                            Double d14 = geoPointDTO.distance;
                            if ((d14 != null ? d14.doubleValue() : 0.0d) <= climbDTO.getStartDistance()) {
                                Double d15 = geoPointDTO2.distance;
                                if ((d15 != null ? d15.doubleValue() : 0.0d) >= climbDTO.getStartDistance()) {
                                    Drawable drawableA = j.a.a(context, 2131232519);
                                    Double d16 = geoPointDTO2.distance;
                                    arrayList5.add(new xz.h(d16 != null ? (int) d16.doubleValue() : 0, drawableA, ""));
                                }
                            }
                        }
                        geoPointDTO = geoPointDTO2;
                    }
                }
            }
        }
        return arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(q qVar) {
        p pVar;
        q qVar2 = qVar;
        p pVarX = x(qVar2 != null ? qVar2.f102582a : null);
        if (pVarX == null || (pVar = (p) pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.ceil(((Number) pVar.f128595b).doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(q qVar) {
        return null;
    }

    @Override // qz.c
    public final boolean l() {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(q qVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(q qVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(q qVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float q(q qVar) {
        p pVar;
        q qVar2 = qVar;
        p pVarX = x(qVar2 != null ? qVar2.f102582a : null);
        if (pVarX == null || (pVar = (p) pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) ((Number) pVar.f128595b).doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(q qVar) {
        return null;
    }

    @Override // qz.c
    public final void s(Object obj) {
        this.f142380b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float t(q qVar) {
        p pVar;
        q qVar2 = qVar;
        p pVarX = x(qVar2 != null ? qVar2.f102582a : null);
        if (pVarX == null || (pVar = (p) pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.floor(((Number) pVar.f128594a).doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final List u(q qVar) {
        Object obj = this.f142380b;
        if (obj == r30.a.CLIMBS) {
            return this.f142382d;
        }
        return obj == r30.a.ROAD_SURFACE ? this.f142383e : this.f142381c;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(q qVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(q qVar) {
        return 0.0f;
    }

    public final void z(LineDataSet lineDataSet) {
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setLineWidth(2.0f);
        gl.c.f77766a.getClass();
        gl.e eVar = gl.c.f77767b;
        lineDataSet.setColor(f0.j(eVar.f77817y));
        lineDataSet.setFillColor(f0.j(eVar.f77817y));
        lineDataSet.setFillAlpha(255);
        lineDataSet.setHighLightColor(this.f142379a.getColor(R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setFillFormatter(new p6.b(26));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lq30/b$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "", "X_AXIS_LABEL_COUNT", "I", "", "CLIMB_CAT_1", "Ljava/lang/String;", "CLIMB_CAT_2", "CLIMB_CAT_3", "COURSE_DISTANCE_LIMIT_IN_METER", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
