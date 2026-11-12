package po;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f138897b;

    public /* synthetic */ i(k kVar, int i14) {
        this.f138896a = i14;
        this.f138897b = kVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f138896a;
        k kVar = this.f138897b;
        qw0.v vVar = (qw0.v) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i14) {
            case 0:
                k.a aVar = k.f138917m;
                vVar.getClass();
                h.a aVar2 = kVar.f138918g;
                if (aVar2 != null) {
                    aVar2.c(vVar, zBooleanValue);
                }
                break;
            case 1:
                k.a aVar3 = k.f138917m;
                vVar.getClass();
                kVar.f138923l.post(new a0.a(kVar, zBooleanValue, 12));
                break;
            default:
                k.a aVar4 = k.f138917m;
                vVar.getClass();
                h.a aVar5 = kVar.f138918g;
                if (aVar5 != null) {
                    aVar5.c(vVar, zBooleanValue);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
