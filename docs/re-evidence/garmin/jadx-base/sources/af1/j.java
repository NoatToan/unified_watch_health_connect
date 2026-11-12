package af1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u82.f f3095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f3096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f3097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f3098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3099f;

    public /* synthetic */ j(u82.f fVar, o82.g gVar, b63.o oVar, b63.o oVar2, int i14, int i15) {
        this.f3094a = i15;
        this.f3095b = fVar;
        this.f3096c = gVar;
        this.f3097d = oVar;
        this.f3098e = oVar2;
        this.f3099f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3094a) {
            case 0:
                ((Integer) obj2).intValue();
                k.a(this.f3095b, this.f3096c, this.f3097d, this.f3098e, (p3.m) obj, p0.t(this.f3099f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                p.a(this.f3095b, this.f3096c, this.f3097d, this.f3098e, (p3.m) obj, p0.t(this.f3099f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
