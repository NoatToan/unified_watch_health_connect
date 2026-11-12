package pg2;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lpg2/a;", "", "", "labelResId", "segmentIndex", "<init>", "(II)V", "d", "c", "a", "b", "Lpg2/a$a;", "Lpg2/a$c;", "Lpg2/a$d;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f137610c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f137611d = d.f137616e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f137612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137613b;

    /* JADX INFO: renamed from: pg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg2/a$a;", "Lpg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2605a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C2605a f137614e = new C2605a();

        private C2605a() {
            super(R.string.common_all, 2, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2605a);
        }

        public final int hashCode() {
            return -10473777;
        }

        public final String toString() {
            return "All";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg2/a$c;", "Lpg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f137615e = new c();

        private c() {
            super(R.string.common_minute_small_abbreviation, 1, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1131927803;
        }

        public final String toString() {
            return "FiveMinutes";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg2/a$d;", "Lpg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f137616e = new d();

        private d() {
            super(R.string.common_minute_small_abbreviation, 0, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 516224712;
        }

        public final String toString() {
            return "OneMinute";
        }
    }

    private a(int i14, int i15) {
        this.f137612a = i14;
        this.f137613b = i15;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpg2/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static a a(int i14) {
            d dVar = d.f137616e;
            if (i14 == dVar.f137613b) {
                return dVar;
            }
            c cVar = c.f137615e;
            if (i14 == cVar.f137613b) {
                return cVar;
            }
            C2605a c2605a = C2605a.f137614e;
            if (i14 == c2605a.f137613b) {
                return c2605a;
            }
            zg2.c.f204692a.getClass();
            zg2.c.b("ChartTimescale", "Invalid segmentIndex " + i14);
            return dVar;
        }

        private b() {
        }
    }

    public /* synthetic */ a(int i14, int i15, j jVar) {
        this(i14, i15);
    }
}
