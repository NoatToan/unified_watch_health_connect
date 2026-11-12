package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class e extends l0 {

    public class a extends m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f11105a;

        public a(e eVar, Rect rect) {
            this.f11105a = rect;
        }

        @Override // androidx.transition.m.f
        public final Rect a() {
            return this.f11105a;
        }
    }

    public class b implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f11106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11107b;

        public b(e eVar, View view2, ArrayList arrayList) {
            this.f11106a = view2;
            this.f11107b = arrayList;
        }

        @Override // androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            mVar.removeListener(this);
            this.f11106a.setVisibility(8);
            ArrayList arrayList = this.f11107b;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((View) arrayList.get(i14)).setVisibility(0);
            }
        }

        @Override // androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
            mVar.removeListener(this);
            mVar.addListener(this);
        }
    }

    public class c extends m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f11108a;

        public c(e eVar, Rect rect) {
            this.f11108a = rect;
        }

        @Override // androidx.transition.m.f
        public final Rect a() {
            Rect rect = this.f11108a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean z(m mVar) {
        return (l0.k(mVar.getTargetIds()) && l0.k(mVar.getTargetNames()) && l0.k(mVar.getTargetTypes())) ? false : true;
    }

    public final void A(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i14 = 0;
        if (mVar instanceof s) {
            s sVar = (s) mVar;
            int size = sVar.f11154a.size();
            while (i14 < size) {
                A(sVar.b(i14), arrayList, arrayList2);
                i14++;
            }
            return;
        }
        if (z(mVar)) {
            return;
        }
        List<View> targets = mVar.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i14 < size2) {
                mVar.addTarget(arrayList2.get(i14));
                i14++;
            }
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                mVar.removeTarget(arrayList.get(size3));
            }
        }
    }

    @Override // androidx.fragment.app.l0
    public final void a(View view2, Object obj) {
        ((m) obj).addTarget(view2);
    }

    @Override // androidx.fragment.app.l0
    public final void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i14 = 0;
        if (mVar instanceof s) {
            s sVar = (s) mVar;
            int size = sVar.f11154a.size();
            while (i14 < size) {
                b(sVar.b(i14), arrayList);
                i14++;
            }
            return;
        }
        if (z(mVar) || !l0.k(mVar.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i14 < size2) {
            mVar.addTarget(arrayList.get(i14));
            i14++;
        }
    }

    @Override // androidx.fragment.app.l0
    public final void c(Object obj) {
        ((r) obj).c();
    }

    @Override // androidx.fragment.app.l0
    public final void d(Object obj, androidx.fragment.app.d dVar) {
        ((r) obj).e(dVar);
    }

    @Override // androidx.fragment.app.l0
    public final void e(ViewGroup viewGroup, Object obj) {
        p.a((m) obj, viewGroup);
    }

    @Override // androidx.fragment.app.l0
    public final boolean g(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.l0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((m) obj).mo6clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.l0
    public final Object i(ViewGroup viewGroup, Object obj) {
        m mVar = (m) obj;
        ArrayList<ViewGroup> arrayList = p.f11149c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!mVar.isSeekingSupported()) {
            vb.h.s("The Transition must support seeking.");
            return null;
        }
        arrayList.add(viewGroup);
        m mVarMo6clone = mVar.mo6clone();
        s sVar = new s();
        sVar.a(mVarMo6clone);
        p.c(sVar, viewGroup);
        viewGroup.setTag(R.id.transition_current_scene, null);
        p.a aVar = new p.a(sVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        viewGroup.invalidate();
        return sVar.createSeekController();
    }

    @Override // androidx.fragment.app.l0
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.l0
    public final boolean m(Object obj) {
        boolean zIsSeekingSupported = ((m) obj).isSeekingSupported();
        if (!zIsSeekingSupported) {
            Objects.toString(obj);
        }
        return zIsSeekingSupported;
    }

    @Override // androidx.fragment.app.l0
    public final Object n(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            s sVar = new s();
            sVar.a(mVar);
            sVar.a(mVar2);
            sVar.f(1);
            mVar = sVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        s sVar2 = new s();
        if (mVar != null) {
            sVar2.a(mVar);
        }
        sVar2.a(mVar3);
        return sVar2;
    }

    @Override // androidx.fragment.app.l0
    public final Object o(Object obj, Object obj2) {
        s sVar = new s();
        if (obj != null) {
            sVar.a((m) obj);
        }
        sVar.a((m) obj2);
        return sVar;
    }

    @Override // androidx.fragment.app.l0
    public final void p(Object obj, View view2, ArrayList<View> arrayList) {
        ((m) obj).addListener(new b(this, view2, arrayList));
    }

    @Override // androidx.fragment.app.l0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((m) obj).addListener(new f(this, obj2, arrayList, null, null, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.l0
    public final void r(Object obj, float f14) {
        r rVar = (r) obj;
        if (rVar.isReady()) {
            long jB = (long) (f14 * rVar.b());
            if (jB == 0) {
                jB = 1;
            }
            if (jB == rVar.b()) {
                jB = rVar.b() - 1;
            }
            rVar.d(jB);
        }
    }

    @Override // androidx.fragment.app.l0
    public final void s(View view2, Object obj) {
        if (view2 != null) {
            Rect rect = new Rect();
            l0.j(rect, view2);
            ((m) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.l0
    public final void t(Object obj, Rect rect) {
        ((m) obj).setEpicenterCallback(new c(this, rect));
    }

    @Override // androidx.fragment.app.l0
    public final void u(Fragment fragment, Object obj, h7.d dVar, Runnable runnable) {
        v(obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.l0
    public final void v(Object obj, h7.d dVar, a0.c cVar, Runnable runnable) {
        m mVar = (m) obj;
        a73.f fVar = new a73.f(cVar, 4, mVar, runnable);
        synchronized (dVar) {
            while (dVar.f82325d) {
                try {
                    try {
                        dVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (dVar.f82323b != fVar) {
                dVar.f82323b = fVar;
                if (dVar.f82322a) {
                    Runnable runnable2 = (Runnable) fVar.f1836d;
                    m mVar2 = (m) fVar.f1834b;
                    Runnable runnable3 = (Runnable) fVar.f1835c;
                    if (runnable2 == null) {
                        mVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        mVar.addListener(new g(this, runnable));
    }

    @Override // androidx.fragment.app.l0
    public final void w(Object obj, View view2, ArrayList<View> arrayList) {
        s sVar = (s) obj;
        List<View> targets = sVar.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            l0.f(arrayList.get(i14), targets);
        }
        targets.add(view2);
        arrayList.add(view2);
        b(sVar, arrayList);
    }

    @Override // androidx.fragment.app.l0
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        s sVar = (s) obj;
        if (sVar != null) {
            sVar.getTargets().clear();
            sVar.getTargets().addAll(arrayList2);
            A(sVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.l0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        s sVar = new s();
        sVar.a((m) obj);
        return sVar;
    }
}
