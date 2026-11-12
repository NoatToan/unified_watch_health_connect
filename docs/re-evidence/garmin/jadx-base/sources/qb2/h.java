package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/h;", "Lvh/a;", "Lpb2/b$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements vh.a<pb2.b.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f144220a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144221b = p13.x.k("activityType", "streakStartLocalDate");

    private h() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.b.d dVar) {
        pb2.b.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("activityType");
        vh.c.f178266a.a(gVar, zVar, dVar2.f136919a);
        gVar.v1("streakStartLocalDate");
        ub2.s.f169889a.getClass();
        new vh.k0(zVar.d(ub2.s.f169890b)).a(gVar, zVar, dVar2.f136920b);
    }

    @Override // vh.a
    public final pb2.b.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        String str = null;
        DateTime dateTime = null;
        while (true) {
            int iS1 = fVar.S1(f144221b);
            if (iS1 == 0) {
                str = (String) vh.c.f178266a.b(fVar, zVar);
            } else {
                if (iS1 != 1) {
                    str.getClass();
                    return new pb2.b.d(str, dateTime);
                }
                ub2.s.f169889a.getClass();
                vh.a aVarD = zVar.d(ub2.s.f169890b);
                vh.c.g gVar = vh.c.f178266a;
                dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
            }
        }
    }
}
