package aw;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f13316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13317c;

    public /* synthetic */ c(d dVar, int i14, int i15) {
        this.f13315a = i15;
        this.f13316b = dVar;
        this.f13317c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f13315a;
        int i15 = this.f13317c;
        d dVar = this.f13316b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = d.f13318f;
        switch (i14) {
            case 0:
                dVar.j(mVar, p0.t(i15 | 1));
                break;
            default:
                dVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
