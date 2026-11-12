package my1;

import am.x0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmy1/e;", "", "", "title", "desc", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "courseDTO", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lam/x0;Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f121506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.d f121507d;

    static {
        com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
    }

    public e(String str, String str2, x0 x0Var, com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        str.getClass();
        str2.getClass();
        this.f121504a = str;
        this.f121505b = str2;
        this.f121506c = x0Var;
        this.f121507d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f121504a, eVar.f121504a) && s.g(this.f121505b, eVar.f121505b) && this.f121506c == eVar.f121506c && s.g(this.f121507d, eVar.f121507d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f121504a.hashCode() * 31, 31, this.f121505b);
        x0 x0Var = this.f121506c;
        int iHashCode = (iJ + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.courses.model.d dVar = this.f121507d;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ItemDataActivityType(title=", this.f121504a, ", desc=", this.f121505b, ", activityType=");
        sbI.append(this.f121506c);
        sbI.append(", courseDTO=");
        sbI.append(this.f121507d);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ e(String str, String str2, x0 x0Var, com.garmin.android.apps.connectmobile.courses.model.d dVar, int i14, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : x0Var, (i14 & 8) != 0 ? null : dVar);
    }
}
