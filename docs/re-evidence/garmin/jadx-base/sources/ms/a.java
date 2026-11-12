package ms;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/a;", "Lu00/c;", "Lns/a;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements u00.c<ns.a> {
    public static boolean b(ns.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar.getClimbMode() == to.i.SIMPLE && new a0().a(aVar.getElevationGain())) {
            return true;
        }
        if (aVar.getClimbMode() != to.i.ADVANCED) {
            return false;
        }
        new v();
        return g22.n.d(aVar.getMaxDiffKey());
    }

    @Override // u00.c
    public final /* bridge */ /* synthetic */ boolean a(ns.a aVar) {
        return b(aVar);
    }
}
