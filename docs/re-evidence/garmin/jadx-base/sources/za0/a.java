package za0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f203228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4.a f203229c;

    public /* synthetic */ a(Context context, a4.a aVar, int i14) {
        this.f203227a = i14;
        this.f203228b = context;
        this.f203229c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        f.a aVar = (f.a) obj;
        switch (this.f203227a) {
            case 0:
                aVar.getClass();
                j22.b bVar = j22.b.f96736a;
                j22.g gVar = j22.g.f96761f;
                bVar.getClass();
                this.f203229c.invoke(Boolean.valueOf(j22.b.p(this.f203228b, gVar)));
                break;
            case 1:
                aVar.getClass();
                j22.b bVar2 = j22.b.f96736a;
                j22.g gVar2 = j22.g.f96762g;
                bVar2.getClass();
                this.f203229c.invoke(Boolean.valueOf(j22.b.p(this.f203228b, gVar2)));
                break;
            case 2:
                aVar.getClass();
                j22.b.f96736a.getClass();
                int i14 = n.a.f203266a[j22.b.j(this.f203228b).ordinal()];
                a4.a aVar2 = this.f203229c;
                if (i14 == 1) {
                    aVar2.invoke(Boolean.TRUE);
                } else {
                    aVar2.invoke(Boolean.FALSE);
                }
                break;
            case 3:
                aVar.getClass();
                j22.b bVar3 = j22.b.f96736a;
                j22.g gVar3 = j22.g.f96766k;
                bVar3.getClass();
                this.f203229c.invoke(Boolean.valueOf(j22.b.p(this.f203228b, gVar3)));
                break;
            default:
                aVar.getClass();
                j22.b bVar4 = j22.b.f96736a;
                j22.g gVar4 = j22.g.f96768m;
                bVar4.getClass();
                this.f203229c.invoke(Boolean.valueOf(j22.b.p(this.f203228b, gVar4)));
                break;
        }
        return Unit.INSTANCE;
    }
}
