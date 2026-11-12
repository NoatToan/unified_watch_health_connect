package fe2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lfe2/v1;", "", "", "sessionId", "token", "url", "Lfe2/v1$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lfe2/v1$a;", "publisher", "Lorg/joda/time/DateTime;", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfe2/v1$b;Lfe2/v1$a;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "b", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f70968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f70969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f70970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f70971g;

    public /* synthetic */ v1(String str, String str2, String str3, b bVar, a aVar, DateTime dateTime, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, bVar, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : dateTime, (i14 & 64) != 0 ? null : dateTime2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return p005kotlin.jvm.internal.s.g(this.f70965a, v1Var.f70965a) && p005kotlin.jvm.internal.s.g(this.f70966b, v1Var.f70966b) && p005kotlin.jvm.internal.s.g(this.f70967c, v1Var.f70967c) && p005kotlin.jvm.internal.s.g(this.f70968d, v1Var.f70968d) && p005kotlin.jvm.internal.s.g(this.f70969e, v1Var.f70969e) && p005kotlin.jvm.internal.s.g(this.f70970f, v1Var.f70970f) && p005kotlin.jvm.internal.s.g(this.f70971g, v1Var.f70971g);
    }

    public final int hashCode() {
        String str = this.f70965a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70966b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70967c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.f70968d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f70969e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        DateTime dateTime = this.f70970f;
        int iHashCode6 = (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f70971g;
        return iHashCode6 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f70967c;
        b bVar = this.f70968d;
        StringBuilder sbI = p6.b.i("Session(sessionId=", this.f70965a, ", token=", this.f70966b, ", url=");
        sbI.append(str);
        sbI.append(", type=");
        sbI.append(bVar);
        sbI.append(", publisher=");
        sbI.append(this.f70969e);
        sbI.append(", start=");
        sbI.append(this.f70970f);
        sbI.append(", end=");
        sbI.append(this.f70971g);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfe2/v1$b;", "", "<init>", "()V", "a", "c", "f", "b", "d", JWKParameterNames.RSA_EXPONENT, "g", "Lfe2/v1$b$a;", "Lfe2/v1$b$b;", "Lfe2/v1$b$c;", "Lfe2/v1$b$d;", "Lfe2/v1$b$e;", "Lfe2/v1$b$f;", "Lfe2/v1$b$g;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$a;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f70975a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 481625743;
            }

            public final String toString() {
                return "Anonymous";
            }
        }

        /* JADX INFO: renamed from: fe2.v1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$b;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1451b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1451b f70976a = new C1451b();

            private C1451b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1451b);
            }

            public final int hashCode() {
                return 1815490812;
            }

            public final String toString() {
                return HttpHeaders.CONNECTION;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$c;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f70977a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -969589058;
            }

            public final String toString() {
                return "Email";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$d;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f70978a = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -732489936;
            }

            public final String toString() {
                return "LiveEvent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$e;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f70979a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1363147715;
            }

            public final String toString() {
                return "SmsSubscriber";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$f;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f70980a = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 415282201;
            }

            public final String toString() {
                return "Strava";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfe2/v1$b$g;", "Lfe2/v1$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f70981a = new g();

            private g() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 902985347;
            }

            public final String toString() {
                return "SubscriptionSubscriber";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfe2/v1$a;", "", "", "identifier", "typeKey", "nickname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70974c;

        public /* synthetic */ a(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f70972a, aVar.f70972a) && p005kotlin.jvm.internal.s.g(this.f70973b, aVar.f70973b) && p005kotlin.jvm.internal.s.g(this.f70974c, aVar.f70974c);
        }

        public final int hashCode() {
            String str = this.f70972a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f70973b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f70974c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return am.j.o(this.f70974c, ")", p6.b.i("Publisher(identifier=", this.f70972a, ", typeKey=", this.f70973b, ", nickname="));
        }

        public a(String str, String str2, String str3) {
            this.f70972a = str;
            this.f70973b = str2;
            this.f70974c = str3;
        }

        public a() {
            this(null, null, null, 7, null);
        }
    }

    public v1(String str, String str2, String str3, b bVar, a aVar, DateTime dateTime, DateTime dateTime2) {
        this.f70965a = str;
        this.f70966b = str2;
        this.f70967c = str3;
        this.f70968d = bVar;
        this.f70969e = aVar;
        this.f70970f = dateTime;
        this.f70971g = dateTime2;
    }
}
