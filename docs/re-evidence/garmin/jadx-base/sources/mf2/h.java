package mf2;

import ch.qos.logback.core.joran.action.Action;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import vf2.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lmf2/h;", "", "Ljava/util/UUID;", "sessionId", "Lvf2/p;", "workoutData", "", "sportType", "subSportType", "<init>", "(Ljava/util/UUID;Lvf2/p;II)V", "a", JWKParameterNames.RSA_EXPONENT, "c", "d", "b", "f", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f118306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f118308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f118309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f118310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f118311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f118312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f118313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f118314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f118315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f118316k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf2/h$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        PAUSED("PAUSED"),
        DISCONNECTED("DISCONNECTED");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f118322a;

        b(String str) {
            this.f118322a = str;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mf2.h$d[], still in use, count: 1, list:
      (r0v1 mf2.h$d[]) from 0x006e: CONSTRUCTOR (r0v1 mf2.h$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf2/h$d;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        STEP("STEP"),
        WORKOUT("WORKOUT"),
        EXERCISE_INFO("EXERCISE_INFO"),
        SPEED_CHART("SPEED_CHART"),
        POWER_CHART("POWER_CHART"),
        PACE_CHART("PACE_CHART"),
        HR_CHART("HR_CHART"),
        GRADE_ADJUSTED_PACE_CHART("GRADE_ADJUSTED_PACE_CHART"),
        ELEVATION_CHART("ELEVATION_CHART"),
        BREATHWORK("BREATHWORK");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ w13.c f118336m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f118337a;

        static {
            f118336m = new w13.c(dVarArr);
        }

        private d(String str) {
            super(str, i);
            this.f118337a = str;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f118335l.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mf2.h$f[], still in use, count: 1, list:
      (r0v1 mf2.h$f[]) from 0x0077: CONSTRUCTOR (r0v1 mf2.h$f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf2/h$f;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f {
        LAP("LAP"),
        STOP("STOP"),
        RESUME("RESUME"),
        SKIP_WORKOUT_STEP("SKIP_WORKOUT_STEP"),
        START_WORKOUT_STEP_NOW("START_WORKOUT_STEP_NOW"),
        SKIP_WORKOUT_CLUSTER("SKIP_WORKOUT_CLUSTER"),
        DELETE_WORKOUT_CLUSTER("DELETE_WORKOUT_CLUSTER"),
        DELETE_WORKOUT_STEP("DELETE_WORKOUT_STEP"),
        ADD_SKIPPED_WORKOUT_CLUSTER("ADD_SKIPPED_WORKOUT_CLUSTER"),
        ADD_SKIPPED_WORKOUT_STEP("ADD_SKIPPED_WORKOUT_STEP"),
        /* JADX INFO: Fake field, exist only in values array */
        WORKOUT_EDIT("WORKOUT_EDIT");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ w13.c f118351m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f118352a;

        static {
            f118351m = new w13.c(fVarArr);
        }

        private f(String str) {
            super(str, i);
            this.f118352a = str;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f118350l.clone();
        }
    }

    public h(UUID uuid, p pVar, int i14, int i15) {
        uuid.getClass();
        this.f118306a = uuid;
        this.f118307b = System.currentTimeMillis();
        this.f118308c = pVar != null;
        this.f118311f = new ArrayList();
        this.f118312g = new ArrayList();
        this.f118313h = new ArrayList();
        this.f118314i = new ArrayList();
        this.f118315j = new ArrayList();
        this.f118316k = x.m(new o13.p(Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    public final int a() {
        int i14 = 0;
        ArrayList arrayList = this.f118314i;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if ((((c) it.next()) instanceof c.b) && (i14 = i14 + 1) < 0) {
                x.p();
                throw null;
            }
        }
        return i14;
    }

    public final int b() {
        int i14 = 0;
        ArrayList arrayList = this.f118313h;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if ((((c) it.next()) instanceof c.b) && (i14 = i14 + 1) < 0) {
                x.p();
                throw null;
            }
        }
        return i14;
    }

    public final void c(d dVar) {
        dVar.getClass();
        ArrayList arrayList = this.f118311f;
        e eVar = (e) h0.n0(arrayList);
        if ((eVar instanceof e.b) && ((e.b) eVar).f118339b == dVar) {
            return;
        }
        zg2.c.f204692a.getClass();
        zg2.c.d("Analytics", dVar + " is now visible");
        arrayList.add(new e.b(dVar));
    }

    public final void d(f fVar) {
        fVar.getClass();
        this.f118315j.add(fVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmf2/h$a;", "", "<init>", "()V", "b", "a", "Lmf2/h$a$a;", "Lmf2/h$a$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: mf2.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf2/h$a$a;", "Lmf2/h$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2246a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2246a f118317a = new C2246a();

            private C2246a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2246a);
            }

            public final int hashCode() {
                return 1088169295;
            }

            public final String toString() {
                return "AppIsHidden";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf2/h$a$b;", "Lmf2/h$a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f118318a = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1280083394;
            }

            public final String toString() {
                return "FeatureVisible";
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmf2/h$c;", "", "<init>", "()V", "b", "a", "Lmf2/h$c$a;", "Lmf2/h$c$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf2/h$c$a;", "Lmf2/h$c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f118323a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1953847638;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf2/h$c$b;", "Lmf2/h$c;", "Lmf2/h$b;", "overlay", "<init>", "(Lmf2/h$b;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f118324a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b bVar) {
                super(null);
                bVar.getClass();
                this.f118324a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f118324a == ((b) obj).f118324a;
            }

            public final int hashCode() {
                return this.f118324a.hashCode();
            }

            public final String toString() {
                return "Visible(overlay=" + this.f118324a + ")";
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lmf2/h$e;", "", "", "timestamp", "<init>", "(J)V", "b", "a", "Lmf2/h$e$a;", "Lmf2/h$e$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f118338a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmf2/h$e$a;", "Lmf2/h$e;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends e {
            public a() {
                super(0L, 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf2/h$e$b;", "Lmf2/h$e;", "Lmf2/h$d;", "page", "<init>", "(Lmf2/h$d;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f118339b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(0L, 1, null);
                dVar.getClass();
                this.f118339b = dVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f118339b == ((b) obj).f118339b;
            }

            public final int hashCode() {
                return this.f118339b.hashCode();
            }

            public final String toString() {
                return "PageVisible(page=" + this.f118339b + ")";
            }
        }

        public /* synthetic */ e(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? System.currentTimeMillis() : j8, null);
        }

        private e(long j8) {
            this.f118338a = j8;
        }

        public /* synthetic */ e(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }
}
