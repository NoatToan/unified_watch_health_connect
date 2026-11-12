package ht1;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f85578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f85579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f85580d;

    public /* synthetic */ r(e23.a aVar, p1 p1Var, boolean z14) {
        this.f85577a = 0;
        this.f85578b = z14;
        this.f85580d = p1Var;
        this.f85579c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f85577a) {
            case 0:
                if (this.f85578b) {
                    this.f85580d.setValue(Boolean.TRUE);
                } else {
                    this.f85579c.invoke();
                }
                break;
            case 1:
                if (this.f85578b) {
                    this.f85580d.setValue(Boolean.TRUE);
                } else {
                    this.f85579c.invoke();
                }
                break;
            default:
                if (this.f85578b) {
                    this.f85580d.setValue(Boolean.TRUE);
                } else {
                    this.f85579c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(int i14, e23.a aVar, p1 p1Var, boolean z14) {
        this.f85577a = i14;
        this.f85578b = z14;
        this.f85579c = aVar;
        this.f85580d = p1Var;
    }
}
