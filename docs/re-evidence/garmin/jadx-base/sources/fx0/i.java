package fx0;

import android.content.Context;
import ht.s;
import o70.t;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f73801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tb1.b f73802c;

    public /* synthetic */ i(Context context, tb1.b bVar, int i14) {
        this.f73800a = i14;
        this.f73801b = context;
        this.f73802c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f73800a) {
            case 0:
                s sVar = s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.P0);
                sVar.getClass();
                s.a(kVar);
                tb1.b bVar = this.f73802c;
                Context context = this.f73801b;
                context.startActivity(bVar.b(context, false));
                break;
            case 1:
                s sVar2 = s.f85508a;
                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.P0);
                sVar2.getClass();
                s.a(kVar2);
                tb1.b bVar2 = this.f73802c;
                Context context2 = this.f73801b;
                context2.startActivity(bVar2.b(context2, true));
                break;
            default:
                tb1.b bVar3 = this.f73802c;
                Context context3 = this.f73801b;
                context3.startActivity(bVar3.a(context3));
                break;
        }
        return Unit.INSTANCE;
    }
}
