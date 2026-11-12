package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface m0 {

    public static class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<z> f10545a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10546b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.m0$a$a, reason: collision with other inner class name */
        public class C0148a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SparseIntArray f10547a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SparseIntArray f10548b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final z f10549c;

            public C0148a(z zVar) {
                this.f10549c = zVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public final int a(int i14) {
                SparseIntArray sparseIntArray = this.f10547a;
                int iIndexOfKey = sparseIntArray.indexOfKey(i14);
                if (iIndexOfKey > -1) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                a aVar = a.this;
                int i15 = aVar.f10546b;
                aVar.f10546b = i15 + 1;
                aVar.f10545a.put(i15, this.f10549c);
                sparseIntArray.put(i14, i15);
                this.f10548b.put(i15, i14);
                return i15;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public final int b(int i14) {
                SparseIntArray sparseIntArray = this.f10548b;
                int iIndexOfKey = sparseIntArray.indexOfKey(i14);
                if (iIndexOfKey >= 0) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                fb1.c.y(b71.i.i(i14, "requested global type ", " does not belong to the adapter:"), this.f10549c.f10702c);
                return 0;
            }
        }

        @Override // androidx.recyclerview.widget.m0
        public final z a(int i14) {
            z zVar = this.f10545a.get(i14);
            if (zVar != null) {
                return zVar;
            }
            vb.h.s(am.j.h(i14, "Cannot find the wrapper for global view type "));
            return null;
        }

        @Override // androidx.recyclerview.widget.m0
        public final c b(z zVar) {
            return new C0148a(zVar);
        }
    }

    public static class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<List<z>> f10551a = new SparseArray<>();

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f10552a;

            public a(z zVar) {
                this.f10552a = zVar;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public final int a(int i14) {
                b bVar = b.this;
                List<z> arrayList = bVar.f10551a.get(i14);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    bVar.f10551a.put(i14, arrayList);
                }
                z zVar = this.f10552a;
                if (!arrayList.contains(zVar)) {
                    arrayList.add(zVar);
                }
                return i14;
            }

            @Override // androidx.recyclerview.widget.m0.c
            public final int b(int i14) {
                return i14;
            }
        }

        @Override // androidx.recyclerview.widget.m0
        public final z a(int i14) {
            List<z> list = this.f10551a.get(i14);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            vb.h.s(am.j.h(i14, "Cannot find the wrapper for global view type "));
            return null;
        }

        @Override // androidx.recyclerview.widget.m0
        public final c b(z zVar) {
            return new a(zVar);
        }
    }

    public interface c {
        int a(int i14);

        int b(int i14);
    }

    z a(int i14);

    c b(z zVar);
}
