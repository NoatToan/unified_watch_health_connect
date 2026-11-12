package com.garmin.android.apps.connectmobile.activities.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.p;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import mv0.g;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u;
import p3.q1;
import po.x;
import po.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/map/a;", "Lqw0/a;", "Lcom/garmin/android/library/mapsdkadapter/i$j;", "<init>", "()V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends qw0.a implements i.j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0451a f29229m = new C0451a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f29230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f29231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f29233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f29234l = m.a(n.NONE, new e(this, null, new d(this), null, null));

    public interface b {
        void n8(x xVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29235a;

        public c(l lVar) {
            lVar.getClass();
            this.f29235a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29235a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29235a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29236a;

        public d(Fragment fragment) {
            this.f29236a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f29236a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f29241e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f29237a = fragment;
            this.f29238b = qualifier;
            this.f29239c = aVar;
            this.f29240d = aVar2;
            this.f29241e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, mv0.g] */
        @Override // e23.a
        public final g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f29239c.invoke()).getF189591b();
            Fragment fragment = this.f29237a;
            e23.a aVar = this.f29240d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(g.class), f189591b, null, defaultViewModelCreationExtras, this.f29238b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f29241e, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    @SuppressLint({"MissingPermission"})
    public final void A6() {
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        if (j22.b.c(contextRequireContext) && this.f29232j) {
            ((g) this.f29234l.getValue()).x4("LocationPickerMapFragment").f(getViewLifecycleOwner(), new c(new q1(this, 22)));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public final void X(f fVar) {
        x xVar;
        x xVar2 = this.f29230h;
        if (xVar2 != null) {
            y yVar = xVar2.f138993b;
            yVar.getClass();
            xVar = new x(fVar, yVar);
        } else {
            xVar = null;
        }
        this.f29230h = xVar;
        b bVar = this.f29233k;
        if (bVar != null) {
            bVar.n8(xVar);
        }
        z6();
    }

    @Override // qw0.a, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(i iVar) {
        w6();
        iVar.O(this);
        ArrayList arrayListC = u.C(new x[]{this.f29230h, this.f29231i});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListC) {
            if (((x) obj).b()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            v6(((x) it.next()).f138992a, 15);
        }
        z6();
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        if (j22.b.c(contextRequireContext)) {
            iVar.setMyLocationEnabled(true);
            A6();
        } else if (this.f29232j) {
            j22.b.z(this, 1000, j22.a.f96719h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof b) {
            this.f29233k = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        x xVar;
        x xVar2;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        x xVar3 = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) arguments.getParcelable("EXTRA_LOCATION_EDITABLE", x.class);
            } else {
                Parcelable parcelable3 = arguments.getParcelable("EXTRA_LOCATION_EDITABLE");
                if (!(parcelable3 instanceof x)) {
                    parcelable3 = null;
                }
                parcelable2 = (x) parcelable3;
            }
            xVar = (x) parcelable2;
        } else {
            xVar = null;
        }
        this.f29230h = xVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments2.getParcelable("EXTRA_LOCATION_READONLY", x.class);
            } else {
                Parcelable parcelable4 = arguments2.getParcelable("EXTRA_LOCATION_READONLY");
                parcelable = (x) (parcelable4 instanceof x ? parcelable4 : null);
            }
            xVar3 = (x) parcelable;
        }
        this.f29231i = xVar3;
        x xVar4 = this.f29230h;
        this.f29232j = (xVar4 == null || xVar4.b() || (xVar2 = this.f29231i) == null || xVar2.b()) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (i14 == 1000) {
            j22.b.f96736a.getClass();
            if (j22.b.E(iArr)) {
                qe2.h hVar = this.f148294e;
                if (hVar != null) {
                    hVar.setMyLocationEnabled(true);
                }
                A6();
            }
        }
    }

    public final void z6() {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.clear();
        }
        ArrayList arrayListC = u.C(new x[]{this.f29230h, this.f29231i});
        ArrayList<x> arrayList = new ArrayList();
        for (Object obj : arrayListC) {
            if (((x) obj).b()) {
                arrayList.add(obj);
            }
        }
        for (x xVar : arrayList) {
            p pVar = new p();
            pVar.d(xVar.f138992a);
            pVar.b(xVar.f138993b.f138997a);
            qe2.h hVar2 = this.f148294e;
            if (hVar2 != null) {
                hVar2.x(pVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.map.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/map/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INITIAL_ZOOM_LEVEL", "I", "REQUEST_CODE_ACCESS_COURSE_LOCATION", "EXTRA_LOCATION_EDITABLE", "EXTRA_LOCATION_READONLY", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0451a {
        public /* synthetic */ C0451a(j jVar) {
            this();
        }

        private C0451a() {
        }
    }
}
