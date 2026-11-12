package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uge implements jz6, kz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<jz6> f35737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f35738b;

    @Override // defpackage.kz6
    public boolean a(jz6 jz6Var) {
        x3h.d(jz6Var, "d is null");
        if (!this.f35738b) {
            synchronized (this) {
                try {
                    if (!this.f35738b) {
                        List linkedList = this.f35737a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f35737a = linkedList;
                        }
                        linkedList.add(jz6Var);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jz6Var.dispose();
        return false;
    }

    @Override // defpackage.kz6
    public boolean b(jz6 jz6Var) {
        if (!c(jz6Var)) {
            return false;
        }
        jz6Var.dispose();
        return true;
    }

    @Override // defpackage.kz6
    public boolean c(jz6 jz6Var) {
        x3h.d(jz6Var, "Disposable item is null");
        if (this.f35738b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f35738b) {
                    return false;
                }
                List<jz6> list = this.f35737a;
                if (list != null && list.remove(jz6Var)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(List<jz6> list) {
        if (list == null) {
            return;
        }
        Iterator<jz6> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                qf8.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw jf8.d((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (this.f35738b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f35738b) {
                    return;
                }
                this.f35738b = true;
                List<jz6> list = this.f35737a;
                this.f35737a = null;
                d(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.f35738b;
    }
}
