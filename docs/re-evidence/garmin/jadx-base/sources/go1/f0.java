package go1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgo1/f0;", "", "Lgo1/w;", "headerItem", "<init>", "(Lgo1/w;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f78236a;

    public f0(w wVar) {
        wVar.getClass();
        this.f78236a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f78236a.equals(((f0) obj).f78236a);
    }

    public final int hashCode() {
        return this.f78236a.hashCode();
    }

    public final String toString() {
        return "HeaderMediaChangePayload(headerItem=" + this.f78236a + ")";
    }
}
