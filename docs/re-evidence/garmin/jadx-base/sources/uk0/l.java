package uk0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171844a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f171845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f171847d;

    public /* synthetic */ l(e23.l lVar, Object obj, p1 p1Var) {
        this.f171845b = lVar;
        this.f171846c = obj;
        this.f171847d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f171844a) {
            case 0:
                this.f171847d.setValue(Boolean.FALSE);
                this.f171845b.invoke(this.f171846c);
                break;
            default:
                this.f171847d.setValue(Boolean.FALSE);
                this.f171845b.invoke(this.f171846c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(p1 p1Var, e23.l lVar, Object obj) {
        this.f171847d = p1Var;
        this.f171845b = lVar;
        this.f171846c = obj;
    }
}
