package kr2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106254b;

    public /* synthetic */ g(b bVar, int i14) {
        this.f106253a = i14;
        this.f106254b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f106253a;
        b bVar = this.f106254b;
        switch (i14) {
            case 0:
                h.a aVar = h.f106255y;
                ((pn2.a.i) obj).getClass();
                pn2.a.f138690a.getClass();
                bVar.f106240b = pn2.a.e().f138761a;
                break;
            case 1:
                h.a aVar2 = h.f106255y;
                ((pn2.a.d.EnumC2625a) obj).getClass();
                pn2.a.f138690a.getClass();
                bVar.f106240b = pn2.a.b().f138726a;
                break;
            case 2:
                String str = (String) obj;
                h.a aVar3 = h.f106255y;
                if (str == null) {
                    str = "(Unset)";
                }
                bVar.f106240b = str;
                break;
            case 3:
                h.a aVar4 = h.f106255y;
                ((pn2.a.e) obj).getClass();
                pn2.a.f138690a.getClass();
                bVar.f106240b = pn2.a.c().name();
                break;
            case 4:
                h.a aVar5 = h.f106255y;
                ((pn2.a.b) obj).getClass();
                pn2.a.f138690a.getClass();
                bVar.f106240b = pn2.a.a().f138708a;
                break;
            default:
                h.a aVar6 = h.f106255y;
                ((pn2.a.f) obj).getClass();
                pn2.a.f138690a.getClass();
                bVar.f106240b = pn2.a.d().f138741a;
                break;
        }
        return Unit.INSTANCE;
    }
}
