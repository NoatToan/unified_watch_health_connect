package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/b2;", "Lh4/r$c;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 extends h4.r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81697a;

    public b2() {
        setAggregateChildKindSet$ui(0);
    }

    @Override // h4.r.c
    public final void onAttach() {
        this.f81697a = true;
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f81697a = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
