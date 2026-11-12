package sk2;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsk2/g;", "Lsk2/b;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, p<byte[], UUID>> f159964a = new ConcurrentHashMap<>();

    @Override // sk2.b
    public final Object a(rs2.c cVar, v13.c cVar2) {
        p<byte[], UUID> pVar = this.f159964a.get(cVar.getF172493a());
        return pVar == null ? new p(null, null) : pVar;
    }

    @Override // sk2.b
    public final Object b(rs2.c cVar, p<byte[], UUID> pVar, t13.d<? super Unit> dVar) {
        this.f159964a.put(cVar.getF172493a(), pVar);
        return Unit.INSTANCE;
    }
}
