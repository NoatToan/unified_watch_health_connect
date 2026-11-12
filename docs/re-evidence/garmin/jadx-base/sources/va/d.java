package va;

import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<yb.c> f176556a = new ArrayList<>();

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // va.a
    public final boolean a(yb.c cVar, long j8) {
        boolean z14;
        long j14 = cVar.f195639b;
        fa.a.a(j14 != C.TIME_UNSET);
        if (j14 <= j8) {
            long j15 = cVar.f195641d;
            if (j15 == C.TIME_UNSET || j8 < j15) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        ArrayList<yb.c> arrayList = this.f176556a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j14 >= arrayList.get(size).f195639b) {
                arrayList.add(size + 1, cVar);
                return z14;
            }
            if (arrayList.get(size).f195639b <= j8) {
                z14 = false;
            }
        }
        arrayList.add(0, cVar);
        return z14;
    }

    @Override // va.a
    public final ImmutableList<ea.a> b(long j8) {
        int iF = f(j8);
        if (iF == 0) {
            return ImmutableList.of();
        }
        yb.c cVar = this.f176556a.get(iF - 1);
        long j14 = cVar.f195641d;
        return (j14 == C.TIME_UNSET || j8 < j14) ? cVar.f195638a : ImmutableList.of();
    }

    @Override // va.a
    public final long c(long j8) {
        ArrayList<yb.c> arrayList = this.f176556a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j8 < arrayList.get(0).f195639b) {
            return arrayList.get(0).f195639b;
        }
        for (int i14 = 1; i14 < arrayList.size(); i14++) {
            yb.c cVar = arrayList.get(i14);
            long j14 = cVar.f195639b;
            long j15 = cVar.f195639b;
            if (j8 < j14) {
                long j16 = arrayList.get(i14 - 1).f195641d;
                return (j16 == C.TIME_UNSET || j16 <= j8 || j16 >= j15) ? j15 : j16;
            }
        }
        long j17 = ((yb.c) Iterables.getLast(arrayList)).f195641d;
        if (j17 == C.TIME_UNSET || j8 >= j17) {
            return Long.MIN_VALUE;
        }
        return j17;
    }

    @Override // va.a
    public final void clear() {
        this.f176556a.clear();
    }

    @Override // va.a
    public final void d(long j8) {
        int iF = f(j8);
        if (iF == 0) {
            return;
        }
        ArrayList<yb.c> arrayList = this.f176556a;
        long j14 = arrayList.get(iF - 1).f195641d;
        if (j14 == C.TIME_UNSET || j14 >= j8) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    @Override // va.a
    public final long e(long j8) {
        ArrayList<yb.c> arrayList = this.f176556a;
        if (arrayList.isEmpty() || j8 < arrayList.get(0).f195639b) {
            return C.TIME_UNSET;
        }
        for (int i14 = 1; i14 < arrayList.size(); i14++) {
            long j14 = arrayList.get(i14).f195639b;
            if (j8 == j14) {
                return j14;
            }
            if (j8 < j14) {
                yb.c cVar = arrayList.get(i14 - 1);
                long j15 = cVar.f195641d;
                return (j15 == C.TIME_UNSET || j15 > j8) ? cVar.f195639b : j15;
            }
        }
        yb.c cVar2 = (yb.c) Iterables.getLast(arrayList);
        long j16 = cVar2.f195641d;
        return (j16 == C.TIME_UNSET || j8 < j16) ? cVar2.f195639b : j16;
    }

    public final int f(long j8) {
        int i14 = 0;
        while (true) {
            ArrayList<yb.c> arrayList = this.f176556a;
            if (i14 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j8 < arrayList.get(i14).f195639b) {
                return i14;
            }
            i14++;
        }
    }
}
