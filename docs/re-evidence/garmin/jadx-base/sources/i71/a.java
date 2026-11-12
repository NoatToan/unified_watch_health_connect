package i71;

import java.util.Collection;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li71/a;", "", "Li71/c;", "getMostRecentTrainingStatusDataUseCase", "<init>", "(Li71/c;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f91955a;

    public a(c cVar) {
        cVar.getClass();
        this.f91955a = cVar;
    }

    public final o61.n a(String str, String str2) {
        Map<Long, o61.n> mapC;
        Collection<o61.n> collectionValues;
        o61.n nVarA;
        o61.f fVar = (o61.f) this.f91955a.a((String) p13.u.L(0, new String[]{str}), new b());
        if (fVar != null && (nVarA = fVar.a()) != null) {
            return nVarA;
        }
        if (fVar == null || (mapC = fVar.c()) == null || (collectionValues = mapC.values()) == null || !(!collectionValues.isEmpty()) || str2 == null) {
            return null;
        }
        return fVar.b(str2);
    }
}
