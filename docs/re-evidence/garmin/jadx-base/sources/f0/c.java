package f0;

import android.util.Range;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lf0/c;", "Ld0/a;", "", "minFps", "maxFps", "<init>", "(II)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends d0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Range<Integer> f67632e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f67635d = b.FPS_RANGE;

    static {
        new a(null);
        f67632e = new Range<>(30, 30);
    }

    public c(int i14, int i15) {
        this.f67633b = i14;
        this.f67634c = i15;
    }

    @Override // d0.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF67640c() {
        return this.f67635d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FpsRangeFeature(minFps=");
        sb3.append(this.f67633b);
        sb3.append(", maxFps=");
        return e0.j(sb3, this.f67634c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf0/c$a;", "", "<init>", "()V", "Landroid/util/Range;", "", "DEFAULT_FPS_RANGE", "Landroid/util/Range;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
