package a3;

import f5.v1;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f808d;

    public /* synthetic */ q0(int i14, v1 v1Var, int i15, int i16) {
        this.f805a = i16;
        this.f807c = i14;
        this.f806b = v1Var;
        this.f808d = i15;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f805a) {
            case 0:
                v1 v1Var = this.f806b;
                ((v1.a) obj).r(v1Var, MathKt.c((this.f807c - v1Var.f69144a) / 2.0f), MathKt.c((this.f808d - v1Var.f69145b) / 2.0f), 0.0f);
                break;
            case 1:
                ((v1.a) obj).r(this.f806b, this.f807c, this.f808d, 0.0f);
                break;
            case 2:
                ((v1.a) obj).r(this.f806b, this.f807c, this.f808d, 0.0f);
                break;
            case 3:
                v1.a aVar = (v1.a) obj;
                aVar.getClass();
                v1 v1Var2 = this.f806b;
                aVar.r(v1Var2, (this.f807c - v1Var2.f69144a) / 2, (this.f808d - v1Var2.f69145b) / 2, 0.0f);
                break;
            default:
                v1 v1Var3 = this.f806b;
                ((v1.a) obj).r(v1Var3, MathKt.c((this.f807c - v1Var3.f69144a) / 2.0f), MathKt.c((this.f808d - v1Var3.f69145b) / 2.0f), 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q0(v1 v1Var, int i14, int i15, int i16) {
        this.f805a = i16;
        this.f806b = v1Var;
        this.f807c = i14;
        this.f808d = i15;
    }
}
