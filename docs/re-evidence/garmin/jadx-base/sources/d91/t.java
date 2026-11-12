package d91;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Ld91/t;", "", "<init>", "()V", "g", "d", "f", "c", JWKParameterNames.RSA_EXPONENT, "b", "h", "a", "Ld91/t$b;", "Ld91/t$c;", "Ld91/t$d;", "Ld91/t$e;", "Ld91/t$f;", "Ld91/t$g;", "Ld91/t$h;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58590a = new a(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld91/t$c;", "Ld91/t;", "Ld91/s;", "insight", "<init>", "(Ld91/s;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f58593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar) {
            super(null);
            sVar.getClass();
            this.f58593b = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f58593b, ((c) obj).f58593b);
        }

        public final int hashCode() {
            return this.f58593b.hashCode();
        }

        public final String toString() {
            return "GenesisState(insight=" + this.f58593b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld91/t$d;", "Ld91/t;", "<init>", "()V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f58594b = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -280193412;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld91/t$f;", "Ld91/t;", "Ld91/s;", "insight", "<init>", "(Ld91/s;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f58596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar) {
            super(null);
            sVar.getClass();
            this.f58596b = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f58596b, ((f) obj).f58596b);
        }

        public final int hashCode() {
            return this.f58596b.hashCode();
        }

        public final String toString() {
            return "NoMessage(insight=" + this.f58596b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld91/t$g;", "Ld91/t;", "Ld91/s;", "insight", "<init>", "(Ld91/s;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f58597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s sVar) {
            super(null);
            sVar.getClass();
            this.f58597b = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p005kotlin.jvm.internal.s.g(this.f58597b, ((g) obj).f58597b);
        }

        public final int hashCode() {
            return this.f58597b.hashCode();
        }

        public final String toString() {
            return "Ready(insight=" + this.f58597b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld91/t$h;", "Ld91/t;", "", "newLanguage", "", "shownLanguagePrompts", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<String> f58599c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Set<String> set) {
            super(null);
            str.getClass();
            set.getClass();
            this.f58598b = str;
            this.f58599c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f58598b, hVar.f58598b) && p005kotlin.jvm.internal.s.g(this.f58599c, hVar.f58599c);
        }

        public final int hashCode() {
            return this.f58599c.hashCode() + (this.f58598b.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateLanguagePrompt(newLanguage=" + this.f58598b + ", shownLanguagePrompts=" + this.f58599c + ")";
        }
    }

    public /* synthetic */ t(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld91/t$a;", "", "<init>", "()V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: d91.t$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1250a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f58591a;

            static {
                int[] iArr = new int[d91.d.values().length];
                try {
                    iArr[d91.d.IN_PROGRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d91.d.READY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d91.d.NO_MESSAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d91.d.FIRST_CONSENT_NO_DATA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d91.d.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[d91.d.FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f58591a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static t a(d91.c cVar) {
            n currentStatus;
            s sVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            d91.d status = (cVar == null || (currentStatus = cVar.getCurrentStatus()) == null) ? null : currentStatus.getStatus();
            int i14 = 1;
            switch (status == null ? -1 : C1250a.f58591a[status.ordinal()]) {
                case -1:
                    return new b(objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0);
                case 0:
                default:
                    u0.r();
                    return null;
                case 1:
                    s.f58578l.getClass();
                    s sVarA = s.a.a(cVar);
                    return sVarA != null ? new e(sVarA) : new e(objArr4 == true ? 1 : 0, i14, objArr3 == true ? 1 : 0);
                case 2:
                    s.f58578l.getClass();
                    s sVarA2 = s.a.a(cVar);
                    return sVarA2 != null ? new g(sVarA2) : new b(objArr6 == true ? 1 : 0, i14, objArr5 == true ? 1 : 0);
                case 3:
                    s.f58578l.getClass();
                    s sVarA3 = s.a.a(cVar);
                    return sVarA3 != null ? new f(sVarA3) : new b(objArr8 == true ? 1 : 0, i14, objArr7 == true ? 1 : 0);
                case 4:
                    s.f58578l.getClass();
                    s sVarA4 = s.a.a(cVar);
                    return sVarA4 != null ? new c(sVarA4) : new b(objArr10 == true ? 1 : 0, i14, objArr9 == true ? 1 : 0);
                case 5:
                case 6:
                    s.f58578l.getClass();
                    s sVarA5 = s.a.a(cVar);
                    return sVarA5 != null ? new b(sVarA5) : new b(sVar, i14, objArr11 == true ? 1 : 0);
            }
        }

        private a() {
        }
    }

    private t() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld91/t$b;", "Ld91/t;", "Ld91/s;", "insight", "<init>", "(Ld91/s;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f58592b;

        public /* synthetic */ b(s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : sVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f58592b, ((b) obj).f58592b);
        }

        public final int hashCode() {
            s sVar = this.f58592b;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        public final String toString() {
            return "Error(insight=" + this.f58592b + ")";
        }

        public b(s sVar) {
            super(null);
            this.f58592b = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld91/t$e;", "Ld91/t;", "Ld91/s;", "insight", "<init>", "(Ld91/s;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f58595b;

        public /* synthetic */ e(s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : sVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.f58595b, ((e) obj).f58595b);
        }

        public final int hashCode() {
            s sVar = this.f58595b;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        public final String toString() {
            return "Loading(insight=" + this.f58595b + ")";
        }

        public e(s sVar) {
            super(null);
            this.f58595b = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
