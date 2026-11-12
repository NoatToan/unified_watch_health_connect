package lm0;

import m4.g0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f113577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f113578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f113579d;

    public /* synthetic */ m(int i14, e23.a aVar, p1 p1Var, boolean z14) {
        this.f113576a = i14;
        this.f113577b = z14;
        this.f113578c = aVar;
        this.f113579d = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f113576a) {
            case 0:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                this.f113579d.setValue(Boolean.valueOf(g0Var.a()));
                if (this.f113577b && g0Var.a()) {
                    this.f113578c.invoke();
                }
                break;
            case 1:
                ((String) obj).getClass();
                if (this.f113577b) {
                    this.f113579d.setValue(Boolean.TRUE);
                } else {
                    this.f113578c.invoke();
                }
                break;
            default:
                ((String) obj).getClass();
                if (this.f113577b) {
                    this.f113579d.setValue(Boolean.TRUE);
                } else {
                    this.f113578c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
