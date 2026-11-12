package defpackage;

import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import androidx.constraintlayout.core.widgets.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class bir {
    public static int g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4269b;
    public int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f4268a = new ArrayList<>();
    public boolean c = false;
    public ArrayList<a> e = null;
    public int f = -1;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ConstraintWidget> f4270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4271b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a(ConstraintWidget constraintWidget, c cVar, int i) {
            this.f4270a = new WeakReference<>(constraintWidget);
            this.f4271b = cVar.y(constraintWidget.Q);
            this.c = cVar.y(constraintWidget.R);
            this.d = cVar.y(constraintWidget.S);
            this.e = cVar.y(constraintWidget.T);
            this.f = cVar.y(constraintWidget.U);
            this.g = i;
        }
    }

    public bir(int i) {
        int i2 = g;
        g = i2 + 1;
        this.f4269b = i2;
        this.d = i;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f4268a.contains(constraintWidget)) {
            return false;
        }
        this.f4268a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<bir> arrayList) {
        int size = this.f4268a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                bir birVar = arrayList.get(i);
                if (this.f == birVar.f4269b) {
                    g(this.d, birVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f4269b;
    }

    public int d() {
        return this.d;
    }

    public final String e() {
        int i = this.d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    public int f(c cVar, int i) {
        if (this.f4268a.size() == 0) {
            return 0;
        }
        return j(cVar, this.f4268a, i);
    }

    public void g(int i, bir birVar) {
        for (ConstraintWidget constraintWidget : this.f4268a) {
            birVar.a(constraintWidget);
            if (i == 0) {
                constraintWidget.S0 = birVar.c();
            } else {
                constraintWidget.T0 = birVar.c();
            }
        }
        this.f = birVar.f4269b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public final int j(c cVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int iY;
        int iY2;
        d dVar = (d) arrayList.get(0).M();
        cVar.E();
        dVar.g(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(cVar, false);
        }
        if (i == 0 && dVar.g1 > 0) {
            b.b(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.h1 > 0) {
            b.b(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a(arrayList.get(i3), cVar, i));
        }
        if (i == 0) {
            iY = cVar.y(dVar.Q);
            iY2 = cVar.y(dVar.S);
            cVar.E();
        } else {
            iY = cVar.y(dVar.R);
            iY2 = cVar.y(dVar.T);
            cVar.E();
        }
        return iY2 - iY;
    }

    public String toString() {
        String str = e() + " [" + this.f4269b + "] <";
        Iterator<ConstraintWidget> it = this.f4268a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().v();
        }
        return str + " >";
    }
}
