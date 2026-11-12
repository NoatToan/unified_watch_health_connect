package ch1;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w3<T1, T2> extends fb2.e<T1> {
    public w3(Context context) {
        super(context);
    }

    public static void p(w3 w3Var, Object obj) {
        w3Var.w(obj, w3Var.f70344b);
        w3Var.setChanged();
        w3Var.notifyObservers(obj);
    }

    @Override // fb2.e
    public boolean g(i.c cVar, T1 t7) {
        return v(cVar.findViewById(r()), cVar, t7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    public boolean k(T1 t7) {
        fb2.h hVar;
        fb2.f.a(t7, "Model is required!");
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH && (hVar = (fb2.h) this.f70345c) != null) {
            hVar.k(q(t7), u(), s(), t());
        }
        return zH;
    }

    public abstract T2 q(T1 t7);

    public abstract int r();

    public HashMap s() {
        return new HashMap();
    }

    public Map t() {
        return null;
    }

    public abstract HashMap u();

    public final boolean v(View view2, i.c cVar, T1 t7) {
        this.f70345c = new fb2.h(view2, cVar, new bd0.e(this, 9));
        return k(t7);
    }

    public abstract void w(T2 t7, T1 t14);
}
