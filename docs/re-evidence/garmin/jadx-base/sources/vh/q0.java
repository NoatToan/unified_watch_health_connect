package vh;

import com.apollographql.apollo3.exception.JsonDataException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvh/q0;", "T", "Lvh/a;", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class q0<T> implements a<T> {
    @Override // vh.a
    public final void a(zh.g gVar, z zVar, T t7) {
        gVar.getClass();
        zVar.getClass();
        if (gVar instanceof zh.i) {
            ((zh.i) gVar).e(t7);
        } else {
            vb.h.z("UnsafeAdapter only supports MapJsonWriter");
        }
    }

    @Override // vh.a
    public final T b(zh.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        if (!(fVar instanceof zh.h)) {
            vb.h.z("UnsafeAdapter only supports MapJsonReader");
            return null;
        }
        zh.h hVar = (zh.h) fVar;
        T t7 = (T) hVar.f204760d;
        if (t7 == null) {
            throw new JsonDataException("Expected a non-null value at path ".concat(hVar.e()));
        }
        hVar.a();
        return t7;
    }
}
