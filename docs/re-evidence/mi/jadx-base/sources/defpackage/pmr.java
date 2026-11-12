package defpackage;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OperationKt;
import androidx.work.WorkRequest;
import androidx.work.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class pmr extends nmr {
    public static final String j = ppe.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final enr f30548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30549b;
    public final ExistingWorkPolicy c;
    public final List<? extends WorkRequest> d;
    public final List<String> e;
    public final List<String> f;
    public final List<pmr> g;
    public boolean h;
    public b i;

    public pmr(enr enrVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends WorkRequest> list) {
        this(enrVar, str, existingWorkPolicy, list, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean j(pmr pmrVar, Set<String> set) {
        set.addAll(pmrVar.d());
        Set<String> setN = n(pmrVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setN.contains(it.next())) {
                return true;
            }
        }
        List<pmr> listF = pmrVar.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<pmr> it2 = listF.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(pmrVar.d());
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> n(pmr pmrVar) {
        HashSet hashSet = new HashSet();
        List<pmr> listF = pmrVar.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<pmr> it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public b b() {
        if (this.h) {
            ppe.e().k(j, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            this.i = OperationKt.launchOperation(this.f30548a.getConfiguration().getTracer(), "EnqueueRunnable_" + c().name(), this.f30548a.l().d(), new Function0() { // from class: omr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f29304a.l();
                }
            });
        }
        return this.i;
    }

    public ExistingWorkPolicy c() {
        return this.c;
    }

    public List<String> d() {
        return this.e;
    }

    public String e() {
        return this.f30549b;
    }

    public List<pmr> f() {
        return this.g;
    }

    public List<? extends WorkRequest> g() {
        return this.d;
    }

    public enr h() {
        return this.f30548a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.h;
    }

    public final /* synthetic */ Unit l() {
        wb8.b(this);
        return Unit.INSTANCE;
    }

    public void m() {
        this.h = true;
    }

    public pmr(enr enrVar, List<? extends WorkRequest> list) {
        this(enrVar, null, ExistingWorkPolicy.KEEP, list, null);
    }

    public pmr(enr enrVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends WorkRequest> list, List<pmr> list2) {
        this.f30548a = enrVar;
        this.f30549b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator<pmr> it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(it.next().f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && list.get(i).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String stringId = list.get(i).getStringId();
            this.e.add(stringId);
            this.f.add(stringId);
        }
    }
}
