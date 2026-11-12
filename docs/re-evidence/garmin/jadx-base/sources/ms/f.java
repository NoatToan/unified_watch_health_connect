package ms;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/f;", "Lu00/c;", "Lps/g0;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements u00.c<ps.g0> {
    @Override // u00.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(ps.g0 g0Var) {
        if ((g0Var != null ? g0Var.f139822a : null) == null) {
            return false;
        }
        Double d14 = g0Var.f139822a;
        Double d15 = g0Var.f139823b;
        return (Double.isNaN(d14.doubleValue()) || Double.isInfinite(g0Var.f139822a.doubleValue()) || d15 == null || Double.isNaN(d15.doubleValue()) || Double.isInfinite(d15.doubleValue())) ? false : true;
    }
}
