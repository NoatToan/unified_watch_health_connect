package a90;

import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.c f2018b;

    public /* synthetic */ d(q90.c cVar, int i14) {
        this.f2017a = i14;
        this.f2018b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2017a;
        q90.c cVar = this.f2018b;
        switch (i14) {
            case 0:
                f fVar = f.f2020a;
                return ParametersHolderKt.parametersOf(cVar.f143494b);
            case 1:
                l lVar = l.f2031a;
                return ParametersHolderKt.parametersOf(Long.valueOf(cVar.f143493a));
            case 2:
                return ParametersHolderKt.parametersOf(Long.valueOf(cVar.f143493a), cVar.f143495c.f111524i);
            case 3:
                return ParametersHolderKt.parametersOf(Long.valueOf(cVar.f143493a), cVar.f143495c.f111522g);
            case 4:
                return ParametersHolderKt.parametersOf(cVar);
            case 5:
                return ParametersHolderKt.parametersOf(cVar);
            default:
                return ParametersHolderKt.parametersOf(cVar);
        }
    }
}
