package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.EventEnumTypeAdapter$EventTypeAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
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
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bZ\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0013\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010,R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010Y\u001a\u0004\b?\u0010Z\"\u0004\b[\u0010\\R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010Y\u001a\u0004\b9\u0010Z\"\u0004\b^\u0010\\R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010_\u001a\u0004\b3\u0010`\"\u0004\ba\u0010bR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010hR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010(\u001a\u0004\bP\u0010*\"\u0004\bl\u0010,R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010m\u001a\u0004\bk\u0010n\"\u0004\bo\u0010pR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010(\u001a\u0004\br\u0010*\"\u0004\bs\u0010,R,\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010Y\u001a\u0004\bu\u0010Z\"\u0004\bv\u0010\\R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010Y\u001a\u0004\bB\u0010Z\"\u0004\bx\u0010\\R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010(\u001a\u0004\bz\u0010*\"\u0004\b{\u0010,¨\u0006|"}, d2 = {"Lfg0/o;", "Landroid/os/Parcelable;", "", "provider", "eventName", "nativeEventName", "nativeEventNameLang", "eventDate", "Lfg0/r;", "eventStartTime", "eventUrl", "registrationUrl", "Lfg0/y;", "locationStartPoint", "Lgg0/f;", "eventType", "garminEventUuid", "", "distanceToEvent", "", "Lfg0/d;", "completionTargets", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "completionTargetLegs", "Lfg0/a;", "administrativeArea", "", "hasCourse", "isOfficial", "eventRef", "Lgg0/j;", "verifiedStatus", "sig", "statuses", "Lfg0/g;", "detailsEndpoints", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg0/r;Ljava/lang/String;Ljava/lang/String;Lfg0/y;Lgg0/f;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lfg0/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lgg0/j;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "b", "getEventName", "setEventName", "c", "getNativeEventName", "setNativeEventName", "d", "getNativeEventNameLang", "setNativeEventNameLang", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "setEventDate", "f", "Lfg0/r;", "getEventStartTime", "()Lfg0/r;", "setEventStartTime", "(Lfg0/r;)V", "g", "getEventUrl", "setEventUrl", "h", "getRegistrationUrl", "setRegistrationUrl", "Lfg0/y;", "getLocationStartPoint", "()Lfg0/y;", "setLocationStartPoint", "(Lfg0/y;)V", "j", "Lgg0/f;", "m", "()Lgg0/f;", "setEventType", "(Lgg0/f;)V", JWKParameterNames.OCT_KEY_VALUE, "o", "setGarminEventUuid", "l", "Ljava/lang/Integer;", "getDistanceToEvent", "()Ljava/lang/Integer;", "setDistanceToEvent", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "()Ljava/util/List;", "setCompletionTargets", "(Ljava/util/List;)V", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Lfg0/a;", "()Lfg0/a;", "setAdministrativeArea", "(Lfg0/a;)V", "p", "Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Boolean;", "setHasCourse", "(Ljava/lang/Boolean;)V", "s", "setOfficial", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setEventRef", "Lgg0/j;", "()Lgg0/j;", "setVerifiedStatus", "(Lgg0/j;)V", "v", "getSig", "setSig", "w", "getStatuses", "setStatuses", "x", "setDetailsEndpoints", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getLogoUrl", "setLogoUrl", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("provider")
    private String provider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private String eventName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventName")
    private String nativeEventName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventNameLang")
    private String nativeEventNameLang;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventDate")
    private String eventDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventStartTime")
    private r eventStartTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventUrl")
    private String eventUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("registrationUrl")
    private String registrationUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationStartPoint")
    private y locationStartPoint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    @JsonAdapter(EventEnumTypeAdapter$EventTypeAdapter.class)
    private gg0.f eventType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminEventUuid")
    private String garminEventUuid;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceToEvent")
    private Integer distanceToEvent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargets")
    private List<d> completionTargets;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetLegs")
    private List<com.garmin.android.apps.connectmobile.workouts.data.model.k> completionTargetLegs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("administrativeArea")
    private fg0.a administrativeArea;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasCourse")
    private Boolean hasCourse;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isOfficial")
    private Boolean isOfficial;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventRef")
    private String eventRef;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verifiedStatus")
    private gg0.j verifiedStatus;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sig")
    private String sig;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statuses")
    private List<String> statuses;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailsEndpoints")
    private List<g> detailsEndpoints;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("logoUrl")
    private String logoUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            ArrayList arrayList3 = null;
            String string7 = parcel.readString();
            y yVarCreateFromParcel = parcel.readInt() == 0 ? null : y.CREATOR.createFromParcel(parcel);
            gg0.f fVarValueOf = parcel.readInt() == 0 ? null : gg0.f.valueOf(parcel.readString());
            String string8 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d.CREATOR, parcel, arrayList3, iA, 1);
                    string = string;
                    string2 = string2;
                }
            }
            String str = string;
            String str2 = string2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(com.garmin.android.apps.connectmobile.workouts.data.model.k.CREATOR, parcel, arrayList4, iA2, 1);
                    i15 = i15;
                }
                arrayList = arrayList4;
            }
            fg0.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : fg0.a.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            gg0.j jVarValueOf = parcel.readInt() == 0 ? null : gg0.j.valueOf(parcel.readString());
            Boolean bool = boolValueOf2;
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(g.CREATOR, parcel, arrayList2, iA3, 1);
                    i16 = i16;
                    string4 = string4;
                }
            }
            return new o(str, str2, string3, string4, string5, rVarCreateFromParcel, string6, string7, yVarCreateFromParcel, fVarValueOf, string8, numValueOf, arrayList3, arrayList, aVarCreateFromParcel, boolValueOf, bool, string9, jVarValueOf, string10, arrayListCreateStringArrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(String str, String str2, String str3, String str4, String str5, r rVar, String str6, String str7, y yVar, gg0.f fVar, String str8, Integer num, List list, List list2, fg0.a aVar, Boolean bool, Boolean bool2, String str9, gg0.j jVar, String str10, List list3, List list4, String str11, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : rVar, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : yVar, (i14 & 512) != 0 ? null : fVar, (i14 & 1024) != 0 ? null : str8, (i14 & 2048) != 0 ? null : num, (i14 & 4096) != 0 ? null : list, (i14 & 8192) != 0 ? null : list2, (i14 & 16384) != 0 ? null : aVar, (i14 & 32768) != 0 ? null : bool, (i14 & 65536) != 0 ? null : bool2, (i14 & 131072) != 0 ? null : str9, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : jVar, (i14 & 524288) != 0 ? null : str10, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list3, (i14 & 2097152) != 0 ? null : list4, (i14 & 4194304) != 0 ? null : str11);
    }

    public static o b(o oVar, List list) {
        return new o(oVar.provider, oVar.eventName, oVar.nativeEventName, oVar.nativeEventNameLang, oVar.eventDate, oVar.eventStartTime, oVar.eventUrl, oVar.registrationUrl, oVar.locationStartPoint, oVar.eventType, oVar.garminEventUuid, oVar.distanceToEvent, list, oVar.completionTargetLegs, oVar.administrativeArea, oVar.hasCourse, oVar.isOfficial, oVar.eventRef, oVar.verifiedStatus, oVar.sig, oVar.statuses, oVar.detailsEndpoints, oVar.logoUrl);
    }

    public static String j(o oVar) {
        oVar.getClass();
        og0.a aVar = og0.a.f131967a;
        String str = oVar.eventName;
        String str2 = oVar.nativeEventName;
        String str3 = oVar.nativeEventNameLang;
        aVar.getClass();
        return og0.a.C(str, str2, str3, false);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fg0.a getAdministrativeArea() {
        return this.administrativeArea;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.provider, oVar.provider) && p005kotlin.jvm.internal.s.g(this.eventName, oVar.eventName) && p005kotlin.jvm.internal.s.g(this.nativeEventName, oVar.nativeEventName) && p005kotlin.jvm.internal.s.g(this.nativeEventNameLang, oVar.nativeEventNameLang) && p005kotlin.jvm.internal.s.g(this.eventDate, oVar.eventDate) && p005kotlin.jvm.internal.s.g(this.eventStartTime, oVar.eventStartTime) && p005kotlin.jvm.internal.s.g(this.eventUrl, oVar.eventUrl) && p005kotlin.jvm.internal.s.g(this.registrationUrl, oVar.registrationUrl) && p005kotlin.jvm.internal.s.g(this.locationStartPoint, oVar.locationStartPoint) && this.eventType == oVar.eventType && p005kotlin.jvm.internal.s.g(this.garminEventUuid, oVar.garminEventUuid) && p005kotlin.jvm.internal.s.g(this.distanceToEvent, oVar.distanceToEvent) && p005kotlin.jvm.internal.s.g(this.completionTargets, oVar.completionTargets) && p005kotlin.jvm.internal.s.g(this.completionTargetLegs, oVar.completionTargetLegs) && p005kotlin.jvm.internal.s.g(this.administrativeArea, oVar.administrativeArea) && p005kotlin.jvm.internal.s.g(this.hasCourse, oVar.hasCourse) && p005kotlin.jvm.internal.s.g(this.isOfficial, oVar.isOfficial) && p005kotlin.jvm.internal.s.g(this.eventRef, oVar.eventRef) && this.verifiedStatus == oVar.verifiedStatus && p005kotlin.jvm.internal.s.g(this.sig, oVar.sig) && p005kotlin.jvm.internal.s.g(this.statuses, oVar.statuses) && p005kotlin.jvm.internal.s.g(this.detailsEndpoints, oVar.detailsEndpoints) && p005kotlin.jvm.internal.s.g(this.logoUrl, oVar.logoUrl);
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.k> f() {
        return this.completionTargetLegs;
    }

    public final List<d> g() {
        return this.completionTargets;
    }

    public final List<g> h() {
        return this.detailsEndpoints;
    }

    public final int hashCode() {
        String str = this.provider;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nativeEventName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nativeEventNameLang;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        r rVar = this.eventStartTime;
        int iHashCode6 = (iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str6 = this.eventUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.registrationUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        y yVar = this.locationStartPoint;
        int iHashCode9 = (iHashCode8 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        gg0.f fVar = this.eventType;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str8 = this.garminEventUuid;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.distanceToEvent;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        List<d> list = this.completionTargets;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list2 = this.completionTargetLegs;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        fg0.a aVar = this.administrativeArea;
        int iHashCode15 = (iHashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.hasCourse;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOfficial;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.eventRef;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        gg0.j jVar = this.verifiedStatus;
        int iHashCode19 = (iHashCode18 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str10 = this.sig;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list3 = this.statuses;
        int iHashCode21 = (iHashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<g> list4 = this.detailsEndpoints;
        int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str11 = this.logoUrl;
        return iHashCode22 + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEventDate() {
        return this.eventDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getEventRef() {
        return this.eventRef;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final gg0.f getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getGarminEventUuid() {
        return this.garminEventUuid;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getHasCourse() {
        return this.hasCourse;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final gg0.j getVerifiedStatus() {
        return this.verifiedStatus;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getIsOfficial() {
        return this.isOfficial;
    }

    public final void t(List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list) {
        this.completionTargetLegs = list;
    }

    public final String toString() {
        String str = this.provider;
        String str2 = this.eventName;
        String str3 = this.nativeEventName;
        String str4 = this.nativeEventNameLang;
        String str5 = this.eventDate;
        r rVar = this.eventStartTime;
        String str6 = this.eventUrl;
        String str7 = this.registrationUrl;
        y yVar = this.locationStartPoint;
        gg0.f fVar = this.eventType;
        String str8 = this.garminEventUuid;
        Integer num = this.distanceToEvent;
        List<d> list = this.completionTargets;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list2 = this.completionTargetLegs;
        fg0.a aVar = this.administrativeArea;
        Boolean bool = this.hasCourse;
        Boolean bool2 = this.isOfficial;
        String str9 = this.eventRef;
        gg0.j jVar = this.verifiedStatus;
        String str10 = this.sig;
        List<String> list3 = this.statuses;
        List<g> list4 = this.detailsEndpoints;
        String str11 = this.logoUrl;
        StringBuilder sbI = p6.b.i("EventSearchDTO(provider=", str, ", eventName=", str2, ", nativeEventName=");
        sn.a.t(sbI, str3, ", nativeEventNameLang=", str4, ", eventDate=");
        sbI.append(str5);
        sbI.append(", eventStartTime=");
        sbI.append(rVar);
        sbI.append(", eventUrl=");
        sn.a.t(sbI, str6, ", registrationUrl=", str7, ", locationStartPoint=");
        sbI.append(yVar);
        sbI.append(", eventType=");
        sbI.append(fVar);
        sbI.append(", garminEventUuid=");
        fb1.c.u(num, str8, ", distanceToEvent=", ", completionTargets=", sbI);
        n23.j.z(sbI, list, ", completionTargetLegs=", list2, ", administrativeArea=");
        sbI.append(aVar);
        sbI.append(", hasCourse=");
        sbI.append(bool);
        sbI.append(", isOfficial=");
        b71.i.s(sbI, bool2, ", eventRef=", str9, ", verifiedStatus=");
        sbI.append(jVar);
        sbI.append(", sig=");
        sbI.append(str10);
        sbI.append(", statuses=");
        n23.j.z(sbI, list3, ", detailsEndpoints=", list4, ", logoUrl=");
        return am.j.o(str11, ")", sbI);
    }

    public final k u() {
        String cityEn;
        String stateEn;
        String countryCode;
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        String str4 = this.provider;
        String str5 = this.eventDate;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        LocalDate localDate = LocalDate.parse(str5);
        r rVar = this.eventStartTime;
        String str7 = this.eventUrl;
        String str8 = this.registrationUrl;
        y yVar = this.locationStartPoint;
        gg0.f fVar = this.eventType;
        List<d> list = this.completionTargets;
        d dVar = list != null ? (d) h0.d0(list) : null;
        String str9 = this.garminEventUuid;
        if (str9 == null) {
            str9 = this.eventRef;
        }
        String str10 = str9;
        fg0.a aVar = this.administrativeArea;
        if (aVar == null || (cityEn = aVar.getCityEn()) == null) {
            cityEn = "";
        }
        fg0.a aVar2 = this.administrativeArea;
        if (aVar2 == null || (stateEn = aVar2.getStateEn()) == null) {
            stateEn = "";
        }
        fg0.a aVar3 = this.administrativeArea;
        if (aVar3 != null && (countryCode = aVar3.getCountryCode()) != null) {
            str6 = countryCode;
        }
        return new k(null, null, str, str2, str3, localDate, str7, null, null, null, null, dVar, null, rVar, null, null, null, null, j20.x.d(cityEn, StringUtils.SPACE, stateEn, StringUtils.SPACE, str6), yVar, fVar, new c(gg0.a.PRIVATE, null, Boolean.TRUE, null, 10, null), null, str10, null, null, null, null, str4, str8, null, this.statuses, null, 1329846147, 1, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.provider);
        parcel.writeString(this.eventName);
        parcel.writeString(this.nativeEventName);
        parcel.writeString(this.nativeEventNameLang);
        parcel.writeString(this.eventDate);
        r rVar = this.eventStartTime;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.eventUrl);
        parcel.writeString(this.registrationUrl);
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
        parcel.writeString(this.garminEventUuid);
        Integer num = this.distanceToEvent;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        List<d> list = this.completionTargets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((d) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list2 = this.completionTargetLegs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((com.garmin.android.apps.connectmobile.workouts.data.model.k) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        fg0.a aVar = this.administrativeArea;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.hasCourse;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isOfficial;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        parcel.writeString(this.eventRef);
        gg0.j jVar = this.verifiedStatus;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        parcel.writeString(this.sig);
        parcel.writeStringList(this.statuses);
        List<g> list3 = this.detailsEndpoints;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((g) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.logoUrl);
    }

    public final p y() {
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        String str4 = this.eventDate;
        r rVar = this.eventStartTime;
        String str5 = this.eventUrl;
        String str6 = this.registrationUrl;
        List<d> list = this.completionTargets;
        return new p(str, str2, str3, str4, rVar, str5, str6, list != null ? (d) h0.d0(list) : null, null, this.locationStartPoint, this.eventType, this.administrativeArea, this.provider, this.eventRef, this.isOfficial, this.garminEventUuid, false, this.sig, 65792, null);
    }

    public o(String str, String str2, String str3, String str4, String str5, r rVar, String str6, String str7, y yVar, gg0.f fVar, String str8, Integer num, List<d> list, List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list2, fg0.a aVar, Boolean bool, Boolean bool2, String str9, gg0.j jVar, String str10, List<String> list3, List<g> list4, String str11) {
        this.provider = str;
        this.eventName = str2;
        this.nativeEventName = str3;
        this.nativeEventNameLang = str4;
        this.eventDate = str5;
        this.eventStartTime = rVar;
        this.eventUrl = str6;
        this.registrationUrl = str7;
        this.locationStartPoint = yVar;
        this.eventType = fVar;
        this.garminEventUuid = str8;
        this.distanceToEvent = num;
        this.completionTargets = list;
        this.completionTargetLegs = list2;
        this.administrativeArea = aVar;
        this.hasCourse = bool;
        this.isOfficial = bool2;
        this.eventRef = str9;
        this.verifiedStatus = jVar;
        this.sig = str10;
        this.statuses = list3;
        this.detailsEndpoints = list4;
        this.logoUrl = str11;
    }

    public o() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }
}
