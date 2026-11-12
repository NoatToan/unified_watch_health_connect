package b82;

import kotlin.m3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f16587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f16588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f16589d;

    public /* synthetic */ h0(m3 m3Var, m4.b0 b0Var, p3.p1 p1Var, int i14) {
        this.f16586a = i14;
        this.f16587b = m3Var;
        this.f16588c = b0Var;
        this.f16589d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f16586a;
        p3.p1 p1Var = this.f16589d;
        m4.b0 b0Var = this.f16588c;
        m3 m3Var = this.f16587b;
        switch (i14) {
            case 0:
                t0 t0Var = t0.f16792a;
                if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                    m4.b0.a(b0Var);
                } else if (m3Var != null) {
                    m3Var.show();
                }
                break;
            case 1:
                if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                    m4.b0.a(b0Var);
                } else if (m3Var != null) {
                    m3Var.show();
                }
                break;
            case 2:
                p1Var.setValue(Boolean.TRUE);
                if (m3Var != null) {
                    m3Var.show();
                }
                m4.b0.a(b0Var);
                break;
            default:
                if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                    m4.b0.a(b0Var);
                } else if (m3Var != null) {
                    m3Var.show();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
