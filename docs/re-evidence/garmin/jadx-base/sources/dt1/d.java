package dt1;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Location;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import c22.z1;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import e2.f0;
import e23.l;
import e23.p;
import g42.q;
import ht1.i;
import ht1.j;
import java.util.ArrayList;
import java.util.List;
import o4.r;
import o4.v0;
import o53.b0;
import oe2.a0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p3.p1;
import p5.h0;
import p5.k0;
import tn.k;
import tq0.m;
import ve.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f61126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61129e;

    public /* synthetic */ d(boolean z14, e23.a aVar, p pVar, ev0.b bVar) {
        this.f61125a = 7;
        this.f61126b = z14;
        this.f61127c = aVar;
        this.f61128d = pVar;
        this.f61129e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x0227  */
    /* JADX WARN: Code duplicated, block: B:97:0x0380  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, com.mapbox.maps.extension.compose.animation.viewport.MapViewportState, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        k2.h hVarC;
        oq0.b.EnumC2530b enumC2530b;
        String str;
        String str2;
        oq0.a aVar;
        int[] iArr;
        int i14 = this.f61125a;
        String str3 = "";
        int i15 = 6;
        Object obj2 = this.f61129e;
        Object obj3 = this.f61128d;
        boolean z14 = this.f61126b;
        Object obj4 = this.f61127c;
        switch (i14) {
            case 0:
                je2.b bVar = (je2.b) obj3;
                l lVar = (l) obj2;
                ke2.b bVar2 = (ke2.b) obj;
                bVar2.getClass();
                float f14 = f.a.f61132a[((pt1.d) obj4).f140835k.ordinal()] == 1 ? 11.0f : 10.0f;
                if (!z14 && bVar.f98597a.f98594b >= f14) {
                    lVar.invoke(bVar2);
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = (com.garmin.android.apps.connectmobile.weather.defaultlocation.c) obj4;
                Location location = (Location) obj3;
                com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) obj2;
                Address address = (Address) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                if (address != null) {
                    cVar.C6(address, z14);
                    if (z14) {
                        q qVar = cVar.f47941b;
                        if (qVar == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        Logger logger = q.f75816h;
                        qVar.C4(address, null);
                    }
                    return Unit.INSTANCE;
                }
                Logger loggerW6 = cVar.w6();
                z1.f23762a.getClass();
                loggerW6.warn("zoomInitialMap: Could not get any address from ".concat(z1.b(location)));
                cVar.E6(fVar);
                if (z14) {
                    q qVar2 = cVar.f47941b;
                    if (qVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    Address addressD = z1.d(fVar);
                    Logger logger2 = q.f75816h;
                    qVar2.C4(addressD, null);
                }
                return Unit.INSTANCE;
            case 2:
                l lVar2 = (l) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.e(f0Var, null, new z3.e(1677951830, true, new ao1.f(15, (pt1.g) obj4, (e23.a) obj3)), 3);
                ht1.b.f85536a.getClass();
                f0.b(f0Var, null, ht1.b.f85537b, 3);
                w13.c cVar2 = us1.d.f172379h;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : cVar2) {
                    us1.d dVar = (us1.d) obj5;
                    if (z14) {
                        if (dVar != us1.d.f172376e) {
                            arrayList.add(obj5);
                        }
                    } else if (dVar != us1.d.f172377f) {
                        arrayList.add(obj5);
                    }
                }
                f0Var.a(arrayList.size(), null, new i(ht1.h.f85554a, arrayList), new z3.e(802480018, true, new j(arrayList, lVar2)));
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                k82.d dVar2 = (k82.d) ((p1) obj2).getF182175a();
                dVar2.getClass();
                str4.getClass();
                Context context = dVar2.f103396a;
                String string = context.getString(R.string.string_space_string_pattern, context.getString(R.string.string_space_string_pattern, str4, dVar2.f103397b.a(z14)), context.getString(R.string.string_space_string_pattern, str5 == null ? "" : str5, context.getString(R.string.gak_lbl_wind)));
                string.getClass();
                h0.n(k0Var, string);
                return Unit.INSTANCE;
            case 4:
                ?? r14 = (MapViewportState) obj;
                r14.getClass();
                ((oe2.e) obj4).f98598b = r14;
                ge1.b.T((b0) obj3, null, null, new a0(r14, (List) obj2, z14, null), 3);
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj4;
                p1 p1Var = (p1) obj3;
                e23.a aVar3 = (e23.a) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                List list2 = list == null ? j0.f134944a : list;
                f0Var2.a(list2.size(), null, new sa0.j.c(sa0.j.b.f158197a, list2), new z3.e(802480018, true, new sa0.j.d(list2, list, p1Var)));
                if (z14) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    hVarC = k2.i.a(j92.b.f97899b.f97918c);
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    hVarC = k2.i.c(0.0f, 0.0f, f15, f15, 3);
                }
                f0.b(f0Var2, null, new z3.e(-721905599, true, new ry0.g(i15, hVarC, aVar3)), 3);
                return Unit.INSTANCE;
            case 6:
                androidx.work.d dVar3 = (androidx.work.d) obj4;
                String str6 = (String) obj3;
                y0 y0Var = (y0) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    dVar3.f11471c.compareAndSet(-256, ((WorkerStoppedException) th3).getReason());
                }
                if (z14 && str6 != null) {
                    ue.d dVar4 = y0Var.f177638f.f11448n;
                    int iHashCode = y0Var.f177633a.hashCode();
                    dVar4.getClass();
                    str6.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ce.b.b(iHashCode, ce.a.d(str6));
                    } else {
                        String strD = ce.a.d(str6);
                        try {
                            if (ce.a.f26885d == null) {
                                ce.a.f26885d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            ce.a.f26885d.invoke(null, Long.valueOf(ce.a.f26882a), strD, Integer.valueOf(iHashCode));
                        } catch (Exception e4) {
                            ce.a.a(e4);
                        }
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 7:
                e23.a aVar4 = (e23.a) obj4;
                p pVar = (p) obj3;
                ev0.b bVar3 = (ev0.b) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (z14 && zBooleanValue) {
                    aVar4.invoke();
                } else {
                    pVar.invoke(Long.valueOf(bVar3.f66140a), bool);
                }
                return Unit.INSTANCE;
            case 8:
                oq0.b bVar4 = (oq0.b) obj4;
                tq0.c cVar3 = (tq0.c) obj3;
                tq0.l lVar3 = (tq0.l) obj2;
                ((BarChart) obj).getClass();
                yz.e eVar = new yz.e();
                BarChart barChart = bVar4.f133271a;
                barChart.getClass();
                boolean z15 = false;
                barChart.getDescription().setEnabled(false);
                barChart.setTouchEnabled(false);
                barChart.setHighlightPerTapEnabled(false);
                barChart.setHighlightPerDragEnabled(false);
                barChart.setPinchZoom(false);
                barChart.setDrawGridBackground(false);
                barChart.setMaxVisibleValueCount(60);
                barChart.setDrawBarShadow(false);
                barChart.getAxisRight().setEnabled(false);
                barChart.getAxisLeft().setDrawAxisLine(false);
                barChart.setExtraBottomOffset(20.0f);
                barChart.setNoDataText("");
                int color = a7.b.getColor(barChart.getContext(), R.color.gcm_text_secondary);
                XAxis xAxis = barChart.getXAxis();
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xAxis.setDrawGridLines(false);
                xAxis.setDrawAxisLine(false);
                xAxis.setAxisLineColor(color);
                xAxis.setAxisLineColor(color);
                xAxis.setTextColor(color);
                YAxis axisLeft = barChart.getAxisLeft();
                axisLeft.setDrawGridLines(false);
                axisLeft.setLabelCount(4, false);
                axisLeft.setTextColor(color);
                axisLeft.setAxisMinimum(0.0f);
                axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                barChart.getF31342c().setEnabled(false);
                barChart.setRenderer(new pq0.a(barChart, barChart.getAnimator(), barChart.getViewPortHandler()));
                barChart.getAxisLeft().setValueFormatter(eVar);
                if (z14) {
                    tq0.i iVar = cVar3 != null ? cVar3.f166044a : null;
                    new yq0.d();
                    lVar3.getClass();
                    tq0.a aVar5 = lVar3.f166099a;
                    tq0.b bVar5 = !s.g(aVar5.f166036a, m.SLEEP.f166114a) ? (tq0.b) p13.h0.e0(lVar3.f166100b, aVar5.f166037b) : null;
                    if ((bVar5 != null ? bVar5.f166041b : null) != null) {
                        mq0.a.C2281a c2281a = mq0.a.f120195b;
                        String str7 = bVar5.f166041b;
                        c2281a.getClass();
                        mq0.a aVarA = mq0.a.C2281a.a(str7);
                        int i16 = aVarA == null ? -1 : yq0.d.a.f198741a[aVarA.ordinal()];
                        if (i16 == 1) {
                            enumC2530b = oq0.b.EnumC2530b.HOURS_MINUTES_FORMAT_TYPE;
                        } else if (i16 == 2 || i16 == 3 || i16 == 4 || i16 == 5) {
                            enumC2530b = oq0.b.EnumC2530b.MINUTES_SECONDS_FORMAT_TYPE;
                        } else {
                            enumC2530b = oq0.b.EnumC2530b.THOUSANDS_WITH_K_FORMAT_TYPE;
                        }
                    } else {
                        enumC2530b = oq0.b.EnumC2530b.THOUSANDS_WITH_K_FORMAT_TYPE;
                    }
                    GradientColor gradientColor = bVar4.f133273c;
                    GradientColor gradientColor2 = bVar4.f133272b;
                    enumC2530b.getClass();
                    if (iVar != null) {
                        tq0.i.e eVar2 = iVar.f166083c;
                        List<tq0.h> listB = iVar.b();
                        if (listB == null || listB.isEmpty()) {
                            barChart.setNoDataText(barChart.getContext().getString(R.string.txt_empty_page_no_data));
                            barChart.clear();
                        } else {
                            List<tq0.h> listB2 = iVar.b();
                            ArrayList arrayList2 = new ArrayList();
                            int size = listB2.size();
                            int i17 = 0;
                            float f16 = 0.0f;
                            while (i17 < size) {
                                boolean z16 = z15;
                                String str8 = str3;
                                GradientColor gradientColor3 = gradientColor;
                                if (f16 < listB2.get(i17).f166077b) {
                                    f16 = (float) listB2.get(i17).f166077b;
                                }
                                i17++;
                                z15 = z16;
                                str3 = str8;
                                gradientColor = gradientColor3;
                            }
                            String str9 = str3;
                            GradientColor gradientColor4 = gradientColor;
                            boolean z17 = z15;
                            int size2 = listB2.size();
                            for (int i18 = z17 ? 1 : 0; i18 < size2; i18++) {
                                tq0.j jVar = listB2.get(i18).f166078c;
                                if (jVar != null) {
                                    oq0.a.C2529a c2529a = oq0.a.f133268b;
                                    String str10 = jVar.f166094a;
                                    c2529a.getClass();
                                    if (str10 != null) {
                                        oq0.a[] aVarArrValues = oq0.a.values();
                                        int length = aVarArrValues.length;
                                        int i19 = z17 ? 1 : 0;
                                        while (true) {
                                            if (i19 < length) {
                                                aVar = aVarArrValues[i19];
                                                if (!s.g(aVar.f133270a, str10)) {
                                                    i19++;
                                                }
                                            } else {
                                                aVar = null;
                                            }
                                        }
                                    } else {
                                        aVar = null;
                                    }
                                } else {
                                    aVar = null;
                                }
                                if (aVar != null) {
                                    iArr = new int[2];
                                    iArr[z17 ? 1 : 0] = gradientColor4.getStartColor();
                                    iArr[1] = gradientColor4.getEndColor();
                                } else {
                                    iArr = new int[2];
                                    iArr[z17 ? 1 : 0] = gradientColor2.getStartColor();
                                    iArr[1] = gradientColor2.getEndColor();
                                }
                                arrayList2.add(new xz.e(i18, (float) listB2.get(i18).f166077b, (Object) null, iArr, f16, bVar4.f133274d, false, 68, (p005kotlin.jvm.internal.j) null));
                            }
                            BarDataSet barDataSet = new BarDataSet(arrayList2, null);
                            barDataSet.setDrawValues(z17);
                            IBarDataSet[] iBarDataSetArr = new IBarDataSet[1];
                            iBarDataSetArr[z17 ? 1 : 0] = barDataSet;
                            BarData barData = new BarData(iBarDataSetArr);
                            barData.setBarWidth(bVar4.f133275e);
                            barChart.setData(barData);
                            barChart.invalidate();
                            barChart.getXAxis().setValueFormatter(new oq0.c(listB2, enumC2530b));
                            ViewPortHandler viewPortHandler = barChart.getViewPortHandler();
                            XAxis xAxis2 = barChart.getXAxis();
                            Transformer transformer = barChart.getTransformer(YAxis.AxisDependency.LEFT);
                            BarData barData2 = barChart.getBarData();
                            barData2.getClass();
                            barChart.setXAxisRenderer(new pq0.b(viewPortHandler, xAxis2, transformer, barData2, pz.a.ONE_BIG_THREE_SMALL_DOT_PATTERN, pz.b.COMB_LABEL_PATTERN, 0, 0, 0, 0, 0, 1984, null));
                            if (barChart.getF31342c().isEnabled()) {
                                int color2 = a7.b.getColor(barChart.getContext(), R.color.gcm_text_secondary);
                                Legend.LegendForm legendForm = Legend.LegendForm.SQUARE;
                                Typeface typefaceA = h22.a.a(h22.b.a(barChart.getF31342c().getTypeface()), barChart.getContext());
                                if (eVar2 == null || (str = eVar2.f166088a) == null) {
                                    str = str9;
                                }
                                oq0.d dVar5 = new oq0.d(str, gradientColor2.getStartColor());
                                if (eVar2 == null || (str2 = eVar2.f166089b) == null) {
                                    str2 = str9;
                                }
                                oq0.d[] dVarArr = {dVar5, new oq0.d(str2, gradientColor4.getStartColor())};
                                legendForm.getClass();
                                Legend f31351g = barChart.getF31342c();
                                f31351g.setEnabled(true);
                                f31351g.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
                                f31351g.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
                                f31351g.setOrientation(Legend.LegendOrientation.HORIZONTAL);
                                f31351g.setWordWrapEnabled(true);
                                f31351g.setFormSize(11.0f);
                                f31351g.setTextSize(12.0f);
                                f31351g.setXEntrySpace(5.0f);
                                f31351g.setFormToTextSpace(5.0f);
                                f31351g.setTextColor(color2);
                                f31351g.setTypeface(typefaceA);
                                f31351g.setForm(legendForm);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i24 = z17 ? 1 : 0; i24 < 2; i24++) {
                                    oq0.d dVar6 = dVarArr[i24];
                                    LegendEntry legendEntry = new LegendEntry();
                                    legendEntry.label = dVar6.f133283a;
                                    legendEntry.formColor = dVar6.f133284b;
                                    arrayList3.add(legendEntry);
                                }
                                f31351g.setCustom(arrayList3);
                            }
                        }
                    } else {
                        barChart.setNoDataText(barChart.getContext().getString(R.string.txt_empty_page_no_data));
                        barChart.clear();
                    }
                } else {
                    barChart.setNoDataText(barChart.getContext().getString(R.string.txt_empty_page_no_data));
                    barChart.clear();
                }
                return Unit.INSTANCE;
            case 9:
                String str11 = (String) obj3;
                e23.a aVar6 = (e23.a) obj2;
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, (String) obj4);
                if (z14) {
                    h0.p(k0Var2, w.c(new p5.g(str11, new yy1.d(aVar6, 6))));
                }
                return Unit.INSTANCE;
            default:
                v0 v0Var = (v0) obj3;
                r rVar = (r) obj2;
                q4.c cVar4 = (q4.c) obj;
                cVar4.m1();
                if (!((Boolean) ((e23.a) obj4).invoke()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (z14) {
                    long jI1 = cVar4.i1();
                    q4.a.b f142543b = cVar4.getF142543b();
                    long jB = f142543b.b();
                    f142543b.a().l();
                    try {
                        f142543b.f142550a.g(-1.0f, 1.0f, jI1);
                        q4.f.w0(cVar4, v0Var, 0L, rVar, 46);
                    } finally {
                        k.p(f142543b, jB);
                    }
                } else {
                    q4.f.w0(cVar4, v0Var, 0L, rVar, 46);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z14, Object obj3, int i14) {
        this.f61125a = i14;
        this.f61127c = obj;
        this.f61128d = obj2;
        this.f61126b = z14;
        this.f61129e = obj3;
    }

    public /* synthetic */ d(Object obj, boolean z14, Object obj2, Object obj3, int i14) {
        this.f61125a = i14;
        this.f61127c = obj;
        this.f61126b = z14;
        this.f61128d = obj2;
        this.f61129e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z14, int i14) {
        this.f61125a = i14;
        this.f61127c = obj;
        this.f61128d = obj2;
        this.f61129e = obj3;
        this.f61126b = z14;
    }
}
