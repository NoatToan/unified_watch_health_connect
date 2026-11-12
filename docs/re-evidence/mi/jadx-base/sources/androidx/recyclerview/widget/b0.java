package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {

    public static class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<q> f2858a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2859b = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.b0$a$a, reason: collision with other inner class name */
        public class C0067a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public SparseIntArray f2860a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public SparseIntArray f2861b = new SparseIntArray(1);
            public final q c;

            public C0067a(q qVar) {
                this.c = qVar;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int a(int i) {
                int iIndexOfKey = this.f2860a.indexOfKey(i);
                if (iIndexOfKey > -1) {
                    return this.f2860a.valueAt(iIndexOfKey);
                }
                int iC = a.this.c(this.c);
                this.f2860a.put(i, iC);
                this.f2861b.put(iC, i);
                return iC;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int b(int i) {
                int iIndexOfKey = this.f2861b.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    return this.f2861b.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.c.c);
            }
        }

        @Override // androidx.recyclerview.widget.b0
        public q a(int i) {
            q qVar = this.f2858a.get(i);
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.b0
        public c b(q qVar) {
            return new C0067a(qVar);
        }

        public int c(q qVar) {
            int i = this.f2859b;
            this.f2859b = i + 1;
            this.f2858a.put(i, qVar);
            return i;
        }
    }

    public static class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<List<q>> f2862a = new SparseArray<>();

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f2863a;

            public a(q qVar) {
                this.f2863a = qVar;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int a(int i) {
                List<q> arrayList = b.this.f2862a.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.this.f2862a.put(i, arrayList);
                }
                if (!arrayList.contains(this.f2863a)) {
                    arrayList.add(this.f2863a);
                }
                return i;
            }

            @Override // androidx.recyclerview.widget.b0.c
            public int b(int i) {
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.b0
        public q a(int i) {
            List<q> list = this.f2862a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.b0
        public c b(q qVar) {
            return new a(qVar);
        }
    }

    public interface c {
        int a(int i);

        int b(int i);
    }

    q a(int i);

    c b(q qVar);
}
