package androidx.media3.exoplayer;

import com.google.android.exoplayer2.C;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8814c;

    private d0(b bVar) {
        this.f8812a = bVar.f8815a;
        this.f8813b = bVar.f8816b;
        this.f8814c = bVar.f8817c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f8812a == d0Var.f8812a && this.f8813b == d0Var.f8813b && this.f8814c == d0Var.f8814c;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f8812a), Float.valueOf(this.f8813b), Long.valueOf(this.f8814c));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f8817c;

        public b() {
            this.f8815a = C.TIME_UNSET;
            this.f8816b = -3.4028235E38f;
            this.f8817c = C.TIME_UNSET;
        }

        public final d0 a() {
            return new d0(this);
        }

        private b(d0 d0Var) {
            this.f8815a = d0Var.f8812a;
            this.f8816b = d0Var.f8813b;
            this.f8817c = d0Var.f8814c;
        }
    }
}
