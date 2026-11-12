package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class moo implements koo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<koo> f27053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f27054b;

    public moo() {
    }

    public static void c(Collection<koo> collection) {
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
        if (!this.f27054b) {
            synchronized (this) {
                try {
                    if (!this.f27054b) {
                        List linkedList = this.f27053a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f27053a = linkedList;
                        }
                        linkedList.add(kooVar);
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
        if (this.f27054b) {
            return;
        }
        synchronized (this) {
            List<koo> list = this.f27053a;
            if (!this.f27054b && list != null) {
                boolean zRemove = list.remove(kooVar);
                if (zRemove) {
                    kooVar.unsubscribe();
                }
            }
        }
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.f27054b;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        if (this.f27054b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f27054b) {
                    return;
                }
                this.f27054b = true;
                List<koo> list = this.f27053a;
                this.f27053a = null;
                c(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public moo(koo... kooVarArr) {
        this.f27053a = new LinkedList(Arrays.asList(kooVarArr));
    }

    public moo(koo kooVar) {
        LinkedList linkedList = new LinkedList();
        this.f27053a = linkedList;
        linkedList.add(kooVar);
    }
}
