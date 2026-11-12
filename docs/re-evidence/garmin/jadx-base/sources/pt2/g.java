package pt2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001B%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpt2/g;", "", "T", "result", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Object;Ljava/lang/Exception;)V", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f141042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f141043b;

    public /* synthetic */ g(Object obj, Exception exc, int i14, j jVar) {
        this(obj, (i14 & 2) != 0 ? null : exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f141042a, gVar.f141042a) && s.g(this.f141043b, gVar.f141043b);
    }

    public final int hashCode() {
        T t7 = this.f141042a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        Exception exc = this.f141043b;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "LivetrackResult(result=" + this.f141042a + ", error=" + this.f141043b + ")";
    }

    public g(T t7, Exception exc) {
        this.f141042a = t7;
        this.f141043b = exc;
    }
}
