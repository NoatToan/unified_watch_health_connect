package b;

import android.os.Build;
import android.window.BackEvent;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb/c;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "", "frameTimeMillis", "<init>", "(FFFIJ)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "Lwc/b;", "navigationEvent", "(Lwc/b;)V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13791e;

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BackEventCompat(touchX=");
        sb3.append(this.f13787a);
        sb3.append(", touchY=");
        sb3.append(this.f13788b);
        sb3.append(", progress=");
        sb3.append(this.f13789c);
        sb3.append(", swipeEdge=");
        sb3.append(this.f13790d);
        sb3.append(", frameTimeMillis=");
        return a0.l(sb3, this.f13791e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lb/c$a;", "", "<init>", "()V", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "EDGE_NONE", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(float f14, float f15, float f16, int i14, long j8) {
        this.f13787a = f14;
        this.f13788b = f15;
        this.f13789c = f16;
        this.f13790d = i14;
        this.f13791e = j8;
    }

    public /* synthetic */ c(float f14, float f15, float f16, int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, i14, (i15 & 16) != 0 ? 0L : j8);
    }

    public c(float f14, float f15, float f16, int i14) {
        this(f14, f15, f16, i14, 0L, 16, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(wc.b bVar) {
        this(bVar.f184223c, bVar.f184224d, bVar.f184222b, bVar.f184221a, bVar.f184225e);
        bVar.getClass();
    }
}
