package sa0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f158157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f158158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f158159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f158160e;

    public /* synthetic */ a(String str, List list, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f158156a = i15;
        this.f158157b = str;
        this.f158158c = list;
        this.f158159d = lVar;
        this.f158160e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f158156a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                b.b(this.f158157b, this.f158158c, this.f158159d, this.f158160e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                b.a(this.f158157b, this.f158158c, this.f158159d, this.f158160e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
