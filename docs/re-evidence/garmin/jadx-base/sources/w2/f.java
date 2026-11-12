package w2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lw2/f;", "", "", "visible", "Ln4/c;", ModelSourceWrapper.POSITION, "", "lineHeight", "Ld6/g;", "direction", "handlesCrossed", "<init>", "(ZJFLd6/g;ZLkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f181324f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f181325g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f181326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f181328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d6.g f181329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f181330e;

    static {
        n4.c.f123541b.getClass();
        f181325g = new f(false, n4.c.f123543d, 0.0f, d6.g.Ltr, false, null);
    }

    private f(boolean z14, long j8, float f14, d6.g gVar, boolean z15) {
        this.f181326a = z14;
        this.f181327b = j8;
        this.f181328c = f14;
        this.f181329d = gVar;
        this.f181330e = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f181326a == fVar.f181326a && n4.c.d(this.f181327b, fVar.f181327b) && Float.compare(this.f181328c, fVar.f181328c) == 0 && this.f181329d == fVar.f181329d && this.f181330e == fVar.f181330e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f181326a) * 31;
        n4.c.a aVar = n4.c.f123541b;
        return Boolean.hashCode(this.f181330e) + ((this.f181329d.hashCode() + q6.f.d(this.f181328c, q6.f.e(iHashCode, 31, this.f181327b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextFieldHandleState(visible=");
        sb3.append(this.f181326a);
        sb3.append(", position=");
        sb3.append((Object) n4.c.l(this.f181327b));
        sb3.append(", lineHeight=");
        sb3.append(this.f181328c);
        sb3.append(", direction=");
        sb3.append(this.f181329d);
        sb3.append(", handlesCrossed=");
        return am.j.t(sb3, this.f181330e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw2/f$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(boolean z14, long j8, float f14, d6.g gVar, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(z14, j8, f14, gVar, z15);
    }
}
