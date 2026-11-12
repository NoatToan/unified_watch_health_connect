package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineSingleTextFieldViewDark;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import sg0.w0;
import ty1.h0;
import ty1.t0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/o;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f46150j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StyledInlineSingleTextFieldViewDark f46154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k32.e<ny1.g> f46155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k32.e<ny1.g> f46156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f46157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MultiLineImeEditText f46158i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46159a;

        static {
            int[] iArr = new int[ny1.g.values().length];
            try {
                iArr[ny1.g.IN_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ny1.g.VIRTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46159a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/o$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            o oVar = o.this;
            AddTIEventViewModel addTIEventViewModelA6 = oVar.A6();
            MultiLineImeEditText multiLineImeEditText = oVar.f46158i;
            if (multiLineImeEditText == null) {
                p005kotlin.jvm.internal.s.m("multiLineImeEditText");
                throw null;
            }
            addTIEventViewModelA6.K6(multiLineImeEditText.getEditableText().toString());
            oVar.f46153d.f(false);
            oVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46161a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46161a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46161a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46161a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46162a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46162a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46163a = aVar;
            this.f46164b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46163a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46164b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46165a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46165a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public o() {
        super(R.layout.ti_add_event_name_fragment);
        this.f46152c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46153d = new c();
    }

    public final AddTIEventViewModel A6() {
        return (AddTIEventViewModel) this.f46152c.getValue();
    }

    public final void C6(String str) {
        if (TextUtils.isEmpty(str)) {
            Button button = this.f46157h;
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
        if (str != null) {
            StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = this.f46154e;
            if (styledInlineSingleTextFieldViewDark == null) {
                p005kotlin.jvm.internal.s.m("eventNameView");
                throw null;
            }
            styledInlineSingleTextFieldViewDark.setSelected(false);
            StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark2 = this.f46154e;
            if (styledInlineSingleTextFieldViewDark2 == null) {
                p005kotlin.jvm.internal.s.m("eventNameView");
                throw null;
            }
            styledInlineSingleTextFieldViewDark2.k();
            A6().K6(str);
            Button button2 = this.f46157h;
            if (button2 != null) {
                button2.setEnabled(true);
            } else {
                p005kotlin.jvm.internal.s.m("nextButton");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46151b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventNameFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = this.f46154e;
        if (styledInlineSingleTextFieldViewDark == null) {
            p005kotlin.jvm.internal.s.m("eventNameView");
            throw null;
        }
        styledInlineSingleTextFieldViewDark.invalidate();
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark2 = this.f46154e;
        if (styledInlineSingleTextFieldViewDark2 != null) {
            styledInlineSingleTextFieldViewDark2.performClick();
        } else {
            p005kotlin.jvm.internal.s.m("eventNameView");
            throw null;
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46151b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46153d, viewLifecycleOwner);
        ht.a aVar2 = ht.a.f85464a;
        final int i14 = 1;
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("EventCreationType", "CreateAnEvent");
        Unit unit = Unit.INSTANCE;
        aVar2.getClass();
        ht.a.a(bundle2, "EventCreationTypeSelection");
        View viewFindViewById = view2.findViewById(R.id.event_name);
        viewFindViewById.getClass();
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = (StyledInlineSingleTextFieldViewDark) viewFindViewById;
        this.f46154e = styledInlineSingleTextFieldViewDark;
        View viewFindViewById2 = styledInlineSingleTextFieldViewDark.findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById2.getClass();
        this.f46158i = (MultiLineImeEditText) viewFindViewById2;
        this.f46155f = new k32.e<>(view2.findViewById(R.id.in_person_chip), ny1.g.IN_PERSON, false, 4, null);
        this.f46156g = new k32.e<>(view2.findViewById(R.id.virtual_chip), ny1.g.VIRTUAL, false, 4, null);
        View viewFindViewById3 = view2.findViewById(R.id.fragment_next_button);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f46157h = button;
        String strD = A6().x5().d();
        if (strD == null) {
            strD = "";
        }
        button.setEnabled(!TextUtils.isEmpty(strD));
        k32.e<ny1.g> eVar = this.f46155f;
        if (eVar == null) {
            p005kotlin.jvm.internal.s.m("inPersonChip");
            throw null;
        }
        eVar.d(R.string.in_person_event);
        k32.e<ny1.g> eVar2 = this.f46156g;
        if (eVar2 == null) {
            p005kotlin.jvm.internal.s.m("virtualChip");
            throw null;
        }
        eVar2.d(R.string.virtual_event);
        k32.e<ny1.g> eVar3 = this.f46155f;
        if (eVar3 == null) {
            p005kotlin.jvm.internal.s.m("inPersonChip");
            throw null;
        }
        k32.e<ny1.g> eVar4 = this.f46156g;
        if (eVar4 == null) {
            p005kotlin.jvm.internal.s.m("virtualChip");
            throw null;
        }
        new k32.c(p13.x.k(eVar3, eVar4), new t0(this), new l32.d());
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark2 = this.f46154e;
        if (styledInlineSingleTextFieldViewDark2 == null) {
            p005kotlin.jvm.internal.s.m("eventNameView");
            throw null;
        }
        String strD2 = A6().x5().d();
        styledInlineSingleTextFieldViewDark2.i(new h32.e.d(strD2 == null ? "" : strD2, "", 50, null, new w0(this, 29), new e23.l(this) { // from class: ty1.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.o f167222b;

            {
                this.f167222b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.o oVar = this.f167222b;
                switch (i15) {
                    case 0:
                        ny1.g gVar = (ny1.g) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.o.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.f46150j;
                        if (gVar != null) {
                            int i16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.b.f46159a[gVar.ordinal()];
                            if (i16 == 1) {
                                k32.e<ny1.g> eVar5 = oVar.f46155f;
                                if (eVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("inPersonChip");
                                    throw null;
                                }
                                eVar5.c(true);
                                k32.e<ny1.g> eVar6 = oVar.f46156g;
                                if (eVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("virtualChip");
                                    throw null;
                                }
                                eVar6.c(false);
                            } else {
                                if (i16 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                k32.e<ny1.g> eVar7 = oVar.f46155f;
                                if (eVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("inPersonChip");
                                    throw null;
                                }
                                eVar7.c(false);
                                k32.e<ny1.g> eVar8 = oVar.f46156g;
                                if (eVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("virtualChip");
                                    throw null;
                                }
                                eVar8.c(true);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        String str = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.o.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.f46150j;
                        str.getClass();
                        MultiLineImeEditText multiLineImeEditText = oVar.f46158i;
                        if (multiLineImeEditText == null) {
                            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
                            throw null;
                        }
                        multiLineImeEditText.setCursorVisible(false);
                        oVar.C6(str);
                        return Unit.INSTANCE;
                }
            }
        }, null, null, 147456, false, null, Boolean.TRUE, 1736, null));
        Button button2 = this.f46157h;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("nextButton");
            throw null;
        }
        button2.setOnClickListener(new t61.m(this, 14));
        MultiLineImeEditText multiLineImeEditText = this.f46158i;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText.setTextEntryDoneListener(new ty1.s0(this));
        MultiLineImeEditText multiLineImeEditText2 = this.f46158i;
        if (multiLineImeEditText2 == null) {
            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText2.setTextUpdatedListener(new ty1.s0(this));
        final int i15 = 0;
        ((androidx.lifecycle.s0) A6().H0.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.o f167222b;

            {
                this.f167222b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.o oVar = this.f167222b;
                switch (i16) {
                    case 0:
                        ny1.g gVar = (ny1.g) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.o.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.f46150j;
                        if (gVar != null) {
                            int i17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.b.f46159a[gVar.ordinal()];
                            if (i17 == 1) {
                                k32.e<ny1.g> eVar5 = oVar.f46155f;
                                if (eVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("inPersonChip");
                                    throw null;
                                }
                                eVar5.c(true);
                                k32.e<ny1.g> eVar6 = oVar.f46156g;
                                if (eVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("virtualChip");
                                    throw null;
                                }
                                eVar6.c(false);
                            } else {
                                if (i17 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                k32.e<ny1.g> eVar7 = oVar.f46155f;
                                if (eVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("inPersonChip");
                                    throw null;
                                }
                                eVar7.c(false);
                                k32.e<ny1.g> eVar8 = oVar.f46156g;
                                if (eVar8 == null) {
                                    p005kotlin.jvm.internal.s.m("virtualChip");
                                    throw null;
                                }
                                eVar8.c(true);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        String str = (String) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.o.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.f46150j;
                        str.getClass();
                        MultiLineImeEditText multiLineImeEditText3 = oVar.f46158i;
                        if (multiLineImeEditText3 == null) {
                            p005kotlin.jvm.internal.s.m("multiLineImeEditText");
                            throw null;
                        }
                        multiLineImeEditText3.setCursorVisible(false);
                        oVar.C6(str);
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
