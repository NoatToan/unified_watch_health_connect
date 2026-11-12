package vj1;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj1.a f178462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f178463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f178464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f178465e;

    public /* synthetic */ e(wj1.a aVar, l lVar, e23.a aVar2, int i14, int i15) {
        this.f178461a = i15;
        this.f178462b = aVar;
        this.f178463c = lVar;
        this.f178464d = aVar2;
        this.f178465e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f178461a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                og.a.h(this.f178462b, this.f178463c, this.f178464d, mVar, p0.t(this.f178465e | 1));
                break;
            default:
                og.a.i(this.f178462b, this.f178463c, this.f178464d, mVar, p0.t(this.f178465e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
