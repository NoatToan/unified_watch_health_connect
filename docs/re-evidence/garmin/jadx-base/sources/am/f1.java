package am;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gr.a f3940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr.b f3941d;

    public /* synthetic */ f1(String str, gr.a aVar, gr.b bVar, int i14, int i15) {
        this.f3938a = i15;
        this.f3939b = str;
        this.f3940c = aVar;
        this.f3941d = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3938a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                p1.c(this.f3939b, this.f3940c, this.f3941d, mVar, p3.p0.t(1));
                break;
            default:
                p1.e(this.f3939b, this.f3940c, this.f3941d, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
