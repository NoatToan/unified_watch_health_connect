package h21;

import i3.mc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f81100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f81101c;

    public /* synthetic */ n(mc mcVar, e23.a aVar, int i14) {
        this.f81099a = i14;
        this.f81100b = mcVar;
        this.f81101c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f81099a) {
            case 0:
                if (!this.f81100b.e()) {
                    this.f81101c.invoke();
                }
                break;
            case 1:
                if (!this.f81100b.e()) {
                    this.f81101c.invoke();
                }
                break;
            case 2:
                if (!this.f81100b.e()) {
                    this.f81101c.invoke();
                }
                break;
            case 3:
                if (!this.f81100b.e()) {
                    this.f81101c.invoke();
                }
                break;
            default:
                if (!this.f81100b.e()) {
                    this.f81101c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
