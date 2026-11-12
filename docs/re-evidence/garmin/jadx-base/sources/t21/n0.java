package t21;

import kotlin.m3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f161934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f161935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f161936d;

    public /* synthetic */ n0(m4.q qVar, m3 m3Var, e23.a aVar, int i14) {
        this.f161933a = i14;
        this.f161934b = qVar;
        this.f161935c = m3Var;
        this.f161936d = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f161933a) {
            case 0:
                this.f161934b.y(false);
                m3 m3Var = this.f161935c;
                if (m3Var != null) {
                    m3Var.hide();
                }
                this.f161936d.invoke();
                break;
            case 1:
                this.f161934b.y(false);
                m3 m3Var2 = this.f161935c;
                if (m3Var2 != null) {
                    m3Var2.hide();
                }
                this.f161936d.invoke();
                break;
            default:
                this.f161934b.y(false);
                m3 m3Var3 = this.f161935c;
                if (m3Var3 != null) {
                    m3Var3.hide();
                }
                this.f161936d.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
