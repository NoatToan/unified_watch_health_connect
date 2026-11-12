package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import defpackage.dla;
import defpackage.fla;
import defpackage.g6i;
import defpackage.otq;
import defpackage.pah;
import defpackage.si3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.fragment.app.l {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2380a;

        static {
            int[] iArr = new int[androidx.fragment.app.l.e.c.values().length];
            f2380a = iArr;
            try {
                iArr[androidx.fragment.app.l.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2380a[androidx.fragment.app.l.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2380a[androidx.fragment.app.l.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2380a[androidx.fragment.app.l.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public class RunnableC0034b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2382b;

        public RunnableC0034b(List list, androidx.fragment.app.l.e eVar) {
            this.f2381a = list;
            this.f2382b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2381a.contains(this.f2382b)) {
                this.f2381a.remove(this.f2382b);
                b.this.s(this.f2382b);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2384b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ androidx.fragment.app.l.e d;
        public final /* synthetic */ k e;

        public c(ViewGroup viewGroup, View view, boolean z, androidx.fragment.app.l.e eVar, k kVar) {
            this.f2383a = viewGroup;
            this.f2384b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2383a.endViewTransition(this.f2384b);
            if (this.c) {
                this.d.e().a(this.f2384b);
            }
            this.e.a();
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.d);
                sb.append(" has ended.");
            }
        }
    }

    public class d implements si3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f2385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2386b;

        public d(Animator animator, androidx.fragment.app.l.e eVar) {
            this.f2385a = animator;
            this.f2386b = eVar;
        }

        @Override // si3.a
        public void onCancel() {
            this.f2385a.end();
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f2386b);
                sb.append(" has been canceled.");
            }
        }
    }

    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2388b;
        public final /* synthetic */ View c;
        public final /* synthetic */ k d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2388b.endViewTransition(eVar.c);
                e.this.d.a();
            }
        }

        public e(androidx.fragment.app.l.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f2387a = eVar;
            this.f2388b = viewGroup;
            this.c = view;
            this.d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2388b.post(new a());
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f2387a);
                sb.append(" has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f2387a);
                sb.append(" has reached onAnimationStart.");
            }
        }
    }

    public class f implements si3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2391b;
        public final /* synthetic */ k c;
        public final /* synthetic */ androidx.fragment.app.l.e d;

        public f(View view, ViewGroup viewGroup, k kVar, androidx.fragment.app.l.e eVar) {
            this.f2390a = view;
            this.f2391b = viewGroup;
            this.c = kVar;
            this.d = eVar;
        }

        @Override // si3.a
        public void onCancel() {
            this.f2390a.clearAnimation();
            this.f2391b.endViewTransition(this.f2390a);
            this.c.a();
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.d);
                sb.append(" has been cancelled.");
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2393b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ArrayMap d;

        public g(androidx.fragment.app.l.e eVar, androidx.fragment.app.l.e eVar2, boolean z, ArrayMap arrayMap) {
            this.f2392a = eVar;
            this.f2393b = eVar2;
            this.c = z;
            this.d = arrayMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            dla.a(this.f2392a.f(), this.f2393b.f(), this.c, this.d, false);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fla f2394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2395b;
        public final /* synthetic */ Rect c;

        public h(fla flaVar, View view, Rect rect) {
            this.f2394a = flaVar;
            this.f2395b = view;
            this.c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2394a.h(this.f2395b, this.c);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2396a;

        public i(ArrayList arrayList) {
            this.f2396a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            dla.e(this.f2396a, 4);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f2398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.l.e f2399b;

        public j(m mVar, androidx.fragment.app.l.e eVar) {
            this.f2398a = mVar;
            this.f2399b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2398a.a();
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(this.f2399b);
                sb.append("has completed");
            }
        }
    }

    public static class k extends l {
        public boolean c;
        public boolean d;
        public androidx.fragment.app.c.a e;

        public k(androidx.fragment.app.l.e eVar, si3 si3Var, boolean z) {
            super(eVar, si3Var);
            this.d = false;
            this.c = z;
        }

        public androidx.fragment.app.c.a e(Context context) {
            if (this.d) {
                return this.e;
            }
            androidx.fragment.app.c.a aVarB = androidx.fragment.app.c.b(context, b().f(), b().e() == androidx.fragment.app.l.e.c.VISIBLE, this.c);
            this.e = aVarB;
            this.d = true;
            return aVarB;
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.fragment.app.l.e f2400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final si3 f2401b;

        public l(androidx.fragment.app.l.e eVar, si3 si3Var) {
            this.f2400a = eVar;
            this.f2401b = si3Var;
        }

        public void a() {
            this.f2400a.d(this.f2401b);
        }

        public androidx.fragment.app.l.e b() {
            return this.f2400a;
        }

        public si3 c() {
            return this.f2401b;
        }

        public boolean d() {
            androidx.fragment.app.l.e.c cVar;
            androidx.fragment.app.l.e.c cVarC = androidx.fragment.app.l.e.c.c(this.f2400a.f().mView);
            androidx.fragment.app.l.e.c cVarE = this.f2400a.e();
            return cVarC == cVarE || !(cVarC == (cVar = androidx.fragment.app.l.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    public static class m extends l {
        public final Object c;
        public final boolean d;
        public final Object e;

        public m(androidx.fragment.app.l.e eVar, si3 si3Var, boolean z, boolean z2) {
            super(eVar, si3Var);
            if (eVar.e() == androidx.fragment.app.l.e.c.VISIBLE) {
                this.c = z ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.d = z ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.c = z ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.e = eVar.f().getSharedElementEnterTransition();
            }
        }

        public fla e() {
            fla flaVarF = f(this.c);
            fla flaVarF2 = f(this.e);
            if (flaVarF == null || flaVarF2 == null || flaVarF == flaVarF2) {
                return flaVarF != null ? flaVarF : flaVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
        }

        public final fla f(Object obj) {
            if (obj == null) {
                return null;
            }
            fla flaVar = dla.f15651a;
            if (flaVar != null && flaVar.e(obj)) {
                return flaVar;
            }
            fla flaVar2 = dla.f15652b;
            if (flaVar2 != null && flaVar2.e(obj)) {
                return flaVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.e;
        }

        public Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        public boolean j() {
            return this.d;
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    @Override // androidx.fragment.app.l
    public void f(List<androidx.fragment.app.l.e> list, boolean z) {
        androidx.fragment.app.l.e eVar = null;
        androidx.fragment.app.l.e eVar2 = null;
        for (androidx.fragment.app.l.e eVar3 : list) {
            androidx.fragment.app.l.e.c cVarC = androidx.fragment.app.l.e.c.c(eVar3.f().mView);
            int i2 = a.f2380a[eVar3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (cVarC == androidx.fragment.app.l.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && cVarC != androidx.fragment.app.l.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(eVar);
            sb.append(" to ");
            sb.append(eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        for (androidx.fragment.app.l.e eVar4 : list) {
            si3 si3Var = new si3();
            eVar4.j(si3Var);
            arrayList.add(new k(eVar4, si3Var, z));
            si3 si3Var2 = new si3();
            eVar4.j(si3Var2);
            boolean z2 = false;
            if (z) {
                if (eVar4 == eVar) {
                    z2 = true;
                }
            } else if (eVar4 == eVar2) {
                z2 = true;
            }
            arrayList2.add(new m(eVar4, si3Var2, z, z2));
            eVar4.a(new RunnableC0034b(arrayList3, eVar4));
        }
        Map<androidx.fragment.app.l.e, Boolean> mapX = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator<androidx.fragment.app.l.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
        if (FragmentManager.M0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(eVar);
            sb2.append(" to ");
            sb2.append(eVar2);
        }
    }

    public void s(androidx.fragment.app.l.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (otq.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map<String, View> map, View view) {
        String strJ = androidx.core.view.c.J(view);
        if (strJ != null) {
            map.put(strJ, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.c.J(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List<k> list, List<androidx.fragment.app.l.e> list2, boolean z, Map<androidx.fragment.app.l.e, Boolean> map) {
        int i2;
        boolean z2;
        int i3;
        androidx.fragment.app.l.e eVar;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z3 = false;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                androidx.fragment.app.c.a aVarE = next.e(context);
                if (aVarE == null) {
                    next.a();
                } else {
                    Animator animator = aVarE.f2403b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        androidx.fragment.app.l.e eVarB = next.b();
                        Fragment fragmentF = eVarB.f();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (FragmentManager.M0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(fragmentF);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z4 = eVarB.e() == androidx.fragment.app.l.e.c.GONE;
                            if (z4) {
                                list2.remove(eVarB);
                            }
                            View view = fragmentF.mView;
                            viewGroupM.startViewTransition(view);
                            animator.addListener(new c(viewGroupM, view, z4, eVarB, next));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.M0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                eVar = eVarB;
                                sb2.append(eVar);
                                sb2.append(" has started.");
                            } else {
                                eVar = eVarB;
                            }
                            next.c().setOnCancelListener(new d(animator, eVar));
                            z3 = true;
                        }
                    }
                }
            }
        }
        for (k kVar : arrayList) {
            androidx.fragment.app.l.e eVarB2 = kVar.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z) {
                if (FragmentManager.M0(i2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(fragmentF2);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z3) {
                if (FragmentManager.M0(i2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(fragmentF2);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view2 = fragmentF2.mView;
                Animation animation = (Animation) g6i.g(((androidx.fragment.app.c.a) g6i.g(kVar.e(context))).f2402a);
                if (eVarB2.e() != androidx.fragment.app.l.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                    z2 = z3;
                    i3 = i2;
                } else {
                    viewGroupM.startViewTransition(view2);
                    androidx.fragment.app.c.b bVar = new androidx.fragment.app.c.b(animation, viewGroupM, view2);
                    z2 = z3;
                    bVar.setAnimationListener(new e(eVarB2, viewGroupM, view2, kVar));
                    view2.startAnimation(bVar);
                    i3 = 2;
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(eVarB2);
                        sb5.append(" has started.");
                    }
                }
                kVar.c().setOnCancelListener(new f(view2, viewGroupM, kVar, eVarB2));
                i2 = i3;
                z3 = z2;
            }
        }
    }

    public final Map<androidx.fragment.app.l.e, Boolean> x(List<m> list, List<androidx.fragment.app.l.e> list2, boolean z, androidx.fragment.app.l.e eVar, androidx.fragment.app.l.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        androidx.fragment.app.l.e eVar3;
        androidx.fragment.app.l.e eVar4;
        View view2;
        Object objK;
        ArrayList<View> arrayList3;
        b bVar;
        androidx.fragment.app.l.e eVar5;
        androidx.fragment.app.l.e eVar6;
        View view3;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList4;
        View view4;
        String strB;
        ArrayList<String> arrayList5;
        b bVar2 = this;
        androidx.fragment.app.l.e eVar7 = eVar;
        androidx.fragment.app.l.e eVar8 = eVar2;
        HashMap map = new HashMap();
        fla flaVar = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                fla flaVarE = mVar.e();
                if (flaVar == null) {
                    flaVar = flaVarE;
                } else if (flaVarE != null && flaVar != flaVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (flaVar == null) {
            for (m mVar2 : list) {
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view5 = new View(m().getContext());
        Rect rect = new Rect();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Object obj3 = null;
        View view6 = null;
        boolean z2 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                arrayList3 = arrayList7;
                bVar = bVar2;
                eVar5 = eVar7;
                eVar6 = eVar8;
                view3 = view5;
                view6 = view6;
            } else {
                Object objU = flaVar.u(flaVar.f(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view7 = view6;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList8 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList8;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (z == 0) {
                    enterTransitionCallback = eVar.f().getExitTransitionCallback();
                    exitTransitionCallback = eVar2.f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = eVar.f().getEnterTransitionCallback();
                    exitTransitionCallback = eVar2.f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                HashMap map2 = map;
                int i3 = 0;
                while (i3 < size) {
                    arrayMap.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size = size;
                    view5 = view5;
                }
                View view8 = view5;
                if (FragmentManager.M0(2)) {
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        Iterator<String> it3 = it2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(next);
                        it2 = it3;
                    }
                    Iterator<String> it4 = sharedElementSourceNames.iterator();
                    while (it4.hasNext()) {
                        String next2 = it4.next();
                        Iterator<String> it5 = it4;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(next2);
                        it4 = it5;
                    }
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                bVar2.u(arrayMap2, eVar.f().mView);
                arrayMap2.d(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Executing exit callback for operation ");
                        sb3.append(eVar7);
                    }
                    enterTransitionCallback.d(sharedElementSourceNames, arrayMap2);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = arrayMap2.get(str);
                        if (view9 == null) {
                            arrayMap.remove(str);
                            arrayList5 = sharedElementSourceNames;
                        } else {
                            arrayList5 = sharedElementSourceNames;
                            if (!str.equals(androidx.core.view.c.J(view9))) {
                                arrayMap.put(androidx.core.view.c.J(view9), (String) arrayMap.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList5;
                    }
                    arrayList4 = sharedElementSourceNames;
                } else {
                    arrayList4 = sharedElementSourceNames;
                    arrayMap.d(arrayMap2.keySet());
                }
                ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                bVar2.u(arrayMap3, eVar2.f().mView);
                arrayMap3.d(sharedElementTargetNames2);
                arrayMap3.d(arrayMap.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Executing enter callback for operation ");
                        sb4.append(eVar8);
                    }
                    exitTransitionCallback.d(sharedElementTargetNames2, arrayMap3);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = arrayMap3.get(str2);
                        if (view10 == null) {
                            String strB2 = dla.b(arrayMap, str2);
                            if (strB2 != null) {
                                arrayMap.remove(strB2);
                            }
                        } else if (!str2.equals(androidx.core.view.c.J(view10)) && (strB = dla.b(arrayMap, str2)) != null) {
                            arrayMap.put(strB, androidx.core.view.c.J(view10));
                        }
                    }
                } else {
                    dla.d(arrayMap, arrayMap3);
                }
                bVar2.v(arrayMap2, arrayMap.keySet());
                bVar2.v(arrayMap3, arrayMap.values());
                if (arrayMap.isEmpty()) {
                    arrayList6.clear();
                    arrayList7.clear();
                    arrayList3 = arrayList7;
                    bVar = bVar2;
                    eVar5 = eVar7;
                    view6 = view7;
                    map = map2;
                    obj3 = null;
                    eVar6 = eVar8;
                    view3 = view8;
                } else {
                    dla.a(eVar2.f(), eVar.f(), z, arrayMap2, true);
                    ArrayList<String> arrayList9 = arrayList4;
                    ArrayList<View> arrayList10 = arrayList7;
                    pah.a(m(), new g(eVar2, eVar, z, arrayMap3));
                    arrayList6.addAll(arrayMap2.values());
                    if (arrayList9.isEmpty()) {
                        view6 = view7;
                    } else {
                        view6 = arrayMap2.get(arrayList9.get(0));
                        flaVar.p(objU, view6);
                    }
                    arrayList3 = arrayList10;
                    arrayList3.addAll(arrayMap3.values());
                    if (sharedElementTargetNames2.isEmpty() || (view4 = arrayMap3.get(sharedElementTargetNames2.get(0))) == null) {
                        bVar = this;
                    } else {
                        bVar = this;
                        pah.a(m(), bVar.new h(flaVar, view4, rect));
                        z2 = true;
                    }
                    flaVar.s(objU, view8, arrayList6);
                    view3 = view8;
                    flaVar.n(objU, null, null, null, null, objU, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map = map2;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objU;
                }
            }
            arrayList6 = arrayList6;
            bVar2 = bVar;
            rect = rect;
            view5 = view3;
            eVar8 = eVar6;
            arrayMap = arrayMap;
            arrayList7 = arrayList3;
            eVar7 = eVar5;
            flaVar = flaVar;
        }
        View view11 = view6;
        ArrayMap arrayMap4 = arrayMap;
        ArrayList<View> arrayList11 = arrayList7;
        b bVar3 = bVar2;
        androidx.fragment.app.l.e eVar9 = eVar7;
        ArrayList<View> arrayList12 = arrayList6;
        Rect rect2 = rect;
        fla flaVar2 = flaVar;
        androidx.fragment.app.l.e eVar10 = eVar8;
        View view12 = view5;
        ArrayList arrayList13 = new ArrayList();
        Iterator<m> it6 = list.iterator();
        Object obj4 = null;
        Object objK2 = null;
        while (it6.hasNext()) {
            m next3 = it6.next();
            if (next3.d()) {
                map.put(next3.b(), Boolean.FALSE);
                next3.a();
            } else {
                Object objF = flaVar2.f(next3.h());
                androidx.fragment.app.l.e eVarB = next3.b();
                boolean z3 = obj3 != null && (eVarB == eVar9 || eVarB == eVar10);
                if (objF == null) {
                    if (!z3) {
                        map.put(eVarB, Boolean.FALSE);
                        next3.a();
                    }
                    arrayList2 = arrayList11;
                    arrayList = arrayList12;
                    it = it6;
                    view = view12;
                    objK = obj4;
                    eVar3 = eVar10;
                    view2 = view11;
                } else {
                    it = it6;
                    ArrayList<View> arrayList14 = new ArrayList<>();
                    Object obj5 = obj4;
                    bVar3.t(arrayList14, eVarB.f().mView);
                    if (z3) {
                        if (eVarB == eVar9) {
                            arrayList14.removeAll(arrayList12);
                        } else {
                            arrayList14.removeAll(arrayList11);
                        }
                    }
                    if (arrayList14.isEmpty()) {
                        flaVar2.a(objF, view12);
                        arrayList2 = arrayList11;
                        arrayList = arrayList12;
                        view = view12;
                        eVar4 = eVarB;
                        obj2 = objK2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        flaVar2.b(objF, arrayList14);
                        view = view12;
                        obj = obj5;
                        arrayList = arrayList12;
                        obj2 = objK2;
                        arrayList2 = arrayList11;
                        eVar3 = eVar10;
                        flaVar2.n(objF, objF, arrayList14, null, null, null, null);
                        if (eVarB.e() == androidx.fragment.app.l.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList15 = new ArrayList<>(arrayList14);
                            arrayList15.remove(eVar4.f().mView);
                            flaVar2.m(objF, eVar4.f().mView, arrayList15);
                            pah.a(m(), bVar3.new i(arrayList14));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.e() == androidx.fragment.app.l.e.c.VISIBLE) {
                        arrayList13.addAll(arrayList14);
                        if (z2) {
                            flaVar2.o(objF, rect2);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        flaVar2.p(objF, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (next3.j()) {
                        objK2 = flaVar2.k(obj2, objF, null);
                        objK = obj;
                    } else {
                        objK = flaVar2.k(obj, objF, null);
                        objK2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objK;
                view11 = view2;
                view12 = view;
                arrayList12 = arrayList;
                arrayList11 = arrayList2;
                it6 = it;
            }
        }
        ArrayList<View> arrayList16 = arrayList11;
        ArrayList<View> arrayList17 = arrayList12;
        androidx.fragment.app.l.e eVar11 = eVar10;
        Object objJ = flaVar2.j(objK2, obj4, obj3);
        if (objJ == null) {
            return map;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object objH = mVar4.h();
                androidx.fragment.app.l.e eVarB2 = mVar4.b();
                boolean z4 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z4) {
                    if (androidx.core.view.c.U(m())) {
                        flaVar2.q(mVar4.b().f(), objJ, mVar4.c(), bVar3.new j(mVar4, eVarB2));
                    } else {
                        if (FragmentManager.M0(2)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("SpecialEffectsController: Container ");
                            sb5.append(m());
                            sb5.append(" has not been laid out. Completing operation ");
                            sb5.append(eVarB2);
                        }
                        mVar4.a();
                    }
                }
            }
        }
        if (!androidx.core.view.c.U(m())) {
            return map;
        }
        dla.e(arrayList13, 4);
        ArrayList<String> arrayListL = flaVar2.l(arrayList16);
        if (FragmentManager.M0(2)) {
            for (View view13 : arrayList17) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("View: ");
                sb6.append(view13);
                sb6.append(" Name: ");
                sb6.append(androidx.core.view.c.J(view13));
            }
            for (View view14 : arrayList16) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("View: ");
                sb7.append(view14);
                sb7.append(" Name: ");
                sb7.append(androidx.core.view.c.J(view14));
            }
        }
        flaVar2.c(m(), objJ);
        flaVar2.r(m(), arrayList17, arrayList16, arrayListL, arrayMap4);
        dla.e(arrayList13, 0);
        flaVar2.t(obj3, arrayList17, arrayList16);
        return map;
    }

    public final void y(List<androidx.fragment.app.l.e> list) {
        Fragment fragmentF = list.get(list.size() - 1).f();
        for (androidx.fragment.app.l.e eVar : list) {
            eVar.f().mAnimationInfo.c = fragmentF.mAnimationInfo.c;
            eVar.f().mAnimationInfo.d = fragmentF.mAnimationInfo.d;
            eVar.f().mAnimationInfo.e = fragmentF.mAnimationInfo.e;
            eVar.f().mAnimationInfo.f = fragmentF.mAnimationInfo.f;
        }
    }
}
