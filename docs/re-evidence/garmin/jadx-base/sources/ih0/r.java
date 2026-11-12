package ih0;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f93480b;

    public /* synthetic */ r(s sVar, int i14) {
        this.f93479a = i14;
        this.f93480b = sVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        switch (this.f93479a) {
            case 0:
                s sVar = this.f93480b;
                sVar.f93488g = false;
                p2 p2Var = sVar.f93486e;
                do {
                    value = p2Var.getValue();
                    ((t) value).getClass();
                } while (!p2Var.b(value, new t(false)));
                break;
            case 1:
                this.f93480b.z4();
                break;
            case 2:
                this.f93480b.z4();
                break;
            default:
                this.f93480b.z4();
                break;
        }
        return Unit.INSTANCE;
    }
}
