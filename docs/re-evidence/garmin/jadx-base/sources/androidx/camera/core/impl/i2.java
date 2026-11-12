package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5575a;

    public i2(List<e2> list) {
        this.f5575a = new ArrayList(list);
    }

    public static void d(i2 i2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i2Var.f5575a.iterator();
        while (it.hasNext()) {
            arrayList.add(((e2) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public final boolean a(Class<? extends e2> cls) {
        Iterator it = this.f5575a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((e2) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final <T extends e2> T b(Class<T> cls) {
        for (T t7 : this.f5575a) {
            if (t7.getClass() == cls) {
                return t7;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (e2 e2Var : this.f5575a) {
            if (cls.isAssignableFrom(e2Var.getClass())) {
                arrayList.add(e2Var);
            }
        }
        return arrayList;
    }
}
