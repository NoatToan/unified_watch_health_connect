package oa0;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h90.b f131036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j90.c f131037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f131038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f131039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f131040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f131041g;

    public /* synthetic */ a(h90.b bVar, j90.c cVar, e23.a aVar, l lVar, l lVar2, e23.a aVar2, int i14, int i15) {
        this.f131035a = i15;
        this.f131036b = bVar;
        this.f131037c = cVar;
        this.f131038d = aVar;
        this.f131039e = lVar;
        this.f131040f = lVar2;
        this.f131041g = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f131035a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                b.b(this.f131036b, this.f131037c, this.f131038d, this.f131039e, this.f131040f, this.f131041g, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                b.a(this.f131036b, this.f131037c, this.f131038d, this.f131039e, this.f131040f, this.f131041g, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
