package zo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lzo0/n;", "", "<init>", "()V", "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "f", "g", "p", JWKParameterNames.RSA_EXPONENT, "c", JWKParameterNames.RSA_MODULUS, JWKParameterNames.OCT_KEY_VALUE, "o", "a", IntegerTokenConverter.CONVERTER_KEY, "h", "j", "m", "b", "l", "Lzo0/n$a;", "Lzo0/n$b;", "Lzo0/n$c;", "Lzo0/n$d;", "Lzo0/n$e;", "Lzo0/n$f;", "Lzo0/n$g;", "Lzo0/n$h;", "Lzo0/n$i;", "Lzo0/n$j;", "Lzo0/n$k;", "Lzo0/n$l;", "Lzo0/n$m;", "Lzo0/n$n;", "Lzo0/n$o;", "Lzo0/n$p;", "Lzo0/n$q;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$a;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f206171a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1710423598;
        }

        public final String toString() {
            return "ActiveIntelligenceData";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$b;", "Lzo0/n;", "Lk31/c;", "item", "<init>", "(Lk31/c;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k31.c f206172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k31.c cVar) {
            super(null);
            cVar.getClass();
            this.f206172a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f206172a == ((b) obj).f206172a;
        }

        public final int hashCode() {
            return this.f206172a.hashCode();
        }

        public final String toString() {
            return "AppOnboardingData(item=" + this.f206172a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$c;", "Lzo0/n;", "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Lsd2/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sd2.f f206173a;

        public c(sd2.f fVar) {
            super(null);
            this.f206173a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f206173a, ((c) obj).f206173a);
        }

        public final int hashCode() {
            sd2.f fVar = this.f206173a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public final String toString() {
            return "BLEUpgradeDialogData(deviceDatabaseRecord=" + this.f206173a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$d;", "Lzo0/n;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "unredeemedCodePopupDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/u;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.badges.service.model.u f206174a;

        static {
            int i14 = com.garmin.android.apps.connectmobile.badges.service.model.u.f30680g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.garmin.android.apps.connectmobile.badges.service.model.u uVar) {
            super(null);
            uVar.getClass();
            this.f206174a = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f206174a, ((d) obj).f206174a);
        }

        public final int hashCode() {
            return this.f206174a.hashCode();
        }

        public final String toString() {
            return "BadgesDialogData(unredeemedCodePopupDTO=" + this.f206174a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$e;", "Lzo0/n;", "Lbb2/i;", "deviceNeedsBond", "<init>", "(Lbb2/i;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bb2.i f206175a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(bb2.i iVar) {
            super(null);
            iVar.getClass();
            this.f206175a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f206175a, ((e) obj).f206175a);
        }

        public final int hashCode() {
            return this.f206175a.hashCode();
        }

        public final String toString() {
            return "DeviceReconnectDialogData(deviceNeedsBond=" + this.f206175a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$f;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f206176a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1211188659;
        }

        public final String toString() {
            return "MCTDialogData";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/n$g;", "Lzo0/n;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f206177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f206178b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f206177a = str;
            this.f206178b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p005kotlin.jvm.internal.s.g(this.f206177a, gVar.f206177a) && p005kotlin.jvm.internal.s.g(this.f206178b, gVar.f206178b);
        }

        public final int hashCode() {
            return this.f206178b.hashCode() + (this.f206177a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("NonSupportedCountryGEOSDialogData(title=", this.f206177a, ", message=", this.f206178b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$h;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f206179a = new h();

        private h() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -476127875;
        }

        public final String toString() {
            return "OnboardingRaceEventSearchData";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$i;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f206180a = new i();

        private i() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 505185367;
        }

        public final String toString() {
            return "OnboardingSafetyFeaturesData";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$j;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f206181a = new j();

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1350368096;
        }

        public final String toString() {
            return "OnboardingWeatherData";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzo0/n$k;", "Lzo0/n;", "Lsd2/f;", "deviceDatabaseRecord", "", "Lap0/g;", "features", "<init>", "(Lsd2/f;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sd2.f f206182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ap0.g> f206183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(sd2.f fVar, List<? extends ap0.g> list) {
            super(null);
            fVar.getClass();
            list.getClass();
            this.f206182a = fVar;
            this.f206183b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p005kotlin.jvm.internal.s.g(this.f206182a, kVar.f206182a) && p005kotlin.jvm.internal.s.g(this.f206183b, kVar.f206183b);
        }

        public final int hashCode() {
            return this.f206183b.hashCode() + (this.f206182a.hashCode() * 31);
        }

        public final String toString() {
            return "OnboardingWelcomeDialogData(deviceDatabaseRecord=" + this.f206182a + ", features=" + this.f206183b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzo0/n$l;", "Lzo0/n;", "", "badgeKey", "badgeUuid", "title", "description", "imageURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f206184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f206185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f206186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f206187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f206188e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, String str3, String str4, String str5) {
            super(null);
            str.getClass();
            this.f206184a = str;
            this.f206185b = str2;
            this.f206186c = str3;
            this.f206187d = str4;
            this.f206188e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p005kotlin.jvm.internal.s.g(this.f206184a, lVar.f206184a) && p005kotlin.jvm.internal.s.g(this.f206185b, lVar.f206185b) && p005kotlin.jvm.internal.s.g(this.f206186c, lVar.f206186c) && p005kotlin.jvm.internal.s.g(this.f206187d, lVar.f206187d) && p005kotlin.jvm.internal.s.g(this.f206188e, lVar.f206188e);
        }

        public final int hashCode() {
            int iHashCode = this.f206184a.hashCode() * 31;
            String str = this.f206185b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f206186c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f206187d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f206188e;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("PartnerChallengePromoteData(badgeKey=", this.f206184a, ", badgeUuid=", this.f206185b, ", title=");
            sn.a.t(sbI, this.f206186c, ", description=", this.f206187d, ", imageURL=");
            return am.j.o(this.f206188e, ")", sbI);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzo0/n$m;", "Lzo0/n;", "", "promoId", "Lub1/k;", "alertComposable", "<init>", "(Ljava/lang/String;Lub1/k;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f206189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ub1.k f206190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, ub1.k kVar) {
            super(null);
            str.getClass();
            kVar.getClass();
            this.f206189a = str;
            this.f206190b = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return p005kotlin.jvm.internal.s.g(this.f206189a, mVar.f206189a) && p005kotlin.jvm.internal.s.g(this.f206190b, mVar.f206190b);
        }

        public final int hashCode() {
            return this.f206190b.hashCode() + (this.f206189a.hashCode() * 31);
        }

        public final String toString() {
            return "PromoAlertData(promoId=" + this.f206189a + ", alertComposable=" + this.f206190b + ")";
        }
    }

    /* JADX INFO: renamed from: zo0.n$n, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$n;", "Lzo0/n;", "", "message", "<init>", "(Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3845n extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f206191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3845n(String str) {
            super(null);
            str.getClass();
            this.f206191a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3845n) && p005kotlin.jvm.internal.s.g(this.f206191a, ((C3845n) obj).f206191a);
        }

        public final int hashCode() {
            return this.f206191a.hashCode();
        }

        public final String toString() {
            return am.j.m("ScheduledServerMaintenanceData(message=", this.f206191a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$o;", "Lzo0/n;", "", "notificationsEnabled", "<init>", "(Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f206192a;

        public o(boolean z14) {
            super(null);
            this.f206192a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f206192a == ((o) obj).f206192a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206192a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SubscriptionAllSetData(notificationsEnabled=", ")", this.f206192a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo0/n$p;", "Lzo0/n;", "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Lsd2/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sd2.f f206193a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(sd2.f fVar) {
            super(null);
            fVar.getClass();
            this.f206193a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && p005kotlin.jvm.internal.s.g(this.f206193a, ((p) obj).f206193a);
        }

        public final int hashCode() {
            return this.f206193a.hashCode();
        }

        public final String toString() {
            return "SystemBondingLostDialogData(deviceDatabaseRecord=" + this.f206193a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo0/n$q;", "Lzo0/n;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f206194a = new q();

        private q() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1117941945;
        }

        public final String toString() {
            return "VoiceAssistantData";
        }
    }

    public /* synthetic */ n(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private n() {
    }
}
