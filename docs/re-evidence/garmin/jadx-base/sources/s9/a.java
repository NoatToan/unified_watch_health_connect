package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls9/a;", "Landroidx/lifecycle/n0;", "<init>", "()V", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f157989a = new o0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.b f157990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0.b f157991c;

    public a() {
        b0.b bVar = b0.b.INITIALIZED;
        this.f157990b = bVar;
        this.f157991c = bVar;
    }

    public final void a() {
        b0.b bVar = this.f157990b.ordinal() < this.f157991c.ordinal() ? this.f157990b : this.f157991c;
        o0 o0Var = this.f157989a;
        if (o0Var.f7973d == b0.b.INITIALIZED && bVar == b0.b.DESTROYED) {
            return;
        }
        o0Var.i(bVar);
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final b0 getF158017a() {
        return this.f157989a;
    }
}
