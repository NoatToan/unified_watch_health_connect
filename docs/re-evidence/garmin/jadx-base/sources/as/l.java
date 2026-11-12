package as;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f12662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f12663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12664f;

    public /* synthetic */ l(List list, boolean z14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f12659a = i15;
        this.f12660b = list;
        this.f12661c = z14;
        this.f12662d = aVar;
        this.f12663e = aVar2;
        this.f12664f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12659a) {
            case 0:
                ((Integer) obj2).getClass();
                m.a(this.f12660b, this.f12661c, this.f12662d, this.f12663e, (p3.m) obj, p0.t(this.f12664f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                o.a(this.f12660b, this.f12661c, this.f12662d, this.f12663e, (p3.m) obj, p0.t(this.f12664f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
