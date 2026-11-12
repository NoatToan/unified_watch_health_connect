package sk0;

import android.content.Context;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f159787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f159788c;

    public /* synthetic */ o(r rVar, Context context, int i14) {
        this.f159786a = i14;
        this.f159787b = rVar;
        this.f159788c = context;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        List<qk0.h> list = (List) obj2;
        switch (this.f159786a) {
            case 0:
                n0Var.getClass();
                list.getClass();
                this.f159787b.x4(this.f159788c, n0Var.d(), n0Var.f159772k, p13.j0.f134944a, n0Var.f159774m, list);
                break;
            default:
                n0Var.getClass();
                list.getClass();
                this.f159787b.x4(this.f159788c, n0Var.d(), n0Var.f159772k, p13.j0.f134944a, n0Var.f159774m, list);
                break;
        }
        return Unit.INSTANCE;
    }
}
