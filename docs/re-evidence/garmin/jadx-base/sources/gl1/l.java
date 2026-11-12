package gl1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f77849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.t f77850c;

    public /* synthetic */ l(e23.t tVar, long j8, int i14) {
        this.f77848a = i14;
        this.f77850c = tVar;
        this.f77849b = j8;
    }

    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f77848a) {
            case 0:
                c cVar = (c) this.f77850c;
                zf2.d dVar = (zf2.d) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Boolean bool2 = (Boolean) obj3;
                bool2.getClass();
                Boolean bool3 = (Boolean) obj4;
                bool3.getClass();
                dVar.getClass();
                cVar.invoke(Long.valueOf(this.f77849b), dVar, bool, bool2, bool3, (Boolean) obj5);
                break;
            default:
                c cVar2 = (c) this.f77850c;
                zf2.d dVar2 = (zf2.d) obj;
                Boolean bool4 = (Boolean) obj2;
                bool4.getClass();
                Boolean bool5 = (Boolean) obj3;
                bool5.getClass();
                Boolean bool6 = (Boolean) obj4;
                bool6.getClass();
                dVar2.getClass();
                cVar2.invoke(Long.valueOf(this.f77849b), dVar2, bool4, bool5, bool6, (Boolean) obj5);
                break;
        }
        return Unit.INSTANCE;
    }
}
