package dz1;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldz1/i;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {
    public static final a F = new a(null);
    public String A;
    public String B;
    public final List<eg0.b> C;
    public InlineUnitsTextFieldView.a D;
    public final c E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f61709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uy1.b f61710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uy1.b f61711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1.a f61712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f61713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f61714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f61715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f61716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f61717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f61718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f61719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f61720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f61721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f61722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f61723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f61724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f61725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f61726r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f61727t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f61728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f61729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f61730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f61731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f61732z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f61734b;

        static {
            int[] iArr = new int[gg0.f.values().length];
            try {
                iArr[gg0.f.f77130f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.f.f77131g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.f.f77132h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.f.f77133i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gg0.f.f77134j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61733a = iArr;
            int[] iArr2 = new int[ny1.b.values().length];
            try {
                iArr2[ny1.b.RUNNING_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ny1.b.CYCLING_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f61734b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dz1/i$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            i iVar = i.this;
            iVar.E.f(false);
            iVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f61736a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f61736a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f61736a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61736a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f61737a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f61737a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f61738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f61739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f61738a = aVar;
            this.f61739b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f61738a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f61739b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f61740a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f61740a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i() {
        super(R.layout.ti_find_event_filter_duration_fragment);
        this.f61709a = new w1(s0.f105811a.b(cz1.a.class), new e(this), new g(this), new f(null, this));
        this.A = "";
        this.B = "";
        eg0.b.f63971b.getClass();
        this.C = eg0.b.a.a();
        bg0.a.f17827a.getClass();
        this.D = new eg0.b(bg0.a.C0255a.a());
        this.E = new c();
    }

    public final void A6(boolean z14) {
        if (!z14) {
            TextView textView = this.f61714f;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("textViewTime");
                throw null;
            }
            textView.setBackground(a7.b.getDrawable(requireContext(), R.drawable.bg_light_event_type));
            TextView textView2 = this.f61713e;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("textViewDistance");
                throw null;
            }
            textView2.setBackground(null);
            RecyclerView recyclerView = this.f61726r;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("rvDurationDistance");
                throw null;
            }
            recyclerView.setVisibility(8);
            LinearLayout linearLayout = this.f61715g;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView2 = this.f61727t;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("rvDurationTime");
                throw null;
            }
        }
        TextView textView3 = this.f61713e;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("textViewDistance");
            throw null;
        }
        textView3.setBackground(a7.b.getDrawable(requireContext(), R.drawable.bg_light_event_type));
        TextView textView4 = this.f61714f;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("textViewTime");
            throw null;
        }
        textView4.setBackground(null);
        ny1.b bVarX4 = w6().X4();
        int i14 = bVarX4 == null ? -1 : b.f61734b[bVarX4.ordinal()];
        if (i14 == 1 || i14 == 2) {
            RecyclerView recyclerView3 = this.f61726r;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("rvDurationDistance");
                throw null;
            }
            recyclerView3.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = this.f61715g;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
            linearLayout2.setVisibility(0);
        }
        ez1.c cVarB5 = w6().b5();
        ez1.b bVar = ez1.b.CUSTOM;
        LinearLayout linearLayout3 = this.f61715g;
        if (cVarB5 == bVar) {
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
            linearLayout3.setVisibility(0);
        } else {
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
            linearLayout3.setVisibility(8);
        }
        RecyclerView recyclerView4 = this.f61727t;
        if (recyclerView4 != null) {
            recyclerView4.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("rvDurationTime");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f61712d = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIFindEventFilterDurationFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        w6().j5(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f61712d;
        if (aVar != null) {
            String string = getString(R.string.search_filter_event_duration);
            string.getClass();
            aVar.g(2, string);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.E, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.text_view_distance);
        viewFindViewById.getClass();
        this.f61713e = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_time);
        viewFindViewById2.getClass();
        this.f61714f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.custom_view);
        viewFindViewById3.getClass();
        this.f61715g = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.distance_unit);
        viewFindViewById4.getClass();
        this.f61716h = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.tv_distance_unit);
        viewFindViewById5.getClass();
        this.f61717i = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.ll_minimum_distance);
        viewFindViewById6.getClass();
        this.f61718j = (RelativeLayout) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.minimum_add_distance_layout);
        viewFindViewById7.getClass();
        this.f61719k = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.minimum_distance_edit_text);
        viewFindViewById8.getClass();
        this.f61720l = (EditText) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.tv_minimum_distance);
        viewFindViewById9.getClass();
        this.f61721m = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.ll_maximum_distance);
        viewFindViewById10.getClass();
        this.f61722n = (RelativeLayout) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.maximum_add_distance_layout);
        viewFindViewById11.getClass();
        this.f61723o = (LinearLayout) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.maximum_distance_edit_text);
        viewFindViewById12.getClass();
        this.f61724p = (EditText) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.tv_maximum_distance);
        viewFindViewById13.getClass();
        this.f61725q = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.rv_duration_distance);
        viewFindViewById14.getClass();
        this.f61726r = (RecyclerView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.rv_duration_time);
        viewFindViewById15.getClass();
        this.f61727t = (RecyclerView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.minimum_distance_clear_button);
        viewFindViewById16.getClass();
        this.f61728v = (ImageView) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.maximum_distance_clear_button);
        viewFindViewById17.getClass();
        this.f61729w = (ImageView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.minimum_distance_error);
        viewFindViewById18.getClass();
        this.f61730x = (ImageView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.maximum_distance_error);
        viewFindViewById19.getClass();
        this.f61731y = (ImageView) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.tv_distance_range);
        viewFindViewById20.getClass();
        this.f61732z = (TextView) viewFindViewById20;
        RecyclerView recyclerView = this.f61726r;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("rvDurationDistance");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f61727t;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("rvDurationTime");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        my1.d dVarD = w6().Z4().d();
        ez1.c cVar = dVarD != null ? dVarD.f121494k : null;
        int iW = cVar != null ? cVar.w() : 0;
        w6();
        uy1.b bVar = new uy1.b(contextRequireContext, iW, p13.u.i0(ez1.h.values()));
        this.f61711c = bVar;
        bVar.f173392d = this;
        RecyclerView recyclerView3 = this.f61727t;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("rvDurationTime");
            throw null;
        }
        recyclerView3.setAdapter(bVar);
        TextView textView = this.f61713e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("textViewDistance");
            throw null;
        }
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                i iVar = this.f61698b;
                switch (i15) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout = iVar.f61718j;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout.setVisibility(8);
                        LinearLayout linearLayout = iVar.f61719k;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText = iVar.f61720l;
                        if (editText != null) {
                            editText.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout2 = iVar.f61722n;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout2.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61723o;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText2 = iVar.f61724p;
                        if (editText2 != null) {
                            editText2.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        TextView textView2 = this.f61714f;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("textViewTime");
            throw null;
        }
        final int i15 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                i iVar = this.f61698b;
                switch (i16) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout = iVar.f61718j;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout.setVisibility(8);
                        LinearLayout linearLayout = iVar.f61719k;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        EditText editText = iVar.f61720l;
                        if (editText != null) {
                            editText.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout2 = iVar.f61722n;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout2.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61723o;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText2 = iVar.f61724p;
                        if (editText2 != null) {
                            editText2.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        LinearLayout linearLayout = this.f61716h;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("distanceUnit");
            throw null;
        }
        final int i16 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                i iVar = this.f61698b;
                switch (i17) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout = iVar.f61718j;
                        if (relativeLayout == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61719k;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText = iVar.f61720l;
                        if (editText != null) {
                            editText.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout2 = iVar.f61722n;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout2.setVisibility(8);
                        LinearLayout linearLayout3 = iVar.f61723o;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout3.setVisibility(0);
                        EditText editText2 = iVar.f61724p;
                        if (editText2 != null) {
                            editText2.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        RelativeLayout relativeLayout = this.f61718j;
        if (relativeLayout == null) {
            p005kotlin.jvm.internal.s.m("llMinimumDistance");
            throw null;
        }
        final int i17 = 3;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                i iVar = this.f61698b;
                switch (i18) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout2 = iVar.f61718j;
                        if (relativeLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout2.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61719k;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText = iVar.f61720l;
                        if (editText != null) {
                            editText.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout3 = iVar.f61722n;
                        if (relativeLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout3.setVisibility(8);
                        LinearLayout linearLayout3 = iVar.f61723o;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout3.setVisibility(0);
                        EditText editText2 = iVar.f61724p;
                        if (editText2 != null) {
                            editText2.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        EditText editText = this.f61720l;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
            throw null;
        }
        final int i18 = 1;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: dz1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61700b;

            {
                this.f61700b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                Object systemService;
                int i19 = i18;
                i iVar = this.f61700b;
                switch (i19) {
                    case 0:
                        if (!z14) {
                            i.a aVar2 = i.F;
                            return;
                        }
                        EditText editText2 = iVar.f61724p;
                        if (editText2 == null) {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                        editText2.setSelection(editText2.getText().length());
                        EditText editText3 = iVar.f61724p;
                        if (editText3 == null) {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                        Context context = iVar.getContext();
                        systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        ((InputMethodManager) systemService).showSoftInput(editText3, 0);
                        return;
                    default:
                        if (!z14) {
                            i.a aVar3 = i.F;
                            return;
                        }
                        EditText editText4 = iVar.f61720l;
                        if (editText4 == null) {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                        editText4.setSelection(editText4.getText().length());
                        EditText editText5 = iVar.f61720l;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                        Context context2 = iVar.getContext();
                        systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        ((InputMethodManager) systemService).showSoftInput(editText5, 0);
                        return;
                }
            }
        });
        EditText editText2 = this.f61720l;
        if (editText2 == null) {
            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
            throw null;
        }
        final int i19 = 1;
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: dz1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61707b;

            {
                this.f61707b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i24, KeyEvent keyEvent) {
                String str;
                String string2;
                int i25 = i19;
                View view3 = view2;
                i iVar = this.f61707b;
                switch (i25) {
                    case 0:
                        i.a aVar2 = i.F;
                        if (i24 == 6) {
                            Context context = iVar.getContext();
                            Object systemService = context != null ? context.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view3.getWindowToken(), 0);
                            EditText editText3 = iVar.f61720l;
                            if (editText3 == null) {
                                p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                                throw null;
                            }
                            String string3 = editText3.getText().toString();
                            str = string3.length() != 0 ? string3 : "0";
                            EditText editText4 = iVar.f61724p;
                            if (editText4 == null) {
                                p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                                throw null;
                            }
                            String string4 = editText4.getText().toString();
                            if (g22.n.d(string4)) {
                                og0.a aVar3 = og0.a.f131967a;
                                InlineUnitsTextFieldView.a aVar4 = iVar.D;
                                aVar3.getClass();
                                Integer numV = og0.a.v(og0.a.w(aVar4));
                                lz1.f.a aVar5 = lz1.f.f115404a;
                                double d14 = Double.parseDouble(string4);
                                aVar5.getClass();
                                double dO = lz1.f.a.o(d14, 2);
                                if (iVar.w6().X4() == ny1.b.CUSTOM) {
                                    iVar.w6().o5(ez1.h.ALL);
                                    uy1.b bVar2 = iVar.f61711c;
                                    if (bVar2 != null) {
                                        bVar2.f173393e = 0;
                                        bVar2.notifyDataSetChanged();
                                    }
                                    iVar.w6().d5(true);
                                }
                                TextView textView4 = iVar.f61725q;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("tvMaximumDistance");
                                    throw null;
                                }
                                InlineUnitsTextFieldView.a aVar6 = iVar.D;
                                Context contextRequireContext2 = iVar.requireContext();
                                contextRequireContext2.getClass();
                                textView4.setText(dO + StringUtils.SPACE + aVar6.a(contextRequireContext2));
                                if (dO > numV.intValue() || (Double.parseDouble(str) > 0.0d && dO < lz1.f.a.o(Double.parseDouble(str), 2))) {
                                    TextView textView5 = iVar.f61732z;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    InlineUnitsTextFieldView.a aVar7 = iVar.D;
                                    Context contextRequireContext3 = iVar.requireContext();
                                    contextRequireContext3.getClass();
                                    textView5.setText(iVar.getString(R.string.event_distance_range, 0, numV, aVar7.a(contextRequireContext3)));
                                    TextView textView6 = iVar.f61732z;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView6.setVisibility(0);
                                    ImageView imageView = iVar.f61731y;
                                    if (imageView == null) {
                                        p005kotlin.jvm.internal.s.m("errorMaximumDistance");
                                        throw null;
                                    }
                                    imageView.setVisibility(0);
                                    iVar.y6(((int) dO) > numV.intValue(), numV, false);
                                } else {
                                    iVar.w6().l5(dO);
                                    ImageView imageView2 = iVar.f61731y;
                                    if (imageView2 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMaximumDistance");
                                        throw null;
                                    }
                                    imageView2.setVisibility(8);
                                    TextView textView7 = iVar.f61732z;
                                    if (textView7 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView7.setVisibility(8);
                                }
                            } else {
                                iVar.u6();
                            }
                            RelativeLayout relativeLayout2 = iVar.f61722n;
                            if (relativeLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("llMaximumDistance");
                                throw null;
                            }
                            relativeLayout2.setVisibility(0);
                            LinearLayout linearLayout2 = iVar.f61723o;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        }
                        return false;
                    default:
                        i.a aVar8 = i.F;
                        if (i24 == 6) {
                            Context context2 = iVar.getContext();
                            Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                            systemService2.getClass();
                            ((InputMethodManager) systemService2).hideSoftInputFromWindow(view3.getWindowToken(), 0);
                            EditText editText5 = iVar.f61720l;
                            if (editText5 == null) {
                                p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                                throw null;
                            }
                            String string5 = editText5.getText().toString();
                            EditText editText6 = iVar.f61724p;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                                throw null;
                            }
                            String string6 = editText6.getText().toString();
                            str = string6.length() != 0 ? string6 : "0";
                            if (g22.n.d(string5)) {
                                lz1.f.a aVar9 = lz1.f.f115404a;
                                double d15 = Double.parseDouble(string5);
                                aVar9.getClass();
                                double dO2 = lz1.f.a.o(d15, 2);
                                og0.a aVar10 = og0.a.f131967a;
                                InlineUnitsTextFieldView.a aVar11 = iVar.D;
                                aVar10.getClass();
                                Integer numV2 = og0.a.v(og0.a.w(aVar11));
                                if (iVar.w6().X4() == ny1.b.CUSTOM) {
                                    iVar.w6().o5(ez1.h.ALL);
                                    uy1.b bVar3 = iVar.f61711c;
                                    if (bVar3 != null) {
                                        bVar3.f173393e = 0;
                                        bVar3.notifyDataSetChanged();
                                    }
                                    iVar.w6().d5(true);
                                }
                                TextView textView8 = iVar.f61721m;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("tvMinimumDistance");
                                    throw null;
                                }
                                InlineUnitsTextFieldView.a aVar12 = iVar.D;
                                Context contextRequireContext4 = iVar.requireContext();
                                contextRequireContext4.getClass();
                                textView8.setText(dO2 + StringUtils.SPACE + aVar12.a(contextRequireContext4));
                                if (dO2 > numV2.intValue() || (Double.parseDouble(str) > 0.0d && dO2 > lz1.f.a.o(Double.parseDouble(str), 2))) {
                                    TextView textView9 = iVar.f61732z;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    androidx.fragment.app.m activity = iVar.getActivity();
                                    if (activity != null) {
                                        InlineUnitsTextFieldView.a aVar13 = iVar.D;
                                        Context contextRequireContext5 = iVar.requireContext();
                                        contextRequireContext5.getClass();
                                        string2 = activity.getString(R.string.event_distance_range, 0, numV2, aVar13.a(contextRequireContext5));
                                    } else {
                                        string2 = null;
                                    }
                                    textView9.setText(string2);
                                    TextView textView10 = iVar.f61732z;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                    ImageView imageView3 = iVar.f61730x;
                                    if (imageView3 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMinimumDistance");
                                        throw null;
                                    }
                                    imageView3.setVisibility(0);
                                    iVar.y6(((int) dO2) > numV2.intValue(), numV2, true);
                                } else {
                                    iVar.w6().m5(dO2);
                                    ImageView imageView4 = iVar.f61730x;
                                    if (imageView4 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMinimumDistance");
                                        throw null;
                                    }
                                    imageView4.setVisibility(8);
                                    TextView textView11 = iVar.f61732z;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            } else {
                                iVar.v6();
                            }
                            RelativeLayout relativeLayout3 = iVar.f61718j;
                            if (relativeLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("llMinimumDistance");
                                throw null;
                            }
                            relativeLayout3.setVisibility(0);
                            LinearLayout linearLayout3 = iVar.f61719k;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                                throw null;
                            }
                            linearLayout3.setVisibility(8);
                        }
                        return false;
                }
            }
        });
        RelativeLayout relativeLayout2 = this.f61722n;
        if (relativeLayout2 == null) {
            p005kotlin.jvm.internal.s.m("llMaximumDistance");
            throw null;
        }
        final int i24 = 4;
        relativeLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                i iVar = this.f61698b;
                switch (i110) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout3 = iVar.f61718j;
                        if (relativeLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout3.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61719k;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText3 = iVar.f61720l;
                        if (editText3 != null) {
                            editText3.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout4 = iVar.f61722n;
                        if (relativeLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout4.setVisibility(8);
                        LinearLayout linearLayout3 = iVar.f61723o;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout3.setVisibility(0);
                        EditText editText4 = iVar.f61724p;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        ImageView imageView = this.f61728v;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("clearMinimumDistance");
            throw null;
        }
        final int i25 = 5;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i25;
                i iVar = this.f61698b;
                switch (i110) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout3 = iVar.f61718j;
                        if (relativeLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout3.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61719k;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText3 = iVar.f61720l;
                        if (editText3 != null) {
                            editText3.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout4 = iVar.f61722n;
                        if (relativeLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout4.setVisibility(8);
                        LinearLayout linearLayout3 = iVar.f61723o;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout3.setVisibility(0);
                        EditText editText4 = iVar.f61724p;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        ImageView imageView2 = this.f61729w;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("clearMaximumDistance");
            throw null;
        }
        final int i26 = 6;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61698b;

            {
                this.f61698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i26;
                i iVar = this.f61698b;
                switch (i110) {
                    case 0:
                        i.a aVar2 = i.F;
                        iVar.A6(true);
                        return;
                    case 1:
                        i.a aVar3 = i.F;
                        iVar.A6(false);
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a c0929a = new com.garmin.android.apps.connectmobile.view.reusablecomponents.a.C0929a("", false, (c32.d[]) iVar.C.toArray(new InlineUnitsTextFieldView.a[0]), iVar.D, 2, null);
                        Context contextRequireContext2 = iVar.requireContext();
                        contextRequireContext2.getClass();
                        new com.garmin.android.apps.connectmobile.view.reusablecomponents.a(contextRequireContext2, c0929a, new dh0.j(17), new f(iVar, 2));
                        return;
                    case 3:
                        RelativeLayout relativeLayout3 = iVar.f61718j;
                        if (relativeLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumDistance");
                            throw null;
                        }
                        relativeLayout3.setVisibility(8);
                        LinearLayout linearLayout2 = iVar.f61719k;
                        if (linearLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                            throw null;
                        }
                        linearLayout2.setVisibility(0);
                        EditText editText3 = iVar.f61720l;
                        if (editText3 != null) {
                            editText3.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                    case 4:
                        RelativeLayout relativeLayout4 = iVar.f61722n;
                        if (relativeLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumDistance");
                            throw null;
                        }
                        relativeLayout4.setVisibility(8);
                        LinearLayout linearLayout3 = iVar.f61723o;
                        if (linearLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                            throw null;
                        }
                        linearLayout3.setVisibility(0);
                        EditText editText4 = iVar.f61724p;
                        if (editText4 != null) {
                            editText4.requestFocus();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                    case 5:
                        i.a aVar4 = i.F;
                        iVar.v6();
                        return;
                    default:
                        i.a aVar5 = i.F;
                        iVar.u6();
                        return;
                }
            }
        });
        EditText editText3 = this.f61724p;
        if (editText3 == null) {
            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
            throw null;
        }
        final int i27 = 0;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: dz1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61700b;

            {
                this.f61700b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                Object systemService;
                int i110 = i27;
                i iVar = this.f61700b;
                switch (i110) {
                    case 0:
                        if (!z14) {
                            i.a aVar2 = i.F;
                            return;
                        }
                        EditText editText4 = iVar.f61724p;
                        if (editText4 == null) {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                        editText4.setSelection(editText4.getText().length());
                        EditText editText5 = iVar.f61724p;
                        if (editText5 == null) {
                            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                            throw null;
                        }
                        Context context = iVar.getContext();
                        systemService = context != null ? context.getSystemService("input_method") : null;
                        systemService.getClass();
                        ((InputMethodManager) systemService).showSoftInput(editText5, 0);
                        return;
                    default:
                        if (!z14) {
                            i.a aVar3 = i.F;
                            return;
                        }
                        EditText editText6 = iVar.f61720l;
                        if (editText6 == null) {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                        editText6.setSelection(editText6.getText().length());
                        EditText editText7 = iVar.f61720l;
                        if (editText7 == null) {
                            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                            throw null;
                        }
                        Context context2 = iVar.getContext();
                        systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        systemService.getClass();
                        ((InputMethodManager) systemService).showSoftInput(editText7, 0);
                        return;
                }
            }
        });
        EditText editText4 = this.f61724p;
        if (editText4 == null) {
            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
            throw null;
        }
        final int i28 = 0;
        editText4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: dz1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f61707b;

            {
                this.f61707b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i29, KeyEvent keyEvent) {
                String str;
                String string2;
                int i210 = i28;
                View view3 = view2;
                i iVar = this.f61707b;
                switch (i210) {
                    case 0:
                        i.a aVar2 = i.F;
                        if (i29 == 6) {
                            Context context = iVar.getContext();
                            Object systemService = context != null ? context.getSystemService("input_method") : null;
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view3.getWindowToken(), 0);
                            EditText editText5 = iVar.f61720l;
                            if (editText5 == null) {
                                p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                                throw null;
                            }
                            String string3 = editText5.getText().toString();
                            str = string3.length() != 0 ? string3 : "0";
                            EditText editText6 = iVar.f61724p;
                            if (editText6 == null) {
                                p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                                throw null;
                            }
                            String string4 = editText6.getText().toString();
                            if (g22.n.d(string4)) {
                                og0.a aVar3 = og0.a.f131967a;
                                InlineUnitsTextFieldView.a aVar4 = iVar.D;
                                aVar3.getClass();
                                Integer numV = og0.a.v(og0.a.w(aVar4));
                                lz1.f.a aVar5 = lz1.f.f115404a;
                                double d14 = Double.parseDouble(string4);
                                aVar5.getClass();
                                double dO = lz1.f.a.o(d14, 2);
                                if (iVar.w6().X4() == ny1.b.CUSTOM) {
                                    iVar.w6().o5(ez1.h.ALL);
                                    uy1.b bVar2 = iVar.f61711c;
                                    if (bVar2 != null) {
                                        bVar2.f173393e = 0;
                                        bVar2.notifyDataSetChanged();
                                    }
                                    iVar.w6().d5(true);
                                }
                                TextView textView4 = iVar.f61725q;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("tvMaximumDistance");
                                    throw null;
                                }
                                InlineUnitsTextFieldView.a aVar6 = iVar.D;
                                Context contextRequireContext2 = iVar.requireContext();
                                contextRequireContext2.getClass();
                                textView4.setText(dO + StringUtils.SPACE + aVar6.a(contextRequireContext2));
                                if (dO > numV.intValue() || (Double.parseDouble(str) > 0.0d && dO < lz1.f.a.o(Double.parseDouble(str), 2))) {
                                    TextView textView5 = iVar.f61732z;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    InlineUnitsTextFieldView.a aVar7 = iVar.D;
                                    Context contextRequireContext3 = iVar.requireContext();
                                    contextRequireContext3.getClass();
                                    textView5.setText(iVar.getString(R.string.event_distance_range, 0, numV, aVar7.a(contextRequireContext3)));
                                    TextView textView6 = iVar.f61732z;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView6.setVisibility(0);
                                    ImageView imageView3 = iVar.f61731y;
                                    if (imageView3 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMaximumDistance");
                                        throw null;
                                    }
                                    imageView3.setVisibility(0);
                                    iVar.y6(((int) dO) > numV.intValue(), numV, false);
                                } else {
                                    iVar.w6().l5(dO);
                                    ImageView imageView4 = iVar.f61731y;
                                    if (imageView4 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMaximumDistance");
                                        throw null;
                                    }
                                    imageView4.setVisibility(8);
                                    TextView textView7 = iVar.f61732z;
                                    if (textView7 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView7.setVisibility(8);
                                }
                            } else {
                                iVar.u6();
                            }
                            RelativeLayout relativeLayout3 = iVar.f61722n;
                            if (relativeLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("llMaximumDistance");
                                throw null;
                            }
                            relativeLayout3.setVisibility(0);
                            LinearLayout linearLayout2 = iVar.f61723o;
                            if (linearLayout2 == null) {
                                p005kotlin.jvm.internal.s.m("llMaximumAddDistance");
                                throw null;
                            }
                            linearLayout2.setVisibility(8);
                        }
                        return false;
                    default:
                        i.a aVar8 = i.F;
                        if (i29 == 6) {
                            Context context2 = iVar.getContext();
                            Object systemService2 = context2 != null ? context2.getSystemService("input_method") : null;
                            systemService2.getClass();
                            ((InputMethodManager) systemService2).hideSoftInputFromWindow(view3.getWindowToken(), 0);
                            EditText editText7 = iVar.f61720l;
                            if (editText7 == null) {
                                p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
                                throw null;
                            }
                            String string5 = editText7.getText().toString();
                            EditText editText8 = iVar.f61724p;
                            if (editText8 == null) {
                                p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
                                throw null;
                            }
                            String string6 = editText8.getText().toString();
                            str = string6.length() != 0 ? string6 : "0";
                            if (g22.n.d(string5)) {
                                lz1.f.a aVar9 = lz1.f.f115404a;
                                double d15 = Double.parseDouble(string5);
                                aVar9.getClass();
                                double dO2 = lz1.f.a.o(d15, 2);
                                og0.a aVar10 = og0.a.f131967a;
                                InlineUnitsTextFieldView.a aVar11 = iVar.D;
                                aVar10.getClass();
                                Integer numV2 = og0.a.v(og0.a.w(aVar11));
                                if (iVar.w6().X4() == ny1.b.CUSTOM) {
                                    iVar.w6().o5(ez1.h.ALL);
                                    uy1.b bVar3 = iVar.f61711c;
                                    if (bVar3 != null) {
                                        bVar3.f173393e = 0;
                                        bVar3.notifyDataSetChanged();
                                    }
                                    iVar.w6().d5(true);
                                }
                                TextView textView8 = iVar.f61721m;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("tvMinimumDistance");
                                    throw null;
                                }
                                InlineUnitsTextFieldView.a aVar12 = iVar.D;
                                Context contextRequireContext4 = iVar.requireContext();
                                contextRequireContext4.getClass();
                                textView8.setText(dO2 + StringUtils.SPACE + aVar12.a(contextRequireContext4));
                                if (dO2 > numV2.intValue() || (Double.parseDouble(str) > 0.0d && dO2 > lz1.f.a.o(Double.parseDouble(str), 2))) {
                                    TextView textView9 = iVar.f61732z;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    androidx.fragment.app.m activity = iVar.getActivity();
                                    if (activity != null) {
                                        InlineUnitsTextFieldView.a aVar13 = iVar.D;
                                        Context contextRequireContext5 = iVar.requireContext();
                                        contextRequireContext5.getClass();
                                        string2 = activity.getString(R.string.event_distance_range, 0, numV2, aVar13.a(contextRequireContext5));
                                    } else {
                                        string2 = null;
                                    }
                                    textView9.setText(string2);
                                    TextView textView10 = iVar.f61732z;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                    ImageView imageView5 = iVar.f61730x;
                                    if (imageView5 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMinimumDistance");
                                        throw null;
                                    }
                                    imageView5.setVisibility(0);
                                    iVar.y6(((int) dO2) > numV2.intValue(), numV2, true);
                                } else {
                                    iVar.w6().m5(dO2);
                                    ImageView imageView6 = iVar.f61730x;
                                    if (imageView6 == null) {
                                        p005kotlin.jvm.internal.s.m("errorMinimumDistance");
                                        throw null;
                                    }
                                    imageView6.setVisibility(8);
                                    TextView textView11 = iVar.f61732z;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("textViewDistanceRange");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            } else {
                                iVar.v6();
                            }
                            RelativeLayout relativeLayout4 = iVar.f61718j;
                            if (relativeLayout4 == null) {
                                p005kotlin.jvm.internal.s.m("llMinimumDistance");
                                throw null;
                            }
                            relativeLayout4.setVisibility(0);
                            LinearLayout linearLayout3 = iVar.f61719k;
                            if (linearLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("llMinimumAddDistance");
                                throw null;
                            }
                            linearLayout3.setVisibility(8);
                        }
                        return false;
                }
            }
        });
        ((androidx.lifecycle.s0) w6().P0.getValue()).f(getViewLifecycleOwner(), new d(new dz1.f(this, i28)));
        w6().L0.f(getViewLifecycleOwner(), new d(new dz1.f(this, 1)));
    }

    public final void u6() {
        EditText editText = this.f61724p;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("maximumDistanceEditText");
            throw null;
        }
        editText.setText("");
        TextView textView = this.f61725q;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("tvMaximumDistance");
            throw null;
        }
        textView.setText("");
        w6().l5(0.0d);
    }

    public final void v6() {
        EditText editText = this.f61720l;
        if (editText == null) {
            p005kotlin.jvm.internal.s.m("minimumDistanceEditText");
            throw null;
        }
        editText.setText("");
        TextView textView = this.f61721m;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("tvMinimumDistance");
            throw null;
        }
        textView.setText("");
        w6().m5(0.0d);
    }

    public final cz1.a w6() {
        return (cz1.a) this.f61709a.getValue();
    }

    public final void y6(boolean z14, Integer num, boolean z15) {
        if (z14) {
            String string = getString(R.string.lbl_error_title_wrong_number);
            string.getClass();
            this.A = string;
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            InlineUnitsTextFieldView.a aVar = this.D;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            String string2 = mVarRequireActivity.getString(R.string.event_distance_range, 0, num, aVar.a(contextRequireContext));
            string2.getClass();
            this.B = string2;
        } else {
            String string3 = getString(R.string.dialog_title_error);
            string3.getClass();
            this.A = string3;
            String string4 = requireActivity().getString(R.string.distance_range_error_message);
            string4.getClass();
            this.B = string4;
        }
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireContext());
        aVar2.setTitle(this.A);
        aVar2.setMessage(this.B);
        aVar2.setCancelable(false);
        aVar2.setPositiveButton(getString(R.string.lbl_ok), new dz1.g(0, this, z15));
        aVar2.create().show();
    }

    public final void z6(ny1.b bVar) {
        List listI0;
        ez1.c cVarB5;
        my1.d dVarD = w6().Z4().d();
        if (p005kotlin.jvm.internal.s.g(dVarD != null ? Boolean.valueOf(dVarD.f121491h) : null, Boolean.TRUE)) {
            RecyclerView recyclerView = this.f61726r;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("rvDurationDistance");
                throw null;
            }
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = this.f61727t;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("rvDurationTime");
                throw null;
            }
            recyclerView2.setVisibility(8);
            LinearLayout linearLayout = this.f61715g;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
            linearLayout.setVisibility(8);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ez1.c cVarB6 = w6().b5();
        int iW = cVarB6 != null ? cVarB6.w() : 0;
        w6();
        bVar.getClass();
        if (cz1.a.b.f56875a[bVar.ordinal()] == 1) {
            listI0 = p13.u.i0(ez1.g.values());
        } else {
            bg0.a.f17827a.getClass();
            listI0 = bg0.a.C0255a.e() ? p13.u.i0(ez1.a.values()) : p13.u.i0(ez1.b.values());
        }
        uy1.b bVar2 = new uy1.b(contextRequireContext, iW, listI0);
        this.f61710b = bVar2;
        bVar2.f173392d = this;
        RecyclerView recyclerView3 = this.f61726r;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("rvDurationDistance");
            throw null;
        }
        recyclerView3.setAdapter(bVar2);
        if (bVar != ny1.b.RUNNING_DISTANCE) {
            ez1.c cVarB7 = w6().b5();
            if ((cVarB7 == null || cVarB7.w() != ez1.b.CUSTOM.ordinal()) && ((cVarB5 = w6().b5()) == null || cVarB5.w() != ez1.a.CUSTOM.ordinal())) {
                return;
            }
            LinearLayout linearLayout2 = this.f61715g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            } else {
                p005kotlin.jvm.internal.s.m("llCustomView");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldz1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
