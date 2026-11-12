package li0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f112717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f112718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f112719d;

    public /* synthetic */ f0(f fVar, Context context, d0 d0Var, int i14) {
        this.f112716a = i14;
        this.f112717b = fVar;
        this.f112718c = context;
        this.f112719d = d0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f112716a) {
            case 0:
                this.f112717b.e(this.f112718c, this.f112719d);
                break;
            case 1:
                d0 d0Var = this.f112719d;
                String str = d0Var.f112650c;
                String str2 = d0Var.f112651d;
                b12.b bVar = d0Var.f112648a;
                String str3 = bVar != null ? bVar.f14387a : null;
                f fVar = this.f112717b;
                fVar.getClass();
                Context context = this.f112718c;
                context.getClass();
                if (str != null) {
                    fVar.f112663d.a(context, str, str2, str3);
                }
                break;
            default:
                d0 d0Var2 = this.f112719d;
                String str4 = d0Var2.f112650c;
                String str5 = d0Var2.f112651d;
                b12.b bVar2 = d0Var2.f112648a;
                String str6 = bVar2 != null ? bVar2.f14387a : null;
                f fVar2 = this.f112717b;
                fVar2.getClass();
                Context context2 = this.f112718c;
                context2.getClass();
                if (str4 != null) {
                    fVar2.f112663d.a(context2, str4, str5, str6);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
