package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.s;
import androidx.camera.lifecycle.b;
import androidx.lifecycle.LifecycleOwner;
import defpackage.adp;
import defpackage.bh3;
import defpackage.bk8;
import defpackage.cb3;
import defpackage.fl1;
import defpackage.g6i;
import defpackage.gwq;
import defpackage.ji3;
import defpackage.jua;
import defpackage.ki3;
import defpackage.kua;
import defpackage.lhe;
import defpackage.li3;
import defpackage.oua;
import defpackage.ue3;
import defpackage.vi4;
import defpackage.xh3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class b {
    public static final b h = new b();

    @GuardedBy("mLock")
    public lhe<ji3> c;
    public ji3 f;
    public Context g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1835a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public ki3.b f1836b = null;

    @GuardedBy("mLock")
    public lhe<Void> d = oua.h(null);
    public final LifecycleCameraRepository e = new LifecycleCameraRepository();

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ji3 f1838b;

        public a(cb3.a aVar, ji3 ji3Var) {
            this.f1837a = aVar;
            this.f1838b = ji3Var;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            this.f1837a.c(this.f1838b);
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            this.f1837a.f(th);
        }
    }

    public static lhe<b> f(final Context context) {
        g6i.g(context);
        return oua.o(h.g(context), new Function() { // from class: gai
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return b.h(context, (ji3) obj);
            }
        }, li3.a());
    }

    public static /* synthetic */ b h(Context context, ji3 ji3Var) {
        b bVar = h;
        bVar.k(ji3Var);
        bVar.l(vi4.a(context));
        return bVar;
    }

    public static /* synthetic */ lhe i(ji3 ji3Var, Void r1) throws Exception {
        return ji3Var.h();
    }

    public ue3 d(LifecycleOwner lifecycleOwner, xh3 xh3Var, gwq gwqVar, s... sVarArr) {
        c cVar;
        c cVarB;
        adp.a();
        xh3.a aVarC = xh3.a.c(xh3Var);
        int length = sVarArr.length;
        int i = 0;
        while (true) {
            cVar = null;
            if (i >= length) {
                break;
            }
            xh3 xh3VarX = sVarArr[i].g().x(null);
            if (xh3VarX != null) {
                Iterator<bh3> it = xh3VarX.c().iterator();
                while (it.hasNext()) {
                    aVarC.a(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> linkedHashSetA = aVarC.b().a(this.f.e().a());
        if (linkedHashSetA.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        LifecycleCamera lifecycleCameraC = this.e.c(lifecycleOwner, CameraUseCaseAdapter.u(linkedHashSetA));
        Collection<LifecycleCamera> collectionE = this.e.e();
        for (s sVar : sVarArr) {
            for (LifecycleCamera lifecycleCamera : collectionE) {
                if (lifecycleCamera.m(sVar) && lifecycleCamera != lifecycleCameraC) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", sVar));
                }
            }
        }
        if (lifecycleCameraC == null) {
            lifecycleCameraC = this.e.b(lifecycleOwner, new CameraUseCaseAdapter(linkedHashSetA, this.f.d(), this.f.g()));
        }
        for (bh3 bh3Var : xh3Var.c()) {
            if (bh3Var.a() != bh3.f4201a && (cVarB = bk8.a(bh3Var.a()).b(lifecycleCameraC.getCameraInfo(), this.g)) != null) {
                if (cVar != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                cVar = cVarB;
            }
        }
        lifecycleCameraC.d(cVar);
        if (sVarArr.length == 0) {
            return lifecycleCameraC;
        }
        this.e.a(lifecycleCameraC, gwqVar, Arrays.asList(sVarArr));
        return lifecycleCameraC;
    }

    public ue3 e(LifecycleOwner lifecycleOwner, xh3 xh3Var, s... sVarArr) {
        return d(lifecycleOwner, xh3Var, null, sVarArr);
    }

    public final lhe<ji3> g(Context context) {
        synchronized (this.f1835a) {
            try {
                lhe<ji3> lheVar = this.c;
                if (lheVar != null) {
                    return lheVar;
                }
                final ji3 ji3Var = new ji3(context, this.f1836b);
                lhe<ji3> lheVarA = cb3.a(new cb3.c() { // from class: hai
                    @Override // cb3.c
                    public final Object a(cb3.a aVar) {
                        return this.f19864a.j(ji3Var, aVar);
                    }
                });
                this.c = lheVarA;
                return lheVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object j(final ji3 ji3Var, cb3.a aVar) throws Exception {
        synchronized (this.f1835a) {
            oua.b(kua.a(this.d).e(new fl1() { // from class: iai
                @Override // defpackage.fl1
                public final lhe apply(Object obj) {
                    return b.i(ji3Var, (Void) obj);
                }
            }, li3.a()), new a(aVar, ji3Var), li3.a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    public final void k(ji3 ji3Var) {
        this.f = ji3Var;
    }

    public final void l(Context context) {
        this.g = context;
    }

    public void m() {
        adp.a();
        this.e.k();
    }
}
