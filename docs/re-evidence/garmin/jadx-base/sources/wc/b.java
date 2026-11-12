package wc;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lwc/b;", "", "", "swipeEdge", "", "progress", "touchX", "touchY", "", "frameTimeMillis", "<init>", "(IFFFJ)V", "a", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f184222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f184223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f184224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f184225e;

    static {
        new a(null);
    }

    public /* synthetic */ b(int i14, float f14, float f15, float f16, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 2 : i14, (i15 & 2) != 0 ? 0.0f : f14, (i15 & 4) != 0 ? 0.0f : f15, (i15 & 8) != 0 ? 0.0f : f16, (i15 & 16) != 0 ? 0L : j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f184223c == bVar.f184223c && this.f184224d == bVar.f184224d && this.f184222b == bVar.f184222b && this.f184221a == bVar.f184221a && this.f184225e == bVar.f184225e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f184225e) + q2.d(this.f184221a, q6.f.d(this.f184222b, q6.f.d(this.f184224d, Float.hashCode(this.f184223c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigationEvent(touchX=");
        sb3.append(this.f184223c);
        sb3.append(", touchY=");
        sb3.append(this.f184224d);
        sb3.append(", progress=");
        sb3.append(this.f184222b);
        sb3.append(", swipeEdge=");
        sb3.append(this.f184221a);
        sb3.append(", frameTimeMillis=");
        return a0.l(sb3, this.f184225e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lwc/b$a;", "", "<init>", "()V", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "EDGE_NONE", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(int i14) {
        this(i14, 0.0f, 0.0f, 0.0f, 0L, 30, null);
    }

    public b(int i14, float f14) {
        this(i14, f14, 0.0f, 0.0f, 0L, 28, null);
    }

    public b(int i14, float f14, float f15) {
        this(i14, f14, f15, 0.0f, 0L, 24, null);
    }

    public b(int i14, float f14, float f15, float f16) {
        this(i14, f14, f15, f16, 0L, 16, null);
    }

    public b(int i14, float f14, float f15, float f16, long j8) {
        this.f184221a = i14;
        this.f184222b = f14;
        this.f184223c = f15;
        this.f184224d = f16;
        this.f184225e = j8;
    }

    public b() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }
}
