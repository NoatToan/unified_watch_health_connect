package g2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f75071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f75072c;

    public /* synthetic */ d(e eVar, f fVar, int i14) {
        this.f75070a = i14;
        this.f75071b = eVar;
        this.f75072c = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f75070a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                this.f75071b.h(this.f75072c, iIntValue, iIntValue2);
                break;
            default:
                this.f75071b.h(this.f75072c, iIntValue, iIntValue2);
                break;
        }
        return Unit.INSTANCE;
    }
}
