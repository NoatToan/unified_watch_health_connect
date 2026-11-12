package sa2;

import android.content.DialogInterface;
import o53.c0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158328b;

    public /* synthetic */ e(h hVar, int i14) {
        this.f158327a = i14;
        this.f158328b = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f158327a;
        h hVar = this.f158328b;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                wa2.b bVar = h.f158334i;
                dialogInterface.getClass();
                dialogInterface.cancel();
                hVar.f158336b.w0();
                break;
            case 1:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                wa2.b bVar2 = h.f158334i;
                dialogInterface2.getClass();
                dialogInterface2.cancel();
                hVar.getClass();
                h.f158334i.getClass();
                c0.c(hVar.f158340f, null);
                c0.c(hVar.f158341g, null);
                hVar.e();
                ua2.b bVar3 = hVar.f158336b;
                bVar3.q2();
                bVar3.E1();
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                wa2.b bVar4 = h.f158334i;
                str.getClass();
                if (zBooleanValue) {
                    wa2.b bVar5 = h.f158334i;
                    qa2.e eVar = hVar.f158337c;
                    bVar5.getClass();
                    hVar.d(new f(hVar, 2));
                } else {
                    hVar.g(str);
                }
                break;
            default:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                wa2.b bVar6 = h.f158334i;
                dialogInterface3.getClass();
                dialogInterface3.cancel();
                hVar.getClass();
                h.f158334i.getClass();
                c0.c(hVar.f158340f, null);
                c0.c(hVar.f158341g, null);
                hVar.e();
                hVar.f158336b.E1();
                break;
        }
        return Unit.INSTANCE;
    }
}
