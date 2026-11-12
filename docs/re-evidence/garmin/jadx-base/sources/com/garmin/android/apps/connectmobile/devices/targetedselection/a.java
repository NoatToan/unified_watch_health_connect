package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import ew1.h1;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/a;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends Fragment implements com.garmin.android.apps.connectmobile.devices.targetedselection.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fd0.d f34575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m52.k f34576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.b f34577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f34578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k30.h f34579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f34581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0582a f34582i;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.targetedselection.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/devices/targetedselection/a$a", "Lxf0/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0582a extends xf0.b {
        public C0582a() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            gVar.getClass();
            a aVar = a.this;
            n nVarZ6 = aVar.z6();
            fd0.d dVarW6 = aVar.w6();
            com.garmin.android.library.mapsdkadapter.i.b bVar = aVar.f34577d;
            boolean zU6 = aVar.getF34610k();
            boolean zY6 = aVar.getF34606j();
            int i14 = n.f34632h;
            nVarZ6.y4(dVarW6, bVar, zU6, zY6, null);
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            hVar.getClass();
            a aVar = a.this;
            n nVarZ6 = aVar.z6();
            fd0.d dVarW6 = aVar.w6();
            com.garmin.android.library.mapsdkadapter.i.b bVar = aVar.f34577d;
            boolean zU6 = aVar.getF34610k();
            boolean zY6 = aVar.getF34606j();
            int i14 = n.f34632h;
            nVarZ6.y4(dVarW6, bVar, zU6, zY6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f34584a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f34584a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34585a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar) {
            super(0);
            this.f34585a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f34585a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f34586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o13.l lVar) {
            super(0);
            this.f34586a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f34586a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f34588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, o13.l lVar) {
            super(0);
            this.f34587a = aVar;
            this.f34588b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34587a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f34588b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f34590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, o13.l lVar) {
            super(0);
            this.f34589a = fragment;
            this.f34590b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f34590b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f34589a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public a() {
        super(R.layout.gcm_recycler_view_with_empty_text);
        o13.l lVarA = o13.m.a(o13.n.NONE, new c(new b(this)));
        this.f34574a = new w1(s0.f105811a.b(n.class), new d(lVarA), new f(this, lVarA), new e(null, lVarA));
        this.f34578e = new f0(false, false, false, false, false, false, false, false, false, false, false, false, null, null, 16383, null);
        this.f34582i = new C0582a();
    }

    public void A6(Bundle bundle) {
        Object serializable;
        Object serializable2;
        Object serializable3;
        Parcelable parcelable;
        Parcelable parcelable2;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializable = bundle.getSerializable("arg.module.type", fd0.d.class);
        } else {
            Serializable serializable4 = bundle.getSerializable("arg.module.type");
            if (!(serializable4 instanceof fd0.d)) {
                serializable4 = null;
            }
            serializable = (fd0.d) serializable4;
        }
        serializable.getClass();
        this.f34575b = (fd0.d) serializable;
        if (i14 >= 33) {
            serializable2 = bundle.getSerializable("arg.sport.type", m52.k.class);
        } else {
            Object serializable5 = bundle.getSerializable("arg.sport.type");
            if (!(serializable5 instanceof m52.k)) {
                serializable5 = null;
            }
            serializable2 = (m52.k) serializable5;
        }
        this.f34576c = (m52.k) serializable2;
        if (i14 >= 33) {
            serializable3 = bundle.getSerializable("arg.course.coordinate.system", com.garmin.android.library.mapsdkadapter.i.b.class);
        } else {
            Object serializable6 = bundle.getSerializable("arg.course.coordinate.system");
            if (!(serializable6 instanceof com.garmin.android.library.mapsdkadapter.i.b)) {
                serializable6 = null;
            }
            serializable3 = (com.garmin.android.library.mapsdkadapter.i.b) serializable6;
        }
        this.f34577d = (com.garmin.android.library.mapsdkadapter.i.b) serializable3;
        if (i14 >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("arg.workout.feature.preferences", f0.class);
        } else {
            Parcelable parcelable3 = bundle.getParcelable("arg.workout.feature.preferences");
            if (!(parcelable3 instanceof f0)) {
                parcelable3 = null;
            }
            parcelable = (f0) parcelable3;
        }
        f0 f0Var = (f0) parcelable;
        if (f0Var == null) {
            f0Var = new f0(false, false, false, false, false, false, false, false, false, false, false, false, null, null, 16383, null);
        }
        this.f34578e = f0Var;
        if (i14 >= 33) {
            parcelable2 = (Parcelable) bundle.getParcelable("arg.course.feature.preferences", k30.h.class);
        } else {
            Parcelable parcelable4 = bundle.getParcelable("arg.course.feature.preferences");
            if (!(parcelable4 instanceof k30.h)) {
                parcelable4 = null;
            }
            parcelable2 = (k30.h) parcelable4;
        }
        k30.h hVar = (k30.h) parcelable2;
        if (hVar == null) {
            hVar = new k30.h(false, false, 3, null);
        }
        this.f34579f = hVar;
    }

    public abstract void C6();

    public final void E6(String str) {
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            new androidx.appcompat.app.e.a(activity).setTitle(R.string.lbl_workout_limited_on_device).setMessage(str).setPositiveButton(R.string.common_send, new h1(this, 4)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            A6(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f34582i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f34582i);
        n nVarZ6 = z6();
        fd0.d dVarW6 = w6();
        m52.k kVar = this.f34576c;
        com.garmin.android.library.mapsdkadapter.i.b bVar = this.f34577d;
        f0 f0Var = this.f34578e;
        k30.h hVar = this.f34579f;
        boolean zU6 = getF34610k();
        boolean zY6 = getF34606j();
        f0Var.getClass();
        ge1.b.T(v1.a(nVarZ6), null, null, new o(nVarZ6, dVarW6, bVar, zU6, zY6, kVar, f0Var, hVar, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        C6();
        View viewFindViewById = view2.findViewById(R.id.empty_text);
        viewFindViewById.getClass();
        this.f34580g = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.devices_recycler_view);
        viewFindViewById2.getClass();
        this.f34581h = (RecyclerView) viewFindViewById2;
        n nVarZ6 = z6();
        fd0.d dVarW6 = w6();
        com.garmin.android.library.mapsdkadapter.i.b bVar = this.f34577d;
        boolean zU6 = getF34610k();
        boolean zY6 = getF34606j();
        int i14 = n.f34632h;
        nVarZ6.y4(dVarW6, bVar, zU6, zY6, null);
    }

    /* JADX INFO: renamed from: u6 */
    public boolean getF34610k() {
        return false;
    }

    public final TextView v6() {
        TextView textView = this.f34580g;
        if (textView != null) {
            return textView;
        }
        s.m("emptyMessageTextView");
        throw null;
    }

    public final fd0.d w6() {
        fd0.d dVar = this.f34575b;
        if (dVar != null) {
            return dVar;
        }
        s.m("moduleType");
        throw null;
    }

    /* JADX INFO: renamed from: y6 */
    public boolean getF34606j() {
        return false;
    }

    public final n z6() {
        return (n) this.f34574a.getValue();
    }
}
