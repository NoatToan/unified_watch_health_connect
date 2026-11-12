package vt2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a extends ArrayList<n<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList<n<?>> f180190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList<n<?>> f180191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList<n<?>> f180192d;

    public a(byte[] bArr, q qVar) throws UnsupportedEncodingException {
        n<?> nVarPoll;
        n<?> lVar;
        n<?> jVar;
        this.f180191c = new LinkedList<>();
        this.f180192d = new LinkedList<>();
        int iC = 0;
        while (iC < bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
            byte b14 = bArrCopyOfRange[0];
            if (b14 != 0) {
                if (b14 == 1) {
                    jVar = new j(bArrCopyOfRange);
                } else if (b14 == 2) {
                    jVar = new h(bArrCopyOfRange);
                } else if (b14 == 3) {
                    jVar = new m(bArrCopyOfRange);
                } else if (b14 == 5) {
                    jVar = new b(bArrCopyOfRange);
                } else if (b14 == 9) {
                    jVar = new c(bArrCopyOfRange);
                } else if (b14 == 11) {
                    jVar = new i(bArrCopyOfRange);
                } else if (b14 == 14) {
                    jVar = new k(bArrCopyOfRange);
                } else if (b14 == 15) {
                    jVar = new g(bArrCopyOfRange);
                } else if (b14 == 19) {
                    jVar = new e(bArrCopyOfRange);
                } else if (b14 != 20) {
                    lVar = null;
                } else {
                    jVar = new d(bArrCopyOfRange);
                }
                lVar = jVar;
            } else {
                lVar = new l();
            }
            if (lVar == null) {
                throw new UnsupportedEncodingException("Failed to deserialize MonkeyC objects");
            }
            this.f180191c.add(lVar);
            if (qVar != null && (lVar instanceof m)) {
                b(lVar, qVar);
            }
            iC += lVar.c();
        }
        do {
            nVarPoll = this.f180191c.poll();
            if (nVarPoll != null) {
                if (nVarPoll instanceof b) {
                    c((b) nVarPoll);
                } else if (nVarPoll instanceof i) {
                    e((i) nVarPoll);
                }
                add(nVarPoll);
            }
        } while (nVarPoll != null);
    }

    public static void b(n nVar, q qVar) {
        if (nVar instanceof m) {
            m mVar = (m) nVar;
            mVar.f180205c = qVar.f180211b.get(Integer.valueOf(mVar.f180204b));
            return;
        }
        if (nVar instanceof b) {
            Iterator it = ((b) nVar).f180193b.iterator();
            while (it.hasNext()) {
                b((n) it.next(), qVar);
            }
        } else if (nVar instanceof i) {
            for (Map.Entry<n<?>, n<?>> entry : ((i) nVar).f180200b.entrySet()) {
                b(entry.getKey(), qVar);
                b(entry.getValue(), qVar);
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(n<?> nVar) {
        boolean zAdd = super.add(nVar);
        if (zAdd) {
            try {
                this.f180189a += nVar.c();
            } catch (Exception unused) {
            }
        }
        return zAdd;
    }

    public final void c(b bVar) {
        for (int i14 = 0; i14 < bVar.f180194c; i14++) {
            n<?> nVarPoll = this.f180191c.poll();
            if (nVarPoll instanceof f) {
                this.f180192d.add(nVarPoll);
            }
            bVar.f180193b.add(nVarPoll);
        }
        d();
    }

    public final void d() {
        n<?> nVarPoll;
        do {
            nVarPoll = this.f180192d.poll();
            if (nVarPoll != null) {
                if (nVarPoll instanceof b) {
                    c((b) nVarPoll);
                } else if (nVarPoll instanceof i) {
                    e((i) nVarPoll);
                }
            }
        } while (nVarPoll != null);
    }

    public final void e(i iVar) {
        for (int i14 = 0; i14 < iVar.f180201c; i14++) {
            LinkedList<n<?>> linkedList = this.f180191c;
            n<?> nVarPoll = linkedList.poll();
            boolean z14 = nVarPoll instanceof f;
            LinkedList<n<?>> linkedList2 = this.f180192d;
            if (z14) {
                linkedList2.add(nVarPoll);
            }
            n<?> nVarPoll2 = linkedList.poll();
            if (nVarPoll2 instanceof f) {
                linkedList2.add(nVarPoll2);
            }
            iVar.f180200b.put(nVarPoll, nVarPoll2);
        }
        d();
    }

    public a() {
        this.f180190b = new LinkedList<>();
    }
}
