package yb;

import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ordering<c> f195642c = Ordering.natural().onResultOf(new androidx.media3.common.p(22));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<ImmutableList<ea.a>> f195643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f195644b;

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<c> list) {
        if (list.size() == 1) {
            c cVar = (c) Iterables.getOnlyElement(list);
            long j8 = cVar.f195639b;
            long j14 = cVar.f195640c;
            long j15 = j8 == C.TIME_UNSET ? 0L : j8;
            ImmutableList<ea.a> immutableList = cVar.f195638a;
            if (j14 == C.TIME_UNSET) {
                this.f195643a = ImmutableList.of(immutableList);
                this.f195644b = new long[]{j15};
                return;
            } else {
                this.f195643a = ImmutableList.of((ImmutableList) immutableList, ImmutableList.of());
                this.f195644b = new long[]{j15, j14 + j15};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f195644b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f195642c, list);
        int i14 = 0;
        for (int i15 = 0; i15 < immutableListSortedCopyOf.size(); i15++) {
            c cVar2 = (c) immutableListSortedCopyOf.get(i15);
            long j16 = cVar2.f195639b;
            long j17 = cVar2.f195640c;
            ImmutableList<ea.a> immutableList2 = cVar2.f195638a;
            j16 = j16 == C.TIME_UNSET ? 0L : j16;
            long j18 = j16 + j17;
            if (i14 != 0) {
                int i16 = i14 - 1;
                long j19 = this.f195644b[i16];
                if (j19 < j16) {
                    this.f195644b[i14] = j16;
                    arrayList.add(immutableList2);
                    i14++;
                } else if (j19 == j16 && ((ImmutableList) arrayList.get(i16)).isEmpty()) {
                    arrayList.set(i16, immutableList2);
                } else {
                    fa.k.g("Truncating unsupported overlapping cues.");
                    this.f195644b[i16] = j16;
                    arrayList.set(i16, immutableList2);
                }
            } else {
                this.f195644b[i14] = j16;
                arrayList.add(immutableList2);
                i14++;
            }
            if (j17 != C.TIME_UNSET) {
                this.f195644b[i14] = j18;
                arrayList.add(ImmutableList.of());
                i14++;
            }
        }
        this.f195643a = ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // yb.i
    public final List getCues(long j8) {
        int iE = z.e(this.f195644b, j8, false);
        return iE == -1 ? ImmutableList.of() : this.f195643a.get(iE);
    }

    @Override // yb.i
    public final long getEventTime(int i14) {
        fa.a.a(i14 < this.f195643a.size());
        return this.f195644b[i14];
    }

    @Override // yb.i
    public final int getEventTimeCount() {
        return this.f195643a.size();
    }

    @Override // yb.i
    public final int getNextEventTimeIndex(long j8) {
        int iA = z.a(this.f195644b, j8, false);
        if (iA < this.f195643a.size()) {
            return iA;
        }
        return -1;
    }
}
