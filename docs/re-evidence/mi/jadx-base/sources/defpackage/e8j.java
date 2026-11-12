package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class e8j implements rya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<oya> f16385a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<Integer> f16386b = new SparseArray<>();
    public final SparseArray<ArrayList<oya>> c = new SparseArray<>();

    @Override // defpackage.rya
    public synchronized ArrayList<oya> a(View view) {
        return g(view.getId());
    }

    public synchronized boolean b(int i, int i2) {
        oya oyaVar = this.f16385a.get(i);
        if (oyaVar == null) {
            return false;
        }
        c(oyaVar);
        i(i2, oyaVar);
        return true;
    }

    public final synchronized void c(oya oyaVar) {
        try {
            Integer num = this.f16386b.get(oyaVar.q());
            if (num != null) {
                this.f16386b.remove(oyaVar.q());
                ArrayList<oya> arrayList = this.c.get(num.intValue());
                if (arrayList != null) {
                    arrayList.remove(oyaVar);
                    if (arrayList.size() == 0) {
                        this.c.remove(num.intValue());
                    }
                }
            }
            if (oyaVar.r() != null) {
                oyaVar.d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d() {
        this.f16385a.clear();
        this.f16386b.clear();
        this.c.clear();
    }

    public synchronized void e(int i) {
        oya oyaVar = this.f16385a.get(i);
        if (oyaVar != null) {
            c(oyaVar);
            this.f16385a.remove(i);
        }
    }

    public synchronized oya f(int i) {
        return this.f16385a.get(i);
    }

    public synchronized ArrayList<oya> g(int i) {
        return this.c.get(i);
    }

    public synchronized void h(oya oyaVar) {
        this.f16385a.put(oyaVar.q(), oyaVar);
    }

    public final synchronized void i(int i, oya oyaVar) {
        try {
            if (this.f16386b.get(oyaVar.q()) != null) {
                throw new IllegalStateException("Handler " + oyaVar + " already attached");
            }
            this.f16386b.put(oyaVar.q(), Integer.valueOf(i));
            ArrayList<oya> arrayList = this.c.get(i);
            if (arrayList == null) {
                ArrayList<oya> arrayList2 = new ArrayList<>(1);
                arrayList2.add(oyaVar);
                this.c.put(i, arrayList2);
            } else {
                arrayList.add(oyaVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
