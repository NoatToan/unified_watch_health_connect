package jv0;

import a42.c0;
import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c.q;
import c22.p2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.garmin.realtimesettings.app.baseviews.edittext.utils.StyledInlineTextFieldViewDark;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.BarDataSet;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.data.ScatterDataSet;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.slider.RangeSlider;
import com.google.firebase.perf.FirebasePerformance;
import e23.l;
import fg0.k;
import gl1.y;
import i3.fe;
import i3.mc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k00.m;
import km1.v;
import ky0.w0;
import l72.i3;
import l72.u;
import lc.k0;
import lc.m0;
import m4.g0;
import mt0.e0;
import nw0.n;
import o13.p;
import o13.t;
import o53.b0;
import o72.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p006l2.b2;
import p006l2.r2;
import p13.h0;
import p13.j0;
import p13.u0;
import p13.x;
import p3.n1;
import p3.p1;
import rx1.w;
import sg0.a0;
import sg0.d0;
import sg0.e1;
import sg0.f0;
import sg0.o0;
import sg0.p0;
import sg0.q0;
import sg0.z;
import sm1.s;
import tn2.c1;
import tn2.o;
import w5.r;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f100961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f100962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f100963f;

    public /* synthetic */ c(s sVar, p1 p1Var, n1 n1Var, b0 b0Var, Context context) {
        this.f100958a = 15;
        this.f100961d = sVar;
        this.f100960c = p1Var;
        this.f100962e = n1Var;
        this.f100959b = b0Var;
        this.f100963f = context;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    private final Object a(Object obj) {
        ov2.d dVar;
        HashMap mapD;
        int i14;
        int i15;
        ov2.f fVar = (ov2.f) this.f100959b;
        dx2.c cVar = (dx2.c) this.f100961d;
        Map<String, ? extends Object> map = (Map) this.f100960c;
        ov2.e eVar = (ov2.e) this.f100962e;
        Fragment fragment = (Fragment) this.f100963f;
        int i16 = ov2.f.f134271b;
        fVar.j(cVar, map, eVar);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = fVar.f134272a;
        styledInlineTextFieldViewDark.setTitle(eVar.f(cVar, map));
        eVar.getClass();
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj2 = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj2 != null ? obj2.toString() : null;
        aVar.getClass();
        Object objF = cVar.f61484a.f(gw2.j.EDIT_TEXT, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof ov2.d)) {
                objF = null;
            }
            dVar = (ov2.d) objF;
        } catch (ClassCastException unused) {
            dVar = null;
        }
        if (dVar != null) {
            p pVar = new p(gw2.i.FORMATTED_VALUE.f79975a, eVar.b(dVar.f134264a));
            p pVar2 = new p(gw2.i.EDIT_TEXT_VALUE.f79975a, eVar.b(dVar.f134265b));
            String str = gw2.i.KEYBOARD_TYPE.f79975a;
            String str2 = dVar.f134267d;
            if (str2 == null) {
                str2 = "";
            }
            mapD = u0.d(pVar, pVar2, new p(str, str2), new p(gw2.i.EDIT_TEXT_MAXIMUM_CODE_POINT_LENGTH.f79975a, Integer.valueOf(dVar.f134266c)), new p(gw2.i.MINIMUM.f79975a, Double.valueOf(dVar.f134268e)), new p(gw2.i.MAXIMUM.f79975a, Double.valueOf(dVar.f134269f)), new p(gw2.i.PRECISION.f79975a, Integer.valueOf(dVar.f134270g)));
        } else {
            mapD = null;
        }
        if (mapD != null) {
            Object obj3 = mapD.get(gw2.i.KEYBOARD_TYPE.f79975a);
            if (p005kotlin.jvm.internal.s.g(obj3, "ALPHANUMERIC")) {
                i15 = 1;
            } else {
                if (p005kotlin.jvm.internal.s.g(obj3, "INTEGER")) {
                    i14 = 2;
                } else if (p005kotlin.jvm.internal.s.g(obj3, "DECIMAL")) {
                    i14 = 8194;
                } else {
                    i15 = 1;
                }
                i15 = i14;
            }
            String strValueOf = String.valueOf(mapD.get(gw2.i.FORMATTED_VALUE.f79975a));
            String strValueOf2 = String.valueOf(mapD.get(gw2.i.EDIT_TEXT_VALUE.f79975a));
            cx2.b.a aVar2 = cx2.b.f56665a;
            String strValueOf3 = String.valueOf(mapD.get(gw2.i.EDIT_TEXT_MAXIMUM_CODE_POINT_LENGTH.f79975a));
            aVar2.getClass();
            int iC = cx2.b.a.c(strValueOf3);
            pv2.d.b bVar = new pv2.d.b(strValueOf, "", iC != -1 ? Integer.valueOf(iC) : null, null, cx2.b.a.b(String.valueOf(mapD.get(gw2.i.MINIMUM.f79975a))), cx2.b.a.b(String.valueOf(mapD.get(gw2.i.MAXIMUM.f79975a))), cx2.b.a.c(String.valueOf(mapD.get(gw2.i.PRECISION.f79975a))), new nw0.p(fragment, 14, fVar, strValueOf2), null, i15, false, null, 3328, null);
            EditText editText = styledInlineTextFieldViewDark.editText;
            if (!styledInlineTextFieldViewDark.isEditing) {
                styledInlineTextFieldViewDark.setHasError(false);
                String str3 = bVar.f141670a;
                editText.setText(str3);
                oc.b.H(editText, str3.length() > 0);
            }
            styledInlineTextFieldViewDark.f141648a = bVar.f141680k;
            styledInlineTextFieldViewDark.f141649b = bVar.f141672c;
            styledInlineTextFieldViewDark.f141650c = bVar.f141674e;
            styledInlineTextFieldViewDark.f141651d = bVar.f141675f;
            styledInlineTextFieldViewDark.f141652e = bVar.f141676g;
            styledInlineTextFieldViewDark.f141655h = bVar.f141677h;
            styledInlineTextFieldViewDark.onClickActionCallback = bVar.f141678i;
            editText.setHint(bVar.f141671b);
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
            Integer num = bVar.f141673d;
            if (num != null) {
                editText.addTextChangedListener(new pv2.a(num, editText));
            }
            editText.setImeOptions(6);
            int i17 = bVar.f141679j;
            editText.setInputType(i17);
            styledInlineTextFieldViewDark.f141653f = i17;
            String str4 = bVar.f141681l;
            if (str4 != null) {
                editText.setKeyListener(DigitsKeyListener.getInstance(str4));
            }
            styledInlineTextFieldViewDark.j();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    private final Object b(Object obj) {
        ArrayList arrayList;
        List<mm1.g> listB;
        xm1.e eVar;
        Double averageLocalSleepEndTime;
        Double averageLocalSleepStartTime;
        LocalDate localDate = (LocalDate) this.f100959b;
        LocalDate localDate2 = (LocalDate) this.f100961d;
        mm1.f fVar = (mm1.f) this.f100960c;
        mm1.e eVar2 = (mm1.e) this.f100962e;
        String str = (String) this.f100963f;
        View view2 = (View) obj;
        CustomLineChart customLineChart = (CustomLineChart) view2.findViewById(R.id.sleep_consistency_chart_view);
        customLineChart.getClass();
        Context context = view2.getContext();
        context.getClass();
        xm1.d dVar = new xm1.d(context, localDate, localDate2, false, false, 16, null);
        YAxis axisLeft = customLineChart.getAxisLeft();
        axisLeft.getClass();
        tz.a aVar = new tz.a(customLineChart, dVar, new xm1.f(customLineChart, customLineChart, axisLeft, localDate, localDate2), new m(customLineChart), new sl1.c(customLineChart), null, 32, null);
        ArrayList arrayList2 = null;
        if (fVar == null || (listB = fVar.b()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (mm1.g gVar : listB) {
                if (gVar.getWeekStartDate() == null) {
                    gVar = null;
                } else {
                    mm1.g.a values = gVar.getValues();
                    if ((values != null ? values.getAverageLocalSleepStartTime() : null) == null) {
                        gVar = null;
                    } else {
                        mm1.g.a values2 = gVar.getValues();
                        if ((values2 != null ? values2.getAverageLocalSleepEndTime() : null) == null) {
                            gVar = null;
                        }
                    }
                }
                if (gVar != null) {
                    LocalDate localDateY = y.y(gVar);
                    mm1.g.a values3 = gVar.getValues();
                    long jDoubleValue = (values3 == null || (averageLocalSleepStartTime = values3.getAverageLocalSleepStartTime()) == null) ? -1L : (long) averageLocalSleepStartTime.doubleValue();
                    mm1.g.a values4 = gVar.getValues();
                    eVar = new xm1.e(localDateY, jDoubleValue, (values4 == null || (averageLocalSleepEndTime = values4.getAverageLocalSleepEndTime()) == null) ? -1L : (long) averageLocalSleepEndTime.doubleValue(), null, 8, null);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        xm1.c cVar = new xm1.c(arrayList, eVar2 != null ? eVar2.getAverageLocalSleepEndTime() : null, eVar2 != null ? eVar2.getAverageLocalSleepStartTime() : null);
        List<xm1.e> list = cVar.f191497a;
        if (list != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (r.s((xm1.e) obj2)) {
                    arrayList2.add(obj2);
                }
            }
        }
        qz.a.b(aVar, new xm1.c(arrayList2, cVar.f191498b, cVar.f191499c), str, 4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.github.mikephil.chartingv2.data.Entry, java.lang.Object] */
    private final Object c(Object obj) {
        pr0.j jVar = (pr0.j) this.f100959b;
        BaseLineChart baseLineChart = (BaseLineChart) this.f100961d;
        Context context = (Context) this.f100960c;
        pr0.d dVar = (pr0.d) this.f100962e;
        hz.b bVar = (hz.b) this.f100963f;
        ((BaseLineChart) obj).getClass();
        jVar.l(baseLineChart);
        baseLineChart.setMarkerView(new pr0.i(context));
        LineChart lineChart = jVar.f134442b;
        if (lineChart != null) {
            List<hz.d> list = dVar.f139609a;
            float f14 = dVar.f139612d;
            hz.d dVar2 = (hz.d) h0.d0(list);
            int iA = nz.a.a(dVar2 != null ? dVar2.f86388a : null, bVar.f86379b, bVar.f86381d, jVar.f139627h);
            hz.b bVarC = nz.a.c(bVar, iA);
            DateTime dateTime = bVarC.f86378a;
            DateTime dateTime2 = bVarC.f86379b;
            DateTime dateTime3 = bVarC.f86380c;
            jVar.w();
            com.github.mikephil.chartingv2.components.YAxis axisLeft = lineChart.getAxisLeft();
            axisLeft.getClass();
            jVar.x(axisLeft, dVar.f139610b, dVar.f139611c, f14);
            ArrayList arrayList = new ArrayList();
            if (dateTime == null || dateTime3 == null) {
                arrayList.add(jVar.o(j0.f134944a, false));
                LineChart lineChart2 = jVar.f134442b;
                if (lineChart2 != null) {
                    lineChart2.setNoDataText(jVar.f134441a.getString(R.string.intensity_lbl_no_im_data));
                }
            } else {
                hz.e eVarP = jVar.p(dVar, dateTime, dateTime3, dateTime);
                int entryCount = eVarP.getEntryCount();
                for (int i14 = 0; i14 < entryCount; i14++) {
                    ?? entryForIndex = eVarP.getEntryForIndex(i14);
                    entryForIndex.getClass();
                    DateTime dateTimePlusHours = dateTime.plusHours(entryForIndex.getXIndex());
                    pi0.e eVar = jVar.f139628i;
                    dateTimePlusHours.getClass();
                    entryForIndex.setData(new pr0.h(eVar.a(dateTimePlusHours, qi0.a.NO_YEAR_ABBREV_MONTH_DAY), eVar.c(dateTimePlusHours, qi0.f.RELATIVE_24H_AM_PM_TIME), jVar.f139600f.b(Integer.valueOf((int) entryForIndex.getVal())), Integer.valueOf(R.color.gcm_chart_intensity_minutes_data_set), null, 16, null));
                }
                arrayList.add(eVarP);
                LineChart lineChart3 = jVar.f134442b;
                if (lineChart3 != null) {
                    lineChart3.setNoDataText(null);
                }
            }
            if (dateTime != null && dateTime2 != null) {
                arrayList.add(jVar.q(f14, dateTime, dateTime2, dateTime));
            }
            jVar.j(new LineData((List<String>) jVar.u(iA, dateTime, dateTime2), arrayList));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    private final Object d(Object obj) {
        Long lValueOf;
        long j8;
        k kVar;
        boolean z14;
        ww1.c cVar = (ww1.c) this.f100959b;
        ww1.a aVar = (ww1.a) this.f100961d;
        ww1.b bVar = (ww1.b) this.f100960c;
        ww1.d dVar = (ww1.d) this.f100962e;
        u uVar = (u) this.f100963f;
        if (((Boolean) obj).booleanValue()) {
            if (cVar != null) {
                j8 = cVar.f187755a;
            } else if (aVar != null) {
                j8 = aVar.f187755a;
            } else {
                lValueOf = bVar != null ? Long.valueOf(bVar.f187755a) : null;
                if (lValueOf == null) {
                    if (dVar != null) {
                        j8 = dVar.f187755a;
                    } else {
                        lValueOf = null;
                    }
                }
                if (lValueOf != null) {
                    if (cVar != null || (kVar = cVar.f187729g) == null) {
                        if (bVar != null) {
                            kVar = bVar.f187721h;
                        } else {
                            kVar = null;
                        }
                    }
                    rt1.j jVar = new rt1.j(aVar != null ? aVar.f187706g : null, kVar);
                    if (cVar != null && bVar == null && dVar == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    uVar.invoke(lValueOf, Boolean.valueOf(z14), jVar);
                }
            }
            lValueOf = Long.valueOf(j8);
            if (lValueOf != null) {
                if (cVar != null) {
                    if (bVar != null) {
                        kVar = bVar.f187721h;
                    } else {
                        kVar = null;
                    }
                } else if (bVar != null) {
                    kVar = bVar.f187721h;
                } else {
                    kVar = null;
                }
                rt1.j jVar2 = new rt1.j(aVar != null ? aVar.f187706g : null, kVar);
                if (cVar != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                uVar.invoke(lValueOf, Boolean.valueOf(z14), jVar2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    private final Object e(Object obj) {
        Long lValueOf;
        long j8;
        boolean z14;
        k kVar;
        ww1.c cVar = (ww1.c) this.f100959b;
        ww1.a aVar = (ww1.a) this.f100961d;
        ww1.b bVar = (ww1.b) this.f100960c;
        ww1.d dVar = (ww1.d) this.f100962e;
        u uVar = (u) this.f100963f;
        if (((Boolean) obj).booleanValue()) {
            rt1.j jVar = null;
            if (cVar != null) {
                j8 = cVar.f187755a;
            } else if (aVar != null) {
                j8 = aVar.f187755a;
            } else {
                lValueOf = bVar != null ? Long.valueOf(bVar.f187755a) : null;
                if (lValueOf == null) {
                    if (dVar != null) {
                        j8 = dVar.f187755a;
                    } else {
                        lValueOf = null;
                    }
                }
                if (lValueOf != null) {
                    if (cVar != null || (kVar = cVar.f187729g) == null) {
                        if (bVar != null) {
                            kVar = bVar.f187721h;
                        } else {
                            kVar = null;
                        }
                    }
                    jVar = new rt1.j(aVar != null ? aVar.f187706g : null, kVar);
                }
                if (cVar != null && bVar == null && dVar == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                uVar.invoke(lValueOf, Boolean.valueOf(z14), jVar);
            }
            lValueOf = Long.valueOf(j8);
            if (lValueOf != null) {
                if (cVar != null) {
                    if (bVar != null) {
                        kVar = bVar.f187721h;
                    } else {
                        kVar = null;
                    }
                } else if (bVar != null) {
                    kVar = bVar.f187721h;
                } else {
                    kVar = null;
                }
                jVar = new rt1.j(aVar != null ? aVar.f187706g : null, kVar);
            }
            if (cVar != null) {
                z14 = true;
            } else {
                z14 = true;
            }
            uVar.invoke(lValueOf, Boolean.valueOf(z14), jVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj) {
        b0 b0Var = (b0) this.f100959b;
        e23.a aVar = (e23.a) this.f100961d;
        p1 p1Var = (p1) this.f100960c;
        mc mcVar = (mc) this.f100962e;
        e23.a aVar2 = (e23.a) this.f100963f;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
            p1Var.setValue(Boolean.FALSE);
            ge1.b.T(b0Var, null, null, new w.h(mcVar, null), 3);
        } else {
            ge1.b.T(b0Var, null, null, new w.i(mcVar, null), 3).J(new rx1.m(aVar2, 3));
            if (zBooleanValue) {
                aVar.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, o13.l] */
    private final Object g(Object obj) {
        ManageFamilyActivity manageFamilyActivity = (ManageFamilyActivity) this.f100961d;
        e23.a aVar = (e23.a) this.f100960c;
        b0 b0Var = (b0) this.f100959b;
        mc mcVar = (mc) this.f100962e;
        Context context = (Context) this.f100963f;
        k0 k0Var = (k0) obj;
        ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
        k0Var.getClass();
        e1 e1Var = (e1) manageFamilyActivity.f35179a.getValue();
        rk0.y yVar = new rk0.y(aVar, 29);
        n nVar = new n(b0Var, mcVar, 12);
        o0 o0Var = new o0(manageFamilyActivity, 1);
        o0 o0Var2 = new o0(manageFamilyActivity, 2);
        e1Var.getClass();
        z3.e eVar = new z3.e(-1699707165, true, new c0((Object) e1Var, (Object) yVar, (Object) o0Var, (Object) nVar, (Object) o0Var2, 27));
        p13.k0 k0Var2 = p13.k0.f134949a;
        k0Var2.getClass();
        j0 j0Var = j0.f134944a;
        t0 t0Var = s0.f105811a;
        nc.n.a(k0Var, t0Var.b(sg0.y.class), k0Var2, j0Var, null, null, null, null, eVar);
        z3.e eVar2 = new z3.e(-1891355636, true, new o62.s0(new p0(manageFamilyActivity, 0), 26));
        nc.n.c(k0Var, t0Var.b(a0.class), k0Var2, j0Var, new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null), eVar2);
        z3.e eVar3 = new z3.e(1888075760, true, new o62.s0(new p0(manageFamilyActivity, 1), 25));
        nc.n.c(k0Var, t0Var.b(sg0.b0.class), k0Var2, j0Var, new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null), eVar3);
        f0 f0VarDa = manageFamilyActivity.da();
        q0 q0Var = new q0(aVar, 0);
        f0VarDa.getClass();
        nc.n.a(k0Var, t0Var.b(z.class), k0Var2, j0Var, null, null, null, null, new z3.e(1569447856, true, new m1(6, f0VarDa, q0Var)));
        nc.n.d(k0Var, d0.INSTANCE, t0Var.b(sg0.c0.class), k0Var2, j0Var, new rp.b(manageFamilyActivity, aVar, context, 14));
        return Unit.INSTANCE;
    }

    private final Object h(Object obj) {
        v vVar = (v) this.f100961d;
        s sVar = (s) this.f100960c;
        b0 b0Var = (b0) this.f100959b;
        n82.f fVar = (n82.f) this.f100962e;
        mc mcVar = (mc) this.f100963f;
        v vVar2 = (v) obj;
        vVar2.getClass();
        if (vVar.getSleepTimeSeconds() == vVar2.getSleepTimeSeconds() && vVar.getSleepStartTimestampGMT() == vVar2.getSleepStartTimestampGMT() && vVar.getSleepEndTimestampGMT() == vVar2.getSleepEndTimestampGMT()) {
            ge1.b.T(b0Var, null, null, new sm1.r.f(mcVar, null), 3);
        } else {
            long j8 = vVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            e0 e0Var = new e0(b0Var, sVar, fVar, mcVar, 29);
            sVar.getClass();
            ge1.b.T(v1.a(sVar), null, null, new sm1.u(j8, sVar, vVar2, e0Var, null), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj) {
        sz.a aVar = (sz.a) this.f100959b;
        l42.e eVar = (l42.e) this.f100961d;
        Context context = (Context) this.f100960c;
        l42.d dVar = (l42.d) this.f100962e;
        zk0.g gVar = (zk0.g) this.f100963f;
        ((CustomCombinedChart) obj).getClass();
        aVar.c();
        qz.a.b(aVar, eVar != null ? new s42.f(eVar, p13.w.c(dVar), gVar) : null, context.getString(R.string.common_no_data), 4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj) {
        sn.h hVar;
        sn.h hVar2;
        r0 r0Var = (r0) this.f100959b;
        Context context = (Context) this.f100961d;
        com.garmin.android.apps.connectmobile.activities.health.presentation.e eVar = ((com.garmin.android.apps.connectmobile.activities.health.presentation.c) this.f100960c).f29046a;
        m0 m0Var = (m0) this.f100962e;
        p1 p1Var = (p1) this.f100963f;
        i3 i3Var = (i3) obj;
        int i14 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
        i3Var.getClass();
        String str = i3Var.f111063a;
        switch (str.hashCode()) {
            case -867329893:
                if (str.equals("DOWNLOAD_PDF") && (hVar = (sn.h) r0Var.f105810a) != null) {
                    ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).G(context, hVar);
                }
                break;
            case 2213697:
                if (str.equals("HELP")) {
                    HelpActivity.a.e(HelpActivity.f36653a, context, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                }
                break;
            case 949943200:
                if (str.equals("EDIT_NAME") && (hVar2 = (sn.h) r0Var.f105810a) != null) {
                    eVar.f29059g = hVar2.getActivityName();
                    eVar.f29060h = new wn.c(context).a(hVar2);
                    lc.y.k("health_snapshot_edit_name", m0Var);
                }
                break;
            case 2012838315:
                if (str.equals(FirebasePerformance.HttpMethod.DELETE)) {
                    p1Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj) {
        tn2.w wVar = (tn2.w) this.f100959b;
        List list = (List) this.f100961d;
        boolean z14 = ((tn2.b) this.f100960c).f165527b;
        ul2.c cVar = (ul2.c) this.f100962e;
        Iterator it = (Iterator) this.f100963f;
        byte[] bArr = (byte[]) obj;
        Logger logger = tn2.w.f165679d;
        bArr.getClass();
        if (bArr.length >= 2) {
            List listB0 = p13.u.b0(2, bArr);
            if (((Number) listB0.get(0)).byteValue() == -112 && ((Number) listB0.get(1)).byteValue() == 0) {
                tn2.f.f165551a.getClass();
                o oVar = new o(it, h0.D0(list, new c1(tn2.f.a(bArr), z14)), cVar, wVar, 0);
                int i14 = w03.b.f181178a;
                return new e13.b(oVar);
            }
        }
        tn2.d dVar = tn2.d.RESPONSE_ERROR;
        tn2.f.f165551a.getClass();
        return q03.r.f(new tn2.w.c(dVar, h0.D0(list, new c1(tn2.f.a(bArr), z14))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        s5.q0 q0Var;
        float f14;
        int i14;
        char c14;
        String strA;
        Bundle extras;
        Bundle extras2;
        String string;
        List<lc.v> listSubList;
        int i15 = this.f100958a;
        int i16 = 2;
        Object obj2 = this.f100959b;
        Object obj3 = this.f100963f;
        Object obj4 = this.f100962e;
        Object obj5 = this.f100960c;
        Object obj6 = this.f100961d;
        switch (i15) {
            case 0:
                b0 b0Var = (b0) obj2;
                gv0.d dVar = (gv0.d) obj6;
                q qVar = (q) obj5;
                uu0.c cVar = (uu0.c) obj4;
                b.g gVar = (b.g) obj3;
                pu0.b bVar = (pu0.b) obj;
                bVar.getClass();
                String str = bVar.f141183a;
                if (str != null) {
                    ge1.b.T(b0Var, null, null, new e.C1943e(dVar, str, qVar, cVar, gVar, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                b0 b0Var2 = (b0) obj2;
                w0 w0Var = (w0) obj6;
                q qVar2 = (q) obj5;
                Context context = (Context) obj4;
                p1 p1Var = (p1) obj3;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str2 = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str2, "MENU_ITEM_EDIT")) {
                    ge1.b.T(b0Var2, null, null, new ky0.s0.a(w0Var, qVar2, context, null), 3);
                } else if (p005kotlin.jvm.internal.s.g(str2, "MENU_ITEM_DELETE")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 2:
                x5.c0 c0Var = (x5.c0) obj6;
                l0 l0Var = (l0) obj5;
                b2 b2Var = (b2) obj4;
                o4.w wVar = (o4.w) obj3;
                q4.c cVar2 = (q4.c) obj;
                cVar2.m1();
                float floatValue = ((v2.e0) obj2).f174959c.getFloatValue();
                if (floatValue != 0.0f) {
                    long j8 = l0Var.f188879b;
                    s5.w0.a aVar = s5.w0.f157315b;
                    int iB = c0Var.b((int) (j8 >> 32));
                    p006l2.i3 i3VarD = b2Var.d();
                    n4.d dVar2 = (i3VarD == null || (q0Var = i3VarD.f108575a) == null) ? new n4.d(0.0f, 0.0f, 0.0f, 0.0f) : q0Var.c(iB);
                    float fFloor = (float) Math.floor(cVar2.s0(r2.f108753a));
                    float f15 = fFloor < 1.0f ? 1.0f : fFloor;
                    float f16 = f15 / 2;
                    float f17 = dVar2.f123547a + f16;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.b() >> 32)) - f16;
                    if (f17 > fIntBitsToFloat) {
                        f17 = fIntBitsToFloat;
                    }
                    if (f17 >= f16) {
                        f16 = f17;
                    }
                    float fFloor2 = ((int) f15) % 2 == 1 ? ((float) Math.floor(f16)) + 0.5f : (float) Math.rint(f16);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(dVar2.f123548b)) & 4294967295L);
                    n4.c.a aVar2 = n4.c.f123541b;
                    q4.f.A1(cVar2, wVar, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(dVar2.f123550d)) & 4294967295L), f15, floatValue);
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar3 = (e23.a) obj2;
                e23.a aVar4 = (e23.a) obj6;
                e23.a aVar5 = (e23.a) obj5;
                e23.a aVar6 = (e23.a) obj4;
                e23.a aVar7 = (e23.a) obj3;
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                String str3 = i3Var2.f111063a;
                if (p005kotlin.jvm.internal.s.g(str3, "IMAGE")) {
                    aVar3.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str3, m21.c.MENU_ITEM_QUICK_ADD.f116080a)) {
                    aVar4.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str3, m21.c.MENU_ITEM_CREATE_FOOD.f116080a)) {
                    aVar5.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str3, m21.c.MENU_ITEM_CREATE_RECIPE.f116080a)) {
                    aVar6.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str3, m21.c.MENU_ITEM_CREATE_MEAL.f116080a)) {
                    aVar7.invoke();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar8 = (e23.a) obj2;
                m0 m0Var = (m0) obj4;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                z3.e eVar = new z3.e(1051349894, true, new ca0.r(aVar8, 4));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                nc.n.a(k0Var, t0Var.b(lk1.c.class), k0Var2, j0Var, null, null, null, null, eVar);
                nc.n.a(k0Var, t0Var.b(lk1.a.class), k0Var2, j0Var, null, null, null, null, new z3.e(274306749, true, new c0(obj6, obj5, (Object) m0Var, (e23.a) obj3, (Object) aVar8, 19)));
                lk1.f.INSTANCE.getClass();
                nc.n.a(k0Var, t0Var.b(lk1.f.class), lk1.f.f113148c, j0Var, null, null, null, null, new z3.e(-1182106306, true, new ca0.a(m0Var, aVar8, 5)));
                return Unit.INSTANCE;
            case 5:
                b0 b0Var3 = (b0) obj2;
                p1 p1Var2 = (p1) obj6;
                l lVar = (l) obj5;
                p1 p1Var3 = (p1) obj4;
                i2.a aVar9 = (i2.a) obj3;
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                boolean z14 = !((Boolean) p1Var3.getF182175a()).booleanValue() && g0Var.a();
                boolean z15 = ((Boolean) p1Var3.getF182175a()).booleanValue() && !g0Var.a();
                if (z14) {
                    ge1.b.T(b0Var3, null, null, new lm0.e.a(aVar9, null), 3);
                } else if (z15 && d53.w.J(((l0) p1Var2.getF182175a()).f188878a.f157138b)) {
                    lVar.invoke(null);
                }
                p1Var3.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 6:
                jc1.b bVar2 = (jc1.b) obj2;
                List<hz.d> list = (List) obj6;
                List<hz.d> list2 = (List) obj5;
                hz.b bVar3 = (hz.b) obj4;
                hz.f fVar = (hz.f) obj3;
                ((oz.a) obj).getClass();
                Context context2 = bVar2.f98162a;
                list.getClass();
                list2.getClass();
                oz.a aVar10 = bVar2.f98163b;
                if (aVar10 != null) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        aVar10.setTouchEnabled(false);
                    } else {
                        DateTime dateTime = bVar3.f86378a;
                        DateTime dateTime2 = bVar3.f86379b;
                        boolean zN = g8.i.N(fVar, dateTime, dateTime2);
                        oz.a aVar11 = bVar2.f98163b;
                        if (aVar11 != null) {
                            rl1.g gVar2 = new rl1.g(context2, aVar11);
                            gVar2.f153414d = zN;
                            ArrayList arrayList = new ArrayList();
                            bc1.a aVar12 = bc1.a.f17414a;
                            f14 = 0.0f;
                            Context context3 = gVar2.f153411a;
                            arrayList.addAll(jg.b.y(aVar12, context3));
                            if (gVar2.f153414d) {
                                q6.f.t(context3, R.color.gcm_chart_sleep_shade, arrayList);
                            }
                            int i17 = gVar2.f153414d ? 5 : 4;
                            String[] strArr = new String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                strArr[i18] = TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE;
                            }
                            ArrayList arrayList2 = new ArrayList(4);
                            arrayList2.add(context3.getString(R.string.less_than_string_pattern, context3.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(hc1.a.HARMFUL) + 1))));
                            hc1.a aVar13 = hc1.a.LOW;
                            arrayList2.add(context3.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar13)), context3.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar13)))));
                            hc1.a aVar14 = hc1.a.MODERATE;
                            arrayList2.add(context3.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar14)), context3.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar14)))));
                            hc1.a aVar15 = hc1.a.NORMAL;
                            arrayList2.add(context3.getString(R.string.string_line_string_pattern, String.valueOf(ge1.b.J(aVar15)), context3.getString(R.string.lbl_percentage, Integer.valueOf(ge1.b.I(aVar15)))));
                            if (gVar2.f153414d) {
                                arrayList2.add(context3.getString(R.string.lbl_pulse_ox_during_sleep));
                            }
                            mz.c cVar3 = gVar2.f153413c;
                            gz.d dVar3 = gVar2.f153412b;
                            if (cVar3 != null && i17 == arrayList2.size() && i17 == arrayList.size()) {
                                dVar3.setCustom(arrayList, arrayList2);
                                if (c22.b.a(context3) >= 1.5f) {
                                    dVar3.setXEntrySpace(10.0f);
                                } else {
                                    dVar3.setXEntrySpace(20.0f);
                                }
                                cVar3.f121614b = strArr;
                            }
                            aVar11.a(dVar3, cVar3);
                        } else {
                            f14 = 0.0f;
                        }
                        if (dateTime == null || dateTime2 == null) {
                            i14 = 0;
                        } else {
                            boolean zIs24HourFormat = DateFormat.is24HourFormat(context2);
                            ArrayList arrayList3 = new ArrayList();
                            MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
                            while (true) {
                                int i19 = 60;
                                if (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
                                    if (mutableDateTime.getMinuteOfDay() % PsExtractor.VIDEO_STREAM_MASK == 0) {
                                        jz.a aVar16 = bVar2.f98164c;
                                        DateTime dateTime3 = mutableDateTime.toDateTime();
                                        aVar16.getClass();
                                        strA = jz.a.a(dateTime3, zIs24HourFormat);
                                    } else {
                                        strA = mutableDateTime.getMinuteOfDay() % 60 == 0 ? StringUtils.SPACE : "";
                                    }
                                    arrayList3.add(strA);
                                    mutableDateTime.addMinutes(1);
                                } else {
                                    CombinedData combinedData = new CombinedData(arrayList3);
                                    ArrayList arrayList4 = new ArrayList();
                                    for (hz.d dVar4 : list) {
                                        DateTime dateTime4 = dVar4.f86388a;
                                        int minutes = Minutes.minutesBetween(dateTime, dateTime2).getMinutes();
                                        float f18 = dVar4.f86389b;
                                        float[] fArr = new float[5];
                                        fArr[0] = f18;
                                        fArr[1] = f14;
                                        fArr[2] = f14;
                                        fArr[3] = f14;
                                        fArr[4] = f14;
                                        if (f14 <= f18 && f18 <= 69.0f) {
                                            c14 = 1;
                                        } else if (70.0f <= f18 && f18 <= 79.0f) {
                                            c14 = 2;
                                        } else if (80.0f > f18 || f18 > 89.0f) {
                                            c14 = (90.0f > f18 || f18 > 100.0f) ? (char) 0 : (char) 4;
                                        } else {
                                            c14 = 3;
                                        }
                                        fArr[c14] = 100.0f - f18;
                                        int minutes2 = Minutes.minutesBetween(dateTime, dateTime4).getMinutes();
                                        int i24 = 0;
                                        while (i24 < i19) {
                                            int i25 = minutes2 + i24;
                                            if (i25 >= 0 && i25 <= minutes) {
                                                arrayList4.add(new BarEntry(fArr, i25));
                                            }
                                            i24++;
                                            i19 = 60;
                                        }
                                    }
                                    BarDataSet barDataSet = new BarDataSet(arrayList4, null);
                                    barDataSet.setBarSpacePercent(f14);
                                    barDataSet.setAxisDependency(com.github.mikephil.chartingv2.components.YAxis.AxisDependency.LEFT);
                                    barDataSet.setHighlightEnabled(false);
                                    barDataSet.setDrawValues(false);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(0);
                                    arrayList5.addAll(jg.b.y(bc1.a.f17414a, context2));
                                    barDataSet.setColors(arrayList5);
                                    combinedData.setData(new BarData(arrayList3, barDataSet));
                                    ArrayList<Entry> arrayList6 = new ArrayList();
                                    for (hz.d dVar5 : list2) {
                                        arrayList6.add(new Entry(dVar5.f86389b, Minutes.minutesBetween(dateTime, dVar5.f86388a).getMinutes()));
                                    }
                                    ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList6, null);
                                    scatterDataSet.setAxisDependency(com.github.mikephil.chartingv2.components.YAxis.AxisDependency.LEFT);
                                    i14 = 0;
                                    scatterDataSet.setHighlightEnabled(false);
                                    scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
                                    scatterDataSet.setScatterShapeSize(5.0f);
                                    scatterDataSet.setDrawValues(false);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Entry entry : arrayList6) {
                                        bc1.a aVar17 = bc1.a.f17414a;
                                        Float fValueOf = Float.valueOf(entry.getVal());
                                        aVar17.getClass();
                                        p2 p2VarU = jg.b.u(aVar17, fValueOf);
                                        Integer numU = p2VarU != null ? zf.b.u(p2VarU, context2) : null;
                                        arrayList7.add(Integer.valueOf(numU != null ? numU.intValue() : 0));
                                    }
                                    scatterDataSet.setColors(arrayList7);
                                    combinedData.setData(new ScatterData(arrayList3, scatterDataSet));
                                    aVar10.setData(combinedData);
                                }
                            }
                        }
                        XAxis xAxis = aVar10.getXAxis();
                        xAxis.getClass();
                        xAxis.removeAllLimitLines();
                        oz.a aVar18 = bVar2.f98163b;
                        XAxisRenderer rendererXAxis = aVar18 != null ? aVar18.getRendererXAxis() : null;
                        if ((rendererXAxis instanceof gm1.b) && dateTime != null && dateTime2 != null) {
                            gm1.b bVar4 = (gm1.b) rendererXAxis;
                            int hours = Hours.hoursBetween(dateTime, dateTime2).getHours() % 4;
                            int i26 = hours > 0 ? 4 - hours : i14;
                            if (i26 >= 0) {
                                bVar4.f121637l = i26;
                            }
                            bVar4.e(context2, dateTime, dateTime2, fVar);
                            bVar4.d(context2, dateTime, dateTime2, fVar);
                        }
                        aVar10.setTouchEnabled(true);
                    }
                    String string2 = context2.getString(R.string.txt_empty_page_no_data);
                    string2.getClass();
                    aVar10.setNoDataText(string2);
                    aVar10.invalidate();
                }
                return Unit.INSTANCE;
            case 7:
                ml0.p pVar = (ml0.p) obj6;
                b0 b0Var4 = (b0) obj2;
                fe feVar = (fe) obj4;
                String str4 = (String) obj3;
                q qVar3 = (q) obj5;
                if (((Boolean) obj).booleanValue()) {
                    pVar.z4();
                } else {
                    pVar.y4();
                    ge1.b.T(b0Var4, null, null, new ml0.j(feVar, str4, qVar3, null), 3);
                }
                return Unit.INSTANCE;
            case 8:
                List list3 = (List) obj2;
                com.garmin.android.apps.connectmobile.courses.model.b bVar5 = (com.garmin.android.apps.connectmobile.courses.model.b) obj6;
                com.garmin.android.apps.connectmobile.courses.model.b bVar6 = (com.garmin.android.apps.connectmobile.courses.model.b) obj5;
                l22.a aVar19 = (l22.a) obj4;
                y30.a aVar20 = (y30.a) obj3;
                RangeSlider rangeSlider = (RangeSlider) ((View) obj).findViewById(R.id.climb_difficulty_slider);
                List<Float> listK = x.k(Float.valueOf(list3.indexOf(bVar5)), Float.valueOf(list3.indexOf(bVar6)));
                if (!p005kotlin.jvm.internal.s.g(rangeSlider.getValues(), listK)) {
                    rangeSlider.setValues(listK);
                    rangeSlider.setContentDescription(aVar19.a(R.string.range_from_to_content_description, aVar20.b(bVar5), aVar20.b(bVar6)));
                }
                return Unit.INSTANCE;
            case 9:
                final GearActivity gearActivity = (GearActivity) obj2;
                final m0 m0Var2 = (m0) obj6;
                String str5 = (String) obj5;
                bv.d dVar6 = (bv.d) obj4;
                k0 k0Var3 = (k0) obj;
                GearActivity.a aVar21 = GearActivity.f35500b;
                k0Var3.getClass();
                GearActivity.w wVar2 = new GearActivity.w(gearActivity.getOnBackPressedDispatcher());
                z3.e eVar2 = new z3.e(-727617800, true, new nk0.a(gearActivity, dVar6, wVar2, m0Var2));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.j.class), k0Var4, j0Var2, null, null, null, null, eVar2);
                k23.p pVarC = s0.c(rk0.f0.class);
                n63.b.a aVar22 = n63.b.f123892d;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.i.class), p13.t0.b(new p(pVarC, new GearActivity.j0(aVar22))), j0Var2, null, null, null, null, new z3.e(-662337425, true, new i91.e(gearActivity, 16, dVar6, m0Var2)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.d.class), k0Var4, j0Var2, null, null, null, null, new z3.e(124013232, true, new nk0.a(gearActivity, m0Var2, dVar6, wVar2)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.r.class), k0Var4, j0Var2, null, null, null, null, new z3.e(910363889, true, new nk0.b(gearActivity, wVar2, m0Var2)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.b.class), p13.t0.b(new p(s0.c(c80.u.class), new GearActivity.l0(aVar22))), j0Var2, null, null, null, null, new z3.e(1696714546, true, new nk0.a(gearActivity, dVar6, m0Var2, wVar2, 3)));
                k23.r.a aVar23 = k23.r.f102461c;
                k23.p pVarC2 = s0.c(uk0.a.class);
                aVar23.getClass();
                nc.n.a(k0Var3, t0Var2.b(GearRoute.a.class), p13.t0.b(new p(s0.d(List.class, k23.r.a.a(pVarC2)), new GearActivity.m0(aVar22))), j0Var2, null, null, null, null, new z3.e(-1811902093, true, new nk0.b(gearActivity, m0Var2, wVar2, i16)));
                final int i27 = 0;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.o.class), u0.e(new p(s0.d(List.class, k23.r.a.a(s0.c(x0.class))), new GearActivity.n0(aVar22)), new p(s0.c(qk0.c.class), new GearActivity.o0(aVar22))), j0Var2, null, null, null, null, new z3.e(-1025551436, true, new e23.r() { // from class: nk0.c
                    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:137:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:144:0x04fd  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
                    /* JADX WARN: Code duplicated, block: B:154:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
                    /* JADX WARN: Code duplicated, block: B:161:0x05a9  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
                    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v25, types: [p3.m] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v27, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.android.apps.connectmobile.gear.presentation.GearActivity, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v22 java.lang.Object, still in use, count: 2, list:
                          (r11v22 java.lang.Object) from 0x02aa: PHI (r11 I:??) = (r11v19 java.lang.Object), (r11v22 java.lang.Object) binds: [B:74:0x02a9, B:165:0x02aa] A[DONT_GENERATE, DONT_INLINE]
                          (r11v22 java.lang.Object) from 0x029e: CHECK_CAST (jk0.h) (r11v22 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                        */
                    @Override // e23.r
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 1482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nk0.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                final int i28 = 1;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.p.class), p13.t0.b(new p(s0.c(c80.u.class), new GearActivity.p0(aVar22))), j0Var2, null, null, null, null, new z3.e(-239200779, true, new e23.r() { // from class: nk0.c
                    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:137:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:144:0x04fd  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
                    /* JADX WARN: Code duplicated, block: B:154:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
                    /* JADX WARN: Code duplicated, block: B:161:0x05a9  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
                    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v25, types: [p3.m] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v27, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.android.apps.connectmobile.gear.presentation.GearActivity, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v22 java.lang.Object, still in use, count: 2, list:
                          (r11v22 java.lang.Object) from 0x02aa: PHI (r11 I:??) = (r11v19 java.lang.Object), (r11v22 java.lang.Object) binds: [B:74:0x02a9, B:165:0x02aa] A[DONT_GENERATE, DONT_INLINE]
                          (r11v22 java.lang.Object) from 0x029e: CHECK_CAST (jk0.h) (r11v22 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        */
                    @Override // e23.r
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 1482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nk0.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                final int i29 = 2;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.q.class), u0.e(new p(s0.c(c80.u.class), new GearActivity.q0(aVar22)), new p(s0.d(List.class, k23.r.a.a(s0.c(String.class))), new GearActivity.r0(aVar22))), j0Var2, null, null, null, null, new z3.e(547149878, true, new e23.r() { // from class: nk0.c
                    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:137:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:144:0x04fd  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
                    /* JADX WARN: Code duplicated, block: B:154:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
                    /* JADX WARN: Code duplicated, block: B:161:0x05a9  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
                    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v25, types: [p3.m] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v27, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.android.apps.connectmobile.gear.presentation.GearActivity, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v22 java.lang.Object, still in use, count: 2, list:
                          (r11v22 java.lang.Object) from 0x02aa: PHI (r11 I:??) = (r11v19 java.lang.Object), (r11v22 java.lang.Object) binds: [B:74:0x02a9, B:165:0x02aa] A[DONT_GENERATE, DONT_INLINE]
                          (r11v22 java.lang.Object) from 0x029e: CHECK_CAST (jk0.h) (r11v22 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        */
                    @Override // e23.r
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 1482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nk0.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                final int i30 = 3;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.c.class), p13.t0.b(new p(s0.c(c80.u.class), new GearActivity.s0(aVar22))), j0Var2, null, null, null, null, new z3.e(1333500535, true, new e23.r() { // from class: nk0.c
                    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:137:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:144:0x04fd  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
                    /* JADX WARN: Code duplicated, block: B:154:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
                    /* JADX WARN: Code duplicated, block: B:161:0x05a9  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
                    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v25, types: [p3.m] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v27, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.android.apps.connectmobile.gear.presentation.GearActivity, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v22 java.lang.Object, still in use, count: 2, list:
                          (r11v22 java.lang.Object) from 0x02aa: PHI (r11 I:??) = (r11v19 java.lang.Object), (r11v22 java.lang.Object) binds: [B:74:0x02a9, B:165:0x02aa] A[DONT_GENERATE, DONT_INLINE]
                          (r11v22 java.lang.Object) from 0x029e: CHECK_CAST (jk0.h) (r11v22 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        */
                    @Override // e23.r
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 1482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nk0.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                final int i34 = 4;
                nc.n.a(k0Var3, t0Var2.b(GearRoute.k.class), u0.e(new p(s0.c(b63.o.class), new GearActivity.z(aVar22)), new p(s0.d(List.class, k23.r.a.a(s0.c(uk0.a.class))), new GearActivity.a0(aVar22)), new p(s0.c(x0.class), new GearActivity.b0(aVar22))), j0Var2, null, null, null, null, new z3.e(635090245, true, new e23.r() { // from class: nk0.c
                    /* JADX WARN: Code duplicated, block: B:108:0x036a  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:120:0x03d0  */
                    /* JADX WARN: Code duplicated, block: B:127:0x044f  */
                    /* JADX WARN: Code duplicated, block: B:132:0x0472  */
                    /* JADX WARN: Code duplicated, block: B:137:0x049a  */
                    /* JADX WARN: Code duplicated, block: B:144:0x04fd  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0525  */
                    /* JADX WARN: Code duplicated, block: B:154:0x054b  */
                    /* JADX WARN: Code duplicated, block: B:15:0x00b8  */
                    /* JADX WARN: Code duplicated, block: B:161:0x05a9  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0112  */
                    /* JADX WARN: Code duplicated, block: B:38:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01c9  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
                    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0265  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0305  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v25, types: [p3.m] */
                    /* JADX WARN: Type inference failed for: r3v10 */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v27, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.garmin.android.apps.connectmobile.gear.presentation.GearActivity, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v22 java.lang.Object, still in use, count: 2, list:
                          (r11v22 java.lang.Object) from 0x02aa: PHI (r11 I:??) = (r11v19 java.lang.Object), (r11v22 java.lang.Object) binds: [B:74:0x02a9, B:165:0x02aa] A[DONT_GENERATE, DONT_INLINE]
                          (r11v22 java.lang.Object) from 0x029e: CHECK_CAST (jk0.h) (r11v22 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        */
                    @Override // e23.r
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instruction units count: 1482
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: nk0.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.l.class), p13.t0.b(new p(s0.d(List.class, k23.r.a.a(s0.c(uk0.a.class))), new GearActivity.c0(aVar22))), j0Var2, null, null, null, null, new z3.e(1421440902, true, new nk0.b(gearActivity, m0Var2, wVar2, 3)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.h.class), p13.t0.b(new p(s0.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.class), new GearActivity.d0(aVar22))), j0Var2, null, null, null, null, new z3.e(-2087175737, true, new nk0.a(gearActivity, dVar6, m0Var2, wVar2, 0)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.f.class), p13.t0.b(new p(s0.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.class), new GearActivity.e0(aVar22))), j0Var2, null, null, null, null, new z3.e(-1300825080, true, new nk0.a(gearActivity, dVar6, m0Var2, wVar2, 1)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.g.class), u0.e(new p(s0.c(sk0.l0.class), new GearActivity.f0(aVar22)), new p(s0.d(List.class, k23.r.a.a(s0.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.class))), new GearActivity.g0(aVar22))), j0Var2, null, null, null, null, new z3.e(-514474423, true, new nk0.b(gearActivity, m0Var2, wVar2, 0)));
                nc.n.a(k0Var3, t0Var2.b(GearRoute.s.class), p13.t0.b(new p(s0.c(rk0.w0.class), new GearActivity.h0(aVar22))), j0Var2, null, null, null, null, new z3.e(271876234, true, new i91.e(gearActivity, 15, (mk0.e) obj3, wVar2)));
                Map mapB = p13.t0.b(new p(s0.d(List.class, k23.r.a.a(s0.c(y22.w.class))), new GearActivity.i0(aVar22)));
                t tVar = gearActivity.f35501a;
                hf.j jVar = (hf.j) tVar.getValue();
                k23.d dVarB = t0Var2.b(GearRoute.n.class);
                k62.j jVar2 = new k62.j(gearActivity, m0Var2, 21);
                y22.k kVar = y22.k.INSTANCE;
                ge1.b.U(k0Var3, t0Var2.b(GearRoute.n.class), kVar, mapB, new GearActivity.x(10, str5, jVar, wVar2, m0Var2, jVar2, dVarB));
                ge1.b.U(k0Var3, t0Var2.b(GearRoute.m.class), kVar, p13.t0.b(new p(s0.d(List.class, k23.r.a.a(s0.c(y22.w.class))), new GearActivity.k0(aVar22))), new GearActivity.y(10, str5, (hf.j) tVar.getValue(), wVar2, m0Var2, new k62.j(gearActivity, m0Var2, 22), t0Var2.b(GearRoute.m.class)));
                return Unit.INSTANCE;
            case 10:
                e23.p pVar2 = (e23.p) obj2;
                e23.a aVar24 = (e23.a) obj6;
                Context context4 = (Context) obj5;
                lw1.f fVar2 = (lw1.f) obj4;
                m0 m0Var3 = (m0) obj3;
                f.a aVar25 = (f.a) obj;
                aVar25.getClass();
                Intent intent = aVar25.f67586b;
                int i35 = aVar25.f67585a;
                if (i35 != -1) {
                    if (i35 == 2) {
                        fy1.c.f73884a.getClass();
                        fy1.c.a();
                        if (fVar2.f115116i) {
                            pVar2.invoke(2, null);
                            aVar24.invoke();
                        } else {
                            lc.y.q(m0Var3, nw1.d.a.INSTANCE);
                        }
                    }
                } else if (intent == null || (extras = intent.getExtras()) == null || !extras.getBoolean("extras_is_event_training_plan_navigation")) {
                    aVar24.invoke();
                    ActiveTrainingPlansActivity.a.d(ActiveTrainingPlansActivity.f45098w, context4, false, false, false, null, 126);
                } else {
                    Bundle extras3 = intent.getExtras();
                    if ((extras3 == null || !extras3.getBoolean("extra_continue_with_goal_setup")) && ((extras2 = intent.getExtras()) == null || !extras2.getBoolean("extras_is_event_tp_plan_created"))) {
                        aVar24.invoke();
                    } else {
                        pVar2.invoke(-1, intent);
                        aVar24.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 11:
                m52.k kVar2 = (m52.k) obj2;
                p62.f fVar3 = (p62.f) obj6;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj5;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar7 = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b) obj4;
                l lVar2 = (l) obj3;
                SpinnerDialogView spinnerDialogView = (SpinnerDialogView) obj;
                spinnerDialogView.getClass();
                if (p13.u.m0(new m52.k[]{m52.k.f116759t, m52.k.f116760v}).contains(kVar2)) {
                    string = spinnerDialogView.getContext().getString(R.string.workout_target);
                    string.getClass();
                } else if (k52.g.e(kVar2)) {
                    string = spinnerDialogView.getContext().getString(R.string.workout_duration_target);
                    string.getClass();
                } else {
                    string = spinnerDialogView.getContext().getString(R.string.workout_duration);
                    string.getClass();
                }
                spinnerDialogView.setTitle(string);
                spinnerDialogView.setSubtitle(fVar3.a(j0Var3));
                if (kVar2 == m52.k.f116758r) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c cVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar7;
                    spinnerDialogView.setDescriptionMessage(spinnerDialogView.getContext().getString((cVar4.f49630f && cVar4.f49631g) ? R.string.msg_pool_units_updated_send_off_time_and_target_pace_alert : R.string.msg_pool_units_updated_send_off_time_alert));
                    spinnerDialogView.setDescriptionMessageSpinnerIndex(3);
                }
                spinnerDialogView.setOnSpinnerValuesChangeListener(new a73.f(fVar3, 26, j0Var3, lVar2));
                spinnerDialogView.setOnSpinnerListRowClickListener(new p62.a(fVar3, j0Var3));
                Context context5 = spinnerDialogView.getContext();
                context5.getClass();
                spinnerDialogView.setOnSpinnerDialogButtonClickListener(fVar3.e(context5, j0Var3));
                return Unit.INSTANCE;
            case 12:
                n1 n1Var = (n1) obj6;
                n1 n1Var2 = (n1) obj5;
                n1 n1Var3 = (n1) obj4;
                n1 n1Var4 = (n1) obj3;
                String str6 = (String) obj;
                str6.getClass();
                ((p1) obj2).setValue(str6);
                Integer numI = d53.t.i(str6);
                n1Var.t(numI != null ? numI.intValue() : 0);
                Integer numI2 = d53.t.i(str6);
                n1Var2.t(numI2 != null ? numI2.intValue() : 0);
                Integer numI3 = d53.t.i(str6);
                n1Var3.t(numI3 != null ? numI3.intValue() : 0);
                Integer numI4 = d53.t.i(str6);
                n1Var4.t(numI4 != null ? numI4.intValue() : 0);
                return Unit.INSTANCE;
            case 13:
                return a(obj);
            case 14:
                ge1.b.T((b0) obj2, null, null, new pn1.e.c((km1.b) obj, (km1.b) obj6, (Context) obj5, (n1) obj4, (p1) obj3, null), 3);
                return Unit.INSTANCE;
            case 15:
                s sVar = (s) obj6;
                p1 p1Var4 = (p1) obj5;
                n1 n1Var5 = (n1) obj4;
                b0 b0Var5 = (b0) obj2;
                Context context6 = (Context) obj3;
                km1.b bVar8 = (km1.b) obj;
                bVar8.getClass();
                DateTime dateTimeF = km1.b.f((km1.b) ((List) p1Var4.getF182175a()).get(n1Var5.getIntValue()));
                Long lValueOf = dateTimeF != null ? Long.valueOf(dateTimeF.getMillis()) : null;
                DateTime dateTimeD = km1.b.d((km1.b) ((List) p1Var4.getF182175a()).get(n1Var5.getIntValue()));
                p pVar3 = new p(lValueOf, dateTimeD != null ? Long.valueOf(dateTimeD.getMillis()) : null);
                c cVar5 = new c(b0Var5, bVar8, context6, n1Var5, p1Var4, 14);
                sVar.getClass();
                Long l14 = (Long) pVar3.f128594a;
                Long l15 = (Long) pVar3.f128595b;
                if (l14 != null && l15 != null) {
                    ge1.b.T(v1.a(sVar), null, null, new sm1.y(sVar, l14, l15, bVar8, cVar5, null), 3);
                }
                return Unit.INSTANCE;
            case 16:
                ArrayList arrayList8 = (ArrayList) obj6;
                p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) obj5;
                qc.h hVar = (qc.h) obj4;
                Bundle bundle = (Bundle) obj3;
                lc.v vVar = (lc.v) obj;
                int i36 = qc.h.B;
                vVar.getClass();
                ((p005kotlin.jvm.internal.m0) obj2).f105804a = true;
                int iIndexOf = arrayList8.indexOf(vVar);
                if (iIndexOf != -1) {
                    int i37 = iIndexOf + 1;
                    listSubList = arrayList8.subList(p0Var.f105807a, i37);
                    p0Var.f105807a = i37;
                } else {
                    listSubList = j0.f134944a;
                }
                hVar.a(vVar.f111882b, bundle, vVar, listSubList);
                return Unit.INSTANCE;
            case 17:
                return b(obj);
            case 18:
                np.c cVar6 = (np.c) obj5;
                rp.c cVar7 = (rp.c) obj4;
                e23.a aVar26 = (e23.a) obj3;
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                z3.e eVar3 = new z3.e(752164594, true, new c0(obj2, obj6, (u1) cVar6, (Object) cVar7, aVar26, 26));
                p13.k0 k0Var6 = p13.k0.f134949a;
                k0Var6.getClass();
                j0 j0Var4 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                nc.n.a(k0Var5, t0Var3.b(rp.a.class), k0Var6, j0Var4, null, null, null, null, eVar3);
                nc.n.a(k0Var5, t0Var3.b(rp.f.class), k0Var6, j0Var4, null, null, null, null, new z3.e(778205225, true, new i91.e(cVar6, 27, cVar7, aVar26)));
                return Unit.INSTANCE;
            case 19:
                return c(obj);
            case 20:
                return d(obj);
            case 21:
                return e(obj);
            case 22:
                return f(obj);
            case 23:
                return new sc.a(this.f100959b, (Set) obj6, (Set) obj5, (p1) obj4, (p1) obj3);
            case 24:
                return g(obj);
            case 25:
                return h(obj);
            case 26:
                return i(obj);
            case 27:
                return j(obj);
            case 28:
                return k(obj);
            default:
                tn2.r0 r0Var = (tn2.r0) obj2;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                c83.a0 a0Var = (c83.a0) obj;
                Logger logger = tn2.r0.f165631n;
                a0Var.getClass();
                return new tn2.r0.e(r0Var, str7, str8, "general", str9, new t42.l(r0Var, str7, str9, str8, 6), new tn2.m(r0Var, 17), new tn2.m(18)).c(a0Var, (String) obj6);
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, b0 b0Var, Object obj3, Object obj4, int i14) {
        this.f100958a = i14;
        this.f100961d = obj;
        this.f100960c = obj2;
        this.f100959b = b0Var;
        this.f100962e = obj3;
        this.f100963f = obj4;
    }

    public /* synthetic */ c(ml0.p pVar, b0 b0Var, fe feVar, String str, q qVar) {
        this.f100958a = 7;
        this.f100961d = pVar;
        this.f100959b = b0Var;
        this.f100962e = feVar;
        this.f100963f = str;
        this.f100960c = qVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f100958a = i14;
        this.f100959b = obj;
        this.f100961d = obj2;
        this.f100960c = obj3;
        this.f100962e = obj4;
        this.f100963f = obj5;
    }
}
