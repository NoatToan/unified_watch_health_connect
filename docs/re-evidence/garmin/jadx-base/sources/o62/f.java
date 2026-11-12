package o62;

import kotlin.m3;
import p005kotlin.Unit;
import p006l2.y1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f129661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f129662c;

    public /* synthetic */ f(m4.q qVar, m3 m3Var, int i14) {
        this.f129660a = i14;
        this.f129661b = qVar;
        this.f129662c = m3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f129660a) {
            case 0:
                ((y1) obj).getClass();
                this.f129661b.y(false);
                m3 m3Var = this.f129662c;
                if (m3Var != null) {
                    m3Var.hide();
                }
                break;
            case 1:
                ((y1) obj).getClass();
                this.f129661b.y(false);
                m3 m3Var2 = this.f129662c;
                if (m3Var2 != null) {
                    m3Var2.hide();
                }
                break;
            default:
                this.f129661b.y(false);
                m3 m3Var3 = this.f129662c;
                if (m3Var3 != null) {
                    m3Var3.hide();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
