package tf;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;
import sf.m;
import sf.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltf/a;", "Lsf/b;", "<init>", "()V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements sf.b {
    @Override // sf.b
    public final sf.b.C2996b a(p pVar) {
        return new sf.b.C2996b(pVar);
    }

    @Override // sf.b
    public final sf.b.c b(p pVar, p pVar2) {
        if (pVar2.f158814a != 304 || pVar == null) {
            return new sf.b.c(pVar2);
        }
        m mVar = pVar.f158817d;
        m mVar2 = pVar2.f158817d;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        for (Map.Entry<String, List<String>> entry : mVar2.f158807a.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            String lowerCase = key.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            aVar.f158808a.put(lowerCase, h0.d1(value));
        }
        return new sf.b.c(new p(pVar2.f158814a, pVar2.f158815b, pVar2.f158816c, aVar.b(), null, pVar2.f158819f));
    }
}
