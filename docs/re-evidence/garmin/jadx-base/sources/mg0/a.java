package mg0;

import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmg0/a;", "", "", "name", "description", "Lb92/a;", "descriptor", "", "imageRes", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "legTarget", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/c;", "customLegGoal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb92/a;ILcom/garmin/android/apps/connectmobile/workouts/data/model/k;Lcom/garmin/android/apps/connectmobile/workouts/data/model/c;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f118363g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b92.a f118366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f118367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f118368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.c f118369f;

    static {
        int i14 = b92.a.f16960b;
    }

    public /* synthetic */ a(String str, String str2, b92.a aVar, int i14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, int i15, j jVar) {
        this(str, str2, aVar, i14, (i15 & 16) != 0 ? null : kVar, (i15 & 32) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f118364a, aVar.f118364a) && s.g(this.f118365b, aVar.f118365b) && s.g(this.f118366c, aVar.f118366c) && this.f118367d == aVar.f118367d && s.g(this.f118368e, aVar.f118368e) && s.g(this.f118369f, aVar.f118369f);
    }

    public final int hashCode() {
        int iJ = g.j(this.f118364a.hashCode() * 31, 31, this.f118365b);
        b92.a aVar = this.f118366c;
        int iD = q2.d(this.f118367d, (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        k kVar = this.f118368e;
        int iHashCode = (iD + (kVar == null ? 0 : kVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = this.f118369f;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EventLegItem(name=", this.f118364a, ", description=", this.f118365b, ", descriptor=");
        sbI.append(this.f118366c);
        sbI.append(", imageRes=");
        sbI.append(this.f118367d);
        sbI.append(", legTarget=");
        sbI.append(this.f118368e);
        sbI.append(", customLegGoal=");
        sbI.append(this.f118369f);
        sbI.append(")");
        return sbI.toString();
    }

    public a(String str, String str2, b92.a aVar, int i14, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar) {
        str.getClass();
        str2.getClass();
        this.f118364a = str;
        this.f118365b = str2;
        this.f118366c = aVar;
        this.f118367d = i14;
        this.f118368e = kVar;
        this.f118369f = cVar;
    }
}
