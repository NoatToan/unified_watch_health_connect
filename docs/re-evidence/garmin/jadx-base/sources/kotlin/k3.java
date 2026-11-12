package kotlin;

import e23.l;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p5.a;
import p5.p;
import p5.q;
import p5.r;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {
    public static final q0 a(q qVar) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        p.f136057a.getClass();
        a aVar = (a) r.a(qVar, p.f136058b);
        if (aVar == null || (lVar = (l) aVar.f135946b) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (q0) arrayList.get(0);
    }

    public static final p002j6.a b(w0 w0Var, int i14) {
        Object next;
        Iterator<T> it = w0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e0) ((Map.Entry) next).getKey()).f81761b != i14);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (p002j6.a) entry.getValue();
        }
        return null;
    }

    public static final String c(int i14) {
        p5.l.a aVar = p5.l.f136032b;
        aVar.getClass();
        if (i14 == 0) {
            return "android.widget.Button";
        }
        aVar.getClass();
        if (i14 == p5.l.f136033c) {
            return "android.widget.CheckBox";
        }
        aVar.getClass();
        if (i14 == p5.l.f136035e) {
            return "android.widget.RadioButton";
        }
        aVar.getClass();
        if (i14 == p5.l.f136037g) {
            return "android.widget.ImageView";
        }
        aVar.getClass();
        if (i14 == p5.l.f136038h) {
            return "android.widget.Spinner";
        }
        aVar.getClass();
        if (i14 == p5.l.f136039i) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
