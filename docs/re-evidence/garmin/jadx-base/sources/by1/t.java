package by1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.v f22211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22212c;

    public /* synthetic */ t(dy1.v vVar, ey1.a aVar, int i14) {
        this.f22210a = i14;
        this.f22211b = vVar;
        this.f22212c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22210a;
        dy1.v vVar = this.f22211b;
        ey1.a aVar = this.f22212c;
        switch (i14) {
            case 0:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                v vVar2 = v.f22216a;
                str.getClass();
                if (vVar != null) {
                    aVar.X4(vVar.f61640a, str, zBooleanValue);
                }
                break;
            case 1:
                String str2 = (String) obj;
                kx1.a aVar2 = (kx1.a) obj2;
                v vVar3 = v.f22216a;
                str2.getClass();
                aVar2.getClass();
                if (vVar != null) {
                    aVar.z4(vVar.f61640a, str2, aVar2);
                }
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                v vVar4 = v.f22216a;
                if (vVar != null) {
                    aVar.L4(vVar.f61640a, iIntValue, iIntValue2);
                }
                break;
            case 3:
                String str3 = (String) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                z zVar = z.f22228a;
                str3.getClass();
                aVar.X4(vVar.f61640a, str3, zBooleanValue2);
                break;
            case 4:
                String str4 = (String) obj;
                kx1.a aVar3 = (kx1.a) obj2;
                z zVar2 = z.f22228a;
                str4.getClass();
                aVar3.getClass();
                aVar.z4(vVar.f61640a, str4, aVar3);
                break;
            case 5:
                String str5 = (String) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                cy1.b bVar = cy1.b.f56796a;
                str5.getClass();
                aVar.X4(vVar.f61640a, str5, zBooleanValue3);
                break;
            default:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                cy1.b bVar2 = cy1.b.f56796a;
                aVar.L4(vVar.f61640a, iIntValue3, iIntValue4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(ey1.a aVar, dy1.v vVar, int i14) {
        this.f22210a = i14;
        this.f22212c = aVar;
        this.f22211b = vVar;
    }
}
