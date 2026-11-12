package xo0;

import e23.l;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo0.a f191751b;

    public /* synthetic */ a(wo0.a aVar, int i14) {
        this.f191750a = i14;
        this.f191751b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f191750a) {
            case 0:
                k0Var.getClass();
                String str = this.f191751b.f186422h;
                if (str != null) {
                    h0.n(k0Var, str);
                }
                break;
            default:
                k0Var.getClass();
                String str2 = this.f191751b.f186422h;
                if (str2 != null) {
                    h0.n(k0Var, str2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
