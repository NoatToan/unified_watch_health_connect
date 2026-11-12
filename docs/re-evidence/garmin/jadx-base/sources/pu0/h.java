package pu0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBÃ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpu0/h;", "", "", "contactId", "", FirebaseAnalytics.Param.CONTENT, "Lpu0/g;", "flag", "", "isPrimary", "", "labelType", "localId", "emergencyContactMethod", "Lpu0/j;", "smsOptInLiveTrackStatus", "isValid", "isEmsValue", "isSmsOptionAware", "confirmationStatus", "Lpu0/h$a;", "messengerAccountStatus", "phoneUUID", "validationDate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lpu0/g;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Boolean;Lpu0/j;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lpu0/h$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f141239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f141240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f141241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f141242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f141243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f141244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f141245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f141246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f141247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f141248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f141249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f141250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f141251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f141252p;

    public /* synthetic */ h(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, j jVar, Boolean bool3, Boolean bool4, Boolean bool5, String str2, a aVar, String str3, String str4, String str5, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i15 & 1) != 0 ? null : l14, str, (i15 & 4) != 0 ? null : gVar, (i15 & 8) != 0 ? null : bool, (i15 & 16) != 0 ? null : num, (i15 & 32) != 0 ? -1 : i14, (i15 & 64) != 0 ? null : bool2, (i15 & 128) != 0 ? null : jVar, (i15 & 256) != 0 ? null : bool3, (i15 & 512) != 0 ? null : bool4, (i15 & 1024) != 0 ? null : bool5, (i15 & 2048) != 0 ? null : str2, (i15 & 4096) != 0 ? null : aVar, (i15 & 8192) != 0 ? null : str3, (i15 & 16384) != 0 ? null : str4, (i15 & 32768) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f141237a, hVar.f141237a) && s.g(this.f141238b, hVar.f141238b) && s.g(this.f141239c, hVar.f141239c) && s.g(this.f141240d, hVar.f141240d) && s.g(this.f141241e, hVar.f141241e) && this.f141242f == hVar.f141242f && s.g(this.f141243g, hVar.f141243g) && this.f141244h == hVar.f141244h && s.g(this.f141245i, hVar.f141245i) && s.g(this.f141246j, hVar.f141246j) && s.g(this.f141247k, hVar.f141247k) && s.g(this.f141248l, hVar.f141248l) && this.f141249m == hVar.f141249m && s.g(this.f141250n, hVar.f141250n) && s.g(this.f141251o, hVar.f141251o) && s.g(this.f141252p, hVar.f141252p);
    }

    public final int hashCode() {
        Long l14 = this.f141237a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141238b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f141239c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f141240d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f141241e;
        int iD = q2.d(this.f141242f, (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Boolean bool2 = this.f141243g;
        int iHashCode5 = (iD + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        j jVar = this.f141244h;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool3 = this.f141245i;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f141246j;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f141247k;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f141248l;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.f141249m;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f141250n;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141251o;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141252p;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        g gVar = this.f141239c;
        StringBuilder sbJ = b71.i.j("MessengerPhone(contactId=", ", content=", this.f141238b, this.f141237a, ", flag=");
        sbJ.append(gVar);
        sbJ.append(", isPrimary=");
        sbJ.append(this.f141240d);
        sbJ.append(", labelType=");
        sbJ.append(this.f141241e);
        sbJ.append(", localId=");
        sbJ.append(this.f141242f);
        sbJ.append(", emergencyContactMethod=");
        sbJ.append(this.f141243g);
        sbJ.append(", smsOptInLiveTrackStatus=");
        sbJ.append(this.f141244h);
        sbJ.append(", isValid=");
        b71.i.o(this.f141245i, this.f141246j, ", isEmsValue=", ", isSmsOptionAware=", sbJ);
        b71.i.s(sbJ, this.f141247k, ", confirmationStatus=", this.f141248l, ", messengerAccountStatus=");
        sbJ.append(this.f141249m);
        sbJ.append(", phoneUUID=");
        sbJ.append(this.f141250n);
        sbJ.append(", validationDate=");
        return e5.h(sbJ, this.f141251o, ", countryCode=", this.f141252p, ")");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pu0.h$a[], still in use, count: 1, list:
      (r0v1 pu0.h$a[]) from 0x0026: CONSTRUCTOR (r0v1 pu0.h$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpu0/h$a;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        AVAILABLE("AVAILABLE"),
        PENDING("PENDING"),
        NOT_AVAILABLE("NOT_AVAILABLE");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2652a f141253b = new C2652a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f141258g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f141259a;

        static {
            f141258g = new w13.c(new a[]{r0, r1, r2});
        }

        private a(String str) {
            super(str, i);
            this.f141259a = str;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f141257f.clone();
        }

        /* JADX INFO: renamed from: pu0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu0/h$a$a;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2652a {
            public /* synthetic */ C2652a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2652a() {
            }
        }
    }

    public h(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, j jVar, Boolean bool3, Boolean bool4, Boolean bool5, String str2, a aVar, String str3, String str4, String str5) {
        this.f141237a = l14;
        this.f141238b = str;
        this.f141239c = gVar;
        this.f141240d = bool;
        this.f141241e = num;
        this.f141242f = i14;
        this.f141243g = bool2;
        this.f141244h = jVar;
        this.f141245i = bool3;
        this.f141246j = bool4;
        this.f141247k = bool5;
        this.f141248l = str2;
        this.f141249m = aVar;
        this.f141250n = str3;
        this.f141251o = str4;
        this.f141252p = str5;
    }
}
