package f92;

import o4.d0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.a4;
import p3.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf92/b;", "", "Lo4/d0;", BooleanUtils.ON, BooleanUtils.OFF, "<init>", "(JJLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f70001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f70002b;

    private b(long j8, long j14) {
        d0 d0VarA = d0.a(j8);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f70001a = new c2(d0VarA, a4Var);
        this.f70002b = new c2(d0.a(j14), a4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((d0) this.f70001a.getF182175a()).f128833a;
    }

    public /* synthetic */ b(long j8, long j14, j jVar) {
        this(j8, j14);
    }
}
