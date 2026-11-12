package q40;

import b71.i;
import com.garmin.android.apps.connectmobile.courses.model.f;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lq40/a;", "", "", TtmlNode.ATTR_ID, "", "name", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", NotificationConstants.KEY_DATA_MIME_TYPE, "distance", "note", "restDuration", "cutoffDuration", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f142567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f142569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f142570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f142572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f142573g;

    public /* synthetic */ a(Long l14, String str, f fVar, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, str, fVar, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f142567a, aVar.f142567a) && s.g(this.f142568b, aVar.f142568b) && this.f142569c == aVar.f142569c && s.g(this.f142570d, aVar.f142570d) && s.g(this.f142571e, aVar.f142571e) && s.g(this.f142572f, aVar.f142572f) && s.g(this.f142573g, aVar.f142573g);
    }

    public final int hashCode() {
        Long l14 = this.f142567a;
        int iJ = g.j((this.f142569c.hashCode() + g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f142568b)) * 31, 31, this.f142570d);
        String str = this.f142571e;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f142572f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f142573g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = i.j("CoursePointCardUiState(id=", ", name=", this.f142568b, this.f142567a, ", type=");
        sbJ.append(this.f142569c);
        sbJ.append(", distance=");
        sbJ.append(this.f142570d);
        sbJ.append(", note=");
        sn.a.t(sbJ, this.f142571e, ", restDuration=", this.f142572f, ", cutoffDuration=");
        return am.j.o(this.f142573g, ")", sbJ);
    }

    public a(Long l14, String str, f fVar, String str2, String str3, String str4, String str5) {
        str.getClass();
        fVar.getClass();
        str2.getClass();
        this.f142567a = l14;
        this.f142568b = str;
        this.f142569c = fVar;
        this.f142570d = str2;
        this.f142571e = str3;
        this.f142572f = str4;
        this.f142573g = str5;
    }
}
