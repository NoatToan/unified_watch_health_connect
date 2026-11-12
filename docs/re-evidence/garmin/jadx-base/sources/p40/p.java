package p40;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q40.b f135714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f135715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f135716d;

    public /* synthetic */ p(q40.b bVar, e23.l lVar, p1 p1Var, int i14) {
        this.f135713a = i14;
        this.f135714b = bVar;
        this.f135715c = lVar;
        this.f135716d = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f135713a) {
            case 0:
                q40.b bVar = this.f135714b;
                this.f135715c.invoke(new q40.b(bVar.f142574a, bVar.f142575b, bVar.f142576c, bVar.f142577d, bVar.f142578e, bVar.f142579f, bVar.f142580g, str, bVar.f142582i, bVar.f142583j, bVar.f142584k, bVar.f142585l, bVar.f142586m, bVar.f142587n, bVar.f142588o));
                this.f135716d.setValue(Boolean.FALSE);
                break;
            case 1:
                q40.b bVar2 = this.f135714b;
                this.f135715c.invoke(new q40.b(bVar2.f142574a, bVar2.f142575b, bVar2.f142576c, bVar2.f142577d, bVar2.f142578e, bVar2.f142579f, bVar2.f142580g, str, bVar2.f142582i, bVar2.f142583j, bVar2.f142584k, bVar2.f142585l, bVar2.f142586m, bVar2.f142587n, bVar2.f142588o));
                this.f135716d.setValue(Boolean.FALSE);
                break;
            default:
                q40.b bVar3 = this.f135714b;
                this.f135715c.invoke(new q40.b(bVar3.f142574a, bVar3.f142575b, bVar3.f142576c, bVar3.f142577d, bVar3.f142578e, bVar3.f142579f, bVar3.f142580g, str, bVar3.f142582i, bVar3.f142583j, bVar3.f142584k, bVar3.f142585l, bVar3.f142586m, bVar3.f142587n, bVar3.f142588o));
                this.f135716d.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
