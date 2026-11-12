package y71;

import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly71/b;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f194694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f194695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f194696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f194697d;

    public b() {
        p2 p2VarA = q2.a(0);
        this.f194694a = p2VarA;
        this.f194695b = s.d(p2VarA);
        p2 p2VarA2 = q2.a(0);
        this.f194696c = p2VarA2;
        this.f194697d = s.d(p2VarA2);
    }

    public final void a(int i14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f194694a;
            value = p2Var.getValue();
            ((Number) value).intValue();
        } while (!p2Var.b(value, Integer.valueOf(i14)));
    }
}
