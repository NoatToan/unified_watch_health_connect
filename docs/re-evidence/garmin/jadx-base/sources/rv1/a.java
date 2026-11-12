package rv1;

import java.util.List;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f154698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f154699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f154700d;

    public /* synthetic */ a(List list, p1 p1Var, p1 p1Var2, int i14) {
        this.f154697a = i14;
        this.f154698b = list;
        this.f154699c = p1Var;
        this.f154700d = p1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f154697a) {
            case 0:
                int iIntValue = num.intValue();
                this.f154699c.setValue(num);
                this.f154700d.setValue((yw1.b) this.f154698b.get(iIntValue));
                break;
            case 1:
                int iIntValue2 = num.intValue();
                this.f154699c.setValue(num);
                this.f154700d.setValue((yw1.m) this.f154698b.get(iIntValue2));
                break;
            case 2:
                int iIntValue3 = num.intValue();
                this.f154699c.setValue(num);
                this.f154700d.setValue((yw1.p) this.f154698b.get(iIntValue3));
                break;
            default:
                int iIntValue4 = num.intValue();
                this.f154699c.setValue(num);
                this.f154700d.setValue((k23.d) this.f154698b.get(iIntValue4));
                break;
        }
        return Unit.INSTANCE;
    }
}
