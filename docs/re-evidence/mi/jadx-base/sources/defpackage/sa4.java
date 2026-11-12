package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sa4 implements koo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<koo> f33447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f33448b;

    private static void c(Collection<koo> collection) {
        if (collection == null) {
            return;
        }
        Iterator<koo> it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        pf8.c(arrayList);
    }

    public void a(koo kooVar) {
        if (kooVar.isUnsubscribed()) {
            return;
        }
        if (!this.f33448b) {
            synchronized (this) {
                try {
                    if (!this.f33448b) {
                        if (this.f33447a == null) {
                            this.f33447a = new HashSet(4);
                        }
                        this.f33447a.add(kooVar);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kooVar.unsubscribe();
    }

    public void b(koo kooVar) {
        Set<koo> set;
        if (this.f33448b) {
            return;
        }
        synchronized (this) {
            if (!this.f33448b && (set = this.f33447a) != null) {
                boolean zRemove = set.remove(kooVar);
                if (zRemove) {
                    kooVar.unsubscribe();
                }
            }
        }
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.f33448b;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        if (this.f33448b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f33448b) {
                    return;
                }
                this.f33448b = true;
                Set<koo> set = this.f33447a;
                this.f33447a = null;
                c(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
