package ve;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c0 extends ue.g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f177550j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f177551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue.l f177553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends ue.j0> f177554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f177555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f177556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<c0> f177557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f177558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ue.z f177559i;

    static {
        ue.u.b("WorkContinuationImpl");
    }

    public c0(t0 t0Var, String str, ue.l lVar, List<? extends ue.j0> list, List<c0> list2) {
        this.f177551a = t0Var;
        this.f177552b = str;
        this.f177553c = lVar;
        this.f177554d = list;
        this.f177557g = list2;
        this.f177555e = new ArrayList(list.size());
        this.f177556f = new ArrayList();
        if (list2 != null) {
            Iterator<c0> it = list2.iterator();
            while (it.hasNext()) {
                this.f177556f.addAll(it.next().f177556f);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (lVar == ue.l.REPLACE && list.get(i14).f170094b.f26961u != Long.MAX_VALUE) {
                vb.h.s("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = list.get(i14).f170093a.toString();
            string.getClass();
            this.f177555e.add(string);
            this.f177556f.add(string);
        }
    }

    public static boolean b(c0 c0Var, HashSet hashSet) {
        hashSet.addAll(c0Var.f177555e);
        HashSet hashSetC = c(c0Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        List<c0> list = c0Var.f177557g;
        if (list != null && !list.isEmpty()) {
            Iterator<c0> it3 = list.iterator();
            while (it3.hasNext()) {
                if (b(it3.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(c0Var.f177555e);
        return false;
    }

    public static HashSet c(c0 c0Var) {
        HashSet hashSet = new HashSet();
        List<c0> list = c0Var.f177557g;
        if (list != null && !list.isEmpty()) {
            Iterator<c0> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f177555e);
            }
        }
        return hashSet;
    }

    @Override // ue.g0
    public final ue.y a() {
        if (this.f177558h) {
            ue.u uVarA = ue.u.a();
            TextUtils.join(", ", this.f177555e);
            uVarA.getClass();
        } else {
            t0 t0Var = this.f177551a;
            this.f177559i = ue.a0.a(t0Var.f177605c.f11448n, "EnqueueRunnable_" + this.f177553c.name(), t0Var.f177607e.d(), new vc0.v(this, 5));
        }
        return this.f177559i;
    }

    public c0(t0 t0Var, String str, ue.l lVar, List<? extends ue.j0> list) {
        this(t0Var, str, lVar, list, null);
    }

    public c0(t0 t0Var, List<? extends ue.j0> list) {
        this(t0Var, null, ue.l.KEEP, list, null);
    }
}
