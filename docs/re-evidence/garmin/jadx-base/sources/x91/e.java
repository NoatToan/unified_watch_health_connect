package x91;

import p005kotlin.Unit;
import p3.o1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f189604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f189605c;

    public /* synthetic */ e(o1 o1Var, p1 p1Var, int i14) {
        this.f189603a = i14;
        this.f189604b = o1Var;
        this.f189605c = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Long l14 = (Long) obj;
        switch (this.f189603a) {
            case 0:
                long jLongValue = l14.longValue();
                ((q91.d) obj2).getClass();
                this.f189604b.k(jLongValue);
                this.f189605c.setValue(Boolean.TRUE);
                break;
            default:
                long jLongValue2 = l14.longValue();
                ((q91.d) obj2).getClass();
                this.f189604b.k(jLongValue2);
                this.f189605c.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
