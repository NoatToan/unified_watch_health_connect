package v03;

import g13.h;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements s03.b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f174653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f174654b;

    public e(Iterable<? extends s03.b> iterable) {
        w03.b.a(iterable, "resources is null");
        this.f174653a = new LinkedList();
        for (s03.b bVar : iterable) {
            w03.b.a(bVar, "Disposable item is null");
            this.f174653a.add(bVar);
        }
    }

    @Override // v03.b
    public final boolean a(s03.b bVar) {
        int i14 = w03.b.f181178a;
        if (!this.f174654b) {
            synchronized (this) {
                try {
                    if (!this.f174654b) {
                        LinkedList linkedList = this.f174653a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f174653a = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // s03.b
    public final boolean b() {
        return this.f174654b;
    }

    @Override // v03.b
    public final boolean c(s03.b bVar) {
        if (!d(bVar)) {
            return false;
        }
        ((h) bVar).dispose();
        return true;
    }

    @Override // v03.b
    public final boolean d(s03.b bVar) {
        int i14 = w03.b.f181178a;
        if (this.f174654b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f174654b) {
                    return false;
                }
                LinkedList linkedList = this.f174653a;
                if (linkedList != null && linkedList.remove(bVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // s03.b
    public final void dispose() {
        if (this.f174654b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f174654b) {
                    return;
                }
                this.f174654b = true;
                LinkedList linkedList = this.f174653a;
                ArrayList arrayList = null;
                this.f174653a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((s03.b) it.next()).dispose();
                    } catch (Throwable th3) {
                        t03.a.a(th3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th3);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw i13.d.b((Throwable) arrayList.get(0));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public e(s03.b... bVarArr) {
        w03.b.a(bVarArr, "resources is null");
        this.f174653a = new LinkedList();
        for (s03.b bVar : bVarArr) {
            w03.b.a(bVar, "Disposable item is null");
            this.f174653a.add(bVar);
        }
    }

    public e() {
    }
}
