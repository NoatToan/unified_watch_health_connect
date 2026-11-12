package nr;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lnr/e;", "", "<init>", "()V", "b", "g", "h", JWKParameterNames.RSA_EXPONENT, "c", "a", "f", "d", "Lnr/e$a;", "Lnr/e$b;", "Lnr/e$c;", "Lnr/e$d;", "Lnr/e$e;", "Lnr/e$f;", "Lnr/e$g;", "Lnr/e$h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/e$c;", "Lnr/e;", "Lnr/z;", "data", "", "bulletColorRes", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Lnr/z;Ljava/lang/Integer;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f127013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f127014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, Integer num, e23.a<Unit> aVar) {
            super(null);
            zVar.getClass();
            aVar.getClass();
            this.f127012a = zVar;
            this.f127013b = num;
            this.f127014c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f127012a, cVar.f127012a) && p005kotlin.jvm.internal.s.g(this.f127013b, cVar.f127013b) && p005kotlin.jvm.internal.s.g(this.f127014c, cVar.f127014c);
        }

        public final int hashCode() {
            int iHashCode = this.f127012a.hashCode() * 31;
            Integer num = this.f127013b;
            return this.f127014c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ExecutionScore(data=");
            sb3.append(this.f127012a);
            sb3.append(", bulletColorRes=");
            sb3.append(this.f127013b);
            sb3.append(", onItemSelected=");
            return n23.j.i(sb3, this.f127014c, ")");
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/e$a;", "Lnr/e;", "Lnr/z;", "data", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Lnr/z;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f127008b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, e23.a<Unit> aVar) {
            super(null);
            zVar.getClass();
            this.f127007a = zVar;
            this.f127008b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f127007a, aVar.f127007a) && p005kotlin.jvm.internal.s.g(this.f127008b, aVar.f127008b);
        }

        public final int hashCode() {
            int iHashCode = this.f127007a.hashCode() * 31;
            e23.a<Unit> aVar = this.f127008b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "AddRating(data=" + this.f127007a + ", onItemSelected=" + this.f127008b + ")";
        }

        public /* synthetic */ a(z zVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, (i14 & 2) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: nr.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/e$e;", "Lnr/e;", "Lnr/z;", "data", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Lnr/z;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2445e extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f127021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2445e(z zVar, e23.a<Unit> aVar) {
            super(null);
            zVar.getClass();
            this.f127020a = zVar;
            this.f127021b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2445e)) {
                return false;
            }
            C2445e c2445e = (C2445e) obj;
            return p005kotlin.jvm.internal.s.g(this.f127020a, c2445e.f127020a) && p005kotlin.jvm.internal.s.g(this.f127021b, c2445e.f127021b);
        }

        public final int hashCode() {
            int iHashCode = this.f127020a.hashCode() * 31;
            e23.a<Unit> aVar = this.f127021b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "PrimaryBenefit(data=" + this.f127020a + ", onItemSelected=" + this.f127021b + ")";
        }

        public /* synthetic */ C2445e(z zVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, (i14 & 2) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr/e$f;", "Lnr/e;", "Lnr/z;", "data", "Lu4/d;", "icon", "<init>", "(Lnr/z;Lu4/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u4.d f127023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z zVar, u4.d dVar) {
            super(null);
            zVar.getClass();
            this.f127022a = zVar;
            this.f127023b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f127022a, fVar.f127022a) && p005kotlin.jvm.internal.s.g(this.f127023b, fVar.f127023b);
        }

        public final int hashCode() {
            int iHashCode = this.f127022a.hashCode() * 31;
            u4.d dVar = this.f127023b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "Rating(data=" + this.f127022a + ", icon=" + this.f127023b + ")";
        }

        public /* synthetic */ f(z zVar, u4.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, (i14 & 2) != 0 ? null : dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/e$h;", "Lnr/e;", "Lnr/z;", "data", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Lnr/z;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f127031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(z zVar, e23.a<Unit> aVar) {
            super(null);
            zVar.getClass();
            this.f127030a = zVar;
            this.f127031b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f127030a, hVar.f127030a) && p005kotlin.jvm.internal.s.g(this.f127031b, hVar.f127031b);
        }

        public final int hashCode() {
            int iHashCode = this.f127030a.hashCode() * 31;
            e23.a<Unit> aVar = this.f127031b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "WorkoutBenefit(data=" + this.f127030a + ", onItemSelected=" + this.f127031b + ")";
        }

        public /* synthetic */ h(z zVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, (i14 & 2) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \b\u0002\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/e$b;", "Lnr/e;", "Lnr/z;", "data", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyType", "Lkotlin/Function2;", "", "", "updateSelfEvaluation", "<init>", "(Lnr/z;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Le23/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PrivacyType f127010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.p<Integer, Integer, Unit> f127011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(z zVar, PrivacyType privacyType, e23.p<? super Integer, ? super Integer, Unit> pVar) {
            super(null);
            zVar.getClass();
            privacyType.getClass();
            this.f127009a = zVar;
            this.f127010b = privacyType;
            this.f127011c = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f127009a, bVar.f127009a) && this.f127010b == bVar.f127010b && p005kotlin.jvm.internal.s.g(this.f127011c, bVar.f127011c);
        }

        public final int hashCode() {
            int iHashCode = (this.f127010b.hashCode() + (this.f127009a.hashCode() * 31)) * 31;
            e23.p<Integer, Integer, Unit> pVar = this.f127011c;
            return iHashCode + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            return "AddSelfEvaluation(data=" + this.f127009a + ", privacyType=" + this.f127010b + ", updateSelfEvaluation=" + this.f127011c + ")";
        }

        public /* synthetic */ b(z zVar, PrivacyType privacyType, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, privacyType, (i14 & 4) != 0 ? null : pVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012 \b\u0002\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/e$g;", "Lnr/e;", "Lnr/z;", "firstRow", "secondRow", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyType", "", "workoutFeel", "workoutRPE", "Lkotlin/Function2;", "", "updateSelfEvaluation", "<init>", "(Lnr/z;Lnr/z;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Ljava/lang/Integer;Ljava/lang/Integer;Le23/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f127024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z f127025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PrivacyType f127026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f127027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f127028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.p<Integer, Integer, Unit> f127029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(z zVar, z zVar2, PrivacyType privacyType, Integer num, Integer num2, e23.p<? super Integer, ? super Integer, Unit> pVar) {
            super(null);
            zVar.getClass();
            zVar2.getClass();
            privacyType.getClass();
            this.f127024a = zVar;
            this.f127025b = zVar2;
            this.f127026c = privacyType;
            this.f127027d = num;
            this.f127028e = num2;
            this.f127029f = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p005kotlin.jvm.internal.s.g(this.f127024a, gVar.f127024a) && p005kotlin.jvm.internal.s.g(this.f127025b, gVar.f127025b) && this.f127026c == gVar.f127026c && p005kotlin.jvm.internal.s.g(this.f127027d, gVar.f127027d) && p005kotlin.jvm.internal.s.g(this.f127028e, gVar.f127028e) && p005kotlin.jvm.internal.s.g(this.f127029f, gVar.f127029f);
        }

        public final int hashCode() {
            int iHashCode = (this.f127026c.hashCode() + ((this.f127025b.hashCode() + (this.f127024a.hashCode() * 31)) * 31)) * 31;
            Integer num = this.f127027d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f127028e;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            e23.p<Integer, Integer, Unit> pVar = this.f127029f;
            return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
        }

        public final String toString() {
            return "SelfEvaluation(firstRow=" + this.f127024a + ", secondRow=" + this.f127025b + ", privacyType=" + this.f127026c + ", workoutFeel=" + this.f127027d + ", workoutRPE=" + this.f127028e + ", updateSelfEvaluation=" + this.f127029f + ")";
        }

        public /* synthetic */ g(z zVar, z zVar2, PrivacyType privacyType, Integer num, Integer num2, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(zVar, zVar2, privacyType, num, num2, (i14 & 32) != 0 ? null : pVar);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/e$d;", "Lnr/e;", "", "title", "Lr22/p;", "dataBrick1", "dataBrick2", "dataBrick3", "Lkotlin/Function0;", "", "onLinkClick", "<init>", "(Ljava/lang/String;Lr22/p;Lr22/p;Lr22/p;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f127015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r22.p f127016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r22.p f127017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r22.p f127018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f127019e;

        public /* synthetic */ d(String str, r22.p pVar, r22.p pVar2, r22.p pVar3, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : pVar, (i14 & 4) != 0 ? null : pVar2, (i14 & 8) != 0 ? null : pVar3, (i14 & 16) != 0 ? null : aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f127015a, dVar.f127015a) && p005kotlin.jvm.internal.s.g(this.f127016b, dVar.f127016b) && p005kotlin.jvm.internal.s.g(this.f127017c, dVar.f127017c) && p005kotlin.jvm.internal.s.g(this.f127018d, dVar.f127018d) && p005kotlin.jvm.internal.s.g(this.f127019e, dVar.f127019e);
        }

        public final int hashCode() {
            String str = this.f127015a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            r22.p pVar = this.f127016b;
            int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
            r22.p pVar2 = this.f127017c;
            int iHashCode3 = (iHashCode2 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
            r22.p pVar3 = this.f127018d;
            int iHashCode4 = (iHashCode3 + (pVar3 == null ? 0 : pVar3.hashCode())) * 31;
            e23.a<Unit> aVar = this.f127019e;
            return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("LinkedEvent(title=");
            sb3.append(this.f127015a);
            sb3.append(", dataBrick1=");
            sb3.append(this.f127016b);
            sb3.append(", dataBrick2=");
            sb3.append(this.f127017c);
            sb3.append(", dataBrick3=");
            sb3.append(this.f127018d);
            sb3.append(", onLinkClick=");
            return n23.j.i(sb3, this.f127019e, ")");
        }

        public d(String str, r22.p pVar, r22.p pVar2, r22.p pVar3, e23.a<Unit> aVar) {
            super(null);
            this.f127015a = str;
            this.f127016b = pVar;
            this.f127017c = pVar2;
            this.f127018d = pVar3;
            this.f127019e = aVar;
        }

        public d() {
            this(null, null, null, null, null, 31, null);
        }
    }
}
