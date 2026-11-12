package l20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.contacts.model.ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter;
import com.garmin.android.apps.connectmobile.contacts.model.ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b8\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b9\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b:\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b6\u0010ER\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010&\u001a\u0004\bG\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b;\u0010JR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010,\u001a\u0004\bF\u0010.R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bK\u0010MR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010&\u001a\u0004\bN\u0010(R\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Ll20/c;", "Landroid/os/Parcelable;", "", "contactInfoPk", "", FirebaseAnalytics.Param.CONTENT, "", "isPrimary", "", "flagId", "labelType", "isLiveEventSharingDefault", "isEmsValue", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "isValid", "validationDate", "Ll20/e;", "smsOptinStatus", "phoneUUID", "isSmsOptinAware", "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "confirmationStatus", "confirmationDate", "Lcom/garmin/android/apps/connectmobile/contacts/model/b;", "declineReason", "emergencyContactMethod", "", "Ll20/b;", "features", "messengerAccountStatus", "localId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ll20/e;Ljava/lang/String;Ljava/lang/Boolean;Lcom/garmin/android/apps/connectmobile/contacts/model/a;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/contacts/model/b;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;I)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "c", "Ljava/lang/Boolean;", "h0", "()Ljava/lang/Boolean;", "d", "Ljava/lang/Integer;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "f", "e0", "g", "c0", "j", "j0", "A", JWKParameterNames.OCT_KEY_VALUE, "Ll20/e;", "z", "()Ll20/e;", "l", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "m", "i0", JWKParameterNames.RSA_MODULUS, "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "()Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "o", "getConfirmationDate", "p", "Lcom/garmin/android/apps/connectmobile/contacts/model/b;", "()Lcom/garmin/android/apps/connectmobile/contacts/model/b;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ljava/util/List;", "()Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "I", "s", "()I", "k0", "(I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactInfoPk")
    private final Long contactInfoPk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private String content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPrimary")
    private final Boolean isPrimary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flag")
    private final Integer flagId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final Integer labelType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingDefault")
    private final Boolean isLiveEventSharingDefault;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isEmsValue")
    private final Boolean isEmsValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isValid")
    private final Boolean isValid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("validationDate")
    private final String validationDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("smsOptinStatus")
    private final e smsOptinStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneUUID")
    private final String phoneUUID;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("smsOptinAware")
    private final Boolean isSmsOptinAware;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmationStatus")
    @JsonAdapter(ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter.class)
    private final com.garmin.android.apps.connectmobile.contacts.model.a confirmationStatus;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmationDate")
    private final String confirmationDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("declineReason")
    @JsonAdapter(ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter.class)
    private final com.garmin.android.apps.connectmobile.contacts.model.b declineReason;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emergencyContactMethod")
    private final Boolean emergencyContactMethod;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("features")
    private final List<b> features;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messengerAccountStatus")
    private final String messengerAccountStatus;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int localId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            parcel.getClass();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            e eVarCreateFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            com.garmin.android.apps.connectmobile.contacts.model.a aVarValueOf = parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.contacts.model.a.valueOf(parcel.readString());
            String string5 = parcel.readString();
            com.garmin.android.apps.connectmobile.contacts.model.b bVarValueOf = parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.contacts.model.b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                    boolValueOf = boolValueOf;
                    i14 = i14;
                }
                arrayList = arrayList2;
            }
            return new c(lValueOf, string, boolValueOf, numValueOf, numValueOf2, boolValueOf2, boolValueOf3, string2, boolValueOf4, string3, eVarCreateFromParcel, string4, boolValueOf5, aVarValueOf, string5, bVarValueOf, boolValueOf6, arrayList, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(Long l14, String str, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str2, Boolean bool4, String str3, e eVar, String str4, Boolean bool5, com.garmin.android.apps.connectmobile.contacts.model.a aVar, String str5, com.garmin.android.apps.connectmobile.contacts.model.b bVar, Boolean bool6, List list, String str6, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : l14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : bool, (i15 & 8) != 0 ? null : num, (i15 & 16) != 0 ? null : num2, (i15 & 32) != 0 ? Boolean.FALSE : bool2, (i15 & 64) != 0 ? null : bool3, (i15 & 128) != 0 ? null : str2, (i15 & 256) != 0 ? null : bool4, (i15 & 512) != 0 ? null : str3, (i15 & 1024) != 0 ? null : eVar, (i15 & 2048) != 0 ? null : str4, (i15 & 4096) != 0 ? null : bool5, (i15 & 8192) != 0 ? null : aVar, (i15 & 16384) != 0 ? null : str5, (i15 & 32768) != 0 ? null : bVar, (i15 & 65536) != 0 ? null : bool6, (i15 & 131072) != 0 ? null : list, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str6, (i15 & 524288) != 0 ? -1 : i14);
    }

    public static c b(c cVar, Long l14, String str, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str2, com.garmin.android.apps.connectmobile.contacts.model.a aVar, Boolean bool4, int i14, int i15) {
        Long l15 = (i15 & 1) != 0 ? cVar.contactInfoPk : l14;
        String str3 = (i15 & 2) != 0 ? cVar.content : str;
        Boolean bool5 = cVar.isPrimary;
        Integer num3 = (i15 & 8) != 0 ? cVar.flagId : num;
        Integer num4 = (i15 & 16) != 0 ? cVar.labelType : num2;
        Boolean bool6 = (i15 & 32) != 0 ? cVar.isLiveEventSharingDefault : bool;
        Boolean bool7 = (i15 & 64) != 0 ? cVar.isEmsValue : bool2;
        String str4 = cVar.countryCode;
        Boolean bool8 = (i15 & 256) != 0 ? cVar.isValid : bool3;
        String str5 = cVar.validationDate;
        e eVar = cVar.smsOptinStatus;
        String str6 = (i15 & 2048) != 0 ? cVar.phoneUUID : str2;
        Boolean bool9 = cVar.isSmsOptinAware;
        com.garmin.android.apps.connectmobile.contacts.model.a aVar2 = (i15 & 8192) != 0 ? cVar.confirmationStatus : aVar;
        String str7 = cVar.confirmationDate;
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = cVar.declineReason;
        Boolean bool10 = (i15 & 65536) != 0 ? cVar.emergencyContactMethod : bool4;
        List<b> list = cVar.features;
        String str8 = cVar.messengerAccountStatus;
        int i16 = (i15 & 524288) != 0 ? cVar.localId : i14;
        cVar.getClass();
        return new c(l15, str3, bool5, num3, num4, bool6, bool7, str4, bool8, str5, eVar, str6, bool9, aVar2, str7, bVar, bool10, list, str8, i16);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getValidationDate() {
        return this.validationDate;
    }

    public final boolean C() {
        return this.contactInfoPk != null && G();
    }

    public final boolean D() {
        return (!G() || a0() || this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.NONE) ? false : true;
    }

    public final boolean F() {
        return G() && g0();
    }

    public final boolean G() {
        return s.g(this.emergencyContactMethod, Boolean.TRUE);
    }

    public final boolean H() {
        return G() && this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.ACCEPTED;
    }

    public final boolean I() {
        return G() && this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED;
    }

    public final boolean M() {
        return G() && this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.LEGACY;
    }

    public final boolean Z() {
        return G() && this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.PENDING;
    }

    public final boolean a0() {
        return G() && this.confirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Boolean getIsEmsValue() {
        return this.isEmsValue;
    }

    public final boolean d() {
        if (!f()) {
            return false;
        }
        e eVar = this.smsOptinStatus;
        return ((eVar != null ? eVar.getEmergencyAssistanceFitnessStatus() : null) == null || this.smsOptinStatus.getEmergencyAssistanceFitnessStatus() == f.UNKNOWN) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getIsLiveEventSharingDefault() {
        return this.isLiveEventSharingDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.contactInfoPk, cVar.contactInfoPk) && s.g(this.content, cVar.content) && s.g(this.isPrimary, cVar.isPrimary) && s.g(this.flagId, cVar.flagId) && s.g(this.labelType, cVar.labelType) && s.g(this.isLiveEventSharingDefault, cVar.isLiveEventSharingDefault) && s.g(this.isEmsValue, cVar.isEmsValue) && s.g(this.countryCode, cVar.countryCode) && s.g(this.isValid, cVar.isValid) && s.g(this.validationDate, cVar.validationDate) && s.g(this.smsOptinStatus, cVar.smsOptinStatus) && s.g(this.phoneUUID, cVar.phoneUUID) && s.g(this.isSmsOptinAware, cVar.isSmsOptinAware) && this.confirmationStatus == cVar.confirmationStatus && s.g(this.confirmationDate, cVar.confirmationDate) && this.declineReason == cVar.declineReason && s.g(this.emergencyContactMethod, cVar.emergencyContactMethod) && s.g(this.features, cVar.features) && s.g(this.messengerAccountStatus, cVar.messengerAccountStatus) && this.localId == cVar.localId;
    }

    public final boolean f() {
        if (!s.g(this.isSmsOptinAware, Boolean.TRUE)) {
            return false;
        }
        e eVar = this.smsOptinStatus;
        return (eVar != null ? eVar.getEmergencyAssistanceFitnessStatus() : null) != f.OPTIN;
    }

    public final boolean f0() {
        e eVar = this.smsOptinStatus;
        return (eVar != null ? eVar.getLiveEventSharingFitnessStatus() : null) == f.OPTIN;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.garmin.android.apps.connectmobile.contacts.model.a getConfirmationStatus() {
        return this.confirmationStatus;
    }

    public final boolean g0() {
        m.a aVar = m.f109021b;
        Integer num = this.flagId;
        aVar.getClass();
        return m.a.a(num) == m.AUTO_LIVE_TRACK;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getContactInfoPk() {
        return this.contactInfoPk;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public final int hashCode() {
        Long l14 = this.contactInfoPk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isPrimary;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.flagId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.labelType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isLiveEventSharingDefault;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEmsValue;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.countryCode;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.isValid;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.validationDate;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.smsOptinStatus;
        int iHashCode11 = (iHashCode10 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str4 = this.phoneUUID;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool5 = this.isSmsOptinAware;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.confirmationStatus;
        int iHashCode14 = (iHashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str5 = this.confirmationDate;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        int iHashCode16 = (iHashCode15 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool6 = this.emergencyContactMethod;
        int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<b> list = this.features;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.messengerAccountStatus;
        return Integer.hashCode(this.localId) + ((iHashCode18 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Boolean getIsSmsOptinAware() {
        return this.isSmsOptinAware;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final com.garmin.android.apps.connectmobile.contacts.model.b getDeclineReason() {
        return this.declineReason;
    }

    public final void k0(int i14) {
        this.localId = i14;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[RETURN] */
    public final k m() {
        k.a aVar = k.f109008d;
        Integer num = this.labelType;
        aVar.getClass();
        for (k kVar : k.values()) {
            int i14 = kVar.f109012a;
            if (num != null && i14 == num.intValue()) {
                if (kVar == null) {
                    return k.OTHER;
                }
                return kVar;
            }
        }
        kVar = null;
        if (kVar == null) {
            return k.OTHER;
        }
        return kVar;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getEmergencyContactMethod() {
        return this.emergencyContactMethod;
    }

    public final List<b> q() {
        return this.features;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getFlagId() {
        return this.flagId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getLocalId() {
        return this.localId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getMessengerAccountStatus() {
        return this.messengerAccountStatus;
    }

    public final String toString() {
        Long l14 = this.contactInfoPk;
        String str = this.content;
        Boolean bool = this.isPrimary;
        Integer num = this.flagId;
        Integer num2 = this.labelType;
        Boolean bool2 = this.isLiveEventSharingDefault;
        Boolean bool3 = this.isEmsValue;
        String str2 = this.countryCode;
        Boolean bool4 = this.isValid;
        String str3 = this.validationDate;
        e eVar = this.smsOptinStatus;
        String str4 = this.phoneUUID;
        Boolean bool5 = this.isSmsOptinAware;
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.confirmationStatus;
        String str5 = this.confirmationDate;
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        Boolean bool6 = this.emergencyContactMethod;
        List<b> list = this.features;
        String str6 = this.messengerAccountStatus;
        int i14 = this.localId;
        StringBuilder sbJ = b71.i.j("ContactInfoDTO(contactInfoPk=", ", content=", str, l14, ", isPrimary=");
        sbJ.append(bool);
        sbJ.append(", flagId=");
        sbJ.append(num);
        sbJ.append(", labelType=");
        kg.f.r(sbJ, num2, ", isLiveEventSharingDefault=", bool2, ", isEmsValue=");
        b71.i.s(sbJ, bool3, ", countryCode=", str2, ", isValid=");
        b71.i.s(sbJ, bool4, ", validationDate=", str3, ", smsOptinStatus=");
        sbJ.append(eVar);
        sbJ.append(", phoneUUID=");
        sbJ.append(str4);
        sbJ.append(", isSmsOptinAware=");
        sbJ.append(bool5);
        sbJ.append(", confirmationStatus=");
        sbJ.append(aVar);
        sbJ.append(", confirmationDate=");
        sbJ.append(str5);
        sbJ.append(", declineReason=");
        sbJ.append(bVar);
        sbJ.append(", emergencyContactMethod=");
        sbJ.append(bool6);
        sbJ.append(", features=");
        sbJ.append(list);
        sbJ.append(", messengerAccountStatus=");
        sbJ.append(str6);
        sbJ.append(", localId=");
        sbJ.append(i14);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[RETURN] */
    public final p u() {
        p.a aVar = p.f109036d;
        Integer num = this.labelType;
        aVar.getClass();
        for (p pVar : p.values()) {
            int i14 = pVar.f109040a;
            if (num != null && i14 == num.intValue()) {
                if (pVar == null) {
                    return p.OTHER;
                }
                return pVar;
            }
        }
        pVar = null;
        if (pVar == null) {
            return p.OTHER;
        }
        return pVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.contactInfoPk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.content);
        Boolean bool = this.isPrimary;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Integer num = this.flagId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.labelType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Boolean bool2 = this.isLiveEventSharingDefault;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isEmsValue;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        parcel.writeString(this.countryCode);
        Boolean bool4 = this.isValid;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        parcel.writeString(this.validationDate);
        e eVar = this.smsOptinStatus;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.phoneUUID);
        Boolean bool5 = this.isSmsOptinAware;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.confirmationStatus;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.confirmationDate);
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        Boolean bool6 = this.emergencyContactMethod;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        List<b> list = this.features;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((b) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.messengerAccountStatus);
        parcel.writeInt(this.localId);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getPhoneUUID() {
        return this.phoneUUID;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final e getSmsOptinStatus() {
        return this.smsOptinStatus;
    }

    public c(Long l14, String str, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str2, Boolean bool4, String str3, e eVar, String str4, Boolean bool5, com.garmin.android.apps.connectmobile.contacts.model.a aVar, String str5, com.garmin.android.apps.connectmobile.contacts.model.b bVar, Boolean bool6, List<b> list, String str6, int i14) {
        this.contactInfoPk = l14;
        this.content = str;
        this.isPrimary = bool;
        this.flagId = num;
        this.labelType = num2;
        this.isLiveEventSharingDefault = bool2;
        this.isEmsValue = bool3;
        this.countryCode = str2;
        this.isValid = bool4;
        this.validationDate = str3;
        this.smsOptinStatus = eVar;
        this.phoneUUID = str4;
        this.isSmsOptinAware = bool5;
        this.confirmationStatus = aVar;
        this.confirmationDate = str5;
        this.declineReason = bVar;
        this.emergencyContactMethod = bool6;
        this.features = list;
        this.messengerAccountStatus = str6;
        this.localId = i14;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
    }
}
