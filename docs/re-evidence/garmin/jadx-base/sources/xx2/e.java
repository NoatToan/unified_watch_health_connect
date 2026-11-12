package xx2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001B%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxx2/e;", "", "T", "result", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Object;Ljava/lang/Exception;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f192598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f192599b;

    public /* synthetic */ e(Object obj, Exception exc, int i14, j jVar) {
        this(obj, (i14 & 2) != 0 ? null : exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f192598a, eVar.f192598a) && s.g(this.f192599b, eVar.f192599b);
    }

    public final int hashCode() {
        T t7 = this.f192598a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        Exception exc = this.f192599b;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionResult(result=" + this.f192598a + ", error=" + this.f192599b + ")";
    }

    public e(T t7, Exception exc) {
        this.f192598a = t7;
        this.f192599b = exc;
    }
}
