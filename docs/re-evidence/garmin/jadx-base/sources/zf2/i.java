package zf2;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public interface i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzf2/i$a;", "Lzf2/i;", "", "timestamp", "workoutIndex", "<init>", "(II)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f204651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f204652b;

        public a(int i14, int i15) {
            this.f204651a = i14;
            this.f204652b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f204651a == aVar.f204651a && this.f204652b == aVar.f204652b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204652b) + (Integer.hashCode(this.f204651a) * 31);
        }

        public final String toString() {
            return j.g(this.f204651a, this.f204652b, "AdaptiveCoach(timestamp=", ", workoutIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/i$b;", "Lzf2/i;", "", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f204653a;

        public b(int i14) {
            this.f204653a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f204653a == ((b) obj).f204653a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204653a);
        }

        public final String toString() {
            return e0.f(this.f204653a, "RecordIndex(index=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/i$c;", "Lzf2/i;", "", TtmlNode.ATTR_ID, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f204654a;

        public c(int i14) {
            this.f204654a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f204654a == ((c) obj).f204654a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204654a);
        }

        public final String toString() {
            return e0.f(this.f204654a, "WorkoutId(id=", ")");
        }
    }
}
