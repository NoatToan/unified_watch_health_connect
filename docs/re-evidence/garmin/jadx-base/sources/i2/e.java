package i2;

import h4.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li2/e;", "Lh4/r$c;", "Li2/a;", "requester", "<init>", "(Li2/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f87125a;

    public e(a aVar) {
        this.f87125a = aVar;
    }

    public final void U1(a aVar) {
        a aVar2 = this.f87125a;
        if (aVar2 instanceof c) {
            ((c) aVar2).f87117a.j(this);
        }
        if (aVar instanceof c) {
            ((c) aVar).f87117a.b(this);
        }
        this.f87125a = aVar;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        U1(this.f87125a);
    }

    @Override // h4.r.c
    public final void onDetach() {
        a aVar = this.f87125a;
        if (aVar instanceof c) {
            ((c) aVar).f87117a.j(this);
        }
    }
}
