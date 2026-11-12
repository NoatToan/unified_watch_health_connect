package jn1;

import e23.l;
import km1.v;
import p005kotlin.Unit;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f99605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f99606c;

    public /* synthetic */ a(s sVar, km1.c cVar, int i14) {
        this.f99604a = i14;
        this.f99605b = sVar;
        this.f99606c = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f99604a) {
            case 0:
                str.getClass();
                v dailySleep = this.f99606c.getDailySleep();
                this.f99605b.I4(str, dailySleep != null ? v.r(dailySleep) : null);
                break;
            default:
                str.getClass();
                v dailySleep2 = this.f99606c.getDailySleep();
                this.f99605b.I4(str, dailySleep2 != null ? v.r(dailySleep2) : null);
                break;
        }
        return Unit.INSTANCE;
    }
}
