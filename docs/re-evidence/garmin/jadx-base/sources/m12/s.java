package m12;

import android.content.Context;
import com.google.firebase.perf.util.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lm12/s;", "", "Lm12/t;", "itemType", "<init>", "(Lm12/t;)V", "b", "c", JWKParameterNames.RSA_EXPONENT, "a", "d", "Lm12/s$a;", "Lm12/s$b;", "Lm12/s$c;", "Lm12/s$d;", "Lm12/s$e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class s {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm12/s$a;", "Lm12/s;", "Lm12/t;", "itemType", "<init>", "(Lm12/t;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f115859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t tVar) {
            super(null, 1, 0 == true ? 1 : 0);
            tVar.getClass();
            this.f115859a = tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f115859a == ((a) obj).f115859a;
        }

        public final int hashCode() {
            return this.f115859a.hashCode();
        }

        public final String toString() {
            return "Header(itemType=" + this.f115859a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm12/s$b;", "Lm12/s;", "Lm12/t;", "itemType", "", "value", "<init>", "(Lm12/t;Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f115860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f115861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, String str) {
            super(tVar, null);
            tVar.getClass();
            str.getClass();
            this.f115860a = tVar;
            this.f115861b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f115860a == bVar.f115860a && p005kotlin.jvm.internal.s.g(this.f115861b, bVar.f115861b);
        }

        public final int hashCode() {
            return this.f115861b.hashCode() + (this.f115860a.hashCode() * 31);
        }

        public final String toString() {
            return "Input(itemType=" + this.f115860a + ", value=" + this.f115861b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm12/s$d;", "Lm12/s;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f115864a = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ s(t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : tVar, null);
    }

    public final String a(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        if (this instanceof b) {
            return ((b) this).f115860a.b(aVar);
        }
        if (this instanceof c) {
            return ((c) this).f115862a.b(aVar);
        }
        if (this instanceof e) {
            return ((e) this).f115865a.b(aVar);
        }
        if (this instanceof a) {
            return ((a) this).f115859a.b(aVar);
        }
        if (this instanceof d) {
            return "";
        }
        u0.r();
        return null;
    }

    public final String b(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        if (this instanceof b) {
            return ((b) this).f115860a.a(aVar);
        }
        if (this instanceof c) {
            return ((c) this).f115862a.a(aVar);
        }
        if (this instanceof e) {
            return ((e) this).f115865a.a(aVar);
        }
        if (this instanceof a) {
            return ((a) this).f115859a.a(aVar);
        }
        if (this instanceof d) {
            return "";
        }
        u0.r();
        return null;
    }

    private s(t tVar) {
    }

    public /* synthetic */ s(t tVar, p005kotlin.jvm.internal.j jVar) {
        this(tVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm12/s$c;", "Lm12/s;", "Lm12/t;", "itemType", "", "metaResId", "<init>", "(Lm12/t;Ljava/lang/Integer;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f115862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f115863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t tVar, Integer num) {
            super(null, 1, 0 == true ? 1 : 0);
            tVar.getClass();
            this.f115862a = tVar;
            this.f115863b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f115862a == cVar.f115862a && p005kotlin.jvm.internal.s.g(this.f115863b, cVar.f115863b);
        }

        public final int hashCode() {
            int iHashCode = this.f115862a.hashCode() * 31;
            Integer num = this.f115863b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "ListRow(itemType=" + this.f115862a + ", metaResId=" + this.f115863b + ")";
        }

        public /* synthetic */ c(t tVar, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this(tVar, (i14 & 2) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm12/s$e;", "Lm12/s;", "Lm12/t;", "itemType", "", "metaResId", "", Constants.ENABLE_DISABLE, "<init>", "(Lm12/t;Ljava/lang/Integer;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f115865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f115866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f115867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(t tVar, Integer num, boolean z14) {
            super(null, 1, 0 == true ? 1 : 0);
            tVar.getClass();
            this.f115865a = tVar;
            this.f115866b = num;
            this.f115867c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f115865a == eVar.f115865a && p005kotlin.jvm.internal.s.g(this.f115866b, eVar.f115866b) && this.f115867c == eVar.f115867c;
        }

        public final int hashCode() {
            int iHashCode = this.f115865a.hashCode() * 31;
            Integer num = this.f115866b;
            return Boolean.hashCode(this.f115867c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Switch(itemType=");
            sb3.append(this.f115865a);
            sb3.append(", metaResId=");
            sb3.append(this.f115866b);
            sb3.append(", isEnabled=");
            return hb.a.k(sb3, this.f115867c, ")");
        }

        public /* synthetic */ e(t tVar, Integer num, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(tVar, (i14 & 2) != 0 ? null : num, z14);
        }
    }
}
