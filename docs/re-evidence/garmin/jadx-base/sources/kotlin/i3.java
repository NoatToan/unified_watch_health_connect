package kotlin;

import h5.p1;
import java.util.List;
import p5.n;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li5/i3;", "Lh5/p1;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Lp5/n;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lp5/n;Lp5/n;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i3> f91209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f91210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f91211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f91212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f91213f;

    public i3(int i14, List<i3> list, Float f14, Float f15, n nVar, n nVar2) {
        this.f91208a = i14;
        this.f91209b = list;
        this.f91210c = f14;
        this.f91211d = f15;
        this.f91212e = nVar;
        this.f91213f = nVar2;
    }

    @Override // h5.p1
    public final boolean X0() {
        return this.f91209b.contains(this);
    }
}
