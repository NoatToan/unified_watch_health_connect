package wd2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwd2/f0;", "T", "", "result", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Object;Ljava/lang/Exception;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f184457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f184458b;

    public /* synthetic */ f0(Object obj, Exception exc, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, (i14 & 2) != 0 ? null : exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f184457a, f0Var.f184457a) && p005kotlin.jvm.internal.s.g(this.f184458b, f0Var.f184458b);
    }

    public final int hashCode() {
        T t7 = this.f184457a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        Exception exc = this.f184458b;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "LivetrackResponse(result=" + this.f184457a + ", error=" + this.f184458b + ")";
    }

    public f0(T t7, Exception exc) {
        this.f184457a = t7;
        this.f184458b = exc;
    }
}
