package g40;

import am.x0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.v;
import c22.f1;
import c22.l3;
import c22.q3;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import f12.l;
import i3.e5;
import java.util.Locale;
import oi0.g;
import oi0.h;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import r22.a2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg40/d;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f75763t = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p<? super Double, ? super Double, Unit> f75764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMComplexTwoLineButton f75765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexTwoLineButton f75766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f75767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f75768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f75769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f75770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f75771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f75772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q3 f75773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f75774r;

    public d() {
        super(R.layout.speed_calculator_bottom_sheet_content, true, false, false, 12, null);
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        this.f75772p = zY;
        this.f75773q = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return (this.f75768l == 0.0d || this.f75770n == 0.0d) ? false : true;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        p<? super Double, ? super Double, Unit> pVar = this.f75764h;
        if (pVar != null) {
            pVar.invoke(Double.valueOf(this.f75768l), Double.valueOf(this.f75770n));
        }
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    public final void F6() {
        double d14 = this.f75769m;
        boolean z14 = this.f75772p;
        if (d14 == 0.0d) {
            String string = getString(z14 ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile);
            string.getClass();
            String strConcat = "-- : -- ".concat(string);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f75765i;
            if (gCMComplexTwoLineButton == null) {
                s.m("averageSpeedButton");
                throw null;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            gCMComplexTwoLineButton.b(strConcat, oi0.c.A(contextRequireContext, new g11.e(7), strConcat));
            return;
        }
        l3.a aVar = l3.f23124b;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        double d15 = this.f75769m;
        aVar.getClass();
        String strR0 = aVar.r0(contextRequireContext2, d15, this.f75772p, true, "");
        long jD = MathKt.d(this.f75769m);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        String strD = new h(contextRequireContext3).d(jD, true);
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        String strG = e5.g(strD, StringUtils.SPACE, new g(contextRequireContext4).a(z14));
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f75765i;
        if (gCMComplexTwoLineButton2 != null) {
            gCMComplexTwoLineButton2.b(strR0, strG);
        } else {
            s.m("averageSpeedButton");
            throw null;
        }
    }

    public final void G6() {
        String strM0;
        if (this.f75768l == 0.0d) {
            strM0 = getString(R.string.no_value);
            strM0.getClass();
        } else {
            l3.a aVar = l3.f23124b;
            Context contextRequireContext = requireContext();
            double d14 = this.f75768l;
            aVar.getClass();
            strM0 = l3.a.M0(contextRequireContext, d14, this.f75773q, l3.f23130h, true);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f75765i;
        if (gCMComplexTwoLineButton == null) {
            s.m("averageSpeedButton");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        gCMComplexTwoLineButton.b(strM0, oi0.c.A(contextRequireContext2, new g11.e(8), strM0));
    }

    public final void H6() {
        double d14 = this.f75770n;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f75766j;
        if (d14 == 0.0d) {
            if (gCMComplexTwoLineButton != null) {
                gCMComplexTwoLineButton.b("-- : --", getString(R.string.txt_empty_page_no_data));
                return;
            } else {
                s.m("goalTimeButton");
                throw null;
            }
        }
        if (gCMComplexTwoLineButton == null) {
            s.m("goalTimeButton");
            throw null;
        }
        l3.f23124b.getClass();
        String strE1 = l3.a.e1((long) d14);
        h hVar = this.f75774r;
        if (hVar != null) {
            gCMComplexTwoLineButton.b(strE1, hVar.d((long) this.f75770n, true));
        } else {
            s.m("contentDescriptionTimeFormatter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        i iVar;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments.getSerializable("GCM_extra_course_type", i.class);
            } else {
                Object serializable3 = arguments.getSerializable("GCM_extra_course_type");
                if (!(serializable3 instanceof i)) {
                    serializable3 = null;
                }
                serializable2 = (i) serializable3;
            }
            iVar = (i) serializable2;
        } else {
            iVar = null;
        }
        this.f75767k = iVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments2.getSerializable("GCM_extra_activity_type", x0.class);
            } else {
                Object serializable4 = arguments2.getSerializable("GCM_extra_activity_type");
                serializable = (x0) (serializable4 instanceof x0 ? serializable4 : null);
            }
        }
        Bundle arguments3 = getArguments();
        double d14 = arguments3 != null ? arguments3.getDouble("EXTRA_SPEED", 0.0d) : 0.0d;
        this.f75768l = d14;
        if (Double.isNaN(d14)) {
            this.f75768l = 0.0d;
        }
        Bundle arguments4 = getArguments();
        this.f75770n = arguments4 != null ? arguments4.getDouble("EXTRA_TIME", 0.0d) : 0.0d;
        Bundle arguments5 = getArguments();
        this.f75771o = arguments5 != null ? arguments5.getDouble("EXTRA_DISTANCE", 0.0d) : 0.0d;
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f75774r = new h(contextRequireContext);
        View viewFindViewById = view2.findViewById(R.id.average_speed_button);
        viewFindViewById.getClass();
        this.f75765i = (GCMComplexTwoLineButton) viewFindViewById;
        i iVar = this.f75767k;
        if ((iVar == null || !iVar.d()) && this.f75767k != i.HIKING) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f75765i;
            if (gCMComplexTwoLineButton == null) {
                s.m("averageSpeedButton");
                throw null;
            }
            gCMComplexTwoLineButton.setButtonTopLabel(getString(R.string.lbl_avg_speed));
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f75765i;
            if (gCMComplexTwoLineButton2 == null) {
                s.m("averageSpeedButton");
                throw null;
            }
            gCMComplexTwoLineButton2.setButtonTopLabelContentDescription(getString(R.string.lbl_avg_speed_full));
            G6();
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f75765i;
            if (gCMComplexTwoLineButton3 == null) {
                s.m("averageSpeedButton");
                throw null;
            }
            gCMComplexTwoLineButton3.setButtonTopLabel(getString(R.string.lbl_avg_pace));
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f75765i;
            if (gCMComplexTwoLineButton4 == null) {
                s.m("averageSpeedButton");
                throw null;
            }
            gCMComplexTwoLineButton4.setButtonTopLabelContentDescription(getString(R.string.activities_avg_pace_help_subtitle));
            l3.a aVar = l3.f23124b;
            double d14 = this.f75768l;
            aVar.getClass();
            this.f75769m = l3.a.p(d14, this.f75772p);
            F6();
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f75765i;
        if (gCMComplexTwoLineButton5 == null) {
            s.m("averageSpeedButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexTwoLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: g40.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f75760b;

            {
                this.f75760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                final int i16 = 1;
                final d dVar = this.f75760b;
                switch (i15) {
                    case 0:
                        i iVar2 = dVar.f75767k;
                        boolean z14 = dVar.f75772p;
                        if ((iVar2 != null && iVar2.d()) || dVar.f75767k == i.HIKING) {
                            int i17 = z14 ? 36 : 59;
                            a.C1524a c1524a = a.T0;
                            int i18 = (int) dVar.f75769m;
                            c1524a.getClass();
                            a aVar2 = new a();
                            Bundle bundle = new Bundle();
                            bundle.putInt("EXTRA_VALUE", i18);
                            bundle.putInt("EXTRA_MAX_VALUE", i17);
                            aVar2.setArguments(bundle);
                            final int i19 = 0;
                            aVar2.T = new a2.d() { // from class: g40.c
                                @Override // r22.a2.d
                                public final void i(String str, int i24, int i25, String str2, String str3, int i26) {
                                    switch (i19) {
                                        case 0:
                                            double d15 = (i24 * 60) + i25;
                                            d dVar2 = dVar;
                                            dVar2.f75769m = d15;
                                            l3.a aVar3 = l3.f23124b;
                                            boolean z15 = dVar2.f75772p;
                                            aVar3.getClass();
                                            double dM = l3.a.m(d15, z15);
                                            dVar2.f75768l = dM;
                                            dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                            dVar2.F6();
                                            dVar2.H6();
                                            dVar2.w6();
                                            break;
                                        default:
                                            double d16 = fb1.c.d(i25, 60, i24 * DateTimeConstants.SECONDS_PER_HOUR, i26);
                                            d dVar3 = dVar;
                                            dVar3.f75770n = d16;
                                            dVar3.f75768l = d16 != 0.0d ? dVar3.f75771o / d16 : 0.0d;
                                            i iVar3 = dVar3.f75767k;
                                            if ((iVar3 == null || !iVar3.d()) && dVar3.f75767k != i.HIKING) {
                                                dVar3.G6();
                                            } else {
                                                l3.a aVar4 = l3.f23124b;
                                                double d17 = dVar3.f75768l;
                                                boolean z16 = dVar3.f75772p;
                                                aVar4.getClass();
                                                dVar3.f75769m = l3.a.p(d17, z16);
                                                dVar3.F6();
                                            }
                                            dVar3.H6();
                                            dVar3.w6();
                                            break;
                                    }
                                }
                            };
                            aVar2.show(dVar.getParentFragmentManager(), aVar2.getTag());
                        } else {
                            double d15 = z14 ? 252.0d : 156.6d;
                            f.a aVar3 = f.f75776f;
                            String string = dVar.getString(R.string.lbl_speed);
                            string.getClass();
                            double d16 = dVar.f75768l;
                            aVar3.getClass();
                            Bundle bundle2 = new Bundle(4);
                            f fVar = new f();
                            bundle2.putString("EXTRA_TITLE", string);
                            bundle2.putDouble("EXTRA_SPEED", d16);
                            bundle2.putDouble("EXTRA_MIN_ALLOWED_TYPING_RANGE", 0.0d);
                            bundle2.putDouble("EXTRA_MAX_ALLOWED_TYPING_RANGE", d15);
                            fVar.setArguments(bundle2);
                            fVar.f75778a = new e(dVar);
                            v parentFragmentManager = dVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            fVar.showNow(parentFragmentManager, f.f75777g);
                            String str = fVar.f75782e;
                            Context contextRequireContext2 = fVar.requireContext();
                            contextRequireContext2.getClass();
                            String strA = oi0.c.A(contextRequireContext2, new g11.e(9), str);
                            androidx.appcompat.app.e eVar = fVar.f75781d;
                            if (eVar != null) {
                                oe2.f.g0(eVar, fVar.f75782e, strA);
                            }
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.f75763t;
                        f1.a aVar5 = f1.Y0;
                        int i24 = (int) dVar.f75770n;
                        aVar5.getClass();
                        f1 f1VarA = f1.a.a(aVar5, i24, 23, PsExtractor.VIDEO_STREAM_MASK);
                        f1VarA.T = new a2.d() { // from class: g40.c
                            @Override // r22.a2.d
                            public final void i(String str2, int i25, int i26, String str3, String str4, int i27) {
                                switch (i16) {
                                    case 0:
                                        double d17 = (i25 * 60) + i26;
                                        d dVar2 = dVar;
                                        dVar2.f75769m = d17;
                                        l3.a aVar6 = l3.f23124b;
                                        boolean z15 = dVar2.f75772p;
                                        aVar6.getClass();
                                        double dM = l3.a.m(d17, z15);
                                        dVar2.f75768l = dM;
                                        dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                        dVar2.F6();
                                        dVar2.H6();
                                        dVar2.w6();
                                        break;
                                    default:
                                        double d18 = fb1.c.d(i26, 60, i25 * DateTimeConstants.SECONDS_PER_HOUR, i27);
                                        d dVar3 = dVar;
                                        dVar3.f75770n = d18;
                                        dVar3.f75768l = d18 != 0.0d ? dVar3.f75771o / d18 : 0.0d;
                                        i iVar3 = dVar3.f75767k;
                                        if ((iVar3 == null || !iVar3.d()) && dVar3.f75767k != i.HIKING) {
                                            dVar3.G6();
                                        } else {
                                            l3.a aVar7 = l3.f23124b;
                                            double d19 = dVar3.f75768l;
                                            boolean z16 = dVar3.f75772p;
                                            aVar7.getClass();
                                            dVar3.f75769m = l3.a.p(d19, z16);
                                            dVar3.F6();
                                        }
                                        dVar3.H6();
                                        dVar3.w6();
                                        break;
                                }
                            }
                        };
                        f1VarA.show(dVar.getParentFragmentManager(), f1VarA.getTag());
                        break;
                    default:
                        d.a aVar6 = d.f75763t;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Uri uri = Uri.parse("https://support.garmin.com/" + s1.b(locale) + "/?faq=9aaItduDZd4rzKRriZKTp9");
                        if (uri != null) {
                            g22.e.i(dVar, uri);
                        }
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.goal_time_button);
        viewFindViewById2.getClass();
        this.f75766j = (GCMComplexTwoLineButton) viewFindViewById2;
        H6();
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f75766j;
        if (gCMComplexTwoLineButton6 == null) {
            s.m("goalTimeButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: g40.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f75760b;

            {
                this.f75760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                final int i17 = 1;
                final d dVar = this.f75760b;
                switch (i16) {
                    case 0:
                        i iVar2 = dVar.f75767k;
                        boolean z14 = dVar.f75772p;
                        if ((iVar2 != null && iVar2.d()) || dVar.f75767k == i.HIKING) {
                            int i18 = z14 ? 36 : 59;
                            a.C1524a c1524a = a.T0;
                            int i19 = (int) dVar.f75769m;
                            c1524a.getClass();
                            a aVar2 = new a();
                            Bundle bundle = new Bundle();
                            bundle.putInt("EXTRA_VALUE", i19);
                            bundle.putInt("EXTRA_MAX_VALUE", i18);
                            aVar2.setArguments(bundle);
                            final int i110 = 0;
                            aVar2.T = new a2.d() { // from class: g40.c
                                @Override // r22.a2.d
                                public final void i(String str2, int i25, int i26, String str3, String str4, int i27) {
                                    switch (i110) {
                                        case 0:
                                            double d17 = (i25 * 60) + i26;
                                            d dVar2 = dVar;
                                            dVar2.f75769m = d17;
                                            l3.a aVar6 = l3.f23124b;
                                            boolean z15 = dVar2.f75772p;
                                            aVar6.getClass();
                                            double dM = l3.a.m(d17, z15);
                                            dVar2.f75768l = dM;
                                            dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                            dVar2.F6();
                                            dVar2.H6();
                                            dVar2.w6();
                                            break;
                                        default:
                                            double d18 = fb1.c.d(i26, 60, i25 * DateTimeConstants.SECONDS_PER_HOUR, i27);
                                            d dVar3 = dVar;
                                            dVar3.f75770n = d18;
                                            dVar3.f75768l = d18 != 0.0d ? dVar3.f75771o / d18 : 0.0d;
                                            i iVar3 = dVar3.f75767k;
                                            if ((iVar3 == null || !iVar3.d()) && dVar3.f75767k != i.HIKING) {
                                                dVar3.G6();
                                            } else {
                                                l3.a aVar7 = l3.f23124b;
                                                double d19 = dVar3.f75768l;
                                                boolean z16 = dVar3.f75772p;
                                                aVar7.getClass();
                                                dVar3.f75769m = l3.a.p(d19, z16);
                                                dVar3.F6();
                                            }
                                            dVar3.H6();
                                            dVar3.w6();
                                            break;
                                    }
                                }
                            };
                            aVar2.show(dVar.getParentFragmentManager(), aVar2.getTag());
                        } else {
                            double d15 = z14 ? 252.0d : 156.6d;
                            f.a aVar3 = f.f75776f;
                            String string = dVar.getString(R.string.lbl_speed);
                            string.getClass();
                            double d16 = dVar.f75768l;
                            aVar3.getClass();
                            Bundle bundle2 = new Bundle(4);
                            f fVar = new f();
                            bundle2.putString("EXTRA_TITLE", string);
                            bundle2.putDouble("EXTRA_SPEED", d16);
                            bundle2.putDouble("EXTRA_MIN_ALLOWED_TYPING_RANGE", 0.0d);
                            bundle2.putDouble("EXTRA_MAX_ALLOWED_TYPING_RANGE", d15);
                            fVar.setArguments(bundle2);
                            fVar.f75778a = new e(dVar);
                            v parentFragmentManager = dVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            fVar.showNow(parentFragmentManager, f.f75777g);
                            String str = fVar.f75782e;
                            Context contextRequireContext2 = fVar.requireContext();
                            contextRequireContext2.getClass();
                            String strA = oi0.c.A(contextRequireContext2, new g11.e(9), str);
                            androidx.appcompat.app.e eVar = fVar.f75781d;
                            if (eVar != null) {
                                oe2.f.g0(eVar, fVar.f75782e, strA);
                            }
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.f75763t;
                        f1.a aVar5 = f1.Y0;
                        int i24 = (int) dVar.f75770n;
                        aVar5.getClass();
                        f1 f1VarA = f1.a.a(aVar5, i24, 23, PsExtractor.VIDEO_STREAM_MASK);
                        f1VarA.T = new a2.d() { // from class: g40.c
                            @Override // r22.a2.d
                            public final void i(String str2, int i25, int i26, String str3, String str4, int i27) {
                                switch (i17) {
                                    case 0:
                                        double d17 = (i25 * 60) + i26;
                                        d dVar2 = dVar;
                                        dVar2.f75769m = d17;
                                        l3.a aVar6 = l3.f23124b;
                                        boolean z15 = dVar2.f75772p;
                                        aVar6.getClass();
                                        double dM = l3.a.m(d17, z15);
                                        dVar2.f75768l = dM;
                                        dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                        dVar2.F6();
                                        dVar2.H6();
                                        dVar2.w6();
                                        break;
                                    default:
                                        double d18 = fb1.c.d(i26, 60, i25 * DateTimeConstants.SECONDS_PER_HOUR, i27);
                                        d dVar3 = dVar;
                                        dVar3.f75770n = d18;
                                        dVar3.f75768l = d18 != 0.0d ? dVar3.f75771o / d18 : 0.0d;
                                        i iVar3 = dVar3.f75767k;
                                        if ((iVar3 == null || !iVar3.d()) && dVar3.f75767k != i.HIKING) {
                                            dVar3.G6();
                                        } else {
                                            l3.a aVar7 = l3.f23124b;
                                            double d19 = dVar3.f75768l;
                                            boolean z16 = dVar3.f75772p;
                                            aVar7.getClass();
                                            dVar3.f75769m = l3.a.p(d19, z16);
                                            dVar3.F6();
                                        }
                                        dVar3.H6();
                                        dVar3.w6();
                                        break;
                                }
                            }
                        };
                        f1VarA.show(dVar.getParentFragmentManager(), f1VarA.getTag());
                        break;
                    default:
                        d.a aVar6 = d.f75763t;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Uri uri = Uri.parse("https://support.garmin.com/" + s1.b(locale) + "/?faq=9aaItduDZd4rzKRriZKTp9");
                        if (uri != null) {
                            g22.e.i(dVar, uri);
                        }
                        break;
                }
            }
        });
        TextView textView = (TextView) view2.findViewById(R.id.virtual_partner_help_msg);
        i iVar2 = this.f75767k;
        textView.setText(((iVar2 == null || !iVar2.d()) && this.f75767k != i.HIKING) ? getString(R.string.speed_calculator_description) : getString(R.string.pace_calculator_description));
        final int i16 = 2;
        view2.findViewById(R.id.virtual_partner_help_button).setOnClickListener(new View.OnClickListener(this) { // from class: g40.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f75760b;

            {
                this.f75760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                final int i18 = 1;
                final d dVar = this.f75760b;
                switch (i17) {
                    case 0:
                        i iVar3 = dVar.f75767k;
                        boolean z14 = dVar.f75772p;
                        if ((iVar3 != null && iVar3.d()) || dVar.f75767k == i.HIKING) {
                            int i19 = z14 ? 36 : 59;
                            a.C1524a c1524a = a.T0;
                            int i110 = (int) dVar.f75769m;
                            c1524a.getClass();
                            a aVar2 = new a();
                            Bundle bundle = new Bundle();
                            bundle.putInt("EXTRA_VALUE", i110);
                            bundle.putInt("EXTRA_MAX_VALUE", i19);
                            aVar2.setArguments(bundle);
                            final int i111 = 0;
                            aVar2.T = new a2.d() { // from class: g40.c
                                @Override // r22.a2.d
                                public final void i(String str2, int i25, int i26, String str3, String str4, int i27) {
                                    switch (i111) {
                                        case 0:
                                            double d17 = (i25 * 60) + i26;
                                            d dVar2 = dVar;
                                            dVar2.f75769m = d17;
                                            l3.a aVar6 = l3.f23124b;
                                            boolean z15 = dVar2.f75772p;
                                            aVar6.getClass();
                                            double dM = l3.a.m(d17, z15);
                                            dVar2.f75768l = dM;
                                            dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                            dVar2.F6();
                                            dVar2.H6();
                                            dVar2.w6();
                                            break;
                                        default:
                                            double d18 = fb1.c.d(i26, 60, i25 * DateTimeConstants.SECONDS_PER_HOUR, i27);
                                            d dVar3 = dVar;
                                            dVar3.f75770n = d18;
                                            dVar3.f75768l = d18 != 0.0d ? dVar3.f75771o / d18 : 0.0d;
                                            i iVar4 = dVar3.f75767k;
                                            if ((iVar4 == null || !iVar4.d()) && dVar3.f75767k != i.HIKING) {
                                                dVar3.G6();
                                            } else {
                                                l3.a aVar7 = l3.f23124b;
                                                double d19 = dVar3.f75768l;
                                                boolean z16 = dVar3.f75772p;
                                                aVar7.getClass();
                                                dVar3.f75769m = l3.a.p(d19, z16);
                                                dVar3.F6();
                                            }
                                            dVar3.H6();
                                            dVar3.w6();
                                            break;
                                    }
                                }
                            };
                            aVar2.show(dVar.getParentFragmentManager(), aVar2.getTag());
                        } else {
                            double d15 = z14 ? 252.0d : 156.6d;
                            f.a aVar3 = f.f75776f;
                            String string = dVar.getString(R.string.lbl_speed);
                            string.getClass();
                            double d16 = dVar.f75768l;
                            aVar3.getClass();
                            Bundle bundle2 = new Bundle(4);
                            f fVar = new f();
                            bundle2.putString("EXTRA_TITLE", string);
                            bundle2.putDouble("EXTRA_SPEED", d16);
                            bundle2.putDouble("EXTRA_MIN_ALLOWED_TYPING_RANGE", 0.0d);
                            bundle2.putDouble("EXTRA_MAX_ALLOWED_TYPING_RANGE", d15);
                            fVar.setArguments(bundle2);
                            fVar.f75778a = new e(dVar);
                            v parentFragmentManager = dVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            fVar.showNow(parentFragmentManager, f.f75777g);
                            String str = fVar.f75782e;
                            Context contextRequireContext2 = fVar.requireContext();
                            contextRequireContext2.getClass();
                            String strA = oi0.c.A(contextRequireContext2, new g11.e(9), str);
                            androidx.appcompat.app.e eVar = fVar.f75781d;
                            if (eVar != null) {
                                oe2.f.g0(eVar, fVar.f75782e, strA);
                            }
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.f75763t;
                        f1.a aVar5 = f1.Y0;
                        int i24 = (int) dVar.f75770n;
                        aVar5.getClass();
                        f1 f1VarA = f1.a.a(aVar5, i24, 23, PsExtractor.VIDEO_STREAM_MASK);
                        f1VarA.T = new a2.d() { // from class: g40.c
                            @Override // r22.a2.d
                            public final void i(String str2, int i25, int i26, String str3, String str4, int i27) {
                                switch (i18) {
                                    case 0:
                                        double d17 = (i25 * 60) + i26;
                                        d dVar2 = dVar;
                                        dVar2.f75769m = d17;
                                        l3.a aVar6 = l3.f23124b;
                                        boolean z15 = dVar2.f75772p;
                                        aVar6.getClass();
                                        double dM = l3.a.m(d17, z15);
                                        dVar2.f75768l = dM;
                                        dVar2.f75770n = dM != 0.0d ? dVar2.f75771o / dM : 0.0d;
                                        dVar2.F6();
                                        dVar2.H6();
                                        dVar2.w6();
                                        break;
                                    default:
                                        double d18 = fb1.c.d(i26, 60, i25 * DateTimeConstants.SECONDS_PER_HOUR, i27);
                                        d dVar3 = dVar;
                                        dVar3.f75770n = d18;
                                        dVar3.f75768l = d18 != 0.0d ? dVar3.f75771o / d18 : 0.0d;
                                        i iVar4 = dVar3.f75767k;
                                        if ((iVar4 == null || !iVar4.d()) && dVar3.f75767k != i.HIKING) {
                                            dVar3.G6();
                                        } else {
                                            l3.a aVar7 = l3.f23124b;
                                            double d19 = dVar3.f75768l;
                                            boolean z16 = dVar3.f75772p;
                                            aVar7.getClass();
                                            dVar3.f75769m = l3.a.p(d19, z16);
                                            dVar3.F6();
                                        }
                                        dVar3.H6();
                                        dVar3.w6();
                                        break;
                                }
                            }
                        };
                        f1VarA.show(dVar.getParentFragmentManager(), f1VarA.getTag());
                        break;
                    default:
                        d.a aVar6 = d.f75763t;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Uri uri = Uri.parse("https://support.garmin.com/" + s1.b(locale) + "/?faq=9aaItduDZd4rzKRriZKTp9");
                        if (uri != null) {
                            g22.e.i(dVar, uri);
                        }
                        break;
                }
            }
        });
        w6();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_done);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        i iVar = this.f75767k;
        if ((iVar == null || !iVar.d()) && this.f75767k != i.HIKING) {
            String string = getString(R.string.lbl_speed_calculator);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.lbl_pace_calculator);
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lg40/d$a;", "", "<init>", "()V", "", "EXTRA_DISTANCE", "Ljava/lang/String;", "", "MAX_STATUTE_AVG_SPEED", "D", "", "MAX_STATUTE_AVG_PACE", "I", "MAX_METRIC_AVG_SPEED", "MAX_METRIC_AVG_PACE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(i iVar, x0 x0Var, Double d14, Double d15, Double d16) {
            iVar.getClass();
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putSerializable("GCM_extra_course_type", iVar);
            bundle.putSerializable("GCM_extra_activity_type", x0Var);
            bundle.putDouble("EXTRA_SPEED", d14.doubleValue());
            if (d15 != null) {
                bundle.putDouble("EXTRA_TIME", d15.doubleValue());
            }
            bundle.putDouble("EXTRA_DISTANCE", d16.doubleValue());
            dVar.setArguments(bundle);
            return dVar;
        }

        private a() {
        }
    }
}
