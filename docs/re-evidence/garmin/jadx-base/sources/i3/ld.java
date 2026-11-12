package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ld implements e23.q<cb, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f88895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f88896b;

    public ld(boolean z14, uc ucVar) {
        this.f88895a = z14;
        this.f88896b = ucVar;
    }

    @Override // e23.q
    public final Unit invoke(cb cbVar, p3.m mVar, Integer num) {
        cb cbVar2 = cbVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        p3.x1 x1Var = p3.n.f135158a;
        dd.f87874a.b(cbVar2, null, this.f88895a, this.f88896b, null, null, 0.0f, 0.0f, mVar2, (iIntValue & 14) | 100663296);
        return Unit.INSTANCE;
    }
}
