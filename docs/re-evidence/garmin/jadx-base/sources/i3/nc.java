package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.f f89077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.o0 f89078c;

    public /* synthetic */ nc(l3.f fVar, p005kotlin.jvm.internal.o0 o0Var, int i14) {
        this.f89076a = i14;
        this.f89077b = fVar;
        this.f89078c = o0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f89076a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i14) {
            case 0:
                this.f89077b.a(fFloatValue, fFloatValue2);
                this.f89078c.f105806a = fFloatValue;
                break;
            default:
                this.f89077b.a(fFloatValue, fFloatValue2);
                this.f89078c.f105806a = fFloatValue;
                break;
        }
        return Unit.INSTANCE;
    }
}
