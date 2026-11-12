package bb1;

import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f17310c;

    public /* synthetic */ c(p pVar, g gVar, int i14) {
        this.f17308a = i14;
        this.f17309b = pVar;
        this.f17310c = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f17308a) {
            case 0:
                g gVar = this.f17310c;
                this.f17309b.invoke(Long.valueOf(gVar.f17320a), Long.valueOf(gVar.f17321b));
                break;
            default:
                g gVar2 = this.f17310c;
                this.f17309b.invoke(Long.valueOf(gVar2.f17320a), Long.valueOf(gVar2.f17321b));
                break;
        }
        return Unit.INSTANCE;
    }
}
