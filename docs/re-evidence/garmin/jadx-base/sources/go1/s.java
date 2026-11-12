package go1;

import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgo1/s;", "", "Lds1/a;", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Lds1/a;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds1.a f78309a;

    static {
        int i14 = ds1.a.f61090f;
    }

    public s(ds1.a aVar) {
        aVar.getClass();
        this.f78309a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f78309a.equals(((s) obj).f78309a);
    }

    public final int hashCode() {
        return this.f78309a.hashCode();
    }

    public final String toString() {
        return "CommentEditInsertTagPayload(tag=" + this.f78309a + ")";
    }
}
