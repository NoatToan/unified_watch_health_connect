package c5;

import g6.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc5/e;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24464a = new b();

    public final long a(long j8) {
        b bVar = this.f24464a;
        bVar.getClass();
        if (s.c(j8) <= 0.0f || s.d(j8) <= 0.0f) {
            e5.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) s.h(j8)));
        }
        return xy2.b.h(bVar.f24447a.b(s.c(j8)), bVar.f24448b.b(s.d(j8)));
    }
}
