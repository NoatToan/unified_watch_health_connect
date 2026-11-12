package dj0;

import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59933a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f59934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f59935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f59936d;

    public /* synthetic */ k(e23.a aVar, e23.l lVar, p1 p1Var) {
        this.f59935c = aVar;
        this.f59934b = lVar;
        this.f59936d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        i3 i3Var = (i3) obj;
        switch (this.f59933a) {
            case 0:
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "menu_item_add_weight")) {
                    this.f59935c.invoke();
                } else {
                    this.f59934b.invoke((gj0.a) this.f59936d.getF182175a());
                }
                break;
            default:
                i3Var.getClass();
                String str = i3Var.f111063a;
                if (s.g(str, "HELP")) {
                    this.f59934b.invoke(Integer.valueOf(((qr1.c) this.f59936d.getF182175a()).f146902g));
                } else if (s.g(str, "REMINDER")) {
                    this.f59935c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(e23.l lVar, e23.a aVar, p1 p1Var) {
        this.f59934b = lVar;
        this.f59935c = aVar;
        this.f59936d = p1Var;
    }
}
