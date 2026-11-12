package fg0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.EventEnumTypeAdapter$EventTypeAdapter;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b\u001c\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lfg0/e;", "", "", TtmlNode.ATTR_ID, "", "eventName", "Lorg/joda/time/LocalDate;", "date", "Lfg0/d;", "completionTarget", "Lfg0/r;", "eventTimeLocal", "eventImageUUID", "Lfg0/y;", "locationStartPoint", "Lgg0/f;", "eventType", "shareableEventUuid", "Lfg0/j;", "eventCustomization", "", "eventOrganizer", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/LocalDate;Lfg0/d;Lfg0/r;Ljava/lang/String;Lfg0/y;Lgg0/f;Ljava/lang/String;Lfg0/j;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "Lfg0/d;", "getCompletionTarget", "()Lfg0/d;", JWKParameterNames.RSA_EXPONENT, "Lfg0/r;", "()Lfg0/r;", "f", "Lfg0/y;", IntegerTokenConverter.CONVERTER_KEY, "()Lfg0/y;", "h", "Lgg0/f;", "()Lgg0/f;", "j", "setShareableEventUuid", "(Ljava/lang/String;)V", "Lfg0/j;", "()Lfg0/j;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "getEventOrganizer", "()Ljava/lang/Boolean;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private final String eventName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate date;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTarget")
    private final d completionTarget;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTimeLocal")
    private final r eventTimeLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageUUID")
    private final String eventImageUUID;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationStartPoint")
    private final y locationStartPoint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    @JsonAdapter(EventEnumTypeAdapter$EventTypeAdapter.class)
    private final gg0.f eventType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareableEventUuid")
    private String shareableEventUuid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventCustomization")
    private final j eventCustomization;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventOrganizer")
    private final Boolean eventOrganizer;

    public /* synthetic */ e(Long l14, String str, LocalDate localDate, d dVar, r rVar, String str2, y yVar, gg0.f fVar, String str3, j jVar, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : localDate, (i14 & 8) != 0 ? null : dVar, (i14 & 16) != 0 ? null : rVar, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : yVar, (i14 & 128) != 0 ? null : fVar, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : jVar, (i14 & 1024) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getEventCustomization() {
        return this.eventCustomization;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventImageUUID() {
        return this.eventImageUUID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r getEventTimeLocal() {
        return this.eventTimeLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.id, eVar.id) && p005kotlin.jvm.internal.s.g(this.eventName, eVar.eventName) && p005kotlin.jvm.internal.s.g(this.date, eVar.date) && p005kotlin.jvm.internal.s.g(this.completionTarget, eVar.completionTarget) && p005kotlin.jvm.internal.s.g(this.eventTimeLocal, eVar.eventTimeLocal) && p005kotlin.jvm.internal.s.g(this.eventImageUUID, eVar.eventImageUUID) && p005kotlin.jvm.internal.s.g(this.locationStartPoint, eVar.locationStartPoint) && this.eventType == eVar.eventType && p005kotlin.jvm.internal.s.g(this.shareableEventUuid, eVar.shareableEventUuid) && p005kotlin.jvm.internal.s.g(this.eventCustomization, eVar.eventCustomization) && p005kotlin.jvm.internal.s.g(this.eventOrganizer, eVar.eventOrganizer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final gg0.f getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    public final DateTime h() {
        if (this.date == null) {
            return null;
        }
        r rVar = this.eventTimeLocal;
        LocalTime localTimeF = rVar != null ? rVar.f() : null;
        return new DateTime(this.date.getYear(), this.date.getMonthOfYear(), this.date.getDayOfMonth(), localTimeF != null ? localTimeF.getHourOfDay() : 0, localTimeF != null ? localTimeF.getMinuteOfHour() : 0).withZone(DateTimeZone.getDefault());
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.date;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        d dVar = this.completionTarget;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        r rVar = this.eventTimeLocal;
        int iHashCode5 = (iHashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str2 = this.eventImageUUID;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        y yVar = this.locationStartPoint;
        int iHashCode7 = (iHashCode6 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        gg0.f fVar = this.eventType;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str3 = this.shareableEventUuid;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        j jVar = this.eventCustomization;
        int iHashCode10 = (iHashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.eventOrganizer;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final y getLocationStartPoint() {
        return this.locationStartPoint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getShareableEventUuid() {
        return this.shareableEventUuid;
    }

    public final boolean k() {
        j jVar = this.eventCustomization;
        if (jVar != null) {
            return p005kotlin.jvm.internal.s.g(jVar.getIsTrainingEvent(), Boolean.TRUE);
        }
        return false;
    }

    public final String toString() {
        Long l14 = this.id;
        String str = this.eventName;
        LocalDate localDate = this.date;
        d dVar = this.completionTarget;
        r rVar = this.eventTimeLocal;
        String str2 = this.eventImageUUID;
        y yVar = this.locationStartPoint;
        gg0.f fVar = this.eventType;
        String str3 = this.shareableEventUuid;
        j jVar = this.eventCustomization;
        Boolean bool = this.eventOrganizer;
        StringBuilder sbJ = b71.i.j("DashboardEvent(id=", ", eventName=", str, l14, ", date=");
        sbJ.append(localDate);
        sbJ.append(", completionTarget=");
        sbJ.append(dVar);
        sbJ.append(", eventTimeLocal=");
        sbJ.append(rVar);
        sbJ.append(", eventImageUUID=");
        sbJ.append(str2);
        sbJ.append(", locationStartPoint=");
        sbJ.append(yVar);
        sbJ.append(", eventType=");
        sbJ.append(fVar);
        sbJ.append(", shareableEventUuid=");
        sbJ.append(str3);
        sbJ.append(", eventCustomization=");
        sbJ.append(jVar);
        sbJ.append(", eventOrganizer=");
        return p6.b.f(sbJ, bool, ")");
    }

    public e(Long l14, String str, LocalDate localDate, d dVar, r rVar, String str2, y yVar, gg0.f fVar, String str3, j jVar, Boolean bool) {
        this.id = l14;
        this.eventName = str;
        this.date = localDate;
        this.completionTarget = dVar;
        this.eventTimeLocal = rVar;
        this.eventImageUUID = str2;
        this.locationStartPoint = yVar;
        this.eventType = fVar;
        this.shareableEventUuid = str3;
        this.eventCustomization = jVar;
        this.eventOrganizer = bool;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
