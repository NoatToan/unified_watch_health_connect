package dz1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c22.j0;
import c62.n1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import lc.u0;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldz1/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f61669w = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f61670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f61671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexButton f61672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexButton f61673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexButton f61674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexButton f61675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexButton f61676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f61677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f61678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f61679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f61680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f61681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f61682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f61683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f61684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f61685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f61686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DateTime f61687r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DateTime f61688t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1308c f61689v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61690a;

        static {
            int[] iArr = new int[ny1.f.values().length];
            try {
                iArr[ny1.f.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ny1.f.SEVENDAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ny1.f.THREEMONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ny1.f.SIXMONTHS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ny1.f.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61690a = iArr;
        }
    }

    /* JADX INFO: renamed from: dz1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dz1/c$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1308c extends s {
        public C1308c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            c cVar = c.this;
            cVar.f61689v.f(false);
            cVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f61692a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f61692a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f61692a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61692a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f61693a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f61693a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f61694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f61695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f61694a = aVar;
            this.f61695b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f61694a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f61695b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f61696a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f61696a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.ti_find_event_filter_date_fragment);
        this.f61671b = new w1(s0.f105811a.b(cz1.a.class), new e(this), new g(this), new f(null, this));
        this.f61683n = "";
        this.f61684o = "";
        this.f61685p = "MMM d, yyyy";
        this.f61686q = "MMM d, yyyy";
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f61687r = dateTimeNow;
        this.f61688t = DateTime.now().plusYears(1);
        this.f61689v = new C1308c();
    }

    public static DateTime v6(String str) {
        try {
            return g22.k.p(str, "MM/dd/yy", null);
        } catch (Throwable unused) {
            String strM = am.j.m("Error parsing date string ", str, " with format MM/dd/yy");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "TIFindEventFilterDateFragment", strM);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f61670a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        w6().j5(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String str;
        DateTime dateTime;
        DateTime dateTime2;
        String str2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f61670a;
        if (aVar != null) {
            String string = getString(R.string.search_filter_dates);
            string.getClass();
            aVar.g(2, string);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f61689v, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.all_button);
        ((GCMComplexButton) viewFindViewById).a(false);
        viewFindViewById.getClass();
        this.f61672c = (GCMComplexButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.week_button);
        ((GCMComplexButton) viewFindViewById2).a(false);
        viewFindViewById2.getClass();
        this.f61673d = (GCMComplexButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.three_months_button);
        ((GCMComplexButton) viewFindViewById3).a(false);
        viewFindViewById3.getClass();
        this.f61674e = (GCMComplexButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.six_months_button);
        ((GCMComplexButton) viewFindViewById4).a(false);
        viewFindViewById4.getClass();
        this.f61675f = (GCMComplexButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.custom_button);
        ((GCMComplexButton) viewFindViewById5).a(false);
        viewFindViewById5.getClass();
        this.f61676g = (GCMComplexButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.custom_view);
        viewFindViewById6.getClass();
        this.f61677h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.beginning_date);
        viewFindViewById7.getClass();
        this.f61678i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.ending_date);
        viewFindViewById8.getClass();
        this.f61679j = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.date_range_view);
        viewFindViewById9.getClass();
        this.f61680k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.text_view_beginning_date);
        viewFindViewById10.getClass();
        this.f61681l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.text_view_ending_date);
        viewFindViewById11.getClass();
        this.f61682m = (TextView) viewFindViewById11;
        GCMComplexButton gCMComplexButton = this.f61673d;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("weekButton");
            throw null;
        }
        gCMComplexButton.setButtonTopLabel(getString(R.string.date_filter_next_number_of_days, "7"));
        GCMComplexButton gCMComplexButton2 = this.f61674e;
        if (gCMComplexButton2 == null) {
            p005kotlin.jvm.internal.s.m("threeMonthsButton");
            throw null;
        }
        gCMComplexButton2.setButtonTopLabel(getString(R.string.date_filter_next_number_of_months, "3"));
        GCMComplexButton gCMComplexButton3 = this.f61675f;
        if (gCMComplexButton3 == null) {
            p005kotlin.jvm.internal.s.m("sixMonthsButton");
            throw null;
        }
        gCMComplexButton3.setButtonTopLabel(getString(R.string.date_filter_next_number_of_months, "6"));
        GCMComplexButton gCMComplexButton4 = this.f61672c;
        if (gCMComplexButton4 == null) {
            p005kotlin.jvm.internal.s.m("allButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexButton4.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                c cVar = this.f61666b;
                switch (i15) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton5 = this.f61673d;
        if (gCMComplexButton5 == null) {
            p005kotlin.jvm.internal.s.m("weekButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexButton5.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                c cVar = this.f61666b;
                switch (i16) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton6 = this.f61674e;
        if (gCMComplexButton6 == null) {
            p005kotlin.jvm.internal.s.m("threeMonthsButton");
            throw null;
        }
        final int i16 = 2;
        gCMComplexButton6.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                c cVar = this.f61666b;
                switch (i17) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton7 = this.f61675f;
        if (gCMComplexButton7 == null) {
            p005kotlin.jvm.internal.s.m("sixMonthsButton");
            throw null;
        }
        final int i17 = 3;
        gCMComplexButton7.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                c cVar = this.f61666b;
                switch (i18) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        GCMComplexButton gCMComplexButton8 = this.f61676g;
        if (gCMComplexButton8 == null) {
            p005kotlin.jvm.internal.s.m("customButton");
            throw null;
        }
        final int i18 = 4;
        gCMComplexButton8.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                c cVar = this.f61666b;
                switch (i19) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        LinearLayout linearLayout = this.f61678i;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("beginningDate");
            throw null;
        }
        final int i19 = 5;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                c cVar = this.f61666b;
                switch (i110) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = this.f61679j;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("endingDate");
            throw null;
        }
        final int i24 = 6;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61666b;

            {
                this.f61666b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                c cVar = this.f61666b;
                switch (i110) {
                    case 0:
                        c.a aVar2 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.ALL);
                        break;
                    case 1:
                        c.a aVar3 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SEVENDAYS);
                        break;
                    case 2:
                        c.a aVar4 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.THREEMONTHS);
                        break;
                    case 3:
                        c.a aVar5 = c.f61669w;
                        cVar.w6().Y4().j(ny1.f.SIXMONTHS);
                        break;
                    case 4:
                        c.a aVar6 = c.f61669w;
                        ny1.f fVar = ny1.f.CUSTOM;
                        cVar.y6(fVar);
                        cVar.w6().Y4().j(fVar);
                        break;
                    case 5:
                        DateTime dateTimeV6 = c.v6(cVar.f61683n);
                        if (dateTimeV6 == null) {
                            dateTimeV6 = DateTime.now();
                        }
                        dateTimeV6.getClass();
                        cVar.u6(dateTimeV6, true);
                        break;
                    default:
                        DateTime dateTimeV7 = c.v6(cVar.f61684o);
                        if (dateTimeV7 == null) {
                            dateTimeV7 = DateTime.now();
                        }
                        dateTimeV7.getClass();
                        cVar.u6(dateTimeV7, false);
                        break;
                }
            }
        });
        if (w6().f204395l) {
            GCMComplexButton gCMComplexButton9 = this.f61672c;
            if (gCMComplexButton9 == null) {
                p005kotlin.jvm.internal.s.m("allButton");
                throw null;
            }
            gCMComplexButton9.setVisibility(8);
            GCMComplexButton gCMComplexButton10 = this.f61673d;
            if (gCMComplexButton10 == null) {
                p005kotlin.jvm.internal.s.m("weekButton");
                throw null;
            }
            gCMComplexButton10.setVisibility(8);
            GCMComplexButton gCMComplexButton11 = this.f61674e;
            if (gCMComplexButton11 == null) {
                p005kotlin.jvm.internal.s.m("threeMonthsButton");
                throw null;
            }
            gCMComplexButton11.setVisibility(8);
            GCMComplexButton gCMComplexButton12 = this.f61675f;
            if (gCMComplexButton12 == null) {
                p005kotlin.jvm.internal.s.m("sixMonthsButton");
                throw null;
            }
            gCMComplexButton12.setVisibility(8);
            GCMComplexButton gCMComplexButton13 = this.f61676g;
            if (gCMComplexButton13 == null) {
                p005kotlin.jvm.internal.s.m("customButton");
                throw null;
            }
            gCMComplexButton13.setVisibility(8);
            LinearLayout linearLayout3 = this.f61677h;
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("customView");
                throw null;
            }
            linearLayout3.setVisibility(0);
        }
        my1.d dVar = (my1.d) w6().L0.d();
        String str3 = "";
        if (dVar == null || (str = dVar.f121484a) == null) {
            str = "";
        }
        this.f61683n = str;
        my1.d dVar2 = (my1.d) w6().L0.d();
        if (dVar2 != null && (str2 = dVar2.f121485b) != null) {
            str3 = str2;
        }
        this.f61684o = str3;
        my1.d dVar3 = (my1.d) w6().L0.d();
        fg0.u uVar = dVar3 != null ? dVar3.f121503v : null;
        if (uVar != null && (dateTime2 = uVar.f71352d) != null) {
            this.f61687r = dateTime2;
        }
        if (uVar != null && (dateTime = uVar.f71353e) != null) {
            this.f61688t = dateTime;
        }
        final int i25 = 0;
        w6().J0.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: dz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61668b;

            {
                this.f61668b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws ParseException {
                int i26 = i25;
                c cVar = this.f61668b;
                switch (i26) {
                    case 0:
                        ny1.f fVar = (ny1.f) obj;
                        if (fVar != null) {
                            GCMComplexButton gCMComplexButton14 = cVar.f61672c;
                            if (gCMComplexButton14 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexButton14.a(false);
                            GCMComplexButton gCMComplexButton15 = cVar.f61673d;
                            if (gCMComplexButton15 == null) {
                                p005kotlin.jvm.internal.s.m("weekButton");
                                throw null;
                            }
                            gCMComplexButton15.a(false);
                            GCMComplexButton gCMComplexButton16 = cVar.f61674e;
                            if (gCMComplexButton16 == null) {
                                p005kotlin.jvm.internal.s.m("threeMonthsButton");
                                throw null;
                            }
                            gCMComplexButton16.a(false);
                            GCMComplexButton gCMComplexButton17 = cVar.f61675f;
                            if (gCMComplexButton17 == null) {
                                p005kotlin.jvm.internal.s.m("sixMonthsButton");
                                throw null;
                            }
                            gCMComplexButton17.a(false);
                            GCMComplexButton gCMComplexButton18 = cVar.f61676g;
                            if (gCMComplexButton18 == null) {
                                p005kotlin.jvm.internal.s.m("customButton");
                                throw null;
                            }
                            gCMComplexButton18.a(false);
                            LinearLayout linearLayout4 = cVar.f61677h;
                            if (linearLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("customView");
                                throw null;
                            }
                            linearLayout4.setVisibility(8);
                            int i27 = c.b.f61690a[fVar.ordinal()];
                            if (i27 == 1) {
                                GCMComplexButton gCMComplexButton19 = cVar.f61672c;
                                if (gCMComplexButton19 == null) {
                                    p005kotlin.jvm.internal.s.m("allButton");
                                    throw null;
                                }
                                gCMComplexButton19.a(true);
                                cVar.y6(fVar);
                            } else if (i27 == 2) {
                                GCMComplexButton gCMComplexButton20 = cVar.f61673d;
                                if (gCMComplexButton20 == null) {
                                    p005kotlin.jvm.internal.s.m("weekButton");
                                    throw null;
                                }
                                gCMComplexButton20.a(true);
                                cVar.y6(fVar);
                            } else if (i27 == 3) {
                                GCMComplexButton gCMComplexButton21 = cVar.f61674e;
                                if (gCMComplexButton21 == null) {
                                    p005kotlin.jvm.internal.s.m("threeMonthsButton");
                                    throw null;
                                }
                                gCMComplexButton21.a(true);
                                cVar.y6(fVar);
                            } else if (i27 == 4) {
                                GCMComplexButton gCMComplexButton22 = cVar.f61675f;
                                if (gCMComplexButton22 == null) {
                                    p005kotlin.jvm.internal.s.m("sixMonthsButton");
                                    throw null;
                                }
                                gCMComplexButton22.a(true);
                                cVar.y6(fVar);
                            } else {
                                if (i27 != 5) {
                                    u0.r();
                                    return null;
                                }
                                GCMComplexButton gCMComplexButton23 = cVar.f61676g;
                                if (gCMComplexButton23 == null) {
                                    p005kotlin.jvm.internal.s.m("customButton");
                                    throw null;
                                }
                                gCMComplexButton23.a(true);
                                LinearLayout linearLayout5 = cVar.f61677h;
                                if (linearLayout5 == null) {
                                    p005kotlin.jvm.internal.s.m("customView");
                                    throw null;
                                }
                                linearLayout5.setVisibility(0);
                                TextView textView = cVar.f61681l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("textViewBeginningDate");
                                    throw null;
                                }
                                textView.setText(cVar.f61683n);
                                TextView textView2 = cVar.f61682m;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("textViewEndingDate");
                                    throw null;
                                }
                                textView2.setText(cVar.f61684o);
                            }
                        } else {
                            c.a aVar2 = c.f61669w;
                        }
                        return Unit.INSTANCE;
                    default:
                        my1.d dVar4 = (my1.d) obj;
                        c.a aVar3 = c.f61669w;
                        if (dVar4 != null) {
                            String str4 = dVar4.f121484a;
                            String strB = "";
                            if (str4 == null) {
                                str4 = "";
                            }
                            cVar.f61683n = str4;
                            String str5 = dVar4.f121485b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            cVar.f61684o = str5;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy", Locale.getDefault());
                            Date date = simpleDateFormat.parse(dVar4.f121484a);
                            Date date2 = simpleDateFormat.parse(dVar4.f121485b);
                            Calendar calendar = Calendar.getInstance();
                            if (date != null) {
                                calendar.setTime(date);
                            }
                            Calendar calendar2 = Calendar.getInstance();
                            if (date2 != null) {
                                calendar2.setTime(date2);
                            }
                            int i28 = Calendar.getInstance().get(1);
                            int i29 = calendar.get(1);
                            int i30 = calendar2.get(1);
                            String str6 = (i29 < i30 || (i29 > i28 && i29 == i30)) ? "MMM d, yyyy" : "MMM d";
                            cVar.f61685p = str6;
                            cVar.f61686q = i30 <= i28 ? "MMM d" : "MMM d, yyyy";
                            j0 j0Var = j0.f23099a;
                            String str7 = dVar4.f121484a;
                            j0Var.getClass();
                            String strD = j0.d(str7, str6);
                            String strD2 = j0.d(dVar4.f121485b, cVar.f61686q);
                            cz1.a aVarW6 = cVar.w6();
                            String str8 = cVar.f61683n;
                            str8.getClass();
                            ((y0) aVarW6.f56874k0.getValue()).j(str8);
                            cz1.a aVarW7 = cVar.w6();
                            String str9 = cVar.f61684o;
                            str9.getClass();
                            ((y0) aVarW7.H0.getValue()).j(str9);
                            gg0.f fVar2 = dVar4.f121487d;
                            if (fVar2 != null) {
                                Context contextRequireContext = cVar.requireContext();
                                contextRequireContext.getClass();
                                strB = fVar2.b(contextRequireContext);
                            }
                            TextView textView3 = cVar.f61680k;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("dateRangeView");
                                throw null;
                            }
                            textView3.setText(cVar.getString(R.string.find_events_between_date_range, strB, strD, strD2));
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i26 = 1;
        w6().L0.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: dz1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f61668b;

            {
                this.f61668b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) throws ParseException {
                int i27 = i26;
                c cVar = this.f61668b;
                switch (i27) {
                    case 0:
                        ny1.f fVar = (ny1.f) obj;
                        if (fVar != null) {
                            GCMComplexButton gCMComplexButton14 = cVar.f61672c;
                            if (gCMComplexButton14 == null) {
                                p005kotlin.jvm.internal.s.m("allButton");
                                throw null;
                            }
                            gCMComplexButton14.a(false);
                            GCMComplexButton gCMComplexButton15 = cVar.f61673d;
                            if (gCMComplexButton15 == null) {
                                p005kotlin.jvm.internal.s.m("weekButton");
                                throw null;
                            }
                            gCMComplexButton15.a(false);
                            GCMComplexButton gCMComplexButton16 = cVar.f61674e;
                            if (gCMComplexButton16 == null) {
                                p005kotlin.jvm.internal.s.m("threeMonthsButton");
                                throw null;
                            }
                            gCMComplexButton16.a(false);
                            GCMComplexButton gCMComplexButton17 = cVar.f61675f;
                            if (gCMComplexButton17 == null) {
                                p005kotlin.jvm.internal.s.m("sixMonthsButton");
                                throw null;
                            }
                            gCMComplexButton17.a(false);
                            GCMComplexButton gCMComplexButton18 = cVar.f61676g;
                            if (gCMComplexButton18 == null) {
                                p005kotlin.jvm.internal.s.m("customButton");
                                throw null;
                            }
                            gCMComplexButton18.a(false);
                            LinearLayout linearLayout4 = cVar.f61677h;
                            if (linearLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("customView");
                                throw null;
                            }
                            linearLayout4.setVisibility(8);
                            int i28 = c.b.f61690a[fVar.ordinal()];
                            if (i28 == 1) {
                                GCMComplexButton gCMComplexButton19 = cVar.f61672c;
                                if (gCMComplexButton19 == null) {
                                    p005kotlin.jvm.internal.s.m("allButton");
                                    throw null;
                                }
                                gCMComplexButton19.a(true);
                                cVar.y6(fVar);
                            } else if (i28 == 2) {
                                GCMComplexButton gCMComplexButton20 = cVar.f61673d;
                                if (gCMComplexButton20 == null) {
                                    p005kotlin.jvm.internal.s.m("weekButton");
                                    throw null;
                                }
                                gCMComplexButton20.a(true);
                                cVar.y6(fVar);
                            } else if (i28 == 3) {
                                GCMComplexButton gCMComplexButton21 = cVar.f61674e;
                                if (gCMComplexButton21 == null) {
                                    p005kotlin.jvm.internal.s.m("threeMonthsButton");
                                    throw null;
                                }
                                gCMComplexButton21.a(true);
                                cVar.y6(fVar);
                            } else if (i28 == 4) {
                                GCMComplexButton gCMComplexButton22 = cVar.f61675f;
                                if (gCMComplexButton22 == null) {
                                    p005kotlin.jvm.internal.s.m("sixMonthsButton");
                                    throw null;
                                }
                                gCMComplexButton22.a(true);
                                cVar.y6(fVar);
                            } else {
                                if (i28 != 5) {
                                    u0.r();
                                    return null;
                                }
                                GCMComplexButton gCMComplexButton23 = cVar.f61676g;
                                if (gCMComplexButton23 == null) {
                                    p005kotlin.jvm.internal.s.m("customButton");
                                    throw null;
                                }
                                gCMComplexButton23.a(true);
                                LinearLayout linearLayout5 = cVar.f61677h;
                                if (linearLayout5 == null) {
                                    p005kotlin.jvm.internal.s.m("customView");
                                    throw null;
                                }
                                linearLayout5.setVisibility(0);
                                TextView textView = cVar.f61681l;
                                if (textView == null) {
                                    p005kotlin.jvm.internal.s.m("textViewBeginningDate");
                                    throw null;
                                }
                                textView.setText(cVar.f61683n);
                                TextView textView2 = cVar.f61682m;
                                if (textView2 == null) {
                                    p005kotlin.jvm.internal.s.m("textViewEndingDate");
                                    throw null;
                                }
                                textView2.setText(cVar.f61684o);
                            }
                        } else {
                            c.a aVar2 = c.f61669w;
                        }
                        return Unit.INSTANCE;
                    default:
                        my1.d dVar4 = (my1.d) obj;
                        c.a aVar3 = c.f61669w;
                        if (dVar4 != null) {
                            String str4 = dVar4.f121484a;
                            String strB = "";
                            if (str4 == null) {
                                str4 = "";
                            }
                            cVar.f61683n = str4;
                            String str5 = dVar4.f121485b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            cVar.f61684o = str5;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy", Locale.getDefault());
                            Date date = simpleDateFormat.parse(dVar4.f121484a);
                            Date date2 = simpleDateFormat.parse(dVar4.f121485b);
                            Calendar calendar = Calendar.getInstance();
                            if (date != null) {
                                calendar.setTime(date);
                            }
                            Calendar calendar2 = Calendar.getInstance();
                            if (date2 != null) {
                                calendar2.setTime(date2);
                            }
                            int i29 = Calendar.getInstance().get(1);
                            int i210 = calendar.get(1);
                            int i30 = calendar2.get(1);
                            String str6 = (i210 < i30 || (i210 > i29 && i210 == i30)) ? "MMM d, yyyy" : "MMM d";
                            cVar.f61685p = str6;
                            cVar.f61686q = i30 <= i29 ? "MMM d" : "MMM d, yyyy";
                            j0 j0Var = j0.f23099a;
                            String str7 = dVar4.f121484a;
                            j0Var.getClass();
                            String strD = j0.d(str7, str6);
                            String strD2 = j0.d(dVar4.f121485b, cVar.f61686q);
                            cz1.a aVarW6 = cVar.w6();
                            String str8 = cVar.f61683n;
                            str8.getClass();
                            ((y0) aVarW6.f56874k0.getValue()).j(str8);
                            cz1.a aVarW7 = cVar.w6();
                            String str9 = cVar.f61684o;
                            str9.getClass();
                            ((y0) aVarW7.H0.getValue()).j(str9);
                            gg0.f fVar2 = dVar4.f121487d;
                            if (fVar2 != null) {
                                Context contextRequireContext = cVar.requireContext();
                                contextRequireContext.getClass();
                                strB = fVar2.b(contextRequireContext);
                            }
                            TextView textView3 = cVar.f61680k;
                            if (textView3 == null) {
                                p005kotlin.jvm.internal.s.m("dateRangeView");
                                throw null;
                            }
                            textView3.setText(cVar.getString(R.string.find_events_between_date_range, strB, strD, strD2));
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(DateTime dateTime, boolean z14) {
        long millis;
        p pVar;
        long millis2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(dateTime.getYear(), dateTime.getMonthOfYear() - 1, dateTime.getDayOfMonth());
        if (z14) {
            Long lValueOf = Long.valueOf(this.f61687r.getMillis());
            if (d53.w.J(this.f61684o)) {
                millis2 = this.f61688t.getMillis();
            } else {
                DateTime dateTimeV6 = v6(this.f61684o);
                if (dateTimeV6 == null) {
                    dateTimeV6 = this.f61688t;
                }
                millis2 = dateTimeV6.getMillis();
            }
            pVar = new p(lValueOf, Long.valueOf(millis2));
        } else {
            if (d53.w.J(this.f61683n)) {
                millis = this.f61687r.getMillis();
            } else {
                DateTime dateTimeV7 = v6(this.f61683n);
                if (dateTimeV7 == null) {
                    dateTimeV7 = this.f61687r;
                }
                millis = dateTimeV7.getMillis();
            }
            pVar = new p(Long.valueOf(millis), Long.valueOf(this.f61688t.getMillis()));
        }
        new c0(requireContext(), ((Number) pVar.f128594a).longValue(), ((Number) pVar.f128595b).longValue(), calendar, new n1(calendar, this, z14)).show();
    }

    public final cz1.a w6() {
        return (cz1.a) this.f61671b.getValue();
    }

    public final void y6(ny1.f fVar) {
        fVar.getClass();
        j0 j0Var = j0.f23099a;
        String string = DateTime.now().toLocalDate().toString();
        j0Var.getClass();
        String string2 = j0.c(string, "yyyy-MM-dd", "MM/dd/yy", "").toString();
        this.f61683n = string2;
        TextView textView = this.f61681l;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("textViewBeginningDate");
            throw null;
        }
        textView.setText(string2);
        this.f61684o = j0.c(DateTime.now().plusDays(fVar.f128367c).toLocalDate().toString(), "yyyy-MM-dd", "MM/dd/yy", "").toString();
        String strD = j0.d(this.f61683n, "MMM d");
        String strD2 = j0.d(this.f61684o, "MMM d");
        TextView textView2 = this.f61680k;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("dateRangeView");
            throw null;
        }
        textView2.setText(getString(R.string.find_events_between_date_range, "", strD, strD2));
        TextView textView3 = this.f61682m;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("textViewEndingDate");
            throw null;
        }
        textView3.setText(this.f61684o);
        cz1.a aVarW6 = w6();
        String str = this.f61683n;
        str.getClass();
        ((y0) aVarW6.f56874k0.getValue()).j(str);
        cz1.a aVarW7 = w6();
        String str2 = this.f61684o;
        str2.getClass();
        ((y0) aVarW7.H0.getValue()).j(str2);
        w6().f5(fVar, this.f61683n, this.f61684o);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldz1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
