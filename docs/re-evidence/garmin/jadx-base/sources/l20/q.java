package l20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b0\u0010%R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b6\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0012\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b\u0013\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b\u0014\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b\u0015\u00109R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010#\u001a\u0004\b>\u0010%R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\b?\u0010%R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u0010%R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010#\u001a\u0004\bI\u0010%¨\u0006J"}, d2 = {"Ll20/q;", "Landroid/os/Parcelable;", "", "addressLine1", "addressLine2", "city", "", "contactInfoLimit", "country", "countryOfCitizenship", "createDate", "", "Ll20/c;", "emails", "emergencyNotes", "fullName", "firstName", "", "isDeleted", "isLiveEventSharingDefault", "isLiveTrackDefault", "isSosDefault", "lastName", "linkedUserProfileId", FirebaseAnalytics.Param.LOCATION, "phones", "Ll20/g;", "socialProfiles", RemoteConfigConstants.ResponseFieldKey.STATE, "updateDate", "uuid", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", "g", "Ljava/lang/Integer;", "getContactInfoLimit", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "h", IntegerTokenConverter.CONVERTER_KEY, "getCreateDate", "Ljava/util/List;", "j", "()Ljava/util/List;", JWKParameterNames.OCT_KEY_VALUE, "o", "m", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_MODULUS, "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getLinkedUserProfileId", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s", "v", "getSocialProfiles", "w", "x", "getUpdateDate", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getUuid", "z", "u", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressLine1")
    private final String addressLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("addressLine2")
    private final String addressLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("city")
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactInfoLimit")
    private final Integer contactInfoLimit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("country")
    private final String country;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryOfCitizenship")
    private final String countryOfCitizenship;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emails")
    private final List<c> emails;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emergencyNotes")
    private final String emergencyNotes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isDeleted")
    private final Boolean isDeleted;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isLiveEventSharingDefault")
    private final Boolean isLiveEventSharingDefault;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isLiveTrackDefault")
    private final Boolean isLiveTrackDefault;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isSosDefault")
    private final Boolean isSosDefault;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("linkedUserProfileId")
    private final Integer linkedUserProfileId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phones")
    private final List<c> phones;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialProfiles")
    private final List<g> socialProfiles;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final String state;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    private final String updateDate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zipCode")
    private final String zipCode;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r17v7, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r19v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r20v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Object objValueOf;
            Object objValueOf2;
            Object objValueOf3;
            Object objValueOf4;
            Object objValueOf5;
            Object obj;
            ?? arrayList3;
            String str;
            ?? arrayList4;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                arrayList = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                arrayList = null;
            }
            String string4 = parcel.readString();
            ArrayList arrayList5 = arrayList;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList5;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = arrayList5;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf2 = arrayList5;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf3 = arrayList5;
            } else {
                objValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf4 = arrayList5;
            } else {
                objValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ?? r14 = objValueOf2;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf5 = arrayList5;
                obj = objValueOf5;
            } else {
                objValueOf5 = Integer.valueOf(parcel.readInt());
                obj = arrayList5;
            }
            ArrayList arrayList6 = arrayList2;
            ?? r15 = objValueOf;
            ?? r16 = objValueOf4;
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                int iA2 = 0;
                while (true) {
                    str = string2;
                    if (iA2 == i15) {
                        break;
                    }
                    iA2 = kg.f.a(c.CREATOR, parcel, arrayList3, iA2, 1);
                    string2 = str;
                    string3 = string3;
                }
            } else {
                arrayList3 = obj;
                str = string2;
            }
            String str2 = string3;
            if (parcel.readInt() == 0) {
                arrayList4 = obj;
            } else {
                int i16 = parcel.readInt();
                arrayList4 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(g.CREATOR, parcel, arrayList4, iA3, 1);
                    i16 = i16;
                }
            }
            return new q(string, str, str2, numValueOf, string4, string5, string6, arrayList6, string7, string8, string9, r15, r14, objValueOf3, r16, string10, objValueOf5, string11, arrayList3, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List list, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str10, Integer num2, String str11, List list2, List list3, String str12, String str13, String str14, String str15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : bool, (i14 & 4096) != 0 ? null : bool2, (i14 & 8192) != 0 ? Boolean.FALSE : bool3, (i14 & 16384) != 0 ? null : bool4, (i14 & 32768) != 0 ? null : str10, (i14 & 65536) != 0 ? null : num2, (i14 & 131072) != 0 ? null : str11, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : list2, (i14 & 524288) != 0 ? null : list3, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str12, (i14 & 2097152) != 0 ? null : str13, (i14 & 4194304) != 0 ? null : str14, (i14 & 8388608) != 0 ? null : str15);
    }

    public static q b(q qVar, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, List list2, String str10, String str11, int i14) {
        String str12 = (i14 & 1) != 0 ? qVar.addressLine1 : str;
        String str13 = (i14 & 2) != 0 ? qVar.addressLine2 : str2;
        String str14 = (i14 & 4) != 0 ? qVar.city : str3;
        Integer num = qVar.contactInfoLimit;
        String str15 = (i14 & 16) != 0 ? qVar.country : str4;
        String str16 = (i14 & 32) != 0 ? qVar.countryOfCitizenship : str5;
        String str17 = qVar.createDate;
        List list3 = (i14 & 128) != 0 ? qVar.emails : list;
        String str18 = (i14 & 256) != 0 ? qVar.emergencyNotes : str6;
        String str19 = (i14 & 512) != 0 ? qVar.fullName : str7;
        String str20 = (i14 & 1024) != 0 ? qVar.firstName : str8;
        Boolean bool = qVar.isDeleted;
        Boolean bool2 = qVar.isLiveEventSharingDefault;
        Boolean bool3 = qVar.isLiveTrackDefault;
        Boolean bool4 = qVar.isSosDefault;
        String str21 = (i14 & 32768) != 0 ? qVar.lastName : str9;
        Integer num2 = qVar.linkedUserProfileId;
        String str22 = qVar.location;
        List list4 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? qVar.phones : list2;
        List<g> list5 = qVar.socialProfiles;
        String str23 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? qVar.state : str10;
        String str24 = qVar.updateDate;
        String str25 = qVar.uuid;
        String str26 = (i14 & 8388608) != 0 ? qVar.zipCode : str11;
        qVar.getClass();
        return new q(str12, str13, str14, num, str15, str16, str17, list3, str18, str19, str20, bool, bool2, bool3, bool4, str21, num2, str22, list4, list5, str23, str24, str25, str26);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.addressLine1, qVar.addressLine1) && s.g(this.addressLine2, qVar.addressLine2) && s.g(this.city, qVar.city) && s.g(this.contactInfoLimit, qVar.contactInfoLimit) && s.g(this.country, qVar.country) && s.g(this.countryOfCitizenship, qVar.countryOfCitizenship) && s.g(this.createDate, qVar.createDate) && s.g(this.emails, qVar.emails) && s.g(this.emergencyNotes, qVar.emergencyNotes) && s.g(this.fullName, qVar.fullName) && s.g(this.firstName, qVar.firstName) && s.g(this.isDeleted, qVar.isDeleted) && s.g(this.isLiveEventSharingDefault, qVar.isLiveEventSharingDefault) && s.g(this.isLiveTrackDefault, qVar.isLiveTrackDefault) && s.g(this.isSosDefault, qVar.isSosDefault) && s.g(this.lastName, qVar.lastName) && s.g(this.linkedUserProfileId, qVar.linkedUserProfileId) && s.g(this.location, qVar.location) && s.g(this.phones, qVar.phones) && s.g(this.socialProfiles, qVar.socialProfiles) && s.g(this.state, qVar.state) && s.g(this.updateDate, qVar.updateDate) && s.g(this.uuid, qVar.uuid) && s.g(this.zipCode, qVar.zipCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.contactInfoLimit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.country;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryOfCitizenship;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<c> list = this.emails;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.emergencyNotes;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fullName;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLiveEventSharingDefault;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLiveTrackDefault;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isSosDefault;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str10 = this.lastName;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.linkedUserProfileId;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.location;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<c> list2 = this.phones;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<g> list3 = this.socialProfiles;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str12 = this.state;
        int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.updateDate;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.uuid;
        int iHashCode23 = (iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.zipCode;
        return iHashCode23 + (str15 != null ? str15.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCountryOfCitizenship() {
        return this.countryOfCitizenship;
    }

    public final List<c> j() {
        return this.emails;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getEmergencyNotes() {
        return this.emergencyNotes;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final List<c> s() {
        return this.phones;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final String toString() {
        String str = this.addressLine1;
        String str2 = this.addressLine2;
        String str3 = this.city;
        Integer num = this.contactInfoLimit;
        String str4 = this.country;
        String str5 = this.countryOfCitizenship;
        String str6 = this.createDate;
        List<c> list = this.emails;
        String str7 = this.emergencyNotes;
        String str8 = this.fullName;
        String str9 = this.firstName;
        Boolean bool = this.isDeleted;
        Boolean bool2 = this.isLiveEventSharingDefault;
        Boolean bool3 = this.isLiveTrackDefault;
        Boolean bool4 = this.isSosDefault;
        String str10 = this.lastName;
        Integer num2 = this.linkedUserProfileId;
        String str11 = this.location;
        List<c> list2 = this.phones;
        List<g> list3 = this.socialProfiles;
        String str12 = this.state;
        String str13 = this.updateDate;
        String str14 = this.uuid;
        String str15 = this.zipCode;
        StringBuilder sbI = p6.b.i("SelfUserContactDTO(addressLine1=", str, ", addressLine2=", str2, ", city=");
        fb1.c.u(num, str3, ", contactInfoLimit=", ", country=", sbI);
        sn.a.t(sbI, str4, ", countryOfCitizenship=", str5, ", createDate=");
        e0.o(str6, ", emails=", ", emergencyNotes=", sbI, list);
        sn.a.t(sbI, str7, ", fullName=", str8, ", firstName=");
        b71.i.w(sbI, str9, ", isDeleted=", bool, ", isLiveEventSharingDefault=");
        b71.i.o(bool2, bool3, ", isLiveTrackDefault=", ", isSosDefault=", sbI);
        b71.i.s(sbI, bool4, ", lastName=", str10, ", linkedUserProfileId=");
        p6.b.l(num2, ", location=", str11, ", phones=", sbI);
        n23.j.z(sbI, list2, ", socialProfiles=", list3, ", state=");
        sn.a.t(sbI, str12, ", updateDate=", str13, ", uuid=");
        return e5.h(sbI, str14, ", zipCode=", str15, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.addressLine1);
        parcel.writeString(this.addressLine2);
        parcel.writeString(this.city);
        Integer num = this.contactInfoLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.country);
        parcel.writeString(this.countryOfCitizenship);
        parcel.writeString(this.createDate);
        List<c> list = this.emails;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((c) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.emergencyNotes);
        parcel.writeString(this.fullName);
        parcel.writeString(this.firstName);
        Boolean bool = this.isDeleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isLiveEventSharingDefault;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLiveTrackDefault;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.isSosDefault;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        parcel.writeString(this.lastName);
        Integer num2 = this.linkedUserProfileId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.location);
        List<c> list2 = this.phones;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((c) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<g> list3 = this.socialProfiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((g) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.state);
        parcel.writeString(this.updateDate);
        parcel.writeString(this.uuid);
        parcel.writeString(this.zipCode);
    }

    public q(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List<c> list, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str10, Integer num2, String str11, List<c> list2, List<g> list3, String str12, String str13, String str14, String str15) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.contactInfoLimit = num;
        this.country = str4;
        this.countryOfCitizenship = str5;
        this.createDate = str6;
        this.emails = list;
        this.emergencyNotes = str7;
        this.fullName = str8;
        this.firstName = str9;
        this.isDeleted = bool;
        this.isLiveEventSharingDefault = bool2;
        this.isLiveTrackDefault = bool3;
        this.isSosDefault = bool4;
        this.lastName = str10;
        this.linkedUserProfileId = num2;
        this.location = str11;
        this.phones = list2;
        this.socialProfiles = list3;
        this.state = str12;
        this.updateDate = str13;
        this.uuid = str14;
        this.zipCode = str15;
    }

    public q() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
    }
}
