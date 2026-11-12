package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%\"\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u00105R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010#R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b6\u0010:\"\u0004\b;\u0010<R$\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u00109\u001a\u0004\b8\u0010:\"\u0004\bA\u0010<R$\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00109\u001a\u0004\b7\u0010:\"\u0004\bC\u0010<R$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u00109\u001a\u0004\b@\u0010:\"\u0004\bJ\u0010<R$\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u00109\u001a\u0004\bD\u0010:\"\u0004\bL\u0010<R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00109\u001a\u0004\bK\u0010:\"\u0004\bM\u0010<R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00109\u001a\u0004\bR\u0010:\"\u0004\bS\u0010<¨\u0006T"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/r;", "Landroid/os/Parcelable;", "", "profileId", "", "displayName", "fullName", FirebaseAnalytics.Param.LOCATION, "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "profileImageUrlWrapper", "", "favoriteActivityTypes", "activityVisibility", "profileVisibility", "badgeVisibility", "tagPermission", "", "showAge", "showWeight", "showHeight", "showGender", "showVO2Max", "showPersonalRecords", "showLast12Months", "showLifetimeTotals", "showRecentDevice", "showUpcomingEvents", "allowTagging", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/j;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getProfileId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "g", "A", "(Ljava/lang/String;)V", "d", "h", "setLocation", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "getProfileImageUrlWrapper", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "f", "Ljava/util/List;", "()Ljava/util/List;", "setFavoriteActivityTypes", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setShowAge", "(Ljava/lang/Boolean;)V", "l", "u", "setShowWeight", "m", "setShowHeight", JWKParameterNames.RSA_MODULUS, "setShowGender", "o", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setShowVO2Max", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setShowPersonalRecords", "setShowLast12Months", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setShowLifetimeTotals", "setShowRecentDevice", "v", "s", "setShowUpcomingEvents", "w", "getAllowTagging", "setAllowTagging", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileId")
    private final Long profileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private final j profileImageUrlWrapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoriteActivityTypes")
    private List<String> favoriteActivityTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityVisibility")
    private String activityVisibility;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileVisibility")
    private String profileVisibility;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeVisibility")
    private String badgeVisibility;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tagPermission")
    private String tagPermission;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showAge")
    private Boolean showAge;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showWeight")
    private Boolean showWeight;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showHeight")
    private Boolean showHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showGender")
    private Boolean showGender;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showVO2Max")
    private Boolean showVO2Max;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showPersonalRecords")
    private Boolean showPersonalRecords;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showLast12Months")
    private Boolean showLast12Months;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showLifetimeTotals")
    private Boolean showLifetimeTotals;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showRecentDevice")
    private Boolean showRecentDevice;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showUpcomingEvents")
    private Boolean showUpcomingEvents;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("allowTagging")
    private Boolean allowTagging;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean boolValueOf10;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string = parcel.readString();
            Boolean bool2 = bool;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            j jVar = (j) parcel.readParcelable(r.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf11 = bool2;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = boolValueOf11;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = boolValueOf11;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = boolValueOf11;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = boolValueOf11;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = boolValueOf11;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = boolValueOf11;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = boolValueOf11;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = boolValueOf11;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = boolValueOf11;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf10 = boolValueOf11;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new r(lValueOf, string, string2, string3, jVar, arrayListCreateStringArrayList, string4, string5, string6, string7, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(Long l14, String str, String str2, String str3, j jVar, List<String> list, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11) {
        this.profileId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.location = str3;
        this.profileImageUrlWrapper = jVar;
        this.favoriteActivityTypes = list;
        this.activityVisibility = str4;
        this.profileVisibility = str5;
        this.badgeVisibility = str6;
        this.tagPermission = str7;
        this.showAge = bool;
        this.showWeight = bool2;
        this.showHeight = bool3;
        this.showGender = bool4;
        this.showVO2Max = bool5;
        this.showPersonalRecords = bool6;
        this.showLast12Months = bool7;
        this.showLifetimeTotals = bool8;
        this.showRecentDevice = bool9;
        this.showUpcomingEvents = bool10;
        this.allowTagging = bool11;
    }

    public static r b(r rVar, String str, String str2, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i14) {
        Long l14 = rVar.profileId;
        String str3 = rVar.displayName;
        String str4 = (i14 & 4) != 0 ? rVar.fullName : str;
        String str5 = (i14 & 8) != 0 ? rVar.location : str2;
        j jVar = rVar.profileImageUrlWrapper;
        List<String> list = (i14 & 32) != 0 ? rVar.favoriteActivityTypes : arrayList;
        String str6 = rVar.activityVisibility;
        String str7 = str4;
        String str8 = str5;
        List<String> list2 = list;
        String str9 = rVar.profileVisibility;
        String str10 = rVar.badgeVisibility;
        String str11 = rVar.tagPermission;
        Boolean bool11 = (i14 & 1024) != 0 ? rVar.showAge : bool;
        Boolean bool12 = (i14 & 2048) != 0 ? rVar.showWeight : bool2;
        Boolean bool13 = (i14 & 4096) != 0 ? rVar.showHeight : bool3;
        Boolean bool14 = (i14 & 8192) != 0 ? rVar.showGender : bool4;
        Boolean bool15 = (i14 & 16384) != 0 ? rVar.showVO2Max : bool5;
        Boolean bool16 = (i14 & 32768) != 0 ? rVar.showPersonalRecords : bool6;
        Boolean bool17 = (i14 & 65536) != 0 ? rVar.showLast12Months : bool7;
        Boolean bool18 = (i14 & 131072) != 0 ? rVar.showLifetimeTotals : bool8;
        Boolean bool19 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? rVar.showRecentDevice : bool9;
        Boolean bool20 = (i14 & 524288) != 0 ? rVar.showUpcomingEvents : bool10;
        Boolean bool21 = rVar.allowTagging;
        rVar.getClass();
        return new r(l14, str3, str7, str8, jVar, list2, str6, str9, str10, str11, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21);
    }

    public final void A(String str) {
        this.fullName = str;
    }

    public final void C(o oVar) {
        this.tagPermission = oVar.f46938a;
    }

    public final g12.d d() {
        Object next;
        g12.d.a aVar = g12.d.f74882b;
        String str = this.badgeVisibility;
        g12.d dVar = g12.d.PRIVACY_MY_CONNECTIONS;
        aVar.getClass();
        dVar.getClass();
        Iterator<T> it = g12.d.f74885e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((g12.d) next).f74886a, str));
        g12.d dVar2 = (g12.d) next;
        return dVar2 == null ? dVar : dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return s.g(this.profileId, rVar.profileId) && s.g(this.displayName, rVar.displayName) && s.g(this.fullName, rVar.fullName) && s.g(this.location, rVar.location) && s.g(this.profileImageUrlWrapper, rVar.profileImageUrlWrapper) && s.g(this.favoriteActivityTypes, rVar.favoriteActivityTypes) && s.g(this.activityVisibility, rVar.activityVisibility) && s.g(this.profileVisibility, rVar.profileVisibility) && s.g(this.badgeVisibility, rVar.badgeVisibility) && s.g(this.tagPermission, rVar.tagPermission) && s.g(this.showAge, rVar.showAge) && s.g(this.showWeight, rVar.showWeight) && s.g(this.showHeight, rVar.showHeight) && s.g(this.showGender, rVar.showGender) && s.g(this.showVO2Max, rVar.showVO2Max) && s.g(this.showPersonalRecords, rVar.showPersonalRecords) && s.g(this.showLast12Months, rVar.showLast12Months) && s.g(this.showLifetimeTotals, rVar.showLifetimeTotals) && s.g(this.showRecentDevice, rVar.showRecentDevice) && s.g(this.showUpcomingEvents, rVar.showUpcomingEvents) && s.g(this.allowTagging, rVar.allowTagging);
    }

    public final List<String> f() {
        return this.favoriteActivityTypes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final int hashCode() {
        Long l14 = this.profileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        j jVar = this.profileImageUrlWrapper;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List<String> list = this.favoriteActivityTypes;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.activityVisibility;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileVisibility;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.badgeVisibility;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tagPermission;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.showAge;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showWeight;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showHeight;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showGender;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showVO2Max;
        int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.showPersonalRecords;
        int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.showLast12Months;
        int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.showLifetimeTotals;
        int iHashCode18 = (iHashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.showRecentDevice;
        int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.showUpcomingEvents;
        int iHashCode20 = (iHashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.allowTagging;
        return iHashCode20 + (bool11 != null ? bool11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getShowAge() {
        return this.showAge;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getShowGender() {
        return this.showGender;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getShowHeight() {
        return this.showHeight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getShowLast12Months() {
        return this.showLast12Months;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getShowLifetimeTotals() {
        return this.showLifetimeTotals;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getShowPersonalRecords() {
        return this.showPersonalRecords;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getShowRecentDevice() {
        return this.showRecentDevice;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getShowUpcomingEvents() {
        return this.showUpcomingEvents;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getShowVO2Max() {
        return this.showVO2Max;
    }

    public final String toString() {
        Long l14 = this.profileId;
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.location;
        j jVar = this.profileImageUrlWrapper;
        List<String> list = this.favoriteActivityTypes;
        String str4 = this.activityVisibility;
        String str5 = this.profileVisibility;
        String str6 = this.badgeVisibility;
        String str7 = this.tagPermission;
        Boolean bool = this.showAge;
        Boolean bool2 = this.showWeight;
        Boolean bool3 = this.showHeight;
        Boolean bool4 = this.showGender;
        Boolean bool5 = this.showVO2Max;
        Boolean bool6 = this.showPersonalRecords;
        Boolean bool7 = this.showLast12Months;
        Boolean bool8 = this.showLifetimeTotals;
        Boolean bool9 = this.showRecentDevice;
        Boolean bool10 = this.showUpcomingEvents;
        Boolean bool11 = this.allowTagging;
        StringBuilder sbJ = b71.i.j("UserProfilePrivacyV2DTO(profileId=", ", displayName=", str, l14, ", fullName=");
        sn.a.t(sbJ, str2, ", location=", str3, ", profileImageUrlWrapper=");
        sbJ.append(jVar);
        sbJ.append(", favoriteActivityTypes=");
        sbJ.append(list);
        sbJ.append(", activityVisibility=");
        sn.a.t(sbJ, str4, ", profileVisibility=", str5, ", badgeVisibility=");
        sn.a.t(sbJ, str6, ", tagPermission=", str7, ", showAge=");
        b71.i.o(bool, bool2, ", showWeight=", ", showHeight=", sbJ);
        b71.i.o(bool3, bool4, ", showGender=", ", showVO2Max=", sbJ);
        b71.i.o(bool5, bool6, ", showPersonalRecords=", ", showLast12Months=", sbJ);
        b71.i.o(bool7, bool8, ", showLifetimeTotals=", ", showRecentDevice=", sbJ);
        b71.i.o(bool9, bool10, ", showUpcomingEvents=", ", allowTagging=", sbJ);
        return p6.b.f(sbJ, bool11, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getShowWeight() {
        return this.showWeight;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.profileId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.location);
        parcel.writeParcelable(this.profileImageUrlWrapper, i14);
        parcel.writeStringList(this.favoriteActivityTypes);
        parcel.writeString(this.activityVisibility);
        parcel.writeString(this.profileVisibility);
        parcel.writeString(this.badgeVisibility);
        parcel.writeString(this.tagPermission);
        Boolean bool = this.showAge;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.showWeight;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.showHeight;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.showGender;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.showVO2Max;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.showPersonalRecords;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.showLast12Months;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.showLifetimeTotals;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
        Boolean bool9 = this.showRecentDevice;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool9);
        }
        Boolean bool10 = this.showUpcomingEvents;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool10);
        }
        Boolean bool11 = this.allowTagging;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool11);
        }
    }

    public final o y() {
        String str = this.tagPermission;
        if (str == null) {
            return null;
        }
        o.f46931b.getClass();
        return o.a.a(str);
    }

    public final void z(String str) {
        str.getClass();
        this.badgeVisibility = str;
    }
}
