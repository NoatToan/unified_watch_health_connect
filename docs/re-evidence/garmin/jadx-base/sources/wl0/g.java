package wl0;

import o53.s0;
import org.joda.time.DateTimeConstants;
import wl0.h.c;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f185922b;

    public /* synthetic */ g(h hVar, int i14) {
        this.f185921a = i14;
        this.f185922b = hVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f185921a;
        h hVar = this.f185922b;
        switch (i14) {
            case 0:
                h hVar2 = h.f185925k;
                ql0.b.a aVar = ql0.b.f145209b;
                aVar.getClass();
                ql0.b bVarA = ql0.b.a.a(aVar);
                h.c cVar = hVar.new c();
                d80.c cVar2 = new d80.c(qd2.a.b.CLUB_TYPE_LIST, DateTimeConstants.MINUTES_PER_DAY);
                qc.c cVar3 = new qc.c(14);
                c83.d<String> dVarG = bVarA.f145210a.g(true);
                x53.c cVar4 = s0.f129406a;
                return ge1.b.e0(x53.b.f189152a, new ql0.d(cVar2, cVar3, bVarA, dVarG, null), cVar);
            default:
                h hVar3 = h.f185925k;
                ql0.b.a aVar2 = ql0.b.f145209b;
                aVar2.getClass();
                ql0.b bVarA2 = ql0.b.a.a(aVar2);
                i iVar = new i(hVar);
                d80.c cVar5 = new d80.c(qd2.a.b.CLUB_LIST, 15);
                qc.c cVar6 = new qc.c(13);
                c83.d<String> dVarE = bVarA2.f145210a.e(false, false, false, true);
                x53.c cVar7 = s0.f129406a;
                return ge1.b.e0(x53.b.f189152a, new ql0.d(cVar5, cVar6, bVarA2, dVarE, null), iVar);
        }
    }
}
