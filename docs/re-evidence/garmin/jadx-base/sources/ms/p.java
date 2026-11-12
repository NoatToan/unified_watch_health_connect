package ms;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/p;", "Lu00/c;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements u00.c<Double> {
    @Override // u00.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue()) || d14.doubleValue() < 30.0d) ? false : true;
    }
}
