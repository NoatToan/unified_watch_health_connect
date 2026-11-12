package zb;

import java.util.Collections;
import java.util.List;
import yb.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ea.a> f203413a;

    public d(List<ea.a> list) {
        this.f203413a = list;
    }

    @Override // yb.i
    public final List<ea.a> getCues(long j8) {
        return j8 >= 0 ? this.f203413a : Collections.EMPTY_LIST;
    }

    @Override // yb.i
    public final long getEventTime(int i14) {
        fa.a.a(i14 == 0);
        return 0L;
    }

    @Override // yb.i
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // yb.i
    public final int getNextEventTimeIndex(long j8) {
        return j8 < 0 ? 0 : -1;
    }
}
