package cx0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcx0/a;", "T", "", "response", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "code", "", "hasDisplayedError", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Integer;Z)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f56599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f56600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f56601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56602d;

    public /* synthetic */ a(Object obj, Throwable th3, Integer num, boolean z14, int i14, j jVar) {
        this(obj, th3, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f56599a, aVar.f56599a) && s.g(this.f56600b, aVar.f56600b) && s.g(this.f56601c, aVar.f56601c) && this.f56602d == aVar.f56602d;
    }

    public final int hashCode() {
        T t7 = this.f56599a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        Throwable th3 = this.f56600b;
        int iHashCode2 = (iHashCode + (th3 == null ? 0 : th3.hashCode())) * 31;
        Integer num = this.f56601c;
        return Boolean.hashCode(this.f56602d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ServerResponse(response=" + this.f56599a + ", error=" + this.f56600b + ", code=" + this.f56601c + ", hasDisplayedError=" + this.f56602d + ")";
    }

    public a(T t7, Throwable th3, Integer num, boolean z14) {
        this.f56599a = t7;
        this.f56600b = th3;
        this.f56601c = num;
        this.f56602d = z14;
    }
}
