package h4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh4/m;", "Lh4/r$c;", "Lp3/w;", "map", "<init>", "(Lp3/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p3.w f81571a;

    public m(p3.w wVar) {
        this.f81571a = wVar;
    }

    @Override // h4.r.c
    public final void onAttach() {
        h5.k.g(this).c(this.f81571a);
    }
}
