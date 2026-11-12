package m4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm4/f0;", "Lm4/e0;", "Lh4/r$c;", "Lm4/b0;", "focusRequester", "<init>", "(Lm4/b0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends h4.r.c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f116465a;

    public f0(b0 b0Var) {
        this.f116465a = b0Var;
    }

    @Override // h4.r.c
    public final void onAttach() {
        super.onAttach();
        this.f116465a.f116455a.b(this);
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f116465a.f116455a.j(this);
        super.onDetach();
    }
}
