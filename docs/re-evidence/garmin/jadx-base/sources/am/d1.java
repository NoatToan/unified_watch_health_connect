package am;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gr.b f3908b;

    public /* synthetic */ d1(gr.b bVar, int i14) {
        this.f3907a = i14;
        this.f3908b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f3907a) {
            case 0:
                this.f3908b.z4();
                break;
            case 1:
                this.f3908b.A4();
                break;
            case 2:
                this.f3908b.z4();
                break;
            default:
                this.f3908b.A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
