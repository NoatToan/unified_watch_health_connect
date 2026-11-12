package wr1;

import e23.p;
import gs1.l;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f186810c;

    public /* synthetic */ c(l lVar, int i14, int i15) {
        this.f186808a = i15;
        this.f186809b = lVar;
        this.f186810c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f186808a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.d(this.f186809b, mVar, p0.t(this.f186810c | 1));
                break;
            default:
                g.g(this.f186809b, mVar, p0.t(this.f186810c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
