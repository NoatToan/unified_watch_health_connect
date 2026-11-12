package y83;

import j83.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f195246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f195247b;

    public b(o... oVarArr) {
        this.f195246a = new HashSet(Arrays.asList(oVarArr));
    }

    public final void a(o oVar) {
        if (oVar.e()) {
            return;
        }
        if (!this.f195247b) {
            synchronized (this) {
                try {
                    if (!this.f195247b) {
                        if (this.f195246a == null) {
                            this.f195246a = new HashSet(4);
                        }
                        this.f195246a.add(oVar);
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        oVar.f();
    }

    public final void b(o oVar) {
        HashSet hashSet;
        if (this.f195247b) {
            return;
        }
        synchronized (this) {
            if (!this.f195247b && (hashSet = this.f195246a) != null) {
                boolean zRemove = hashSet.remove(oVar);
                if (zRemove) {
                    oVar.f();
                }
            }
        }
    }

    @Override // j83.o
    public final boolean e() {
        return this.f195247b;
    }

    @Override // j83.o
    public final void f() {
        if (this.f195247b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f195247b) {
                    return;
                }
                this.f195247b = true;
                HashSet hashSet = this.f195246a;
                ArrayList arrayList = null;
                this.f195246a = null;
                if (hashSet == null) {
                    return;
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    try {
                        ((o) it.next()).f();
                    } catch (Throwable th3) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th3);
                    }
                }
                m83.a.a(arrayList);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public b() {
    }
}
