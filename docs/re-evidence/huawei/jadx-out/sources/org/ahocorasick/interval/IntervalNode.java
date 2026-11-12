package org.ahocorasick.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class IntervalNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntervalNode f44403b;
    private List<Intervalable> d = new ArrayList();
    private IntervalNode e;

    enum Direction {
        LEFT,
        RIGHT
    }

    public IntervalNode(List<Intervalable> list) {
        this.f44403b = null;
        this.e = null;
        this.f44402a = d(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Intervalable intervalable : list) {
            if (intervalable.getEnd() < this.f44402a) {
                arrayList.add(intervalable);
            } else if (intervalable.getStart() > this.f44402a) {
                arrayList2.add(intervalable);
            } else {
                this.d.add(intervalable);
            }
        }
        if (arrayList.size() > 0) {
            this.f44403b = new IntervalNode(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.e = new IntervalNode(arrayList2);
        }
    }

    public int d(List<Intervalable> list) {
        int i = -1;
        int i2 = -1;
        for (Intervalable intervalable : list) {
            int start = intervalable.getStart();
            int end = intervalable.getEnd();
            if (i == -1 || start < i) {
                i = start;
            }
            if (i2 == -1 || end > i2) {
                i2 = end;
            }
        }
        return (i + i2) / 2;
    }

    public List<Intervalable> d(Intervalable intervalable) {
        ArrayList arrayList = new ArrayList();
        if (this.f44402a < intervalable.getStart()) {
            b(intervalable, arrayList, b(this.e, intervalable));
            b(intervalable, arrayList, a(intervalable));
            return arrayList;
        }
        if (this.f44402a > intervalable.getEnd()) {
            b(intervalable, arrayList, b(this.f44403b, intervalable));
            b(intervalable, arrayList, b(intervalable));
            return arrayList;
        }
        b(intervalable, arrayList, this.d);
        b(intervalable, arrayList, b(this.f44403b, intervalable));
        b(intervalable, arrayList, b(this.e, intervalable));
        return arrayList;
    }

    protected void b(Intervalable intervalable, List<Intervalable> list, List<Intervalable> list2) {
        for (Intervalable intervalable2 : list2) {
            if (!intervalable2.equals(intervalable)) {
                list.add(intervalable2);
            }
        }
    }

    protected List<Intervalable> b(Intervalable intervalable) {
        return c(intervalable, Direction.LEFT);
    }

    protected List<Intervalable> a(Intervalable intervalable) {
        return c(intervalable, Direction.RIGHT);
    }

    protected List<Intervalable> c(Intervalable intervalable, Direction direction) {
        ArrayList arrayList = new ArrayList();
        for (Intervalable intervalable2 : this.d) {
            int i = AnonymousClass5.e[direction.ordinal()];
            if (i == 1) {
                if (intervalable2.getStart() <= intervalable.getEnd()) {
                    arrayList.add(intervalable2);
                }
            } else if (i == 2 && intervalable2.getEnd() >= intervalable.getStart()) {
                arrayList.add(intervalable2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: org.ahocorasick.interval.IntervalNode$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Direction.values().length];
            e = iArr;
            try {
                iArr[Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected List<Intervalable> b(IntervalNode intervalNode, Intervalable intervalable) {
        if (intervalNode != null) {
            return intervalNode.d(intervalable);
        }
        return Collections.EMPTY_LIST;
    }
}
