package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f48957k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f48958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f48959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f48960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f48961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f48962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f48963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f48964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InlineUnitsTextFieldView f48965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f48966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMComplexOneLineButton f48967j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48968a;

        static {
            int[] iArr = new int[x52.h.values().length];
            try {
                iArr[x52.h.f189116c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x52.h.f189117d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x52.h.f189118e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x52.h.f189119f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x52.h.f189120g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x52.h.f189121h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f48968a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f48969a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f48969a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f48969a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48969a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48970a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48970a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0956e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f48972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0956e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f48971a = aVar;
            this.f48972b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48971a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48972b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f48973a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f48973a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48973a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        super(R.layout.workout_pool_size);
        this.f48958a = new w1(s0.f105811a.b(f62.l.class), new d(this), new f(this), new C0956e(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.twenty_five_meter_button);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        gCMComplexOneLineButton.getClass();
        gCMComplexOneLineButton.f(u6().z4(x52.h.f189116c));
        viewFindViewById.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById;
        this.f48960c = gCMComplexOneLineButton2;
        final int i14 = 0;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView = eVar.f48966i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView2.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = eVar.f48965h;
                            if (inlineUnitsTextFieldView3 != null) {
                                inlineUnitsTextFieldView3.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.twenty_five_yard_button);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById2;
        gCMComplexOneLineButton3.getClass();
        gCMComplexOneLineButton3.f(u6().z4(x52.h.f189117d));
        viewFindViewById2.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) viewFindViewById2;
        this.f48961d = gCMComplexOneLineButton4;
        final int i15 = 2;
        gCMComplexOneLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView = eVar.f48966i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView2.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = eVar.f48965h;
                            if (inlineUnitsTextFieldView3 != null) {
                                inlineUnitsTextFieldView3.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.fifty_meter_button);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) viewFindViewById3;
        gCMComplexOneLineButton5.getClass();
        gCMComplexOneLineButton5.f(u6().z4(x52.h.f189118e));
        viewFindViewById3.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton6 = (GCMComplexOneLineButton) viewFindViewById3;
        this.f48962e = gCMComplexOneLineButton6;
        final int i16 = 3;
        gCMComplexOneLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView = eVar.f48966i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView2.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = eVar.f48965h;
                            if (inlineUnitsTextFieldView3 != null) {
                                inlineUnitsTextFieldView3.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById4 = view2.findViewById(R.id.thirty_three_meter_button);
        GCMComplexOneLineButton gCMComplexOneLineButton7 = (GCMComplexOneLineButton) viewFindViewById4;
        gCMComplexOneLineButton7.getClass();
        gCMComplexOneLineButton7.f(u6().z4(x52.h.f189119f));
        viewFindViewById4.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton8 = (GCMComplexOneLineButton) viewFindViewById4;
        this.f48963f = gCMComplexOneLineButton8;
        final int i17 = 4;
        gCMComplexOneLineButton8.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView = eVar.f48966i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView2.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = eVar.f48965h;
                            if (inlineUnitsTextFieldView3 != null) {
                                inlineUnitsTextFieldView3.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById5 = view2.findViewById(R.id.thirty_three_yard_button);
        GCMComplexOneLineButton gCMComplexOneLineButton9 = (GCMComplexOneLineButton) viewFindViewById5;
        gCMComplexOneLineButton9.getClass();
        gCMComplexOneLineButton9.f(u6().z4(x52.h.f189120g));
        viewFindViewById5.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton10 = (GCMComplexOneLineButton) viewFindViewById5;
        this.f48964g = gCMComplexOneLineButton10;
        final int i18 = 5;
        gCMComplexOneLineButton10.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView = eVar.f48966i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = eVar.f48965h;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = eVar.f48965h;
                        if (inlineUnitsTextFieldView2 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView2.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = eVar.f48965h;
                            if (inlineUnitsTextFieldView3 != null) {
                                inlineUnitsTextFieldView3.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById6 = view2.findViewById(R.id.custom_pool_size);
        viewFindViewById6.getClass();
        this.f48965h = (InlineUnitsTextFieldView) viewFindViewById6;
        this.f48959b = a7.b.getDrawable(view2.getContext(), 2131232298);
        View viewFindViewById7 = view2.findViewById(R.id.custom_pool_size_footer);
        viewFindViewById7.getClass();
        TextView textView = (TextView) viewFindViewById7;
        this.f48966i = textView;
        textView.setText(getString(R.string.msg_invalid_custom_pool_size_warning, 14, 150));
        TextView textView2 = this.f48966i;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
            throw null;
        }
        textView2.setVisibility(8);
        u6();
        if (f62.l.x4(u6().y4()) != null) {
            u6().f69269b = null;
        } else {
            u6().f69269b = u6().y4();
        }
        f62.i iVar = u6().f69269b;
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f48965h;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView.setNumberOfDecimalsAllowed(0);
        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f48965h;
        if (inlineUnitsTextFieldView2 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView2.setUseShortActionLabel(true);
        InlineUnitsTextFieldView inlineUnitsTextFieldView3 = this.f48965h;
        if (inlineUnitsTextFieldView3 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView3.setPickerTitle(getString(R.string.lbl_workout_preferred_units));
        InlineUnitsTextFieldView inlineUnitsTextFieldView4 = this.f48965h;
        if (inlineUnitsTextFieldView4 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView4.setEditHintText(getString(R.string.lbl_enter_custom_pool_size));
        InlineUnitsTextFieldView inlineUnitsTextFieldView5 = this.f48965h;
        if (inlineUnitsTextFieldView5 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView5.setImageIcon(this.f48959b);
        InlineUnitsTextFieldView inlineUnitsTextFieldView6 = this.f48965h;
        if (iVar != null) {
            if (inlineUnitsTextFieldView6 == null) {
                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                throw null;
            }
            inlineUnitsTextFieldView6.h(iVar.a());
        } else {
            if (inlineUnitsTextFieldView6 == null) {
                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                throw null;
            }
            inlineUnitsTextFieldView6.h(false);
        }
        InlineUnitsTextFieldView inlineUnitsTextFieldView7 = this.f48965h;
        if (inlineUnitsTextFieldView7 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        f62.k kVar = new f62.k(this, 0);
        if ((iVar != null ? iVar.f69254b : null) != null) {
            inlineUnitsTextFieldView7.m(iVar.f69253a, iVar.f69254b);
        } else {
            inlineUnitsTextFieldView7.m(null, m52.j.f116747g);
        }
        m52.j.f116744d.getClass();
        inlineUnitsTextFieldView7.setUnitList(p13.x.k(m52.j.f116747g, m52.j.f116748h));
        inlineUnitsTextFieldView7.setOnDoneEditingNumber(new dh1.a(kVar, 25));
        InlineUnitsTextFieldView inlineUnitsTextFieldView8 = this.f48965h;
        if (inlineUnitsTextFieldView8 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        final int i19 = 1;
        inlineUnitsTextFieldView8.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView3 = eVar.f48966i;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView3, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView9 = eVar.f48965h;
                        if (inlineUnitsTextFieldView9 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView9.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView10 = eVar.f48965h;
                        if (inlineUnitsTextFieldView10 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView10.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView11 = eVar.f48965h;
                            if (inlineUnitsTextFieldView11 != null) {
                                inlineUnitsTextFieldView11.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById8 = view2.findViewById(R.id.unspecified_button);
        GCMComplexOneLineButton gCMComplexOneLineButton11 = (GCMComplexOneLineButton) viewFindViewById8;
        gCMComplexOneLineButton11.getClass();
        gCMComplexOneLineButton11.f(u6().z4(x52.h.f189121h));
        viewFindViewById8.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton12 = (GCMComplexOneLineButton) viewFindViewById8;
        this.f48967j = gCMComplexOneLineButton12;
        final int i24 = 6;
        gCMComplexOneLineButton12.setOnClickListener(new View.OnClickListener(this) { // from class: f62.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.e f69259b;

            {
                this.f69259b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e eVar = this.f69259b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189116c);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.y6();
                        TextView textView3 = eVar.f48966i;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeFooter");
                            throw null;
                        }
                        v22.e.r(textView3, true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView9 = eVar.f48965h;
                        if (inlineUnitsTextFieldView9 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        inlineUnitsTextFieldView9.setEditingMode(true);
                        InlineUnitsTextFieldView inlineUnitsTextFieldView10 = eVar.f48965h;
                        if (inlineUnitsTextFieldView10 == null) {
                            p005kotlin.jvm.internal.s.m("customPoolSizeView");
                            throw null;
                        }
                        if (inlineUnitsTextFieldView10.getHasError()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView11 = eVar.f48965h;
                            if (inlineUnitsTextFieldView11 != null) {
                                inlineUnitsTextFieldView11.h(false);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("customPoolSizeView");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189117d);
                        return;
                    case 3:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189118e);
                        return;
                    case 4:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar5 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189119f);
                        return;
                    case 5:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar6 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189120g);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar7 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                        eVar.w6(x52.h.f189121h);
                        return;
                }
            }
        });
        View viewFindViewById9 = view2.findViewById(R.id.unspecified_footer);
        viewFindViewById9.getClass();
        ((TextView) viewFindViewById9).setText(getString(R.string.msg_workout_unspecified_footer_v2));
        u6().f69272e.f(getViewLifecycleOwner(), new c(new f62.k(this, 1)));
        u6().f69274g.f(getViewLifecycleOwner(), new c(new f62.k(this, 2)));
        u6().f69276i.f(getViewLifecycleOwner(), new c(new f62.k(this, 3)));
    }

    public final f62.l u6() {
        return (f62.l) this.f48958a.getValue();
    }

    public final void v6() {
        if (u6().f69270c) {
            new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.lbl_invalid_pool_size).setMessage(getString(R.string.msg_invalid_pool_size_alert, 14, 150)).setPositiveButton(getString(R.string.common_button_ok), new f20.i(2)).show();
        } else {
            requireActivity().onBackPressed();
        }
    }

    public final void w6(x52.h hVar) {
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f48965h;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        EditText editText = inlineUnitsTextFieldView.editText;
        editText.clearFocus();
        v22.e.c(editText, inlineUnitsTextFieldView);
        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f48965h;
        if (inlineUnitsTextFieldView2 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView2.setEditTextValue("");
        InlineUnitsTextFieldView inlineUnitsTextFieldView3 = this.f48965h;
        if (inlineUnitsTextFieldView3 == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView3.setHasError(false);
        u6().f69269b = null;
        u6().f69270c = false;
        f62.l lVarU6 = u6();
        hVar.getClass();
        ((y0) lVarU6.f69271d.getValue()).j(hVar);
        f62.i iVar = hVar.f189123a;
        iVar.getClass();
        lVarU6.f69268a = iVar;
        v6();
    }

    public final void y6() {
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f48960c;
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("twentyFiveMeterButton");
            throw null;
        }
        gCMComplexOneLineButton.f(false);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f48961d;
        if (gCMComplexOneLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("twentyFiveYardButton");
            throw null;
        }
        gCMComplexOneLineButton2.f(false);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f48962e;
        if (gCMComplexOneLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("fiftyMeterButton");
            throw null;
        }
        gCMComplexOneLineButton3.f(false);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f48963f;
        if (gCMComplexOneLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("thirtyThreeMeterButton");
            throw null;
        }
        gCMComplexOneLineButton4.f(false);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f48964g;
        if (gCMComplexOneLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("thirtyThreeYardButton");
            throw null;
        }
        gCMComplexOneLineButton5.f(false);
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f48965h;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("customPoolSizeView");
            throw null;
        }
        inlineUnitsTextFieldView.h(false);
        GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f48967j;
        if (gCMComplexOneLineButton6 != null) {
            gCMComplexOneLineButton6.f(false);
        } else {
            p005kotlin.jvm.internal.s.m("unspecifiedButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "POOL_LENGTH_MINIMUM", "I", "POOL_LENGTH_MAXIMUM", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
