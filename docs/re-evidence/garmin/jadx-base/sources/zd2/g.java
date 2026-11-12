package zd2;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f204238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ be2.g f204239c;

    public /* synthetic */ g(h hVar, be2.g gVar, int i14) {
        this.f204237a = i14;
        this.f204238b = hVar;
        this.f204239c = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f204237a;
        be2.g gVar = this.f204239c;
        h hVar = this.f204238b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                h.c cVar = h.f204240e;
                aVar.getClass();
                hVar.f204242b.d(aVar, gVar);
                return Unit.INSTANCE;
            default:
                h.c cVar2 = h.f204240e;
                aVar.getClass();
                return Integer.valueOf(hVar.f204244d.c(aVar, gVar));
        }
    }
}
