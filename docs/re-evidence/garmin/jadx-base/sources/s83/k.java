package s83;

import j83.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f157985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f157986b;

    public k(o... oVarArr) {
        this.f157985a = new LinkedList(Arrays.asList(oVarArr));
    }

    public final void a(o oVar) {
        if (oVar.e()) {
            return;
        }
        if (!this.f157986b) {
            synchronized (this) {
                try {
                    if (!this.f157986b) {
                        LinkedList linkedList = this.f157985a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f157985a = linkedList;
                        }
                        linkedList.add(oVar);
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        oVar.f();
    }

    @Override // j83.o
    public final boolean e() {
        return this.f157986b;
    }

    @Override // j83.o
    public final void f() {
        if (this.f157986b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f157986b) {
                    return;
                }
                this.f157986b = true;
                LinkedList linkedList = this.f157985a;
                ArrayList arrayList = null;
                this.f157985a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
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

    public k() {
    }

    public k(o oVar) {
        LinkedList linkedList = new LinkedList();
        this.f157985a = linkedList;
        linkedList.add(oVar);
    }
}
