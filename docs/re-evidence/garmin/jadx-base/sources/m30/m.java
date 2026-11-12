package m30;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.maps.model.LatLng;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm30/m;", "Lj40/c;", "", "<init>", "()V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m extends j40.c {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f116358h1 = 0;
    public boolean W0;
    public boolean X0;
    public b Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public o.c.a f116359a1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f116363e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f116364f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f116365g1;
    public final Object Y0 = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public float f116360b1 = -1.0f;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public float f116361c1 = -1.0f;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f116362d1 = -1.0f;

    public interface b {
        void X(com.garmin.android.library.mapsdkadapter.f fVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f116366a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f116366a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f116366a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f116366a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f116367a;

        public d(Fragment fragment) {
            this.f116367a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f116367a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<mv0.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f116368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f116369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f116370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f116371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f116372e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f116368a = fragment;
            this.f116369b = qualifier;
            this.f116370c = aVar;
            this.f116371d = aVar2;
            this.f116372e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, mv0.g] */
        @Override // e23.a
        public final mv0.g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 viewModelStore = ((ViewModelStoreOwner) this.f116370c.invoke()).getViewModelStore();
            Fragment fragment = this.f116368a;
            e23.a aVar = this.f116371d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(mv0.g.class), viewModelStore, null, defaultViewModelCreationExtras, this.f116369b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f116372e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public m() {
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        com.garmin.android.library.mapsdkadapter.e eVar = com.garmin.android.library.mapsdkadapter.e.f50272d;
        this.f116363e1 = eVar;
        this.f116364f1 = eVar;
        this.f116365g1 = eVar;
    }

    public final void b8(com.garmin.android.library.mapsdkadapter.f fVar) {
        qe2.h hVar = this.f148294e;
        if (hVar == null || fVar == null) {
            return;
        }
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.d(fVar);
        pVar.a(0.5f, 0.9f);
        pVar.b(2131232000);
        hVar.x(pVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @SuppressLint({"MissingPermission"})
    public final void c8() {
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        if (j22.b.c(contextRequireContext)) {
            ((mv0.g) this.Y0.getValue()).x4("CreateCourseMapFragment").f(getViewLifecycleOwner(), new c(new l(this, 0)));
        } else {
            u6(this.f97019x, this.f148290a);
        }
    }

    @Override // j40.c
    public void d7(com.garmin.android.library.mapsdkadapter.f fVar) {
        b bVar;
        if (this.f148294e == null || (bVar = this.Z0) == null) {
            return;
        }
        bVar.X(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e8(Context context) {
        try {
            this.Z0 = (b) context;
        } catch (ClassCastException unused) {
            p6.b.m(context, b.class.getSimpleName());
        }
    }

    public final void f8(LatLng latLng) {
        com.garmin.android.library.mapsdkadapter.i.b bVarC = this.L0;
        if (bVarC == null) {
            qe2.h hVar = this.f148294e;
            com.garmin.android.library.mapsdkadapter.i.d f50264r = hVar != null ? hVar.f144584a.getF50264r() : null;
            if (f50264r == null) {
                f50264r = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            }
            bVarC = com.garmin.android.library.mapsdkadapter.m.c(latLng, f50264r);
        }
        v6(new com.garmin.android.library.mapsdkadapter.f(latLng, bVarC), 17);
    }

    @Override // j40.c, qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        com.garmin.android.apps.connectmobile.courses.model.c cVar;
        super.h1(iVar);
        iVar.D(false);
        X6().setEditing(true);
        com.garmin.android.apps.connectmobile.courses.model.c.a aVar = com.garmin.android.apps.connectmobile.courses.model.c.f32831c;
        u20.g gVar = this.f97020y;
        com.garmin.android.apps.connectmobile.courses.model.i f104023a = gVar != null ? gVar.getF104023a() : null;
        aVar.getClass();
        int i14 = f104023a == null ? -1 : com.garmin.android.apps.connectmobile.courses.model.c.a.C0540a.f32839a[f104023a.ordinal()];
        if (i14 == 1) {
            cVar = com.garmin.android.apps.connectmobile.courses.model.c.PAVED;
        } else if (i14 != 2) {
            cVar = i14 != 3 ? com.garmin.android.apps.connectmobile.courses.model.c.PAVED : com.garmin.android.apps.connectmobile.courses.model.c.UNPAVED;
        } else {
            cVar = com.garmin.android.apps.connectmobile.courses.model.c.MIXED;
        }
        this.T = cVar;
        iVar.K(new lp2.h(this, 22));
    }

    @Override // j40.c, androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        ie2.k uiSettings;
        super.onActivityCreated(bundle);
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96719h};
        bVar.getClass();
        if (j22.b.k(aVarArr)) {
            qe2.h hVar = this.f148294e;
            if (hVar != null) {
                hVar.setMyLocationEnabled(true);
            }
            qe2.h hVar2 = this.f148294e;
            if (hVar2 == null || (uiSettings = hVar2.f144584a.getUiSettings()) == null) {
                return;
            }
            uiSettings.a();
        }
    }

    @Override // j40.c, qw0.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        e8(context);
    }

    @Override // j40.c, qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public final void onCameraIdle() {
        a8();
        C7();
        s30.c cVar = this.R0;
        if (cVar != null) {
            cVar.c();
        }
        qe2.h hVar = this.f148294e;
        if (hVar == null) {
            return;
        }
        com.garmin.android.library.mapsdkadapter.i iVar = hVar.f144584a;
        com.garmin.android.library.mapsdkadapter.e a14 = iVar.getA();
        float f50270z = iVar.getF50270z();
        u20.g gVar = this.f97020y;
        boolean z14 = false;
        boolean z15 = gVar != null && gVar.getF104023a().c() && f50270z >= 10.0f;
        if (gVar == null || !z15) {
            z7();
        } else {
            com.garmin.android.apps.connectmobile.courses.model.c cVar2 = this.T;
            if (V6().f109903k && cVar2 != null && !com.garmin.android.library.mapsdkadapter.e.f(a14, this.f116365g1)) {
                this.f116365g1 = a14;
                gVar.K2(a14, cVar2, this.X, this.Y);
                float f14 = this.f116360b1;
                if (f14 >= 0.0f && f14 > f50270z) {
                    z7();
                }
            }
            this.f116360b1 = f50270z;
        }
        if (gVar != null && gVar.getF104023a().c() && f50270z >= 13.0f) {
            z14 = true;
        }
        if (gVar == null || !z14) {
            A7();
        } else {
            if (V6().f109900h && !com.garmin.android.library.mapsdkadapter.e.f(a14, this.f116364f1)) {
                this.f116364f1 = a14;
                gVar.p5(a14, V6().f109901i);
                float f15 = this.f116361c1;
                if (f15 >= 0.0f && f15 > f50270z) {
                    A7();
                }
            }
            this.f116361c1 = f50270z;
        }
        if (gVar == null || !V6().f109898f || f50270z < 15.0f) {
            B7();
            return;
        }
        if (!com.garmin.android.library.mapsdkadapter.e.f(a14, this.f116363e1)) {
            this.f116363e1 = a14;
            gVar.H1(a14, (int) f50270z, V6().f109899g);
            float f16 = this.f116362d1;
            if (f16 >= 0.0f && f16 > f50270z) {
                B7();
            }
        }
        this.f116362d1 = f50270z;
    }

    @Override // j40.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I = false;
        this.W0 = true;
        this.f148290a = (int) Math.max(this.f148290a, getResources().getDisplayMetrics().widthPixels * 0.2f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.fragment.app.m activity = getActivity();
        if (activity == null || activity.isFinishing() || this.X0) {
            return;
        }
        this.X0 = true;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.COURSES;
        aVar.getClass();
        i2.a.b(a2Var, "CreateCourseMapFragment", "onStart:location perm on, get current location and center map");
        c8();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lm30/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PADDING_PERCENT", "F", "MAIN_POLYLINE_Z_INDEX", "UNDERLAY_MAIN_POLYLINE_Z_INDEX", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
