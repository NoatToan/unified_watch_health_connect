package a3;

import f5.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f835c;

    public /* synthetic */ t0(v1 v1Var, int i14, int i15) {
        this.f833a = i15;
        this.f834b = v1Var;
        this.f835c = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        v1.a aVar = (v1.a) obj;
        switch (this.f833a) {
            case 0:
                aVar.r(this.f834b, 0, -this.f835c, 0.0f);
                break;
            case 1:
                aVar.r(this.f834b, 0, -this.f835c, 0.0f);
                break;
            default:
                aVar.r(this.f834b, -this.f835c, 0, 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }
}
