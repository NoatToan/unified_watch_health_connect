package kb0;

import java.util.List;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f103802b;

    public /* synthetic */ k(p1 p1Var, int i14) {
        this.f103801a = i14;
        this.f103802b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f103801a) {
            case 0:
                this.f103802b.setValue(mb0.g.BED_TIME);
                return Unit.INSTANCE;
            case 1:
                this.f103802b.setValue(mb0.g.WAKE_TIME);
                return Unit.INSTANCE;
            case 2:
                this.f103802b.setValue(mb0.g.NONE);
                return Unit.INSTANCE;
            case 3:
                this.f103802b.setValue(mb0.g.BED_TIME);
                return Unit.INSTANCE;
            case 4:
                this.f103802b.setValue(mb0.g.WAKE_TIME);
                return Unit.INSTANCE;
            case 5:
                this.f103802b.setValue(mb0.g.NONE);
                return Unit.INSTANCE;
            case 6:
                this.f103802b.setValue(mb0.g.BED_TIME);
                return Unit.INSTANCE;
            case 7:
                this.f103802b.setValue(mb0.g.WAKE_TIME);
                return Unit.INSTANCE;
            case 8:
                this.f103802b.setValue(mb0.g.NONE);
                return Unit.INSTANCE;
            case 9:
                p1 p1Var = this.f103802b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 10:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 12:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 16:
                this.f103802b.setValue(lv0.a.c.f115044a);
                return Unit.INSTANCE;
            case 17:
                this.f103802b.setValue(lv0.a.c.f115044a);
                return Unit.INSTANCE;
            case 18:
                this.f103802b.setValue(lv0.a.c.f115044a);
                return Unit.INSTANCE;
            case 19:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 20:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 22:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 24:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 26:
                p1 p1Var2 = this.f103802b;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 27:
                p1 p1Var3 = this.f103802b;
                if (p1Var3 != null) {
                    return (List) p1Var3.getF182175a();
                }
                return null;
            case 28:
                this.f103802b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                this.f103802b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
