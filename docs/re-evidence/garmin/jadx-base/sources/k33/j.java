package k33;

import java.util.LinkedHashMap;
import l33.d1;
import o33.u;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f102789a;

    public j(k kVar) {
        this.f102789a = kVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        k kVar = this.f102789a;
        LinkedHashMap linkedHashMap = kVar.f102793d;
        t23.l lVar = kVar.f102791b;
        Integer num = (Integer) linkedHashMap.get(uVar);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        i iVar = kVar.f102790a;
        return new d1(ge1.b.q(new i(iVar.f102785a, kVar, iVar.f102787c), lVar.getAnnotations()), uVar, kVar.f102792c + iIntValue, lVar);
    }
}
