package i21;

import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Li21/b;", "", "Lb11/u;", "message", "<init>", "(Lb11/u;)V", "a", JWKParameterNames.RSA_EXPONENT, "b", "d", "f", "c", "Li21/b$a;", "Li21/b$b;", "Li21/b$c;", "Li21/b$d;", "Li21/b$e;", "Li21/b$f;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.u f87239a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li21/b$a;", "Li21/b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f87240b = new a();

        private a() {
            super(new b11.u.a(c22.i.b(R.string.generic_error_message), null, 2, null), null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -948946753;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: i21.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li21/b$b;", "Li21/b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1730b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1730b f87241b = new C1730b();

        private C1730b() {
            super(new b11.u.a(c22.i.b(R.string.lbl_food_copied), null, 2, null), null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1730b);
        }

        public final int hashCode() {
            return -1544461205;
        }

        public final String toString() {
            return "FoodCopied";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li21/b$c;", "Li21/b;", "Lb11/u;", "formatArg", "<init>", "(Lb11/u;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b11.u f87242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b11.u uVar) {
            super(new b11.u.a(c22.i.b(R.string.food_logged_to_meal), p13.w.c(uVar)), null);
            uVar.getClass();
            this.f87242b = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f87242b, ((c) obj).f87242b);
        }

        public final int hashCode() {
            return this.f87242b.hashCode();
        }

        public final String toString() {
            return "FoodLogged(formatArg=" + this.f87242b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li21/b$d;", "Li21/b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f87243b = new d();

        private d() {
            super(new b11.u.a(c22.i.b(R.string.food_moved), null, 2, null), null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1483440172;
        }

        public final String toString() {
            return "FoodMoved";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li21/b$e;", "Li21/b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f87244b = new e();

        private e() {
            super(new b11.u.a(c22.i.b(R.string.food_removed), null, 2, null), null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -494870631;
        }

        public final String toString() {
            return "FoodRemoved";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li21/b$f;", "Li21/b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f87245b = new f();

        private f() {
            super(new b11.u.a(c22.i.b(R.string.msg_nutrition_goal_updated), null, 2, null), null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1269018527;
        }

        public final String toString() {
            return "GoalUpdated";
        }
    }

    private b(b11.u uVar) {
        this.f87239a = uVar;
    }

    public /* synthetic */ b(b11.u uVar, p005kotlin.jvm.internal.j jVar) {
        this(uVar);
    }
}
