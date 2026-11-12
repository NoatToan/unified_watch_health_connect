package com.garmin.android.apps.connectmobile.performance.stats.improvement;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.performance.acclimation.presentation.HeatAltitudeAcclimationActivity;
import com.garmin.android.apps.connectmobile.performance.acclimation.presentation.LegacyAltitudeAcclimationActivity;
import com.garmin.android.apps.connectmobile.performance.trainingload.TrainingLoadActivity;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import e23.l;
import fw.p;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import vc0.v;
import w61.g0;
import w61.n0;
import w61.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/a;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends m0 implements com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {
    public static final C0746a Z = new C0746a(null);
    public View A;
    public TextView B;
    public View C;
    public TextView D;
    public AppCompatButton E;
    public TextView F;
    public FrameLayout I;
    public final w1 P;
    public final w1 T;
    public final w61.e X;
    public final w61.e Y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f40085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f40086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f40087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f40088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f40089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f40090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f40091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f40092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f40093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f40094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f40095r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f40096t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f40097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f40098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f40099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f40100y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f40101z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40103b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40102a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f40103b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.CurrentTrainingStatusFragment$onDeviceChanged$1", f = "CurrentTrainingStatusFragment.kt", l = {429}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40104a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f40106c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f40106c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40104a;
            if (i14 == 0) {
                r.b(obj);
                C0746a c0746a = a.Z;
                x xVarI6 = a.this.I6();
                this.f40104a = 1;
                if (xVarI6.A4(this.f40106c, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40107a;

        public d(l lVar) {
            lVar.getClass();
            this.f40107a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40107a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40107a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f40108a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40108a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40109a = aVar;
            this.f40110b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40109a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40110b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f40111a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40111a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40112a = aVar;
            this.f40113b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40112a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40113b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f40114a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40114a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [w61.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [w61.e] */
    public a() {
        v vVar = new v(this, 25);
        t0 t0Var = s0.f105811a;
        this.P = new w1(t0Var.b(x.class), new e(this), vVar, new f(null, this));
        this.T = new w1(t0Var.b(o41.a.class), new g(this), new i(this), new h(null, this));
        final int i14 = 0;
        this.X = new z0(this) { // from class: w61.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183171b;

            {
                this.f183171b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183171b;
                switch (i15) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        mVar.getClass();
                        int i16 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40103b[mVar.f73769b.ordinal()];
                        if (i16 == 1) {
                            aVar.H6(!aVar.z6());
                            return;
                        }
                        if (i16 == 2) {
                            aVar.y6(!aVar.z6());
                            g22.e.a(aVar, mVar.f73771d);
                            return;
                        }
                        if (i16 != 3) {
                            u0.r();
                            return;
                        }
                        aVar.y6(!aVar.z6());
                        x61.d dVar = (x61.d) mVar.f73770c;
                        LinearLayout linearLayout = aVar.f40085h;
                        if (dVar == null) {
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("currentStatusLayout");
                                throw null;
                            }
                        }
                        String str = dVar.f189195g;
                        boolean z14 = dVar.f189203o;
                        String strA = dVar.f189194f;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        ImageView imageView = aVar.f40086i;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusImageView");
                            throw null;
                        }
                        imageView.setImageDrawable(dVar.f189189a);
                        TextView textView = aVar.f40087j;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusTextView");
                            throw null;
                        }
                        textView.setText(dVar.f189190b);
                        TextView textView2 = aVar.f40088k;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("loadFocusTextView");
                            throw null;
                        }
                        v22.e.o(textView2, dVar.f189191c);
                        TextView textView3 = aVar.f40089l;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("dateTextView");
                            throw null;
                        }
                        v22.e.o(textView3, dVar.f189193e);
                        TextView textView4 = aVar.f40090m;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("vo2SourceTextView");
                            throw null;
                        }
                        v22.e.o(textView4, strA);
                        TextView textView5 = aVar.f40090m;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("vo2SourceTextView");
                            throw null;
                        }
                        Context context = aVar.getContext();
                        if (context == null) {
                            strA = null;
                        } else if (strA != null) {
                            strA = oi0.c.A(context, new w40.d(10), strA);
                        }
                        textView5.setContentDescription(strA);
                        TextView textView6 = aVar.f40091n;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("feedbackMessageTextView");
                            throw null;
                        }
                        v22.e.o(textView6, dVar.f189192d);
                        TextView textView7 = aVar.f40092o;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("receiveTrainingStatusTextView");
                            throw null;
                        }
                        v22.e.o(textView7, dVar.f189200l);
                        if (z14) {
                            String strC4 = aVar.I6().C4();
                            if (strC4 != null) {
                                TextView textView8 = aVar.F;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView8.setText(aVar.getString(R.string.provisional_status_please_sync, strC4));
                                TextView textView9 = aVar.F;
                                if (textView9 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView9.setVisibility(0);
                            }
                        } else {
                            TextView textView10 = aVar.F;
                            if (textView10 == null) {
                                p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                throw null;
                            }
                            textView10.setVisibility(8);
                        }
                        aVar.I6().X.m(new o13.p<>(Boolean.valueOf(z14), dVar.f189204p));
                        String str2 = dVar.f189197i;
                        String str3 = dVar.f189196h;
                        String str4 = dVar.f189198j;
                        View view2 = aVar.f40094q;
                        if (str == null) {
                            if (view2 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            view2.setVisibility(8);
                        } else {
                            if (view2 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            view2.setVisibility(0);
                            TextView textView11 = aVar.f40096t;
                            if (textView11 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxButtonDetail");
                                throw null;
                            }
                            textView11.setText(str);
                            View view3 = aVar.f40094q;
                            if (view3 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            if (!view3.hasOnClickListeners()) {
                                View view4 = aVar.f40094q;
                                if (view4 == null) {
                                    p005kotlin.jvm.internal.s.m("vo2MaxView");
                                    throw null;
                                }
                                view4.setOnClickListener(new d(aVar, 0));
                            }
                        }
                        View view5 = aVar.f40097v;
                        if (str4 == null) {
                            if (view5 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            view5.setVisibility(8);
                        } else {
                            if (view5 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            view5.setVisibility(0);
                            TextView textView12 = aVar.f40098w;
                            if (textView12 == null) {
                                p005kotlin.jvm.internal.s.m("loadButton");
                                throw null;
                            }
                            textView12.setText(str4);
                            TextView textView13 = aVar.f40099x;
                            if (textView13 == null) {
                                p005kotlin.jvm.internal.s.m("loadButtonDetails");
                                throw null;
                            }
                            String str5 = dVar.f189199k;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView13.setText(str5);
                            View view6 = aVar.f40097v;
                            if (view6 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            if (!view6.hasOnClickListeners()) {
                                View view7 = aVar.f40097v;
                                if (view7 == null) {
                                    p005kotlin.jvm.internal.s.m("loadView");
                                    throw null;
                                }
                                view7.setOnClickListener(new d(aVar, 1));
                            }
                        }
                        View view8 = aVar.A;
                        if (str3 == null) {
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            view8.setVisibility(8);
                        } else {
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            view8.setVisibility(0);
                            TextView textView14 = aVar.B;
                            if (textView14 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationButtonDetails");
                                throw null;
                            }
                            textView14.setText(str3);
                            View view9 = aVar.A;
                            if (view9 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            if (!view9.hasOnClickListeners()) {
                                View view10 = aVar.A;
                                if (view10 == null) {
                                    p005kotlin.jvm.internal.s.m("altAcclimationView");
                                    throw null;
                                }
                                view10.setOnClickListener(new d(aVar, 2));
                            }
                        }
                        View view11 = aVar.C;
                        if (str2 == null) {
                            if (view11 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            view11.setVisibility(8);
                        } else {
                            if (view11 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            view11.setVisibility(0);
                            TextView textView15 = aVar.D;
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationButtonDetails");
                                throw null;
                            }
                            textView15.setText(str2);
                            View view12 = aVar.C;
                            if (view12 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            if (!view12.hasOnClickListeners()) {
                                View view13 = aVar.C;
                                if (view13 == null) {
                                    p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                    throw null;
                                }
                                view13.setOnClickListener(new d(aVar, 3));
                            }
                        }
                        boolean z15 = dVar.f189202n;
                        AppCompatButton appCompatButton = aVar.E;
                        if (z15) {
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            appCompatButton.setVisibility(0);
                            AppCompatButton appCompatButton2 = aVar.E;
                            if (appCompatButton2 == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            if (!appCompatButton2.hasOnClickListeners()) {
                                AppCompatButton appCompatButton3 = aVar.E;
                                if (appCompatButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                    throw null;
                                }
                                appCompatButton3.setOnClickListener(new d(aVar, 4));
                            }
                        } else {
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            appCompatButton.setVisibility(8);
                        }
                        boolean z16 = dVar.f189201m;
                        Button button = aVar.f40093p;
                        if (z16) {
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            button.setVisibility(0);
                            Button button2 = aVar.f40093p;
                            if (button2 == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            if (!button2.hasOnClickListeners()) {
                                Button button3 = aVar.f40093p;
                                if (button3 == null) {
                                    p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                    throw null;
                                }
                                button3.setOnClickListener(new d(aVar, 5));
                            }
                        } else {
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            button.setVisibility(8);
                        }
                        boolean z17 = dVar.f189205q;
                        FrameLayout frameLayout = aVar.I;
                        if (z17) {
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                        }
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("deviceContainerView");
                            throw null;
                        }
                    default:
                        i41.b bVar = (i41.b) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if ((bVar != null ? bVar.getHrvSummary() : null) != null) {
                            i41.f hrvSummary = bVar.getHrvSummary();
                            hrvSummary.getClass();
                            if (hrvSummary.getWeeklyAvg() != null && bo1.a.a().c().e()) {
                                i41.f hrvSummary2 = bVar.getHrvSummary();
                                hrvSummary2.getClass();
                                Integer weeklyAvg = hrvSummary2.getWeeklyAvg();
                                int iIntValue = weeklyAvg != null ? weeklyAvg.intValue() : 0;
                                i41.f hrvSummary3 = bVar.getHrvSummary();
                                hrvSummary3.getClass();
                                String status = hrvSummary3.getStatus();
                                if (status == null) {
                                    status = "NO_STATUS";
                                }
                                TextView textView16 = aVar.f40101z;
                                if (textView16 == null) {
                                    p005kotlin.jvm.internal.s.m("hrvStatusButtonDetails");
                                    throw null;
                                }
                                Resources resources = aVar.getResources();
                                Context context2 = aVar.getContext();
                                String strD = org.apache.commons.lang3.e.d(iIntValue, StringUtils.SPACE, context2 != null ? context2.getString(R.string.lbl_ms) : null);
                                Context context3 = aVar.getContext();
                                textView16.setText(resources.getString(R.string.string_line_string_pattern, strD, context3 != null ? context3.getString(i41.h.valueOf(status).f90954b) : null));
                                return;
                            }
                        }
                        View view14 = aVar.f40100y;
                        if (view14 != null) {
                            view14.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("hrvStatusView");
                            throw null;
                        }
                }
            }
        };
        final int i15 = 1;
        this.Y = new z0(this) { // from class: w61.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183171b;

            {
                this.f183171b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183171b;
                switch (i16) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        mVar.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40103b[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            aVar.H6(!aVar.z6());
                            return;
                        }
                        if (i17 == 2) {
                            aVar.y6(!aVar.z6());
                            g22.e.a(aVar, mVar.f73771d);
                            return;
                        }
                        if (i17 != 3) {
                            u0.r();
                            return;
                        }
                        aVar.y6(!aVar.z6());
                        x61.d dVar = (x61.d) mVar.f73770c;
                        LinearLayout linearLayout = aVar.f40085h;
                        if (dVar == null) {
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("currentStatusLayout");
                                throw null;
                            }
                        }
                        String str = dVar.f189195g;
                        boolean z14 = dVar.f189203o;
                        String strA = dVar.f189194f;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusLayout");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        ImageView imageView = aVar.f40086i;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusImageView");
                            throw null;
                        }
                        imageView.setImageDrawable(dVar.f189189a);
                        TextView textView = aVar.f40087j;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("currentStatusTextView");
                            throw null;
                        }
                        textView.setText(dVar.f189190b);
                        TextView textView2 = aVar.f40088k;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("loadFocusTextView");
                            throw null;
                        }
                        v22.e.o(textView2, dVar.f189191c);
                        TextView textView3 = aVar.f40089l;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("dateTextView");
                            throw null;
                        }
                        v22.e.o(textView3, dVar.f189193e);
                        TextView textView4 = aVar.f40090m;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("vo2SourceTextView");
                            throw null;
                        }
                        v22.e.o(textView4, strA);
                        TextView textView5 = aVar.f40090m;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("vo2SourceTextView");
                            throw null;
                        }
                        Context context = aVar.getContext();
                        if (context == null) {
                            strA = null;
                        } else if (strA != null) {
                            strA = oi0.c.A(context, new w40.d(10), strA);
                        }
                        textView5.setContentDescription(strA);
                        TextView textView6 = aVar.f40091n;
                        if (textView6 == null) {
                            p005kotlin.jvm.internal.s.m("feedbackMessageTextView");
                            throw null;
                        }
                        v22.e.o(textView6, dVar.f189192d);
                        TextView textView7 = aVar.f40092o;
                        if (textView7 == null) {
                            p005kotlin.jvm.internal.s.m("receiveTrainingStatusTextView");
                            throw null;
                        }
                        v22.e.o(textView7, dVar.f189200l);
                        if (z14) {
                            String strC4 = aVar.I6().C4();
                            if (strC4 != null) {
                                TextView textView8 = aVar.F;
                                if (textView8 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView8.setText(aVar.getString(R.string.provisional_status_please_sync, strC4));
                                TextView textView9 = aVar.F;
                                if (textView9 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView9.setVisibility(0);
                            }
                        } else {
                            TextView textView10 = aVar.F;
                            if (textView10 == null) {
                                p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                throw null;
                            }
                            textView10.setVisibility(8);
                        }
                        aVar.I6().X.m(new o13.p<>(Boolean.valueOf(z14), dVar.f189204p));
                        String str2 = dVar.f189197i;
                        String str3 = dVar.f189196h;
                        String str4 = dVar.f189198j;
                        View view2 = aVar.f40094q;
                        if (str == null) {
                            if (view2 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            view2.setVisibility(8);
                        } else {
                            if (view2 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            view2.setVisibility(0);
                            TextView textView11 = aVar.f40096t;
                            if (textView11 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxButtonDetail");
                                throw null;
                            }
                            textView11.setText(str);
                            View view3 = aVar.f40094q;
                            if (view3 == null) {
                                p005kotlin.jvm.internal.s.m("vo2MaxView");
                                throw null;
                            }
                            if (!view3.hasOnClickListeners()) {
                                View view4 = aVar.f40094q;
                                if (view4 == null) {
                                    p005kotlin.jvm.internal.s.m("vo2MaxView");
                                    throw null;
                                }
                                view4.setOnClickListener(new d(aVar, 0));
                            }
                        }
                        View view5 = aVar.f40097v;
                        if (str4 == null) {
                            if (view5 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            view5.setVisibility(8);
                        } else {
                            if (view5 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            view5.setVisibility(0);
                            TextView textView12 = aVar.f40098w;
                            if (textView12 == null) {
                                p005kotlin.jvm.internal.s.m("loadButton");
                                throw null;
                            }
                            textView12.setText(str4);
                            TextView textView13 = aVar.f40099x;
                            if (textView13 == null) {
                                p005kotlin.jvm.internal.s.m("loadButtonDetails");
                                throw null;
                            }
                            String str5 = dVar.f189199k;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView13.setText(str5);
                            View view6 = aVar.f40097v;
                            if (view6 == null) {
                                p005kotlin.jvm.internal.s.m("loadView");
                                throw null;
                            }
                            if (!view6.hasOnClickListeners()) {
                                View view7 = aVar.f40097v;
                                if (view7 == null) {
                                    p005kotlin.jvm.internal.s.m("loadView");
                                    throw null;
                                }
                                view7.setOnClickListener(new d(aVar, 1));
                            }
                        }
                        View view8 = aVar.A;
                        if (str3 == null) {
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            view8.setVisibility(8);
                        } else {
                            if (view8 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            view8.setVisibility(0);
                            TextView textView14 = aVar.B;
                            if (textView14 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationButtonDetails");
                                throw null;
                            }
                            textView14.setText(str3);
                            View view9 = aVar.A;
                            if (view9 == null) {
                                p005kotlin.jvm.internal.s.m("altAcclimationView");
                                throw null;
                            }
                            if (!view9.hasOnClickListeners()) {
                                View view10 = aVar.A;
                                if (view10 == null) {
                                    p005kotlin.jvm.internal.s.m("altAcclimationView");
                                    throw null;
                                }
                                view10.setOnClickListener(new d(aVar, 2));
                            }
                        }
                        View view11 = aVar.C;
                        if (str2 == null) {
                            if (view11 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            view11.setVisibility(8);
                        } else {
                            if (view11 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            view11.setVisibility(0);
                            TextView textView15 = aVar.D;
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationButtonDetails");
                                throw null;
                            }
                            textView15.setText(str2);
                            View view12 = aVar.C;
                            if (view12 == null) {
                                p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                throw null;
                            }
                            if (!view12.hasOnClickListeners()) {
                                View view13 = aVar.C;
                                if (view13 == null) {
                                    p005kotlin.jvm.internal.s.m("heatAcclimationnView");
                                    throw null;
                                }
                                view13.setOnClickListener(new d(aVar, 3));
                            }
                        }
                        boolean z15 = dVar.f189202n;
                        AppCompatButton appCompatButton = aVar.E;
                        if (z15) {
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            appCompatButton.setVisibility(0);
                            AppCompatButton appCompatButton2 = aVar.E;
                            if (appCompatButton2 == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            if (!appCompatButton2.hasOnClickListeners()) {
                                AppCompatButton appCompatButton3 = aVar.E;
                                if (appCompatButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                    throw null;
                                }
                                appCompatButton3.setOnClickListener(new d(aVar, 4));
                            }
                        } else {
                            if (appCompatButton == null) {
                                p005kotlin.jvm.internal.s.m("resumeTrainingStatusButton");
                                throw null;
                            }
                            appCompatButton.setVisibility(8);
                        }
                        boolean z16 = dVar.f189201m;
                        Button button = aVar.f40093p;
                        if (z16) {
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            button.setVisibility(0);
                            Button button2 = aVar.f40093p;
                            if (button2 == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            if (!button2.hasOnClickListeners()) {
                                Button button3 = aVar.f40093p;
                                if (button3 == null) {
                                    p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                    throw null;
                                }
                                button3.setOnClickListener(new d(aVar, 5));
                            }
                        } else {
                            if (button == null) {
                                p005kotlin.jvm.internal.s.m("getTrainingStatusHelpButton");
                                throw null;
                            }
                            button.setVisibility(8);
                        }
                        boolean z17 = dVar.f189205q;
                        FrameLayout frameLayout = aVar.I;
                        if (z17) {
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                        }
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("deviceContainerView");
                            throw null;
                        }
                    default:
                        i41.b bVar = (i41.b) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if ((bVar != null ? bVar.getHrvSummary() : null) != null) {
                            i41.f hrvSummary = bVar.getHrvSummary();
                            hrvSummary.getClass();
                            if (hrvSummary.getWeeklyAvg() != null && bo1.a.a().c().e()) {
                                i41.f hrvSummary2 = bVar.getHrvSummary();
                                hrvSummary2.getClass();
                                Integer weeklyAvg = hrvSummary2.getWeeklyAvg();
                                int iIntValue = weeklyAvg != null ? weeklyAvg.intValue() : 0;
                                i41.f hrvSummary3 = bVar.getHrvSummary();
                                hrvSummary3.getClass();
                                String status = hrvSummary3.getStatus();
                                if (status == null) {
                                    status = "NO_STATUS";
                                }
                                TextView textView16 = aVar.f40101z;
                                if (textView16 == null) {
                                    p005kotlin.jvm.internal.s.m("hrvStatusButtonDetails");
                                    throw null;
                                }
                                Resources resources = aVar.getResources();
                                Context context2 = aVar.getContext();
                                String strD = org.apache.commons.lang3.e.d(iIntValue, StringUtils.SPACE, context2 != null ? context2.getString(R.string.lbl_ms) : null);
                                Context context3 = aVar.getContext();
                                textView16.setText(resources.getString(R.string.string_line_string_pattern, strD, context3 != null ? context3.getString(i41.h.valueOf(status).f90954b) : null));
                                return;
                            }
                        }
                        View view14 = aVar.f40100y;
                        if (view14 != null) {
                            view14.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("hrvStatusView");
                            throw null;
                        }
                }
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        x xVarI6 = I6();
        xVarI6.f183271g = m.a(null, new n0(xVarI6, null), 3);
        j jVarA = m.a(null, new g0(xVarI6, xVarI6.f183279n, null), 3);
        xVarI6.f183280o = jVarA;
        w61.i.a(xVarI6.f183282q, jVarA, xVarI6.f183275k, new w61.w(xVarI6, 3)).f(getViewLifecycleOwner(), this.X);
    }

    public final x I6() {
        return (x) this.P.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new c(str, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm4_current_training_status_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Intent intent;
        Bundle extras;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.current_status_layout_container);
        viewFindViewById.getClass();
        this.f40085h = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.current_status_image_view);
        viewFindViewById2.getClass();
        this.f40086i = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.current_status_text_view);
        viewFindViewById3.getClass();
        this.f40087j = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.load_focus_text_view);
        viewFindViewById4.getClass();
        this.f40088k = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.date_text_view);
        viewFindViewById5.getClass();
        this.f40089l = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.vo2_source_text_view);
        viewFindViewById6.getClass();
        this.f40090m = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.feedback_message_text_view);
        viewFindViewById7.getClass();
        this.f40091n = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.how_to_receive_status_text_view);
        viewFindViewById8.getClass();
        this.f40092o = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.get_training_status_help_button);
        viewFindViewById9.getClass();
        this.f40093p = (Button) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.provisional_status_text_view);
        viewFindViewById10.getClass();
        this.F = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.tabbed_pager_optional_view);
        viewFindViewById11.getClass();
        this.I = (FrameLayout) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.vo2_button);
        viewFindViewById12.getClass();
        this.f40094q = viewFindViewById12;
        View viewFindViewById13 = viewFindViewById12.findViewById(R.id.text1);
        viewFindViewById13.getClass();
        TextView textView = (TextView) viewFindViewById13;
        this.f40095r = textView;
        textView.setText(getString(R.string.lbl_vo2_max_running));
        TextView textView2 = this.f40095r;
        String string = null;
        if (textView2 == null) {
            s.m("vo2MaxButton");
            throw null;
        }
        Context context = getContext();
        textView2.setContentDescription(context != null ? oi0.c.A(context, new w40.d(11), getString(R.string.lbl_vo2_max_running)) : null);
        View view3 = this.f40094q;
        if (view3 == null) {
            s.m("vo2MaxView");
            throw null;
        }
        View viewFindViewById14 = view3.findViewById(R.id.text2);
        viewFindViewById14.getClass();
        this.f40096t = (TextView) viewFindViewById14;
        View view4 = this.f40094q;
        if (view4 == null) {
            s.m("vo2MaxView");
            throw null;
        }
        View viewFindViewById15 = view4.findViewById(R.id.icon_end);
        viewFindViewById15.getClass();
        ((ImageView) viewFindViewById15).setImageDrawable(null);
        View viewFindViewById16 = view2.findViewById(R.id.load_button);
        viewFindViewById16.getClass();
        this.f40097v = viewFindViewById16;
        View viewFindViewById17 = viewFindViewById16.findViewById(R.id.text1);
        viewFindViewById17.getClass();
        TextView textView3 = (TextView) viewFindViewById17;
        this.f40098w = textView3;
        textView3.setText(getString(R.string.lbl_training_status_load));
        View view5 = this.f40097v;
        if (view5 == null) {
            s.m("loadView");
            throw null;
        }
        View viewFindViewById18 = view5.findViewById(R.id.text2);
        viewFindViewById18.getClass();
        this.f40099x = (TextView) viewFindViewById18;
        View view6 = this.f40097v;
        if (view6 == null) {
            s.m("loadView");
            throw null;
        }
        View viewFindViewById19 = view6.findViewById(R.id.icon_end);
        viewFindViewById19.getClass();
        ((ImageView) viewFindViewById19).setImageDrawable(null);
        View viewFindViewById20 = view2.findViewById(R.id.hrv_status);
        viewFindViewById20.getClass();
        this.f40100y = viewFindViewById20;
        View viewFindViewById21 = viewFindViewById20.findViewById(R.id.text1);
        viewFindViewById21.getClass();
        ((TextView) viewFindViewById21).setText(getString(R.string.ohrv_status));
        View view7 = this.f40100y;
        if (view7 == null) {
            s.m("hrvStatusView");
            throw null;
        }
        View viewFindViewById22 = view7.findViewById(R.id.text2);
        viewFindViewById22.getClass();
        this.f40101z = (TextView) viewFindViewById22;
        View view8 = this.f40100y;
        if (view8 == null) {
            s.m("hrvStatusView");
            throw null;
        }
        View viewFindViewById23 = view8.findViewById(R.id.icon_end);
        viewFindViewById23.getClass();
        ((ImageView) viewFindViewById23).setImageDrawable(null);
        View view9 = this.f40100y;
        if (view9 == null) {
            s.m("hrvStatusView");
            throw null;
        }
        final int i14 = 6;
        view9.setOnClickListener(new w61.d(this, 6));
        View viewFindViewById24 = view2.findViewById(R.id.altitude_acclimation_button);
        viewFindViewById24.getClass();
        this.A = viewFindViewById24;
        View viewFindViewById25 = viewFindViewById24.findViewById(R.id.text1);
        viewFindViewById25.getClass();
        ((TextView) viewFindViewById25).setText(getString(R.string.lbl_altitude_acclimation));
        View view10 = this.A;
        if (view10 == null) {
            s.m("altAcclimationView");
            throw null;
        }
        View viewFindViewById26 = view10.findViewById(R.id.text2);
        viewFindViewById26.getClass();
        this.B = (TextView) viewFindViewById26;
        View view11 = this.A;
        if (view11 == null) {
            s.m("altAcclimationView");
            throw null;
        }
        View viewFindViewById27 = view11.findViewById(R.id.icon_end);
        viewFindViewById27.getClass();
        ((ImageView) viewFindViewById27).setImageDrawable(null);
        View viewFindViewById28 = view2.findViewById(R.id.heat_acclimation_button);
        viewFindViewById28.getClass();
        this.C = viewFindViewById28;
        View viewFindViewById29 = viewFindViewById28.findViewById(R.id.text1);
        viewFindViewById29.getClass();
        ((TextView) viewFindViewById29).setText(getString(R.string.lbl_heat_acclimation));
        View view12 = this.C;
        if (view12 == null) {
            s.m("heatAcclimationnView");
            throw null;
        }
        View viewFindViewById30 = view12.findViewById(R.id.text2);
        viewFindViewById30.getClass();
        this.D = (TextView) viewFindViewById30;
        View view13 = this.C;
        if (view13 == null) {
            s.m("heatAcclimationnView");
            throw null;
        }
        View viewFindViewById31 = view13.findViewById(R.id.icon_end);
        viewFindViewById31.getClass();
        ((ImageView) viewFindViewById31).setImageDrawable(null);
        View viewFindViewById32 = view2.findViewById(R.id.resume_training_status);
        viewFindViewById32.getClass();
        this.E = (AppCompatButton) viewFindViewById32;
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
        com.garmin.android.apps.connectmobile.performance.stats.improvement.b.f40115g.getClass();
        final int i15 = 1;
        aVarB.j(R.id.tabbed_pager_optional_view, new com.garmin.android.apps.connectmobile.performance.stats.improvement.b(), "DeviceFragmentTag", 1);
        Unit unit = Unit.INSTANCE;
        aVarB.e();
        final int i16 = 4;
        I6().f183272h.f(getViewLifecycleOwner(), new d(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i17 = i16;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i17) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i18 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i18 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i18 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i18 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 5;
        I6().f183282q.f(getViewLifecycleOwner(), new d(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i18 = i17;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i18) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i19 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i19 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i19 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i19 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        x xVarI6 = I6();
        final int i18 = 3;
        w61.i.a(xVarI6.f183282q, xVarI6.f183280o, xVarI6.f183275k, new w61.w(xVarI6, 3)).f(getViewLifecycleOwner(), this.X);
        I6().f183287x.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i19 = i14;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i19) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i110 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i110 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i110 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i110 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i19 = 7;
        I6().f183288y.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i110 = i19;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i110) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i111 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i111 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i111 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i111 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i24 = 0;
        I6().f183289z.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i110 = i24;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i110) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i111 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i111 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i111 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i111 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        I6().A.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i110 = i15;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i110) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i111 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i111 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i111 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i111 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i25 = 2;
        I6().B.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: w61.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

            {
                this.f183159b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Intent intent2;
                Bundle extras2;
                int i110 = i25;
                q71.e eVar = null;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                switch (i110) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        pVar.getClass();
                        TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        aVar2.getClass();
                        TrainingLoadActivity.a.a(activity, false, aVar3, set, "LOAD_FOCUS_DEST");
                        return Unit.INSTANCE;
                    case 1:
                        c61.d dVar = (c61.d) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        dVar.getClass();
                        aVar.I6();
                        if (bo1.a.a().c().r()) {
                            HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                            Context context2 = aVar.getContext();
                            c61.a aVar5 = c61.a.ALTITUDE;
                            aVar4.getClass();
                            HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                        } else {
                            LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                            Context context3 = aVar.getContext();
                            aVar6.getClass();
                            Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("extra_acclimation_data", dVar);
                            intent3.putExtras(bundle2);
                            if (context3 != null) {
                                context3.startActivity(intent3);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        ((Unit) obj).getClass();
                        HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                        Context context4 = aVar.getContext();
                        c61.a aVar8 = c61.a.HEAT;
                        aVar7.getClass();
                        HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        if (((fw.m) obj).f73770c != 0) {
                            androidx.fragment.app.m activity2 = aVar.getActivity();
                            if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                            }
                            aVar.I6().B.m(new f<>(Unit.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Set set2 = (Set) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                            FrameLayout frameLayout = aVar.I;
                            if (frameLayout == null) {
                                p005kotlin.jvm.internal.s.m("deviceContainerView");
                                throw null;
                            }
                            frameLayout.setVisibility(8);
                        } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                            if (bVar.isAdded()) {
                                bVar.v6(p13.h0.b1(set2));
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                        if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                            if (bVar2.isAdded()) {
                                bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        int i111 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                        if (i111 == 1) {
                            eVar = q71.e.ROWING;
                        } else if (i111 == 2) {
                            eVar = q71.e.CYCLING;
                        } else if (i111 == 3) {
                            eVar = q71.e.RUNNING;
                        }
                        VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                        androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar9.getClass();
                        Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                        if (eVar != null) {
                            intent4.putExtra("vo2MaxType", eVar);
                        }
                        mVarRequireActivity.startActivity(intent4);
                        return Unit.INSTANCE;
                    default:
                        o13.u uVar = (o13.u) obj;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                        uVar.getClass();
                        TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                        androidx.fragment.app.m activity3 = aVar.getActivity();
                        com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                        Set set3 = (Set) uVar.f128606b;
                        String str = (String) uVar.f128607c;
                        aVar10.getClass();
                        TrainingLoadActivity.a.a(activity3, true, aVar11, set3, str);
                        return Unit.INSTANCE;
                }
            }
        }));
        w1 w1Var = this.T;
        ((o41.a) w1Var.getValue()).f129059e.f(getViewLifecycleOwner(), this.Y);
        f32.l lVar = ((o41.a) w1Var.getValue()).f129062h;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        lVar.getClass();
        lVar.f68691a.b(dateTimeNow);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            string = extras.getString("EXTRA_NAVIGATION_DESTINATION");
        }
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == 477639362) {
                if (string.equals("LOAD_FOCUS_DEST")) {
                    I6().I4("LOAD_FOCUS_DEST");
                }
            } else if (iHashCode == 1447574838) {
                if (string.equals("TRAINING_LOAD_DEST")) {
                    I6().I4("TRAINING_LOAD_DEST");
                }
            } else if (iHashCode == 2058584775 && string.equals("HEAT_ACCL_DEST")) {
                I6().f183281p.f(getViewLifecycleOwner(), new d(new l(this) { // from class: w61.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183159b;

                    {
                        this.f183159b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Intent intent2;
                        Bundle extras2;
                        int i110 = i18;
                        q71.e eVar = null;
                        com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183159b;
                        switch (i110) {
                            case 0:
                                o13.p pVar = (o13.p) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                pVar.getClass();
                                TrainingLoadActivity.a aVar2 = TrainingLoadActivity.f40177b;
                                androidx.fragment.app.m activity2 = aVar.getActivity();
                                com.garmin.android.apps.connectmobile.performance.model.a aVar3 = (com.garmin.android.apps.connectmobile.performance.model.a) pVar.f128594a;
                                Set set = (Set) pVar.f128595b;
                                aVar2.getClass();
                                TrainingLoadActivity.a.a(activity2, false, aVar3, set, "LOAD_FOCUS_DEST");
                                return Unit.INSTANCE;
                            case 1:
                                c61.d dVar = (c61.d) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                dVar.getClass();
                                aVar.I6();
                                if (bo1.a.a().c().r()) {
                                    HeatAltitudeAcclimationActivity.a aVar4 = HeatAltitudeAcclimationActivity.f39835o;
                                    Context context2 = aVar.getContext();
                                    c61.a aVar5 = c61.a.ALTITUDE;
                                    aVar4.getClass();
                                    HeatAltitudeAcclimationActivity.a.a(context2, aVar5);
                                } else {
                                    LegacyAltitudeAcclimationActivity.a aVar6 = LegacyAltitudeAcclimationActivity.f39838b;
                                    Context context3 = aVar.getContext();
                                    aVar6.getClass();
                                    Intent intent3 = new Intent(context3, (Class<?>) LegacyAltitudeAcclimationActivity.class);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("extra_acclimation_data", dVar);
                                    intent3.putExtras(bundle2);
                                    if (context3 != null) {
                                        context3.startActivity(intent3);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 2:
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                ((Unit) obj).getClass();
                                HeatAltitudeAcclimationActivity.a aVar7 = HeatAltitudeAcclimationActivity.f39835o;
                                Context context4 = aVar.getContext();
                                c61.a aVar8 = c61.a.HEAT;
                                aVar7.getClass();
                                HeatAltitudeAcclimationActivity.a.a(context4, aVar8);
                                return Unit.INSTANCE;
                            case 3:
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                if (((fw.m) obj).f73770c != 0) {
                                    androidx.fragment.app.m activity3 = aVar.getActivity();
                                    if (activity3 != null && (intent2 = activity3.getIntent()) != null && (extras2 = intent2.getExtras()) != null) {
                                        extras2.putString("EXTRA_NAVIGATION_DESTINATION", null);
                                    }
                                    aVar.I6().B.m(new f<>(Unit.INSTANCE));
                                }
                                return Unit.INSTANCE;
                            case 4:
                                Set set2 = (Set) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                Fragment fragmentG = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                                if (set2 == null || !(!set2.isEmpty()) || set2.size() < 2) {
                                    FrameLayout frameLayout = aVar.I;
                                    if (frameLayout == null) {
                                        p005kotlin.jvm.internal.s.m("deviceContainerView");
                                        throw null;
                                    }
                                    frameLayout.setVisibility(8);
                                } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                    com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                    if (bVar.isAdded()) {
                                        bVar.v6(p13.h0.b1(set2));
                                    }
                                }
                                return Unit.INSTANCE;
                            case 5:
                                fw.m mVar = (fw.m) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                Fragment fragmentG2 = aVar.getChildFragmentManager().G("DeviceFragmentTag");
                                if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                    com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                                    if (bVar2.isAdded()) {
                                        bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 6:
                                com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = (com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                int i111 = enumC0736c == null ? -1 : com.garmin.android.apps.connectmobile.performance.stats.improvement.a.b.f40102a[enumC0736c.ordinal()];
                                if (i111 == 1) {
                                    eVar = q71.e.ROWING;
                                } else if (i111 == 2) {
                                    eVar = q71.e.CYCLING;
                                } else if (i111 == 3) {
                                    eVar = q71.e.RUNNING;
                                }
                                VO2MaxReportsActivity.a aVar9 = VO2MaxReportsActivity.f47876b;
                                androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                                mVarRequireActivity.getClass();
                                aVar9.getClass();
                                Intent intent4 = new Intent(mVarRequireActivity, (Class<?>) VO2MaxReportsActivity.class);
                                if (eVar != null) {
                                    intent4.putExtra("vo2MaxType", eVar);
                                }
                                mVarRequireActivity.startActivity(intent4);
                                return Unit.INSTANCE;
                            default:
                                o13.u uVar = (o13.u) obj;
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                                uVar.getClass();
                                TrainingLoadActivity.a aVar10 = TrainingLoadActivity.f40177b;
                                androidx.fragment.app.m activity4 = aVar.getActivity();
                                com.garmin.android.apps.connectmobile.performance.model.a aVar11 = (com.garmin.android.apps.connectmobile.performance.model.a) uVar.f128605a;
                                Set set3 = (Set) uVar.f128606b;
                                String str = (String) uVar.f128607c;
                                aVar10.getClass();
                                TrainingLoadActivity.a.a(activity4, true, aVar11, set3, str);
                                return Unit.INSTANCE;
                        }
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.improvement.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0746a {
        public /* synthetic */ C0746a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0746a() {
        }
    }
}
