package ci;

import com.apollographql.apollo3.exception.CacheMissException;
import java.util.Map;
import p005kotlin.Metadata;
import vh.e0;
import vh.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/f;", "Lci/e;", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27599a = new f();

    private f() {
    }

    @Override // ci.e
    public final Object a(q qVar, e0.b bVar, Map<String, Object> map, String str) {
        str.getClass();
        String strA = qVar.a(bVar);
        if (map.containsKey(strA)) {
            return map.get(strA);
        }
        throw new CacheMissException(str, strA);
    }
}
