package iq;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.repcounting.model.d;
import i3.e5;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Liq/c;", "", "", Action.KEY_ATTRIBUTE, "category", "categoryTranslation", "counterPart", "", "isBodyWeight", "exerciseTypeKey", "exerciseTranslation", "", "selectTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;J)V", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exerciseListItemDTO", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f94730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f94731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f94732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f94733h;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(d dVar) {
        dVar.getClass();
        String strG = k.g(dVar.f41102a, dVar.f41106e);
        String str = dVar.f41102a;
        String str2 = str == null ? "" : str;
        String str3 = dVar.f41107f;
        String str4 = str3 == null ? "" : str3;
        String str5 = dVar.f41104c;
        String str6 = str5 == null ? "" : str5;
        boolean z14 = dVar.f41105d;
        String str7 = dVar.f41106e;
        this(strG, str2, str4, str6, z14, str7 == null ? "" : str7, str3 == null ? "" : str3, DateTime.now().getMillis());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f94726a, cVar.f94726a) && s.g(this.f94727b, cVar.f94727b) && s.g(this.f94728c, cVar.f94728c) && s.g(this.f94729d, cVar.f94729d) && this.f94730e == cVar.f94730e && s.g(this.f94731f, cVar.f94731f) && s.g(this.f94732g, cVar.f94732g) && this.f94733h == cVar.f94733h;
    }

    public final int hashCode() {
        return Long.hashCode(this.f94733h) + g.j(g.j(f.g(g.j(g.j(g.j(this.f94726a.hashCode() * 31, 31, this.f94727b), 31, this.f94728c), 31, this.f94729d), 31, this.f94730e), 31, this.f94731f), 31, this.f94732g);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RecentSelectedExercisesEntity(key=", this.f94726a, ", category=", this.f94727b, ", categoryTranslation=");
        sn.a.t(sbI, this.f94728c, ", counterPart=", this.f94729d, ", isBodyWeight=");
        fb1.c.w(", exerciseTypeKey=", this.f94731f, ", exerciseTranslation=", sbI, this.f94730e);
        e5.s(this.f94733h, this.f94732g, ", selectTimestamp=", sbI);
        sbI.append(")");
        return sbI.toString();
    }

    public c(String str, String str2, String str3, String str4, boolean z14, String str5, String str6, long j8) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.f94726a = str;
        this.f94727b = str2;
        this.f94728c = str3;
        this.f94729d = str4;
        this.f94730e = z14;
        this.f94731f = str5;
        this.f94732g = str6;
        this.f94733h = j8;
    }
}
