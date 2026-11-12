package ae2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0080\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0006\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001f¨\u00066"}, d2 = {"Lae2/k0;", "", "", "", "courseIds", "", "isDefaultName", "Lorg/joda/time/Period;", "duration", "Lae2/l;", "groupTrack", "locale", "name", "Lae2/z;", ModelSourceWrapper.POSITION, "Lae2/e0;", "publisher", "stravaEnabled", "viewable", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lorg/joda/time/Period;Lae2/l;Ljava/lang/String;Ljava/lang/String;Lae2/z;Lae2/e0;Ljava/lang/Boolean;Lorg/joda/time/Period;)V", "a", "Ljava/util/List;", "getCourseIds", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Lorg/joda/time/Period;", "getDuration", "()Lorg/joda/time/Period;", "d", "Lae2/l;", "getGroupTrack", "()Lae2/l;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "f", "getName", "g", "Lae2/z;", "getPosition", "()Lae2/z;", "h", "Lae2/e0;", "getPublisher", "()Lae2/e0;", IntegerTokenConverter.CONVERTER_KEY, "getStravaEnabled", "j", "getViewable", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseIds")
    private final List<String> courseIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultName")
    private final Boolean isDefaultName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    @JsonAdapter(PeriodAdapter.class)
    private final Period duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupTrack")
    private final l groupTrack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final z position;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stravaEnabled")
    private final Boolean stravaEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewable")
    @JsonAdapter(PeriodAdapter.class)
    private final Period viewable;

    public /* synthetic */ k0(List list, Boolean bool, Period period, l lVar, String str, String str2, z zVar, e0 e0Var, Boolean bool2, Period period2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? Boolean.TRUE : bool, (i14 & 4) != 0 ? null : period, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : zVar, (i14 & 128) != 0 ? null : e0Var, (i14 & 256) != 0 ? null : bool2, (i14 & 512) != 0 ? null : period2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.courseIds, k0Var.courseIds) && p005kotlin.jvm.internal.s.g(this.isDefaultName, k0Var.isDefaultName) && p005kotlin.jvm.internal.s.g(this.duration, k0Var.duration) && p005kotlin.jvm.internal.s.g(this.groupTrack, k0Var.groupTrack) && p005kotlin.jvm.internal.s.g(this.locale, k0Var.locale) && p005kotlin.jvm.internal.s.g(this.name, k0Var.name) && p005kotlin.jvm.internal.s.g(this.position, k0Var.position) && p005kotlin.jvm.internal.s.g(this.publisher, k0Var.publisher) && p005kotlin.jvm.internal.s.g(this.stravaEnabled, k0Var.stravaEnabled) && p005kotlin.jvm.internal.s.g(this.viewable, k0Var.viewable);
    }

    public final int hashCode() {
        List<String> list = this.courseIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isDefaultName;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Period period = this.duration;
        int iHashCode3 = (iHashCode2 + (period == null ? 0 : period.hashCode())) * 31;
        l lVar = this.groupTrack;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.locale;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        z zVar = this.position;
        int iHashCode7 = (iHashCode6 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        e0 e0Var = this.publisher;
        int iHashCode8 = (iHashCode7 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Boolean bool2 = this.stravaEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Period period2 = this.viewable;
        return iHashCode9 + (period2 != null ? period2.hashCode() : 0);
    }

    public final String toString() {
        List<String> list = this.courseIds;
        Boolean bool = this.isDefaultName;
        Period period = this.duration;
        l lVar = this.groupTrack;
        String str = this.locale;
        String str2 = this.name;
        z zVar = this.position;
        e0 e0Var = this.publisher;
        Boolean bool2 = this.stravaEnabled;
        Period period2 = this.viewable;
        StringBuilder sb3 = new StringBuilder("SessionRequestDTO(courseIds=");
        sb3.append(list);
        sb3.append(", isDefaultName=");
        sb3.append(bool);
        sb3.append(", duration=");
        sb3.append(period);
        sb3.append(", groupTrack=");
        sb3.append(lVar);
        sb3.append(", locale=");
        sn.a.t(sb3, str, ", name=", str2, ", position=");
        sb3.append(zVar);
        sb3.append(", publisher=");
        sb3.append(e0Var);
        sb3.append(", stravaEnabled=");
        sb3.append(bool2);
        sb3.append(", viewable=");
        sb3.append(period2);
        sb3.append(")");
        return sb3.toString();
    }

    public k0(List<String> list, Boolean bool, Period period, l lVar, String str, String str2, z zVar, e0 e0Var, Boolean bool2, Period period2) {
        this.courseIds = list;
        this.isDefaultName = bool;
        this.duration = period;
        this.groupTrack = lVar;
        this.locale = str;
        this.name = str2;
        this.position = zVar;
        this.publisher = e0Var;
        this.stravaEnabled = bool2;
        this.viewable = period2;
    }

    public k0() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
