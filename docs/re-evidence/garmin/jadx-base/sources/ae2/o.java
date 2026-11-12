package ae2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lae2/o;", "", "", "name", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "a", "Lae2/o$a;", "Lae2/o$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2949b;

    public /* synthetic */ o(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, null);
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u000f\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lae2/o$b;", "Lae2/o;", "", "name", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "d", JWKParameterNames.RSA_EXPONENT, "h", "f", "g", "b", "a", "o", JWKParameterNames.RSA_MODULUS, "m", "l", JWKParameterNames.OCT_KEY_VALUE, "j", "p", "c", "Lae2/o$b$a;", "Lae2/o$b$b;", "Lae2/o$b$d;", "Lae2/o$b$e;", "Lae2/o$b$f;", "Lae2/o$b$g;", "Lae2/o$b$h;", "Lae2/o$b$i;", "Lae2/o$b$j;", "Lae2/o$b$k;", "Lae2/o$b$l;", "Lae2/o$b$m;", "Lae2/o$b$n;", "Lae2/o$b$o;", "Lae2/o$b$p;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f2953c = new c(null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$a;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f2954d = new a();

            /* JADX WARN: Multi-variable type inference failed */
            private a() {
                super("ANONYMOUS_SESSION", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 683750967;
            }

            public final String toString() {
                return "AnonymousSession";
            }
        }

        /* JADX INFO: renamed from: ae2.o$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$b;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0047b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0047b f2955d = new C0047b();

            /* JADX WARN: Multi-variable type inference failed */
            private C0047b() {
                super("ANONYMOUS_SESSION_URL", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0047b);
            }

            public final int hashCode() {
                return -1404741704;
            }

            public final String toString() {
                return "AnonymousSessionUrl";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$d;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final d f2956d = new d();

            /* JADX WARN: Multi-variable type inference failed */
            private d() {
                super("EMAIL", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -248231026;
            }

            public final String toString() {
                return "Email";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$e;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final e f2957d = new e();

            /* JADX WARN: Multi-variable type inference failed */
            private e() {
                super("EMAIL_SESSION", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 2095141672;
            }

            public final String toString() {
                return "EmailSession";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$f;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final f f2958d = new f();

            /* JADX WARN: Multi-variable type inference failed */
            private f() {
                super("GROUP_TRACK_CONNECTIONS", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 305986381;
            }

            public final String toString() {
                return "GrouptrackConnectionsError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$g;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final g f2959d = new g();

            private g() {
                super("GROUP_TRACK_CONNECTIONS", "NOT_FOUND", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1876974858;
            }

            public final String toString() {
                return "GrouptrackConnectionsNotFound";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$h;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final h f2960d = new h();

            /* JADX WARN: Multi-variable type inference failed */
            private h() {
                super("GROUP_TRACK", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1308333043;
            }

            public final String toString() {
                return "GrouptrackSharingOff";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$i;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final i f2961d = new i();

            /* JADX WARN: Multi-variable type inference failed */
            private i() {
                super("LIVE_TRACK_CONTACTS", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1999415426;
            }

            public final String toString() {
                return "NoContacts";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$j;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class j extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final j f2962d = new j();

            /* JADX WARN: Multi-variable type inference failed */
            private j() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -288138293;
            }

            public final String toString() {
                return "NoLivetrackGdprConsent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$k;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class k extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final k f2963d = new k();

            /* JADX WARN: Multi-variable type inference failed */
            private k() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1347735645;
            }

            public final String toString() {
                return "NoNetworkConnection";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$l;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class l extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final l f2964d = new l();

            /* JADX WARN: Multi-variable type inference failed */
            private l() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -1836269444;
            }

            public final String toString() {
                return "NoSessionsCreated";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$m;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class m extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final m f2965d = new m();

            /* JADX WARN: Multi-variable type inference failed */
            private m() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 411309582;
            }

            public final String toString() {
                return "NoSharingMethod";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$n;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class n extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final n f2966d = new n();

            /* JADX WARN: Multi-variable type inference failed */
            private n() {
                super("STRAVA_CONSENT", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -246692303;
            }

            public final String toString() {
                return "NoStravaGdprConsent";
            }
        }

        /* JADX INFO: renamed from: ae2.o$b$o, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$o;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0048o extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0048o f2967d = new C0048o();

            /* JADX WARN: Multi-variable type inference failed */
            private C0048o() {
                super("STRAVA", null, 2, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0048o);
            }

            public final int hashCode() {
                return 1302544713;
            }

            public final String toString() {
                return "Strava";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$b$p;", "Lae2/o$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class p extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final p f2968d = new p();

            /* JADX WARN: Multi-variable type inference failed */
            private p() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return -973637700;
            }

            public final String toString() {
                return "Unknown";
            }
        }

        public /* synthetic */ b(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, null);
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lae2/o$b$c;", "", "<init>", "()V", "", "EMAIL", "Ljava/lang/String;", "EMAIL_SESSION", "LIVE_TRACK_CONTACTS", "STRAVA", "STRAVA_CONSENT", "GROUP_TRACK", "GROUP_TRACK_CONNECTIONS", "ANONYMOUS_SESSION_URL", "ANONYMOUS_SESSION", "NOT_FOUND", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c {
            public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static b a(String str, String str2) {
                if ("EMAIL".equalsIgnoreCase(str)) {
                    return d.f2956d;
                }
                if ("EMAIL_SESSION".equalsIgnoreCase(str)) {
                    return e.f2957d;
                }
                if ("LIVE_TRACK_CONTACTS".equalsIgnoreCase(str)) {
                    return i.f2961d;
                }
                if ("STRAVA".equalsIgnoreCase(str)) {
                    return C0048o.f2967d;
                }
                if ("STRAVA_CONSENT".equalsIgnoreCase(str)) {
                    return n.f2966d;
                }
                if ("GROUP_TRACK".equalsIgnoreCase(str)) {
                    return h.f2960d;
                }
                if ("GROUP_TRACK_CONNECTIONS".equalsIgnoreCase(str) && "NOT_FOUND".equalsIgnoreCase(str2)) {
                    return g.f2959d;
                }
                if ("GROUP_TRACK_CONNECTIONS".equalsIgnoreCase(str)) {
                    return f.f2958d;
                }
                if ("ANONYMOUS_SESSION_URL".equalsIgnoreCase(str)) {
                    return C0047b.f2955d;
                }
                return "ANONYMOUS_SESSION".equalsIgnoreCase(str) ? a.f2954d : p.f2968d;
            }

            private c() {
            }
        }

        private b(String str, String str2) {
            super(str, str2, null);
        }

        public /* synthetic */ b(String str, String str2, p005kotlin.jvm.internal.j jVar) {
            this(str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lae2/o$a;", "Lae2/o;", "<init>", "()V", "a", "b", "c", "Lae2/o$a$a;", "Lae2/o$a$b;", "Lae2/o$a$c;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends o {

        /* JADX INFO: renamed from: ae2.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$a$a;", "Lae2/o$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0046a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0046a f2950c = new C0046a();

            private C0046a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0046a);
            }

            public final int hashCode() {
                return 240999003;
            }

            public final String toString() {
                return "InvalidUnitId";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$a$b;", "Lae2/o$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f2951c = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2063128849;
            }

            public final String toString() {
                return "NotConnected";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/o$a$c;", "Lae2/o$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f2952c = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1458199601;
            }

            public final String toString() {
                return "Unknown";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private o(String str, String str2) {
        this.f2948a = str;
        this.f2949b = str2;
    }

    public /* synthetic */ o(String str, String str2, p005kotlin.jvm.internal.j jVar) {
        this(str, str2);
    }
}
