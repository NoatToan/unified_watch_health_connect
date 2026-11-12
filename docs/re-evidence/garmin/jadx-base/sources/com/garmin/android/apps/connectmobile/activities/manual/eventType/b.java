package com.garmin.android.apps.connectmobile.activities.manual.eventType;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import fg0.k;
import h5.e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.w3;
import lc.u0;
import o13.h;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import r22.q0;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "loadUI", "Lfg0/k;", "eventLinkedToActivity", "Lqs/g;", "currentEventTypeSelection", "eventSelectionSupportType", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29199g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f29202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f29204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f29205f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.manual.eventType.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.eventType.ActivitiesEventTypeFragment$EventTypeScreen$1$1", f = "ActivitiesEventTypeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0450b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f29207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<k> f29208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<qs.g> f29209d;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.manual.eventType.b$b$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f29211b;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f29210a = iArr;
                int[] iArr2 = new int[ln.a.values().length];
                try {
                    iArr2[ln.a.LINKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[ln.a.UN_LINKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                f29211b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0450b(p1<Boolean> p1Var, p1<k> p1Var2, p1<qs.g> p1Var3, t13.d<? super C0450b> dVar) {
            super(2, dVar);
            this.f29207b = p1Var;
            this.f29208c = p1Var2;
            this.f29209d = p1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C0450b(this.f29207b, this.f29208c, this.f29209d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0450b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = b.f29199g;
            final b bVar = b.this;
            oo.b bVarV6 = bVar.v6();
            String str = bVar.f29200a;
            boolean z14 = bVar.f29203d;
            str.getClass();
            t13.g gVar = v1.a(bVarV6).f183565a;
            x53.c cVar = s0.f129406a;
            j jVarA = m.a(gVar.plus(x53.b.f189152a), new oo.d(bVarV6, str, z14, null), 2);
            n0 viewLifecycleOwner = bVar.getViewLifecycleOwner();
            final int i14 = 0;
            final p1<Boolean> p1Var = this.f29207b;
            final p1<k> p1Var2 = this.f29208c;
            jVarA.f(viewLifecycleOwner, new d(new l() { // from class: no.d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj2) {
                    k kVar;
                    Long associatedWithActivityId;
                    String strR;
                    String strR2;
                    int i15 = i14;
                    p1 p1Var3 = p1Var2;
                    p1 p1Var4 = p1Var;
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar2 = bVar;
                    Object obj3 = null;
                    switch (i15) {
                        case 0:
                            g3 g3Var = (g3) obj2;
                            fw.p pVar = g3Var.f35300a;
                            T t7 = g3Var.f35301b;
                            if (com.garmin.android.apps.connectmobile.activities.manual.eventType.b.C0450b.a.f29210a[pVar.ordinal()] == 1) {
                                g22.e.l(bVar2);
                            } else {
                                g22.e.f(bVar2);
                                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar3 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                                p1Var4.setValue(Boolean.TRUE);
                                Collection collection = (Collection) t7;
                                if (collection != null && !collection.isEmpty()) {
                                    oo.b bVarV7 = bVar2.v6();
                                    t tVar = bVarV7.f133058h;
                                    long j8 = bVar2.f29201b;
                                    Iterable iterable = (ArrayList) t7;
                                    if (iterable == null) {
                                        iterable = j0.f134944a;
                                    }
                                    iterable.getClass();
                                    if (((y0) tVar.getValue()).d() == 0) {
                                        for (Object obj4 : iterable) {
                                            fg0.j eventCustomization = ((k) obj4).getEventCustomization();
                                            if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null && associatedWithActivityId.longValue() == j8) {
                                                obj3 = obj4;
                                                kVar = (k) obj3;
                                                bVarV7.A4(kVar);
                                            }
                                        }
                                        kVar = (k) obj3;
                                        bVarV7.A4(kVar);
                                    } else {
                                        kVar = (k) ((y0) tVar.getValue()).d();
                                    }
                                    bVar2.f29202c = kVar;
                                    p1Var3.setValue(kVar);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            ln.a aVar4 = (ln.a) obj2;
                            if (aVar4 != null) {
                                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar5 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                                bVar2.v6().z4().j(null);
                                int i16 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.C0450b.a.f29211b[aVar4.ordinal()];
                                if (i16 == 1) {
                                    p1Var4.setValue((k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d());
                                    p1Var3.setValue(bVar2.v6().f133057g);
                                    q0.b bVar3 = q0.f149800b;
                                    View viewRequireView = bVar2.requireView();
                                    viewRequireView.getClass();
                                    Context contextRequireContext = bVar2.requireContext();
                                    k kVar2 = (k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d();
                                    if (kVar2 != null) {
                                        Parcelable.Creator<k> creator = k.CREATOR;
                                        strR = kVar2.r(false);
                                    } else {
                                        strR = null;
                                    }
                                    String string = contextRequireContext.getString(R.string.activity_linked_message, strR);
                                    string.getClass();
                                    q0.b.c(bVar3, viewRequireView, string, null, 12).show();
                                } else {
                                    if (i16 != 2) {
                                        u0.r();
                                        return null;
                                    }
                                    q0.b bVar4 = q0.f149800b;
                                    View viewRequireView2 = bVar2.requireView();
                                    viewRequireView2.getClass();
                                    Context contextRequireContext2 = bVar2.requireContext();
                                    k kVar3 = (k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d();
                                    if (kVar3 != null) {
                                        Parcelable.Creator<k> creator2 = k.CREATOR;
                                        strR2 = kVar3.r(false);
                                    } else {
                                        strR2 = null;
                                    }
                                    String string2 = contextRequireContext2.getString(R.string.activity_unlinked_message, strR2);
                                    string2.getClass();
                                    q0.b.c(bVar4, viewRequireView2, string2, null, 12).show();
                                    p1Var4.setValue(null);
                                    bVar2.v6().A4(null);
                                }
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) bVar.v6().f133061k.getValue();
            n0 viewLifecycleOwner2 = bVar.getViewLifecycleOwner();
            final int i15 = 1;
            final p1<qs.g> p1Var3 = this.f29209d;
            s0Var.f(viewLifecycleOwner2, new d(new l() { // from class: no.d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj2) {
                    k kVar;
                    Long associatedWithActivityId;
                    String strR;
                    String strR2;
                    int i16 = i15;
                    p1 p1Var4 = p1Var3;
                    p1 p1Var5 = p1Var2;
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar2 = bVar;
                    Object obj3 = null;
                    switch (i16) {
                        case 0:
                            g3 g3Var = (g3) obj2;
                            fw.p pVar = g3Var.f35300a;
                            T t7 = g3Var.f35301b;
                            if (com.garmin.android.apps.connectmobile.activities.manual.eventType.b.C0450b.a.f29210a[pVar.ordinal()] == 1) {
                                g22.e.l(bVar2);
                            } else {
                                g22.e.f(bVar2);
                                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar3 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                                p1Var5.setValue(Boolean.TRUE);
                                Collection collection = (Collection) t7;
                                if (collection != null && !collection.isEmpty()) {
                                    oo.b bVarV7 = bVar2.v6();
                                    t tVar = bVarV7.f133058h;
                                    long j8 = bVar2.f29201b;
                                    Iterable iterable = (ArrayList) t7;
                                    if (iterable == null) {
                                        iterable = j0.f134944a;
                                    }
                                    iterable.getClass();
                                    if (((y0) tVar.getValue()).d() == 0) {
                                        for (Object obj4 : iterable) {
                                            fg0.j eventCustomization = ((k) obj4).getEventCustomization();
                                            if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null && associatedWithActivityId.longValue() == j8) {
                                                obj3 = obj4;
                                                kVar = (k) obj3;
                                                bVarV7.A4(kVar);
                                            }
                                        }
                                        kVar = (k) obj3;
                                        bVarV7.A4(kVar);
                                    } else {
                                        kVar = (k) ((y0) tVar.getValue()).d();
                                    }
                                    bVar2.f29202c = kVar;
                                    p1Var4.setValue(kVar);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            ln.a aVar4 = (ln.a) obj2;
                            if (aVar4 != null) {
                                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar5 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                                bVar2.v6().z4().j(null);
                                int i17 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.C0450b.a.f29211b[aVar4.ordinal()];
                                if (i17 == 1) {
                                    p1Var5.setValue((k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d());
                                    p1Var4.setValue(bVar2.v6().f133057g);
                                    q0.b bVar3 = q0.f149800b;
                                    View viewRequireView = bVar2.requireView();
                                    viewRequireView.getClass();
                                    Context contextRequireContext = bVar2.requireContext();
                                    k kVar2 = (k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d();
                                    if (kVar2 != null) {
                                        Parcelable.Creator<k> creator = k.CREATOR;
                                        strR = kVar2.r(false);
                                    } else {
                                        strR = null;
                                    }
                                    String string = contextRequireContext.getString(R.string.activity_linked_message, strR);
                                    string.getClass();
                                    q0.b.c(bVar3, viewRequireView, string, null, 12).show();
                                } else {
                                    if (i17 != 2) {
                                        u0.r();
                                        return null;
                                    }
                                    q0.b bVar4 = q0.f149800b;
                                    View viewRequireView2 = bVar2.requireView();
                                    viewRequireView2.getClass();
                                    Context contextRequireContext2 = bVar2.requireContext();
                                    k kVar3 = (k) ((androidx.lifecycle.s0) bVar2.v6().f133059i.getValue()).d();
                                    if (kVar3 != null) {
                                        Parcelable.Creator<k> creator2 = k.CREATOR;
                                        strR2 = kVar3.r(false);
                                    } else {
                                        strR2 = null;
                                    }
                                    String string2 = contextRequireContext2.getString(R.string.activity_unlinked_message, strR2);
                                    string2.getClass();
                                    q0.b.c(bVar4, viewRequireView2, string2, null, 12).show();
                                    p1Var5.setValue(null);
                                    bVar2.v6().A4(null);
                                }
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/manual/eventType/b$c", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = b.f29199g;
            b bVar = b.this;
            androidx.fragment.app.m activity = bVar.getActivity();
            if (activity != null) {
                Intent intent = new Intent();
                qs.g gVar = bVar.v6().f133057g;
                intent.putExtra("GCM_extra_event_type", gVar != null ? gVar.f147086c : null);
                activity.setResult(-1, intent);
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29213a;

        public d(l lVar) {
            lVar.getClass();
            this.f29213a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29213a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29213a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29214a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f29214a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29214a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f29216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f29215a = aVar;
            this.f29216b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29215a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29216b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29217a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f29217a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29217a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        super(R.layout.composable_container);
        this.f29200a = "";
        this.f29201b = -1L;
        this.f29204e = new w1(p005kotlin.jvm.internal.s0.f105811a.b(oo.b.class), new e(this), new g(this), new f(null, this));
        this.f29205f = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Context context = getContext();
        context.getClass();
        ActivitiesEventTypeActivity activitiesEventTypeActivity = (ActivitiesEventTypeActivity) context;
        i.a supportActionBar = activitiesEventTypeActivity.getSupportActionBar();
        if (supportActionBar != null && !supportActionBar.i()) {
            activitiesEventTypeActivity.showActionBar();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        Serializable serializable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f29205f, viewLifecycleOwner);
        if (v6().f133057g == null) {
            oo.b bVarV6 = v6();
            Bundle arguments = getArguments();
            qs.g gVar = null;
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("GCM_extra_event_type", qs.g.class);
                } else {
                    Serializable serializable2 = arguments.getSerializable("GCM_extra_event_type");
                    serializable = (qs.g) (serializable2 instanceof qs.g ? serializable2 : null);
                }
                gVar = (qs.g) serializable;
            }
            bVarV6.f133057g = gVar;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("GCM_extra_start_date")) == null) {
            string = "";
        }
        this.f29200a = string;
        Bundle arguments3 = getArguments();
        this.f29201b = arguments3 != null ? arguments3.getLong("GCM_extra_activity_id") : -1L;
        Bundle arguments4 = getArguments();
        boolean z14 = false;
        if (arguments4 != null && arguments4.getBoolean("CAN_TRIATHLON_ACTIVITY_LINKED")) {
            z14 = true;
        }
        this.f29203d = z14;
        v6().f133055e = this.f29201b;
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(1522230042, true, new no.b(this, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(i53.c<? extends qs.g> cVar, p3.m mVar, int i14) {
        o0 o0Var;
        Object c0450b;
        Unit unit;
        b bVar = this;
        i53.c<? extends qs.g> cVar2 = cVar;
        cVar2.getClass();
        o0 o0VarE = mVar.E(-1389977571);
        int i15 = (o0VarE.B(cVar2) ? 4 : 2) | i14 | (o0VarE.r(bVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            qs.g gVar = bVar.v6().f133057g;
            qs.g.f147071e.getClass();
            i53.f fVarA = i53.a.a(qs.g.RACE, qs.g.SPECIAL_EVENT);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(gVar);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                if (!h0.R(fVarA, gVar)) {
                    gVar = null;
                }
                objQ4 = p0.n(gVar);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            Unit unit2 = Unit.INSTANCE;
            boolean zR = o0VarE.r(bVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                unit = unit2;
                c0450b = bVar.new C0450b(p1Var, p1Var2, p1Var3, null);
                o0VarE.K(c0450b);
            } else {
                unit = unit2;
                c0450b = objQ5;
            }
            l0.e((p) c0450b, unit, o0VarE);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1038880585);
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                boolean zB = ((i15 & 14) == 4) | o0VarE.B(fVarA) | o0VarE.r(bVar) | o0VarE.r(context);
                Object objQ6 = o0VarE.q();
                if (zB || objQ6 == c2565a) {
                    b82.l0 l0Var = new b82.l0(cVar2, fVarA, bVar, context, p1Var3, p1Var2, p1Var4);
                    cVar2 = cVar2;
                    bVar = bVar;
                    o0VarE.K(l0Var);
                    objQ6 = l0Var;
                }
                e2.c.b(null, null, null, null, null, null, false, null, (l) objQ6, o0VarE, 0, 511);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1034531099);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(bVar, cVar2, i14, 7);
        }
    }

    public final oo.b v6() {
        return (oo.b) this.f29204e.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CAN_TRIATHLON_ACTIVITY_LINKED", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
