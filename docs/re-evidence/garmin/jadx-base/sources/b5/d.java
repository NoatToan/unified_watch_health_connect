package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lb5/d;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "Lb5/a0;", "change", "(Lb5/a0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f15772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15774c;

    public /* synthetic */ d(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public d(a0 a0Var) {
        this(a0Var.f15763p, a0Var.f15762o);
        this.f15772a = a0Var;
    }

    public d(boolean z14, boolean z15) {
        this.f15773b = z14;
        this.f15774c = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
