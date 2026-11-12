package au0;

import kotlin.m3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f12957b;

    public /* synthetic */ l(m3 m3Var, int i14) {
        this.f12956a = i14;
        this.f12957b = m3Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f12956a) {
            case 0:
                m3 m3Var = this.f12957b;
                if (m3Var != null) {
                    m3Var.hide();
                }
                break;
            case 1:
                m3 m3Var2 = this.f12957b;
                if (m3Var2 != null) {
                    m3Var2.hide();
                }
                break;
            default:
                m3 m3Var3 = this.f12957b;
                if (m3Var3 != null) {
                    m3Var3.hide();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
