package s30;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ls30/e;", "", "", "isCoveredByEarlierVisit", "isTravelledBothWays", "<init>", "(ZZ)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f156425c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f156426d = new e(false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f156428b;

    public e(boolean z14, boolean z15) {
        this.f156427a = z14;
        this.f156428b = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f156427a == eVar.f156427a && this.f156428b == eVar.f156428b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156428b) + (Boolean.hashCode(this.f156427a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("RouteTraversal(isCoveredByEarlierVisit=", ", isTravelledBothWays=", ")", this.f156427a, this.f156428b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls30/e$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
