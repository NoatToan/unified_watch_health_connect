package q01;

import com.nimbusds.jose.jwk.JWKParameterNames;
import g21.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;
import yz1.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lq01/f;", "", "Lyz1/u;", "status", "<init>", "(Lyz1/u;)V", "f", "d", JWKParameterNames.RSA_EXPONENT, "a", "g", "h", "b", "c", "Lq01/f$a;", "Lq01/f$b;", "Lq01/f$c;", "Lq01/f$d;", "Lq01/f$e;", "Lq01/f$f;", "Lq01/f$g;", "Lq01/f$h;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f142005a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq01/f$a;", "Lq01/f;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f142006b = new a();

        private a() {
            super(u.SUCCESS, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 449371262;
        }

        public final String toString() {
            return "ChildAccount";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq01/f$b;", "Lq01/f;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f142007b = new b();

        private b() {
            super(u.ERROR, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -301625445;
        }

        public final String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq01/f$c;", "Lq01/f;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f142008b = new c();

        private c() {
            super(u.LOADING, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -283605489;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq01/f$d;", "Lq01/f;", "Lg21/u;", "goals", "Lg21/f0;", "nutrition", "Li53/c;", "Lq01/c;", "foodLogHistory", "<init>", "(Lg21/u;Lg21/f0;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g21.u f142009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f142010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<q01.c> f142011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f142012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g21.u uVar, f0 f0Var, i53.c<q01.c> cVar) {
            super(u.SUCCESS, null);
            f0Var.getClass();
            this.f142009b = uVar;
            this.f142010c = f0Var;
            this.f142011d = cVar;
            this.f142012e = true;
        }

        @Override // q01.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF142017e() {
            return this.f142012e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f142009b, dVar.f142009b) && s.g(this.f142010c, dVar.f142010c) && s.g(this.f142011d, dVar.f142011d);
        }

        public final int hashCode() {
            g21.u uVar = this.f142009b;
            int iHashCode = (this.f142010c.hashCode() + ((uVar == null ? 0 : uVar.hashCode()) * 31)) * 31;
            i53.c<q01.c> cVar = this.f142011d;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MyFitnessPal(goals=");
            sb3.append(this.f142009b);
            sb3.append(", nutrition=");
            sb3.append(this.f142010c);
            sb3.append(", foodLogHistory=");
            return l2.e(sb3, this.f142011d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq01/f$e;", "Lq01/f;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f142013b = new e();

        private e() {
            super(u.SUCCESS, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -506946088;
        }

        public final String toString() {
            return "NoData";
        }
    }

    /* JADX INFO: renamed from: q01.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq01/f$f;", "Lq01/f;", "Lg21/u;", "goals", "Lg21/f0;", "nutrition", "Li53/c;", "Lq01/c;", "foodLogHistory", "", "allowLogging", "<init>", "(Lg21/u;Lg21/f0;Li53/c;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2664f extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g21.u f142014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f142015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<q01.c> f142016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f142017e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2664f(g21.u uVar, f0 f0Var, i53.c<q01.c> cVar, boolean z14) {
            super(u.SUCCESS, null);
            f0Var.getClass();
            this.f142014b = uVar;
            this.f142015c = f0Var;
            this.f142016d = cVar;
            this.f142017e = z14;
        }

        @Override // q01.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF142017e() {
            return this.f142017e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2664f)) {
                return false;
            }
            C2664f c2664f = (C2664f) obj;
            return s.g(this.f142014b, c2664f.f142014b) && s.g(this.f142015c, c2664f.f142015c) && s.g(this.f142016d, c2664f.f142016d) && this.f142017e == c2664f.f142017e;
        }

        public final int hashCode() {
            g21.u uVar = this.f142014b;
            int iHashCode = (this.f142015c.hashCode() + ((uVar == null ? 0 : uVar.hashCode()) * 31)) * 31;
            i53.c<q01.c> cVar = this.f142016d;
            return Boolean.hashCode(this.f142017e) + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Premium(goals=" + this.f142014b + ", nutrition=" + this.f142015c + ", foodLogHistory=" + this.f142016d + ", allowLogging=" + this.f142017e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq01/f$g;", "Lq01/f;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f142018b = new g();

        private g() {
            super(u.SUCCESS, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1561371320;
        }

        public final String toString() {
            return "SetUpNutrition";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq01/f$h;", "Lq01/f;", "", "freeTrialAvailable", "<init>", "(Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f142019b;

        public h(boolean z14) {
            super(u.SUCCESS, null);
            this.f142019b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f142019b == ((h) obj).f142019b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f142019b);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SignUpForGCPlus(freeTrialAvailable=", ")", this.f142019b);
        }
    }

    private f(u uVar) {
        this.f142005a = uVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean getF142017e() {
        return false;
    }

    public /* synthetic */ f(u uVar, p005kotlin.jvm.internal.j jVar) {
        this(uVar);
    }
}
