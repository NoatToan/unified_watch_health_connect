package s70;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f157743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f157744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r70.q f157745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f157746e;

    public /* synthetic */ n0(List list, boolean z14, r70.q qVar, int i14, int i15) {
        this.f157742a = i15;
        this.f157743b = list;
        this.f157744c = z14;
        this.f157745d = qVar;
        this.f157746e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157742a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                o0.a(this.f157743b, this.f157744c, this.f157745d, mVar, p3.p0.t(this.f157746e | 1));
                break;
            default:
                l1.a(this.f157743b, this.f157744c, this.f157745d, mVar, p3.p0.t(this.f157746e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
