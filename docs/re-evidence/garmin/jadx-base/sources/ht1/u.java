package ht1;

import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.c f85602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f85603c;

    public /* synthetic */ u(s5.c cVar, e23.a aVar, int i14) {
        this.f85601a = i14;
        this.f85602b = cVar;
        this.f85603c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f85601a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                if (((s5.c.d) h0.d0(this.f85602b.b(iIntValue, iIntValue, "termsOfUse"))) != null) {
                    this.f85603c.invoke();
                }
                break;
            case 1:
                if (((s5.c.d) h0.d0(this.f85602b.b(iIntValue, iIntValue, "ClimbRankingsMessageTag"))) != null) {
                    this.f85603c.invoke();
                }
                break;
            default:
                if (((s5.c.d) h0.d0(this.f85602b.b(iIntValue, iIntValue, "GroupRidePrivacyTag"))) != null) {
                    this.f85603c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
