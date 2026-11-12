package o72;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f130693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130695d;

    public /* synthetic */ y2(Context context, p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f130692a = i14;
        this.f130693b = context;
        this.f130694c = p1Var;
        this.f130695d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f130692a) {
            case 0:
                r1.c(this.f130693b, "CANCEL - " + ((String) this.f130694c.getF182175a()));
                this.f130695d.setValue(Boolean.FALSE);
                break;
            case 1:
                r1.c(this.f130693b, "Action1 - " + ((String) this.f130694c.getF182175a()));
                this.f130695d.setValue(Boolean.FALSE);
                break;
            case 2:
                r1.c(this.f130693b, "Action2 - " + ((String) this.f130694c.getF182175a()));
                this.f130695d.setValue(Boolean.FALSE);
                break;
            default:
                this.f130694c.setValue(Boolean.FALSE);
                this.f130695d.setValue("");
                u3.b(this.f130693b, "Closed Search Header");
                break;
        }
        return Unit.INSTANCE;
    }
}
