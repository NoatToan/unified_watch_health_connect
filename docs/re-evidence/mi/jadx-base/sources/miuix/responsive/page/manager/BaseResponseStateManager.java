package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.onetrack.util.z;
import defpackage.be2;
import defpackage.fhl;
import defpackage.gbk;
import defpackage.h5j;
import defpackage.l8h;
import defpackage.nfe;
import defpackage.oxc;
import defpackage.p0d;
import defpackage.qsk;
import defpackage.r69;
import defpackage.rsk;
import defpackage.tsk;
import defpackage.usk;
import defpackage.yor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseResponseStateManager extends be2 {
    public oxc d;
    public ArrayMap<View, c> e;
    public ArrayMap<View, List<usk>> f;
    public ArrayMap<Integer, usk> g;
    public View h;
    public ArrayMap<Integer, p0d> i;

    public class ResponseLifecycleObserver implements nfe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseResponseStateManager f26867a;

        public ResponseLifecycleObserver(BaseResponseStateManager baseResponseStateManager) {
            this.f26867a = baseResponseStateManager;
        }

        @androidx.lifecycle.c(Lifecycle.Event.ON_CREATE)
        public void onCreate() {
        }

        @androidx.lifecycle.c(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            this.f26867a.l();
            this.f26867a = null;
        }
    }

    public class a extends r69 {
        public a() {
        }

        @Override // defpackage.r69, android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            BaseResponseStateManager.this.q(context, view, attributeSet, str);
            return super.onCreateView(view, str, context, attributeSet);
        }
    }

    public class b extends l8h {
        public b() {
        }

        @Override // defpackage.l8h, android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (((ViewGroup) view).getChildCount() == 1) {
                BaseResponseStateManager.this.g.get(Integer.valueOf(view.getId())).f(view);
            }
            List<usk> list = BaseResponseStateManager.this.f.get(view);
            if (list != null && !list.isEmpty()) {
                for (usk uskVar : list) {
                    if (uskVar.c() == view2.getId()) {
                        uskVar.f(view2);
                    }
                }
            }
            super.onChildViewAdded(view, view2);
        }
    }

    public class c implements oxc<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f26871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p0d f26872b;

        public c(View view) {
            this.f26871a = view;
        }

        public final void a(Configuration configuration, fhl fhlVar, boolean z) {
            List<usk> list = BaseResponseStateManager.this.f.get(this.f26871a);
            p0d p0dVar = this.f26872b;
            if (p0dVar == null || !p0dVar.a(configuration, fhlVar, z, list)) {
                int iA = BaseResponseStateManager.this.g.get(Integer.valueOf(this.f26871a.getId())).a();
                if (configuration == null) {
                    configuration = BaseResponseStateManager.this.c().getResources().getConfiguration();
                }
                int i = configuration.orientation;
                if (list == null || list.isEmpty()) {
                    return;
                }
                if (qsk.a(i, iA)) {
                    Iterator<usk> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().d(fhlVar);
                    }
                } else {
                    Iterator<usk> it2 = list.iterator();
                    while (it2.hasNext()) {
                        View viewB = it2.next().b();
                        if (viewB != null) {
                            viewB.setVisibility(0);
                        }
                    }
                }
            }
        }

        @Override // defpackage.oxc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View getResponsiveSubject() {
            return null;
        }

        @Override // defpackage.oxc
        public void onResponsiveLayout(Configuration configuration, fhl fhlVar, boolean z) {
            a(configuration, fhlVar, z);
        }
    }

    public BaseResponseStateManager(oxc oxcVar) {
        this.d = oxcVar;
        if (oxcVar.getResponsiveSubject() instanceof LifecycleOwner) {
            r((LifecycleOwner) this.d.getResponsiveSubject());
        }
        this.e = new ArrayMap<>();
        this.f = new ArrayMap<>();
        this.g = new ArrayMap<>();
        this.i = new ArrayMap<>();
        yor.a(LayoutInflater.from(c()), new a());
        this.f4118b = a();
    }

    public void i(Configuration configuration) {
        if (be2.e()) {
            this.f4118b = b(configuration);
            f(configuration);
            o(configuration, this.f4118b, !d(this.f4118b, this.f4117a));
        }
    }

    public void j(Configuration configuration) {
        if (be2.e()) {
            this.f4117a.l(this.f4118b);
            g(configuration);
        }
    }

    public final void k(View view) {
        this.e.remove(view);
        this.e.put(view, new c(view));
        if (this.g.containsKey(Integer.valueOf(view.getId()))) {
            return;
        }
        usk uskVar = new usk(view.getId());
        uskVar.e(3);
        this.g.put(Integer.valueOf(view.getId()), uskVar);
    }

    public void l() {
        p();
        this.d = null;
        this.e.clear();
        this.f.clear();
    }

    public rsk m() {
        return this.f4118b;
    }

    public final void n(ViewGroup viewGroup) {
        viewGroup.setOnHierarchyChangeListener(new b());
    }

    public void o(Configuration configuration, rsk rskVar, boolean z) {
        fhl fhlVar = new fhl();
        if (rskVar != null) {
            rskVar.q(fhlVar);
        }
        this.d.dispatchResponsiveLayout(configuration, fhlVar, z);
        Iterator<View> it = this.e.keySet().iterator();
        while (it.hasNext()) {
            c cVar = this.e.get(it.next());
            if (cVar != null) {
                cVar.dispatchResponsiveLayout(configuration, fhlVar, z);
            }
        }
        for (Integer num : this.i.keySet()) {
            p0d p0dVar = this.i.get(num);
            if (p0dVar == null) {
                p0dVar = (p0d) this.h.findViewById(num.intValue());
                this.i.put(num, p0dVar);
            }
            p0dVar.onResponsiveLayout(configuration, fhlVar, z);
        }
    }

    public void p() {
        tsk.a().c(c());
    }

    public final void q(Context context, View view, AttributeSet attributeSet, String str) {
        int resourceId;
        if (this.h == null) {
            this.h = view;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h5j.l);
        if (str.split(z.f14007a).length > 1 && p0d.class.isAssignableFrom(gbk.a(str)) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(h5j.m, -1)) != -1) {
            this.i.put(Integer.valueOf(resourceId), null);
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(h5j.n, 0);
        if (integer != 0) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(h5j.m, -1);
            if (resourceId2 != -1) {
                usk uskVar = new usk(resourceId2);
                uskVar.e(integer);
                this.g.put(Integer.valueOf(resourceId2), uskVar);
            }
        } else {
            int integer2 = typedArrayObtainStyledAttributes.getInteger(h5j.o, 0);
            if (integer2 != 0) {
                List<usk> arrayList = this.f.get(view);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f.put(view, arrayList);
                    k(view);
                    n((ViewGroup) view);
                }
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(h5j.m, -1);
                if (resourceId3 != -1) {
                    arrayList.add(new usk(resourceId3, integer2));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new ResponseLifecycleObserver(this));
    }

    @VisibleForTesting
    public void s(int i) {
        fhl fhlVar = new fhl();
        m().q(fhlVar);
        fhlVar.c = i;
        this.d.dispatchResponsiveLayout(null, fhlVar, true);
        Iterator<View> it = this.e.keySet().iterator();
        while (it.hasNext()) {
            c cVar = this.e.get(it.next());
            if (cVar != null) {
                cVar.dispatchResponsiveLayout(null, fhlVar, true);
            }
        }
    }
}
