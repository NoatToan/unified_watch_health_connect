package qb2;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/o;", "Lvh/a;", "Lpb2/d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o implements vh.a<pb2.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f144246a = new o();

    private o() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.d dVar) {
        pb2.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1(MapboxMap.QFE_LIMIT);
        vh.c.f178267b.a(gVar, zVar, Integer.valueOf(dVar2.f136930a));
    }

    @Override // vh.a
    public final pb2.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        throw new IllegalStateException("Input type used in output position");
    }
}
