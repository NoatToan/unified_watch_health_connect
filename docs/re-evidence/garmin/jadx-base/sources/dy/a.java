package dy;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kg.f;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b8\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b=\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b>\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b?\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010'\u001a\u0004\bD\u0010)¨\u0006E"}, d2 = {"Ldy/a;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "shareableEventUuid", "", "subscribed", "eventName", "date", "url", "courseId", "courseName", "", "eventGoal", "eventTime", "eventType", "shareable", FirebaseAnalytics.Param.LOCATION, "note", "workoutId", "workoutName", "recurrence", "groupId", "eventOrganizer", "eventImageUUID", "eventImageURL", "race", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "s", "()Ljava/lang/Boolean;", "d", "h", JWKParameterNames.RSA_EXPONENT, "f", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "g", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getEventGoal", "()Ljava/lang/Integer;", "j", JWKParameterNames.OCT_KEY_VALUE, "l", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "m", JWKParameterNames.RSA_MODULUS, "o", "getWorkoutId", "p", "getWorkoutName", "getRecurrence", "getGroupId", "v", "getEventImageUUID", "w", "x", "getRace", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1305a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareableEventUuid")
    private final String shareableEventUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subscribed")
    private final Boolean subscribed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private final String eventName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    private final Long courseId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    private final String courseName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventGoal")
    private final Integer eventGoal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTime")
    private final String eventTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    private final String eventType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareable")
    private final Boolean shareable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    private final String note;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private final String workoutName;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recurrence")
    private final String recurrence;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupId")
    private final Long groupId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventOrganizer")
    private final Boolean eventOrganizer;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageUUID")
    private final String eventImageUUID;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageURL")
    private final String eventImageURL;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("race")
    private final Boolean race;

    /* JADX INFO: renamed from: dy.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1305a implements Parcelable.Creator<a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf;
            Object objValueOf;
            Object obj;
            Object objValueOf2;
            Object obj2;
            Object objValueOf3;
            Object objValueOf4;
            Object objValueOf5;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = bool;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Object objValueOf6 = parcel.readInt() == 0 ? bool : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = bool;
                obj = objValueOf;
            } else {
                objValueOf = Integer.valueOf(parcel.readInt());
                obj = bool;
            }
            Boolean bool2 = boolValueOf;
            Long l14 = objValueOf6;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf2 = obj;
                obj2 = objValueOf2;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                obj2 = obj;
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf3 = obj2;
                objValueOf4 = objValueOf3;
            } else {
                objValueOf3 = Long.valueOf(parcel.readLong());
                objValueOf4 = obj2;
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Object objValueOf7 = parcel.readInt() == 0 ? objValueOf4 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                objValueOf5 = objValueOf4;
            } else {
                objValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z14 = false;
            String string12 = parcel.readString();
            Integer num = objValueOf;
            Boolean bool3 = objValueOf2;
            Long l15 = objValueOf3;
            Long l16 = objValueOf7;
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                objValueOf4 = Boolean.valueOf(z14);
            }
            return new a(lValueOf, string, bool2, string2, string3, string4, l14, string5, num, string6, string7, bool3, string8, string9, l15, string10, string11, l16, objValueOf5, string12, string13, objValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Long l14, String str, Boolean bool, String str2, String str3, String str4, Long l15, String str5, Integer num, String str6, String str7, Boolean bool2, String str8, String str9, Long l16, String str10, String str11, Long l17, Boolean bool3, String str12, String str13, Boolean bool4) {
        this.id = l14;
        this.shareableEventUuid = str;
        this.subscribed = bool;
        this.eventName = str2;
        this.date = str3;
        this.url = str4;
        this.courseId = l15;
        this.courseName = str5;
        this.eventGoal = num;
        this.eventTime = str6;
        this.eventType = str7;
        this.shareable = bool2;
        this.location = str8;
        this.note = str9;
        this.workoutId = l16;
        this.workoutName = str10;
        this.recurrence = str11;
        this.groupId = l17;
        this.eventOrganizer = bool3;
        this.eventImageUUID = str12;
        this.eventImageURL = str13;
        this.race = bool4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.id, aVar.id) && s.g(this.shareableEventUuid, aVar.shareableEventUuid) && s.g(this.subscribed, aVar.subscribed) && s.g(this.eventName, aVar.eventName) && s.g(this.date, aVar.date) && s.g(this.url, aVar.url) && s.g(this.courseId, aVar.courseId) && s.g(this.courseName, aVar.courseName) && s.g(this.eventGoal, aVar.eventGoal) && s.g(this.eventTime, aVar.eventTime) && s.g(this.eventType, aVar.eventType) && s.g(this.shareable, aVar.shareable) && s.g(this.location, aVar.location) && s.g(this.note, aVar.note) && s.g(this.workoutId, aVar.workoutId) && s.g(this.workoutName, aVar.workoutName) && s.g(this.recurrence, aVar.recurrence) && s.g(this.groupId, aVar.groupId) && s.g(this.eventOrganizer, aVar.eventOrganizer) && s.g(this.eventImageUUID, aVar.eventImageUUID) && s.g(this.eventImageURL, aVar.eventImageURL) && s.g(this.race, aVar.race);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEventImageURL() {
        return this.eventImageURL;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.shareableEventUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.subscribed;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.eventName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.courseId;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this.courseName;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.eventGoal;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.eventTime;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eventType;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.shareable;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.location;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.note;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l16 = this.workoutId;
        int iHashCode15 = (iHashCode14 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str10 = this.workoutName;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.recurrence;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l17 = this.groupId;
        int iHashCode18 = (iHashCode17 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Boolean bool3 = this.eventOrganizer;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.eventImageUUID;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.eventImageURL;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool4 = this.race;
        return iHashCode21 + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getEventOrganizer() {
        return this.eventOrganizer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getEventTime() {
        return this.eventTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getShareable() {
        return this.shareable;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getShareableEventUuid() {
        return this.shareableEventUuid;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getSubscribed() {
        return this.subscribed;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final String toString() {
        Long l14 = this.id;
        String str = this.shareableEventUuid;
        Boolean bool = this.subscribed;
        String str2 = this.eventName;
        String str3 = this.date;
        String str4 = this.url;
        Long l15 = this.courseId;
        String str5 = this.courseName;
        Integer num = this.eventGoal;
        String str6 = this.eventTime;
        String str7 = this.eventType;
        Boolean bool2 = this.shareable;
        String str8 = this.location;
        String str9 = this.note;
        Long l16 = this.workoutId;
        String str10 = this.workoutName;
        String str11 = this.recurrence;
        Long l17 = this.groupId;
        Boolean bool3 = this.eventOrganizer;
        String str12 = this.eventImageUUID;
        String str13 = this.eventImageURL;
        Boolean bool4 = this.race;
        StringBuilder sbJ = i.j("CalendarEventDTO2(id=", ", shareableEventUuid=", str, l14, ", subscribed=");
        i.s(sbJ, bool, ", eventName=", str2, ", date=");
        sn.a.t(sbJ, str3, ", url=", str4, ", courseId=");
        i.q(l15, ", courseName=", str5, ", eventGoal=", sbJ);
        p6.b.l(num, ", eventTime=", str6, ", eventType=", sbJ);
        i.w(sbJ, str7, ", shareable=", bool2, ", location=");
        sn.a.t(sbJ, str8, ", note=", str9, ", workoutId=");
        i.q(l16, ", workoutName=", str10, ", recurrence=", sbJ);
        j.q(l17, str11, ", groupId=", ", eventOrganizer=", sbJ);
        i.s(sbJ, bool3, ", eventImageUUID=", str12, ", eventImageURL=");
        sbJ.append(str13);
        sbJ.append(", race=");
        sbJ.append(bool4);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.shareableEventUuid);
        Boolean bool = this.subscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.eventName);
        parcel.writeString(this.date);
        parcel.writeString(this.url);
        Long l15 = this.courseId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.courseName);
        Integer num = this.eventGoal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeString(this.eventTime);
        parcel.writeString(this.eventType);
        Boolean bool2 = this.shareable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool2);
        }
        parcel.writeString(this.location);
        parcel.writeString(this.note);
        Long l16 = this.workoutId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.workoutName);
        parcel.writeString(this.recurrence);
        Long l17 = this.groupId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        Boolean bool3 = this.eventOrganizer;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool3);
        }
        parcel.writeString(this.eventImageUUID);
        parcel.writeString(this.eventImageURL);
        Boolean bool4 = this.race;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool4);
        }
    }
}
