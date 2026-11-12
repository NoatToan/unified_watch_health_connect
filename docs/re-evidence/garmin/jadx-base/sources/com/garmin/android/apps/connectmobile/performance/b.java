package com.garmin.android.apps.connectmobile.performance;

import a03.d;
import a61.b0;
import a61.c0;
import a61.d0;
import a61.f0;
import a61.g0;
import a61.q;
import a61.y;
import a61.z;
import am.j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.s0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e32.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.m;
import o13.t;
import o71.e;
import o71.f;
import o71.g;
import o71.h;
import o71.i;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import r22.w1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/b;", "Ljava/io/Serializable;", "La61/q;", "fragment", "Landroid/view/View;", "view", "Le32/l;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "navigator", "Lo71/h;", "strengthStatsType", "Lo71/g;", "interval", "Lj23/g;", "Lorg/joda/time/LocalDate;", "dateRange", "Lo71/i;", "viewModel", "Landroidx/lifecycle/s0;", "Lo71/e;", "updateEvent", "<init>", "(La61/q;Landroid/view/View;Le32/l;Lo71/h;Lo71/g;Lj23/g;Lo71/i;Landroidx/lifecycle/s0;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f39852t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t f39853v = m.b(new d(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<com.garmin.android.apps.connectmobile.performance.a> f39855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f39856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f39857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j23.g<LocalDate> f39858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f39859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f39860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f39861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f39862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f39863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f39864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f39865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f39866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f39867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f39868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f39869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f39870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f39871r;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0732b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f39874c;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130201g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130202h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130205k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f130203i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.f130204j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39872a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.REPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.SETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f39873b = iArr2;
            int[] iArr3 = new int[p71.c.values().length];
            try {
                iArr3[p71.c.f136304a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[p71.c.f136305b.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f39874c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f39875a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f39875a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f39875a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39875a.invoke(obj);
        }
    }

    public b(q qVar, View view2, l<com.garmin.android.apps.connectmobile.performance.a> lVar, h hVar, g gVar, j23.g<LocalDate> gVar2, i iVar, s0<e> s0Var) {
        qVar.getClass();
        view2.getClass();
        lVar.getClass();
        hVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        iVar.getClass();
        s0Var.getClass();
        this.f39854a = view2;
        this.f39855b = lVar;
        this.f39856c = hVar;
        this.f39857d = gVar;
        this.f39858e = gVar2;
        this.f39859f = iVar;
        final int i14 = 9;
        this.f39860g = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15;
                int i16;
                h00.b iVar2;
                int i17 = i14;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i17) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i18 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i18 == 1 || i18 == 2 || i18 == 3) {
                            i15 = R.string.common_lbl_daily_totals;
                        } else if (i18 == 4) {
                            i15 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i18 != 5) {
                                u0.r();
                                return null;
                            }
                            i15 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i15);
                    case 13:
                        int i19 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i19 == 1) {
                            i16 = R.string.lbl_last_week;
                        } else if (i19 == 2 || i19 == 3) {
                            i16 = R.string.lbl_last_4_weeks;
                        } else if (i19 == 4) {
                            i16 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i19 != 5) {
                                u0.r();
                                return null;
                            }
                            i16 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i16);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i15 = 0;
        this.f39861h = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16;
                int i17;
                h00.b iVar2;
                int i18 = i15;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i18) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i19 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i19 == 1 || i19 == 2 || i19 == 3) {
                            i16 = R.string.common_lbl_daily_totals;
                        } else if (i19 == 4) {
                            i16 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i19 != 5) {
                                u0.r();
                                return null;
                            }
                            i16 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i16);
                    case 13:
                        int i110 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i110 == 1) {
                            i17 = R.string.lbl_last_week;
                        } else if (i110 == 2 || i110 == 3) {
                            i17 = R.string.lbl_last_4_weeks;
                        } else if (i110 == 4) {
                            i17 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i110 != 5) {
                                u0.r();
                                return null;
                            }
                            i17 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i17);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i16 = 1;
        t tVarB = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17;
                int i18;
                h00.b iVar2;
                int i19 = i16;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i19) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i110 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i110 == 1 || i110 == 2 || i110 == 3) {
                            i17 = R.string.common_lbl_daily_totals;
                        } else if (i110 == 4) {
                            i17 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i110 != 5) {
                                u0.r();
                                return null;
                            }
                            i17 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i17);
                    case 13:
                        int i111 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i111 == 1) {
                            i18 = R.string.lbl_last_week;
                        } else if (i111 == 2 || i111 == 3) {
                            i18 = R.string.lbl_last_4_weeks;
                        } else if (i111 == 4) {
                            i18 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i111 != 5) {
                                u0.r();
                                return null;
                            }
                            i18 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i18);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        this.f39862i = tVarB;
        final int i17 = 2;
        t tVarB2 = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18;
                int i19;
                h00.b iVar2;
                int i110 = i17;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i110) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i111 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i111 == 1 || i111 == 2 || i111 == 3) {
                            i18 = R.string.common_lbl_daily_totals;
                        } else if (i111 == 4) {
                            i18 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i111 != 5) {
                                u0.r();
                                return null;
                            }
                            i18 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i18);
                    case 13:
                        int i112 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i112 == 1) {
                            i19 = R.string.lbl_last_week;
                        } else if (i112 == 2 || i112 == 3) {
                            i19 = R.string.lbl_last_4_weeks;
                        } else if (i112 == 4) {
                            i19 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i112 != 5) {
                                u0.r();
                                return null;
                            }
                            i19 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i19);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i18 = 3;
        this.f39863j = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19;
                int i110;
                h00.b iVar2;
                int i111 = i18;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i111) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i112 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i112 == 1 || i112 == 2 || i112 == 3) {
                            i19 = R.string.common_lbl_daily_totals;
                        } else if (i112 == 4) {
                            i19 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i112 != 5) {
                                u0.r();
                                return null;
                            }
                            i19 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i19);
                    case 13:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1) {
                            i110 = R.string.lbl_last_week;
                        } else if (i113 == 2 || i113 == 3) {
                            i110 = R.string.lbl_last_4_weeks;
                        } else if (i113 == 4) {
                            i110 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i110);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i19 = 4;
        this.f39864k = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i19;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i24 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i24 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i24 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i24 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i24 != 4 && i24 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i24 = 5;
        this.f39865l = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i24;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i25 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i25 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i25 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i25 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i25 != 4 && i25 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i25 = 6;
        this.f39866m = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i25;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i26 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i26 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i26 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i26 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i26 != 4 && i26 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i26 = 7;
        this.f39867n = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i26;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i27 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i27 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i27 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i27 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i27 != 4 && i27 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i27 = 8;
        this.f39868o = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i27;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i28 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i28 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i28 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i28 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i28 != 4 && i28 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i28 = 10;
        t tVarB3 = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i28;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i29 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i29 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i29 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i29 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i29 != 4 && i29 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        this.f39869p = tVarB3;
        final int i29 = 11;
        this.f39870q = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i29;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i210 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i210 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i210 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i210 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i210 != 4 && i210 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i30 = 12;
        t tVarB4 = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i30;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i210 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i210 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i210 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i210 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i210 != 4 && i210 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i34 = 13;
        t tVarB5 = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i34;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i210 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i210 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i210 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i210 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i210 != 4 && i210 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        final int i35 = 14;
        t tVarB6 = m.b(new e23.a(this) { // from class: a61.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1550b;

            {
                this.f1550b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110;
                int i111;
                h00.b iVar2;
                int i112 = i35;
                com.garmin.android.apps.connectmobile.performance.b bVar = this.f1550b;
                switch (i112) {
                    case 0:
                        return bVar.f39854a.findViewById(R.id.category);
                    case 1:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        Object value = bVar.f39861h.getValue();
                        value.getClass();
                        return new k32.l((View) value);
                    case 2:
                        return (TextView) bVar.f39854a.findViewById(R.id.chart_title);
                    case 3:
                        return (CustomLineChart) bVar.f39854a.findViewById(R.id.chart_view);
                    case 4:
                        return bVar.f39854a.findViewById(R.id.totals_container_layout);
                    case 5:
                        return (TextView) bVar.f39854a.findViewById(R.id.totals_label);
                    case 6:
                        return (ComposeView) bVar.f39854a.findViewById(R.id.stats_1);
                    case 7:
                        return (GCMComplexOneLineButton) bVar.f39854a.findViewById(R.id.personal_records_view_button);
                    case 8:
                        return bVar.f39854a.findViewById(R.id.activities_container_layout);
                    case 9:
                        return bVar.f39854a.getContext();
                    case 10:
                        return (RecyclerView) bVar.f39854a.findViewById(R.id.strength_activities);
                    case 11:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        return new sr.m(new l22.a(bVar.g()), new pi0.e(bVar.g()));
                    case 12:
                        int i113 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i113 == 1 || i113 == 2 || i113 == 3) {
                            i110 = R.string.common_lbl_daily_totals;
                        } else if (i113 == 4) {
                            i110 = R.string.common_lbl_weekly_totals;
                        } else {
                            if (i113 != 5) {
                                u0.r();
                                return null;
                            }
                            i110 = R.string.lbl_monthly_totals;
                        }
                        return Integer.valueOf(i110);
                    case 13:
                        int i114 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i114 == 1) {
                            i111 = R.string.lbl_last_week;
                        } else if (i114 == 2 || i114 == 3) {
                            i111 = R.string.lbl_last_4_weeks;
                        } else if (i114 == 4) {
                            i111 = R.string.lbl_last_12_weeks;
                        } else {
                            if (i114 != 5) {
                                u0.r();
                                return null;
                            }
                            i111 = R.string.lbl_last_year;
                        }
                        return Integer.valueOf(i111);
                    default:
                        com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                        CustomLineChart customLineChartE = bVar.e();
                        f61.a aVar4 = new f61.a(bVar.g());
                        CustomLineChart customLineChartE2 = bVar.e();
                        ViewPortHandler viewPortHandler = bVar.e().getViewPortHandler();
                        viewPortHandler.getClass();
                        XAxis xAxis = bVar.e().getXAxis();
                        xAxis.getClass();
                        Transformer transformer = bVar.e().getTransformer(YAxis.AxisDependency.LEFT);
                        transformer.getClass();
                        j23.g<LocalDate> gVar3 = bVar.f39858e;
                        int i210 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                        if (i210 == 1) {
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                        } else if (i210 == 2) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = 28;
                        } else if (i210 == 3) {
                            iVar2 = new h00.c(viewPortHandler, xAxis, transformer);
                            iVar2.f80602f = Days.daysBetween((ReadablePartial) gVar3.getStart(), (ReadablePartial) gVar3.b()).getDays() + 1;
                        } else {
                            if (i210 != 4 && i210 != 5) {
                                u0.r();
                                return null;
                            }
                            iVar2 = new h00.i(viewPortHandler, xAxis, transformer);
                            iVar2.f80604h = 270.0f;
                        }
                        iVar2.f80601e = new h0(iVar2);
                        return new tz.a(customLineChartE, aVar4, new f61.c(customLineChartE2, iVar2), new f61.b(bVar.e()), new k00.g(bVar.e()), null, 32, null);
                }
            }
        });
        this.f39871r = tVarB6;
        ((k32.l) tVarB.getValue()).f(false);
        ((tz.a) tVarB6.getValue()).c();
        f().setText(((Number) tVarB5.getValue()).intValue());
        Object value = tVarB2.getValue();
        value.getClass();
        ((TextView) value).setText(((Number) tVarB4.getValue()).intValue());
        Object value2 = tVarB3.getValue();
        value2.getClass();
        ((RecyclerView) value2).addItemDecoration(new w1(0, 0, g().getResources().getDimensionPixelSize(R.dimen.spacing_small), 3, null));
        f().setOnClickListener(new y(this, 0));
        iVar.f130242d.f(qVar.getViewLifecycleOwner(), new c(new z(this, 0)));
        s0Var.f(qVar.getViewLifecycleOwner(), new c(new z(this, 1)));
    }

    public static int i() {
        return j.z(f12.l.f68084a) ? R.string.lbl_kg : R.string.lbl_lbs;
    }

    public final void a(e eVar) {
        String string;
        boolean z14;
        boolean zBooleanValue;
        int[] iArr = C0732b.f39873b;
        h hVar = this.f39856c;
        int i14 = iArr[hVar.ordinal()];
        if (i14 == 1) {
            string = g().getString(R.string.chart_no_volume_data);
        } else if (i14 == 2) {
            string = g().getString(R.string.chart_no_reps_data);
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            string = g().getString(R.string.chart_no_set_data);
        }
        string.getClass();
        tz.a aVar = (tz.a) this.f39871r.getValue();
        Boolean boolD = this.f39859f.f130242d.d();
        if (boolD != null) {
            zBooleanValue = boolD.booleanValue();
            z14 = true;
        } else {
            z14 = true;
            zBooleanValue = true;
        }
        boolean z15 = z14;
        List<LocalDate> list = eVar.f130176a;
        Map<LocalDate, f.a> mapD = eVar.d(hVar, zBooleanValue);
        Integer numValueOf = hVar == h.VOLUME ? Integer.valueOf(i()) : null;
        Map<LocalDate, e.c> map = eVar.f130181f;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<LocalDate, e.c>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<com.garmin.android.apps.connectmobile.performance.dto.d> list2 = it.next().getValue().f130189d;
            if (list2 != null) {
                arrayList.add(list2);
            }
        }
        qz.a.b(aVar, new f(hVar, list, mapD, numValueOf, this.f39857d, zBooleanValue, (arrayList.isEmpty() || zBooleanValue) ? z15 : false), string, 4);
        YAxis axisLeft = e().getAxisLeft();
        axisLeft.setValueFormatter(axisLeft.getAxisMaximum() >= 4000.0f ? new yz.g() : new yz.e());
    }

    public final void b(e eVar) {
        if (eVar == null) {
            e.f130175g.getClass();
            eVar = new e.a(this.f39857d, this.f39858e).a();
        }
        i iVar = this.f39859f;
        p71.f fVarY4 = iVar.y4();
        h hVar = this.f39856c;
        eVar.a(fVarY4, hVar);
        ((ComposeView) this.f39854a.findViewById(R.id.segmented_control_compose_view)).setContent(new z3.e(-1720245819, true, new b0(this, 0)));
        ((k32.l) this.f39862i.getValue()).b(n71.h.a(g(), iVar.z4().getF136308d()), n71.h.a(g(), iVar.y4().Z1()));
        Object value = this.f39861h.getValue();
        value.getClass();
        ((View) value).setOnClickListener(new d0(2, this, eVar));
        a(eVar);
        Map<LocalDate, f.a> mapD = eVar.d(hVar, true);
        if (!mapD.isEmpty()) {
            Iterator<Map.Entry<LocalDate, f.a>> it = mapD.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getValue().f130197a != null) {
                        if (mapD.isEmpty()) {
                            break;
                        }
                        Iterator<Map.Entry<LocalDate, f.a>> it3 = mapD.entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (it3.next().getValue().f130198b != null) {
                                    f().setVisibility(0);
                                    break;
                                }
                            }
                        }
                    }
                }
                f().setVisibility(8);
                break;
            }
        }
        f().setVisibility(8);
        break;
        boolean z14 = eVar.f130180e;
        t tVar = this.f39864k;
        if (!z14) {
            Object value2 = tVar.getValue();
            value2.getClass();
            ((View) value2).setVisibility(8);
            return;
        }
        Object value3 = tVar.getValue();
        value3.getClass();
        ((View) value3).setVisibility(0);
        if (h(eVar)) {
            Object value4 = this.f39865l.getValue();
            value4.getClass();
            ((TextView) value4).setText(g().getString(hVar.f130230d));
            ComposeView composeView = (ComposeView) this.f39866m.getValue();
            if (composeView != null) {
                composeView.setContent(new z3.e(1681918202, true, new c0(this, eVar, 0)));
            }
        } else {
            Object value5 = tVar.getValue();
            value5.getClass();
            ((View) value5).setVisibility(8);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) this.f39867n.getValue();
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setOnClickListener(new y(this, 1));
        }
        boolean zH = h(eVar);
        t tVar2 = this.f39868o;
        if (!zH) {
            Object value6 = tVar2.getValue();
            value6.getClass();
            ((View) value6).setVisibility(8);
            return;
        }
        Object value7 = tVar2.getValue();
        value7.getClass();
        ((View) value7).setVisibility(0);
        Object value8 = this.f39869p.getValue();
        value8.getClass();
        RecyclerView recyclerView = (RecyclerView) value8;
        recyclerView.setVisibility(0);
        g0 g0Var = g0.f1597a;
        g0Var.getClass();
        f0 f0Var = new f0(this, new n71.a(g0Var));
        List<? extends o71.b> list = eVar.f130179d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            o71.b bVar = (o71.b) obj;
            int i14 = C0732b.f39873b[hVar.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    } else if (bVar.f130160f > 0.0d) {
                        arrayList.add(obj);
                    }
                } else if (bVar.f130159e > 0.0d) {
                    arrayList.add(obj);
                }
            } else if (bVar.f130158d > 0.0d) {
                arrayList.add(obj);
            }
        }
        f0Var.t(arrayList);
        recyclerView.setAdapter(f0Var);
    }

    public final String c(Double d14) {
        if (d14 == null || s.c(d14, 0.0d)) {
            return g().getString(R.string.symbol_double_dash);
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public final String d(Double d14) {
        if (d14 == null || s.c(d14, 0.0d)) {
            return g().getString(R.string.symbol_double_dash);
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public final CustomLineChart e() {
        Object value = this.f39863j.getValue();
        value.getClass();
        return (CustomLineChart) value;
    }

    public final AppCompatButton f() {
        View viewFindViewById = this.f39854a.findViewById(R.id.last_interval_option);
        viewFindViewById.getClass();
        return (AppCompatButton) viewFindViewById;
    }

    public final Context g() {
        Object value = this.f39860g.getValue();
        value.getClass();
        return (Context) value;
    }

    public final boolean h(e eVar) {
        int i14 = C0732b.f39873b[this.f39856c.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return false;
                }
                if (eVar.g() == null) {
                    return false;
                }
            } else if (eVar.f() == null) {
                return false;
            }
        } else if (eVar.h() == null || eVar.c() == null) {
            return false;
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/b$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
