package d52;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final z42.h a(n91.a aVar) {
        z42.h.a aVar2;
        long typeId = aVar.getTypeId();
        if (typeId == q91.d.M0.f143579a) {
            aVar2 = z42.h.a.C3773a.f202402a;
        } else {
            q91.d.f143558e.getClass();
            aVar2 = q91.d.f143560g.contains(Long.valueOf(typeId)) ? z42.h.a.b.f202403a : null;
        }
        z42.h.a aVar3 = aVar2;
        Long prStartTimeLocal = aVar.getPrStartTimeLocal();
        return new z42.h(aVar3, prStartTimeLocal != null ? prStartTimeLocal.longValue() : 0L, aVar.getValue());
    }
}
