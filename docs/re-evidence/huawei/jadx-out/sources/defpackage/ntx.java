package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class ntx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f43716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43717c;
    private long d;
    private long e;
    private int h;
    private int i;
    private int j;

    private ntx(d dVar) {
        this.i = dVar.i;
        this.h = dVar.f;
        this.e = dVar.f43720c;
        this.d = dVar.e;
        this.f43715a = dVar.f43718a;
        this.j = dVar.g;
        this.f43717c = dVar.f43719b;
        this.f43716b = dVar.d;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f43718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f43720c;
        private int[] d;
        private long e;
        private int f;
        private int g;
        private int i;

        public ntx a() {
            return new ntx(this);
        }

        public d c(int i) {
            this.i = i;
            return this;
        }

        public d e(int i) {
            this.f = i;
            return this;
        }

        public d b(long j) {
            this.f43720c = j;
            return this;
        }

        public d d(long j) {
            this.e = j;
            return this;
        }

        public d a(int i) {
            this.f43718a = i;
            return this;
        }

        public d d(int i) {
            this.g = i;
            return this;
        }

        public d a(int[] iArr) {
            if (iArr != null) {
                this.d = (int[]) iArr.clone();
            }
            return this;
        }
    }

    public int f() {
        return this.i;
    }

    public int i() {
        return this.h;
    }

    public long a() {
        return this.e;
    }

    public long e() {
        return this.d;
    }

    public int c() {
        return this.f43715a;
    }

    public int h() {
        return this.j;
    }

    public int b() {
        return this.f43717c;
    }

    public int[] d() {
        int[] iArr = this.f43716b;
        if (iArr != null) {
            return (int[]) iArr.clone();
        }
        return null;
    }

    public String toString() {
        return "SportRecordQueryParam{mType=" + this.i + ", mSubType=" + this.h + ", mStartTime=" + this.e + ", mEndTime=" + this.d + ", mCount=" + this.f43715a + ", mTimeUnit=" + this.j + ", mSortOrderType=" + this.f43717c + ", mMultiType=" + Arrays.toString(this.f43716b) + '}';
    }
}
