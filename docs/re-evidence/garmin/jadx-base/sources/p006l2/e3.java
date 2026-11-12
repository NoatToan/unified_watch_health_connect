package p006l2;

import e23.a;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.o2;
import p3.d0;
import p3.p0;
import t13.d;
import u1.k1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/e3;", "Ly1/e3;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e3 implements p008y1.e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p008y1.e3 f108452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f108453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f108454c;

    public e3(p008y1.e3 e3Var, final f3 f3Var) {
        this.f108452a = e3Var;
        final int i14 = 0;
        this.f108453b = p0.f(new a() { // from class: l2.d3
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        f3 f3Var2 = f3Var;
                        return Boolean.valueOf(f3Var2.f108480a.getFloatValue() < f3Var2.f108481b.getFloatValue());
                    default:
                        return Boolean.valueOf(f3Var.f108480a.getFloatValue() > 0.0f);
                }
            }
        });
        final int i15 = 1;
        this.f108454c = p0.f(new a() { // from class: l2.d3
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        f3 f3Var2 = f3Var;
                        return Boolean.valueOf(f3Var2.f108480a.getFloatValue() < f3Var2.f108481b.getFloatValue());
                    default:
                        return Boolean.valueOf(f3Var.f108480a.getFloatValue() > 0.0f);
                }
            }
        });
    }

    @Override // p008y1.e3
    public final boolean a() {
        return this.f108452a.a();
    }

    @Override // p008y1.e3
    public final Object b(k1 k1Var, p<? super o2, ? super d<? super Unit>, ? extends Object> pVar, d<? super Unit> dVar) {
        return this.f108452a.b(k1Var, pVar, dVar);
    }

    @Override // p008y1.e3
    public final boolean c() {
        return ((Boolean) this.f108453b.getF182175a()).booleanValue();
    }

    @Override // p008y1.e3
    public final float d(float f14) {
        return this.f108452a.d(f14);
    }

    @Override // p008y1.e3
    public final boolean e() {
        return ((Boolean) this.f108454c.getF182175a()).booleanValue();
    }
}
