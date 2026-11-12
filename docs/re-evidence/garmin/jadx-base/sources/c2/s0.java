package c2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.library.mapsdkadapter.p;
import com.garmin.android.library.mapsdkadapter.q;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f22867b;

    public /* synthetic */ s0(p005kotlin.jvm.internal.r0 r0Var, int i14) {
        this.f22866a = i14;
        this.f22867b = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, m52.d] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, m52.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, f5.v1] */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, m52.d] */
    /* JADX WARN: Type inference failed for: r1v38, types: [T, m52.d] */
    /* JADX WARN: Type inference failed for: r1v44, types: [T, m52.d] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, f5.v1] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        T tM;
        String strC;
        Integer numQ;
        int i14 = this.f22866a;
        boolean z14 = true;
        p005kotlin.jvm.internal.r0 r0Var = this.f22867b;
        switch (i14) {
            case 0:
                r0Var.f105810a = (f5.v1) obj;
                return Unit.INSTANCE;
            case 1:
                r0Var.f105810a = (f5.v1) obj;
                return Unit.INSTANCE;
            case 2:
                l52.i.a aVar = (l52.i.a) obj;
                m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
                aVar.getClass();
                r0Var.f105810a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48217c;
                return Unit.INSTANCE;
            case 3:
                r0Var.f105810a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) ((l52.i.a) obj).getData()).f48217c;
                return Unit.INSTANCE;
            case 4:
                r0Var.f105810a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) ((l52.i.a) obj).getData()).f48217c;
                return Unit.INSTANCE;
            case 5:
                h5.e2 e2Var = (h5.e2) obj;
                e2Var.getClass();
                g2.z0 z0Var = ((g2.d2) e2Var).f75074a;
                List list = (List) r0Var.f105810a;
                if (list != null) {
                    list.add(z0Var);
                    tM = list;
                } else {
                    tM = p13.x.m(z0Var);
                }
                r0Var.f105810a = tM;
                return h5.d2.SkipSubtreeAndContinueTraversal;
            case 6:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, (String) r0Var.f105810a);
                return Unit.INSTANCE;
            case 7:
                l52.i.a aVar2 = (l52.i.a) obj;
                aVar2.getClass();
                r0Var.f105810a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData()).f48217c;
                return Unit.INSTANCE;
            case 8:
                l52.i.a aVar3 = (l52.i.a) obj;
                aVar3.getClass();
                r0Var.f105810a = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar3.getData()).f48217c;
                return Unit.INSTANCE;
            case 9:
                String str = (String) obj;
                int i15 = lc.l0.f111798d;
                str.getClass();
                T t7 = r0Var.f105810a;
                if (t7 != 0 && ((Bundle) t7).containsKey(str)) {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 10:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                int i16 = ne2.d0.f125576h;
                expressionBuilder.getClass();
                expressionBuilder.literal(((Number) ((o13.u) r0Var.f105810a).f128605a).floatValue());
                expressionBuilder.literal(((Number) ((o13.u) r0Var.f105810a).f128606b).floatValue());
                expressionBuilder.literal(((Number) ((o13.u) r0Var.f105810a).f128607c).floatValue());
                return Unit.INSTANCE;
            case 11:
                p5.k0 k0Var2 = (p5.k0) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                k0Var2.getClass();
                p5.h0.n(k0Var2, (String) r0Var.f105810a);
                return Unit.INSTANCE;
            case 12:
                p5.k0 k0Var3 = (p5.k0) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                k0Var3.getClass();
                p5.h0.n(k0Var3, (String) r0Var.f105810a);
                return Unit.INSTANCE;
            case 13:
                xg0.c0 c0Var = (xg0.c0) r0Var.f105810a;
                if (c0Var != null) {
                    wg0.d dVar = c0Var.f190735c;
                    if (dVar != null) {
                        boolean z15 = dVar.f185089l;
                        View view2 = c0Var.f190739g;
                        view2.getClass();
                        v22.e.r(view2, z15);
                    }
                    xg0.h0 h0Var = c0Var.f190740h;
                    final rs.h hVar = h0Var.f190769a;
                    rs.c<wg0.d> cVar = h0Var.f190771c;
                    String strV0 = null;
                    if (dVar != null) {
                        List<ps.i> list2 = dVar.f185086i;
                        if (list2 != null) {
                            c22.a1 a1Var = c22.a1.f22992a;
                            Context context = hVar.f154317a.getContext();
                            context.getClass();
                            a1Var.getClass();
                            ie2.h.a aVarA = c22.a1.a(context);
                            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                            for (ps.i iVar : list2) {
                                arrayList.add(new com.garmin.android.library.mapsdkadapter.s(new com.garmin.android.library.mapsdkadapter.f(iVar.getLat(), iVar.getLon(), com.garmin.android.library.mapsdkadapter.i.b.WGS84), iVar.getWeight()));
                            }
                            aVarA.b(arrayList);
                            hVar.f154318b.d(new ad0.f(hVar, aVarA.a(), h0Var.f190774f, 21));
                        } else {
                            String str2 = h0Var.f190773e;
                            final int iB = (str2 == null || (numQ = h0Var.f190775g.q(str2)) == null) ? cVar.b(dVar) : numQ.intValue();
                            final ArrayList arrayListA = cVar.a(dVar);
                            final List listC = cVar.c(dVar);
                            final boolean z16 = h0Var.f190774f;
                            hVar.f154318b.d(new e23.l() { // from class: rs.g
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    ((com.garmin.android.library.mapsdkadapter.i) obj2).getClass();
                                    h hVar2 = hVar;
                                    GCMMapView gCMMapView = hVar2.f154318b;
                                    gCMMapView.setMapType(iB);
                                    List list3 = arrayListA;
                                    if (list3 != null) {
                                        Iterator it = list3.iterator();
                                        while (it.hasNext()) {
                                            gCMMapView.h((q) it.next());
                                        }
                                    }
                                    List list4 = listC;
                                    if (list4 != null) {
                                        Iterator it3 = list4.iterator();
                                        while (it3.hasNext()) {
                                            gCMMapView.g((p) it3.next());
                                        }
                                    }
                                    if (z16) {
                                        gCMMapView.i();
                                    } else {
                                        com.garmin.android.library.mapsdkadapter.e eVarA = h.a(hVar2, list3, list4, null, 4);
                                        if (eVarA != null) {
                                            gCMMapView.getMapProxy().v(eVarA, -1);
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        rs.f fVar = h0Var.f190770b;
                        if (fVar != null) {
                            rs.d<wg0.d> dVar2 = h0Var.f190772d;
                            rs.e eVarA = dVar2 != null ? dVar2.a(dVar) : null;
                            Context context2 = fVar.f154308b;
                            ViewGroup viewGroup = fVar.f154307a;
                            v22.e.r(viewGroup, eVarA != null);
                            if (eVarA != null) {
                                Integer num = eVarA.f154306d;
                                int iIntValue = num != null ? num.intValue() : -1;
                                if (iIntValue > 0) {
                                    try {
                                        viewGroup.removeAllViews();
                                        View viewInflate = LayoutInflater.from(context2).inflate(iIntValue, viewGroup, false);
                                        viewInflate.setBackgroundColor(context2.getColor(R.color.transparent));
                                        viewGroup.addView(viewInflate);
                                    } catch (Exception unused) {
                                        fVar.a(eVarA);
                                    }
                                } else {
                                    fVar.a(eVarA);
                                }
                            }
                        }
                    }
                    if (dVar != null && dVar.f185088k != null) {
                        rs.j jVar2 = c0Var.f190738f;
                        ps.b2 b2Var = dVar.f185082e;
                        View view3 = jVar2.f154323a;
                        rs.i iVar2 = jVar2.f154328f;
                        if (b2Var == null || (b2Var.getWeatherType() == null && b2Var.getTemp() == null)) {
                            view3.setVisibility(8);
                        } else {
                            view3.setVisibility(0);
                            Double temp = b2Var.getTemp();
                            TextView textView = jVar2.f154324b;
                            iVar2.getClass();
                            l22.a aVar6 = iVar2.f154322a;
                            if (temp != null) {
                                f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                                boolean z17 = lVar.y() || lVar.C1();
                                c22.l3.a aVar7 = c22.l3.f23124b;
                                double dDoubleValue = temp.doubleValue();
                                aVar7.getClass();
                                strV0 = c22.l3.a.V0(aVar6, c22.l3.a.e(dDoubleValue), z17);
                            }
                            v22.e.v(textView, strV0 != null);
                            if (strV0 != null) {
                                textView.setText(strV0);
                                if (temp == null) {
                                    strC = "";
                                } else {
                                    ns.u2 u2Var = new ns.u2(aVar6, false, null, 6, null);
                                    c22.l3.a aVar8 = c22.l3.f23124b;
                                    double dDoubleValue2 = temp.doubleValue();
                                    aVar8.getClass();
                                    strC = u00.b.c(u2Var, Double.valueOf(c22.l3.a.e(dDoubleValue2)), 4, 4);
                                    if (strC == null) {
                                        strC = "";
                                    }
                                }
                                textView.setContentDescription(strC);
                            }
                            ps.d2 weatherType = b2Var.getWeatherType();
                            ImageView imageView = jVar2.f154327e;
                            v22.e.v(imageView, weatherType != null);
                            if (weatherType != null) {
                                qs.b0.a aVar9 = qs.b0.f147008d;
                                String strB = weatherType.getDescription();
                                aVar9.getClass();
                                qs.b0 b0VarB = qs.b0.a.b(strB);
                                v22.e.v(imageView, b0VarB != null);
                                if (b0VarB != null) {
                                    imageView.setImageResource(b0VarB.f147029b);
                                }
                                imageView.setContentDescription(weatherType.getDescription());
                            }
                            Double windSpeed = b2Var.getWindSpeed();
                            Double windDirection = b2Var.getWindDirection();
                            String windDirectionCompassPoint = b2Var.getWindDirectionCompassPoint();
                            TextView textView2 = jVar2.f154325c;
                            ImageView imageView2 = jVar2.f154326d;
                            if (windSpeed == null || windSpeed.doubleValue() <= 0.0d) {
                                v22.e.j(imageView2);
                                v22.e.j(textView2);
                            } else {
                                v22.e.q(imageView2);
                                v22.e.q(textView2);
                                textView2.setText(String.valueOf(rs.i.a(windSpeed.doubleValue())));
                                if (windDirection != null) {
                                    imageView2.setRotation((float) windDirection.doubleValue());
                                    imageView2.setContentDescription(aVar6.a(R.string.string_space_string_pattern, aVar6.a(R.string.string_space_string_pattern, Long.valueOf(rs.i.a(windSpeed.doubleValue())), new ns.e2(aVar6, false, null, 6, null).j(4, windSpeed)), aVar6.a(R.string.string_space_string_pattern, windDirectionCompassPoint != null ? windDirectionCompassPoint : "", aVar6.getString(R.string.lbl_wind))));
                                }
                            }
                        }
                    }
                    break;
                }
                return Unit.INSTANCE;
            default:
                xg0.c0 c0Var2 = (xg0.c0) r0Var.f105810a;
                if (c0Var2 != null) {
                    GCMMapView gCMMapView = c0Var2.f190737e.f154318b;
                    gCMMapView.getMapProxy().clear();
                    gCMMapView.setMapType(0);
                }
                return Unit.INSTANCE;
        }
    }
}
