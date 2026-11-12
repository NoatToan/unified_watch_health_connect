package b5;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lb5/e;", "", "", "uptimeMillis", "Ln4/c;", ModelSourceWrapper.POSITION, "", "scaleFactor", "panOffset", "<init>", "(JJFJLkotlin/jvm/internal/j;)V", "(JJLkotlin/jvm/internal/j;)V", "originalEventPosition", "(JJFJJLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15792e;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(long j8, long j14, float f14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        long j16;
        float f15 = (i14 & 4) != 0 ? 1.0f : f14;
        if ((i14 & 8) != 0) {
            n4.c.f123541b.getClass();
            j16 = 0;
        } else {
            j16 = j15;
        }
        this(j8, j14, f15, j16, (p005kotlin.jvm.internal.j) null);
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f15788a + ", position=" + ((Object) n4.c.l(this.f15789b)) + ", scaleFactor=" + this.f15790c + ", panOffset=" + ((Object) n4.c.l(this.f15791d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ e(long j8, long j14, float f14, long j15, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f14, j15);
    }

    @o13.e
    public /* synthetic */ e(long j8, long j14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14);
    }

    private e(long j8, long j14, float f14, long j15) {
        this.f15788a = j8;
        this.f15789b = j14;
        this.f15790c = f14;
        this.f15791d = j15;
        n4.c.f123541b.getClass();
        this.f15792e = 0L;
    }

    public /* synthetic */ e(long j8, long j14, float f14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f14, j15, j16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private e(long j8, long j14) {
        this(j8, j14, 1.0f, 0L, (p005kotlin.jvm.internal.j) null);
        n4.c.f123541b.getClass();
    }

    private e(long j8, long j14, float f14, long j15, long j16) {
        this(j8, j14, f14, j15, (p005kotlin.jvm.internal.j) null);
        this.f15792e = j16;
    }
}
