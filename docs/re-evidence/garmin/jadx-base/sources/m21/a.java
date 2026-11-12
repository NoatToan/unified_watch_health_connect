package m21;

import androidx.room.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lm21/a;", "", "<init>", "()V", "d", "a", JWKParameterNames.RSA_EXPONENT, "b", "f", "c", "Lm21/a$a;", "Lm21/a$b;", "Lm21/a$c;", "Lm21/a$d;", "Lm21/a$e;", "Lm21/a$f;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: m21.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm21/a$a;", "Lm21/a;", "", "foodId", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2204a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f116060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2204a(String str) {
            super(null);
            str.getClass();
            this.f116060a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2204a) && p005kotlin.jvm.internal.s.g(this.f116060a, ((C2204a) obj).f116060a);
        }

        public final int hashCode() {
            return this.f116060a.hashCode();
        }

        public final String toString() {
            return am.j.m("DeleteFood(foodId=", this.f116060a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm21/a$b;", "Lm21/a;", "", "customMealId", "<init>", "(J)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f116061a;

        public b(long j8) {
            super(null);
            this.f116061a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f116061a == ((b) obj).f116061a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f116061a);
        }

        public final String toString() {
            return a0.f(this.f116061a, "DeleteMeal(customMealId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm21/a$c;", "Lm21/a;", "", "foodId", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f116062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f116062a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f116062a, ((c) obj).f116062a);
        }

        public final int hashCode() {
            return this.f116062a.hashCode();
        }

        public final String toString() {
            return am.j.m("DeleteRecipe(foodId=", this.f116062a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm21/a$d;", "Lm21/a;", "", "foodId", "", "isFavorite", "<init>", "(Ljava/lang/String;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f116063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f116064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z14) {
            super(null);
            str.getClass();
            this.f116063a = str;
            this.f116064b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f116063a, dVar.f116063a) && this.f116064b == dVar.f116064b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116064b) + (this.f116063a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("UpdateFood(foodId=", this.f116063a, ", isFavorite=", this.f116064b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm21/a$e;", "Lm21/a;", "", "customMealId", "", "isFavorite", "<init>", "(JZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f116065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f116066b;

        public e(long j8, boolean z14) {
            super(null);
            this.f116065a = j8;
            this.f116066b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f116065a == eVar.f116065a && this.f116066b == eVar.f116066b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116066b) + (Long.hashCode(this.f116065a) * 31);
        }

        public final String toString() {
            return "UpdateMeal(customMealId=" + this.f116065a + ", isFavorite=" + this.f116066b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm21/a$f;", "Lm21/a;", "", "foodId", "", "isFavorite", "<init>", "(Ljava/lang/String;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f116067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f116068b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z14) {
            super(null);
            str.getClass();
            this.f116067a = str;
            this.f116068b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f116067a, fVar.f116067a) && this.f116068b == fVar.f116068b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116068b) + (this.f116067a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("UpdateRecipe(foodId=", this.f116067a, ", isFavorite=", this.f116068b, ")");
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }
}
