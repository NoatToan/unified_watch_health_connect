package zb0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.IndexActivityClassSelectionActivity;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzb0/c1;", "Landroidx/fragment/app/Fragment;", "Lwn1/h$b;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 extends Fragment implements wn1.h.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f203441z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f203442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StyledInlineTextFieldViewDark f203443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f203444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f203445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f203446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f203447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f203448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f203449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f203450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k32.l f203451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k32.l f203452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k32.l f203453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k32.l f203454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k32.l f203455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f203456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wn1.h f203457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f12.l f203458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f203459r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f203460t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s2 f203461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f1 f203462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f203463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f203464y;

    public interface b {
        void O3(String str);

        void c5();

        void v7(String str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.IndexTellUsMoreFragment$onViewCreated$6", f = "IndexTellUsMoreFragment.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f203465a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c1 f203467a;

            public a(c1 c1Var) {
                this.f203467a = c1Var;
            }

            /* JADX WARN: Code duplicated, block: B:73:0x0161  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                String string;
                String string2;
                wn1.d dVar2 = (wn1.d) obj;
                c1 c1Var = this.f203467a;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = c1Var.f203443b;
                if (styledInlineTextFieldViewDark == null) {
                    p005kotlin.jvm.internal.s.m("shortNameEditText");
                    throw null;
                }
                EditText editText = styledInlineTextFieldViewDark.editText;
                editText.getClass();
                String str = dVar2.f186199a;
                LocalDate localDate = dVar2.f186203e;
                Float f14 = dVar2.f186201c;
                Double d14 = dVar2.f186202d;
                String str2 = dVar2.f186200b;
                editText.setText(str);
                if (str != null) {
                    editText.setSelection(str.length());
                }
                Unit unit = Unit.INSTANCE;
                if (!c1Var.y6().x4()) {
                    k32.l lVar = c1Var.f203451j;
                    if (lVar == null) {
                        p005kotlin.jvm.internal.s.m("genderViewHolder");
                        throw null;
                    }
                    lVar.h(c1Var.v6(str2));
                    k32.l lVar2 = c1Var.f203452k;
                    if (lVar2 == null) {
                        p005kotlin.jvm.internal.s.m("heightViewHolder");
                        throw null;
                    }
                    lVar2.h(c1Var.w6(f14));
                    k32.l lVar3 = c1Var.f203452k;
                    if (lVar3 == null) {
                        p005kotlin.jvm.internal.s.m("heightViewHolder");
                        throw null;
                    }
                    String strW6 = c1Var.w6(f14);
                    Context contextRequireContext = c1Var.requireContext();
                    contextRequireContext.getClass();
                    lVar3.f102709d.setContentDescription(oi0.c.A(contextRequireContext, new z81.b(2), strW6));
                    k32.l lVar4 = c1Var.f203453l;
                    if (lVar4 == null) {
                        p005kotlin.jvm.internal.s.m("weightViewHolder");
                        throw null;
                    }
                    lVar4.h(c1Var.z6(d14));
                    k32.l lVar5 = c1Var.f203453l;
                    if (lVar5 == null) {
                        p005kotlin.jvm.internal.s.m("weightViewHolder");
                        throw null;
                    }
                    String strZ6 = c1Var.z6(d14);
                    Context contextRequireContext2 = c1Var.requireContext();
                    contextRequireContext2.getClass();
                    lVar5.f102709d.setContentDescription(oi0.c.A(contextRequireContext2, new z81.b(3), strZ6));
                    if (!c1Var.f203459r) {
                        k32.l lVar6 = c1Var.f203454m;
                        if (lVar6 == null) {
                            p005kotlin.jvm.internal.s.m("birthDateViewHolder");
                            throw null;
                        }
                        if (localDate != null) {
                            string2 = DateTimeFormat.mediumDate().print(localDate);
                            string2.getClass();
                        } else {
                            string2 = c1Var.getString(R.string.activities_value_not_set);
                            string2.getClass();
                        }
                        lVar6.h(string2);
                    }
                    k32.l lVar7 = c1Var.f203455n;
                    if (lVar7 == null) {
                        p005kotlin.jvm.internal.s.m("activityClassViewHolder");
                        throw null;
                    }
                    Integer num = dVar2.f186204f;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (iIntValue >= 0 && iIntValue < 4) {
                            string = c1Var.getString(R.string.txt_activity_level_low_label);
                            string.getClass();
                        } else if (4 <= iIntValue && iIntValue < 8) {
                            string = c1Var.getString(R.string.txt_activity_level_medium_label);
                            string.getClass();
                        } else if (8 > iIntValue || iIntValue >= 11) {
                            string = c1Var.getString(R.string.activities_value_not_set);
                            string.getClass();
                        } else {
                            string = c1Var.getString(R.string.txt_activity_level_high_label);
                            string.getClass();
                        }
                    } else {
                        string = c1Var.getString(R.string.activities_value_not_set);
                        string.getClass();
                    }
                    lVar7.h(string);
                }
                boolean zX4 = c1Var.y6().x4();
                Button button = c1Var.f203456o;
                boolean z14 = false;
                if (zX4) {
                    if (button == null) {
                        p005kotlin.jvm.internal.s.m("finishButton");
                        throw null;
                    }
                    button.setEnabled(!(str == null || d53.w.J(str)));
                } else {
                    if (button == null) {
                        p005kotlin.jvm.internal.s.m("finishButton");
                        throw null;
                    }
                    Object obj2 = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    obj2.getClass();
                    if (((f12.b) obj2).f()) {
                        boolean z15 = localDate != null;
                        if (str != null && !d53.w.J(str) && str2 != null && !d53.w.J(str2) && f14 != null && d14 != null && z15) {
                            z14 = true;
                        }
                    } else {
                        z14 = true;
                    }
                    button.setEnabled(z14);
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c1.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203465a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = c1.f203441z;
                c1 c1Var = c1.this;
                p2 p2Var = c1Var.y6().f186227j;
                a aVar2 = new a(c1Var);
                this.f203465a = 1;
                if (p2Var.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f203468a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f203468a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f203468a.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f203469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f203470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f203469a = aVar;
            this.f203470b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f203469a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f203470b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f203471a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f203471a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f203471a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public c1() {
        super(R.layout.gcm_devices_tell_us_more_new);
        this.f203442a = new w1(p005kotlin.jvm.internal.s0.f105811a.b(wn1.g.class), new d(this), new f(this), new e(null, this));
        f12.l.f68084a.getClass();
        this.f203458q = f12.l.a.a();
        bv.b.f21239a.getClass();
        bv.b.a();
        this.f203459r = com.garmin.android.apps.connectmobile.k1.f37122a.r();
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new tr2.y(this, 20));
        cVarRegisterForActivityResult.getClass();
        this.f203460t = cVarRegisterForActivityResult;
        this.f203463x = -1L;
    }

    @Override // wn1.h.b
    public final void O4(String str) {
        u6();
        b bVar = this.f203464y;
        if (bVar != null) {
            bVar.v7(str);
        } else {
            p005kotlin.jvm.internal.s.m("onProfileInitOrSaveListener");
            throw null;
        }
    }

    @Override // wn1.h.b
    public final void c3(String str) {
        u6();
        b bVar = this.f203464y;
        if (bVar != null) {
            bVar.O3(str);
        } else {
            p005kotlin.jvm.internal.s.m("onProfileInitOrSaveListener");
            throw null;
        }
    }

    @Override // wn1.h.b
    public final void l0() {
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e eVarRequireActivity = requireActivity();
        s2 s2Var = eVarRequireActivity instanceof s2 ? (s2) eVarRequireActivity : null;
        if (s2Var != null) {
            this.f203461v = s2Var;
        }
        a7.e eVarRequireActivity2 = requireActivity();
        b bVar = eVarRequireActivity2 instanceof b ? (b) eVarRequireActivity2 : null;
        if (bVar != null) {
            this.f203464y = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        wn1.h hVar = this.f203457p;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        hVar.a();
        wn1.i0 i0VarM = wn1.i0.M();
        long j8 = this.f203463x;
        i0VarM.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.f50124a.get(Long.valueOf(j8)) != null) {
            cVar.a(j8);
        }
        this.f203463x = -1L;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.short_name);
        viewFindViewById.getClass();
        this.f203443b = (StyledInlineTextFieldViewDark) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.name_disclaimer);
        viewFindViewById2.getClass();
        this.f203444c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.gender);
        viewFindViewById3.getClass();
        this.f203445d = viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.height);
        viewFindViewById4.getClass();
        this.f203446e = viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.weight);
        viewFindViewById5.getClass();
        this.f203447f = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.birthday);
        viewFindViewById6.getClass();
        this.f203448g = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.activity_class);
        viewFindViewById7.getClass();
        this.f203449h = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.profile_information_disclaimer);
        viewFindViewById8.getClass();
        this.f203450i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.finish_button);
        viewFindViewById9.getClass();
        this.f203456o = (Button) viewFindViewById9;
        if (!y6().x4()) {
            View view3 = this.f203445d;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("gender");
                throw null;
            }
            k32.l lVar = new k32.l(view3);
            lVar.a(R.string.lbl_gender, null);
            this.f203451j = lVar;
            View view4 = this.f203446e;
            if (view4 == null) {
                p005kotlin.jvm.internal.s.m("height");
                throw null;
            }
            k32.l lVar2 = new k32.l(view4);
            lVar2.a(R.string.lbl_height, null);
            this.f203452k = lVar2;
            View view5 = this.f203447f;
            if (view5 == null) {
                p005kotlin.jvm.internal.s.m("weight");
                throw null;
            }
            k32.l lVar3 = new k32.l(view5);
            lVar3.a(R.string.lbl_weight, null);
            this.f203453l = lVar3;
            View view6 = this.f203448g;
            if (view6 == null) {
                p005kotlin.jvm.internal.s.m("birthday");
                throw null;
            }
            k32.l lVar4 = new k32.l(view6);
            lVar4.a(R.string.lbl_birthdate, null);
            this.f203454m = lVar4;
            View view7 = this.f203449h;
            if (view7 == null) {
                p005kotlin.jvm.internal.s.m("activityClass");
                throw null;
            }
            k32.l lVar5 = new k32.l(view7);
            lVar5.a(R.string.lbl_activity_class, null);
            this.f203455n = lVar5;
        }
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f203443b;
        if (styledInlineTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("shortNameEditText");
            throw null;
        }
        styledInlineTextFieldViewDark.setTitle(getString(R.string.smart_scale_device_setup_short_name_label));
        TextView textView = this.f203444c;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("nameLimitDisclaimer");
            throw null;
        }
        textView.setText(getString(R.string.on_device_display_name_char_limit, String.valueOf(((Number) y6().f186224g.getValue()).intValue())));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = this.f203443b;
        if (styledInlineTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("shortNameEditText");
            throw null;
        }
        String string = getString(R.string.lbl_display_name);
        string.getClass();
        styledInlineTextFieldViewDark2.i(new h32.h.c("", string, Integer.valueOf(((Number) y6().f186224g.getValue()).intValue()), null, null, new yw2.h(this, 9), null, null, 524432, false, null, null, 3800, null));
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = this.f203443b;
        if (styledInlineTextFieldViewDark3 == null) {
            p005kotlin.jvm.internal.s.m("shortNameEditText");
            throw null;
        }
        EditText editText = styledInlineTextFieldViewDark3.editText;
        editText.getClass();
        final int i14 = 3;
        final int i15 = 0;
        final int i16 = 1;
        final int i17 = 2;
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(((Number) y6().f186224g.getValue()).intValue()), new InputFilter.AllCaps(), new gg1.l0(8)};
        InputFilter[] filters = editText.getFilters();
        filters.getClass();
        p13.s.j(filters, inputFilterArr, 0, 0, 14);
        editText.setFilters(inputFilterArr);
        editText.addTextChangedListener(new e1(editText, this));
        Unit unit = Unit.INSTANCE;
        boolean z14 = this.f203459r;
        if (z14) {
            View view8 = this.f203448g;
            if (view8 == null) {
                p005kotlin.jvm.internal.s.m("birthday");
                throw null;
            }
            view8.setVisibility(8);
        }
        if (y6().x4()) {
            View view9 = this.f203445d;
            if (view9 == null) {
                p005kotlin.jvm.internal.s.m("gender");
                throw null;
            }
            view9.setVisibility(8);
            View view10 = this.f203446e;
            if (view10 == null) {
                p005kotlin.jvm.internal.s.m("height");
                throw null;
            }
            view10.setVisibility(8);
            View view11 = this.f203447f;
            if (view11 == null) {
                p005kotlin.jvm.internal.s.m("weight");
                throw null;
            }
            view11.setVisibility(8);
            View view12 = this.f203448g;
            if (view12 == null) {
                p005kotlin.jvm.internal.s.m("birthday");
                throw null;
            }
            view12.setVisibility(8);
            View view13 = this.f203449h;
            if (view13 == null) {
                p005kotlin.jvm.internal.s.m("activityClass");
                throw null;
            }
            view13.setVisibility(8);
            TextView textView2 = this.f203450i;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("profileInfoDisclaimer");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            k32.l lVar6 = this.f203451j;
            if (lVar6 == null) {
                p005kotlin.jvm.internal.s.m("genderViewHolder");
                throw null;
            }
            lVar6.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1 f203435b;

                {
                    this.f203435b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    View currentFocus;
                    int i18 = i15;
                    c1 c1Var = this.f203435b;
                    switch (i18) {
                        case 0:
                            int i19 = c1.f203441z;
                            String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                            stringArray.getClass();
                            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                            ArrayList arrayList = new ArrayList(stringArray.length);
                            for (String str : stringArray) {
                                arrayList.add(c1Var.v6(str));
                            }
                            title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                            return;
                        case 1:
                            int i24 = c1.f203441z;
                            new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                            return;
                        case 2:
                            int i25 = c1.f203441z;
                            Context contextRequireContext = c1Var.requireContext();
                            contextRequireContext.getClass();
                            new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                            return;
                        case 3:
                            int i26 = c1.f203441z;
                            new gg1.b(c1Var.requireContext(), new d1(c1Var));
                            return;
                        case 4:
                            c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                            return;
                        default:
                            int i27 = c1.f203441z;
                            androidx.fragment.app.m activity = c1Var.getActivity();
                            if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                            }
                            c1Var.requireActivity().getWindow().setSoftInputMode(3);
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                            if (styledInlineTextFieldViewDark4 == null) {
                                p005kotlin.jvm.internal.s.m("shortNameEditText");
                                throw null;
                            }
                            String text = styledInlineTextFieldViewDark4.getText();
                            if (text != null) {
                                wn1.h hVar = c1Var.f203457p;
                                if (hVar == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                                if (iB != 0) {
                                    c1Var.O4(String.valueOf(iB));
                                    return;
                                }
                                s2 s2Var = c1Var.f203461v;
                                if (s2Var != null) {
                                    s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                                }
                                long j8 = c1Var.y6().f186219b;
                                wn1.h hVar2 = c1Var.f203457p;
                                if (j8 == -1) {
                                    if (hVar2 != null) {
                                        hVar2.d();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                }
                                if (hVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                                c1Var.f203462w = new f1(c1Var);
                                s2 s2Var2 = c1Var.f203461v;
                                if (s2Var2 != null) {
                                    s2Var2.showProgressOverlay();
                                }
                                if (c1Var.f203457p == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                                fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                                fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                                fVar.g(weightScaleUserInfoDTOB.f44409c);
                                fVar.h(weightScaleUserInfoDTOB.f44409c);
                                fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                                fVar.j(weightScaleUserInfoDTOB.f44411e);
                                fVar.q(weightScaleUserInfoDTOB.f44412f);
                                fVar.b(weightScaleUserInfoDTOB.f44415i);
                                fVar.m(weightScaleUserInfoDTOB.f44416j);
                                LocalDate localDateC = weightScaleUserInfoDTOB.C();
                                if (localDateC != null) {
                                    fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                                }
                                fVar.k(weightScaleUserInfoDTOB.f44414h);
                                wn1.i0 i0VarM = wn1.i0.M();
                                long j14 = c1Var.y6().f186219b;
                                f1 f1Var = c1Var.f203462w;
                                i0VarM.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                                return;
                            }
                            return;
                    }
                }
            });
            View view14 = this.f203446e;
            if (view14 == null) {
                p005kotlin.jvm.internal.s.m("height");
                throw null;
            }
            view14.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1 f203435b;

                {
                    this.f203435b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view15) {
                    View currentFocus;
                    int i18 = i16;
                    c1 c1Var = this.f203435b;
                    switch (i18) {
                        case 0:
                            int i19 = c1.f203441z;
                            String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                            stringArray.getClass();
                            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                            ArrayList arrayList = new ArrayList(stringArray.length);
                            for (String str : stringArray) {
                                arrayList.add(c1Var.v6(str));
                            }
                            title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                            return;
                        case 1:
                            int i24 = c1.f203441z;
                            new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                            return;
                        case 2:
                            int i25 = c1.f203441z;
                            Context contextRequireContext = c1Var.requireContext();
                            contextRequireContext.getClass();
                            new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                            return;
                        case 3:
                            int i26 = c1.f203441z;
                            new gg1.b(c1Var.requireContext(), new d1(c1Var));
                            return;
                        case 4:
                            c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                            return;
                        default:
                            int i27 = c1.f203441z;
                            androidx.fragment.app.m activity = c1Var.getActivity();
                            if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                            }
                            c1Var.requireActivity().getWindow().setSoftInputMode(3);
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                            if (styledInlineTextFieldViewDark4 == null) {
                                p005kotlin.jvm.internal.s.m("shortNameEditText");
                                throw null;
                            }
                            String text = styledInlineTextFieldViewDark4.getText();
                            if (text != null) {
                                wn1.h hVar = c1Var.f203457p;
                                if (hVar == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                                if (iB != 0) {
                                    c1Var.O4(String.valueOf(iB));
                                    return;
                                }
                                s2 s2Var = c1Var.f203461v;
                                if (s2Var != null) {
                                    s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                                }
                                long j8 = c1Var.y6().f186219b;
                                wn1.h hVar2 = c1Var.f203457p;
                                if (j8 == -1) {
                                    if (hVar2 != null) {
                                        hVar2.d();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                }
                                if (hVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                                c1Var.f203462w = new f1(c1Var);
                                s2 s2Var2 = c1Var.f203461v;
                                if (s2Var2 != null) {
                                    s2Var2.showProgressOverlay();
                                }
                                if (c1Var.f203457p == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                                fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                                fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                                fVar.g(weightScaleUserInfoDTOB.f44409c);
                                fVar.h(weightScaleUserInfoDTOB.f44409c);
                                fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                                fVar.j(weightScaleUserInfoDTOB.f44411e);
                                fVar.q(weightScaleUserInfoDTOB.f44412f);
                                fVar.b(weightScaleUserInfoDTOB.f44415i);
                                fVar.m(weightScaleUserInfoDTOB.f44416j);
                                LocalDate localDateC = weightScaleUserInfoDTOB.C();
                                if (localDateC != null) {
                                    fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                                }
                                fVar.k(weightScaleUserInfoDTOB.f44414h);
                                wn1.i0 i0VarM = wn1.i0.M();
                                long j14 = c1Var.y6().f186219b;
                                f1 f1Var = c1Var.f203462w;
                                i0VarM.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                                return;
                            }
                            return;
                    }
                }
            });
            View view15 = this.f203447f;
            if (view15 == null) {
                p005kotlin.jvm.internal.s.m("weight");
                throw null;
            }
            view15.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1 f203435b;

                {
                    this.f203435b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view16) {
                    View currentFocus;
                    int i18 = i17;
                    c1 c1Var = this.f203435b;
                    switch (i18) {
                        case 0:
                            int i19 = c1.f203441z;
                            String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                            stringArray.getClass();
                            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                            ArrayList arrayList = new ArrayList(stringArray.length);
                            for (String str : stringArray) {
                                arrayList.add(c1Var.v6(str));
                            }
                            title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                            return;
                        case 1:
                            int i24 = c1.f203441z;
                            new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                            return;
                        case 2:
                            int i25 = c1.f203441z;
                            Context contextRequireContext = c1Var.requireContext();
                            contextRequireContext.getClass();
                            new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                            return;
                        case 3:
                            int i26 = c1.f203441z;
                            new gg1.b(c1Var.requireContext(), new d1(c1Var));
                            return;
                        case 4:
                            c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                            return;
                        default:
                            int i27 = c1.f203441z;
                            androidx.fragment.app.m activity = c1Var.getActivity();
                            if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                            }
                            c1Var.requireActivity().getWindow().setSoftInputMode(3);
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                            if (styledInlineTextFieldViewDark4 == null) {
                                p005kotlin.jvm.internal.s.m("shortNameEditText");
                                throw null;
                            }
                            String text = styledInlineTextFieldViewDark4.getText();
                            if (text != null) {
                                wn1.h hVar = c1Var.f203457p;
                                if (hVar == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                                if (iB != 0) {
                                    c1Var.O4(String.valueOf(iB));
                                    return;
                                }
                                s2 s2Var = c1Var.f203461v;
                                if (s2Var != null) {
                                    s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                                }
                                long j8 = c1Var.y6().f186219b;
                                wn1.h hVar2 = c1Var.f203457p;
                                if (j8 == -1) {
                                    if (hVar2 != null) {
                                        hVar2.d();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                }
                                if (hVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                                c1Var.f203462w = new f1(c1Var);
                                s2 s2Var2 = c1Var.f203461v;
                                if (s2Var2 != null) {
                                    s2Var2.showProgressOverlay();
                                }
                                if (c1Var.f203457p == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                                fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                                fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                                fVar.g(weightScaleUserInfoDTOB.f44409c);
                                fVar.h(weightScaleUserInfoDTOB.f44409c);
                                fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                                fVar.j(weightScaleUserInfoDTOB.f44411e);
                                fVar.q(weightScaleUserInfoDTOB.f44412f);
                                fVar.b(weightScaleUserInfoDTOB.f44415i);
                                fVar.m(weightScaleUserInfoDTOB.f44416j);
                                LocalDate localDateC = weightScaleUserInfoDTOB.C();
                                if (localDateC != null) {
                                    fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                                }
                                fVar.k(weightScaleUserInfoDTOB.f44414h);
                                wn1.i0 i0VarM = wn1.i0.M();
                                long j14 = c1Var.y6().f186219b;
                                f1 f1Var = c1Var.f203462w;
                                i0VarM.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                                return;
                            }
                            return;
                    }
                }
            });
            if (!z14) {
                View view16 = this.f203448g;
                if (view16 == null) {
                    p005kotlin.jvm.internal.s.m("birthday");
                    throw null;
                }
                view16.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c1 f203435b;

                    {
                        this.f203435b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view17) {
                        View currentFocus;
                        int i18 = i14;
                        c1 c1Var = this.f203435b;
                        switch (i18) {
                            case 0:
                                int i19 = c1.f203441z;
                                String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                                stringArray.getClass();
                                androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                                ArrayList arrayList = new ArrayList(stringArray.length);
                                for (String str : stringArray) {
                                    arrayList.add(c1Var.v6(str));
                                }
                                title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                                return;
                            case 1:
                                int i24 = c1.f203441z;
                                new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                                return;
                            case 2:
                                int i25 = c1.f203441z;
                                Context contextRequireContext = c1Var.requireContext();
                                contextRequireContext.getClass();
                                new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                                return;
                            case 3:
                                int i26 = c1.f203441z;
                                new gg1.b(c1Var.requireContext(), new d1(c1Var));
                                return;
                            case 4:
                                c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                                return;
                            default:
                                int i27 = c1.f203441z;
                                androidx.fragment.app.m activity = c1Var.getActivity();
                                if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                                }
                                c1Var.requireActivity().getWindow().setSoftInputMode(3);
                                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                                if (styledInlineTextFieldViewDark4 == null) {
                                    p005kotlin.jvm.internal.s.m("shortNameEditText");
                                    throw null;
                                }
                                String text = styledInlineTextFieldViewDark4.getText();
                                if (text != null) {
                                    wn1.h hVar = c1Var.f203457p;
                                    if (hVar == null) {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                    int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                                    if (iB != 0) {
                                        c1Var.O4(String.valueOf(iB));
                                        return;
                                    }
                                    s2 s2Var = c1Var.f203461v;
                                    if (s2Var != null) {
                                        s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                                    }
                                    long j8 = c1Var.y6().f186219b;
                                    wn1.h hVar2 = c1Var.f203457p;
                                    if (j8 == -1) {
                                        if (hVar2 != null) {
                                            hVar2.d();
                                            return;
                                        } else {
                                            p005kotlin.jvm.internal.s.m("dtoAssembler");
                                            throw null;
                                        }
                                    }
                                    if (hVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                    WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                                    c1Var.f203462w = new f1(c1Var);
                                    s2 s2Var2 = c1Var.f203461v;
                                    if (s2Var2 != null) {
                                        s2Var2.showProgressOverlay();
                                    }
                                    if (c1Var.f203457p == null) {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                    com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                                    fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                                    fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                                    fVar.g(weightScaleUserInfoDTOB.f44409c);
                                    fVar.h(weightScaleUserInfoDTOB.f44409c);
                                    fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                                    fVar.j(weightScaleUserInfoDTOB.f44411e);
                                    fVar.q(weightScaleUserInfoDTOB.f44412f);
                                    fVar.b(weightScaleUserInfoDTOB.f44415i);
                                    fVar.m(weightScaleUserInfoDTOB.f44416j);
                                    LocalDate localDateC = weightScaleUserInfoDTOB.C();
                                    if (localDateC != null) {
                                        fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                                    }
                                    fVar.k(weightScaleUserInfoDTOB.f44414h);
                                    wn1.i0 i0VarM = wn1.i0.M();
                                    long j14 = c1Var.y6().f186219b;
                                    f1 f1Var = c1Var.f203462w;
                                    i0VarM.getClass();
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            View view17 = this.f203449h;
            if (view17 == null) {
                p005kotlin.jvm.internal.s.m("activityClass");
                throw null;
            }
            final int i18 = 4;
            view17.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1 f203435b;

                {
                    this.f203435b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view18) {
                    View currentFocus;
                    int i19 = i18;
                    c1 c1Var = this.f203435b;
                    switch (i19) {
                        case 0:
                            int i110 = c1.f203441z;
                            String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                            stringArray.getClass();
                            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                            ArrayList arrayList = new ArrayList(stringArray.length);
                            for (String str : stringArray) {
                                arrayList.add(c1Var.v6(str));
                            }
                            title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                            return;
                        case 1:
                            int i24 = c1.f203441z;
                            new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                            return;
                        case 2:
                            int i25 = c1.f203441z;
                            Context contextRequireContext = c1Var.requireContext();
                            contextRequireContext.getClass();
                            new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                            return;
                        case 3:
                            int i26 = c1.f203441z;
                            new gg1.b(c1Var.requireContext(), new d1(c1Var));
                            return;
                        case 4:
                            c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                            return;
                        default:
                            int i27 = c1.f203441z;
                            androidx.fragment.app.m activity = c1Var.getActivity();
                            if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                            }
                            c1Var.requireActivity().getWindow().setSoftInputMode(3);
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                            if (styledInlineTextFieldViewDark4 == null) {
                                p005kotlin.jvm.internal.s.m("shortNameEditText");
                                throw null;
                            }
                            String text = styledInlineTextFieldViewDark4.getText();
                            if (text != null) {
                                wn1.h hVar = c1Var.f203457p;
                                if (hVar == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                                if (iB != 0) {
                                    c1Var.O4(String.valueOf(iB));
                                    return;
                                }
                                s2 s2Var = c1Var.f203461v;
                                if (s2Var != null) {
                                    s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                                }
                                long j8 = c1Var.y6().f186219b;
                                wn1.h hVar2 = c1Var.f203457p;
                                if (j8 == -1) {
                                    if (hVar2 != null) {
                                        hVar2.d();
                                        return;
                                    } else {
                                        p005kotlin.jvm.internal.s.m("dtoAssembler");
                                        throw null;
                                    }
                                }
                                if (hVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                                c1Var.f203462w = new f1(c1Var);
                                s2 s2Var2 = c1Var.f203461v;
                                if (s2Var2 != null) {
                                    s2Var2.showProgressOverlay();
                                }
                                if (c1Var.f203457p == null) {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                                com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                                fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                                fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                                fVar.g(weightScaleUserInfoDTOB.f44409c);
                                fVar.h(weightScaleUserInfoDTOB.f44409c);
                                fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                                fVar.j(weightScaleUserInfoDTOB.f44411e);
                                fVar.q(weightScaleUserInfoDTOB.f44412f);
                                fVar.b(weightScaleUserInfoDTOB.f44415i);
                                fVar.m(weightScaleUserInfoDTOB.f44416j);
                                LocalDate localDateC = weightScaleUserInfoDTOB.C();
                                if (localDateC != null) {
                                    fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                                }
                                fVar.k(weightScaleUserInfoDTOB.f44414h);
                                wn1.i0 i0VarM = wn1.i0.M();
                                long j14 = c1Var.y6().f186219b;
                                f1 f1Var = c1Var.f203462w;
                                i0VarM.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        Button button = this.f203456o;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("finishButton");
            throw null;
        }
        final int i19 = 5;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f203435b;

            {
                this.f203435b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view18) {
                View currentFocus;
                int i110 = i19;
                c1 c1Var = this.f203435b;
                switch (i110) {
                    case 0:
                        int i111 = c1.f203441z;
                        String[] stringArray = c1Var.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray.getClass();
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(c1Var.requireContext()).setTitle(R.string.lbl_gender);
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        for (String str : stringArray) {
                            arrayList.add(c1Var.v6(str));
                        }
                        title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(stringArray, c1Var.f203458q.w()), new wq.c(11, c1Var, stringArray)).setNegativeButton(R.string.lbl_cancel, new xk1.v(26)).create().show();
                        return;
                    case 1:
                        int i24 = c1.f203441z;
                        new com.garmin.android.apps.connectmobile.settings.d(c1Var.requireContext(), new a1(c1Var));
                        return;
                    case 2:
                        int i25 = c1.f203441z;
                        Context contextRequireContext = c1Var.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new a1(c1Var), 254, (p005kotlin.jvm.internal.j) null);
                        return;
                    case 3:
                        int i26 = c1.f203441z;
                        new gg1.b(c1Var.requireContext(), new d1(c1Var));
                        return;
                    case 4:
                        c1Var.f203460t.a(new Intent(c1Var.requireContext(), (Class<?>) IndexActivityClassSelectionActivity.class), null);
                        return;
                    default:
                        int i27 = c1.f203441z;
                        androidx.fragment.app.m activity = c1Var.getActivity();
                        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.b(currentFocus);
                        }
                        c1Var.requireActivity().getWindow().setSoftInputMode(3);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = c1Var.f203443b;
                        if (styledInlineTextFieldViewDark4 == null) {
                            p005kotlin.jvm.internal.s.m("shortNameEditText");
                            throw null;
                        }
                        String text = styledInlineTextFieldViewDark4.getText();
                        if (text != null) {
                            wn1.h hVar = c1Var.f203457p;
                            if (hVar == null) {
                                p005kotlin.jvm.internal.s.m("dtoAssembler");
                                throw null;
                            }
                            int iB = hVar.f186235c.b(u0.n(hVar.f186234b, u0.S5) ? 5 : 4, text);
                            if (iB != 0) {
                                c1Var.O4(String.valueOf(iB));
                                return;
                            }
                            s2 s2Var = c1Var.f203461v;
                            if (s2Var != null) {
                                s2Var.showProgressOverlay(c1Var.getString(R.string.txt_saving));
                            }
                            long j8 = c1Var.y6().f186219b;
                            wn1.h hVar2 = c1Var.f203457p;
                            if (j8 == -1) {
                                if (hVar2 != null) {
                                    hVar2.d();
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                                    throw null;
                                }
                            }
                            if (hVar2 == null) {
                                p005kotlin.jvm.internal.s.m("dtoAssembler");
                                throw null;
                            }
                            WeightScaleUserInfoDTO weightScaleUserInfoDTOB = hVar2.b();
                            c1Var.f203462w = new f1(c1Var);
                            s2 s2Var2 = c1Var.f203461v;
                            if (s2Var2 != null) {
                                s2Var2.showProgressOverlay();
                            }
                            if (c1Var.f203457p == null) {
                                p005kotlin.jvm.internal.s.m("dtoAssembler");
                                throw null;
                            }
                            com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f();
                            fVar.o(Integer.valueOf(Long.valueOf(weightScaleUserInfoDTOB.f44407a).intValue()));
                            fVar.f(String.valueOf(weightScaleUserInfoDTOB.f44408b));
                            fVar.g(weightScaleUserInfoDTOB.f44409c);
                            fVar.h(weightScaleUserInfoDTOB.f44409c);
                            fVar.i(com.garmin.android.apps.connectmobile.smartscale.model.f.b.valueOf(weightScaleUserInfoDTOB.f44410d.name()));
                            fVar.j(weightScaleUserInfoDTOB.f44411e);
                            fVar.q(weightScaleUserInfoDTOB.f44412f);
                            fVar.b(weightScaleUserInfoDTOB.f44415i);
                            fVar.m(weightScaleUserInfoDTOB.f44416j);
                            LocalDate localDateC = weightScaleUserInfoDTOB.C();
                            if (localDateC != null) {
                                fVar.d(c22.j0.b(localDateC.toDateTimeAtStartOfDay(), "yyyy-MM-dd'T'HH:mm:ss.SSS", null));
                            }
                            fVar.k(weightScaleUserInfoDTOB.f44414h);
                            wn1.i0 i0VarM = wn1.i0.M();
                            long j14 = c1Var.y6().f186219b;
                            f1 f1Var = c1Var.f203462w;
                            i0VarM.getClass();
                            com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.h(j14, fVar, i0VarM), f1Var);
                            return;
                        }
                        return;
                }
            }
        });
        wn1.h hVar = new wn1.h(y6().f186218a, y6().f186220c, this);
        this.f203457p = hVar;
        hVar.c();
        o53.f0.w(this).b(new c(null));
    }

    public final void u6() {
        s2 s2Var = this.f203461v;
        if (s2Var != null) {
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            } else {
                p005kotlin.jvm.internal.s.m("progressOverlayListener");
                throw null;
            }
        }
    }

    public final String v6(String str) {
        if (d53.u.q(getString(R.string.user_gender_value_male), str, true)) {
            String string = getString(R.string.lbl_gender_male);
            string.getClass();
            return string;
        }
        if (d53.u.q(getString(R.string.user_gender_value_female), str, true)) {
            String string2 = getString(R.string.lbl_gender_female);
            string2.getClass();
            return string2;
        }
        String string3 = getString(R.string.gender_not_specified);
        string3.getClass();
        return string3;
    }

    public final String w6(Float f14) {
        String strN0 = l3.a.n0(l3.f23124b, requireContext(), f14 != null ? f14.floatValue() : -1.0f, this.f203458q.y());
        if (!TextUtils.isEmpty(strN0)) {
            return strN0;
        }
        String string = getString(R.string.activities_value_not_set);
        string.getClass();
        return string;
    }

    @Override // wn1.h.b
    public final void x5() {
        u6();
        b bVar = this.f203464y;
        if (bVar != null) {
            bVar.c5();
        } else {
            p005kotlin.jvm.internal.s.m("onProfileInitOrSaveListener");
            throw null;
        }
    }

    public final wn1.g y6() {
        return (wn1.g) this.f203442a.getValue();
    }

    @Override // wn1.h.b
    public final void z1() {
        wn1.h hVar = this.f203457p;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        hVar.f186235c.getClass();
        String string = getString(R.string.msg_duplicate_short_name);
        string.getClass();
        O4(string);
    }

    public final String z6(Double d14) {
        String strC1 = l3.a.C1(l3.f23124b, requireContext(), d14 != null ? d14.doubleValue() : -1.0d, this.f203458q.y(), false, null, 56);
        if (!TextUtils.isEmpty(strC1)) {
            return strC1;
        }
        String string = getString(R.string.activities_value_not_set);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzb0/c1$a;", "", "<init>", "()V", "", "INVALID", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
