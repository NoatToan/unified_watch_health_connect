package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.n8g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f1968a;
    public HashSet<View> c;
    public ArrayList<c.b> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<c> f1969b = new ArrayList<>();
    public String d = "ViewTransitionController";
    public ArrayList<c.b> f = new ArrayList<>();

    public class a implements androidx.constraintlayout.widget.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f1970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1971b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        public a(c cVar, int i, boolean z, int i2) {
            this.f1970a = cVar;
            this.f1971b = i;
            this.c = z;
            this.d = i2;
        }
    }

    public d(MotionLayout motionLayout) {
        this.f1968a = motionLayout;
    }

    public void a(c cVar) {
        this.f1969b.add(cVar);
        this.c = null;
        if (cVar.i() == 4) {
            f(cVar, true);
        } else if (cVar.i() == 5) {
            f(cVar, false);
        }
    }

    public void b(c.b bVar) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(bVar);
    }

    public void c() {
        ArrayList<c.b> arrayList = this.e;
        if (arrayList == null) {
            return;
        }
        Iterator<c.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if (this.e.isEmpty()) {
            this.e = null;
        }
    }

    public boolean d(int i, n8g n8gVar) {
        for (c cVar : this.f1969b) {
            if (cVar.e() == i) {
                cVar.f.a(n8gVar);
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.f1968a.invalidate();
    }

    public final void f(c cVar, boolean z) {
        ConstraintLayout.getSharedValues().a(cVar.h(), new a(cVar, cVar.h(), z, cVar.g()));
    }

    public void g(c.b bVar) {
        this.f.add(bVar);
    }

    public void h(MotionEvent motionEvent) {
        int currentState = this.f1968a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.c == null) {
            this.c = new HashSet<>();
            for (c cVar : this.f1969b) {
                int childCount = this.f1968a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f1968a.getChildAt(i);
                    if (cVar.k(childAt)) {
                        childAt.getId();
                        this.c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<c.b> arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<c.b> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.a aVarM = this.f1968a.M(currentState);
            for (c cVar2 : this.f1969b) {
                if (cVar2.m(action)) {
                    for (View view : this.c) {
                        if (cVar2.k(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                cVar2.c(this, this.f1968a, currentState, aVarM, view);
                            }
                        }
                    }
                }
            }
        }
    }

    public void i(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f1969b) {
            if (cVar.e() == i) {
                for (View view : viewArr) {
                    if (cVar.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    j(cVar, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    public final void j(c cVar, View... viewArr) {
        int currentState = this.f1968a.getCurrentState();
        if (cVar.e == 2) {
            cVar.c(this, this.f1968a, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("No support for ViewTransition within transition yet. Currently: ");
            sb.append(this.f1968a.toString());
        } else {
            androidx.constraintlayout.widget.a aVarM = this.f1968a.M(currentState);
            if (aVarM == null) {
                return;
            }
            cVar.c(this, this.f1968a, currentState, aVarM, viewArr);
        }
    }
}
