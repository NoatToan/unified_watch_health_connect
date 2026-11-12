package w51;

import android.content.Context;
import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f182304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f182305c;

    public /* synthetic */ m0(q0 q0Var, Context context, int i14) {
        this.f182303a = i14;
        this.f182304b = q0Var;
        this.f182305c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f182303a) {
            case 0:
                this.f182304b.G4();
                Context context = this.f182305c;
                context.startActivity(xy2.b.t(context));
                break;
            default:
                q0 q0Var = this.f182304b;
                q0Var.getClass();
                Context context2 = this.f182305c;
                context2.getClass();
                ge1.b.T(v1.a(q0Var), null, null, new w0(q0Var, context2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
