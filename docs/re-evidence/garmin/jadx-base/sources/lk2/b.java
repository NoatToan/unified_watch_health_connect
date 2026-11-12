package lk2;

import com.garmin.proto.generated.GDICore;
import java.util.Collection;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public interface b extends dt2.a {
    Object a(UUID uuid, v13.c cVar);

    c0 b(UUID uuid, String str, int i14, wk2.e eVar, boolean z14);

    c0 e(UUID uuid, String str, int i14, wk2.e eVar, boolean z14);

    Object f(UUID uuid, Integer num, v13.i iVar);

    /* JADX INFO: renamed from: g */
    GDICore.FeatureCapabilitiesResponse getF50734j();

    Object h(v vVar, v13.c cVar);

    Object i(UUID uuid, Collection collection, gl2.g gVar);

    c0 j(UUID uuid, int i14, long j8, long j14, wk2.d dVar, boolean z14);

    Object k(UUID uuid, bl2.l lVar);

    Object n(UUID uuid, long j8, bl2.t tVar);

    Object o(UUID uuid, Collection collection, v13.c cVar);
}
