package ga;

import fa.r;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76504a;

    /* JADX INFO: renamed from: ga.b$b, reason: collision with other inner class name */
    public static final class C1537b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f76506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f76507d;

        public C1537b(int i14, long j8) {
            super(i14);
            this.f76505b = j8;
            this.f76506c = new ArrayList();
            this.f76507d = new ArrayList();
        }

        public final C1537b b(int i14) {
            ArrayList arrayList = this.f76507d;
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                C1537b c1537b = (C1537b) arrayList.get(i15);
                if (c1537b.f76504a == i14) {
                    return c1537b;
                }
            }
            return null;
        }

        public final c c(int i14) {
            ArrayList arrayList = this.f76506c;
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                c cVar = (c) arrayList.get(i15);
                if (cVar.f76504a == i14) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // ga.b
        public final String toString() {
            return b.a(this.f76504a) + " leaves: " + Arrays.toString(this.f76506c.toArray()) + " containers: " + Arrays.toString(this.f76507d.toArray());
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f76508b;

        public c(int i14, r rVar) {
            super(i14);
            this.f76508b = rVar;
        }
    }

    private b(int i14) {
        this.f76504a = i14;
    }

    public static String a(int i14) {
        return "" + ((char) ((i14 >> 24) & 255)) + ((char) ((i14 >> 16) & 255)) + ((char) ((i14 >> 8) & 255)) + ((char) (i14 & 255));
    }

    public String toString() {
        return a(this.f76504a);
    }
}
