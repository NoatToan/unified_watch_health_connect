package sl0;

import androidx.core.view.j;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lsl0/a;", "", "", TtmlNode.ATTR_ID, "", "courseName", "scoreType", "", "strokes", "holesCompleted", "scoreWithoutHandicap", "startTime", "typeScore", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;I)V", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "d", "I", "h", "()I", "f", "g", IntegerTokenConverter.CONVERTER_KEY, "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    private final String courseName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scoreType")
    private final String scoreType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strokes")
    private final int strokes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("holesCompleted")
    private final int holesCompleted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scoreWithoutHandicap")
    private final int scoreWithoutHandicap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private final String startTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeScore")
    private final int typeScore;

    public a(long j8, String str, String str2, int i14, int i15, int i16, String str3, int i17) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.id = j8;
        this.courseName = str;
        this.scoreType = str2;
        this.strokes = i14;
        this.holesCompleted = i15;
        this.scoreWithoutHandicap = i16;
        this.startTime = str3;
        this.typeScore = i17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHolesCompleted() {
        return this.holesCompleted;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final LocalDate d() {
        DateTime dateTimeQ = k.q(this.startTime, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", null);
        if (dateTimeQ != null) {
            return dateTimeQ.toLocalDate();
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScoreType() {
        return this.scoreType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.id == aVar.id && s.g(this.courseName, aVar.courseName) && s.g(this.scoreType, aVar.scoreType) && this.strokes == aVar.strokes && this.holesCompleted == aVar.holesCompleted && this.scoreWithoutHandicap == aVar.scoreWithoutHandicap && s.g(this.startTime, aVar.startTime) && this.typeScore == aVar.typeScore;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getScoreWithoutHandicap() {
        return this.scoreWithoutHandicap;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getStrokes() {
        return this.strokes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.typeScore) + g.j(q2.d(this.scoreWithoutHandicap, q2.d(this.holesCompleted, q2.d(this.strokes, g.j(g.j(Long.hashCode(this.id) * 31, 31, this.courseName), 31, this.scoreType), 31), 31), 31), 31, this.startTime);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTypeScore() {
        return this.typeScore;
    }

    public final String toString() {
        long j8 = this.id;
        String str = this.courseName;
        String str2 = this.scoreType;
        int i14 = this.strokes;
        int i15 = this.holesCompleted;
        int i16 = this.scoreWithoutHandicap;
        String str3 = this.startTime;
        int i17 = this.typeScore;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "GolfScoreCard(id=", ", courseName=", str);
        sbK.append(", scoreType=");
        sbK.append(str2);
        sbK.append(", strokes=");
        sbK.append(i14);
        j.m(i15, i16, ", holesCompleted=", ", scoreWithoutHandicap=", sbK);
        sbK.append(", startTime=");
        sbK.append(str3);
        sbK.append(", typeScore=");
        sbK.append(i17);
        sbK.append(")");
        return sbK.toString();
    }
}
