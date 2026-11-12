package v82;

import a73.k;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import ty1.g2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv82/c;", "", "PageKeyType", "PageDataType", "Lv82/b;", "stateFactory", "<init>", "(Lv82/b;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<PageKeyType, PageDataType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<PageKeyType, PageDataType> f176254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<PageKeyType, a<PageDataType>> f176255b;

    public c(b<PageKeyType, PageDataType> bVar) {
        bVar.getClass();
        this.f176254a = bVar;
        this.f176255b = new ConcurrentHashMap<>();
    }

    public final a a(o82.a aVar) {
        a<PageDataType> aVarComputeIfAbsent = this.f176255b.computeIfAbsent(aVar, new k(new g2(12, this, aVar), 10));
        aVarComputeIfAbsent.getClass();
        return aVarComputeIfAbsent;
    }
}
