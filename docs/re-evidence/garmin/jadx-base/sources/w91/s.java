package w91;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class s extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public s(Object obj) {
        super(0, obj, ba1.d.class, "acceptPersonalRecordInHistory", "acceptPersonalRecordInHistory()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        ba1.d dVar = (ba1.d) this.receiver;
        r91.k kVar = dVar.f16985k;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = dVar.f16987m;
        ba1.a aVar = new ba1.a(dVar, 0);
        kVar.getClass();
        b0 b0Var = kVar.f151429c;
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new r91.f(kVar, fVar, aVar, null), 2);
        return Unit.INSTANCE;
    }
}
