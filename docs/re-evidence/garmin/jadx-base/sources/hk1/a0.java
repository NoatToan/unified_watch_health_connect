package hk1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002\u001a Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001f\u001a\u0004\b*\u0010+R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010\u001f\u001a\u0004\b.\u0010+R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010$\u0012\u0004\b2\u0010\u001f\u001a\u0004\b1\u0010&R \u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010$\u0012\u0004\b5\u0010\u001f\u001a\u0004\b4\u0010&R \u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010$\u0012\u0004\b8\u0010\u001f\u001a\u0004\b7\u0010&R \u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010)\u0012\u0004\b:\u0010\u001f\u001a\u0004\b\u000e\u0010+R \u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010)\u0012\u0004\b<\u0010\u001f\u001a\u0004\b\u000f\u0010+R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010$\u0012\u0004\b?\u0010\u001f\u001a\u0004\b>\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010$\u0012\u0004\bB\u0010\u001f\u001a\u0004\bA\u0010&R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010$\u0012\u0004\bE\u0010\u001f\u001a\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lhk1/a0;", "Landroid/os/Parcelable;", "Lhk1/r;", "", "userProfilePk", "consumerPk", "", "consumerKey", "", "oauth1", "diOauth2", "applicationName", "createDate", "consentTypeId", "isAuthProhibited", "isFirstBeatEnabled", "callbackUrl", "imageUrl", "privacyPolicyUrl", "<init>", "(JJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJJLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "J", "getUserProfilePk", "()J", "getUserProfilePk$annotations", "()V", "b", "getConsumerPk", "getConsumerPk$annotations", "c", "Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", "getConsumerKey$annotations", "d", "Z", "getOauth1", "()Z", "getOauth1$annotations", JWKParameterNames.RSA_EXPONENT, "getDiOauth2", "getDiOauth2$annotations", "f", "o", "getApplicationName$annotations", "g", "getCreateDate", "getCreateDate$annotations", "h", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getConsentTypeId$annotations", IntegerTokenConverter.CONVERTER_KEY, "isAuthProhibited$annotations", "j", "isFirstBeatEnabled$annotations", JWKParameterNames.OCT_KEY_VALUE, "getCallbackUrl", "getCallbackUrl$annotations", "l", "getImageUrl", "getImageUrl$annotations", "m", "s", "getPrivacyPolicyUrl$annotations", "Companion", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a0 implements Parcelable, r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f84098o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerPk")
    private final long consumerPk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumerKey")
    private final String consumerKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("oauth1")
    private final boolean oauth1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diOauth2")
    private final boolean diOauth2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationName")
    private final String applicationName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consentTypeId")
    private final String consentTypeId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestTokenAuthorizationProhibited")
    private final boolean isAuthProhibited;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstbeatServerSideAnalysisEnabled")
    private final boolean isFirstBeatEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("callbackUrl")
    private final String callbackUrl;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a0> CREATOR = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f84097n = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/settings/thirdparty/model/UserPartnerConnectionDTO.$serializer", "Lm63/e0;", "Lhk1/a0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84112a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f84112a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.settings.thirdparty.model.UserPartnerConnectionDTO", aVar, 13);
            m1Var.j("userProfilePk", false);
            m1Var.j("consumerPk", false);
            m1Var.j("consumerKey", false);
            m1Var.j("oauth1", false);
            m1Var.j("diOauth2", false);
            m1Var.j("applicationName", false);
            m1Var.j("createDate", false);
            m1Var.j("consentTypeId", false);
            m1Var.j("requestTokenAuthorizationProhibited", false);
            m1Var.j("firstbeatServerSideAnalysisEnabled", false);
            m1Var.j("callbackUrl", false);
            m1Var.j("imageUrl", false);
            m1Var.j("privacyPolicyUrl", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = a0.f84098o;
            v0 v0Var = v0.f117027a;
            y1 y1Var = y1.f117048a;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{v0Var, v0Var, y1Var, gVar, gVar, lVarArr[5].getValue(), y1Var, y1Var, gVar, gVar, j63.a.d(lVarArr[10].getValue()), j63.a.d(lVarArr[11].getValue()), j63.a.d(lVarArr[12].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            o13.l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr2 = a0.f84098o;
            int i14 = l63.c.f110557a;
            long jW = 0;
            long jW2 = 0;
            String str = null;
            boolean z14 = true;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i15 = 0;
            String strR = null;
            boolean zG = false;
            boolean zG2 = false;
            String strR2 = null;
            String strR3 = null;
            boolean zG3 = false;
            boolean zG4 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        lVarArr = lVarArr2;
                        z14 = false;
                        break;
                    case 0:
                        lVarArr = lVarArr2;
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        jW2 = cVarC.w(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        lVarArr = lVarArr2;
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        lVarArr = lVarArr2;
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        lVarArr = lVarArr2;
                        zG2 = cVarC.g(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        str2 = (String) cVarC.l(eVar2, 5, lVarArr[5].getValue(), str2);
                        i15 |= 32;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        strR2 = cVarC.r(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        strR3 = cVarC.r(eVar2, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        zG3 = cVarC.g(eVar2, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        zG4 = cVarC.g(eVar2, 9);
                        i15 |= 512;
                        break;
                    case 10:
                        lVarArr = lVarArr2;
                        str4 = (String) cVarC.v(eVar2, 10, lVarArr[10].getValue(), str4);
                        i15 |= 1024;
                        break;
                    case 11:
                        lVarArr = lVarArr2;
                        str3 = (String) cVarC.v(eVar2, 11, lVarArr[11].getValue(), str3);
                        i15 |= 2048;
                        break;
                    case 12:
                        lVarArr = lVarArr2;
                        str = (String) cVarC.v(eVar2, 12, lVarArr2[12].getValue(), str);
                        i15 |= 4096;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr2 = lVarArr;
            }
            cVarC.b(eVar2);
            return new a0(i15, jW, jW2, strR, zG, zG2, str2, strR2, strR3, zG3, zG4, str4, str3, str, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a0 a0Var = (a0) obj;
            a0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            a0.t(a0Var, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            boolean z14;
            parcel.getClass();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            boolean z15 = false;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            String string2 = parcel.readString();
            boolean z17 = false;
            String string3 = parcel.readString();
            boolean z18 = z14;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z17 = z18;
            }
            if (parcel.readInt() == 0) {
                z18 = false;
            }
            return new a0(j8, j14, string, z16, z15, string2, string3, string4, z17, z18, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f84098o = new o13.l[]{null, null, null, null, null, o13.m.a(nVar, new ha0.a(10)), null, null, null, null, o13.m.a(nVar, new ha0.a(11)), o13.m.a(nVar, new ha0.a(12)), o13.m.a(nVar, new ha0.a(13))};
    }

    public /* synthetic */ a0(int i14, long j8, long j14, String str, boolean z14, boolean z15, String str2, String str3, String str4, boolean z16, boolean z17, String str5, String str6, String str7, u1 u1Var) {
        if (8191 != (i14 & 8191)) {
            k1.h(i14, 8191, a.f84112a.getF158591b());
            throw null;
        }
        this.userProfilePk = j8;
        this.consumerPk = j14;
        this.consumerKey = str;
        this.oauth1 = z14;
        this.diOauth2 = z15;
        this.applicationName = str2;
        this.createDate = str3;
        this.consentTypeId = str4;
        this.isAuthProhibited = z16;
        this.isFirstBeatEnabled = z17;
        this.callbackUrl = str5;
        this.imageUrl = str6;
        this.privacyPolicyUrl = str7;
    }

    public static final /* synthetic */ void t(a0 a0Var, l63.d dVar, k63.e eVar) {
        dVar.z(eVar, 0, a0Var.userProfilePk);
        dVar.z(eVar, 1, a0Var.consumerPk);
        dVar.k(eVar, 2, a0Var.consumerKey);
        dVar.n(eVar, 3, a0Var.oauth1);
        dVar.n(eVar, 4, a0Var.diOauth2);
        o13.l<i63.c<Object>>[] lVarArr = f84098o;
        dVar.e(eVar, 5, lVarArr[5].getValue(), a0Var.applicationName);
        dVar.k(eVar, 6, a0Var.createDate);
        dVar.k(eVar, 7, a0Var.consentTypeId);
        dVar.n(eVar, 8, a0Var.isAuthProhibited);
        dVar.n(eVar, 9, a0Var.isFirstBeatEnabled);
        dVar.d(eVar, 10, lVarArr[10].getValue(), a0Var.callbackUrl);
        dVar.d(eVar, 11, lVarArr[11].getValue(), a0Var.imageUrl);
        dVar.d(eVar, 12, lVarArr[12].getValue(), a0Var.privacyPolicyUrl);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFirstBeatEnabled() {
        return this.isFirstBeatEnabled;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: d */
    public final boolean getUnverified() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.userProfilePk == a0Var.userProfilePk && this.consumerPk == a0Var.consumerPk && p005kotlin.jvm.internal.s.g(this.consumerKey, a0Var.consumerKey) && this.oauth1 == a0Var.oauth1 && this.diOauth2 == a0Var.diOauth2 && p005kotlin.jvm.internal.s.g(this.applicationName, a0Var.applicationName) && p005kotlin.jvm.internal.s.g(this.createDate, a0Var.createDate) && p005kotlin.jvm.internal.s.g(this.consentTypeId, a0Var.consentTypeId) && this.isAuthProhibited == a0Var.isAuthProhibited && this.isFirstBeatEnabled == a0Var.isFirstBeatEnabled && p005kotlin.jvm.internal.s.g(this.callbackUrl, a0Var.callbackUrl) && p005kotlin.jvm.internal.s.g(this.imageUrl, a0Var.imageUrl) && p005kotlin.jvm.internal.s.g(this.privacyPolicyUrl, a0Var.privacyPolicyUrl);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getConsentTypeId() {
        return this.consentTypeId;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(wr.g.j(wr.g.j(wr.g.j(q6.f.g(q6.f.g(wr.g.j(q6.f.e(Long.hashCode(this.userProfilePk) * 31, 31, this.consumerPk), 31, this.consumerKey), 31, this.oauth1), 31, this.diOauth2), 31, this.applicationName), 31, this.createDate), 31, this.consentTypeId), 31, this.isAuthProhibited), 31, this.isFirstBeatEnabled);
        String str = this.callbackUrl;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.privacyPolicyUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAuthProhibited() {
        return this.isAuthProhibited;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getRedirectUri() {
        return this.callbackUrl;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getConsumerKey() {
        return this.consumerKey;
    }

    @Override // hk1.r
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String o() {
        return this.applicationName;
    }

    public final String q() {
        return this.consentTypeId;
    }

    public final String r() {
        return this.consumerKey;
    }

    public final String s() {
        return this.privacyPolicyUrl;
    }

    public final String toString() {
        long j8 = this.userProfilePk;
        long j14 = this.consumerPk;
        String str = this.consumerKey;
        boolean z14 = this.oauth1;
        boolean z15 = this.diOauth2;
        String str2 = this.applicationName;
        String str3 = this.createDate;
        String str4 = this.consentTypeId;
        boolean z16 = this.isAuthProhibited;
        boolean z17 = this.isFirstBeatEnabled;
        String str5 = this.callbackUrl;
        String str6 = this.imageUrl;
        String str7 = this.privacyPolicyUrl;
        StringBuilder sbK = ds.e0.k(j8, "UserPartnerConnectionDTO(userProfilePk=", ", consumerPk=");
        p6.b.k(j14, ", consumerKey=", str, sbK);
        com.airbnb.lottie.animation.keyframe.a.v(", oauth1=", ", diOauth2=", sbK, z14, z15);
        sn.a.t(sbK, ", applicationName=", str2, ", createDate=", str3);
        com.airbnb.lottie.animation.keyframe.a.t(", consentTypeId=", str4, ", isAuthProhibited=", sbK, z16);
        sbK.append(", isFirstBeatEnabled=");
        sbK.append(z17);
        sbK.append(", callbackUrl=");
        sbK.append(str5);
        sn.a.t(sbK, ", imageUrl=", str6, ", privacyPolicyUrl=", str7);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePk);
        parcel.writeLong(this.consumerPk);
        parcel.writeString(this.consumerKey);
        parcel.writeInt(this.oauth1 ? 1 : 0);
        parcel.writeInt(this.diOauth2 ? 1 : 0);
        parcel.writeString(this.applicationName);
        parcel.writeString(this.createDate);
        parcel.writeString(this.consentTypeId);
        parcel.writeInt(this.isAuthProhibited ? 1 : 0);
        parcel.writeInt(this.isFirstBeatEnabled ? 1 : 0);
        parcel.writeString(this.callbackUrl);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.privacyPolicyUrl);
    }

    /* JADX INFO: renamed from: hk1.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhk1/a0$b;", "", "<init>", "()V", "Li63/c;", "Lhk1/a0;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a0> serializer() {
            return a.f84112a;
        }

        private Companion() {
        }
    }

    public a0(long j8, long j14, String str, boolean z14, boolean z15, String str2, String str3, String str4, boolean z16, boolean z17, String str5, String str6, String str7) {
        kg.f.p(str, str2, str3, str4);
        this.userProfilePk = j8;
        this.consumerPk = j14;
        this.consumerKey = str;
        this.oauth1 = z14;
        this.diOauth2 = z15;
        this.applicationName = str2;
        this.createDate = str3;
        this.consentTypeId = str4;
        this.isAuthProhibited = z16;
        this.isFirstBeatEnabled = z17;
        this.callbackUrl = str5;
        this.imageUrl = str6;
        this.privacyPolicyUrl = str7;
    }
}
