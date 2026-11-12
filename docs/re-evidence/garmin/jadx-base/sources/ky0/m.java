package ky0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f107416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f107417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107418d;

    public /* synthetic */ m(e23.l lVar, m4.b0 b0Var, p3.p1 p1Var, int i14) {
        this.f107415a = i14;
        this.f107416b = lVar;
        this.f107417c = b0Var;
        this.f107418d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f107415a) {
            case 0:
                if (((Boolean) this.f107418d.getF182175a()).booleanValue()) {
                    this.f107416b.invoke("");
                } else {
                    m4.b0.a(this.f107417c);
                }
                break;
            case 1:
                if (((Boolean) this.f107418d.getF182175a()).booleanValue()) {
                    this.f107416b.invoke("");
                } else {
                    m4.b0.a(this.f107417c);
                }
                break;
            default:
                if (((Boolean) this.f107418d.getF182175a()).booleanValue()) {
                    this.f107416b.invoke("");
                } else {
                    m4.b0.a(this.f107417c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
