package p5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp5/k;", "", "", "current", "Lj23/f;", "range", "", "steps", "<init>", "(FLj23/f;I)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f136027d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f136028e = new k(0.0f, new j23.e(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f136029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j23.f<Float> f136030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136031c;

    public k(float f14, j23.f<Float> fVar, int i14) {
        this.f136029a = f14;
        this.f136030b = fVar;
        this.f136031c = i14;
        if (Float.isNaN(f14)) {
            vb.h.s("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f136029a == kVar.f136029a && p005kotlin.jvm.internal.s.g(this.f136030b, kVar.f136030b) && this.f136031c == kVar.f136031c;
    }

    public final int hashCode() {
        return ((this.f136030b.hashCode() + (Float.hashCode(this.f136029a) * 31)) * 31) + this.f136031c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb3.append(this.f136029a);
        sb3.append(", range=");
        sb3.append(this.f136030b);
        sb3.append(", steps=");
        return ds.e0.j(sb3, this.f136031c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5/k$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(float f14, j23.f fVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(f14, fVar, (i15 & 4) != 0 ? 0 : i14);
    }
}
