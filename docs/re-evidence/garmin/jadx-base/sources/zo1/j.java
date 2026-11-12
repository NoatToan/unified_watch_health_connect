package zo1;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f206383b;

    public /* synthetic */ j(q qVar, int i14) {
        this.f206382a = i14;
        this.f206383b = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f206382a) {
            case 0:
                q qVar = this.f206383b;
                qVar.getClass();
                ge1.b.T(v1.a(qVar), null, null, new u(qVar, null), 3);
                break;
            default:
                q qVar2 = this.f206383b;
                qVar2.getClass();
                ge1.b.T(v1.a(qVar2), null, null, new t(qVar2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
