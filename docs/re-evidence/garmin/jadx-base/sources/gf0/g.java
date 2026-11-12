package gf0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgf0/g;", "", "", "dataStorageAndProcessingGranted", "deviceDataUploadGranted", "ghsAccountCreated", "mfaValid", "mfaExpired", "<init>", "(ZZZZZ)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f77068e;

    public /* synthetic */ g(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f77064a == gVar.f77064a && this.f77065b == gVar.f77065b && this.f77066c == gVar.f77066c && this.f77067d == gVar.f77067d && this.f77068e == gVar.f77068e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77068e) + q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f77064a) * 31, 31, this.f77065b), 31, this.f77066c), 31, this.f77067d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("EcgSetupStatus(dataStorageAndProcessingGranted=", ", deviceDataUploadGranted=", ", ghsAccountCreated=", this.f77064a, this.f77065b);
        kg.f.q(", mfaValid=", ", mfaExpired=", sbM, this.f77066c, this.f77067d);
        return hb.a.k(sbM, this.f77068e, ")");
    }

    public g(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f77064a = z14;
        this.f77065b = z15;
        this.f77066c = z16;
        this.f77067d = z17;
        this.f77068e = z18;
    }

    public g() {
        this(false, false, false, false, false, 31, null);
    }
}
