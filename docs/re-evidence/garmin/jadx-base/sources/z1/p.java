package z1;

import java.util.concurrent.CancellationException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p008y1.o2;
import p3.c2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f200859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f200860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2 f200861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f200862e;

    public /* synthetic */ p(float f14, o0 o0Var, o2 o2Var, e23.l lVar, int i14) {
        this.f200858a = i14;
        this.f200859b = f14;
        this.f200860c = o0Var;
        this.f200861d = o2Var;
        this.f200862e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        float f14;
        switch (this.f200858a) {
            case 0:
                s1.j jVar = (s1.j) obj;
                float fAbs = Math.abs(((Number) jVar.f155607e.getF182175a()).floatValue());
                float f15 = this.f200859b;
                float fAbs2 = Math.abs(f15);
                c2 c2Var = jVar.f155607e;
                o0 o0Var = this.f200860c;
                o2 o2Var = this.f200861d;
                e23.l lVar = this.f200862e;
                if (fAbs >= fAbs2) {
                    float fD = s.d(((Number) c2Var.getF182175a()).floatValue(), f15);
                    s.c(jVar, o2Var, lVar, fD - o0Var.f105806a);
                    jVar.a();
                    o0Var.f105806a = fD;
                } else {
                    s.c(jVar, o2Var, lVar, ((Number) c2Var.getF182175a()).floatValue() - o0Var.f105806a);
                    o0Var.f105806a = ((Number) c2Var.getF182175a()).floatValue();
                }
                break;
            default:
                o2 o2Var2 = this.f200861d;
                s1.j jVar2 = (s1.j) obj;
                float fD2 = s.d(((Number) jVar2.f155607e.getF182175a()).floatValue(), this.f200859b);
                o0 o0Var2 = this.f200860c;
                float f16 = fD2 - o0Var2.f105806a;
                try {
                    f14 = o2Var2.f(f16);
                } catch (CancellationException unused) {
                    jVar2.a();
                    f14 = 0.0f;
                }
                this.f200862e.invoke(Float.valueOf(f14));
                if (Math.abs(f16 - f14) > 0.5f || fD2 != ((Number) jVar2.f155607e.getF182175a()).floatValue()) {
                    jVar2.a();
                }
                o0Var2.f105806a += f14;
                break;
        }
        return Unit.INSTANCE;
    }
}
