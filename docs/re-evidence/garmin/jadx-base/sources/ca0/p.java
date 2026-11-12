package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ga0.a f26402c;

    public /* synthetic */ p(lc.m0 m0Var, ga0.a aVar, int i14) {
        this.f26400a = i14;
        this.f26401b = m0Var;
        this.f26402c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26400a) {
            case 0:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.LANGUAGE_SELECTION));
                break;
            case 1:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.ACTIVITY_OPTIONS));
                break;
            case 2:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.BUTTON_DIRECTION));
                break;
            case 3:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.DEVICE_SCREEN_ORIENTATION));
                break;
            case 4:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.WRIST_SELECTION));
                break;
            case 5:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.WEAR_LOCATION));
                break;
            case 6:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.BIKE_WHEEL_CIRCUMFERENCE));
                break;
            case 7:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.LTE_SUBSCRIPTION_TRANSFER));
                break;
            case 8:
                i0 i0VarZ4 = this.f26402c.z4(j90.e.LTE_SUBSCRIPTION_TRANSFER);
                this.f26401b.h(new k(11), i0VarZ4);
                break;
            default:
                lc.y.l(this.f26401b, this.f26402c.z4(j90.e.BIKE_WHEEL_CIRCUMFERENCE));
                break;
        }
        return Unit.INSTANCE;
    }
}
