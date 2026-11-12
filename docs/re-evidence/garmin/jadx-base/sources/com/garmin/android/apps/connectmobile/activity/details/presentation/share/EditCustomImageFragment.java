package com.garmin.android.apps.connectmobile.activity.details.presentation.share;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import fs.g;
import java.util.ArrayList;
import java.util.List;
import jr.h;
import jr.x;
import kotlin.w3;
import lc.t0;
import nr.p0;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.y;
import p3.c2;
import p3.x3;
import qr.t;
import r53.b2;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/share/EditCustomImageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/net/Uri;", "backgroundUri", "", "Lnr/p0;", "customTemplates", "", "selectedTemplatePage", "Lfs/f;", "currentSelectedStickers", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditCustomImageFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f30133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f30134c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$onViewCreated$1$1$1$1", f = "EditCustomImageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f30136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Integer> f30137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x3<? extends List<p0>> x3Var, x3<Integer> x3Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f30136b = x3Var;
            this.f30137c = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditCustomImageFragment.this.new a(this.f30136b, this.f30137c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            EditCustomImageFragment editCustomImageFragment = EditCustomImageFragment.this;
            if (editCustomImageFragment.f30134c.getF182175a() == 0) {
                editCustomImageFragment.f30134c.setValue(h0.e0(this.f30137c.getF182175a().intValue(), this.f30136b.getF182175a()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$onViewCreated$1$1$2$1", f = "EditCustomImageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<fs.e> f30139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<List<fs.f>> f30140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<fs.e> list, x3<? extends List<fs.f>> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f30139b = list;
            this.f30140c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditCustomImageFragment.this.new b(this.f30139b, this.f30140c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            EditCustomImageFragment editCustomImageFragment = EditCustomImageFragment.this;
            T f182175a = editCustomImageFragment.f30133b.getF182175a();
            n4.d.f123545e.getClass();
            if (!s.g(f182175a, n4.d.f123546f) && this.f30140c.getF182175a().isEmpty()) {
                for (fs.e eVar : this.f30139b) {
                    t tVarU6 = editCustomImageFragment.u6();
                    fs.f fVarA = eVar.a((n4.d) editCustomImageFragment.f30133b.getF182175a(), false);
                    p2 p2Var = tVarU6.f146518f2;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, h0.D0((List) value, fVarA)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activity/details/presentation/share/EditCustomImageFragment$c", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f30142b;

        public c(View view2) {
            this.f30142b = view2;
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.activity_custom_edit_menu, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            EditCustomImageFragment editCustomImageFragment = EditCustomImageFragment.this;
            Context contextRequireContext = editCustomImageFragment.requireContext();
            contextRequireContext.getClass();
            oc.b.B(menu, contextRequireContext);
            menu.findItem(R.id.menu_item_save_custom_template).setEnabled(((Boolean) editCustomImageFragment.u6().f146537l2.f150540a.getValue()).booleanValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            Object value;
            ArrayList arrayList;
            h hVar;
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_save_custom_template) {
                return false;
            }
            EditCustomImageFragment editCustomImageFragment = EditCustomImageFragment.this;
            p0 p0Var = (p0) editCustomImageFragment.f30134c.getF182175a();
            p0.a aVar = p0Var != null ? p0Var.f127286e : null;
            p0.a.c cVar = aVar instanceof p0.a.c ? (p0.a.c) aVar : null;
            boolean f100059a = (cVar == null || (hVar = cVar.f127293e) == null) ? true : hVar.getF100059a();
            Iterable<fs.f> iterable = (Iterable) editCustomImageFragment.u6().f146521g2.f150540a.getValue();
            ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
            for (fs.f fVar : iterable) {
                n4.d dVar = (n4.d) editCustomImageFragment.f30133b.getF182175a();
                fVar.getClass();
                dVar.getClass();
                fs.b bVar = fVar.f73388c;
                List<g> list = fVar.f73387b;
                int intValue = fVar.f73389d.getIntValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() >> 32));
                float f14 = dVar.f123547a;
                float f15 = dVar.f123549c - f14;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.a() & 4294967295L));
                float f16 = dVar.f123548b;
                arrayList2.add(new fs.e(bVar, intValue, list, (((long) Float.floatToRawIntBits((fIntBitsToFloat - f14) / f15)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 - f16) / (dVar.f123550d - f16))) & 4294967295L), fVar.f73391f.getFloatValue() / f15, fVar.f73392g.getFloatValue(), null));
            }
            t tVarU6 = editCustomImageFragment.u6();
            tVarU6.getClass();
            p2 p2Var = tVarU6.Y;
            List list2 = (List) p2Var.getValue();
            p2 p2Var2 = tVarU6.f146527i2;
            p0.a.c cVar2 = (p0.a.c) ((p0) list2.get(((Number) p2Var2.getValue()).intValue())).f127286e;
            p0.a.c cVarA = p0.a.c.a(cVar2, x.a(cVar2.f127293e, f100059a, arrayList2));
            do {
                value = p2Var.getValue();
                List list3 = (List) value;
                arrayList = new ArrayList(y.r(list3, 10));
                int i14 = 0;
                for (Object obj : list3) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    p0 p0VarA = (p0) obj;
                    if (i14 == ((Number) p2Var2.getValue()).intValue()) {
                        p0VarA = p0.a(p0VarA, cVarA);
                    }
                    arrayList.add(p0VarA);
                    i14 = i15;
                }
            } while (!p2Var.b(value, arrayList));
            editCustomImageFragment.u6().L5(false);
            editCustomImageFragment.u6().f146518f2.setValue(j0.f134944a);
            View view2 = this.f30142b;
            view2.getClass();
            t0.a(view2).n();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$onViewCreated$3", f = "EditCustomImageFragment.kt", l = {124}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30143a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$onViewCreated$3$1", f = "EditCustomImageFragment.kt", l = {125}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCustomImageFragment f30146b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.EditCustomImageFragment$onViewCreated$3$1$1", f = "EditCustomImageFragment.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0469a extends i implements p<Boolean, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ EditCustomImageFragment f30147a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0469a(EditCustomImageFragment editCustomImageFragment, t13.d<? super C0469a> dVar) {
                    super(2, dVar);
                    this.f30147a = editCustomImageFragment;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C0469a(this.f30147a, dVar);
                }

                @Override // e23.p
                public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C0469a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    m activity = this.f30147a.getActivity();
                    if (activity != null) {
                        activity.invalidateOptionsMenu();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditCustomImageFragment editCustomImageFragment, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30146b = editCustomImageFragment;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30146b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30145a;
                if (i14 == 0) {
                    r.b(obj);
                    EditCustomImageFragment editCustomImageFragment = this.f30146b;
                    b2 b2Var = editCustomImageFragment.u6().f146537l2;
                    C0469a c0469a = new C0469a(editCustomImageFragment, null);
                    this.f30145a = 1;
                    if (r53.s.k(b2Var, c0469a, this) == aVar) {
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

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditCustomImageFragment.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30143a;
            if (i14 == 0) {
                r.b(obj);
                EditCustomImageFragment editCustomImageFragment = EditCustomImageFragment.this;
                n0 viewLifecycleOwner = editCustomImageFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(editCustomImageFragment, null);
                this.f30143a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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
    public static final class e implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30148a;

        public e(Fragment fragment) {
            this.f30148a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f30148a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30153e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30149a = fragment;
            this.f30150b = qualifier;
            this.f30151c = aVar;
            this.f30152d = aVar2;
            this.f30153e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30151c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30149a;
            e23.a aVar = this.f30152d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f30150b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30153e, 4, null);
        }
    }

    public EditCustomImageFragment() {
        super(R.layout.composable_container);
        this.f30132a = o13.m.a(n.NONE, new f(this, null, new e(this), null, null));
        n4.d.f123545e.getClass();
        this.f30133b = p3.p0.n(n4.d.f123546f);
        this.f30134c = p3.p0.n(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(573118851, true, new dh1.a(this, 3)));
        g22.e.k(this, new c(view2), androidx.lifecycle.b0.b.RESUMED);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new d(null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final t u6() {
        return (t) this.f30132a.getValue();
    }
}
