package ot1;

import android.os.Build;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f133817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.q f133818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f133819d;

    public /* synthetic */ r(c.q qVar, c.q qVar2, c.q qVar3, int i14) {
        this.f133816a = i14;
        this.f133817b = qVar;
        this.f133818c = qVar2;
        this.f133819d = qVar3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133816a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                u uVar = u.f133824a;
                int i15 = Build.VERSION.SDK_INT;
                c.q qVar = this.f133817b;
                c.q qVar2 = this.f133818c;
                if (i15 > 29) {
                    uVar.getClass();
                    u.f(iIntValue, qVar, qVar2);
                } else {
                    j22.b bVar = j22.b.f96736a;
                    j22.a[] aVarArr = {j22.a.f96721j};
                    bVar.getClass();
                    if (j22.b.k(aVarArr)) {
                        uVar.getClass();
                        u.f(iIntValue, qVar, qVar2);
                    } else {
                        this.f133819d.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
                    }
                }
                break;
            default:
                y yVar = y.f133845a;
                int i16 = Build.VERSION.SDK_INT;
                c.q qVar3 = this.f133817b;
                c.q qVar4 = this.f133818c;
                if (i16 > 29) {
                    yVar.getClass();
                    y.e(iIntValue, qVar3, qVar4);
                } else {
                    j22.b bVar2 = j22.b.f96736a;
                    j22.a[] aVarArr2 = {j22.a.f96721j};
                    bVar2.getClass();
                    if (j22.b.k(aVarArr2)) {
                        yVar.getClass();
                        y.e(iIntValue, qVar3, qVar4);
                    } else {
                        this.f133819d.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
