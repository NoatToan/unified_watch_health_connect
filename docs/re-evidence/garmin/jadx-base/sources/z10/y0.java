package z10;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import org.apache.commons.lang3.ArrayUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/y0;", "Lcom/garmin/android/apps/connectmobile/consent/a;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class y0 extends com.garmin.android.apps.connectmobile.consent.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f201310q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q92.x f201311o = Aa()[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.w1 f201312p = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(e1.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f201313a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f201313a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f201313a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f201313a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f201314a;

        public b(b.g gVar) {
            this.f201314a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f201314a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f201315a;

        public c(b.g gVar) {
            this.f201315a = gVar;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f201315a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f201316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f201317b;

        public d(e23.a aVar, b.g gVar) {
            this.f201316a = aVar;
            this.f201317b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f201316a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f201317b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public abstract q92.x[] Aa();

    public abstract void Ba();

    @Override // com.garmin.android.apps.connectmobile.consent.a
    /* JADX INFO: renamed from: ma, reason: from getter */
    public final q92.x getF201311o() {
        return this.f201311o;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ArrayUtils.contains(d1.f200952b, this.f201311o)) {
            Ba();
        } else {
            za();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public void sa() {
        hideProgressOverlay();
        displayFailedMessage();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void ta() {
        q92.x[] xVarArrAa = Aa();
        int iIndexOf = ArrayUtils.indexOf(xVarArrAa, this.f201311o);
        q92.x xVar = iIndexOf < xVarArrAa.length + (-1) ? xVarArrAa[iIndexOf + 1] : null;
        if (xVar != null) {
            this.f201311o = xVar;
            za();
        } else {
            hideProgressOverlay();
            Ba();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public void ua() {
        finish();
    }

    public final void za() {
        androidx.lifecycle.y0 y0Var;
        if (d1.a(this.f201311o)) {
            d1.o(this, new w0(this, 0));
            return;
        }
        showProgressOverlay();
        hl.a aVar = this.f32249g;
        boolean zG = p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b);
        androidx.lifecycle.w1 w1Var = this.f201312p;
        if (zG) {
            e1 e1Var = (e1) w1Var.getValue();
            q92.x xVar = this.f201311o;
            xVar.getClass();
            y0Var = new androidx.lifecycle.y0();
            ge1.b.T(androidx.lifecycle.v1.a(e1Var), null, null, new g1(y0Var, xVar, null), 3);
        } else {
            if (!(aVar instanceof hl.a.b)) {
                lc.u0.r();
                return;
            }
            e1 e1Var2 = (e1) w1Var.getValue();
            q92.x xVar2 = this.f201311o;
            hl.a aVar2 = this.f32249g;
            aVar2.getClass();
            long j8 = ((hl.a.b) aVar2).f84252b;
            xVar2.getClass();
            androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
            ge1.b.T(androidx.lifecycle.v1.a(e1Var2), null, null, new f1(y0Var2, xVar2, j8, null), 3);
            y0Var = y0Var2;
        }
        y0Var.f(this, new a(new x0(this, 0)));
    }
}
