package zr;

import i3.mc;
import o53.b0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f206705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f206706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f206707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f206708e;

    public /* synthetic */ c(b0 b0Var, mc mcVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f206704a = i14;
        this.f206705b = b0Var;
        this.f206706c = mcVar;
        this.f206707d = p1Var;
        this.f206708e = p1Var2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f206704a) {
            case 0:
                ge1.b.T(this.f206705b, null, null, new h.f(this.f206706c, this.f206707d, this.f206708e, null), 3);
                break;
            default:
                ge1.b.T(this.f206705b, null, null, new h.c(this.f206706c, this.f206707d, this.f206708e, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
