package qa0;

import e23.l;
import e23.p;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143837a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f143838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f143839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f143840d;

    public /* synthetic */ a(List list, e23.a aVar, l lVar, int i14) {
        this.f143838b = list;
        this.f143839c = aVar;
        this.f143840d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f143837a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                b.a(this.f143838b, this.f143839c, this.f143840d, mVar, p0.t(1));
                break;
            default:
                tf0.h.a(this.f143838b, this.f143839c, this.f143840d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(List list, l lVar, e23.a aVar, int i14) {
        this.f143838b = list;
        this.f143840d = lVar;
        this.f143839c = aVar;
    }
}
