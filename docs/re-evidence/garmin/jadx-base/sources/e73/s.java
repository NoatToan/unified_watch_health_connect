package e73;

import h73.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class s implements k73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f63435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63436b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList<k73.a> f63437c = new LinkedList<>();

    public s(char c14) {
        this.f63435a = c14;
    }

    @Override // k73.a
    public final char a() {
        return this.f63435a;
    }

    @Override // k73.a
    public final int b(f fVar, f fVar2) {
        k73.a first;
        int i14 = fVar.f63348g;
        LinkedList<k73.a> linkedList = this.f63437c;
        Iterator<k73.a> it = linkedList.iterator();
        while (it.hasNext()) {
            first = it.next();
            if (first.d() <= i14) {
                return first.b(fVar, fVar2);
            }
        }
        first = linkedList.getFirst();
        return first.b(fVar, fVar2);
    }

    @Override // k73.a
    public final void c(w wVar, w wVar2, int i14) {
        LinkedList<k73.a> linkedList = this.f63437c;
        for (k73.a first : linkedList) {
            if (first.d() <= i14) {
                first.c(wVar, wVar2, i14);
            }
        }
        first = linkedList.getFirst();
        first.c(wVar, wVar2, i14);
    }

    @Override // k73.a
    public final int d() {
        return this.f63436b;
    }

    @Override // k73.a
    public final char e() {
        return this.f63435a;
    }

    public final void f(k73.a aVar) {
        int iD = aVar.d();
        LinkedList<k73.a> linkedList = this.f63437c;
        ListIterator<k73.a> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iD2 = listIterator.next().d();
            if (iD > iD2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iD == iD2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f63435a + "' and minimum length " + iD);
            }
        }
        linkedList.add(aVar);
        this.f63436b = iD;
    }
}
