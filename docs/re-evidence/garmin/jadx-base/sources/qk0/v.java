package qk0;

import am.x0;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface v {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqk0/v$a;", "Lqk0/v;", "Lam/x0;", "activityType", "<init>", "(Lam/x0;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f145158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f145159b;

        public a(x0 x0Var) {
            x0Var.getClass();
            this.f145158a = x0Var;
            this.f145159b = fb1.c.n("header_", x0Var.f4358a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f145158a == ((a) obj).f145158a;
        }

        @Override // qk0.v
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF145163d() {
            return this.f145159b;
        }

        public final int hashCode() {
            return this.f145158a.hashCode();
        }

        public final String toString() {
            return "HeaderItem(activityType=" + this.f145158a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqk0/v$b;", "Lqk0/v;", "Lam/x0;", "activityType", "", "isGroupingRow", "isSelected", "", Action.KEY_ATTRIBUTE, "<init>", "(Lam/x0;ZZLjava/lang/String;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f145160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f145161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f145162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f145163d;

        public b(x0 x0Var, boolean z14, boolean z15, String str) {
            x0Var.getClass();
            str.getClass();
            this.f145160a = x0Var;
            this.f145161b = z14;
            this.f145162c = z15;
            this.f145163d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f145160a == bVar.f145160a && this.f145161b == bVar.f145161b && this.f145162c == bVar.f145162c && this.f145163d.equals(bVar.f145163d);
        }

        @Override // qk0.v
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF145163d() {
            return this.f145163d;
        }

        public final int hashCode() {
            return this.f145163d.hashCode() + q6.f.g(q6.f.g(this.f145160a.hashCode() * 31, 31, this.f145161b), 31, this.f145162c);
        }

        public final String toString() {
            return "SelectableRowItem(activityType=" + this.f145160a + ", isGroupingRow=" + this.f145161b + ", isSelected=" + this.f145162c + ", key=" + this.f145163d + ")";
        }
    }

    /* JADX INFO: renamed from: getKey */
    String getF145163d();
}
