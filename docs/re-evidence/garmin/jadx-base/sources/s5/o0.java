package s5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls5/o0;", "", "", "capacity", "<init>", "(I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.c0<i, q0> f157260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f157261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f157262c;

    public o0(int i14) {
        this.f157260a = i14 != 1 ? new p1.c0<>(i14) : null;
    }

    public o0() {
        this(0, 1, null);
    }

    public /* synthetic */ o0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 8 : i14);
    }
}
