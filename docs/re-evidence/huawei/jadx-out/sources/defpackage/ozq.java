package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class ozq implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45032a;
    private String d;
    private ArrayList<a> e;

    public String a() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public void a(long j) {
        this.f45032a = j;
    }

    public ArrayList<a> e() {
        return this.e;
    }

    public void c(ArrayList<a> arrayList) {
        this.e = arrayList;
    }

    public String toString() {
        return "HistoricalReportDataBean{mYearOrMonthTitle='" + this.d + "', mYearOrMonthTimestamp=" + this.f45032a + ", mOneMonthOrWeekRecordList=" + this.e + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof ozq) {
            return Long.compare(((ozq) obj).f45032a, this.f45032a);
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return (obj instanceof ozq) && this.f45032a == ((ozq) obj).f45032a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f45033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45034b;
        private long d;
        private String e;

        public long e() {
            return this.f45033a;
        }

        public void d(long j) {
            this.f45033a = j;
        }

        public long d() {
            return this.d;
        }

        public void a(long j) {
            this.d = j;
        }

        public void d(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }

        public int c() {
            return this.f45034b;
        }

        public void a(int i) {
            this.f45034b = i;
        }

        public String toString() {
            return "OneMonthOrWeekRecord{mStartTimestamp=" + this.f45033a + ", mEndTimestamp=" + this.d + ", mRecordTitle='" + this.e + "', mReportNumber=" + this.f45034b + '}';
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof a) {
                return Long.compare(((a) obj).f45033a, this.f45033a);
            }
            return -1;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && this.f45033a == ((a) obj).f45033a;
        }

        public int hashCode() {
            return super.hashCode();
        }
    }
}
