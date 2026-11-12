package mx1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lmx1/h;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "h", "d", "g", "c", "j", IntegerTokenConverter.CONVERTER_KEY, "b", "f", "a", "Lmx1/h$b;", "Lmx1/h$c;", "Lmx1/h$d;", "Lmx1/h$e;", "Lmx1/h$f;", "Lmx1/h$g;", "Lmx1/h$h;", "Lmx1/h$i;", "Lmx1/h$j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmx1/h$d;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "<init>", "(Lmx1/f;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mx1.f fVar) {
            super(null);
            fVar.getClass();
            this.f121417a = fVar;
            int i14 = 1;
            if (fVar.c()) {
                int i15 = fVar.f121398d;
                i14 = 1 + new C2300h(fVar, i15 == 0 ? 3 : i15).f121430c;
            }
            this.f121418b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f121417a, ((d) obj).f121417a);
        }

        public final int hashCode() {
            return this.f121417a.hashCode();
        }

        public final String toString() {
            return "ExperienceLevel(strengthTrainingPlanType=" + this.f121417a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmx1/h$e;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "<init>", "(Lmx1/f;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mx1.f fVar) {
            super(null);
            fVar.getClass();
            this.f121419a = fVar;
            this.f121420b = 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.g(this.f121419a, ((e) obj).f121419a);
        }

        public final int hashCode() {
            return this.f121419a.hashCode();
        }

        public final String toString() {
            return "RepSetIntensity(strengthTrainingPlanType=" + this.f121419a + ")";
        }
    }

    /* JADX INFO: renamed from: mx1.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmx1/h$h;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "dayNumber", "<init>", "(Lmx1/f;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2300h extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2300h(mx1.f fVar, int i14) {
            super(null);
            fVar.getClass();
            this.f121428a = fVar;
            this.f121429b = i14;
            this.f121430c = new e(fVar).f121420b + i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2300h)) {
                return false;
            }
            C2300h c2300h = (C2300h) obj;
            return s.g(this.f121428a, c2300h.f121428a) && this.f121429b == c2300h.f121429b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f121429b) + (this.f121428a.hashCode() * 31);
        }

        public final String toString() {
            return "SetPrimaryLifts(strengthTrainingPlanType=" + this.f121428a + ", dayNumber=" + this.f121429b + ")";
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ h(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx1/h$a;", "", "<init>", "()V", "", "DEFAULT_DAYS_PER_WEEK_ESTIMATION", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private h() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmx1/h$b;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "benchmarksAlreadySet", "isRestartPlanFlow", "<init>", "(Lmx1/f;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f121413c;

        public /* synthetic */ b(mx1.f fVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f121411a, bVar.f121411a) && this.f121412b == bVar.f121412b && this.f121413c == bVar.f121413c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121413c) + q6.f.g(this.f121411a.hashCode() * 31, 31, this.f121412b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ConfirmSchedule(strengthTrainingPlanType=");
            sb3.append(this.f121411a);
            sb3.append(", benchmarksAlreadySet=");
            sb3.append(this.f121412b);
            sb3.append(", isRestartPlanFlow=");
            return hb.a.k(sb3, this.f121413c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mx1.f fVar, boolean z14, boolean z15) {
            super(null);
            fVar.getClass();
            this.f121411a = fVar;
            this.f121412b = z14;
            this.f121413c = z15;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmx1/h$c;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "benchmarksAlreadySet", "<init>", "(Lmx1/f;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mx1.f fVar, boolean z14) {
            super(null);
            fVar.getClass();
            this.f121414a = fVar;
            this.f121415b = z14;
            this.f121416c = new g(fVar, z14).f121427c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f121414a, cVar.f121414a) && this.f121415b == cVar.f121415b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121415b) + (this.f121414a.hashCode() * 31);
        }

        public final String toString() {
            return "EquipmentPreference(strengthTrainingPlanType=" + this.f121414a + ", benchmarksAlreadySet=" + this.f121415b + ")";
        }

        public /* synthetic */ c(mx1.f fVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i14 & 2) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmx1/h$j;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "dayNumber", "", "benchmarksAlreadySet", "<init>", "(Lmx1/f;IZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f121438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(mx1.f fVar, int i14, boolean z14) {
            super(null);
            fVar.getClass();
            this.f121436a = fVar;
            this.f121437b = i14;
            this.f121438c = z14;
            this.f121439d = new c(fVar, z14).f121416c + i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return s.g(this.f121436a, jVar.f121436a) && this.f121437b == jVar.f121437b && this.f121438c == jVar.f121438c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121438c) + q2.d(this.f121437b, this.f121436a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("WorkoutSteps(strengthTrainingPlanType=");
            sb3.append(this.f121436a);
            sb3.append(", dayNumber=");
            sb3.append(this.f121437b);
            sb3.append(", benchmarksAlreadySet=");
            return hb.a.k(sb3, this.f121438c, ")");
        }

        public /* synthetic */ j(mx1.f fVar, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(fVar, i14, (i15 & 4) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmx1/h$g;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "benchmarksAlreadySet", "<init>", "(Lmx1/f;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121427c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mx1.f fVar, boolean z14) {
            super(null);
            fVar.getClass();
            this.f121425a = fVar;
            this.f121426b = z14;
            this.f121427c = z14 ? new d(fVar).f121418b : new d(fVar).f121418b + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return s.g(this.f121425a, gVar.f121425a) && this.f121426b == gVar.f121426b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121426b) + (this.f121425a.hashCode() * 31);
        }

        public final String toString() {
            return "SetBenchmarks(strengthTrainingPlanType=" + this.f121425a + ", benchmarksAlreadySet=" + this.f121426b + ")";
        }

        public /* synthetic */ g(mx1.f fVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i14 & 2) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmx1/h$i;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "isRestartPlanFlow", "benchmarksAlreadySet", "", "dayNumber", "<init>", "(Lmx1/f;ZZI)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f121433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f121435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mx1.f fVar, boolean z14, boolean z15, int i14) {
            super(null);
            fVar.getClass();
            this.f121431a = fVar;
            this.f121432b = z14;
            this.f121433c = z15;
            this.f121434d = i14;
            if (!fVar.d() && !z14) {
                int i15 = fVar.f121398d;
                i14 += new j(fVar, i15 == 0 ? 3 : i15, z15).f121439d;
            }
            this.f121435e = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return s.g(this.f121431a, iVar.f121431a) && this.f121432b == iVar.f121432b && this.f121433c == iVar.f121433c && this.f121434d == iVar.f121434d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f121434d) + q6.f.g(q6.f.g(this.f121431a.hashCode() * 31, 31, this.f121432b), 31, this.f121433c);
        }

        public final String toString() {
            return "SetTrainingDays(strengthTrainingPlanType=" + this.f121431a + ", isRestartPlanFlow=" + this.f121432b + ", benchmarksAlreadySet=" + this.f121433c + ", dayNumber=" + this.f121434d + ")";
        }

        public /* synthetic */ i(mx1.f fVar, boolean z14, boolean z15, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? false : z15, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmx1/h$f;", "Lmx1/h;", "Lmx1/f;", "strengthTrainingPlanType", "", "isRestartPlanFlow", "benchmarksAlreadySet", "<init>", "(Lmx1/f;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mx1.f f121421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f121423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121424d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mx1.f fVar, boolean z14, boolean z15) {
            super(null);
            fVar.getClass();
            this.f121421a = fVar;
            this.f121422b = z14;
            this.f121423c = z15;
            b bVar = new b(fVar, z15, z14);
            mx1.f fVar2 = bVar.f121411a;
            int i14 = fVar2.f121398d;
            this.f121424d = new i(fVar2, bVar.f121413c, bVar.f121412b, i14 == 0 ? 3 : i14).f121435e + 2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f121421a, fVar.f121421a) && this.f121422b == fVar.f121422b && this.f121423c == fVar.f121423c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121423c) + q6.f.g(this.f121421a.hashCode() * 31, 31, this.f121422b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ReviewTrainingPlan(strengthTrainingPlanType=");
            sb3.append(this.f121421a);
            sb3.append(", isRestartPlanFlow=");
            sb3.append(this.f121422b);
            sb3.append(", benchmarksAlreadySet=");
            return hb.a.k(sb3, this.f121423c, ")");
        }

        public /* synthetic */ f(mx1.f fVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
        }
    }
}
