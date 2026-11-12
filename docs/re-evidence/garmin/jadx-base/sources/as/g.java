package as;

import java.util.List;
import o53.f0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f12636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f12637e;

    public /* synthetic */ g(List list, boolean z14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f12633a = i15;
        this.f12634b = list;
        this.f12635c = z14;
        this.f12636d = aVar;
        this.f12637e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12633a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                k.a(this.f12634b, this.f12635c, this.f12636d, this.f12637e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                f0.g(this.f12634b, this.f12635c, this.f12636d, this.f12637e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
