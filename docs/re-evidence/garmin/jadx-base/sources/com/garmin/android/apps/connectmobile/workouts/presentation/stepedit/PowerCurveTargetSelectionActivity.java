package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.f3;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import com.garmin.android.apps.connectmobile.workouts.presentation.charts.PowerCurveTargetChart;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.PowerCurveTargetSelectionActivity;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import gl1.y;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/PowerCurveTargetSelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerCurveTargetSelectionActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49559e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u52.b f49562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49563d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/stepedit/PowerCurveTargetSelectionActivity$b", "Landroid/text/style/ClickableSpan;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            HelpActivity.a.e(HelpActivity.f36653a, PowerCurveTargetSelectionActivity.this, ro0.l.POWER_CURVE_TARGET_HELP, null, null, 12);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public final void ca(int i14, int i15) {
        if (i14 <= 0 || i15 + 10 <= i14) {
            return;
        }
        new androidx.appcompat.app.e.a(this).setTitle(R.string.power_curve_challenging_target_title).setMessage(R.string.power_curve_challenging_target_msg).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("POWER_CURVE_DURATION", this.f49560a);
        intent.putExtra("POWER_CURVE_SCALE", this.f49561b);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0052  */
    /* JADX WARN: Code duplicated, block: B:92:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, java.lang.Object] */
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
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CutPasteId"})
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        ArrayList arrayList;
        final PowerCurveTargetSelectionActivity powerCurveTargetSelectionActivity = this;
        super.onCreate(bundle);
        powerCurveTargetSelectionActivity.setContentView(R.layout.gcm4_power_curve_target_activity);
        powerCurveTargetSelectionActivity.initActionBar(true, R.string.power_curve_set_target);
        int intExtra = powerCurveTargetSelectionActivity.getIntent().getIntExtra("STEP_DURATION", 0);
        final int intExtra2 = powerCurveTargetSelectionActivity.getIntent().getIntExtra("POWER_CURVE_RANGE", 0);
        powerCurveTargetSelectionActivity.f49560a = powerCurveTargetSelectionActivity.getIntent().getIntExtra("POWER_CURVE_DURATION", 0);
        powerCurveTargetSelectionActivity.f49561b = powerCurveTargetSelectionActivity.getIntent().getIntExtra("POWER_CURVE_SCALE", 0);
        Intent intent = powerCurveTargetSelectionActivity.getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_POWER_CURVE_TARGET_LIST", v.class);
                arrayList = parcelableArrayListExtra;
            } else {
                arrayList = null;
            }
        } else if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_POWER_CURVE_TARGET_LIST");
            arrayList = parcelableArrayListExtra;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            powerCurveTargetSelectionActivity.finish();
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((v) it.next()).getPower() == 0) {
                    b bVar = powerCurveTargetSelectionActivity.new b();
                    TextView textView = (TextView) powerCurveTargetSelectionActivity.findViewById(R.id.power_target_missing_data);
                    f3 f3Var = f3.f23054a;
                    textView.getClass();
                    f3Var.getClass();
                    textView.setText(f3.d(textView, bVar));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setVisibility(0);
                    break;
                }
            }
        }
        PowerCurveTargetChart powerCurveTargetChart = (PowerCurveTargetChart) powerCurveTargetSelectionActivity.findViewById(R.id.power_curve_line_chart);
        powerCurveTargetChart.getClass();
        u52.b bVar2 = new u52.b(powerCurveTargetChart);
        powerCurveTargetSelectionActivity.f49562c = bVar2;
        PowerCurveTargetChart powerCurveTargetChart2 = bVar2.f168705a;
        int color = a7.b.getColor(powerCurveTargetChart2.getContext(), R.color.gcm_text_secondary);
        Typeface typefaceA = h22.a.a(h22.b.a(powerCurveTargetChart2.getF31342c().getTypeface()), powerCurveTargetChart2.getContext());
        powerCurveTargetChart2.setExtraBottomOffset(20.0f);
        powerCurveTargetChart2.setExtraTopOffset(30.0f);
        powerCurveTargetChart2.getDescription().setEnabled(false);
        powerCurveTargetChart2.getF31342c().setEnabled(false);
        powerCurveTargetChart2.setHighlightPerTapEnabled(false);
        powerCurveTargetChart2.setHighlightPerDragEnabled(false);
        powerCurveTargetChart2.setExtraRightOffset(18.0f);
        powerCurveTargetChart2.setNoDataText("");
        powerCurveTargetChart2.setNoDataTextColor(color);
        powerCurveTargetChart2.setNoDataTextTypeface(typefaceA);
        powerCurveTargetChart2.setTouchEnabled(false);
        powerCurveTargetChart2.setPinchZoom(false);
        powerCurveTargetChart2.setDrawGridBackground(false);
        XAxis xAxis = powerCurveTargetChart2.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setAxisLineColor(color);
        xAxis.setAxisLineColor(color);
        xAxis.setTextColor(color);
        xAxis.setLabelRotationAngle(270.0f);
        powerCurveTargetChart2.getAxisRight().setEnabled(false);
        YAxis axisLeft = powerCurveTargetChart2.getAxisLeft();
        axisLeft.setDrawGridLines(false);
        axisLeft.setGridColor(a7.b.getColor(powerCurveTargetChart2.getContext(), R.color.gcm_chart_grid));
        axisLeft.setTextColor(color);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisLeft.setDrawAxisLine(false);
        Legend f31342c = powerCurveTargetChart2.getF31342c();
        f31342c.setEnabled(true);
        f31342c.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        f31342c.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        f31342c.setTextColor(color);
        f31342c.setForm(Legend.LegendForm.NONE);
        f31342c.setTypeface(typefaceA);
        f31342c.setTextSize(12.0f);
        ViewPortHandler viewPortHandler = powerCurveTargetChart2.getViewPortHandler();
        viewPortHandler.getClass();
        XAxis xAxis2 = powerCurveTargetChart2.getXAxis();
        xAxis2.getClass();
        Transformer transformer = powerCurveTargetChart2.getTransformer(YAxis.AxisDependency.LEFT);
        transformer.getClass();
        powerCurveTargetChart2.setXAxisRenderer(new u52.d(viewPortHandler, xAxis2, transformer));
        ChartAnimator animator = powerCurveTargetChart2.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler2 = powerCurveTargetChart2.getViewPortHandler();
        viewPortHandler2.getClass();
        Context context = powerCurveTargetChart2.getContext();
        context.getClass();
        u52.c cVar = new u52.c(powerCurveTargetChart2, animator, viewPortHandler2, context);
        bVar2.f168706b = cVar;
        powerCurveTargetChart2.setRenderer(cVar);
        u52.b bVar3 = powerCurveTargetSelectionActivity.f49562c;
        if (bVar3 != null) {
            PowerCurveTargetChart powerCurveTargetChart3 = bVar3.f168705a;
            if (arrayList.isEmpty()) {
                powerCurveTargetChart3.setCustomNoDataText(powerCurveTargetChart3.getContext().getString(R.string.txt_empty_page_no_data));
                powerCurveTargetChart3.getAxisLeft().setEnabled(false);
                break;
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((v) it3.next()).getPower() > 0) {
                        powerCurveTargetChart3.setCustomNoDataText(null);
                        powerCurveTargetChart3.getAxisLeft().setEnabled(true);
                        break;
                    }
                } else {
                    powerCurveTargetChart3.setCustomNoDataText(powerCurveTargetChart3.getContext().getString(R.string.txt_empty_page_no_data));
                    powerCurveTargetChart3.getAxisLeft().setEnabled(false);
                    break;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList2.add(new Entry(i14, ((v) arrayList.get(i14)).getPower()));
            }
            u52.c cVar2 = bVar3.f168706b;
            if (cVar2 != null) {
                cVar2.f168712j = ((v) arrayList.get(0)).getPower();
            }
            XAxis xAxis3 = powerCurveTargetChart3.getXAxis();
            Context context2 = powerCurveTargetChart3.getContext();
            context2.getClass();
            xAxis3.setValueFormatter(new u52.a(arrayList, context2));
            XAxis xAxis4 = powerCurveTargetChart3.getXAxis();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((v) obj).getInterpolated()) {
                    arrayList3.add(obj);
                }
            }
            xAxis4.setLabelCount(arrayList3.size(), true);
            LineDataSet lineDataSet = new LineDataSet(arrayList2, powerCurveTargetChart3.getContext().getString(R.string.power_curve_interval_duration));
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(bVar3.f168708d);
            lineDataSet.setHighlightLineWidth(1.0f);
            lineDataSet.setHighLightColor(bVar3.f168707c);
            lineDataSet.setFillDrawable(bVar3.f168709e);
            powerCurveTargetChart3.setData(new LineData(lineDataSet));
            powerCurveTargetChart3.invalidate();
        }
        u52.b bVar4 = powerCurveTargetSelectionActivity.f49562c;
        int i15 = -1;
        if (bVar4 != null) {
            Iterator it4 = arrayList.iterator();
            int i16 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i16 = -1;
                    break;
                }
                v vVar = (v) it4.next();
                if (vVar.getDuration() == powerCurveTargetSelectionActivity.f49560a && vVar.getPower() > 0) {
                    break;
                } else {
                    i16++;
                }
            }
            bVar4.a(i16, powerCurveTargetSelectionActivity.f49561b, intExtra2);
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            t.g();
            return;
        }
        int duration = ((v) it5.next()).getDuration();
        while (it5.hasNext()) {
            int duration2 = ((v) it5.next()).getDuration();
            if (duration < duration2) {
                duration = duration2;
            }
        }
        if (intExtra <= duration) {
            v vVarK = y.k(intExtra, arrayList);
            powerCurveTargetSelectionActivity.f49563d = vVarK != null ? vVarK.getPower() : 0;
            Integer numValueOf = vVarK != null ? Integer.valueOf(vVarK.getDuration()) : null;
            Iterator it6 = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                }
                int duration3 = ((v) it6.next()).getDuration();
                if (numValueOf != null && duration3 == numValueOf.intValue()) {
                    break;
                } else {
                    i17++;
                }
            }
            u52.b bVar5 = powerCurveTargetSelectionActivity.f49562c;
            if (bVar5 != null) {
                PowerCurveTargetChart powerCurveTargetChart4 = bVar5.f168705a;
                Context context3 = powerCurveTargetChart4.getContext();
                Context context4 = powerCurveTargetChart4.getContext();
                context4.getClass();
                LimitLine limitLine = new LimitLine(i17, context3.getString(R.string.workout_step_duration_label, v52.f.h(context4, intExtra)));
                limitLine.enableDashedLine(20.0f, 10.0f, 0.0f);
                int i18 = bVar5.f168707c;
                limitLine.setLineColor(i18);
                limitLine.setTextColor(i18);
                limitLine.setTypeface(h22.a.a("font/roboto_light.ttf", powerCurveTargetChart4.getContext()));
                limitLine.setTextSize(12.0f);
                powerCurveTargetChart4.getXAxis().addLimitLine(limitLine);
            }
        }
        final ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((v) obj2).getFiller()) {
                arrayList4.add(obj2);
            }
        }
        final p0 p0Var = new p0();
        Iterator it7 = arrayList4.iterator();
        int i19 = 0;
        while (it7.hasNext()) {
            if (((v) it7.next()).getDuration() == powerCurveTargetSelectionActivity.f49560a) {
                i15 = i19;
                break;
            }
            i19++;
        }
        p0Var.f105807a = i15;
        final p0 p0Var2 = new p0();
        p0Var2.f105807a = powerCurveTargetSelectionActivity.f49561b - 1;
        final r0 r0Var = new r0();
        for (?? r14 : arrayList4) {
            if (((v) r14).getDuration() == powerCurveTargetSelectionActivity.f49560a) {
                r0Var.f105810a = r14;
                View viewFindViewById = powerCurveTargetSelectionActivity.findViewById(R.id.power_curve_interval);
                viewFindViewById.getClass();
                final q62.c cVar3 = new q62.c(viewFindViewById);
                View viewFindViewById2 = powerCurveTargetSelectionActivity.findViewById(R.id.power_curve_target);
                viewFindViewById2.getClass();
                final q62.c cVar4 = new q62.c(viewFindViewById2);
                cVar3.c(powerCurveTargetSelectionActivity.getString(R.string.power_curve_interval));
                cVar3.b(y.q(powerCurveTargetSelectionActivity.f49560a, ((v) r0Var.f105810a).getPower(), powerCurveTargetSelectionActivity));
                final ArrayList arrayList5 = arrayList;
                cVar3.f143192a.setOnClickListener(new View.OnClickListener() { // from class: o62.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        PowerCurveTargetSelectionActivity.a aVar = PowerCurveTargetSelectionActivity.f49559e;
                        final PowerCurveTargetSelectionActivity powerCurveTargetSelectionActivity2 = this.f129709a;
                        View viewInflate = powerCurveTargetSelectionActivity2.getLayoutInflater().inflate(R.layout.gcm4_picker, (ViewGroup) null);
                        final NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.picker);
                        final ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.v> arrayList6 = arrayList4;
                        ArrayList arrayList7 = new ArrayList(p13.y.r(arrayList6, 10));
                        for (com.garmin.android.apps.connectmobile.workouts.data.model.v vVar2 : arrayList6) {
                            String strH = v52.f.h(powerCurveTargetSelectionActivity2, vVar2.getDuration());
                            arrayList7.add(vVar2.getPower() > 0 ? strH + "          " + vVar2.getPower() + StringUtils.SPACE + powerCurveTargetSelectionActivity2.getString(R.string.lbl_watts) : e5.g(strH, "          ", powerCurveTargetSelectionActivity2.getString(R.string.no_data_label)));
                        }
                        String[] strArr = (String[]) arrayList7.toArray(new String[0]);
                        if (strArr == null || strArr.length == 0) {
                            return;
                        }
                        numberPicker.setDisplayedValues(strArr);
                        numberPicker.setMaxValue(strArr.length - 1);
                        numberPicker.setMinValue(0);
                        final p005kotlin.jvm.internal.p0 p0Var3 = p0Var;
                        numberPicker.setValue(p0Var3.f105807a);
                        androidx.appcompat.app.e.a view3 = new androidx.appcompat.app.e.a(powerCurveTargetSelectionActivity2).setTitle(R.string.power_curve_interval).setView(viewInflate);
                        final p005kotlin.jvm.internal.r0 r0Var2 = r0Var;
                        final q62.c cVar5 = cVar3;
                        final q62.c cVar6 = cVar4;
                        final ArrayList arrayList8 = arrayList5;
                        final int i24 = intExtra2;
                        view3.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: o62.p
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Object] */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i25) {
                                PowerCurveTargetSelectionActivity.a aVar2 = PowerCurveTargetSelectionActivity.f49559e;
                                NumberPicker numberPicker2 = numberPicker;
                                ?? r15 = arrayList6.get(numberPicker2.getValue());
                                p005kotlin.jvm.internal.r0 r0Var3 = r0Var2;
                                r0Var3.f105810a = r15;
                                p0Var3.f105807a = numberPicker2.getValue();
                                int duration4 = ((com.garmin.android.apps.connectmobile.workouts.data.model.v) r0Var3.f105810a).getDuration();
                                PowerCurveTargetSelectionActivity powerCurveTargetSelectionActivity3 = powerCurveTargetSelectionActivity2;
                                powerCurveTargetSelectionActivity3.f49560a = duration4;
                                int power = (int) ((((com.garmin.android.apps.connectmobile.workouts.data.model.v) r0Var3.f105810a).getPower() * powerCurveTargetSelectionActivity3.f49561b) / 100.0f);
                                cVar5.b(gl1.y.q(powerCurveTargetSelectionActivity3.f49560a, ((com.garmin.android.apps.connectmobile.workouts.data.model.v) r0Var3.f105810a).getPower(), powerCurveTargetSelectionActivity3));
                                cVar6.b(gl1.y.v(powerCurveTargetSelectionActivity3.f49561b, power, powerCurveTargetSelectionActivity3));
                                powerCurveTargetSelectionActivity3.ca(powerCurveTargetSelectionActivity3.f49563d, power);
                                u52.b bVar6 = powerCurveTargetSelectionActivity3.f49562c;
                                if (bVar6 != null) {
                                    int i26 = 0;
                                    for (com.garmin.android.apps.connectmobile.workouts.data.model.v vVar3 : arrayList8) {
                                        if (vVar3.getDuration() == powerCurveTargetSelectionActivity3.f49560a && vVar3.getPower() > 0) {
                                            bVar6.a(i26, powerCurveTargetSelectionActivity3.f49561b, i24);
                                        }
                                        i26++;
                                    }
                                    i26 = -1;
                                    bVar6.a(i26, powerCurveTargetSelectionActivity3.f49561b, i24);
                                }
                            }
                        }).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
                    }
                });
                cVar4.c(powerCurveTargetSelectionActivity.getString(R.string.power_curve_target));
                cVar4.b(y.v(powerCurveTargetSelectionActivity.f49561b, (int) ((((v) r0Var.f105810a).getPower() * powerCurveTargetSelectionActivity.f49561b) / 100.0f), powerCurveTargetSelectionActivity));
                final ArrayList arrayList6 = arrayList;
                cVar4.f143192a.setOnClickListener(new View.OnClickListener() { // from class: o62.n
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String strD;
                        PowerCurveTargetSelectionActivity.a aVar = PowerCurveTargetSelectionActivity.f49559e;
                        final PowerCurveTargetSelectionActivity powerCurveTargetSelectionActivity2 = this.f129719a;
                        View viewInflate = powerCurveTargetSelectionActivity2.getLayoutInflater().inflate(R.layout.gcm4_picker, (ViewGroup) null);
                        final NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.picker);
                        ArrayList arrayList7 = new ArrayList();
                        String[] strArr = new String[100];
                        int i24 = 1;
                        while (true) {
                            int i25 = i24;
                            final p005kotlin.jvm.internal.r0 r0Var2 = r0Var;
                            if (i25 >= 101) {
                                numberPicker.setDisplayedValues(strArr);
                                numberPicker.setMaxValue(99);
                                numberPicker.setMinValue(0);
                                final p005kotlin.jvm.internal.p0 p0Var3 = p0Var2;
                                numberPicker.setValue(p0Var3.f105807a);
                                androidx.appcompat.app.e.a view3 = new androidx.appcompat.app.e.a(powerCurveTargetSelectionActivity2).setTitle(R.string.power_curve_percentage).setView(viewInflate);
                                final q62.c cVar5 = cVar4;
                                final ArrayList arrayList8 = arrayList6;
                                final int i26 = intExtra2;
                                view3.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: o62.o
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i27) {
                                        PowerCurveTargetSelectionActivity.a aVar2 = PowerCurveTargetSelectionActivity.f49559e;
                                        NumberPicker numberPicker2 = numberPicker;
                                        int value = numberPicker2.getValue() + 1;
                                        PowerCurveTargetSelectionActivity powerCurveTargetSelectionActivity3 = powerCurveTargetSelectionActivity2;
                                        powerCurveTargetSelectionActivity3.f49561b = value;
                                        p0Var3.f105807a = numberPicker2.getValue();
                                        int power = ((com.garmin.android.apps.connectmobile.workouts.data.model.v) r0Var2.f105810a).getPower();
                                        int i28 = powerCurveTargetSelectionActivity3.f49561b;
                                        int i29 = (int) ((power * i28) / 100.0f);
                                        cVar5.b(gl1.y.v(i28, i29, powerCurveTargetSelectionActivity3));
                                        powerCurveTargetSelectionActivity3.ca(powerCurveTargetSelectionActivity3.f49563d, i29);
                                        u52.b bVar6 = powerCurveTargetSelectionActivity3.f49562c;
                                        if (bVar6 != null) {
                                            int i30 = 0;
                                            for (com.garmin.android.apps.connectmobile.workouts.data.model.v vVar2 : arrayList8) {
                                                if (vVar2.getDuration() == powerCurveTargetSelectionActivity3.f49560a && vVar2.getPower() > 0) {
                                                    bVar6.a(i30, powerCurveTargetSelectionActivity3.f49561b, i26);
                                                }
                                                i30++;
                                            }
                                            i30 = -1;
                                            bVar6.a(i30, powerCurveTargetSelectionActivity3.f49561b, i26);
                                        }
                                    }
                                }).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
                                return;
                            }
                            int power = (int) ((((com.garmin.android.apps.connectmobile.workouts.data.model.v) r0Var2.f105810a).getPower() * i25) / 100.0f);
                            arrayList7.add(Integer.valueOf(power));
                            int i27 = i25 - 1;
                            if (power > 0) {
                                strD = i25 + "%          " + power + StringUtils.SPACE + powerCurveTargetSelectionActivity2.getString(R.string.lbl_watts);
                            } else {
                                strD = org.apache.commons.lang3.e.d(i25, "%          ", powerCurveTargetSelectionActivity2.getString(R.string.no_data_label));
                            }
                            strArr[i27] = strD;
                            i24 = i25 + 1;
                        }
                    }
                });
                return;
            }
            powerCurveTargetSelectionActivity = this;
        }
        n23.j.s("Collection contains no element matching the predicate.");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        Intent intent = new Intent();
        intent.putExtra("POWER_CURVE_DURATION", this.f49560a);
        intent.putExtra("POWER_CURVE_SCALE", this.f49561b);
        setResult(-1, intent);
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.POWER_CURVE_TARGET_HELP, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/PowerCurveTargetSelectionActivity$a;", "", "<init>", "()V", "", "EXTRA_POWER_CURVE_TARGET_LIST", "Ljava/lang/String;", "EXTRA_POWER_CURVE_RANGE", "EXTRA_STEP_DURATION", "EXTRA_POWER_CURVE_DURATION", "EXTRA_POWER_CURVE_SCALE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
