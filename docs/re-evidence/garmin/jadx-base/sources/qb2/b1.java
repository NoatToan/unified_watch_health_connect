package qb2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/b1;", "Lvh/a;", "Lpb2/h;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b1 implements vh.a<pb2.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f144200a = new b1();

    private b1() {
    }

    public static void c(zh.g gVar, vh.z zVar, pb2.h hVar) {
        gVar.getClass();
        zVar.getClass();
        hVar.getClass();
        gVar.v1("date");
        ub2.s.f169889a.getClass();
        zVar.d(ub2.s.f169890b).a(gVar, zVar, hVar.f137156a);
        gVar.v1(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        vh.c.g gVar2 = vh.c.f178266a;
        gVar2.a(gVar, zVar, hVar.f137157b);
        gVar.v1("firstDayOfWeek");
        gVar2.a(gVar, zVar, hVar.f137158c);
    }

    @Override // vh.a
    public final /* bridge */ /* synthetic */ void a(zh.g gVar, vh.z zVar, pb2.h hVar) {
        c(gVar, zVar, hVar);
    }

    @Override // vh.a
    public final pb2.h b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
