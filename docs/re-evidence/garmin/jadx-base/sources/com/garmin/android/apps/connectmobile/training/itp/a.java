package com.garmin.android.apps.connectmobile.training.itp;

import am.a2;
import am.i1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.l2;
import gl1.y;
import i3.e5;
import kotlin.w3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0880a f45600c = new C0880a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45602b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f45603a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45603a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45604a = aVar;
            this.f45605b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45604a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45605b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45606a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45606a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.fbt_activity_view);
        this.f45601a = j0.f134944a;
        this.f45602b = new w1(s0.f105811a.b(ow1.d.class), new b(this), new d(this), new c(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Object objD = a2.d(l2.a.b().c(this), "EXTRA_ITEMS");
        if (objD == null) {
            objD = j0.f134944a;
        }
        this.f45601a = objD;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        Context context = composeView.getContext();
        context.getClass();
        composeView.setContent(new e(-455555700, true, new ow1.a(this, new pi0.e(context), 0)));
    }

    public final void u6(vw1.e eVar, boolean z14, m mVar, int i14) {
        o0 o0VarE = mVar.E(1576567880);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = n.f135158a;
            ActivityListItemDTO activityListItemDTO = eVar.f180589y;
            if (activityListItemDTO == null) {
                o0VarE.C(2066484988);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2066484989);
                hw1.b.a(null, z14, 0.0f, 0L, null, f.c(610896858, new o72.b(6, activityListItemDTO, eVar), o0VarE), o0VarE, (i15 & 112) | 196608);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(this, eVar, z14, i14, 28);
        }
    }

    public final void v6(vw1.e eVar, boolean z14, boolean z15, m mVar, int i14) {
        String string;
        String str = eVar.f180579m;
        o0 o0VarE = mVar.E(542570284);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            if (g22.n.d(str)) {
                o0VarE.C(1749695072);
                String strQ = y.Q(o0VarE, R.string.lbl_workout);
                String strQ2 = y.Q(o0VarE, eVar.f180590z.f116769e);
                StringBuilder sbL = e5.l(strQ, StringUtils.SPACE, str, ". ", y.Q(o0VarE, R.string.lbl_workout_category));
                sbL.append(", ");
                sbL.append(strQ2);
                string = sbL.toString();
                o0VarE.g0(false);
            } else {
                o0VarE.C(1750030740);
                o0VarE.g0(false);
                string = "";
            }
            hw1.b.a(null, z14, 0.0f, 0L, null, f.c(1104104756, new h21.m(eVar, string, this, z15, 11), o0VarE), o0VarE, (i15 & 112) | 196608);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(this, eVar, z14, z15, i14, 5);
        }
    }

    public final ow1.d w6() {
        return (ow1.d) this.f45602b.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.itp.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/a$a;", "", "<init>", "()V", "", "EXTRA_ITEMS", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0880a {
        public /* synthetic */ C0880a(j jVar) {
            this();
        }

        private C0880a() {
        }
    }
}
