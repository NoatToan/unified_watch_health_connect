package nw0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f128063b;

    public /* synthetic */ m(r rVar, int i14) {
        this.f128062a = i14;
        this.f128063b = rVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f128062a) {
            case 0:
                this.f128063b.D4(((Long) obj).longValue());
                break;
            case 1:
                this.f128063b.z4(((Long) obj).longValue());
                break;
            case 2:
                this.f128063b.D4(((Long) obj).longValue());
                break;
            case 3:
                this.f128063b.D4(((Long) obj).longValue());
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.f128063b.B4(new j0.b(str));
                break;
        }
        return Unit.INSTANCE;
    }
}
