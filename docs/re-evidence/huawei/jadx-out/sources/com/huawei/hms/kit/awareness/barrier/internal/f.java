package com.huawei.hms.kit.awareness.barrier.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArraySet;
import com.huawei.hms.kit.awareness.barrier.AwarenessBarrier;
import com.huawei.hms.kit.awareness.barrier.BarrierUpdateRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes34.dex */
public final class f extends BarrierUpdateRequest implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14009a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14010b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14011c = 3;
    private static final String d = "BarrierUpdateRequestImpl";
    private final List<com.huawei.hms.kit.awareness.barrier.internal.a> e;
    private com.huawei.hms.kit.awareness.b.e f;

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierUpdateRequest, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.e);
        parcel.writeParcelable(this.f, i);
    }

    public boolean l() {
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().b() instanceof com.huawei.hms.kit.awareness.barrier.internal.a.e.a) {
                return true;
            }
        }
        return false;
    }

    public int k() {
        int iO;
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            AwarenessBarrier awarenessBarrierB = it.next().b();
            if ((awarenessBarrierB instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) && i < (iO = ((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrierB).o())) {
                i = iO;
            }
        }
        return i;
    }

    public Set<Integer> j() {
        final ArraySet arraySet = new ArraySet();
        a(new a() { // from class: com.huawei.hms.kit.awareness.barrier.internal.f.1
            @Override // com.huawei.hms.kit.awareness.barrier.internal.f.a
            protected boolean a(com.huawei.hms.kit.awareness.barrier.internal.a aVar) {
                AwarenessBarrier awarenessBarrierB = aVar.b();
                if (!(awarenessBarrierB instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c)) {
                    return false;
                }
                arraySet.addAll(((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrierB).n().m());
                return false;
            }
        });
        return arraySet;
    }

    public com.huawei.hms.kit.awareness.barrier.internal.a i() {
        if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a((Collection) this.e)) {
            return null;
        }
        com.huawei.hms.kit.awareness.barrier.internal.a aVar = this.e.get(0);
        if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a(aVar)) {
            return null;
        }
        return aVar;
    }

    public boolean h() {
        boolean z = false;
        for (com.huawei.hms.kit.awareness.barrier.internal.a aVar : this.e) {
            if (aVar.c() == 1) {
                AwarenessBarrier awarenessBarrierB = aVar.b();
                if (awarenessBarrierB instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) {
                    com.huawei.hms.kit.awareness.barrier.internal.a.c cVar = (com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrierB;
                    cVar.B();
                    cVar.q();
                    z = true;
                }
            }
        }
        return z;
    }

    public void g() {
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        while (it.hasNext()) {
            AwarenessBarrier awarenessBarrierB = it.next().b();
            if (awarenessBarrierB instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) {
                ((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrierB).n().j();
            }
        }
    }

    public List<com.huawei.hms.kit.awareness.barrier.internal.a> f() {
        return (List) this.e.stream().filter(new Predicate() { // from class: com.huawei.hms.kit.awareness.barrier.internal.f$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.a((a) obj);
            }
        }).collect(Collectors.toList());
    }

    public int e() {
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        int iP = 0;
        while (it.hasNext()) {
            AwarenessBarrier awarenessBarrierB = it.next().b();
            if (awarenessBarrierB instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) {
                iP += ((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrierB).p();
            }
        }
        return iP;
    }

    public com.huawei.hms.kit.awareness.b.e d() {
        return this.f;
    }

    public void c() {
        this.e.clear();
        this.e.add(com.huawei.hms.kit.awareness.barrier.internal.a.a(null, 3, null, null));
    }

    public boolean b() {
        if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a((Collection) this.e)) {
            com.huawei.hms.kit.awareness.b.a.c.a(d, "mItems is empty", new Object[0]);
            return false;
        }
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                com.huawei.hms.kit.awareness.b.a.c.a(d, "one item is null", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public boolean a(a aVar) {
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        while (it.hasNext()) {
            if (aVar.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void a(final String str, AwarenessBarrier awarenessBarrier, PendingIntent pendingIntent) {
        if (str == null || awarenessBarrier == null || pendingIntent == null) {
            com.huawei.hms.kit.awareness.b.a.c.d(d, "addBarrier parameters are invalid", new Object[0]);
        } else {
            this.e.removeIf(new Predicate() { // from class: com.huawei.hms.kit.awareness.barrier.internal.f$$ExternalSyntheticLambda3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return f.b(str, (a) obj);
                }
            });
            this.e.add(com.huawei.hms.kit.awareness.barrier.internal.a.a(str, 1, awarenessBarrier, pendingIntent));
        }
    }

    public void a(final String str) {
        if (str == null) {
            return;
        }
        this.e.removeIf(new Predicate() { // from class: com.huawei.hms.kit.awareness.barrier.internal.f$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.a(str, (a) obj);
            }
        });
        this.e.add(com.huawei.hms.kit.awareness.barrier.internal.a.a(str, 0, null, null));
    }

    public void a(com.huawei.hms.kit.awareness.b.e eVar) {
        this.f = eVar;
    }

    public void a(final PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return;
        }
        this.e.removeIf(new Predicate() { // from class: com.huawei.hms.kit.awareness.barrier.internal.f$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f.a(pendingIntent, (a) obj);
            }
        });
        this.e.add(com.huawei.hms.kit.awareness.barrier.internal.a.a(null, 0, null, pendingIntent));
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.g
    public int a(Context context) {
        Iterator<com.huawei.hms.kit.awareness.barrier.internal.a> it = this.e.iterator();
        while (it.hasNext()) {
            int iA = it.next().a(context);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public int a() {
        return this.e.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, com.huawei.hms.kit.awareness.barrier.internal.a aVar) {
        return str.equals(aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, com.huawei.hms.kit.awareness.barrier.internal.a aVar) {
        return str.equals(aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(com.huawei.hms.kit.awareness.barrier.internal.a aVar) {
        return aVar.c() == 1;
    }

    public static boolean a(Parcelable parcelable) {
        return (parcelable instanceof f) && ((f) parcelable).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(PendingIntent pendingIntent, com.huawei.hms.kit.awareness.barrier.internal.a aVar) {
        return pendingIntent.equals(aVar.e());
    }

    public f(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        parcel.readList(arrayList, com.huawei.hms.kit.awareness.barrier.internal.a.class.getClassLoader());
        this.f = (com.huawei.hms.kit.awareness.b.e) parcel.readParcelable(com.huawei.hms.kit.awareness.b.e.class.getClassLoader());
    }

    public f() {
        this.e = new ArrayList();
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14014a;

        protected abstract boolean a(com.huawei.hms.kit.awareness.barrier.internal.a aVar);

        public final void a(int i) {
            this.f14014a = i;
        }

        public final int a() {
            return this.f14014a;
        }
    }
}
