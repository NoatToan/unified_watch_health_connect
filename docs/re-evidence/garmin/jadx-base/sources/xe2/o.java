package xe2;

import android.app.Activity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxe2/o;", "", "Landroid/app/Activity;", "activity", "Lve2/s;", "skipSigninConfig", "<init>", "(Landroid/app/Activity;Lve2/s;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f190523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.s f190524b;

    public o(Activity activity, ve2.s sVar) {
        activity.getClass();
        this.f190523a = activity;
        this.f190524b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f190523a, oVar.f190523a) && p005kotlin.jvm.internal.s.g(this.f190524b, oVar.f190524b);
    }

    public final int hashCode() {
        int iHashCode = this.f190523a.hashCode() * 31;
        ve2.s sVar = this.f190524b;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        return "AuthenticationActivityConfig(activity=" + this.f190523a + ", skipSigninConfig=" + this.f190524b + ")";
    }

    public /* synthetic */ o(Activity activity, ve2.s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(activity, (i14 & 2) != 0 ? null : sVar);
    }
}
