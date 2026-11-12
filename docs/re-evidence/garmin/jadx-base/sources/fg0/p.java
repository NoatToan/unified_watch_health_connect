package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.EventEnumTypeAdapter$EventTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bR\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\b9\u0010CR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010 \u001a\u0004\bW\u0010\"\"\u0004\bX\u0010$R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010 \u001a\u0004\bZ\u0010\"\"\u0004\b[\u0010$R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010 \u001a\u0004\b3\u0010\"\"\u0004\bc\u0010$R\"\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\b\u001b\u0010f\"\u0004\b?\u0010gR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010 \u001a\u0004\b6\u0010\"\"\u0004\bi\u0010$¨\u0006j"}, d2 = {"Lfg0/p;", "Landroid/os/Parcelable;", "", "eventName", "nativeEventName", "nativeEventNameLang", "date", "Lfg0/r;", "eventStartTime", "url", "registrationUrl", "Lfg0/d;", "completionTarget", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "completionTargetLegs", "Lfg0/y;", "locationStartPoint", "Lgg0/f;", "eventType", "Lfg0/a;", "administrativeArea", "eventsProvider", "eventRef", "", "official", "garminEventUuid", "isRace", "sig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg0/r;Ljava/lang/String;Ljava/lang/String;Lfg0/d;Ljava/util/List;Lfg0/y;Lgg0/f;Lfg0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "b", "getNativeEventName", "setNativeEventName", "c", "getNativeEventNameLang", "setNativeEventNameLang", "getDate", "setDate", JWKParameterNames.RSA_EXPONENT, "Lfg0/r;", "getEventStartTime", "()Lfg0/r;", "setEventStartTime", "(Lfg0/r;)V", "f", "getUrl", "setUrl", "g", "getRegistrationUrl", "setRegistrationUrl", "h", "Lfg0/d;", "getCompletionTarget", "()Lfg0/d;", "setCompletionTarget", "(Lfg0/d;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getCompletionTargetLegs", "()Ljava/util/List;", "(Ljava/util/List;)V", "j", "Lfg0/y;", "getLocationStartPoint", "()Lfg0/y;", "setLocationStartPoint", "(Lfg0/y;)V", JWKParameterNames.OCT_KEY_VALUE, "Lgg0/f;", "getEventType", "()Lgg0/f;", "setEventType", "(Lgg0/f;)V", "l", "Lfg0/a;", "getAdministrativeArea", "()Lfg0/a;", "setAdministrativeArea", "(Lfg0/a;)V", "m", "getEventsProvider", "setEventsProvider", JWKParameterNames.RSA_MODULUS, "getEventRef", "setEventRef", "o", "Ljava/lang/Boolean;", "getOfficial", "()Ljava/lang/Boolean;", "setOfficial", "(Ljava/lang/Boolean;)V", "p", "setGarminEventUuid", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Z", "()Z", "(Z)V", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setSig", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private String eventName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventName")
    private String nativeEventName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventNameLang")
    private String nativeEventNameLang;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private String date;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventStartTime")
    private r eventStartTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private String url;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registrationUrl")
    private String registrationUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTarget")
    private d completionTarget;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetLegs")
    private List<com.garmin.android.apps.connectmobile.workouts.data.model.k> completionTargetLegs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationStartPoint")
    private y locationStartPoint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    @JsonAdapter(EventEnumTypeAdapter$EventTypeAdapter.class)
    private gg0.f eventType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("administrativeArea")
    private fg0.a administrativeArea;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventsProvider")
    private String eventsProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventRef")
    private String eventRef;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("official")
    private Boolean official;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminEventUuid")
    private String garminEventUuid;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isRace")
    private boolean isRace;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private String sig;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(com.garmin.android.apps.connectmobile.workouts.data.model.k.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            y yVarCreateFromParcel = parcel.readInt() == 0 ? null : y.CREATOR.createFromParcel(parcel);
            gg0.f fVarValueOf = parcel.readInt() == 0 ? null : gg0.f.valueOf(parcel.readString());
            fg0.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : fg0.a.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf = null;
            ArrayList arrayList2 = arrayList;
            String string7 = parcel.readString();
            boolean z14 = true;
            gg0.f fVar = fVarValueOf;
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            return new p(string, string2, string3, string4, rVarCreateFromParcel, string5, string6, dVarCreateFromParcel, arrayList2, yVarCreateFromParcel, fVar, aVarCreateFromParcel, string7, string8, boolValueOf, string9, z14, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(String str, String str2, String str3, String str4, r rVar, String str5, String str6, d dVar, List list, y yVar, gg0.f fVar, fg0.a aVar, String str7, String str8, Boolean bool, String str9, boolean z14, String str10, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : rVar, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : dVar, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : yVar, (i14 & 1024) != 0 ? null : fVar, (i14 & 2048) != 0 ? null : aVar, (i14 & 4096) != 0 ? null : str7, (i14 & 8192) != 0 ? null : str8, (i14 & 16384) != 0 ? null : bool, (i14 & 32768) != 0 ? null : str9, (i14 & 65536) != 0 ? true : z14, (i14 & 131072) != 0 ? null : str10);
    }

    public static String b(p pVar) {
        pVar.getClass();
        og0.a aVar = og0.a.f131967a;
        String str = pVar.eventName;
        String str2 = pVar.nativeEventName;
        String str3 = pVar.nativeEventNameLang;
        aVar.getClass();
        return og0.a.C(str, str2, str3, false);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.eventName, pVar.eventName) && p005kotlin.jvm.internal.s.g(this.nativeEventName, pVar.nativeEventName) && p005kotlin.jvm.internal.s.g(this.nativeEventNameLang, pVar.nativeEventNameLang) && p005kotlin.jvm.internal.s.g(this.date, pVar.date) && p005kotlin.jvm.internal.s.g(this.eventStartTime, pVar.eventStartTime) && p005kotlin.jvm.internal.s.g(this.url, pVar.url) && p005kotlin.jvm.internal.s.g(this.registrationUrl, pVar.registrationUrl) && p005kotlin.jvm.internal.s.g(this.completionTarget, pVar.completionTarget) && p005kotlin.jvm.internal.s.g(this.completionTargetLegs, pVar.completionTargetLegs) && p005kotlin.jvm.internal.s.g(this.locationStartPoint, pVar.locationStartPoint) && this.eventType == pVar.eventType && p005kotlin.jvm.internal.s.g(this.administrativeArea, pVar.administrativeArea) && p005kotlin.jvm.internal.s.g(this.eventsProvider, pVar.eventsProvider) && p005kotlin.jvm.internal.s.g(this.eventRef, pVar.eventRef) && p005kotlin.jvm.internal.s.g(this.official, pVar.official) && p005kotlin.jvm.internal.s.g(this.garminEventUuid, pVar.garminEventUuid) && this.isRace == pVar.isRace && p005kotlin.jvm.internal.s.g(this.sig, pVar.sig);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGarminEventUuid() {
        return this.garminEventUuid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSig() {
        return this.sig;
    }

    public final void h(List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list) {
        this.completionTargetLegs = list;
    }

    public final int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nativeEventName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nativeEventNameLang;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.date;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        r rVar = this.eventStartTime;
        int iHashCode5 = (iHashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.registrationUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        d dVar = this.completionTarget;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        y yVar = this.locationStartPoint;
        int iHashCode10 = (iHashCode9 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        gg0.f fVar = this.eventType;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        fg0.a aVar = this.administrativeArea;
        int iHashCode12 = (iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str7 = this.eventsProvider;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eventRef;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.official;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.garminEventUuid;
        int iG = q6.f.g((iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.isRace);
        String str10 = this.sig;
        return iG + (str10 != null ? str10.hashCode() : 0);
    }

    public final void i(boolean z14) {
        this.isRace = z14;
    }

    public final k j() {
        String strB;
        String strG;
        String strD;
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        String str4 = this.date;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        LocalDate localDate = LocalDate.parse(str4);
        r rVar = this.eventStartTime;
        String str6 = this.url;
        String str7 = this.registrationUrl;
        y yVar = this.locationStartPoint;
        gg0.f fVar = this.eventType;
        d dVar = this.completionTarget;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        boolean z14 = this.isRace;
        fg0.a aVar = this.administrativeArea;
        if (aVar == null || (strB = aVar.getCityEn()) == null) {
            strB = "";
        }
        fg0.a aVar2 = this.administrativeArea;
        if (aVar2 == null || (strG = aVar2.getStateEn()) == null) {
            strG = "";
        }
        fg0.a aVar3 = this.administrativeArea;
        if (aVar3 != null && (strD = aVar3.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String()) != null) {
            str5 = strD;
        }
        return new k(null, null, str, str2, str3, localDate, str6, null, null, null, null, dVar, list, rVar, null, null, null, null, j20.x.d(strB, StringUtils.SPACE, strG, StringUtils.SPACE, str5), yVar, fVar, new c(gg0.a.PRIVATE, null, Boolean.TRUE, null, 10, null), null, null, null, null, Boolean.valueOf(z14), null, this.eventsProvider, str7, null, null, null, -876361853, 1, null);
    }

    public final String toString() {
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        String str4 = this.date;
        r rVar = this.eventStartTime;
        String str5 = this.url;
        String str6 = this.registrationUrl;
        d dVar = this.completionTarget;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        y yVar = this.locationStartPoint;
        gg0.f fVar = this.eventType;
        fg0.a aVar = this.administrativeArea;
        String str7 = this.eventsProvider;
        String str8 = this.eventRef;
        Boolean bool = this.official;
        String str9 = this.garminEventUuid;
        boolean z14 = this.isRace;
        String str10 = this.sig;
        StringBuilder sbI = p6.b.i("EventSearchResultDTO(eventName=", str, ", nativeEventName=", str2, ", nativeEventNameLang=");
        sn.a.t(sbI, str3, ", date=", str4, ", eventStartTime=");
        sbI.append(rVar);
        sbI.append(", url=");
        sbI.append(str5);
        sbI.append(", registrationUrl=");
        sbI.append(str6);
        sbI.append(", completionTarget=");
        sbI.append(dVar);
        sbI.append(", completionTargetLegs=");
        sbI.append(list);
        sbI.append(", locationStartPoint=");
        sbI.append(yVar);
        sbI.append(", eventType=");
        sbI.append(fVar);
        sbI.append(", administrativeArea=");
        sbI.append(aVar);
        sbI.append(", eventsProvider=");
        sn.a.t(sbI, str7, ", eventRef=", str8, ", official=");
        b71.i.s(sbI, bool, ", garminEventUuid=", str9, ", isRace=");
        sbI.append(z14);
        sbI.append(", sig=");
        sbI.append(str10);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventName);
        parcel.writeString(this.nativeEventName);
        parcel.writeString(this.nativeEventNameLang);
        parcel.writeString(this.date);
        r rVar = this.eventStartTime;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.registrationUrl);
        d dVar = this.completionTarget;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((com.garmin.android.apps.connectmobile.workouts.data.model.k) itO.next()).writeToParcel(parcel, i14);
            }
        }
        y yVar = this.locationStartPoint;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        gg0.f fVar = this.eventType;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        fg0.a aVar = this.administrativeArea;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.eventsProvider);
        parcel.writeString(this.eventRef);
        Boolean bool = this.official;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.garminEventUuid);
        parcel.writeInt(this.isRace ? 1 : 0);
        parcel.writeString(this.sig);
    }

    public p(String str, String str2, String str3, String str4, r rVar, String str5, String str6, d dVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list, y yVar, gg0.f fVar, fg0.a aVar, String str7, String str8, Boolean bool, String str9, boolean z14, String str10) {
        this.eventName = str;
        this.nativeEventName = str2;
        this.nativeEventNameLang = str3;
        this.date = str4;
        this.eventStartTime = rVar;
        this.url = str5;
        this.registrationUrl = str6;
        this.completionTarget = dVar;
        this.completionTargetLegs = list;
        this.locationStartPoint = yVar;
        this.eventType = fVar;
        this.administrativeArea = aVar;
        this.eventsProvider = str7;
        this.eventRef = str8;
        this.official = bool;
        this.garminEventUuid = str9;
        this.isRace = z14;
        this.sig = str10;
    }

    public p() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null);
    }
}
