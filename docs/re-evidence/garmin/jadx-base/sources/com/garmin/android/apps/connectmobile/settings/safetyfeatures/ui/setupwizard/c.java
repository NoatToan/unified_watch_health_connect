package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pj1.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/c;", "Ldv/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends dv.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f43896j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43897b = new w1(s0.f105811a.b(s.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f43898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f43899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f43900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MultiLineImeEditText f43901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f43902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f43903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f43904i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43905a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43905a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0819c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43906a;

        public C0819c(l lVar) {
            lVar.getClass();
            this.f43906a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43906a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43906a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43907a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43907a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43908a = aVar;
            this.f43909b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43908a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43909b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43910a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43910a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.safety_feature_setup_emergency_notes_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.button_finish_setup);
        viewFindViewById.getClass();
        this.f43904i = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.add_notes);
        viewFindViewById2.getClass();
        this.f43898c = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.multi_line_option_button);
        viewFindViewById3.getClass();
        this.f43902g = viewFindViewById3;
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.notes_edit_text);
        viewFindViewById4.getClass();
        this.f43901f = (MultiLineImeEditText) viewFindViewById4;
        View view3 = this.f43902g;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("notesMultiLineOption");
            throw null;
        }
        View viewFindViewById5 = view3.findViewById(R.id.clear_button);
        viewFindViewById5.getClass();
        this.f43903h = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.display_notes_layout);
        viewFindViewById6.getClass();
        this.f43899d = viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.emergency_notes_layout);
        viewFindViewById7.getClass();
        this.f43900e = viewFindViewById7;
        viewFindViewById7.setVisibility(0);
        View view4 = this.f43898c;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("addNotesOption");
            throw null;
        }
        ((TextView) view4.findViewById(R.id.left_option_label)).setText(getString(R.string.lte_add_emergency_notes));
        v6();
        View view5 = this.f43904i;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mSetupCompleteBtn");
            throw null;
        }
        view5.setOnClickListener(new zj1.f(this, 3));
        ((s) this.f43897b.getValue()).H0.f(getViewLifecycleOwner(), new C0819c(new yw2.h(this, 12)));
    }

    public final void v6() {
        View view2 = this.f43900e;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("notesLayout");
            throw null;
        }
        view2.setAlpha(1.0f);
        View view3 = this.f43900e;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("notesLayout");
            throw null;
        }
        view3.setClickable(true);
        View view4 = this.f43898c;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("addNotesOption");
            throw null;
        }
        view4.setOnClickListener(new zj1.f(this, 0));
        MultiLineImeEditText multiLineImeEditText = this.f43901f;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("notesEditText");
            throw null;
        }
        multiLineImeEditText.setTextEntryDoneListener(new xw.b(this, 9));
        View view5 = this.f43903h;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("notesTextClearButton");
            throw null;
        }
        view5.setOnClickListener(new zj1.f(this, 1));
        MultiLineImeEditText multiLineImeEditText2 = this.f43901f;
        if (multiLineImeEditText2 == null) {
            p005kotlin.jvm.internal.s.m("notesEditText");
            throw null;
        }
        multiLineImeEditText2.setExtraOnFocusChangeListener(new c32.f(this, 17));
        MultiLineImeEditText multiLineImeEditText3 = this.f43901f;
        if (multiLineImeEditText3 != null) {
            multiLineImeEditText3.setExtraOnClickListener(new zj1.f(this, 2));
        } else {
            p005kotlin.jvm.internal.s.m("notesEditText");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/setupwizard/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
