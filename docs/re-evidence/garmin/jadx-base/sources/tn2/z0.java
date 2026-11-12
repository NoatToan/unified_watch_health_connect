package tn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class z0 implements e23.l<String, q03.v<? extends y0.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.i f165751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f165752b;

    public z0(rn2.i iVar, boolean z14) {
        this.f165751a = iVar;
        this.f165752b = z14;
    }

    @Override // e23.l
    public final q03.v<? extends y0.c> invoke(String str) {
        str.getClass();
        rn2.i iVar = this.f165751a;
        boolean zEquals = str.equals(iVar.getCid());
        boolean z14 = this.f165752b;
        if (zEquals) {
            return p005kotlin.jvm.internal.s.g(iVar.getCardStatuses().getCardStatus(), "Deleted") ? q03.r.f(new y0.c(iVar, z14, y0.a.NEED_REFUND)) : q03.r.f(new y0.c(iVar, z14, null));
        }
        return q03.r.f(new y0.c(iVar, z14, y0.a.NEED_DELETION_AND_CALL_CENTER));
    }
}
