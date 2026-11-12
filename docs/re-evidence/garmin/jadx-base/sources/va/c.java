package va;

import androidx.media3.common.p;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ordering<yb.c> f176554b = Ordering.natural().onResultOf(new p(15)).compound(Ordering.natural().reverse().onResultOf(new p(16)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f176555a = new ArrayList();

    @Override // va.a
    public final boolean a(yb.c cVar, long j8) {
        long j14 = cVar.f195639b;
        fa.a.a(j14 != C.TIME_UNSET);
        fa.a.a(cVar.f195640c != C.TIME_UNSET);
        boolean z14 = j14 <= j8 && j8 < cVar.f195641d;
        ArrayList arrayList = this.f176555a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j14 >= ((yb.c) arrayList.get(size)).f195639b) {
                arrayList.add(size + 1, cVar);
                return z14;
            }
        }
        arrayList.add(0, cVar);
        return z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // va.a
    public final ImmutableList<ea.a> b(long j8) {
        ArrayList arrayList = this.f176555a;
        if (!arrayList.isEmpty()) {
            if (j8 >= ((yb.c) arrayList.get(0)).f195639b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    yb.c cVar = (yb.c) arrayList.get(i14);
                    if (j8 >= cVar.f195639b && j8 < cVar.f195641d) {
                        arrayList2.add(cVar);
                    }
                    if (j8 < cVar.f195639b) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f176554b, arrayList2);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i15 = 0; i15 < immutableListSortedCopyOf.size(); i15++) {
                    builder.addAll((Iterable) ((yb.c) immutableListSortedCopyOf.get(i15)).f195638a);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }

    @Override // va.a
    public final long c(long j8) {
        int i14 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f176555a;
            if (i14 >= arrayList.size()) {
                break;
            }
            long j14 = ((yb.c) arrayList.get(i14)).f195639b;
            long j15 = ((yb.c) arrayList.get(i14)).f195641d;
            if (j8 < j14) {
                if (jMin != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j14);
                    break;
                }
                jMin = j14;
                break;
            }
            if (j8 < j15) {
                jMin = jMin == C.TIME_UNSET ? j15 : Math.min(jMin, j15);
            }
            i14++;
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // va.a
    public final void clear() {
        this.f176555a.clear();
    }

    @Override // va.a
    public final void d(long j8) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f176555a;
            if (i14 >= arrayList.size()) {
                return;
            }
            long j14 = ((yb.c) arrayList.get(i14)).f195639b;
            if (j8 > j14 && j8 > ((yb.c) arrayList.get(i14)).f195641d) {
                arrayList.remove(i14);
                i14--;
            } else if (j8 < j14) {
                return;
            }
            i14++;
        }
    }

    @Override // va.a
    public final long e(long j8) {
        ArrayList arrayList = this.f176555a;
        if (arrayList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j8 < ((yb.c) arrayList.get(0)).f195639b) {
            return C.TIME_UNSET;
        }
        long jMax = ((yb.c) arrayList.get(0)).f195639b;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j14 = ((yb.c) arrayList.get(i14)).f195639b;
            long j15 = ((yb.c) arrayList.get(i14)).f195641d;
            if (j15 > j8) {
                if (j14 > j8) {
                    break;
                }
                jMax = Math.max(jMax, j14);
            } else {
                jMax = Math.max(jMax, j15);
            }
        }
        return jMax;
    }
}
