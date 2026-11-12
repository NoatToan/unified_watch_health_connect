package androidx.media3.common;

import android.util.SparseBooleanArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f8347a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f8348a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8349b;

        @CanIgnoreReturnValue
        public final void a(int i14) {
            fa.a.d(!this.f8349b);
            this.f8348a.append(i14, true);
        }

        public final o b() {
            fa.a.d(!this.f8349b);
            this.f8349b = true;
            return new o(this.f8348a);
        }
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f8347a = sparseBooleanArray;
    }

    public final int a(int i14) {
        SparseBooleanArray sparseBooleanArray = this.f8347a;
        fa.a.c(i14, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        SparseBooleanArray sparseBooleanArray = oVar.f8347a;
        int i14 = fa.z.f70071a;
        SparseBooleanArray sparseBooleanArray2 = this.f8347a;
        if (i14 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i15 = 0; i15 < sparseBooleanArray2.size(); i15++) {
            if (a(i15) != oVar.a(i15)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i14 = fa.z.f70071a;
        SparseBooleanArray sparseBooleanArray = this.f8347a;
        if (i14 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i15 = 0; i15 < sparseBooleanArray.size(); i15++) {
            size = (size * 31) + a(i15);
        }
        return size;
    }
}
