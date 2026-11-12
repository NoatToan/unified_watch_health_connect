package kf;

import ch.qos.logback.core.CoreConstants;
import o53.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkf/e;", "Lkf/g;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lt13/g;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends g {
    public e(t13.g gVar) {
        super(gVar);
    }

    @Override // kf.g
    public final e b(g gVar, t13.g gVar2) {
        j.a aVar = j.f104590a;
        z.Companion companion = z.INSTANCE;
        z zVar = (z) gVar.get(companion);
        z zVar2 = (z) gVar2.get(companion);
        if ((zVar instanceof f) && !zVar.equals(zVar2)) {
            ((f) zVar).f104580b = 0;
        }
        return new e(gVar2);
    }
}
