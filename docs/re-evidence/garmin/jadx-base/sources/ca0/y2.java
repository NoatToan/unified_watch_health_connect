package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab0.a f26543c;

    public /* synthetic */ y2(int i14, ab0.a aVar, lc.m0 m0Var) {
        this.f26541a = i14;
        this.f26542b = m0Var;
        this.f26543c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26541a) {
            case 0:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.USER_SHORT_NAME));
                break;
            case 1:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.PROFILE_DETAILS_INTRO));
                break;
            case 2:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.HEIGHT));
                break;
            case 3:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.PROFILE_PICTURE));
                break;
            case 4:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.WEIGHT));
                break;
            default:
                lc.y.l(this.f26542b, this.f26543c.y4(u90.a.GENDER));
                break;
        }
        return Unit.INSTANCE;
    }
}
