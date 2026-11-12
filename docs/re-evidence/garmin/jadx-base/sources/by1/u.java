package by1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22213a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dy1.v f22215c;

    public /* synthetic */ u(dy1.v vVar, ey1.a aVar) {
        this.f22215c = vVar;
        this.f22214b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f22213a;
        dy1.v vVar = this.f22215c;
        ey1.a aVar = this.f22214b;
        String str = (String) obj;
        switch (i14) {
            case 0:
                v vVar2 = v.f22216a;
                str.getClass();
                if (vVar != null) {
                    aVar.C4(vVar.f61640a, str);
                }
                break;
            default:
                z zVar = z.f22228a;
                str.getClass();
                aVar.C4(vVar.f61640a, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(ey1.a aVar, dy1.v vVar) {
        this.f22214b = aVar;
        this.f22215c = vVar;
    }
}
