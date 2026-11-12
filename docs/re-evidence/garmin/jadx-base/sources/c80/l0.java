package c80;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lc80/l0;", "", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "", "isDismissible", "<init>", "(Lc80/s0;Z)V", "c", JWKParameterNames.RSA_EXPONENT, "d", "b", "a", "Lc80/l0$b;", "Lc80/l0$c;", "Lc80/l0$d;", "Lc80/l0$e;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25408c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f25409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25410b;

    private l0(s0 s0Var, boolean z14) {
        this.f25409a = s0Var;
        this.f25410b = z14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc80/l0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c80.l0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0378a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25411a;

            static {
                int[] iArr = new int[p0.values().length];
                try {
                    iArr[p0.BANNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p0.CARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p0.WHATS_NEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[p0.CROSS_SELL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f25411a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l0(s0 s0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(s0Var, z14);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc80/l0$b;", "Lc80/l0;", "", "imageUrl", "overlineText", "titleText", "bodyText", "linkText", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "", "isDismissible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/s0;Z)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends l0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f25413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f25415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f25416h;

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, s0 s0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, s0Var, z14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5, s0 s0Var, boolean z14) {
            super(s0Var, z14, null);
            s0Var.getClass();
            this.f25412d = str;
            this.f25413e = str2;
            this.f25414f = str3;
            this.f25415g = str4;
            this.f25416h = str5;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc80/l0$d;", "Lc80/l0;", "", "remoteIconUrl", "remoteIconPrerenderedUrl", "titleText", "bodyText", "linkText", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "", "isDismissible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/s0;Z)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends l0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f25423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f25425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f25426h;

        public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, s0 s0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, str4, (i14 & 16) != 0 ? null : str5, s0Var, z14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, String str5, s0 s0Var, boolean z14) {
            super(s0Var, z14, null);
            str4.getClass();
            s0Var.getClass();
            this.f25422d = str;
            this.f25423e = str2;
            this.f25424f = str3;
            this.f25425g = str4;
            this.f25426h = str5;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc80/l0$c;", "Lc80/l0;", "Lo13/p;", "Lt4/d;", "", "image", "", "imageGradientBakedIn", "titleText", "bodyText", "buttonText", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "isDismissible", "<init>", "(Lo13/p;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/s0;Z)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends l0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o13.p<t4.d, String> f25417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f25418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f25420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f25421h;

        public /* synthetic */ c(o13.p pVar, boolean z14, String str, String str2, String str3, s0 s0Var, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(pVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, s0Var, z15);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(o13.p<? extends t4.d, String> pVar, boolean z14, String str, String str2, String str3, s0 s0Var, boolean z15) {
            super(s0Var, z15, null);
            pVar.getClass();
            s0Var.getClass();
            this.f25417d = pVar;
            this.f25418e = z14;
            this.f25419f = str;
            this.f25420g = str2;
            this.f25421h = str3;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lc80/l0$e;", "Lc80/l0;", "Lc80/l0$e$a;", "image", "", "imageGradientBakedIn", "Lo13/p;", "Lt4/d;", "", "icon", "Lo4/d0;", "iconTint", "bodyText", "linkText", "Lc80/s0;", FirebaseAnalytics.Param.LOCATION, "isDismissible", "<init>", "(Lc80/l0$e$a;ZLo13/p;Lo4/d0;Ljava/lang/String;Ljava/lang/String;Lc80/s0;ZLkotlin/jvm/internal/j;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends l0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f25427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f25428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o13.p<t4.d, String> f25429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o4.d0 f25430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f25431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f25432i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc80/l0$e$a;", "", "Lt4/d;", "painter", "Lc80/i0;", "backgroundStyle", "", "contentDescription", "<init>", "(Lt4/d;Lc80/i0;Ljava/lang/String;)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t4.d f25433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final i0 f25434b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f25435c;

            public a(t4.d dVar, i0 i0Var, String str) {
                dVar.getClass();
                i0Var.getClass();
                str.getClass();
                this.f25433a = dVar;
                this.f25434b = i0Var;
                this.f25435c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f25433a.equals(aVar.f25433a) && this.f25434b == aVar.f25434b && this.f25435c.equals(aVar.f25435c);
            }

            public final int hashCode() {
                return this.f25435c.hashCode() + ((this.f25434b.hashCode() + (this.f25433a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("Image(painter=");
                sb3.append(this.f25433a);
                sb3.append(", backgroundStyle=");
                sb3.append(this.f25434b);
                sb3.append(", contentDescription=");
                return am.j.o(this.f25435c, ")", sb3);
            }
        }

        public /* synthetic */ e(a aVar, boolean z14, o13.p pVar, o4.d0 d0Var, String str, String str2, s0 s0Var, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, (i14 & 2) != 0 ? false : z14, pVar, (i14 & 8) != 0 ? null : d0Var, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, s0Var, z15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private e(a aVar, boolean z14, o13.p<? extends t4.d, String> pVar, o4.d0 d0Var, String str, String str2, s0 s0Var, boolean z15) {
            super(s0Var, z15, null);
            s0Var.getClass();
            this.f25427d = aVar;
            this.f25428e = z14;
            this.f25429f = pVar;
            this.f25430g = d0Var;
            this.f25431h = str;
            this.f25432i = str2;
        }

        public /* synthetic */ e(a aVar, boolean z14, o13.p pVar, o4.d0 d0Var, String str, String str2, s0 s0Var, boolean z15, p005kotlin.jvm.internal.j jVar) {
            this(aVar, z14, pVar, d0Var, str, str2, s0Var, z15);
        }
    }
}
