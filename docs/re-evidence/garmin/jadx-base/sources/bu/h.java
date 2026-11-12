package bu;

import am.x0;
import lc.u0;
import ot.n;
import ot.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lbu/h;", "", "<init>", "()V", "b", "d", "c", "a", "Lbu/h$a;", "Lbu/h$b;", "Lbu/h$c;", "Lbu/h$d;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbu/h$a;", "Lbu/h;", "Lam/x0;", "activity", "<init>", "(Lam/x0;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f21182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var) {
            super(null);
            x0Var.getClass();
            this.f21182a = x0Var;
            this.f21183b = "activity_series/".concat(cu.a.a(x0Var));
        }

        @Override // bu.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF21187b() {
            return this.f21183b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f21182a == ((a) obj).f21182a;
        }

        public final int hashCode() {
            return this.f21182a.hashCode();
        }

        public final String toString() {
            return "ActivitySeries(activity=" + this.f21182a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbu/h$b;", "Lbu/h;", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21184a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f21185b = "bgm/bgm";

        private b() {
            super(null);
        }

        @Override // bu.h
        /* JADX INFO: renamed from: a */
        public final String getF21187b() {
            return f21185b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbu/h$c;", "Lbu/h;", "Lot/n;", "chapter", "<init>", "(Lot/n;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f21186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            String str;
            super(null);
            nVar.getClass();
            this.f21186a = nVar;
            switch (o.f133645a[nVar.ordinal()]) {
                case 1:
                    str = "steps";
                    break;
                case 2:
                    str = "pushes";
                    break;
                case 3:
                    str = "sleep_score";
                    break;
                case 4:
                    str = "sleep";
                    break;
                case 5:
                    str = "body_battery";
                    break;
                case 6:
                    str = "summary";
                    break;
                case 7:
                    str = "activity_time";
                    break;
                case 8:
                    str = "distance";
                    break;
                case 9:
                    str = "ascent";
                    break;
                case 10:
                    str = "calories";
                    break;
                case 11:
                    str = "achievements";
                    break;
                case 12:
                    str = "recap";
                    break;
                default:
                    u0.r();
                    throw null;
            }
            this.f21187b = "animations/".concat(str);
        }

        @Override // bu.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF21187b() {
            return this.f21187b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f21186a == ((c) obj).f21186a;
        }

        public final int hashCode() {
            return this.f21186a.hashCode();
        }

        public final String toString() {
            return "Chapter(chapter=" + this.f21186a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbu/h$d;", "Lbu/h;", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f21188a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f21189b = "animations/standard";

        private d() {
            super(null);
        }

        @Override // bu.h
        /* JADX INFO: renamed from: a */
        public final String getF21187b() {
            return f21189b;
        }
    }

    public /* synthetic */ h(j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF21187b();

    private h() {
    }
}
