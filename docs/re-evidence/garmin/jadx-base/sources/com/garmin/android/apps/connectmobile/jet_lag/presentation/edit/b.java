package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import a61.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import ds0.m;
import e23.l;
import fw.p;
import o13.h;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/b;", "Le32/c;", "Lyr0/g;", "Ljs0/a;", "Lds0/m;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends e32.c<yr0.g, js0.a, m> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f37020x = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f37021n = new w1(s0.f105811a.b(is0.c.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public is0.a f37022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public yr0.g f37023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem f37024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MenuItem f37025r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MenuItem f37026t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MenuItem f37027v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.c<Intent> f37028w;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0663b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37029a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37029a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/presentation/edit/b$c", "Landroidx/core/view/s;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            Bundle arguments;
            yr0.f fVar;
            menu.getClass();
            menuInflater.getClass();
            b bVar = b.this;
            yr0.g gVar = bVar.f37023p;
            boolean z14 = (((gVar == null || (fVar = gVar.f198958a) == null) ? null : fVar.getTripId()) == null && (arguments = bVar.getArguments()) != null && arguments.getLong("EXTRA_TRIP_ID") == 0) ? false : true;
            MenuItem menuItemAdd = menu.add(0, 112, 0, R.string.lbl_edit_trip);
            bVar.f37024q = menuItemAdd;
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(0);
            }
            MenuItem menuItem = bVar.f37024q;
            if (menuItem != null) {
                menuItem.setVisible(z14);
            }
            MenuItem menuItemAdd2 = menu.add(0, 113, 0, R.string.lbl_view_group_calendar);
            bVar.f37025r = menuItemAdd2;
            if (menuItemAdd2 != null) {
                menuItemAdd2.setShowAsActionFlags(0);
            }
            MenuItem menuItem2 = bVar.f37025r;
            if (menuItem2 != null) {
                menuItem2.setVisible(true);
            }
            MenuItem menuItemAdd3 = menu.add(0, 115, 0, R.string.lbl_help);
            bVar.f37026t = menuItemAdd3;
            if (menuItemAdd3 != null) {
                menuItemAdd3.setShowAsActionFlags(0);
            }
            MenuItem menuItem3 = bVar.f37026t;
            if (menuItem3 != null) {
                menuItem3.setVisible(true);
            }
            MenuItem menuItemAdd4 = menu.add(0, 114, 0, R.string.lbl_delete_trip);
            bVar.f37027v = menuItemAdd4;
            if (menuItemAdd4 != null) {
                menuItemAdd4.setShowAsActionFlags(0);
            }
            MenuItem menuItem4 = bVar.f37027v;
            if (menuItem4 != null) {
                menuItem4.setVisible(z14);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005c  */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 java.lang.Object, still in use, count: 2, list:
              (r5v4 java.lang.Object) from 0x00fa: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v4 java.lang.Object) binds: [B:54:0x00f9, B:71:0x00fa] A[DONT_GENERATE, DONT_INLINE]
              (r5v4 java.lang.Object) from 0x00ee: CHECK_CAST (yr0.o) (r5v4 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // androidx.core.view.s
        public final boolean w5(android.view.MenuItem r14) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.c.w5(android.view.MenuItem):boolean");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37031a;

        public d(l lVar) {
            lVar.getClass();
            this.f37031a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f37031a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37031a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f37032a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37032a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37033a = aVar;
            this.f37034b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37033a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37034b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37035a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37035a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new i(this, 26));
        cVarRegisterForActivityResult.getClass();
        this.f37028w = cVarRegisterForActivityResult;
    }

    @Override // e32.a
    public final e32.p K6(View view2, e32.l lVar) {
        return new js0.a(view2);
    }

    @Override // e32.a
    public final void M6(Object obj) {
        yr0.g gVar = (yr0.g) obj;
        super.M6(gVar);
        this.f37023p = gVar;
        requireActivity().invalidateOptionsMenu();
    }

    @Override // e32.c
    public final f32.l V6() {
        return ((is0.c) this.f37021n.getValue()).f94908e;
    }

    @Override // e32.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        b bVar;
        super.onCreate(bundle);
        is0.a aVar = this.f37022o;
        if (aVar != null) {
            aVar.cancel();
        }
        long secondOfMinute = 60000 - (((long) LocalTime.now().getSecondOfMinute()) * 1000);
        if (secondOfMinute != 0) {
            is0.a aVar2 = new is0.a(secondOfMinute, secondOfMinute, this);
            bVar = this;
            bVar.f37022o = aVar2;
            aVar2.start();
        } else {
            bVar = this;
            is0.a aVar3 = new is0.a(C.NANOS_PER_SECOND, 60000L, bVar);
            bVar.f37022o = aVar3;
            aVar3.start();
        }
        ((is0.c) bVar.f37021n.getValue()).f94905b.f(this, new d(new ho0.g(this, 26)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_jet_lag_details_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        is0.a aVar = this.f37022o;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    @Override // e32.c, e32.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/b$a;", "", "<init>", "()V", "", "ONE_SECOND_VALUE", "J", "ONE_MINUTE_VALUE", "LARGE_COUNTER_VALUE", "", "MENU_ITEM_EDIT_TRIP", "I", "MENU_ITEM_VIEW_CALENDAR", "MENU_ITEM_DELETE_TRIP", "MENU_ITEM_HELP", "", "EXTRA_DRAWER_SHOWN", "Ljava/lang/String;", "EXTRA_TRIP_ID", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(long j8, boolean z14, Long l14) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            e32.c.f62777m.getClass();
            bundle.putLong("extra.date.time", j8);
            bundle.putBoolean("EXTRA_DRAWER_SHOWN", z14);
            bundle.putLong("EXTRA_TRIP_ID", l14.longValue());
            bVar.setArguments(bundle);
            return bVar;
        }

        private a() {
        }
    }
}
