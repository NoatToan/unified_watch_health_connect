package mn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f119809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f119810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn2.i f119811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f119812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f119813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f119814h;

    public /* synthetic */ h(String str, long j8, tn2.i iVar, e23.l lVar, String str2, int i14, e23.l lVar2) {
        this.f119807a = 3;
        this.f119808b = str;
        this.f119810d = j8;
        this.f119811e = iVar;
        this.f119812f = lVar;
        this.f119813g = str2;
        this.f119809c = i14;
        this.f119814h = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f119807a;
        long j8 = this.f119810d;
        switch (i14) {
            case 0:
                ((Long) obj).getClass();
                Logger logger = j.f119822a;
                StringBuilder sb3 = new StringBuilder();
                String str = this.f119808b;
                sb3.append(str);
                sb3.append(" [");
                int i15 = this.f119809c;
                sb3.append(i15);
                sb3.append(" time retry after ");
                sb3.append(j8);
                sb3.append(" milliSec][");
                tn2.i iVar = this.f119811e;
                sb3.append(iVar);
                sb3.append("] ");
                logger.trace(sb3.toString());
                e23.l lVar = this.f119812f;
                String str2 = this.f119813g;
                q03.r rVar = (q03.r) lVar.invoke(str2);
                e eVar = new e(new i(str, i15, iVar, str2, this.f119814h, lVar, 1), 15);
                rVar.getClass();
                int i16 = w03.b.f181178a;
                return new e13.j(rVar, eVar);
            case 1:
                ((Long) obj).getClass();
                Logger logger2 = j.f119822a;
                StringBuilder sb4 = new StringBuilder();
                String str3 = this.f119808b;
                sb4.append(str3);
                sb4.append(":[");
                int i17 = this.f119809c;
                sb4.append(i17);
                sb4.append(" time retry after ");
                sb4.append(j8);
                sb4.append(" milliSec][");
                tn2.i iVar2 = this.f119811e;
                sb4.append(iVar2);
                sb4.append("]");
                logger2.trace(sb4.toString());
                e23.l lVar2 = this.f119812f;
                String str4 = this.f119813g;
                q03.r rVar2 = (q03.r) lVar2.invoke(str4);
                e eVar2 = new e(new i(str3, i17, iVar2, str4, this.f119814h, lVar2, 3), 17);
                rVar2.getClass();
                int i18 = w03.b.f181178a;
                return new e13.j(rVar2, eVar2);
            case 2:
                ((Long) obj).getClass();
                Logger logger3 = j.f119822a;
                StringBuilder sb5 = new StringBuilder();
                String str5 = this.f119808b;
                sb5.append(str5);
                sb5.append(" [");
                int i19 = this.f119809c;
                sb5.append(i19);
                sb5.append(" time retry after ");
                sb5.append(j8);
                sb5.append(" milliSec][");
                tn2.i iVar3 = this.f119811e;
                sb5.append(iVar3);
                sb5.append("] ");
                logger3.trace(sb5.toString());
                e23.l lVar3 = this.f119812f;
                String str6 = this.f119813g;
                q03.r rVar3 = (q03.r) lVar3.invoke(str6);
                e eVar3 = new e(new i(str5, i19, iVar3, str6, this.f119814h, lVar3, 0), 14);
                rVar3.getClass();
                int i24 = w03.b.f181178a;
                return new e13.j(rVar3, eVar3);
            default:
                ((Long) obj).getClass();
                Logger logger4 = j.f119822a;
                StringBuilder sb6 = new StringBuilder();
                String str7 = this.f119808b;
                sb6.append(str7);
                sb6.append(" [Retry after ");
                sb6.append(j8);
                sb6.append(" milliSec][");
                tn2.i iVar4 = this.f119811e;
                sb6.append(iVar4);
                sb6.append("]");
                logger4.trace(sb6.toString());
                e23.l lVar4 = this.f119812f;
                String str8 = this.f119813g;
                q03.r rVar4 = (q03.r) lVar4.invoke(str8);
                e eVar4 = new e(new i(str7, this.f119809c, iVar4, str8, this.f119814h, lVar4, 2), 16);
                rVar4.getClass();
                int i25 = w03.b.f181178a;
                return new e13.j(rVar4, eVar4);
        }
    }

    public /* synthetic */ h(String str, int i14, long j8, tn2.i iVar, e23.l lVar, String str2, e23.l lVar2, int i15) {
        this.f119807a = i15;
        this.f119808b = str;
        this.f119809c = i14;
        this.f119810d = j8;
        this.f119811e = iVar;
        this.f119812f = lVar;
        this.f119813g = str2;
        this.f119814h = lVar2;
    }
}
