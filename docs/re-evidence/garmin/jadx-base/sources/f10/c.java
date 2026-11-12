package f10;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67812a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f67813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f67814c;

    public /* synthetic */ c(r rVar, boolean z14, int i14) {
        this.f67814c = rVar;
        this.f67813b = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f67812a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d.d(p0.t(1), this.f67814c, mVar, this.f67813b);
                break;
            default:
                y41.e.c(p0.t(1), this.f67814c, mVar, this.f67813b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(boolean z14, r rVar, int i14) {
        this.f67813b = z14;
        this.f67814c = rVar;
    }
}
