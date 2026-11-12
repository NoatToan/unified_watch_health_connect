package m4;

import h5.o1;
import p005kotlin.Metadata;
import p1.i1;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm4/o;", "", "Lm4/u;", "focusOwner", "Lh5/o1;", "owner", "<init>", "(Lm4/u;Lh5/o1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f116506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f116507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0<j0> f116508c = i1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0<k> f116509d = i1.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f116510e;

    public o(u uVar, o1 o1Var) {
        this.f116506a = uVar;
        this.f116507b = o1Var;
    }

    public final void a() {
        if (this.f116510e) {
            return;
        }
        this.f116507b.C(new n(this));
        this.f116510e = true;
    }
}
