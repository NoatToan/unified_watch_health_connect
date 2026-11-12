package kb0;

import b63.v;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f103763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f103764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f103765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f103766e;

    public /* synthetic */ b(boolean z14, e23.l lVar, e23.l lVar2, p1 p1Var, int i14) {
        this.f103762a = i14;
        this.f103763b = z14;
        this.f103764c = lVar;
        this.f103765d = lVar2;
        this.f103766e = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103762a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                this.f103766e.setValue(mb0.g.NONE);
                v vVar = new v(iIntValue, iIntValue2, 0, 0, 12, null);
                if (this.f103763b) {
                    this.f103764c.invoke(vVar);
                } else {
                    this.f103765d.invoke(vVar);
                }
                break;
            case 1:
                this.f103766e.setValue(mb0.g.NONE);
                (this.f103763b ? this.f103764c : this.f103765d).invoke(new v(iIntValue, iIntValue2, 0, 0, 12, null));
                break;
            case 2:
                this.f103766e.setValue(mb0.g.NONE);
                v vVar2 = new v(iIntValue, iIntValue2, 0, 0, 12, null);
                if (this.f103763b) {
                    this.f103764c.invoke(vVar2);
                } else {
                    this.f103765d.invoke(vVar2);
                }
                break;
            default:
                this.f103766e.setValue(mb0.g.NONE);
                v vVar3 = new v(iIntValue, iIntValue2, 0, 0, 12, null);
                if (this.f103763b) {
                    this.f103764c.invoke(vVar3);
                } else {
                    this.f103765d.invoke(vVar3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
