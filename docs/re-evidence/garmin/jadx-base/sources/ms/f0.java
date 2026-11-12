package ms;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/f0;", "Lu00/c;", "Lls/f;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements u00.c<ls.f> {
    public static boolean b(ls.f fVar) {
        Double dValueOf = null;
        if ((fVar != null ? Double.valueOf(fVar.getPercentage()) : null) != null && !Double.isNaN(fVar.getPercentage())) {
            dValueOf = Double.valueOf(fVar.getPercentage());
        }
        return dValueOf != null;
    }

    @Override // u00.c
    public final /* bridge */ /* synthetic */ boolean a(ls.f fVar) {
        return b(fVar);
    }
}
