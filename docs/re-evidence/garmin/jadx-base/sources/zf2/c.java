package zf2;

import com.mapbox.turf.TurfConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lzf2/c;", "", "Lag2/c$a;", "itemType", "", "Lrf2/a;", "supportingMetrics", "<init>", "(Lag2/c$a;Ljava/util/List;)V", "a", "c", "d", "b", "Lzf2/c$a;", "Lzf2/c$b;", "Lzf2/c$c;", "Lzf2/c$d;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<rf2.a> f204575a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/c$a;", "Lzf2/c;", "", TurfConstants.UNIT_CENTIMETERS, "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f204576b;

        public a(int i14) {
            super(ag2.c.a.DISTANCE, x.k(rf2.a.DISTANCE, rf2.a.DISTANCE_LAP, rf2.a.DISTANCE_SET, rf2.a.DISTANCE_REMAINING), null);
            this.f204576b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f204576b == ((a) obj).f204576b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204576b);
        }

        public final String toString() {
            return e0.f(this.f204576b, "Distance(centimeters=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/c$b;", "Lzf2/c;", "", "count", "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f204577b;

        public b(int i14) {
            super(ag2.c.a.REPS, x.k(rf2.a.WORKOUT_SET_REPS, rf2.a.WORKOUT_REPS_TO_GO), null);
            this.f204577b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f204577b == ((b) obj).f204577b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204577b);
        }

        public final String toString() {
            return e0.f(this.f204577b, "Reps(count=", ")");
        }
    }

    /* JADX INFO: renamed from: zf2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/c$c;", "Lzf2/c;", "", "millimetersPerSecond", "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3813c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f204578b;

        public C3813c(int i14) {
            super(ag2.c.a.AVG_SPEED, x.k(rf2.a.SPEED, rf2.a.SPEED_AVG, rf2.a.PACE, rf2.a.PACE_LAP), null);
            this.f204578b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3813c) && this.f204578b == ((C3813c) obj).f204578b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204578b);
        }

        public final String toString() {
            return e0.f(this.f204578b, "Speed(millimetersPerSecond=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzf2/c$d;", "Lzf2/c;", "", "seconds", "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f204579b;

        public d(int i14) {
            super(ag2.c.a.TIMER, x.k(rf2.a.TIME, rf2.a.TIME_LAP, rf2.a.WORKOUT_INTERVAL_TIMER, rf2.a.WORKOUT_TIME_TO_GO, rf2.a.ESTIMATED_FINISH_TIME), null);
            this.f204579b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f204579b == ((d) obj).f204579b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204579b);
        }

        public final String toString() {
            return e0.f(this.f204579b, "Time(seconds=", ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(ag2.c.a aVar, List<? extends rf2.a> list) {
        this.f204575a = list;
    }

    public /* synthetic */ c(ag2.c.a aVar, List list, j jVar) {
        this(aVar, list);
    }
}
