package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f11673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f11674b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f11675c = p1.a();

    public o1(Handler handler) {
        this.f11673a = new n1(this, handler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakHashMap weakHashMap;
        l1 l1Var;
        p1 p1Var = this.f11675c;
        WeakHashMap weakHashMap2 = this.f11674b;
        p1Var.getClass();
        m.a().getClass();
        Activity activityC = u.f11699c.c();
        if (activityC == null || (weakHashMap = p1Var.f11679b) == null || !weakHashMap.containsKey(activityC) || (l1Var = (l1) p1Var.f11679b.get(activityC)) == null) {
            return;
        }
        if (p1Var.f11678a == null) {
            p1Var.f11678a = new HashSet();
        }
        p1Var.f11678a.clear();
        try {
            for (String str : l1Var.f11660b.keySet()) {
                m1 m1Var = (m1) l1Var.f11660b.get(str);
                if (m1Var != null) {
                    View view = m1Var.f11664a.getView();
                    if (view == null) {
                        p1Var.f11678a.add(str);
                    } else if (l1Var.a(view) != m1Var) {
                        p1Var.f11678a.add(str);
                    }
                }
            }
        } catch (ConcurrentModificationException unused) {
            HiLog.d("HAEO", "concurrent modification");
        }
        Iterator it = p1Var.f11678a.iterator();
        while (it.hasNext()) {
            l1Var.f11660b.remove((String) it.next());
        }
        n1 n1Var = p1Var.f11680c;
        if (n1Var == null) {
            return;
        }
        n1Var.f11671c = -1L;
        n1Var.f11669a.removeCallbacks(n1Var);
        ArrayList arrayList = new ArrayList();
        try {
            for (View view2 : weakHashMap2.keySet()) {
                m1 m1Var2 = (m1) weakHashMap2.get(view2);
                if (m1Var2 != null) {
                    boolean z = m1Var2.f11665b;
                    boolean zA = p1Var.a(m1Var2.f11664a);
                    if (m1Var2.f11664a.getView() != view2) {
                        arrayList.add(view2);
                        HiLog.d("HAEO", "maybe global id is changed");
                    } else {
                        if (zA && !z) {
                            p1.a(m1Var2);
                        }
                        m1Var2.f11665b = zA;
                    }
                }
            }
            for (m1 m1Var3 : l1Var.d.keySet()) {
                if (!l1Var.f11661c.containsKey(m1Var3.f11664a.getView())) {
                    m1Var3.f11665b = false;
                }
            }
        } catch (Exception unused2) {
            HiLog.w("HAEO", "fail to check view exposure");
        }
        l1Var.d.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p1.a(l1Var, (View) it2.next());
        }
    }
}
