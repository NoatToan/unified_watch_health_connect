package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import defpackage.cig;
import defpackage.hig;
import defpackage.y5j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final HashMap<String, Class<?>> i = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f2677b;
    public int c;
    public String d;
    public CharSequence e;
    public ArrayList<c> f;
    public SparseArrayCompat<cig> g;
    public HashMap<String, b> h;

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f2679b;
        public final boolean c;
        public final boolean d;
        public final int e;

        public a(d dVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.f2678a = dVar;
            this.f2679b = bundle;
            this.c = z;
            this.d = z2;
            this.e = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z = this.c;
            if (z && !aVar.c) {
                return 1;
            }
            if (!z && aVar.c) {
                return -1;
            }
            Bundle bundle = this.f2679b;
            if (bundle != null && aVar.f2679b == null) {
                return 1;
            }
            if (bundle == null && aVar.f2679b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f2679b.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.d;
            if (z2 && !aVar.d) {
                return 1;
            }
            if (z2 || !aVar.d) {
                return this.e - aVar.e;
            }
            return -1;
        }

        public d b() {
            return this.f2678a;
        }

        public Bundle c() {
            return this.f2679b;
        }
    }

    public d(i<? extends d> iVar) {
        this(j.c(iVar.getClass()));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String l(Context context, int i2) {
        if (i2 <= 16777215) {
            return Integer.toString(i2);
        }
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i2);
        }
    }

    public boolean A() {
        return true;
    }

    public final void e(String str, b bVar) {
        if (this.h == null) {
            this.h = new HashMap<>();
        }
        this.h.put(str, bVar);
    }

    public final void f(c cVar) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.f.add(cVar);
    }

    public Bundle g(Bundle bundle) {
        HashMap<String, b> map;
        if (bundle == null && ((map = this.h) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, b> map2 = this.h;
        if (map2 != null) {
            for (Map.Entry<String, b> entry : map2.entrySet()) {
                entry.getValue().c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, b> map3 = this.h;
            if (map3 != null) {
                for (Map.Entry<String, b> entry2 : map3.entrySet()) {
                    if (!entry2.getValue().d(entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().a().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] h() {
        ArrayDeque arrayDeque = new ArrayDeque();
        d dVar = this;
        while (true) {
            e eVarR = dVar.r();
            if (eVarR == null || eVarR.I() != dVar.m()) {
                arrayDeque.addFirst(dVar);
            }
            if (eVarR == null) {
                break;
            }
            dVar = eVarR;
        }
        int[] iArr = new int[arrayDeque.size()];
        Iterator it = arrayDeque.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((d) it.next()).m();
            i2++;
        }
        return iArr;
    }

    public final cig i(int i2) {
        SparseArrayCompat<cig> sparseArrayCompat = this.g;
        cig cigVar = sparseArrayCompat == null ? null : sparseArrayCompat.get(i2);
        if (cigVar != null) {
            return cigVar;
        }
        if (r() != null) {
            return r().i(i2);
        }
        return null;
    }

    public final Map<String, b> j() {
        HashMap<String, b> map = this.h;
        return map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String k() {
        if (this.d == null) {
            this.d = Integer.toString(this.c);
        }
        return this.d;
    }

    public final int m() {
        return this.c;
    }

    public final CharSequence o() {
        return this.e;
    }

    public final String q() {
        return this.f2676a;
    }

    public final e r() {
        return this.f2677b;
    }

    public a t(hig higVar) {
        ArrayList<c> arrayList = this.f;
        if (arrayList == null) {
            return null;
        }
        a aVar = null;
        for (c cVar : arrayList) {
            Uri uriC = higVar.c();
            Bundle bundleC = uriC != null ? cVar.c(uriC, j()) : null;
            String strA = higVar.a();
            boolean z = strA != null && strA.equals(cVar.b());
            String strB = higVar.b();
            int iD = strB != null ? cVar.d(strB) : -1;
            if (bundleC != null || z || iD > -1) {
                a aVar2 = new a(this, bundleC, cVar.e(), z, iD);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.d;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.c));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.e != null) {
            sb.append(" label=");
            sb.append(this.e);
        }
        return sb.toString();
    }

    public void u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, y5j.A);
        w(typedArrayObtainAttributes.getResourceId(y5j.C, 0));
        this.d = l(context, this.c);
        x(typedArrayObtainAttributes.getText(y5j.B));
        typedArrayObtainAttributes.recycle();
    }

    public final void v(int i2, cig cigVar) {
        if (A()) {
            if (i2 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.g == null) {
                this.g = new SparseArrayCompat<>();
            }
            this.g.put(i2, cigVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void w(int i2) {
        this.c = i2;
        this.d = null;
    }

    public final void x(CharSequence charSequence) {
        this.e = charSequence;
    }

    public final void z(e eVar) {
        this.f2677b = eVar;
    }

    public d(String str) {
        this.f2676a = str;
    }
}
