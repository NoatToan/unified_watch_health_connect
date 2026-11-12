package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cb f87586b;

    public /* synthetic */ bb(cb cbVar, int i14) {
        this.f87585a = i14;
        this.f87586b = cbVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f87585a) {
            case 0:
                ((Boolean) obj).getClass();
                e23.a<Unit> aVar = this.f87586b.f87741b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                g6.m mVar = (g6.m) obj;
                float f14 = (int) (mVar.f76013a >> 32);
                cb cbVar = this.f87586b;
                cbVar.f87747h.i(f14);
                cbVar.f87748i.i((int) (mVar.f76013a & 4294967295L));
                break;
            default:
                g6.m mVar2 = (g6.m) obj;
                float f15 = (int) (mVar2.f76013a >> 32);
                cb cbVar2 = this.f87586b;
                cbVar2.f87749j.i(f15);
                cbVar2.f87750k.i((int) (mVar2.f76013a & 4294967295L));
                break;
        }
        return Unit.INSTANCE;
    }
}
