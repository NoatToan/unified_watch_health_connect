package ms;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/l;", "Lu00/c;", "Lns/v;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements u00.c<ns.v> {
    public static boolean b(ns.v vVar) {
        Integer num;
        if (vVar != null) {
            Integer num2 = vVar.f127782a;
            if ((num2 != null ? num2.intValue() : 0) != 0 && ((num2 == null || num2.intValue() != -1) && ((num = vVar.f127783b) == null || num.intValue() != -1))) {
                return true;
            }
        }
        return false;
    }

    @Override // u00.c
    public final /* bridge */ /* synthetic */ boolean a(ns.v vVar) {
        return b(vVar);
    }
}
