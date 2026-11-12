package rj0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrj0/g;", "", "", "imageUrlPath", "lottieUrlPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f152992c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152994b;

    public g(String str, String str2) {
        str.getClass();
        this.f152993a = str;
        this.f152994b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f152993a.equals(gVar.f152993a) && s.g(this.f152994b, gVar.f152994b);
    }

    public final int hashCode() {
        int iHashCode = this.f152993a.hashCode() * 31;
        String str = this.f152994b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("GCPlusMediaContent(imageUrlPath=", this.f152993a, ", lottieUrlPath=", this.f152994b, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
