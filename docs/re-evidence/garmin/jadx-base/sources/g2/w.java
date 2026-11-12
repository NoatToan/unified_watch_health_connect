package g2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4.c f75289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f75290c;

    public /* synthetic */ w(r4.c cVar, v vVar, int i14) {
        this.f75288a = i14;
        this.f75289b = cVar;
        this.f75290c = vVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        s1.b bVar = (s1.b) obj;
        switch (this.f75288a) {
            case 0:
                this.f75289b.f(((Number) bVar.e()).floatValue());
                this.f75290c.f75254c.invoke();
                break;
            default:
                this.f75289b.f(((Number) bVar.e()).floatValue());
                this.f75290c.f75254c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
