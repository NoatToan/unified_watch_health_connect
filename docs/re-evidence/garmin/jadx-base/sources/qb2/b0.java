package qb2;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/b0;", "Lvh/a;", "Lpb2/e$n;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 implements vh.a<pb2.e.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f144198a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144199b = p13.x.k("calendarDate", FirebaseAnalytics.Param.SCORE, "classification");

    private b0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.n nVar) {
        pb2.e.n nVar2 = nVar;
        gVar.getClass();
        zVar.getClass();
        nVar2.getClass();
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, nVar2.f137075a);
        gVar.v1(FirebaseAnalytics.Param.SCORE);
        vh.c.f178267b.a(gVar, zVar, Integer.valueOf(nVar2.f137076b));
        gVar.v1("classification");
        vh.c.f178266a.a(gVar, zVar, nVar2.f137077c);
    }

    @Override // vh.a
    public final pb2.e.n b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        Integer num = null;
        String str = null;
        while (true) {
            int iS1 = fVar.S1(f144199b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 1) {
                num = (Integer) vh.c.f178267b.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    dateTime.getClass();
                    num.getClass();
                    int iIntValue = num.intValue();
                    str.getClass();
                    return new pb2.e.n(dateTime, iIntValue, str);
                }
                str = (String) vh.c.f178266a.b(fVar, zVar);
            }
        }
    }
}
