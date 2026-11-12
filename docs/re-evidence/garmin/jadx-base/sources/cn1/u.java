package cn1;

import i3.mc;
import i3.y0;
import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f28058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f28059c;

    public /* synthetic */ u(b0 b0Var, mc mcVar, int i14) {
        this.f28057a = i14;
        this.f28058b = b0Var;
        this.f28059c = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f28057a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ge1.b.T(this.f28058b, null, null, new v.a(this.f28059c, null), 3);
                    sn.a.o(f12.l.f68084a, true);
                }
                break;
            default:
                ge1.b.T(this.f28058b, null, null, new y0(this.f28059c, ((Float) obj).floatValue(), null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
