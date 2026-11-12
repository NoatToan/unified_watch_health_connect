package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import e23.l;
import fw.p;
import l20.r;
import lc.u0;
import mh1.q;
import mt0.s1;
import mu0.m;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import q92.x;
import r22.q0;
import z10.a1;
import z10.d1;
import z10.d2;
import zb0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/e;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends m0 {
    public static final a D = new a(null);
    public final w1 A;
    public final c B;
    public final d C;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f38605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f38606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f38607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f38608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f38609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f38610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f38611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexOneLineButton f38612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexOneLineButton f38613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexOneLineButton f38614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f38615r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f38616t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f38617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexOneLineButton f38618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sd2.f f38619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Logger f38620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f38621z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38622a;

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
            f38622a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/ui/e$c", "Lxf0/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends xf0.b {
        public c() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            gVar.getClass();
            e eVar = e.this;
            eVar.T6(eVar.f38619x);
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            hVar.getClass();
            e eVar = e.this;
            eVar.T6(eVar.f38619x);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/liveeventsharing/ui/e$d", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            e eVar = e.this;
            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38613p;
            if (gCMComplexOneLineButton == null) {
                p005kotlin.jvm.internal.s.m("recipientsButton");
                throw null;
            }
            if (p005kotlin.jvm.internal.s.g(gCMComplexOneLineButton.getButtonRightLabel(), eVar.getString(R.string.lbl_none))) {
                GCMComplexOneLineButton gCMComplexOneLineButton2 = eVar.f38612o;
                if (gCMComplexOneLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
                    throw null;
                }
                if (gCMComplexOneLineButton2.f47771k.isChecked()) {
                    androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(eVar.requireContext());
                    aVar.setTitle(eVar.getString(R.string.live_event_dialog_sharing_no_recipients_title));
                    aVar.setMessage(eVar.getString(R.string.live_event_dialog_sharing_no_recipients_desc));
                    aVar.setCancelable(false);
                    aVar.setNegativeButton(eVar.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null);
                    aVar.setPositiveButton(eVar.getString(R.string.lbl_common_continue), new m(eVar, 0));
                    aVar.create().show();
                    return;
                }
            }
            f(false);
            eVar.requireActivity().onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.liveeventsharing.ui.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0683e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38625a;

        public C0683e(l lVar) {
            lVar.getClass();
            this.f38625a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38625a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38625a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38626a;

        public f(Fragment fragment) {
            this.f38626a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f38626a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<cu0.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38631e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38627a = fragment;
            this.f38628b = qualifier;
            this.f38629c = aVar;
            this.f38630d = aVar2;
            this.f38631e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, cu0.i] */
        @Override // e23.a
        public final cu0.i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38629c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f38627a;
            e23.a aVar = this.f38630d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(cu0.i.class), f189591b, null, defaultViewModelCreationExtras, this.f38628b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38631e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38632a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f38632a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38632a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f38634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f38633a = aVar;
            this.f38634b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38633a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38634b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public e() {
        int i14 = gt2.c.f79010a;
        this.f38620y = gt2.b.f79005a.h("LiveEventSharingMainFragment");
        this.f38621z = o13.m.a(o13.n.NONE, new g(this, null, new f(this), null, null));
        this.A = new w1(s0.f105811a.b(d2.class), new h(this), new q(17), new i(null, this));
        this.B = new c();
        this.C = new d();
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        cu0.i iVarK6 = K6();
        iVarK6.getClass();
        a2 a2Var = a2.LIVE_EVENT_SHARING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveEventViewModel", "refreshData()");
        y0<String> y0Var = iVarK6.f55585c;
        y0Var.m(y0Var.d());
    }

    public final void I6(iu0.c cVar) {
        sd2.f fVar = cVar != null ? cVar.f95013a : null;
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f38612o;
        if (fVar == null) {
            if (gCMComplexOneLineButton == null) {
                p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
                throw null;
            }
            gCMComplexOneLineButton.setEnabled(false);
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f38614q;
            if (gCMComplexOneLineButton2 != null) {
                gCMComplexOneLineButton2.setEnabled(false);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("messageOptionsButton");
                throw null;
            }
        }
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
            throw null;
        }
        gCMComplexOneLineButton.setEnabled(true);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f38614q;
        if (gCMComplexOneLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("messageOptionsButton");
            throw null;
        }
        gCMComplexOneLineButton3.setEnabled(true);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f38612o;
        if (gCMComplexOneLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
            throw null;
        }
        gCMComplexOneLineButton4.i(cVar.f95014b);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f38613p;
        if (gCMComplexOneLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("recipientsButton");
            throw null;
        }
        int i14 = cVar.f95015c;
        gCMComplexOneLineButton5.setButtonRightLabel(i14 > 0 ? String.valueOf(i14) : getString(R.string.lbl_none));
        boolean z14 = cVar.f95016d;
        GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f38613p;
        if (z14) {
            if (gCMComplexOneLineButton6 == null) {
                p005kotlin.jvm.internal.s.m("recipientsButton");
                throw null;
            }
            ImageView imageView = gCMComplexOneLineButton6.f47768h;
            imageView.setImageResource(R.drawable.ic_error_circle_small);
            imageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Context context = gCMComplexOneLineButton6.getContext();
            context.getClass();
            Resources resources = gCMComplexOneLineButton6.getContext().getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 16.0f), 1.5f);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            Context context2 = gCMComplexOneLineButton6.getContext();
            context2.getClass();
            Resources resources2 = gCMComplexOneLineButton6.getContext().getResources();
            resources2.getClass();
            layoutParams2.height = (int) c22.b.c(context2, xy2.b.n(resources2, 16.0f), 1.5f);
        } else {
            if (gCMComplexOneLineButton6 == null) {
                p005kotlin.jvm.internal.s.m("recipientsButton");
                throw null;
            }
            gCMComplexOneLineButton6.c(null, Float.valueOf(16.0f));
        }
        sd2.f fVar2 = cVar.f95013a;
        this.f38619x = fVar2;
        T6(fVar2);
        iu0.e eVar = cVar.f95017e;
        if (eVar != null) {
            TextView textView = this.f38615r;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("textBubbleView");
                throw null;
            }
            cu0.g gVar = cu0.g.f55579a;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            gVar.getClass();
            textView.setText(cu0.g.b(contextRequireContext, eVar));
            if (eVar.f95029i) {
                GCMComplexOneLineButton gCMComplexOneLineButton7 = this.f38617v;
                if (gCMComplexOneLineButton7 == null) {
                    p005kotlin.jvm.internal.s.m("liveTrackToggle");
                    throw null;
                }
                Boolean bool = eVar.f95028h;
                gCMComplexOneLineButton7.i(bool != null ? bool.booleanValue() : false);
                LinearLayout linearLayout = this.f38606i;
                if (linearLayout == null) {
                    p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
                    throw null;
                }
                linearLayout.setVisibility(0);
            } else {
                LinearLayout linearLayout2 = this.f38606i;
                if (linearLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
                    throw null;
                }
                linearLayout2.setVisibility(8);
            }
        }
        if (!cVar.f95014b) {
            LinearLayout linearLayout3 = this.f38606i;
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
                throw null;
            }
            linearLayout3.setEnabled(false);
            LinearLayout linearLayout4 = this.f38606i;
            if (linearLayout4 == null) {
                p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
                throw null;
            }
            linearLayout4.setAlpha(0.5f);
            GCMComplexOneLineButton gCMComplexOneLineButton8 = this.f38617v;
            if (gCMComplexOneLineButton8 == null) {
                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                throw null;
            }
            gCMComplexOneLineButton8.setEnabled(false);
            GCMComplexOneLineButton gCMComplexOneLineButton9 = this.f38618w;
            if (gCMComplexOneLineButton9 == null) {
                p005kotlin.jvm.internal.s.m("liveTrackOptions");
                throw null;
            }
            gCMComplexOneLineButton9.setEnabled(false);
            requireContext().stopService(new Intent(requireContext(), (Class<?>) LiveEventService.class));
            return;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        cu0.g.d(contextRequireContext2, false);
        LinearLayout linearLayout5 = this.f38606i;
        if (linearLayout5 == null) {
            p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
            throw null;
        }
        linearLayout5.setEnabled(true);
        LinearLayout linearLayout6 = this.f38606i;
        if (linearLayout6 == null) {
            p005kotlin.jvm.internal.s.m("liveTrackSectionLayout");
            throw null;
        }
        linearLayout6.setAlpha(1.0f);
        GCMComplexOneLineButton gCMComplexOneLineButton10 = this.f38617v;
        if (gCMComplexOneLineButton10 == null) {
            p005kotlin.jvm.internal.s.m("liveTrackToggle");
            throw null;
        }
        gCMComplexOneLineButton10.setEnabled(true);
        GCMComplexOneLineButton gCMComplexOneLineButton11 = this.f38618w;
        if (gCMComplexOneLineButton11 != null) {
            gCMComplexOneLineButton11.setEnabled(true);
        } else {
            p005kotlin.jvm.internal.s.m("liveTrackOptions");
            throw null;
        }
    }

    public final void J6() {
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f38612o;
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
            throw null;
        }
        gCMComplexOneLineButton.setOnCheckedChangeListener(null);
        LinearLayout linearLayout = this.f38605h;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("deviceSelectedLayout");
            throw null;
        }
        linearLayout.setOnClickListener(null);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f38617v;
        if (gCMComplexOneLineButton2 != null) {
            gCMComplexOneLineButton2.setOnCheckedChangeListener(null);
        } else {
            p005kotlin.jvm.internal.s.m("liveTrackToggle");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final cu0.i K6() {
        return (cu0.i) this.f38621z.getValue();
    }

    public final void M6() {
        LinearLayout linearLayout = this.f38605h;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("deviceSelectedLayout");
            throw null;
        }
        final int i14 = 3;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121114b;

            {
                this.f121114b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iu0.d dVar;
                int i15 = i14;
                r rVar = null;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121114b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingMsgOptionsClicked");
                        cu0.i iVarK6 = eVar.K6();
                        iVarK6.getClass();
                        iVarK6.f55591i.m("LiveEventMessageOptionsFragment");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingRecipientsClick");
                        cu0.i iVarK7 = eVar.K6();
                        y0<w61.f<r>> y0Var = iVarK7.f55593k;
                        fw.m mVar = (fw.m) iVarK7.f55586d.d();
                        if (mVar != null && (dVar = (iu0.d) mVar.f73770c) != null) {
                            rVar = dVar.f95019b;
                        }
                        y0Var.m(new w61.f<>(rVar));
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55595m.m(new w61.f<>(Unit.INSTANCE));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55594l.m(new w61.f<>(Unit.INSTANCE));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f38612o;
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
            throw null;
        }
        final int i15 = 1;
        gCMComplexOneLineButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: mu0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121116b;

            {
                this.f121116b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121116b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        compoundButton.getClass();
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingLivetrackToggle");
                        if (z14) {
                            ((d2) eVar.A.getValue()).x4(x.DI_CONNECT_LIVETRACK);
                        } else if (!z14) {
                            eVar.K6().E4(false);
                        } else {
                            u0.r();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        compoundButton.getClass();
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingFeatureToggle");
                        if (!z14) {
                            eVar.K6().D4(z14);
                        } else {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar3 = j22.a.f96724m;
                            j22.a aVar4 = j22.a.f96723l;
                            bVar.getClass();
                            if (!j22.b.k(aVar3, aVar4)) {
                                j22.b.z(eVar, 2003, aVar3, aVar4);
                            } else {
                                eVar.S6();
                            }
                        }
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f38614q;
        if (gCMComplexOneLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("messageOptionsButton");
            throw null;
        }
        final int i16 = 0;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121114b;

            {
                this.f121114b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iu0.d dVar;
                int i17 = i16;
                r rVar = null;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121114b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingMsgOptionsClicked");
                        cu0.i iVarK6 = eVar.K6();
                        iVarK6.getClass();
                        iVarK6.f55591i.m("LiveEventMessageOptionsFragment");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingRecipientsClick");
                        cu0.i iVarK7 = eVar.K6();
                        y0<w61.f<r>> y0Var = iVarK7.f55593k;
                        fw.m mVar = (fw.m) iVarK7.f55586d.d();
                        if (mVar != null && (dVar = (iu0.d) mVar.f73770c) != null) {
                            rVar = dVar.f95019b;
                        }
                        y0Var.m(new w61.f<>(rVar));
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55595m.m(new w61.f<>(Unit.INSTANCE));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55594l.m(new w61.f<>(Unit.INSTANCE));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f38613p;
        if (gCMComplexOneLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("recipientsButton");
            throw null;
        }
        final int i17 = 1;
        gCMComplexOneLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121114b;

            {
                this.f121114b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iu0.d dVar;
                int i18 = i17;
                r rVar = null;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121114b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingMsgOptionsClicked");
                        cu0.i iVarK6 = eVar.K6();
                        iVarK6.getClass();
                        iVarK6.f55591i.m("LiveEventMessageOptionsFragment");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingRecipientsClick");
                        cu0.i iVarK7 = eVar.K6();
                        y0<w61.f<r>> y0Var = iVarK7.f55593k;
                        fw.m mVar = (fw.m) iVarK7.f55586d.d();
                        if (mVar != null && (dVar = (iu0.d) mVar.f73770c) != null) {
                            rVar = dVar.f95019b;
                        }
                        y0Var.m(new w61.f<>(rVar));
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55595m.m(new w61.f<>(Unit.INSTANCE));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55594l.m(new w61.f<>(Unit.INSTANCE));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f38617v;
        if (gCMComplexOneLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("liveTrackToggle");
            throw null;
        }
        final int i18 = 0;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: mu0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121116b;

            {
                this.f121116b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121116b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        compoundButton.getClass();
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingLivetrackToggle");
                        if (z14) {
                            ((d2) eVar.A.getValue()).x4(x.DI_CONNECT_LIVETRACK);
                        } else if (!z14) {
                            eVar.K6().E4(false);
                        } else {
                            u0.r();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        compoundButton.getClass();
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingFeatureToggle");
                        if (!z14) {
                            eVar.K6().D4(z14);
                        } else {
                            j22.b bVar = j22.b.f96736a;
                            j22.a aVar3 = j22.a.f96724m;
                            j22.a aVar4 = j22.a.f96723l;
                            bVar.getClass();
                            if (!j22.b.k(aVar3, aVar4)) {
                                j22.b.z(eVar, 2003, aVar3, aVar4);
                            } else {
                                eVar.S6();
                            }
                        }
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f38618w;
        if (gCMComplexOneLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("liveTrackOptions");
            throw null;
        }
        final int i19 = 2;
        gCMComplexOneLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: mu0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121114b;

            {
                this.f121114b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iu0.d dVar;
                int i110 = i19;
                r rVar = null;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121114b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingMsgOptionsClicked");
                        cu0.i iVarK6 = eVar.K6();
                        iVarK6.getClass();
                        iVarK6.f55591i.m("LiveEventMessageOptionsFragment");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "LiveEventSharingRecipientsClick");
                        cu0.i iVarK7 = eVar.K6();
                        y0<w61.f<r>> y0Var = iVarK7.f55593k;
                        fw.m mVar = (fw.m) iVarK7.f55586d.d();
                        if (mVar != null && (dVar = (iu0.d) mVar.f73770c) != null) {
                            rVar = dVar.f95019b;
                        }
                        y0Var.m(new w61.f<>(rVar));
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55595m.m(new w61.f<>(Unit.INSTANCE));
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.K6().f55594l.m(new w61.f<>(Unit.INSTANCE));
                        break;
                }
            }
        });
    }

    public final void S6() {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
        aVar.setTitle(getString(R.string.live_event_sharing_title));
        aVar.setMessage(getString(R.string.live_event_sharing_dialog_msg));
        aVar.setCancelable(false);
        aVar.setPositiveButton(getString(R.string.lbl_ok), new m(this, 1));
        aVar.create().show();
    }

    public final void T6(sd2.f fVar) {
        TextView textView = this.f38608k;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("deviceNameView");
            throw null;
        }
        textView.setText(fVar != null ? fVar.getDisplayName() : null);
        ImageView imageView = this.f38611n;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("activeTrackingDeviceImageView");
            throw null;
        }
        t.c(imageView, fVar);
        ImageView imageView2 = this.f38610m;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("deviceConnectionStatusImageView");
            throw null;
        }
        imageView2.setVisibility(0);
        boolean zK = hk0.p.k(fVar != null ? fVar.getUnitID() : -1L);
        ImageView imageView3 = this.f38610m;
        if (zK) {
            if (imageView3 == null) {
                p005kotlin.jvm.internal.s.m("deviceConnectionStatusImageView");
                throw null;
            }
            imageView3.setImageResource(R.drawable.gcm_device_connected_circle);
            TextView textView2 = this.f38609l;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("deviceConnectionStatusView");
                throw null;
            }
            textView2.setText(getString(R.string.txt_garmin_device_connected));
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f38612o;
            if (gCMComplexOneLineButton == null) {
                p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
                throw null;
            }
            gCMComplexOneLineButton.setEnabled(true);
        } else {
            if (imageView3 == null) {
                p005kotlin.jvm.internal.s.m("deviceConnectionStatusImageView");
                throw null;
            }
            imageView3.setImageResource(R.drawable.gcm_device_disconnected_circle);
            TextView textView3 = this.f38609l;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("deviceConnectionStatusView");
                throw null;
            }
            textView3.setText(getString(R.string.txt_garmin_device_disconnected));
            boolean zI = km2.a.i(fVar != null ? fVar.getUnitID() : -1L, null, SupportedCapability.LTE_SUPPORT.ordinal());
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f38612o;
            if (gCMComplexOneLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("liveEventSharingToggle");
                throw null;
            }
            gCMComplexOneLineButton2.setEnabled(zI || gCMComplexOneLineButton2.f47771k.isChecked());
            if (!zI) {
                TextView textView4 = this.f38616t;
                if (textView4 == null) {
                    p005kotlin.jvm.internal.s.m("liveEventSharingHint");
                    throw null;
                }
                textView4.setText(getString(R.string.live_event_sharing_options_hint));
            }
        }
        if (wd2.m.e(fVar != null ? fVar.getUnitID() : -1L)) {
            TextView textView5 = this.f38609l;
            if (textView5 != null) {
                textView5.setText(getString(R.string.live_track_in_progress));
            } else {
                p005kotlin.jvm.internal.s.m("deviceConnectionStatusView");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, getString(R.string.live_event_sharing_title));
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.C, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 2001) {
                cu0.i iVarK6 = K6();
                iVarK6.getClass();
                long jR = GCMSettingManager.r(fd0.d.LIVE_EVENT_SHARING, null);
                a2 a2Var = a2.LIVE_EVENT_SHARING;
                String strE = org.apache.commons.lang3.e.e(jR, "changeDevice() deviceId: ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LiveEventViewModel", strE);
                iVarK6.f55585c.m(String.valueOf(jR));
            } else if (i14 == 2002) {
                cu0.i iVarK7 = K6();
                iVarK7.getClass();
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "LiveEventViewModel", "refreshData()");
                y0<String> y0Var = iVarK7.f55585c;
                y0Var.m(y0Var.d());
            } else if (i14 == 2005) {
                K6().B4(true);
            }
        }
        if (i14 == 2005 && i15 == 0) {
            K6().B4(false);
            K6().E4(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_live_event_sharing);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (i14 == 2003) {
            j22.b.f96736a.getClass();
            if (j22.b.E(iArr)) {
                S6();
            } else {
                this.f38620y.info("User rejected sms permission.");
                K6().D4(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.B);
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.top_divider);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(8);
        View viewFindViewById2 = view2.findViewById(R.id.bottom_divider);
        viewFindViewById2.getClass();
        viewFindViewById2.setVisibility(8);
        View viewFindViewById3 = view2.findViewById(R.id.device_picker);
        viewFindViewById3.getClass();
        this.f38605h = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.live_track_section);
        viewFindViewById4.getClass();
        this.f38606i = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.top_title);
        viewFindViewById5.getClass();
        this.f38607j = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.bottom_subtitle1);
        viewFindViewById6.getClass();
        this.f38608k = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.bottom_subtitle_2);
        viewFindViewById7.getClass();
        this.f38609l = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.bottom_row_image);
        viewFindViewById8.getClass();
        this.f38610m = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.top_row_image);
        viewFindViewById9.getClass();
        this.f38611n = (ImageView) viewFindViewById9;
        TextView textView = this.f38607j;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("deviceTitleView");
            throw null;
        }
        textView.setText(getString(R.string.concept_devices));
        View viewFindViewById10 = view2.findViewById(R.id.live_sharing_event_toggle);
        viewFindViewById10.getClass();
        this.f38612o = (GCMComplexOneLineButton) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.live_sharing_event_recipients);
        viewFindViewById11.getClass();
        this.f38613p = (GCMComplexOneLineButton) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.message_options);
        viewFindViewById12.getClass();
        this.f38614q = (GCMComplexOneLineButton) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.live_event_sharing_hint);
        viewFindViewById13.getClass();
        this.f38616t = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.live_track_section);
        viewFindViewById14.getClass();
        this.f38606i = (LinearLayout) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.livetrack_toggle);
        viewFindViewById15.getClass();
        this.f38617v = (GCMComplexOneLineButton) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.lt_options);
        viewFindViewById16.getClass();
        this.f38618w = (GCMComplexOneLineButton) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.text_bubble);
        viewFindViewById17.getClass();
        this.f38615r = (TextView) viewFindViewById17;
        final int i14 = 0;
        K6().f55590h.f(getViewLifecycleOwner(), new C0683e(new l(this) { // from class: mu0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121112b;

            {
                this.f121112b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121112b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.w6();
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i16 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.b.f38622a[pVar.ordinal()];
                        if (i16 == 1) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            eVar.w6();
                        } else if (i16 != 2) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else {
                            g22.e.l(eVar);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        r rVar = (r) ((w61.f) obj).a();
                        if (rVar != null) {
                            LiveEventRecipientsActivity.f38506l.getClass();
                            if (eVar.getContext() != null) {
                                Intent intent = new Intent(eVar.getContext(), (Class<?>) LiveEventRecipientsActivity.class);
                                intent.putExtra("extra_user_contact_dto", rVar);
                                eVar.startActivityForResult(intent, 2002);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            TDSActivity.f34565f.getClass();
                            Intent intent2 = new Intent(eVar.getContext(), (Class<?>) TDSActivity.class);
                            intent2.putExtra("arg.module.type", fd0.d.LIVE_EVENT_SHARING);
                            eVar.startActivityForResult(intent2, 2001);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                            aVar5.getClass();
                            Context context = eVar.getContext();
                            if (context != null) {
                                eVar.startActivityForResult(LiveTrackActivity.a.b(aVar5, context, null), 2004);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        a1 a1Var = (a1) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (a1Var instanceof a1.b) {
                            g22.e.l(eVar);
                        } else if (a1Var instanceof a1.g) {
                            g22.e.f(eVar);
                            eVar.f38620y.info("User has not accepted LiveTrack consent, taking user to consent screen.");
                            ConsentActivity.a aVar7 = ConsentActivity.f32155r;
                            x xVar = x.DI_CONNECT_LIVETRACK;
                            hl.a.c cVar = hl.a.c.f84256b;
                            aVar7.getClass();
                            xVar.getClass();
                            cVar.getClass();
                            Intent intent3 = new Intent(eVar.getContext(), (Class<?>) ConsentActivity.class);
                            intent3.putExtra("extra_consent_feature", xVar);
                            intent3.putExtra("extra_revoke_navigate_my_day", false);
                            intent3.putExtra("GCM_extra_screen_access_role", cVar);
                            eVar.startActivityForResult(intent3, 2005);
                        } else if (a1Var instanceof a1.a) {
                            g22.e.f(eVar);
                            cu0.i iVarK6 = eVar.K6();
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38617v;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                                throw null;
                            }
                            iVarK6.E4(gCMComplexOneLineButton.f47771k.isChecked());
                        } else if (a1Var instanceof a1.d) {
                            g22.e.f(eVar);
                            q0.b bVar = q0.f149800b;
                            View viewRequireView = eVar.requireView();
                            viewRequireView.getClass();
                            bVar.getClass();
                            q0.b.a(viewRequireView, R.string.msg_request_sent, 1).show();
                        } else if (a1Var instanceof a1.c) {
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else if (a1Var instanceof a1.e) {
                            g22.e.f(eVar);
                            d1 d1Var = d1.f200951a;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            d1.m(d1Var, contextRequireContext);
                        } else {
                            if (!(a1Var instanceof a1.f)) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(eVar);
                            d1 d1Var2 = d1.f200951a;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            s1 s1Var = new s1(1, eVar, a1Var);
                            d1Var2.getClass();
                            d1.v(s1Var, contextRequireContext2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        K6().f55593k.f(getViewLifecycleOwner(), new C0683e(new l(this) { // from class: mu0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121112b;

            {
                this.f121112b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121112b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.w6();
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i17 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.b.f38622a[pVar.ordinal()];
                        if (i17 == 1) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            eVar.w6();
                        } else if (i17 != 2) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else {
                            g22.e.l(eVar);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        r rVar = (r) ((w61.f) obj).a();
                        if (rVar != null) {
                            LiveEventRecipientsActivity.f38506l.getClass();
                            if (eVar.getContext() != null) {
                                Intent intent = new Intent(eVar.getContext(), (Class<?>) LiveEventRecipientsActivity.class);
                                intent.putExtra("extra_user_contact_dto", rVar);
                                eVar.startActivityForResult(intent, 2002);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            TDSActivity.f34565f.getClass();
                            Intent intent2 = new Intent(eVar.getContext(), (Class<?>) TDSActivity.class);
                            intent2.putExtra("arg.module.type", fd0.d.LIVE_EVENT_SHARING);
                            eVar.startActivityForResult(intent2, 2001);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                            aVar5.getClass();
                            Context context = eVar.getContext();
                            if (context != null) {
                                eVar.startActivityForResult(LiveTrackActivity.a.b(aVar5, context, null), 2004);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        a1 a1Var = (a1) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (a1Var instanceof a1.b) {
                            g22.e.l(eVar);
                        } else if (a1Var instanceof a1.g) {
                            g22.e.f(eVar);
                            eVar.f38620y.info("User has not accepted LiveTrack consent, taking user to consent screen.");
                            ConsentActivity.a aVar7 = ConsentActivity.f32155r;
                            x xVar = x.DI_CONNECT_LIVETRACK;
                            hl.a.c cVar = hl.a.c.f84256b;
                            aVar7.getClass();
                            xVar.getClass();
                            cVar.getClass();
                            Intent intent3 = new Intent(eVar.getContext(), (Class<?>) ConsentActivity.class);
                            intent3.putExtra("extra_consent_feature", xVar);
                            intent3.putExtra("extra_revoke_navigate_my_day", false);
                            intent3.putExtra("GCM_extra_screen_access_role", cVar);
                            eVar.startActivityForResult(intent3, 2005);
                        } else if (a1Var instanceof a1.a) {
                            g22.e.f(eVar);
                            cu0.i iVarK6 = eVar.K6();
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38617v;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                                throw null;
                            }
                            iVarK6.E4(gCMComplexOneLineButton.f47771k.isChecked());
                        } else if (a1Var instanceof a1.d) {
                            g22.e.f(eVar);
                            q0.b bVar = q0.f149800b;
                            View viewRequireView = eVar.requireView();
                            viewRequireView.getClass();
                            bVar.getClass();
                            q0.b.a(viewRequireView, R.string.msg_request_sent, 1).show();
                        } else if (a1Var instanceof a1.c) {
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else if (a1Var instanceof a1.e) {
                            g22.e.f(eVar);
                            d1 d1Var = d1.f200951a;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            d1.m(d1Var, contextRequireContext);
                        } else {
                            if (!(a1Var instanceof a1.f)) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(eVar);
                            d1 d1Var2 = d1.f200951a;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            s1 s1Var = new s1(1, eVar, a1Var);
                            d1Var2.getClass();
                            d1.v(s1Var, contextRequireContext2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        K6().f55594l.f(getViewLifecycleOwner(), new C0683e(new l(this) { // from class: mu0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121112b;

            {
                this.f121112b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121112b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.w6();
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i18 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.b.f38622a[pVar.ordinal()];
                        if (i18 == 1) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            eVar.w6();
                        } else if (i18 != 2) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else {
                            g22.e.l(eVar);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        r rVar = (r) ((w61.f) obj).a();
                        if (rVar != null) {
                            LiveEventRecipientsActivity.f38506l.getClass();
                            if (eVar.getContext() != null) {
                                Intent intent = new Intent(eVar.getContext(), (Class<?>) LiveEventRecipientsActivity.class);
                                intent.putExtra("extra_user_contact_dto", rVar);
                                eVar.startActivityForResult(intent, 2002);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            TDSActivity.f34565f.getClass();
                            Intent intent2 = new Intent(eVar.getContext(), (Class<?>) TDSActivity.class);
                            intent2.putExtra("arg.module.type", fd0.d.LIVE_EVENT_SHARING);
                            eVar.startActivityForResult(intent2, 2001);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                            aVar5.getClass();
                            Context context = eVar.getContext();
                            if (context != null) {
                                eVar.startActivityForResult(LiveTrackActivity.a.b(aVar5, context, null), 2004);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        a1 a1Var = (a1) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (a1Var instanceof a1.b) {
                            g22.e.l(eVar);
                        } else if (a1Var instanceof a1.g) {
                            g22.e.f(eVar);
                            eVar.f38620y.info("User has not accepted LiveTrack consent, taking user to consent screen.");
                            ConsentActivity.a aVar7 = ConsentActivity.f32155r;
                            x xVar = x.DI_CONNECT_LIVETRACK;
                            hl.a.c cVar = hl.a.c.f84256b;
                            aVar7.getClass();
                            xVar.getClass();
                            cVar.getClass();
                            Intent intent3 = new Intent(eVar.getContext(), (Class<?>) ConsentActivity.class);
                            intent3.putExtra("extra_consent_feature", xVar);
                            intent3.putExtra("extra_revoke_navigate_my_day", false);
                            intent3.putExtra("GCM_extra_screen_access_role", cVar);
                            eVar.startActivityForResult(intent3, 2005);
                        } else if (a1Var instanceof a1.a) {
                            g22.e.f(eVar);
                            cu0.i iVarK6 = eVar.K6();
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38617v;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                                throw null;
                            }
                            iVarK6.E4(gCMComplexOneLineButton.f47771k.isChecked());
                        } else if (a1Var instanceof a1.d) {
                            g22.e.f(eVar);
                            q0.b bVar = q0.f149800b;
                            View viewRequireView = eVar.requireView();
                            viewRequireView.getClass();
                            bVar.getClass();
                            q0.b.a(viewRequireView, R.string.msg_request_sent, 1).show();
                        } else if (a1Var instanceof a1.c) {
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else if (a1Var instanceof a1.e) {
                            g22.e.f(eVar);
                            d1 d1Var = d1.f200951a;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            d1.m(d1Var, contextRequireContext);
                        } else {
                            if (!(a1Var instanceof a1.f)) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(eVar);
                            d1 d1Var2 = d1.f200951a;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            s1 s1Var = new s1(1, eVar, a1Var);
                            d1Var2.getClass();
                            d1.v(s1Var, contextRequireContext2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 3;
        K6().f55595m.f(getViewLifecycleOwner(), new C0683e(new l(this) { // from class: mu0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121112b;

            {
                this.f121112b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121112b;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.w6();
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i19 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.b.f38622a[pVar.ordinal()];
                        if (i19 == 1) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            eVar.w6();
                        } else if (i19 != 2) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else {
                            g22.e.l(eVar);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        r rVar = (r) ((w61.f) obj).a();
                        if (rVar != null) {
                            LiveEventRecipientsActivity.f38506l.getClass();
                            if (eVar.getContext() != null) {
                                Intent intent = new Intent(eVar.getContext(), (Class<?>) LiveEventRecipientsActivity.class);
                                intent.putExtra("extra_user_contact_dto", rVar);
                                eVar.startActivityForResult(intent, 2002);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            TDSActivity.f34565f.getClass();
                            Intent intent2 = new Intent(eVar.getContext(), (Class<?>) TDSActivity.class);
                            intent2.putExtra("arg.module.type", fd0.d.LIVE_EVENT_SHARING);
                            eVar.startActivityForResult(intent2, 2001);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                            aVar5.getClass();
                            Context context = eVar.getContext();
                            if (context != null) {
                                eVar.startActivityForResult(LiveTrackActivity.a.b(aVar5, context, null), 2004);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        a1 a1Var = (a1) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (a1Var instanceof a1.b) {
                            g22.e.l(eVar);
                        } else if (a1Var instanceof a1.g) {
                            g22.e.f(eVar);
                            eVar.f38620y.info("User has not accepted LiveTrack consent, taking user to consent screen.");
                            ConsentActivity.a aVar7 = ConsentActivity.f32155r;
                            x xVar = x.DI_CONNECT_LIVETRACK;
                            hl.a.c cVar = hl.a.c.f84256b;
                            aVar7.getClass();
                            xVar.getClass();
                            cVar.getClass();
                            Intent intent3 = new Intent(eVar.getContext(), (Class<?>) ConsentActivity.class);
                            intent3.putExtra("extra_consent_feature", xVar);
                            intent3.putExtra("extra_revoke_navigate_my_day", false);
                            intent3.putExtra("GCM_extra_screen_access_role", cVar);
                            eVar.startActivityForResult(intent3, 2005);
                        } else if (a1Var instanceof a1.a) {
                            g22.e.f(eVar);
                            cu0.i iVarK6 = eVar.K6();
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38617v;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                                throw null;
                            }
                            iVarK6.E4(gCMComplexOneLineButton.f47771k.isChecked());
                        } else if (a1Var instanceof a1.d) {
                            g22.e.f(eVar);
                            q0.b bVar = q0.f149800b;
                            View viewRequireView = eVar.requireView();
                            viewRequireView.getClass();
                            bVar.getClass();
                            q0.b.a(viewRequireView, R.string.msg_request_sent, 1).show();
                        } else if (a1Var instanceof a1.c) {
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else if (a1Var instanceof a1.e) {
                            g22.e.f(eVar);
                            d1 d1Var = d1.f200951a;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            d1.m(d1Var, contextRequireContext);
                        } else {
                            if (!(a1Var instanceof a1.f)) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(eVar);
                            d1 d1Var2 = d1.f200951a;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            s1 s1Var = new s1(1, eVar, a1Var);
                            d1Var2.getClass();
                            d1.v(s1Var, contextRequireContext2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 4;
        ((d2) this.A.getValue()).f200958c.f(getViewLifecycleOwner(), new C0683e(new l(this) { // from class: mu0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121112b;

            {
                this.f121112b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121112b;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        eVar.w6();
                        p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i110 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.b.f38622a[pVar.ordinal()];
                        if (i110 == 1) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            eVar.w6();
                        } else if (i110 != 2) {
                            eVar.J6();
                            eVar.I6((iu0.c) t7);
                            eVar.M6();
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else {
                            g22.e.l(eVar);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        r rVar = (r) ((w61.f) obj).a();
                        if (rVar != null) {
                            LiveEventRecipientsActivity.f38506l.getClass();
                            if (eVar.getContext() != null) {
                                Intent intent = new Intent(eVar.getContext(), (Class<?>) LiveEventRecipientsActivity.class);
                                intent.putExtra("extra_user_contact_dto", rVar);
                                eVar.startActivityForResult(intent, 2002);
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar3 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            TDSActivity.f34565f.getClass();
                            Intent intent2 = new Intent(eVar.getContext(), (Class<?>) TDSActivity.class);
                            intent2.putExtra("arg.module.type", fd0.d.LIVE_EVENT_SHARING);
                            eVar.startActivityForResult(intent2, 2001);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (((Unit) ((w61.f) obj).a()) != null) {
                            LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                            aVar5.getClass();
                            Context context = eVar.getContext();
                            if (context != null) {
                                eVar.startActivityForResult(LiveTrackActivity.a.b(aVar5, context, null), 2004);
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        a1 a1Var = (a1) obj;
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                        if (a1Var instanceof a1.b) {
                            g22.e.l(eVar);
                        } else if (a1Var instanceof a1.g) {
                            g22.e.f(eVar);
                            eVar.f38620y.info("User has not accepted LiveTrack consent, taking user to consent screen.");
                            ConsentActivity.a aVar7 = ConsentActivity.f32155r;
                            x xVar = x.DI_CONNECT_LIVETRACK;
                            hl.a.c cVar = hl.a.c.f84256b;
                            aVar7.getClass();
                            xVar.getClass();
                            cVar.getClass();
                            Intent intent3 = new Intent(eVar.getContext(), (Class<?>) ConsentActivity.class);
                            intent3.putExtra("extra_consent_feature", xVar);
                            intent3.putExtra("extra_revoke_navigate_my_day", false);
                            intent3.putExtra("GCM_extra_screen_access_role", cVar);
                            eVar.startActivityForResult(intent3, 2005);
                        } else if (a1Var instanceof a1.a) {
                            g22.e.f(eVar);
                            cu0.i iVarK6 = eVar.K6();
                            GCMComplexOneLineButton gCMComplexOneLineButton = eVar.f38617v;
                            if (gCMComplexOneLineButton == null) {
                                p005kotlin.jvm.internal.s.m("liveTrackToggle");
                                throw null;
                            }
                            iVarK6.E4(gCMComplexOneLineButton.f47771k.isChecked());
                        } else if (a1Var instanceof a1.d) {
                            g22.e.f(eVar);
                            q0.b bVar = q0.f149800b;
                            View viewRequireView = eVar.requireView();
                            viewRequireView.getClass();
                            bVar.getClass();
                            q0.b.a(viewRequireView, R.string.msg_request_sent, 1).show();
                        } else if (a1Var instanceof a1.c) {
                            g22.e.f(eVar);
                            g22.e.c(eVar);
                        } else if (a1Var instanceof a1.e) {
                            g22.e.f(eVar);
                            d1 d1Var = d1.f200951a;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            d1.m(d1Var, contextRequireContext);
                        } else {
                            if (!(a1Var instanceof a1.f)) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(eVar);
                            d1 d1Var2 = d1.f200951a;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            s1 s1Var = new s1(1, eVar, a1Var);
                            d1Var2.getClass();
                            d1.v(s1Var, contextRequireContext2);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/e$a;", "", "<init>", "()V", "", "REQUEST_CODE_TARGET_DEVICE_SELECTION", "I", "REQUEST_CODE_CONTACTS", "PERMISSION_SEND_SMS_REQUEST_CODE", "REQUEST_CODE_LIVETRACK_OPTIONS", "REQUEST_CODE_LIVETRACK_POLICY", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
