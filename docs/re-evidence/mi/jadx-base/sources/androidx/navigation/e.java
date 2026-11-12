package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import defpackage.hig;
import defpackage.y5j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class e extends d implements Iterable<d> {
    public final SparseArrayCompat<d> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2680k;
    public String l;

    public class a implements Iterator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2681a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2682b = false;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2682b = true;
            SparseArrayCompat<d> sparseArrayCompat = e.this.j;
            int i = this.f2681a + 1;
            this.f2681a = i;
            return sparseArrayCompat.valueAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2681a + 1 < e.this.j.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2682b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            e.this.j.valueAt(this.f2681a).z(null);
            e.this.j.removeAt(this.f2681a);
            this.f2681a--;
            this.f2682b = false;
        }
    }

    public e(i<? extends e> iVar) {
        super(iVar);
        this.j = new SparseArrayCompat<>();
    }

    public final void B(e eVar) {
        Iterator<d> it = eVar.iterator();
        while (it.hasNext()) {
            d next = it.next();
            it.remove();
            C(next);
        }
    }

    public final void C(d dVar) {
        int iM = dVar.m();
        if (iM == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (iM == m()) {
            throw new IllegalArgumentException("Destination " + dVar + " cannot have the same id as graph " + this);
        }
        d dVar2 = this.j.get(iM);
        if (dVar2 == dVar) {
            return;
        }
        if (dVar.r() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (dVar2 != null) {
            dVar2.z(null);
        }
        dVar.z(this);
        this.j.put(dVar.m(), dVar);
    }

    public final void E(Collection<d> collection) {
        for (d dVar : collection) {
            if (dVar != null) {
                C(dVar);
            }
        }
    }

    public final d F(int i) {
        return G(i, true);
    }

    public final d G(int i, boolean z) {
        d dVar = this.j.get(i);
        if (dVar != null) {
            return dVar;
        }
        if (!z || r() == null) {
            return null;
        }
        return r().F(i);
    }

    public String H() {
        if (this.l == null) {
            this.l = Integer.toString(this.f2680k);
        }
        return this.l;
    }

    public final int I() {
        return this.f2680k;
    }

    public final void L(d dVar) {
        int iIndexOfKey = this.j.indexOfKey(dVar.m());
        if (iIndexOfKey >= 0) {
            this.j.valueAt(iIndexOfKey).z(null);
            this.j.removeAt(iIndexOfKey);
        }
    }

    public final void P(int i) {
        if (i != m()) {
            this.f2680k = i;
            this.l = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i + " cannot use the same id as the graph " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator<d> iterator() {
        return new a();
    }

    @Override // androidx.navigation.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String k() {
        return m() != 0 ? super.k() : "the root navigation";
    }

    @Override // androidx.navigation.d
    public d.a t(hig higVar) {
        d.a aVarT = super.t(higVar);
        Iterator<d> it = iterator();
        while (it.hasNext()) {
            d.a aVarT2 = it.next().t(higVar);
            if (aVarT2 != null && (aVarT == null || aVarT2.compareTo(aVarT) > 0)) {
                aVarT = aVarT2;
            }
        }
        return aVarT;
    }

    @Override // androidx.navigation.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        d dVarF = F(I());
        if (dVarF == null) {
            String str = this.l;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f2680k));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(dVarF.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // androidx.navigation.d
    public void u(Context context, AttributeSet attributeSet) {
        super.u(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, y5j.y);
        P(typedArrayObtainAttributes.getResourceId(y5j.z, 0));
        this.l = d.l(context, this.f2680k);
        typedArrayObtainAttributes.recycle();
    }
}
