package rf2;

import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrf2/h;", "", "", TtmlNode.ATTR_ID, "recordIndex", "", "name", "nameHandles", "Lrf2/j;", NotificationConstants.KEY_DATA_MIME_TYPE, "scheduledTime", "description", "descriptionHandles", "durationSeconds", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrf2/j;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f152480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f152484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f152485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f152486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f152487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f152488i;

    public /* synthetic */ h(Integer num, Integer num2, String str, String str2, j jVar, Integer num3, String str3, String str4, Integer num4, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(num, num2, str, (i14 & 8) != 0 ? null : str2, jVar, num3, str3, (i14 & 128) != 0 ? null : str4, num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f152480a, hVar.f152480a) && s.g(this.f152481b, hVar.f152481b) && s.g(this.f152482c, hVar.f152482c) && s.g(this.f152483d, hVar.f152483d) && this.f152484e == hVar.f152484e && s.g(this.f152485f, hVar.f152485f) && s.g(this.f152486g, hVar.f152486g) && s.g(this.f152487h, hVar.f152487h) && s.g(this.f152488i, hVar.f152488i);
    }

    public final int hashCode() {
        Integer num = this.f152480a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f152481b;
        int iJ = wr.g.j((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f152482c);
        String str = this.f152483d;
        int iHashCode2 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f152484e;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num3 = this.f152485f;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f152486g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f152487h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.f152488i;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f152480a, "LiveActivityDeviceWorkout(id=", ", recordIndex=", ", name=", this.f152481b);
        sn.a.t(sbL, this.f152482c, ", nameHandles=", this.f152483d, ", type=");
        sbL.append(this.f152484e);
        sbL.append(", scheduledTime=");
        sbL.append(this.f152485f);
        sbL.append(", description=");
        sn.a.t(sbL, this.f152486g, ", descriptionHandles=", this.f152487h, ", durationSeconds=");
        return f3.i(sbL, this.f152488i, ")");
    }

    public h(Integer num, Integer num2, String str, String str2, j jVar, Integer num3, String str3, String str4, Integer num4) {
        str.getClass();
        this.f152480a = num;
        this.f152481b = num2;
        this.f152482c = str;
        this.f152483d = str2;
        this.f152484e = jVar;
        this.f152485f = num3;
        this.f152486g = str3;
        this.f152487h = str4;
        this.f152488i = num4;
    }
}
