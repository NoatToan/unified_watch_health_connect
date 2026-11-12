package xx1;

import android.content.DialogInterface;
import e23.l;
import h4.r;
import l72.i3;
import p005kotlin.Unit;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f192562b;

    public /* synthetic */ d(e23.a aVar, int i14) {
        this.f192561a = i14;
        this.f192562b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f192561a) {
            case 0:
                ((i3) obj).getClass();
                this.f192562b.invoke();
                return Unit.INSTANCE;
            case 1:
                this.f192562b.invoke();
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                dialogInterface.getClass();
                this.f192562b.invoke();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 3:
                r rVar = (r) obj;
                rVar.getClass();
                return w.d(rVar, false, null, null, new yy1.d(this.f192562b, 3), 15);
            case 4:
                r rVar2 = (r) obj;
                rVar2.getClass();
                return w.d(rVar2, false, null, null, new yy1.d(this.f192562b, 2), 15);
            case 5:
                r rVar3 = (r) obj;
                rVar3.getClass();
                return w.d(rVar3, false, null, null, new yy1.d(this.f192562b, 17), 15);
            case 6:
                r rVar4 = (r) obj;
                rVar4.getClass();
                return w.d(rVar4, false, null, null, new yy1.d(this.f192562b, 14), 15);
            case 7:
                r rVar5 = (r) obj;
                rVar5.getClass();
                return w.d(rVar5, false, null, null, new yy1.d(this.f192562b, 18), 15);
            case 8:
                r rVar6 = (r) obj;
                rVar6.getClass();
                return w.d(rVar6, false, null, null, new yy1.d(this.f192562b, 16), 15);
            case 9:
                return (n4.c) this.f192562b.invoke();
            case 10:
                return (n4.c) this.f192562b.invoke();
            case 11:
                ((Integer) obj).intValue();
                this.f192562b.invoke();
                return Unit.INSTANCE;
            default:
                e23.a aVar = this.f192562b;
                aVar.getClass();
                aVar.invoke();
                return Unit.INSTANCE;
        }
    }
}
