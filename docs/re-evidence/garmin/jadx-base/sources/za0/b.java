package za0;

import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4.a f203231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f203232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f203233d;

    public /* synthetic */ b(a4.a aVar, e23.l lVar, c.q qVar, int i14) {
        this.f203230a = i14;
        this.f203231b = aVar;
        this.f203232c = lVar;
        this.f203233d = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Map map = (Map) obj;
        switch (this.f203230a) {
            case 0:
                map.getClass();
                j22.b.f96736a.getClass();
                int i14 = e.a.f203241a[j22.b.F(map).ordinal()];
                a4.a aVar = this.f203231b;
                if (i14 == 1) {
                    aVar.invoke(Boolean.TRUE);
                } else if (i14 != 2) {
                    aVar.invoke(Boolean.FALSE);
                } else {
                    this.f203232c.invoke(this.f203233d);
                }
                break;
            case 1:
                map.getClass();
                j22.b.f96736a.getClass();
                int i15 = f.a.f203242a[j22.b.F(map).ordinal()];
                a4.a aVar2 = this.f203231b;
                if (i15 == 1) {
                    aVar2.invoke(Boolean.TRUE);
                } else if (i15 != 2) {
                    aVar2.invoke(Boolean.FALSE);
                } else {
                    this.f203232c.invoke(this.f203233d);
                }
                break;
            case 2:
                map.getClass();
                j22.b.f96736a.getClass();
                int i16 = n.a.f203266a[j22.b.D(map).ordinal()];
                a4.a aVar3 = this.f203231b;
                if (i16 == 1) {
                    aVar3.invoke(Boolean.TRUE);
                } else if (i16 != 2) {
                    this.f203232c.invoke(this.f203233d);
                } else {
                    aVar3.invoke(Boolean.FALSE);
                }
                break;
            default:
                map.getClass();
                j22.b.f96736a.getClass();
                int i17 = v.a.f203280a[j22.b.F(map).ordinal()];
                a4.a aVar4 = this.f203231b;
                if (i17 == 1) {
                    aVar4.invoke(Boolean.TRUE);
                } else if (i17 != 2) {
                    aVar4.invoke(Boolean.FALSE);
                } else {
                    this.f203232c.invoke(this.f203233d);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
