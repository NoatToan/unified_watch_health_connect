package r0;

import b0.o0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f148723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f148724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.b<Throwable> f148725c;

    public i(b0.l lVar) {
        k7.h.a(lVar.f14008a == 4);
        this.f148723a = lVar.f14011d;
        o0 o0Var = lVar.f14013f;
        Objects.requireNonNull(o0Var);
        this.f148724b = o0Var;
        this.f148725c = lVar.f14014g;
    }
}
