package p40;

import am.e1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f135660b;

    public /* synthetic */ f0(h0 h0Var, int i14) {
        this.f135659a = i14;
        this.f135660b = h0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f135659a) {
            case 0:
                h0 h0Var = this.f135660b;
                e1 e1Var = h0Var.f135672m;
                if (e1Var != null) {
                    t0 t0Var = h0Var.f135668i;
                    if (t0Var == null) {
                        p005kotlin.jvm.internal.s.m("pointDetailViewHolder");
                        throw null;
                    }
                    q40.b bVar = t0Var.f135759b;
                    if (bVar == null) {
                        p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
                        throw null;
                    }
                    e1Var.invoke(bVar);
                }
                return Unit.INSTANCE;
            default:
                ak0.m mVar = this.f135660b.f135671l;
                if (mVar != null) {
                    mVar.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
