package l40;

import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/e;", "Ll40/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f109906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f109907b;

    public e() {
        d.f109892n.getClass();
        p2 p2VarA = q2.a(d.a.a());
        this.f109906a = p2VarA;
        this.f109907b = s.d(p2VarA);
    }

    @Override // l40.b
    public final void F3(a aVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f109906a;
            value = p2Var.getValue();
            c.f109891a.getClass();
        } while (!p2Var.b(value, c.a((d) value, aVar)));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getX() {
        return this.f109907b;
    }
}
