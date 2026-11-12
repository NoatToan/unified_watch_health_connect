package ky1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lky1/b;", "T", "", "result", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "isComplete", "hasHandledResult", "hasDisplayedError", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;ZZZ)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f107775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f107776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f107778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f107779e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(Object obj, Throwable th3, boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        obj = (i14 & 1) != 0 ? null : obj;
        th3 = (i14 & 2) != 0 ? null : th3;
        this(obj, th3, (i14 & 4) != 0 ? (obj == null && th3 == null) ? false : true : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f107775a, bVar.f107775a) && s.g(this.f107776b, bVar.f107776b) && this.f107777c == bVar.f107777c && this.f107778d == bVar.f107778d && this.f107779e == bVar.f107779e;
    }

    public final int hashCode() {
        T t7 = this.f107775a;
        int iHashCode = (t7 == null ? 0 : t7.hashCode()) * 31;
        Throwable th3 = this.f107776b;
        return Boolean.hashCode(this.f107779e) + f.g(f.g((iHashCode + (th3 != null ? th3.hashCode() : 0)) * 31, 31, this.f107777c), 31, this.f107778d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ServerResponse(result=");
        sb3.append(this.f107775a);
        sb3.append(", error=");
        sb3.append(this.f107776b);
        sb3.append(", isComplete=");
        kg.f.q(", hasHandledResult=", ", hasDisplayedError=", sb3, this.f107777c, this.f107778d);
        return hb.a.k(sb3, this.f107779e, ")");
    }

    public b(T t7, Throwable th3, boolean z14, boolean z15, boolean z16) {
        this.f107775a = t7;
        this.f107776b = th3;
        this.f107777c = z14;
        this.f107778d = z15;
        this.f107779e = z16;
    }

    public b() {
        this(null, null, false, false, false, 31, null);
    }
}
