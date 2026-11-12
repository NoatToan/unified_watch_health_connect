package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.q1;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.UserNoteActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view.ExpandableTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import f12.l;
import hx0.j;
import hx0.k;
import hx0.o0;
import hx0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.w3;
import o13.m;
import o13.n;
import o13.t;
import o53.l1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;
import q92.x;
import ww0.o;
import ww0.p;
import ww0.r;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/d;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends m0 {
    public static final a Q0 = new a(null);
    public Button A;
    public Button B;
    public TextView C;
    public TextView D;
    public View E;
    public ComposeView F;
    public View H0;
    public View I;
    public View I0;
    public View J0;
    public View K0;
    public View L0;
    public View M0;
    public TextView N0;
    public TextView O0;
    public View P;
    public Button P0;
    public View T;
    public TextView X;
    public BubbleLayout Y;
    public ExpandableTextView Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f38906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f38907i = m.a(n.NONE, new f(this, null, new e(this), null, null));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f38908j = new w1(s0.f105811a.b(o0.class), new g(this), new i(this), new h(null, this));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f38909k = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f38910k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f38911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f38912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f38914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public NestedScrollView f38915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f38916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f38917r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f38918t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f38919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f38920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f38921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f38922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f38923z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        Calendar,
        Symptoms,
        Notes
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38928a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Calendar.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Symptoms.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Notes.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38928a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0690d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f38929a;

        public C0690d(e23.l lVar) {
            lVar.getClass();
            this.f38929a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38929a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38929a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38930a;

        public e(Fragment fragment) {
            this.f38930a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f38930a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38935e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38931a = fragment;
            this.f38932b = qualifier;
            this.f38933c = aVar;
            this.f38934d = aVar2;
            this.f38935e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38933c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f38931a;
            e23.a aVar = this.f38934d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), f189591b, null, defaultViewModelCreationExtras, this.f38932b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38935e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f38936a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38936a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f38938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f38937a = aVar;
            this.f38938b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38937a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38938b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f38939a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f38939a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d() {
        final int i14 = 0;
        this.f38906h = m.b(new e23.a(this) { // from class: hx0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d f86101b;

            {
                this.f86101b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String string;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = this.f86101b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Bundle arguments = dVar.getArguments();
                        if (arguments != null && (string = arguments.getString("date")) != null) {
                            return LocalDate.parse(string);
                        }
                        vb.h.z("Can't display cycle data without day.");
                        return null;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context = dVar.getContext();
                        if (context != null) {
                            return new r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context2 = dVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.f38911l = m.b(new e23.a(this) { // from class: hx0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d f86101b;

            {
                this.f86101b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String string;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = this.f86101b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Bundle arguments = dVar.getArguments();
                        if (arguments != null && (string = arguments.getString("date")) != null) {
                            return LocalDate.parse(string);
                        }
                        vb.h.z("Can't display cycle data without day.");
                        return null;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context = dVar.getContext();
                        if (context != null) {
                            return new r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context2 = dVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
        final int i16 = 2;
        this.f38912m = m.b(new e23.a(this) { // from class: hx0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d f86101b;

            {
                this.f86101b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                String string;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar = this.f86101b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Bundle arguments = dVar.getArguments();
                        if (arguments != null && (string = arguments.getString("date")) != null) {
                            return LocalDate.parse(string);
                        }
                        vb.h.z("Can't display cycle data without day.");
                        return null;
                    case 1:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context = dVar.getContext();
                        if (context != null) {
                            return new r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar3 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                        Context context2 = dVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        T6().C4(S6());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x024a  */
    /* JADX WARN: Code duplicated, block: B:105:0x024e  */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    public final void I6(ww0.l lVar) {
        boolean z14;
        Integer educationContentMod;
        Integer currentPhase;
        Integer cycleDay;
        Integer predictedCycleLength;
        l.a aVar;
        xx0.a aVarA;
        TextView textView;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView2;
        mx0.b.a aVar2 = mx0.b.f121335a;
        LocalDate localDateS6 = S6();
        aVar2.getClass();
        if ((lVar != null ? lVar.getEducationContentMod() : null) == null) {
            i52.a.f91796a.getClass();
            if (i52.a.l() != ww0.a.NONE) {
                aVarA = null;
            } else {
                i52.a.f91796a.getClass();
                if (i52.a.o() != ww0.i.NONE) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (lVar != null) {
                    educationContentMod = lVar.getEducationContentMod();
                } else {
                    educationContentMod = null;
                }
                if (lVar != null) {
                    currentPhase = lVar.getCurrentPhase();
                } else {
                    currentPhase = null;
                }
                if (lVar != null) {
                    cycleDay = lVar.getCycleDay();
                } else {
                    cycleDay = null;
                }
                if (lVar != null) {
                    predictedCycleLength = lVar.getPredictedCycleLength();
                } else {
                    predictedCycleLength = null;
                }
                if (i52.a.l() != ww0.a.NONE || educationContentMod == null || currentPhase == null || cycleDay == null) {
                    aVar = l.f68084a;
                    aVar.getClass();
                    if (l.a.a().u() < 45) {
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.getClass();
                        if (i52.a.q()) {
                            aVar.getClass();
                            if (l.a.a().G4()) {
                                int dayOfYear = localDateS6.getDayOfYear() / 5;
                                List<xx0.a> list = mx0.b.f121344j;
                                aVarA = list.get(dayOfYear % list.size());
                            }
                        }
                        if (z14) {
                            int dayOfYear2 = localDateS6.getDayOfYear() / 5;
                            List<xx0.a> list2 = mx0.b.f121342h;
                            aVarA = list2.get(dayOfYear2 % list2.size());
                        } else {
                            int dayOfYear3 = localDateS6.getDayOfYear() / 5;
                            List<xx0.a> list3 = mx0.b.f121343i;
                            aVarA = list3.get(dayOfYear3 % list3.size());
                        }
                    } else {
                        int dayOfYear4 = localDateS6.getDayOfYear() / 5;
                        List<xx0.a> list4 = mx0.b.f121344j;
                        aVarA = list4.get(dayOfYear4 % list4.size());
                    }
                } else if (z14) {
                    if (currentPhase.intValue() == 1) {
                        aVarA = mx0.b.a.a(currentPhase.intValue(), educationContentMod.intValue());
                    } else if (!com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a) || predictedCycleLength == null || predictedCycleLength.intValue() - cycleDay.intValue() > 7) {
                        int iIntValue = (cycleDay.intValue() / 5) + educationContentMod.intValue();
                        List<xx0.a> list5 = mx0.b.f121342h;
                        aVarA = list5.get(iIntValue % list5.size());
                    } else {
                        int iIntValue2 = educationContentMod.intValue();
                        List<xx0.a> list6 = mx0.b.f121341g;
                        aVarA = list6.get(iIntValue2 % list6.size());
                    }
                } else if (currentPhase.intValue() == 1 || com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
                    aVarA = mx0.b.a.a(currentPhase.intValue(), educationContentMod.intValue());
                } else {
                    int iIntValue3 = (cycleDay.intValue() / 5) + educationContentMod.intValue();
                    List<xx0.a> list7 = mx0.b.f121343i;
                    aVarA = list7.get(iIntValue3 % list7.size());
                }
            }
        } else {
            i52.a.f91796a.getClass();
            if (i52.a.o() != ww0.i.NONE) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (lVar != null) {
                educationContentMod = lVar.getEducationContentMod();
            } else {
                educationContentMod = null;
            }
            if (lVar != null) {
                currentPhase = lVar.getCurrentPhase();
            } else {
                currentPhase = null;
            }
            if (lVar != null) {
                cycleDay = lVar.getCycleDay();
            } else {
                cycleDay = null;
            }
            if (lVar != null) {
                predictedCycleLength = lVar.getPredictedCycleLength();
            } else {
                predictedCycleLength = null;
            }
            if (i52.a.l() != ww0.a.NONE) {
                aVar = l.f68084a;
                aVar.getClass();
                if (l.a.a().u() < 45) {
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.getClass();
                    if (i52.a.q()) {
                        aVar.getClass();
                        if (l.a.a().G4()) {
                            int dayOfYear5 = localDateS6.getDayOfYear() / 5;
                            List<xx0.a> list8 = mx0.b.f121344j;
                            aVarA = list8.get(dayOfYear5 % list8.size());
                        }
                    }
                    if (z14) {
                        int dayOfYear6 = localDateS6.getDayOfYear() / 5;
                        List<xx0.a> list9 = mx0.b.f121342h;
                        aVarA = list9.get(dayOfYear6 % list9.size());
                    } else {
                        int dayOfYear7 = localDateS6.getDayOfYear() / 5;
                        List<xx0.a> list10 = mx0.b.f121343i;
                        aVarA = list10.get(dayOfYear7 % list10.size());
                    }
                } else {
                    int dayOfYear8 = localDateS6.getDayOfYear() / 5;
                    List<xx0.a> list11 = mx0.b.f121344j;
                    aVarA = list11.get(dayOfYear8 % list11.size());
                }
            } else {
                aVar = l.f68084a;
                aVar.getClass();
                if (l.a.a().u() < 45) {
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.getClass();
                    if (i52.a.q()) {
                        aVar.getClass();
                        if (l.a.a().G4()) {
                            int dayOfYear9 = localDateS6.getDayOfYear() / 5;
                            List<xx0.a> list12 = mx0.b.f121344j;
                            aVarA = list12.get(dayOfYear9 % list12.size());
                        }
                    }
                    if (z14) {
                        int dayOfYear10 = localDateS6.getDayOfYear() / 5;
                        List<xx0.a> list13 = mx0.b.f121342h;
                        aVarA = list13.get(dayOfYear10 % list13.size());
                    } else {
                        int dayOfYear11 = localDateS6.getDayOfYear() / 5;
                        List<xx0.a> list14 = mx0.b.f121343i;
                        aVarA = list14.get(dayOfYear11 % list14.size());
                    }
                } else {
                    int dayOfYear12 = localDateS6.getDayOfYear() / 5;
                    List<xx0.a> list15 = mx0.b.f121344j;
                    aVarA = list15.get(dayOfYear12 % list15.size());
                }
            }
        }
        if (getContext() == null || aVarA == null) {
            ExpandableTextView expandableTextView = this.Z;
            if (expandableTextView == null) {
                s.m("menstrualCycleDayEducationText");
                throw null;
            }
            expandableTextView.setVisibility(8);
            TextView textView3 = this.X;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            } else {
                s.m("menstrualCycleDayTimeRemainingLabel");
                throw null;
            }
        }
        xx0.a.EnumC3592a enumC3592a = aVarA.f192507b;
        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
            i52.a.f91796a.getClass();
            if (i52.a.l() == ww0.a.NONE) {
                textView = this.X;
                if (textView != null) {
                    s.m("menstrualCycleDayTimeRemainingLabel");
                    throw null;
                }
                layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                textView2 = this.X;
                if (textView2 != null) {
                    s.m("menstrualCycleDayTimeRemainingLabel");
                    throw null;
                }
                textView2.setText(getString(R.string.mct_know_your_body));
            }
        } else {
            textView = this.X;
            if (textView != null) {
                s.m("menstrualCycleDayTimeRemainingLabel");
                throw null;
            }
            layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            textView2 = this.X;
            if (textView2 != null) {
                s.m("menstrualCycleDayTimeRemainingLabel");
                throw null;
            }
            textView2.setText(getString(R.string.mct_know_your_body));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = contextRequireContext.getString(enumC3592a.getId());
        string.getClass();
        q1 q1Var = new q1(d53.n.d(contextRequireContext.getString(aVarA.f192506a) + "\n            |\n            |" + string + "\n            "), string, aVarA.f192508c, contextRequireContext, R.color.gcm_text_primary_action);
        ExpandableTextView expandableTextView2 = this.Z;
        if (expandableTextView2 == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        String string2 = contextRequireContext2.getString(enumC3592a.getId());
        string2.getClass();
        expandableTextView2.f39204f = false;
        expandableTextView2.f39202d = q1Var;
        expandableTextView2.f39203e = string2;
        expandableTextView2.getViewTreeObserver().addOnGlobalLayoutListener(new vx0.a(expandableTextView2, 0));
        expandableTextView2.setText(q1Var);
        ExpandableTextView expandableTextView3 = this.Z;
        if (expandableTextView3 == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        expandableTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        ExpandableTextView expandableTextView4 = this.Z;
        if (expandableTextView4 == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        expandableTextView4.setContentDescription(q1Var);
        TextView textView4 = this.X;
        if (textView4 == null) {
            s.m("menstrualCycleDayTimeRemainingLabel");
            throw null;
        }
        textView4.setVisibility(0);
        ExpandableTextView expandableTextView5 = this.Z;
        if (expandableTextView5 != null) {
            expandableTextView5.setVisibility(0);
        } else {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    public final void J6(ww0.b bVar, Integer num) {
        j0 j0Var;
        Object obj;
        RandomAccess randomAccess;
        View view2;
        ArrayList arrayList;
        if (bVar != null) {
            arrayList = new ArrayList();
            ww0.h flow = bVar.getFlow();
            if (flow != null) {
                arrayList.add(flow);
            }
            List<ww0.t> listO = bVar.o();
            if (listO != null) {
                ww0.t.a aVar = ww0.t.f187658a;
                ArrayList arrayListZ = h0.Z(listO);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                aVar.getClass();
                arrayList.addAll(ww0.t.a.a(contextRequireContext, arrayListZ));
            }
            List<p> listI = bVar.i();
            if (listI != null) {
                p.a aVar2 = p.f187627a;
                ArrayList arrayListZ2 = h0.Z(listI);
                aVar2.getClass();
                arrayList.addAll(h0.N0(arrayListZ2, new o()));
            }
            List<ww0.e> listG = bVar.g();
            if (listG != null) {
                ww0.e.a aVar3 = ww0.e.f187542a;
                ArrayList arrayListZ3 = h0.Z(listG);
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                aVar3.getClass();
                arrayList.addAll(ww0.e.a.a(contextRequireContext2, arrayListZ3));
            }
            ww0.s sexualActivity = bVar.getSexualActivity();
            obj = arrayList;
            if (sexualActivity != null) {
                arrayList.add(sexualActivity);
            }
        } else {
            j0Var = j0.f134944a;
        }
        if (bVar != null) {
            obj = j0Var;
            Context context = getContext();
            if (context == null) {
                randomAccess = j0.f134944a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (s.g(bVar.getIsOvulationDay(), Boolean.TRUE)) {
                    obj = arrayList;
                    String string = getString(R.string.mct_ovulation_day);
                    string.getClass();
                    arrayList2.add(new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e.a(string));
                }
                obj = arrayList;
                r sexDrive = bVar.getSexDrive();
                if (sexDrive != null) {
                    String string2 = context.getString(R.string.mct_level_sex_drive, sexDrive.a(context));
                    string2.getClass();
                    arrayList2.add(new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e.a(string2));
                }
                randomAccess = arrayList2;
            }
            if (randomAccess == null) {
                obj = j0Var;
                obj = arrayList;
                obj = arrayList;
                randomAccess = j0.f134944a;
            }
        } else {
            obj = j0Var;
            obj = arrayList;
            obj = arrayList;
            randomAccess = j0.f134944a;
        }
        obj = arrayList;
        MenstrualCycleSymptomActivity.f38817c.getClass();
        boolean z14 = MenstrualCycleSymptomActivity.a.b(num) || com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.d(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a);
        if (h0.L((Iterable) obj) || h0.L((Iterable) randomAccess)) {
            View view3 = this.f38910k0;
            if (view3 == null) {
                s.m("menstrualCycleDayAddSymptomsGroup");
                throw null;
            }
            view3.setVisibility(8);
            RecyclerView recyclerView = this.f38917r;
            if (recyclerView == null) {
                s.m("menstrualCycleDayDisplaySymptomsList");
                throw null;
            }
            hx0.r rVar = (hx0.r) this.f38911l.getValue();
            rVar.u(obj);
            recyclerView.setAdapter(rVar);
            RecyclerView recyclerView2 = this.f38918t;
            if (recyclerView2 == null) {
                s.m("menstrualCycleDayDisplaySymptomsFlexbox");
                throw null;
            }
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e) this.f38912m.getValue();
            eVar.u(randomAccess);
            recyclerView2.setAdapter(eVar);
            View view4 = this.H0;
            if (view4 == null) {
                s.m("menstrualCycleDayDisplaySymptomsGroup");
                throw null;
            }
            view4.setVisibility(0);
            View view5 = this.f38919v;
            if (z14) {
                if (view5 == null) {
                    s.m("menstrualCycleDayDisplaySymptomsEdit");
                    throw null;
                }
                view5.setVisibility(0);
            } else {
                if (view5 == null) {
                    s.m("menstrualCycleDayDisplaySymptomsEdit");
                    throw null;
                }
                view5.setVisibility(8);
            }
        } else {
            View view6 = this.f38910k0;
            if (z14) {
                if (view6 == null) {
                    s.m("menstrualCycleDayAddSymptomsGroup");
                    throw null;
                }
                view6.setVisibility(0);
            } else {
                if (view6 == null) {
                    s.m("menstrualCycleDayAddSymptomsGroup");
                    throw null;
                }
                view6.setVisibility(8);
            }
            View view7 = this.H0;
            if (view7 == null) {
                s.m("menstrualCycleDayDisplaySymptomsGroup");
                throw null;
            }
            view7.setVisibility(8);
            View view8 = this.f38919v;
            if (view8 == null) {
                s.m("menstrualCycleDayDisplaySymptomsEdit");
                throw null;
            }
            view8.setVisibility(8);
        }
        String notes = bVar != null ? bVar.getNotes() : null;
        if (notes != null && !d53.w.J(notes)) {
            View view9 = this.J0;
            if (view9 == null) {
                s.m("menstrualCycleDayAddNotesGroup");
                throw null;
            }
            view9.setVisibility(8);
            View view10 = this.I0;
            if (view10 == null) {
                s.m("menstrualCycleAddNotesSpace");
                throw null;
            }
            view10.setVisibility(8);
            TextView textView = this.f38920w;
            if (textView == null) {
                s.m("menstrualCycleDayDisplayNotesContent");
                throw null;
            }
            bVar.getClass();
            textView.setText(bVar.getNotes());
            View view11 = this.K0;
            if (view11 != null) {
                view11.setVisibility(0);
                return;
            } else {
                s.m("menstrualCycleDayDisplayNotesGroup");
                throw null;
            }
        }
        View view12 = this.J0;
        if (view12 == null) {
            s.m("menstrualCycleDayAddNotesGroup");
            throw null;
        }
        view12.setVisibility(0);
        View view13 = this.H0;
        if (view13 == null) {
            s.m("menstrualCycleDayDisplaySymptomsGroup");
            throw null;
        }
        if (v22.e.d(view13)) {
            view2 = this.I0;
            if (view2 != null) {
                s.m("menstrualCycleAddNotesSpace");
                throw null;
            }
            view2.setVisibility(8);
        } else {
            View view14 = this.f38910k0;
            if (view14 == null) {
                s.m("menstrualCycleDayAddSymptomsGroup");
                throw null;
            }
            if (v22.e.d(view14)) {
                view2 = this.I0;
                if (view2 != null) {
                    s.m("menstrualCycleAddNotesSpace");
                    throw null;
                }
                view2.setVisibility(8);
            } else {
                View view15 = this.I0;
                if (view15 == null) {
                    s.m("menstrualCycleAddNotesSpace");
                    throw null;
                }
                view15.setVisibility(0);
            }
        }
        View view16 = this.K0;
        if (view16 != null) {
            view16.setVisibility(8);
        } else {
            s.m("menstrualCycleDayDisplayNotesGroup");
            throw null;
        }
    }

    public final void K6() {
        Y6(null, true);
        View view2 = this.I;
        if (view2 == null) {
            s.m("startTrackingFromInactiveGroup");
            throw null;
        }
        view2.setVisibility(8);
        ComposeView composeView = this.F;
        if (composeView == null) {
            s.m("menstrualCycleDayChart");
            throw null;
        }
        composeView.setVisibility(0);
        View view3 = this.P;
        if (view3 == null) {
            s.m("menstrualCycleDayInactiveGroup");
            throw null;
        }
        view3.setVisibility(0);
        Button button = this.A;
        if (button == null) {
            s.m("menstrualCycleDayChartButton");
            throw null;
        }
        button.setVisibility(8);
        TextView textView = this.X;
        if (textView == null) {
            s.m("menstrualCycleDayTimeRemainingLabel");
            throw null;
        }
        textView.setVisibility(8);
        ExpandableTextView expandableTextView = this.Z;
        if (expandableTextView == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        expandableTextView.setVisibility(8);
        View view4 = this.T;
        if (view4 == null) {
            s.m("menstrualCycleDayNoDataLabel");
            throw null;
        }
        view4.setVisibility(8);
        View view5 = this.f38910k0;
        if (view5 == null) {
            s.m("menstrualCycleDayAddSymptomsGroup");
            throw null;
        }
        view5.setVisibility(8);
        View view6 = this.H0;
        if (view6 == null) {
            s.m("menstrualCycleDayDisplaySymptomsGroup");
            throw null;
        }
        view6.setVisibility(8);
        View view7 = this.f38919v;
        if (view7 == null) {
            s.m("menstrualCycleDayDisplaySymptomsEdit");
            throw null;
        }
        view7.setVisibility(8);
        View view8 = this.J0;
        if (view8 == null) {
            s.m("menstrualCycleDayAddNotesGroup");
            throw null;
        }
        view8.setVisibility(8);
        View view9 = this.I0;
        if (view9 == null) {
            s.m("menstrualCycleAddNotesSpace");
            throw null;
        }
        view9.setVisibility(8);
        View view10 = this.K0;
        if (view10 == null) {
            s.m("menstrualCycleDayDisplayNotesGroup");
            throw null;
        }
        view10.setVisibility(8);
        TextView textView2 = this.C;
        if (textView2 == null) {
            s.m("menstrualCycleDayInactiveLabel");
            throw null;
        }
        textView2.setText(R.string.pregnancy_set_up_again);
        TextView textView3 = this.D;
        if (textView3 == null) {
            s.m("menstrualCycleDayInactiveBody");
            throw null;
        }
        textView3.setText(R.string.pregnancy_error_saving_details_message);
        Button button2 = this.B;
        if (button2 == null) {
            s.m("menstrualCycleDayInactiveButton");
            throw null;
        }
        button2.setText(R.string.mct_set_up);
        Button button3 = this.B;
        if (button3 == null) {
            s.m("menstrualCycleDayInactiveButton");
            throw null;
        }
        button3.setOnClickListener(new j(this, 2));
        if (getActivity() instanceof MenstrualCycleDetailsActivity) {
            androidx.fragment.app.m activity = getActivity();
            activity.getClass();
            ((MenstrualCycleDetailsActivity) activity).invalidateOptionsMenu();
        }
    }

    public final void M6() {
        String string;
        Y6(null, false);
        View view2 = this.I;
        if (view2 == null) {
            s.m("startTrackingFromInactiveGroup");
            throw null;
        }
        view2.setVisibility(8);
        ComposeView composeView = this.F;
        if (composeView == null) {
            s.m("menstrualCycleDayChart");
            throw null;
        }
        composeView.setVisibility(8);
        View view3 = this.P;
        if (view3 == null) {
            s.m("menstrualCycleDayInactiveGroup");
            throw null;
        }
        view3.setVisibility(8);
        Button button = this.A;
        if (button == null) {
            s.m("menstrualCycleDayChartButton");
            throw null;
        }
        button.setVisibility(8);
        TextView textView = this.X;
        if (textView == null) {
            s.m("menstrualCycleDayTimeRemainingLabel");
            throw null;
        }
        textView.setVisibility(8);
        ExpandableTextView expandableTextView = this.Z;
        if (expandableTextView == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        expandableTextView.setVisibility(8);
        View view4 = this.T;
        if (view4 == null) {
            s.m("menstrualCycleDayNoDataLabel");
            throw null;
        }
        view4.setVisibility(8);
        View view5 = this.f38910k0;
        if (view5 == null) {
            s.m("menstrualCycleDayAddSymptomsGroup");
            throw null;
        }
        view5.setVisibility(8);
        View view6 = this.H0;
        if (view6 == null) {
            s.m("menstrualCycleDayDisplaySymptomsGroup");
            throw null;
        }
        view6.setVisibility(8);
        View view7 = this.f38919v;
        if (view7 == null) {
            s.m("menstrualCycleDayDisplaySymptomsEdit");
            throw null;
        }
        view7.setVisibility(8);
        View view8 = this.J0;
        if (view8 == null) {
            s.m("menstrualCycleDayAddNotesGroup");
            throw null;
        }
        view8.setVisibility(8);
        View view9 = this.I0;
        if (view9 == null) {
            s.m("menstrualCycleAddNotesSpace");
            throw null;
        }
        view9.setVisibility(8);
        View view10 = this.K0;
        if (view10 == null) {
            s.m("menstrualCycleDayDisplayNotesGroup");
            throw null;
        }
        view10.setVisibility(8);
        View view11 = this.M0;
        if (view11 == null) {
            s.m("mctPregnancyOneDayView");
            throw null;
        }
        view11.setVisibility(0);
        db1.m mVarA4 = ((o0) this.f38908j.getValue()).A4(S6());
        if (mVarA4 == null) {
            K6();
            return;
        }
        TextView textView2 = this.N0;
        if (textView2 == null) {
            s.m("pregnancyPregnancyTitle");
            throw null;
        }
        LocalDate deliveryDate = mVarA4.getDeliveryDate();
        if (deliveryDate == null) {
            deliveryDate = mVarA4.getEndDate();
        }
        if (deliveryDate != null) {
            string = vb.h.h(deliveryDate.getYear(), getString(R.string.pregnancy_title), StringUtils.SPACE);
        } else {
            string = getString(R.string.pregnancy_currently_pregnant);
            string.getClass();
        }
        textView2.setText(string);
        TextView textView3 = this.O0;
        if (textView3 == null) {
            s.m("pregnancyDescriptionTitle");
            throw null;
        }
        textView3.setText(getString(R.string.pregnancy_check_details));
        Button button2 = this.P0;
        if (button2 == null) {
            s.m("viewPregnancyButton");
            throw null;
        }
        button2.setText(getString(R.string.pregnancy_view_pregnancy));
        Button button3 = this.P0;
        if (button3 != null) {
            button3.setOnClickListener(new k(1, this, mVarA4));
        } else {
            s.m("viewPregnancyButton");
            throw null;
        }
    }

    public final LocalDate S6() {
        Object value = this.f38906h.getValue();
        value.getClass();
        return (LocalDate) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final hx0.s T6() {
        return (hx0.s) this.f38907i.getValue();
    }

    public final void U6(Bundle bundle) {
        b bVar;
        Parcelable parcelable;
        Object serializable;
        Object serializable2;
        Serializable serializable3 = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = bundle.getSerializable("editPageSelected", b.class);
            } else {
                Object serializable4 = bundle.getSerializable("editPageSelected");
                if (!(serializable4 instanceof b)) {
                    serializable4 = null;
                }
                serializable2 = (b) serializable4;
            }
            bVar = (b) serializable2;
        } else {
            bVar = null;
        }
        int i14 = bVar == null ? -1 : c.f38928a[bVar.ordinal()];
        if (i14 == 1) {
            if (Build.VERSION.SDK_INT < 33) {
                Serializable serializable5 = bundle != null ? bundle.getSerializable("calendarMode") : null;
                serializable3 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a) (serializable5 instanceof com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a ? serializable5 : null);
            } else if (bundle != null) {
                serializable3 = bundle.getSerializable("calendarMode", com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.class);
            }
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a aVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a) serializable3;
            if (aVar == null) {
                aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.NORMAL;
            }
            MenstrualCycleCalendarActivity.a aVar2 = MenstrualCycleCalendarActivity.f38783c;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            aVar2.getClass();
            startActivityForResult(MenstrualCycleCalendarActivity.a.a(contextRequireContext, aVar), 103);
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                vb.h.z("Edit page value should be set, but was null");
                return;
            }
            String string = bundle.getString("pendingNote");
            UserNoteActivity.a aVar3 = UserNoteActivity.f39193c;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            aVar3.getClass();
            Intent intentPutExtra = new Intent(contextRequireContext2, (Class<?>) UserNoteActivity.class).putExtra("USER_NOTE", string);
            intentPutExtra.getClass();
            startActivityForResult(intentPutExtra, 102);
            return;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            parcelable = bundle != null ? (Parcelable) bundle.getParcelable("log", ww0.b.class) : null;
        } else {
            Parcelable parcelable2 = bundle != null ? bundle.getParcelable("log") : null;
            if (!(parcelable2 instanceof ww0.b)) {
                parcelable2 = null;
            }
            parcelable = (ww0.b) parcelable2;
        }
        ww0.b bVar2 = (ww0.b) parcelable;
        if (i15 >= 33) {
            serializable = bundle != null ? bundle.getSerializable("phase", Integer.class) : null;
        } else {
            Object serializable6 = bundle != null ? bundle.getSerializable("phase") : null;
            if (!(serializable6 instanceof Integer)) {
                serializable6 = null;
            }
            serializable = (Integer) serializable6;
        }
        MenstrualCycleSymptomActivity.a aVar4 = MenstrualCycleSymptomActivity.f38817c;
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        LocalDate localDateS6 = S6();
        aVar4.getClass();
        Intent intentA = MenstrualCycleSymptomActivity.a.a(contextRequireContext3, bVar2, localDateS6, (Integer) serializable, null);
        if (intentA != null) {
            startActivityForResult(intentA, 101);
        } else if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.d(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
            new androidx.appcompat.app.e.a(requireContext()).setTitle(getString(R.string.mct_add_a_period)).setMessage(getString(R.string.mct_just_tracking_flow)).setPositiveButton(getString(R.string.lbl_ok), (DialogInterface.OnClickListener) null).show();
        } else {
            vb.h.z("Can't open symptom logging activity when there are no options available.");
        }
    }

    public final void V6() {
        ww0.b bVar;
        ww0.c cVar;
        cx0.a<ww0.c> aVarD = T6().A4(S6()).d();
        if (aVarD == null || (cVar = aVarD.f56599a) == null || (bVar = cVar.getLog()) == null) {
            bVar = new ww0.b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("editPageSelected", b.Notes);
        bundle.putString("pendingNote", bVar.getNotes());
        U6(bundle);
    }

    public final void X6() {
        ww0.b bVar;
        ww0.c cVar;
        ww0.l cycleSummary;
        ww0.c cVar2;
        Bundle bundle = new Bundle();
        bundle.putSerializable("editPageSelected", b.Symptoms);
        cx0.a<ww0.c> aVarD = T6().A4(S6()).d();
        if (aVarD == null || (cVar2 = aVarD.f56599a) == null || (bVar = cVar2.getLog()) == null) {
            bVar = new ww0.b(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        bundle.putParcelable("log", bVar);
        cx0.a<ww0.c> aVarD2 = T6().A4(S6()).d();
        bundle.putSerializable("phase", (aVarD2 == null || (cVar = aVarD2.f56599a) == null || (cycleSummary = cVar.getCycleSummary()) == null) ? null : cycleSummary.getCurrentPhase());
        U6(bundle);
    }

    public final void Y6(ww0.l lVar, boolean z14) {
        LocalDate localDateG;
        dx0.a aVar = dx0.a.NORMAL;
        boolean zIsBefore = false;
        boolean z15 = lVar == null || !lVar.Z();
        if (lVar != null && (localDateG = lVar.g()) != null) {
            zIsBefore = localDateG.isBefore(LocalDate.now());
        }
        boolean z16 = zIsBefore;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
        boolean zG = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar2);
        boolean zC = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(aVar2);
        i52.a.f91796a.getClass();
        dx0.e eVar = new dx0.e(aVar, z14, z15, z16, zG, zC, i52.a.o());
        ComposeView composeView = this.F;
        if (composeView == null) {
            s.m("menstrualCycleDayChart");
            throw null;
        }
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        ComposeView composeView2 = this.F;
        if (composeView2 == null) {
            s.m("menstrualCycleDayChart");
            throw null;
        }
        composeView2.setContent(new z3.e(-615025086, true, new hx0.n(eVar, lVar, 0)));
        ComposeView composeView3 = this.F;
        if (composeView3 == null) {
            s.m("menstrualCycleDayChart");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.c.a(composeView3, contextRequireContext, R.dimen.gauge_chart_size_small, 1.5f, 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        LocalDate localDate;
        Bundle extras;
        Serializable serializable;
        Bundle extras2;
        super.onActivityResult(i14, i15, intent);
        switch (i14) {
            case 101:
                if (i15 == -1) {
                    NestedScrollView nestedScrollView = this.f38915p;
                    if (nestedScrollView == null) {
                        s.m("menstrualCycleScrollView");
                        throw null;
                    }
                    RecyclerView recyclerView = this.f38917r;
                    if (recyclerView == null) {
                        s.m("menstrualCycleDayDisplaySymptomsList");
                        throw null;
                    }
                    nestedScrollView.requestChildFocus(recyclerView, recyclerView);
                    androidx.fragment.app.m activity = getActivity();
                    MenstrualCycleDetailsActivity menstrualCycleDetailsActivity = activity instanceof MenstrualCycleDetailsActivity ? (MenstrualCycleDetailsActivity) activity : null;
                    if (menstrualCycleDetailsActivity != null) {
                        menstrualCycleDetailsActivity.ta();
                        return;
                    }
                    return;
                }
                return;
            case 102:
                if ((intent != null ? intent.getExtras() : null) != null) {
                    NestedScrollView nestedScrollView2 = this.f38915p;
                    if (nestedScrollView2 == null) {
                        s.m("menstrualCycleScrollView");
                        throw null;
                    }
                    TextView textView = this.f38920w;
                    if (textView == null) {
                        s.m("menstrualCycleDayDisplayNotesContent");
                        throw null;
                    }
                    nestedScrollView2.requestChildFocus(textView, textView);
                    String stringExtra = intent.getStringExtra("USER_NOTE");
                    this.f38914o = stringExtra;
                    if (stringExtra != null) {
                        hx0.s sVarT6 = T6();
                        LocalDate localDateS6 = S6();
                        String str = this.f38914o;
                        str.getClass();
                        LinkedHashMap linkedHashMap = sVarT6.f86141e;
                        ReentrantLock reentrantLock = sVarT6.f86138b;
                        reentrantLock.lock();
                        try {
                            LinkedHashMap linkedHashMap2 = sVarT6.f86139c;
                            Object obj = linkedHashMap2.get(localDateS6);
                            Object obj2 = obj;
                            if (obj == null) {
                                y0 y0Var = new y0();
                                linkedHashMap2.put(localDateS6, y0Var);
                                obj2 = y0Var;
                            }
                            y0 y0Var2 = (y0) obj2;
                            r0 r0Var = new r0();
                            cx0.a aVar = (cx0.a) y0Var2.d();
                            r0Var.f105810a = aVar != null ? (ww0.c) aVar.f56599a : 0;
                            linkedHashMap.put(localDateS6, ge1.b.T(sVarT6, null, null, new z((l1) sVarT6.f86140d.get(localDateS6), (l1) linkedHashMap.get(localDateS6), r0Var, sVarT6, localDateS6, str, y0Var2, null), 3));
                            Unit unit = Unit.INSTANCE;
                            return;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    return;
                }
                return;
            case 103:
                if (s.g((intent == null || (extras2 = intent.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("CALENDAR_UPDATED_KEY")), Boolean.TRUE)) {
                    androidx.fragment.app.m activity2 = getActivity();
                    MenstrualCycleDetailsActivity menstrualCycleDetailsActivity2 = activity2 instanceof MenstrualCycleDetailsActivity ? (MenstrualCycleDetailsActivity) activity2 : null;
                    if (menstrualCycleDetailsActivity2 != null) {
                        menstrualCycleDetailsActivity2.ta();
                    }
                }
                if (intent == null || (extras = intent.getExtras()) == null) {
                    localDate = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = extras.getSerializable("CALENDAR_SELECTED_DATE", LocalDate.class);
                    } else {
                        Serializable serializable2 = extras.getSerializable("CALENDAR_SELECTED_DATE");
                        if (!(serializable2 instanceof LocalDate)) {
                            serializable2 = null;
                        }
                        serializable = (LocalDate) serializable2;
                    }
                    localDate = (LocalDate) serializable;
                }
                if (localDate != null) {
                    androidx.fragment.app.m activity3 = getActivity();
                    MenstrualCycleDetailsActivity menstrualCycleDetailsActivity3 = activity3 instanceof MenstrualCycleDetailsActivity ? (MenstrualCycleDetailsActivity) activity3 : null;
                    if (menstrualCycleDetailsActivity3 != null) {
                        menstrualCycleDetailsActivity3.sa(0, localDate);
                        return;
                    }
                    return;
                }
                return;
            case 104:
                if (i15 == -1) {
                    androidx.fragment.app.m activity4 = getActivity();
                    MenstrualCycleDetailsActivity menstrualCycleDetailsActivity4 = activity4 instanceof MenstrualCycleDetailsActivity ? (MenstrualCycleDetailsActivity) activity4 : null;
                    if (menstrualCycleDetailsActivity4 != null) {
                        menstrualCycleDetailsActivity4.ta();
                        return;
                    }
                    return;
                }
                return;
            case 105:
                if (d1.i(x.DI_CONNECT_UPLOAD)) {
                    U6(intent != null ? intent.getExtras() : null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_menstrual_cycle_day);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G6();
        dh.b.L(T6().A4(S6()), this, new C0690d(new hx0.l(this, 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("hasSeenConfirmationDialog", this.f38913n);
        bundle.putString("pendingNote", this.f38914o);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        int i14;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.menstrual_cycle_scroll_view);
        viewFindViewById.getClass();
        this.f38915p = (NestedScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.menstrual_cycle_day_display_symptoms_title);
        viewFindViewById2.getClass();
        this.f38916q = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.menstrual_cycle_day_display_symptoms_list);
        viewFindViewById3.getClass();
        this.f38917r = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.menstrual_cycle_day_display_symptoms_flexbox);
        viewFindViewById4.getClass();
        this.f38918t = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.menstrual_cycle_day_display_symptoms_edit);
        viewFindViewById5.getClass();
        this.f38919v = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.menstrual_cycle_day_display_notes_content);
        viewFindViewById6.getClass();
        this.f38920w = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.menstrual_cycle_day_add_symptoms_layout);
        viewFindViewById7.getClass();
        this.f38921x = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.menstrual_cycle_day_display_notes_edit);
        viewFindViewById8.getClass();
        this.f38922y = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.menstrual_cycle_day_add_notes_layout);
        viewFindViewById9.getClass();
        this.f38923z = viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.menstrual_cycle_day_chart_button);
        viewFindViewById10.getClass();
        this.A = (Button) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.menstrual_cycle_day_inactive_button);
        viewFindViewById11.getClass();
        this.B = (Button) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.menstrual_cycle_day_inactive_label);
        viewFindViewById12.getClass();
        this.C = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.menstrual_cycle_day_inactive_body);
        viewFindViewById13.getClass();
        this.D = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.menstrual_cycle_start_tracking_button);
        viewFindViewById14.getClass();
        this.E = viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.menstrual_cycle_day_chart);
        viewFindViewById15.getClass();
        this.F = (ComposeView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.start_tracking_from_inactive_group);
        viewFindViewById16.getClass();
        this.I = viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.menstrual_cycle_day_inactive_group);
        viewFindViewById17.getClass();
        this.P = viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.menstrual_cycle_day_no_data_label);
        viewFindViewById18.getClass();
        this.T = viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.menstrual_cycle_day_time_remaining_label);
        viewFindViewById19.getClass();
        this.X = (TextView) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.mct_with_skin_temp_tooltip_container);
        viewFindViewById20.getClass();
        this.Y = (BubbleLayout) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.menstrual_cycle_day_education_text);
        viewFindViewById21.getClass();
        this.Z = (ExpandableTextView) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.menstrual_cycle_day_add_symptoms_group);
        viewFindViewById22.getClass();
        this.f38910k0 = viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.menstrual_cycle_day_display_symptoms_group);
        viewFindViewById23.getClass();
        this.H0 = viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.menstrual_cycle_add_notes_space);
        viewFindViewById24.getClass();
        this.I0 = viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.menstrual_cycle_day_add_notes_group);
        viewFindViewById25.getClass();
        this.J0 = viewFindViewById25;
        View viewFindViewById26 = view2.findViewById(R.id.menstrual_cycle_day_display_notes_group);
        viewFindViewById26.getClass();
        this.K0 = viewFindViewById26;
        View viewFindViewById27 = view2.findViewById(R.id.menstrual_cycle_day_no_data_barrier);
        viewFindViewById27.getClass();
        this.L0 = viewFindViewById27;
        View viewFindViewById28 = view2.findViewById(R.id.mct_pregnancy_one_day_view);
        viewFindViewById28.getClass();
        this.M0 = viewFindViewById28;
        View viewFindViewById29 = view2.findViewById(R.id.pregnancy_pregnancy_title);
        viewFindViewById29.getClass();
        this.N0 = (TextView) viewFindViewById29;
        View viewFindViewById30 = view2.findViewById(R.id.pregnancy_description_title);
        viewFindViewById30.getClass();
        this.O0 = (TextView) viewFindViewById30;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.a(contextRequireContext) >= 1.5f) {
            TextView textView = this.O0;
            if (textView == null) {
                s.m("pregnancyDescriptionTitle");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(getResources().getDimensionPixelSize(R.dimen.spacing_large));
            TextView textView2 = this.O0;
            if (textView2 == null) {
                s.m("pregnancyDescriptionTitle");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.getClass();
            ((LinearLayout.LayoutParams) layoutParams2).setMarginEnd(getResources().getDimensionPixelSize(R.dimen.spacing_large));
        }
        View viewFindViewById31 = view2.findViewById(R.id.view_pregnancy_button);
        viewFindViewById31.getClass();
        this.P0 = (Button) viewFindViewById31;
        this.f38913n = bundle != null ? bundle.getBoolean("hasSeenConfirmationDialog") : this.f38913n;
        if (bundle == null || (string = bundle.getString("pendingNote")) == null) {
            string = this.f38914o;
        }
        this.f38914o = string;
        boolean zEquals = S6().equals(LocalDate.now());
        TextView textView3 = this.f38916q;
        if (zEquals) {
            if (textView3 == null) {
                s.m("menstrualCycleDayDisplaySymptomsTitle");
                throw null;
            }
            textView3.setText(getString(R.string.mct_todays_symptoms));
        } else {
            if (textView3 == null) {
                s.m("menstrualCycleDayDisplaySymptomsTitle");
                throw null;
            }
            textView3.setText(getString(R.string.mct_logged_symptoms));
        }
        mx0.d dVar = new mx0.d(getResources().getDimension(R.dimen.spacing_normal));
        RecyclerView recyclerView = this.f38917r;
        if (recyclerView == null) {
            s.m("menstrualCycleDayDisplaySymptomsList");
            throw null;
        }
        mx0.d.e(dVar, recyclerView, 26);
        Context context = recyclerView.getContext();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        float fA = c22.b.a(contextRequireContext2);
        if (fA >= 1.5f) {
            i14 = 3;
        } else {
            i14 = fA > 1.0f ? 4 : 5;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(context, i14));
        RecyclerView recyclerView2 = this.f38918t;
        if (recyclerView2 == null) {
            s.m("menstrualCycleDayDisplaySymptomsFlexbox");
            throw null;
        }
        mx0.d.e(dVar, recyclerView2, 28);
        recyclerView2.setLayoutManager(new FlexboxLayoutManager(recyclerView2.getContext()));
        View view3 = this.f38919v;
        if (view3 == null) {
            s.m("menstrualCycleDayDisplaySymptomsEdit");
            throw null;
        }
        view3.setOnClickListener(new j(this, 3));
        View view4 = this.f38921x;
        if (view4 == null) {
            s.m("menstrualCycleDayAddSymptomsLayout");
            throw null;
        }
        view4.setOnClickListener(new j(this, 4));
        View view5 = this.f38922y;
        if (view5 == null) {
            s.m("menstrualCycleDayDisplayNotesEdit");
            throw null;
        }
        view5.setOnClickListener(new j(this, 5));
        View view6 = this.f38923z;
        if (view6 == null) {
            s.m("menstrualCycleDayAddNotesLayout");
            throw null;
        }
        view6.setOnClickListener(new j(this, 6));
        Button button = this.A;
        if (button == null) {
            s.m("menstrualCycleDayChartButton");
            throw null;
        }
        button.setOnClickListener(new j(this, 7));
        Button button2 = this.B;
        if (button2 == null) {
            s.m("menstrualCycleDayInactiveButton");
            throw null;
        }
        button2.setOnClickListener(new j(this, 0));
        View view7 = this.E;
        if (view7 == null) {
            s.m("menstrualCycleStartTrackingButton");
            throw null;
        }
        view7.setOnClickListener(new k(0, this, view2));
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        ww0.a aVar = ww0.a.NONE;
        ComposeView composeView = this.F;
        if (aVarL == aVar) {
            if (composeView == null) {
                s.m("menstrualCycleDayChart");
                throw null;
            }
            composeView.setVisibility(8);
        } else {
            if (composeView == null) {
                s.m("menstrualCycleDayChart");
                throw null;
            }
            composeView.setVisibility(0);
        }
        View view8 = this.I;
        if (view8 == null) {
            s.m("startTrackingFromInactiveGroup");
            throw null;
        }
        view8.setVisibility(8);
        View view9 = this.P;
        if (view9 == null) {
            s.m("menstrualCycleDayInactiveGroup");
            throw null;
        }
        view9.setVisibility(8);
        Button button3 = this.A;
        if (button3 == null) {
            s.m("menstrualCycleDayChartButton");
            throw null;
        }
        button3.setVisibility(8);
        View view10 = this.T;
        if (view10 == null) {
            s.m("menstrualCycleDayNoDataLabel");
            throw null;
        }
        view10.setVisibility(8);
        TextView textView4 = this.X;
        if (textView4 == null) {
            s.m("menstrualCycleDayTimeRemainingLabel");
            throw null;
        }
        textView4.setVisibility(8);
        ExpandableTextView expandableTextView = this.Z;
        if (expandableTextView == null) {
            s.m("menstrualCycleDayEducationText");
            throw null;
        }
        expandableTextView.setVisibility(8);
        View view11 = this.f38910k0;
        if (view11 == null) {
            s.m("menstrualCycleDayAddSymptomsGroup");
            throw null;
        }
        view11.setVisibility(8);
        View view12 = this.H0;
        if (view12 == null) {
            s.m("menstrualCycleDayDisplaySymptomsGroup");
            throw null;
        }
        view12.setVisibility(8);
        View view13 = this.f38919v;
        if (view13 == null) {
            s.m("menstrualCycleDayDisplaySymptomsEdit");
            throw null;
        }
        view13.setVisibility(8);
        View view14 = this.I0;
        if (view14 == null) {
            s.m("menstrualCycleAddNotesSpace");
            throw null;
        }
        view14.setVisibility(8);
        View view15 = this.J0;
        if (view15 == null) {
            s.m("menstrualCycleDayAddNotesGroup");
            throw null;
        }
        view15.setVisibility(8);
        View view16 = this.K0;
        if (view16 != null) {
            view16.setVisibility(8);
        } else {
            s.m("menstrualCycleDayDisplayNotesGroup");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/d$a;", "", "<init>", "()V", "", "DATE_KEY", "Ljava/lang/String;", "HAS_SEEN_CONFIRMATION_DIALOG_KEY", "EDIT_PAGE_SELECTED_KEY", "CALENDAR_MODE_KEY", "PENDING_NOTE_KEY", "LOG_KEY", "PHASE_KEY", "", "MENSTRUAL_SYMPTOM_REQUEST_CODE", "I", "MENSTRUAL_NOTE_REQUEST_CODE", "MENSTRUAL_CALENDAR_REQUEST_CODE", "SETUP_REQUEST_CODE", "CONSENT_REQUEST_CODE", "SYMPTOMS_COLUMN_COUNT_DEFAULT_FONT_SCALE", "SYMPTOMS_COLUMN_COUNT_FONT_SCALE_BIGGER_THAN_ONE", "SYMPTOMS_COLUMN_COUNT_FONT_SCALE_BIGGER_THAN_ONE_POINT_FIVE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
