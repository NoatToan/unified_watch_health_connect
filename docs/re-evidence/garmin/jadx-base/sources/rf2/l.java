package rf2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrf2/l;", "", "<init>", "()V", "b", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "Lrf2/l$a;", "Lrf2/l$b;", "Lrf2/l$c;", "Lrf2/l$d;", "Lrf2/l$e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/l$a;", "Lrf2/l;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f152496a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 542816512;
        }

        public final String toString() {
            return "HiitTimer";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf2/l$b;", "Lrf2/l;", "", "hasWarmupStart", "<init>", "(Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f152497a;

        public b(boolean z14) {
            super(null);
            this.f152497a = z14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF152497a() {
            return this.f152497a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f152497a == ((b) obj).f152497a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f152497a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("OpenRepeat(hasWarmupStart=", ")", this.f152497a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/l$c;", "Lrf2/l;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f152498a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -989405147;
        }

        public final String toString() {
            return "StructuredRepeat";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/l$d;", "Lrf2/l;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f152499a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -175906477;
        }

        public final String toString() {
            return "StructuredWorkout";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrf2/l$e;", "Lrf2/l;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f152500a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 737076371;
        }

        public final String toString() {
            return "TargetWorkout";
        }
    }

    public /* synthetic */ l(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private l() {
    }
}
