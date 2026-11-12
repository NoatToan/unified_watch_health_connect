package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11147a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<p1.a<ViewGroup, ArrayList<m>>>> f11148b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f11149c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f11150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f11151b;

        /* JADX INFO: renamed from: androidx.transition.p$a$a, reason: collision with other inner class name */
        public class C0157a extends o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p1.a f11152a;

            public C0157a(p1.a aVar) {
                this.f11152a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.o, androidx.transition.m.h
            public final void onTransitionEnd(m mVar) {
                ((ArrayList) this.f11152a.get(a.this.f11151b)).remove(mVar);
                mVar.removeListener(this);
            }
        }

        public a(m mVar, ViewGroup viewGroup) {
            this.f11150a = mVar;
            this.f11151b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.f11151b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            if (!p.f11149c.remove(viewGroup)) {
                return true;
            }
            p1.a<ViewGroup, ArrayList<m>> aVarB = p.b();
            ArrayList<m> arrayList = aVarB.get(viewGroup);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarB.put(viewGroup, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            m mVar = this.f11150a;
            arrayList.add(mVar);
            mVar.addListener(new C0157a(aVarB));
            mVar.captureValues(viewGroup, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).resume(viewGroup);
                }
            }
            mVar.playTransition(viewGroup);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            ViewGroup viewGroup = this.f11151b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            p.f11149c.remove(viewGroup);
            ArrayList<m> arrayList = p.b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup);
                }
            }
            this.f11150a.clearValues(true);
        }
    }

    public p() {
        new p1.a();
        new p1.a();
    }

    public static void a(m mVar, ViewGroup viewGroup) {
        ArrayList<ViewGroup> arrayList = f11149c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (mVar == null) {
            mVar = f11147a;
        }
        m mVarMo6clone = mVar.mo6clone();
        c(mVarMo6clone, viewGroup);
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (mVarMo6clone != null) {
            a aVar = new a(mVarMo6clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    public static p1.a<ViewGroup, ArrayList<m>> b() {
        p1.a<ViewGroup, ArrayList<m>> aVar;
        ThreadLocal<WeakReference<p1.a<ViewGroup, ArrayList<m>>>> threadLocal = f11148b;
        WeakReference<p1.a<ViewGroup, ArrayList<m>>> weakReference = threadLocal.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        p1.a<ViewGroup, ArrayList<m>> aVar2 = new p1.a<>();
        threadLocal.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void c(m mVar, ViewGroup viewGroup) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.captureValues(viewGroup, true);
        }
        k kVar = (k) viewGroup.getTag(R.id.transition_current_scene);
        if (kVar != null) {
        }
    }
}
