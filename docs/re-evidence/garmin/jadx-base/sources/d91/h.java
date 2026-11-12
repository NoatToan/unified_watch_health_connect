package d91;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld91/h;", "", "Ld91/a;", "feature", "", "cardTitle", "cardBody", "", "Ld91/k;", "linkParams", "<init>", "(Ld91/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f58540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k> f58543d;

    public h(a aVar, String str, String str2, List<k> list) {
        aVar.getClass();
        this.f58540a = aVar;
        this.f58541b = str;
        this.f58542c = str2;
        this.f58543d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58540a == hVar.f58540a && p005kotlin.jvm.internal.s.g(this.f58541b, hVar.f58541b) && p005kotlin.jvm.internal.s.g(this.f58542c, hVar.f58542c) && p005kotlin.jvm.internal.s.g(this.f58543d, hVar.f58543d);
    }

    public final int hashCode() {
        int iHashCode = this.f58540a.hashCode() * 31;
        String str = this.f58541b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58542c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<k> list = this.f58543d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MessageLink(feature=" + this.f58540a + ", cardTitle=" + this.f58541b + ", cardBody=" + this.f58542c + ", linkParams=" + this.f58543d + ")";
    }
}
