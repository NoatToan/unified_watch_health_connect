package com.garmin.android.apps.connectmobile.activities.manual;

import am.j;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.r;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.android.material.timepicker.TimeModel;
import f12.l;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import lo.g;
import lo.m3;
import lo.n3;
import org.apache.commons.lang3.StringUtils;
import ps.z1;
import qs.y;

/* JADX INFO: loaded from: classes7.dex */
public class a implements View.OnClickListener {
    public final m3 A;
    public final m3 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f29155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GCMComplexTwoLineButton f29164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f29165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f29166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f29167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f29168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC0448a f29169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29170q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m3 f29172t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m3 f29173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m3 f29174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m3 f29175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m3 f29176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m3 f29177z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n3 f29171r = new n3(this, 6);
    public final n3 C = new n3(this, 0);
    public final n3 D = new n3(this, 1);
    public final n3 E = new n3(this, 2);
    public final n3 F = new n3(this, 0);
    public final n3 I = new n3(this, 3);
    public final n3 P = new n3(this, 4);
    public final n3 T = new n3(this, 5);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.manual.a$a, reason: collision with other inner class name */
    public interface InterfaceC0448a {
    }

    public interface b {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v3, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v4, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v7, types: [lo.m3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lo.m3] */
    public a(View view2, b bVar, InterfaceC0448a interfaceC0448a) {
        final int i14 = 6;
        this.f29172t = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                int i16 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i15) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i16 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i16 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i16), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i17 = (int) rVar.f29644c;
                        int i18 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i17);
                        bundle.putInt("heliumPercent", i18);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i19 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i19 == -1) {
                            i19 = 5;
                        }
                        t0Var.A6(i19);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i15 = 7;
        this.f29173v = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                int i17 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i16) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i17 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i17 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i17), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i18 = (int) rVar.f29644c;
                        int i19 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i18);
                        bundle.putInt("heliumPercent", i19);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i110 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i110 == -1) {
                            i110 = 5;
                        }
                        t0Var.A6(i110);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i16 = 0;
        this.f29174w = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                int i18 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i17) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i18 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i18 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i18), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i19 = (int) rVar.f29644c;
                        int i110 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i19);
                        bundle.putInt("heliumPercent", i110);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i111 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i111 == -1) {
                            i111 = 5;
                        }
                        t0Var.A6(i111);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i17 = 1;
        this.f29175x = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                int i19 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i18) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i19 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i19 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i19), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i110 = (int) rVar.f29644c;
                        int i111 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i110);
                        bundle.putInt("heliumPercent", i111);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i112 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i112 == -1) {
                            i112 = 5;
                        }
                        t0Var.A6(i112);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i18 = 2;
        this.f29176y = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                int i110 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i19) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i110 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i110 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i110), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i111 = (int) rVar.f29644c;
                        int i112 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i111);
                        bundle.putInt("heliumPercent", i112);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i113 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i113 == -1) {
                            i113 = 5;
                        }
                        t0Var.A6(i113);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i19 = 3;
        this.f29177z = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                int i111 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i110) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i111 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i111 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i111), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i112 = (int) rVar.f29644c;
                        int i113 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i112);
                        bundle.putInt("heliumPercent", i113);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i114 = arguments.getInt("oxygenPercent");
                        int i24 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i114 == -1) {
                            i114 = 5;
                        }
                        t0Var.A6(i114);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i24 == -1) {
                            i24 = 0;
                        }
                        t0Var.E6(i24);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i25 = rVar2.f29651j;
                        int i26 = i25 < 9999 ? i25 + 1 : 9998;
                        int i27 = rVar2.f29649h;
                        if (i27 < 0) {
                            i27 = i25 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i27, rVar2.f29650i, i26, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i28 = rVar3.f29649h;
                        int i29 = i28 > 0 ? i28 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i29, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i24 = 4;
        this.A = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                int i111 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i110) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i111 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i111 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i111), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i112 = (int) rVar.f29644c;
                        int i113 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i112);
                        bundle.putInt("heliumPercent", i113);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i114 = arguments.getInt("oxygenPercent");
                        int i25 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i114 == -1) {
                            i114 = 5;
                        }
                        t0Var.A6(i114);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i25 == -1) {
                            i25 = 0;
                        }
                        t0Var.E6(i25);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i26 = rVar2.f29651j;
                        int i27 = i26 < 9999 ? i26 + 1 : 9998;
                        int i28 = rVar2.f29649h;
                        if (i28 < 0) {
                            i28 = i26 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i28, rVar2.f29650i, i27, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i29 = rVar3.f29649h;
                        int i210 = i29 > 0 ? i29 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i210, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        final int i25 = 5;
        this.B = new View.OnClickListener(this) { // from class: lo.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113915b;

            {
                this.f113915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i25;
                int i111 = 1;
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113915b;
                switch (i110) {
                    case 0:
                        r22.y1 y1Var = new r22.y1();
                        HashMap map = new HashMap();
                        Context context = aVar.f29154a;
                        String string = context.getString(R.string.lbl_tank_material_aluminium);
                        String string2 = context.getString(R.string.lbl_tank_material_steel);
                        String string3 = context.getString(R.string.lbl_other);
                        lc.u0.s(0, map, string, 1, string2);
                        map.put(2, string3);
                        if (string.equals(aVar.f29167n.f29648g)) {
                            i111 = 0;
                        } else if (!string2.equals(aVar.f29167n.f29648g)) {
                            i111 = 2;
                        }
                        y1Var.a(context, context.getString(R.string.activity_details_tank_type), map, Integer.valueOf(i111), aVar.f29171r);
                        break;
                    case 1:
                        Context context2 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = aVar.f29167n;
                        int i112 = (int) rVar.f29644c;
                        int i113 = (int) rVar.f29643b;
                        r22.t0 t0Var = new r22.t0();
                        Bundle bundle = new Bundle();
                        bundle.putInt("oxygenPercent", i112);
                        bundle.putInt("heliumPercent", i113);
                        t0Var.setArguments(bundle);
                        n3 n3Var = aVar.C;
                        Bundle arguments = t0Var.getArguments();
                        int i114 = arguments.getInt("oxygenPercent");
                        int i26 = arguments.getInt("heliumPercent");
                        t0Var.f149570p = true;
                        t0Var.J0 = R.string.lbl_oxygen;
                        t0Var.C6(5, 100, false);
                        if (i114 == -1) {
                            i114 = 5;
                        }
                        t0Var.A6(i114);
                        t0Var.f149571q = true;
                        t0Var.f149568n = true;
                        t0Var.K0 = R.string.lbl_helium;
                        t0Var.H6(0, 95, false);
                        if (i26 == -1) {
                            i26 = 0;
                        }
                        t0Var.E6(i26);
                        t0Var.f149569o = false;
                        t0Var.T = new r22.a(n3Var, 4);
                        t0Var.I = context2.getString(R.string.lbl_ok);
                        t0Var.show(((i.c) context2).getSupportFragmentManager(), "t0");
                        break;
                    case 2:
                        Context context3 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = aVar.f29167n;
                        int i27 = rVar2.f29651j;
                        int i28 = i27 < 9999 ? i27 + 1 : 9998;
                        int i29 = rVar2.f29649h;
                        if (i29 < 0) {
                            i29 = i27 + 1;
                        }
                        r22.i1 i1VarU6 = r22.i1.u6(i29, rVar2.f29650i, i28, 9999, context3.getString(R.string.activity_details_tank_start_pressure));
                        i1VarU6.f149686e = aVar.D;
                        i1VarU6.f149687f = context3.getString(R.string.lbl_ok);
                        i1VarU6.show(((i.c) context3).getSupportFragmentManager(), "i1");
                        break;
                    case 3:
                        Context context4 = aVar.f29154a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = aVar.f29167n;
                        int i210 = rVar3.f29649h;
                        int i211 = i210 > 0 ? i210 - 1 : 0;
                        int i30 = rVar3.f29651j;
                        if (i30 < 0) {
                            i30 = 0;
                        }
                        r22.i1 i1VarU7 = r22.i1.u6(i30, rVar3.f29652k, 0, i211, context4.getString(R.string.activity_details_tank_end_pressure));
                        i1VarU7.f149686e = aVar.E;
                        i1VarU7.f149687f = context4.getString(R.string.lbl_ok);
                        i1VarU7.show(((i.c) context4).getSupportFragmentManager(), "i1");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar4 = aVar.f29167n;
                        double d14 = rVar4.f29653l;
                        ps.z1 z1Var = rVar4.f29654m;
                        r22.h2 h2Var = new r22.h2();
                        Bundle bundle2 = new Bundle();
                        bundle2.putDouble("extra_volume", d14);
                        bundle2.putParcelable("extra_unit", z1Var);
                        h2Var.setArguments(bundle2);
                        h2Var.S0 = aVar.F;
                        Context context5 = aVar.f29154a;
                        h2Var.I = context5.getString(R.string.lbl_done);
                        h2Var.show(((i.c) context5).getSupportFragmentManager(), "h2");
                        break;
                    case 5:
                        Context context6 = aVar.f29154a;
                        String strB = aVar.b();
                        boolean zIsNaN = Double.isNaN(aVar.f29167n.f29655n);
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar5 = aVar.f29167n;
                        r22.g0 g0VarU6 = r22.g0.u6(!zIsNaN ? rVar5.f29655n : rVar5.f29649h, strB, context6.getString(R.string.lbl_pressure_rate), 0);
                        g0VarU6.f149658f = aVar.P;
                        g0VarU6.show(((i.c) context6).getSupportFragmentManager(), "EditTextPickerDialog");
                        break;
                    case 6:
                        HashMap map2 = new HashMap();
                        Context context7 = aVar.f29154a;
                        lc.u0.s(0, map2, context7.getString(R.string.activity_details_mode_open_circuit), 1, context7.getString(R.string.activity_details_mode_closed_circuit));
                        int i34 = aVar.f29167n.f29642a;
                        new r22.y1().a(context7, context7.getString(R.string.activity_details_gas_mode), map2, Integer.valueOf((i34 == 0 || i34 == 1) ? i34 : 0), aVar.T);
                        break;
                    default:
                        r22.y1 y1Var2 = new r22.y1();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context8 = aVar.f29154a;
                        linkedHashMap.put(0, context8.getString(R.string.activity_details_gas_status_deco_enabled));
                        linkedHashMap.put(1, context8.getString(R.string.activity_details_gas_status_backup));
                        int i35 = aVar.f29167n.f29645d;
                        y1Var2.a(aVar.f29154a, "", linkedHashMap, Integer.valueOf(i35 > 0 ? i35 - 1 : 0), aVar.I);
                        break;
                }
            }
        };
        this.f29155b = view2;
        this.f29154a = view2.getContext();
        this.f29156c = (GCMComplexTwoLineButton) view2.findViewById(R.id.gas_mode_button);
        this.f29157d = (GCMComplexTwoLineButton) view2.findViewById(R.id.gas_status_button);
        this.f29158e = (GCMComplexTwoLineButton) view2.findViewById(R.id.gas_type_button);
        this.f29159f = (GCMComplexTwoLineButton) view2.findViewById(R.id.gas_mixture_button);
        this.f29160g = (GCMComplexTwoLineButton) view2.findViewById(R.id.tank_start_pressure_button);
        this.f29161h = (GCMComplexTwoLineButton) view2.findViewById(R.id.tank_end_pressure_button);
        this.f29162i = (GCMComplexTwoLineButton) view2.findViewById(R.id.tank_type_button);
        this.f29163j = (GCMComplexTwoLineButton) view2.findViewById(R.id.tank_size_button);
        this.f29164k = (GCMComplexTwoLineButton) view2.findViewById(R.id.tank_sac_rate_button);
        this.f29165l = (ImageView) view2.findViewById(R.id.remove_gas_button);
        this.f29166m = (TextView) view2.findViewById(R.id.gas_index_text_view);
        this.f29168o = bVar;
        this.f29169p = interfaceC0448a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    public final void a(r rVar) {
        String string;
        double d14;
        String string2;
        String string3;
        this.f29167n = rVar;
        int i14 = rVar.f29646e;
        View view2 = this.f29155b;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f29157d;
        if (i14 == 0) {
            gCMComplexTwoLineButton.setVisible(false);
        } else {
            gCMComplexTwoLineButton.setOnClickListener(this.f29173v);
            Context context = view2.getContext();
            int i15 = rVar.f29645d;
            if (i15 != 1) {
                string = i15 != 2 ? context.getString(R.string.activity_details_diving_select_one) : context.getString(R.string.activity_details_gas_status_backup);
            } else {
                string = context.getString(R.string.activity_details_gas_status_deco_enabled);
            }
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(string);
        }
        Context context2 = this.f29154a;
        String string4 = context2.getString(R.string.activity_details_diving_select_one);
        int i16 = rVar.f29642a;
        if (i16 == 0) {
            string4 = context2.getString(R.string.activity_details_mode_open_circuit);
        } else if (i16 == 1) {
            string4 = context2.getString(R.string.activity_details_mode_closed_circuit);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f29156c;
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(string4);
        gCMComplexTwoLineButton2.setOnClickListener(this.f29172t);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f29158e;
        gCMComplexTwoLineButton3.setEnabled(false);
        Context context3 = view2.getContext();
        if (context3 != null) {
            double d15 = rVar.f29644c;
            if (d15 == 0.0d) {
                d14 = 100.0d;
                string2 = null;
            } else {
                d14 = 100.0d;
                if (d15 == -1.0d && rVar.f29643b == -1.0d) {
                    string2 = context3.getString(R.string.no_value);
                } else if (d15 == 100.0d) {
                    string2 = context3.getString(R.string.dive_gas_oxygen);
                } else if (rVar.f29643b == 0.0d) {
                    string2 = d15 == 21.0d ? context3.getString(R.string.dive_gas_air) : context3.getString(R.string.lbl_eanx_mix);
                } else {
                    string2 = context3.getString(R.string.lbl_trimix);
                }
            }
        } else {
            d14 = 100.0d;
            string2 = null;
        }
        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(string2);
        m3 m3Var = this.f29175x;
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f29159f;
        gCMComplexTwoLineButton4.setOnClickListener(m3Var);
        Context context4 = view2.getContext();
        double d16 = rVar.f29644c;
        if (d16 < 0.0d || d16 > d14) {
            string3 = null;
        } else {
            double d17 = rVar.f29643b;
            if (d17 < 0.0d || d17 > d14) {
                string3 = null;
            } else {
                string3 = context4.getString(R.string.lbl_trimix_mixture, Integer.valueOf((int) d16), Integer.valueOf((int) rVar.f29643b));
            }
        }
        if (string3 == null) {
            string3 = context2.getString(R.string.activity_details_diving_select_one);
        }
        gCMComplexTwoLineButton4.setButtonBottomLeftLabel(string3);
        m3 m3Var2 = this.f29176y;
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f29160g;
        gCMComplexTwoLineButton5.setOnClickListener(m3Var2);
        z1 z1Var = rVar.f29650i;
        int i17 = R.string.lbl_psi;
        if (z1Var == null || rVar.f29649h < 0) {
            gCMComplexTwoLineButton5.setButtonBottomLeftLabel(context2.getString(j.z(l.f68084a) ? R.string.lbl_bar : R.string.lbl_psi));
        } else {
            gCMComplexTwoLineButton5.setButtonBottomLeftLabel(rVar.f29649h + StringUtils.SPACE + context2.getString(y.UNIT_PRESSURE_BAR.equals(z1Var.h()) ? R.string.lbl_bar : R.string.lbl_psi));
        }
        m3 m3Var3 = this.f29177z;
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f29161h;
        gCMComplexTwoLineButton6.setOnClickListener(m3Var3);
        z1 z1Var2 = rVar.f29652k;
        if (z1Var2 == null || rVar.f29651j < 0) {
            if (j.z(l.f68084a)) {
                i17 = R.string.lbl_bar;
            }
            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(context2.getString(i17));
        } else {
            if (y.UNIT_PRESSURE_BAR.equals(z1Var2.h())) {
                i17 = R.string.lbl_bar;
            }
            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(rVar.f29651j + StringUtils.SPACE + context2.getString(i17));
        }
        m3 m3Var4 = this.f29174w;
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = this.f29162i;
        gCMComplexTwoLineButton7.setOnClickListener(m3Var4);
        String str = rVar.f29648g;
        gCMComplexTwoLineButton7.setButtonBottomLeftLabel((str == null || str.isEmpty()) ? context2.getString(R.string.activity_details_diving_select_one) : rVar.f29648g);
        m3 m3Var5 = this.A;
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = this.f29163j;
        gCMComplexTwoLineButton8.setOnClickListener(m3Var5);
        z1 z1Var3 = rVar.f29654m;
        int i18 = R.string.common_abbrev_cubic_feet_string;
        if (z1Var3 != null) {
            if (y.UNIT_VOLUME_LITER.equals(z1Var3.h())) {
                i18 = R.string.common_abbrev_liter_string;
            }
            gCMComplexTwoLineButton8.setButtonBottomLeftLabel(rVar.f29653l + StringUtils.SPACE + context2.getString(i18));
        } else {
            if (j.z(l.f68084a)) {
                i18 = R.string.common_abbrev_liter_string;
            }
            gCMComplexTwoLineButton8.setButtonBottomLeftLabel(context2.getString(i18));
        }
        TextView textView = this.f29166m;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(rVar.f29646e + 1)));
        }
        ImageView imageView = this.f29165l;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        String strB = b();
        if (!Double.isNaN(this.f29167n.f29655n)) {
            strB = String.format(Locale.getDefault(), "%d %s", Integer.valueOf((int) this.f29167n.f29655n), strB);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = this.f29164k;
        gCMComplexTwoLineButton9.setButtonBottomLeftLabel(strB);
        r rVar2 = this.f29167n;
        double d18 = rVar2.f29649h;
        double d19 = rVar2.f29651j;
        if (Double.isNaN(d18) || Double.isNaN(d19) || d18 < 0.0d || d19 < 0.0d) {
            gCMComplexTwoLineButton9.setEnabled(false);
        } else {
            gCMComplexTwoLineButton9.setEnabled(true);
            gCMComplexTwoLineButton9.setOnClickListener(this.B);
        }
    }

    public final String b() {
        z1 z1Var = this.f29167n.f29650i;
        int i14 = R.string.lbl_psi_per_min;
        Context context = this.f29154a;
        if (z1Var == null) {
            return j.z(l.f68084a) ? context.getString(R.string.lbl_bar_per_min) : context.getString(R.string.lbl_psi_per_min);
        }
        if (y.UNIT_PRESSURE_BAR.equals(z1Var.h())) {
            i14 = R.string.lbl_bar_per_min;
        }
        return context.getString(i14);
    }

    public final void c(int i14) {
        TextView textView = this.f29166m;
        if (textView != null) {
            this.f29167n.f29646e = i14 - 1;
            textView.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i14)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        b bVar;
        if (!view2.equals(this.f29165l) || (bVar = this.f29168o) == null) {
            return;
        }
        r rVar = this.f29167n;
        ActivityDiveEditGasesActivity activityDiveEditGasesActivity = (ActivityDiveEditGasesActivity) bVar;
        activityDiveEditGasesActivity.f29127a.setEnabled(false);
        activityDiveEditGasesActivity.f29127a.setAlpha(0.5f);
        activityDiveEditGasesActivity.f29133g.animate().setDuration(500L).translationY(0.0f).setListener(new g(activityDiveEditGasesActivity)).start();
        activityDiveEditGasesActivity.f29134h.removeCallbacks(activityDiveEditGasesActivity.f29135i);
        a aVar = (a) activityDiveEditGasesActivity.f29128b.get(rVar.f29646e - 1);
        aVar.f29155b.setVisibility(8);
        aVar.f29170q = true;
        int i14 = 2;
        int i15 = 0;
        for (a aVar2 : activityDiveEditGasesActivity.f29128b) {
            if (aVar2.f29170q) {
                i15++;
            } else {
                aVar2.c(i14);
                i14++;
            }
        }
        TextView textView = activityDiveEditGasesActivity.f29132f;
        if (i15 == 1) {
            textView.setText(R.string.lbl_one_gas_tank_removed);
        } else {
            textView.setText(activityDiveEditGasesActivity.getString(R.string.lbl_multiple_gas_tanks_removed, NumberFormat.getInstance().format(i15)));
        }
        activityDiveEditGasesActivity.da();
        ActivityDiveEditGasesActivity.a aVar3 = new ActivityDiveEditGasesActivity.a(activityDiveEditGasesActivity, 0);
        activityDiveEditGasesActivity.f29135i = aVar3;
        activityDiveEditGasesActivity.f29134h.postDelayed(aVar3, 5000L);
    }
}
