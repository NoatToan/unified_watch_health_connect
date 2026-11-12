package pa0;

import e23.p;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f136720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f136721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f136722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f136723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f136724f;

    public /* synthetic */ d(List list, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f136719a = i15;
        this.f136720b = list;
        this.f136721c = lVar;
        this.f136722d = aVar;
        this.f136723e = aVar2;
        this.f136724f = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f136719a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                e.a(this.f136720b, this.f136721c, this.f136722d, this.f136723e, this.f136724f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                e.b(this.f136720b, this.f136721c, this.f136722d, this.f136723e, this.f136724f, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
