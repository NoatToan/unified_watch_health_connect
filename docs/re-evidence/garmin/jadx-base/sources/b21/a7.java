package b21;

import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a7 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.q f14506b;

    public /* synthetic */ a7(q21.q qVar, int i14) {
        this.f14505a = i14;
        this.f14506b = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f14505a) {
            case 0:
                return ParametersHolderKt.parametersOf(this.f14506b.f142280c);
            case 1:
                q21.q qVar = this.f14506b;
                return ParametersHolderKt.parametersOf(qVar.f142280c, qVar.f142281d);
            default:
                q21.q qVar2 = this.f14506b;
                Integer num = qVar2.f142280c;
                boolean z14 = qVar2.f142278a;
                s21.e eVar = null;
                if (num == null || !z14) {
                    num = null;
                }
                s21.e eVar2 = qVar2.f142281d;
                if (eVar2 != null && z14) {
                    eVar = eVar2;
                }
                return ParametersHolderKt.parametersOf(num, eVar, Boolean.TRUE);
        }
    }
}
