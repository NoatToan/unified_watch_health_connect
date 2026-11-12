package v12;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.o3;
import c53.c0;
import c53.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.d3;
import java.io.IOException;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.g0;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv12/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f174703f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f174704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u12.o f174705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f174706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f174707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o13.t f174708e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v12/h$b", "Landroidx/core/view/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.profile_past_activities_privacy, menu);
            Bundle bundleRequireArguments = h.this.requireArguments();
            Parcelable parcelable = null;
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("activity") : null;
                parcelable = (ip.a) (parcelable2 instanceof ip.a ? parcelable2 : null);
            } else if (bundleRequireArguments != null) {
                parcelable = (Parcelable) bundleRequireArguments.getParcelable("activity", ip.a.class);
            }
            menu.findItem(R.id.menu_item_update).setVisible(parcelable == null);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            h hVar = h.this;
            if (itemId != R.id.menu_item_update) {
                if (menuItem.getItemId() != 16908332) {
                    return false;
                }
                a aVar = h.f174703f;
                hVar.u6().z4(w.a.f174819a);
                return false;
            }
            a aVar2 = h.f174703f;
            if (((k) ((p2) hVar.u6().y4()).getValue()).f174751e != null) {
                hVar.u6().z4(w.e.f174823a);
                return true;
            }
            Context contextRequireContext = hVar.requireContext();
            contextRequireContext.getClass();
            v12.b.b(contextRequireContext).show();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionFragment$onViewCreated$3", f = "PrivacySelectionFragment.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174710a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hl.a f174712c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionFragment$onViewCreated$3$1", f = "PrivacySelectionFragment.kt", l = {108}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f174713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f174714b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ hl.a f174715c;

            /* JADX INFO: renamed from: v12.h$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3249a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h f174716a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ hl.a f174717b;

                /* JADX INFO: renamed from: v12.h$c$a$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C3250a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f174718a;

                    static {
                        int[] iArr = new int[v12.a.values().length];
                        try {
                            iArr[v12.a.CLOSE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[v12.a.BACK.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f174718a = iArr;
                    }
                }

                public C3249a(h hVar, hl.a aVar) {
                    this.f174716a = hVar;
                    this.f174717b = aVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) throws IOException {
                    int i14;
                    Parcelable parcelable;
                    String string;
                    k kVar = (k) obj;
                    v12.a aVar = kVar.f174747a;
                    int i15 = kVar.f174749c;
                    int i16 = C3250a.f174718a[aVar.ordinal()];
                    int i17 = 1;
                    if (i16 == 1) {
                        i14 = 3;
                    } else {
                        if (i16 != 2) {
                            u0.r();
                            return null;
                        }
                        i14 = 2;
                    }
                    h hVar = this.f174716a;
                    Bundle bundleRequireArguments = hVar.requireArguments();
                    u12.o oVar = hVar.f174705b;
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("activity", ip.a.class) : null;
                    } else {
                        Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("activity") : null;
                        if (!(parcelable2 instanceof ip.a)) {
                            parcelable2 = null;
                        }
                        parcelable = (ip.a) parcelable2;
                    }
                    ip.a aVar2 = (ip.a) parcelable;
                    x0 x0Var = aVar2 != null ? aVar2.f94639a : null;
                    if (x0Var != null) {
                        String strB = dh.b.B(hVar, x0Var.f4360c);
                        a7.e eVarRequireActivity = hVar.requireActivity();
                        d3 d3Var = eVarRequireActivity instanceof d3 ? (d3) eVarRequireActivity : null;
                        if (d3Var != null) {
                            d3Var.updateActionBar(strB, i14);
                        }
                        String string2 = hVar.getString(i15, strB);
                        string2.getClass();
                        oVar.f167805a = string2;
                        oVar.notifyItemInserted(0);
                        List<x0> listI = z0.i(x0Var);
                        if (!listI.isEmpty()) {
                            c53.j jVarV = p13.u.v(new c53.j[]{new c53.s(strB), new z(c0.o(new g0(listI), new v12.f(hVar, i17)))});
                            jVarV.getClass();
                            String strM = c0.m(c53.q.c(jVarV, new o3(15)), ", ");
                            hl.a.c cVar = hl.a.c.f84256b;
                            hl.a aVar3 = this.f174717b;
                            if (p005kotlin.jvm.internal.s.g(aVar3, cVar)) {
                                string = hVar.getString(R.string.privacy_update_past_activity_subtypes_description, strM);
                            } else {
                                if (!(aVar3 instanceof hl.a.b)) {
                                    u0.r();
                                    return null;
                                }
                                string = "_This will update the following activity types: %s.";
                            }
                            string.getClass();
                            oVar.f167807c = string;
                            oVar.notifyDataSetChanged();
                        }
                    } else {
                        a7.e eVarRequireActivity2 = hVar.requireActivity();
                        d3 d3Var2 = eVarRequireActivity2 instanceof d3 ? (d3) eVarRequireActivity2 : null;
                        if (d3Var2 != null) {
                            d3Var2.updateActionBar(hVar.getString(kVar.f174748b), i14);
                        }
                        String string3 = hVar.getString(i15);
                        string3.getClass();
                        oVar.f167805a = string3;
                        oVar.notifyItemInserted(0);
                    }
                    oVar.r(kVar.f174750d);
                    hVar.requireActivity().invalidateOptionsMenu();
                    PrivacyType privacyType = oVar.f167808d;
                    PrivacyType privacyType2 = kVar.f174751e;
                    if (privacyType != privacyType2) {
                        oVar.f167808d = privacyType2;
                        oVar.notifyDataSetChanged();
                        hVar.f174708e = o13.m.b(new ug2.h(16, hVar, kVar));
                    }
                    if (kVar.f174752f && !((androidx.appcompat.app.e) hVar.f174708e.getValue()).isShowing()) {
                        ((androidx.appcompat.app.e) hVar.f174708e.getValue()).show();
                    } else if (((androidx.appcompat.app.e) hVar.f174708e.getValue()).isShowing()) {
                        ((androidx.appcompat.app.e) hVar.f174708e.getValue()).dismiss();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, hl.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f174714b = hVar;
                this.f174715c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f174714b, this.f174715c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f174713a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    a aVar2 = h.f174703f;
                    h hVar = this.f174714b;
                    o2<k> o2VarY4 = hVar.u6().y4();
                    C3249a c3249a = new C3249a(hVar, this.f174715c);
                    this.f174713a = 1;
                    if (((p2) o2VarY4).collect(c3249a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hl.a aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f174712c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new c(this.f174712c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174710a;
            if (i14 == 0) {
                o13.r.b(obj);
                h hVar = h.this;
                n0 viewLifecycleOwner = hVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(hVar, this.f174712c, null);
                this.f174710a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionFragment$onViewCreated$4", f = "PrivacySelectionFragment.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174719a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f174721c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionFragment$onViewCreated$4$1", f = "PrivacySelectionFragment.kt", l = {175}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f174722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f174723b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f174724c;

            /* JADX INFO: renamed from: v12.h$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3251a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h f174725a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f174726b;

                public C3251a(h hVar, e eVar) {
                    this.f174725a = hVar;
                    this.f174726b = eVar;
                }

                /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, o13.l] */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) throws Exception {
                    x xVar = (x) obj;
                    boolean z14 = xVar instanceof x.c;
                    h hVar = this.f174725a;
                    if (z14) {
                        g22.e.a(hVar, ((x.c) xVar).f174826a);
                    } else if (p005kotlin.jvm.internal.s.g(xVar, x.e.f174829a)) {
                        Context contextRequireContext = hVar.requireContext();
                        contextRequireContext.getClass();
                        v12.b.c(contextRequireContext, new v10.a(1), new v10.a(2)).show();
                    } else if (xVar instanceof x.d) {
                        x.d dVar2 = (x.d) xVar;
                        PrivacyType privacyType = dVar2.f174828b;
                        if (privacyType != null) {
                            androidx.fragment.app.v parentFragmentManager = hVar.getParentFragmentManager();
                            j jVar = j.f174746a;
                            x0 x0Var = dVar2.f174827a;
                            jVar.getClass();
                            x0Var.getClass();
                            parentFragmentManager.m0(h7.c.a(new o13.p("userprofile.privacy.past.selected.option", new ip.a(x0Var, privacyType))), "userprofile.privacy.past.privacy");
                        }
                        hVar.getParentFragmentManager().Z();
                    } else if (xVar instanceof x.a) {
                        hVar.getParentFragmentManager().Z();
                    } else {
                        if (!(xVar instanceof x.b)) {
                            u0.r();
                            return null;
                        }
                        this.f174726b.e();
                        String string = hVar.getString(R.string.privacy_change_all_activity_types_confirmation, hVar.getString(((x.b) xVar).f174825a.getF28797a()));
                        string.getClass();
                        ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) hVar.f174707d.getValue()).y4(string);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f174723b = hVar;
                this.f174724c = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f174723b, this.f174724c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to v12.h$d$a for r6v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r6.f174722a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r7)
                    return r2
                L10:
                    o13.r.b(r7)
                    goto L37
                L14:
                    o13.r.b(r7)
                    v12.h$a r7 = v12.h.f174703f
                    v12.h r7 = r6.f174723b
                    v12.c r1 = r7.u6()
                    r53.d2 r1 = r1.x4()
                    v12.h$d$a$a r4 = new v12.h$d$a$a
                    v12.h$e r5 = r6.f174724c
                    r4.<init>(r7, r5)
                    r6.f174722a = r3
                    r53.a2 r1 = (r53.a2) r1
                    r53.d2<T> r7 = r1.f150526a
                    java.lang.Object r7 = r7.collect(r4, r6)
                    if (r7 != r0) goto L37
                    return r0
                L37:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: v12.h.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e eVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f174721c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new d(this.f174721c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174719a;
            if (i14 == 0) {
                o13.r.b(obj);
                h hVar = h.this;
                n0 viewLifecycleOwner = hVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(hVar, this.f174721c, null);
                this.f174719a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v12/h$e", "Lb/s;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends b.s {
        public e() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = h.f174703f;
            h.this.u6().z4(w.a.f174819a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174728a;

        public f(Fragment fragment) {
            this.f174728a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f174728a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f174730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f174731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f174732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f174733e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f174729a = fragment;
            this.f174730b = qualifier;
            this.f174731c = aVar;
            this.f174732d = aVar2;
            this.f174733e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f174731c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f174729a;
            e23.a aVar = this.f174732d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b.class), f189591b, null, defaultViewModelCreationExtras, this.f174730b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f174733e, 4, null);
        }
    }

    /* JADX INFO: renamed from: v12.h$h, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3252h implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174734a;

        public C3252h(Fragment fragment) {
            this.f174734a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f174734a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<v12.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f174735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f174736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f174737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f174738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f174739e;

        public i(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f174735a = fragment;
            this.f174736b = qualifier;
            this.f174737c = aVar;
            this.f174738d = aVar2;
            this.f174739e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, v12.c] */
        @Override // e23.a
        public final v12.c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f174737c.invoke()).getF189591b();
            Fragment fragment = this.f174735a;
            e23.a aVar = this.f174738d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(v12.c.class), f189591b, null, defaultViewModelCreationExtras, this.f174736b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f174739e, 4, null);
        }
    }

    public h() {
        super(R.layout.gcm_fragment_recycler_view);
        this.f174705b = new u12.o();
        v12.g gVar = new v12.g(this, 0);
        C3252h c3252h = new C3252h(this);
        o13.n nVar = o13.n.NONE;
        this.f174706c = o13.m.a(nVar, new i(this, null, c3252h, null, gVar));
        this.f174707d = o13.m.a(nVar, new g(this, null, new f(this), null, null));
        this.f174708e = o13.m.b(new v12.g(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), androidx.lifecycle.b0.b.RESUMED);
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class) : null;
        } else {
            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
            if (!(parcelable2 instanceof hl.a)) {
                parcelable2 = null;
            }
            parcelable = (hl.a) parcelable2;
        }
        hl.a aVar = (hl.a) parcelable;
        if (aVar == null) {
            aVar = hl.a.c.f84256b;
        }
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f174704a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f174704a;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        u12.o oVar = this.f174705b;
        recyclerView2.setAdapter(oVar);
        oVar.r(hl.b.a(aVar));
        oVar.f167809e = new v12.f(this, 0);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new c(aVar, null), 3);
        e eVar = new e();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner2), null, null, new d(eVar, null), 3);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        onBackPressedDispatcher.b(eVar, viewLifecycleOwner3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final v12.c u6() {
        return (v12.c) this.f174706c.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv12/h$a;", "", "<init>", "()V", "", "KEY_ACTIVITY", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
