package ms;

import c22.l3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/j0;", "Lu00/c;", "Lls/h;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements u00.c<ls.h> {
    public static boolean b(ls.h hVar) {
        int iS;
        boolean isUsingMetric = hVar != null ? hVar.getIsUsingMetric() : ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        if (hVar == null) {
            iS = 0;
        } else {
            l3.a aVar = l3.f23124b;
            double pace = hVar.getPace();
            int perValue = hVar.getPerValue();
            aVar.getClass();
            iS = l3.a.s(perValue, pace, isUsingMetric);
        }
        return (hVar == null || Double.isNaN(hVar.getPace()) || Double.isInfinite(hVar.getPace()) || hVar.getPace() < 0.0d || !(iS >= 0 && iS < 3599)) ? false : true;
    }

    @Override // u00.c
    public final /* bridge */ /* synthetic */ boolean a(ls.h hVar) {
        return b(hVar);
    }
}
