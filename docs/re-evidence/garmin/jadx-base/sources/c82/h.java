package c82;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import v.e0;
import v62.e1;
import v62.o1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lc82/h;", "", "<init>", "()V", "d", "a", JWKParameterNames.RSA_EXPONENT, "g", "c", "b", "f", "Lc82/h$a;", "Lc82/h$b;", "Lc82/h$c;", "Lc82/h$d;", "Lc82/h$e;", "Lc82/h$f;", "Lc82/h$g;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc82/h$b;", "Lc82/h;", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Le23/p;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<m, Integer, Unit> f25731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super m, ? super Integer, Unit> pVar) {
            super(null);
            pVar.getClass();
            this.f25731a = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f25731a, ((b) obj).f25731a);
        }

        public final int hashCode() {
            return this.f25731a.hashCode();
        }

        public final String toString() {
            return "Custom(content=" + this.f25731a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc82/h$c;", "Lc82/h;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25732a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1377216678;
        }

        public final String toString() {
            return "Dot";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc82/h$d;", "Lc82/h;", "Lu4/d;", "icon", "<init>", "(Lu4/d;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f25733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u4.d dVar) {
            super(null);
            dVar.getClass();
            this.f25733a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f25733a, ((d) obj).f25733a);
        }

        public final int hashCode() {
            return this.f25733a.hashCode();
        }

        public final String toString() {
            return "Icon(icon=" + this.f25733a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc82/h$f;", "Lc82/h;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25735a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1308656798;
        }

        public final String toString() {
            return "NoAccessory";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc82/h$g;", "Lc82/h;", "", "value", "<init>", "(I)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25736a;

        public g(int i14) {
            super(null);
            this.f25736a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f25736a == ((g) obj).f25736a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25736a);
        }

        public final String toString() {
            return e0.f(this.f25736a, "Number(value=", ")");
        }
    }

    public /* synthetic */ h(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private h() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc82/h$a;", "Lc82/h;", "Lu4/d;", "icon", "<init>", "(Lu4/d;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f25730a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(u4.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                s62.a.f157643a.getClass();
                dVar = e1.a(t62.b.f162798a);
            }
            this(dVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f25730a, ((a) obj).f25730a);
        }

        public final int hashCode() {
            return this.f25730a.hashCode();
        }

        public final String toString() {
            return "Complete(icon=" + this.f25730a + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u4.d dVar) {
            super(null);
            dVar.getClass();
            this.f25730a = dVar;
        }

        public a() {
            this(null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc82/h$e;", "Lc82/h;", "Lu4/d;", "icon", "<init>", "(Lu4/d;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f25734a;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(u4.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                s62.a.f157643a.getClass();
                dVar = o1.a(t62.b.f162798a);
            }
            this(dVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.g(this.f25734a, ((e) obj).f25734a);
        }

        public final int hashCode() {
            return this.f25734a.hashCode();
        }

        public final String toString() {
            return "Incomplete(icon=" + this.f25734a + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u4.d dVar) {
            super(null);
            dVar.getClass();
            this.f25734a = dVar;
        }

        public e() {
            this(null, 1, null);
        }
    }
}
