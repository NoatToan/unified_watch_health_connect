package ok0;

import u1.d2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f132469b;

    public /* synthetic */ f(d2 d2Var, int i14) {
        this.f132468a = i14;
        this.f132469b = d2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int intValue;
        switch (this.f132468a) {
            case 0:
                return Boolean.valueOf(this.f132469b.f167433a.getIntValue() > 0);
            case 1:
                intValue = this.f132469b.f167433a.getIntValue();
                break;
            case 2:
                d2 d2Var = this.f132469b;
                return Boolean.valueOf(d2Var.f167433a.getIntValue() < d2Var.f167437e.getIntValue());
            case 3:
                return Boolean.valueOf(this.f132469b.f167433a.getIntValue() > 0);
            default:
                intValue = this.f132469b.f167433a.getIntValue();
                break;
        }
        return Integer.valueOf(intValue);
    }
}
