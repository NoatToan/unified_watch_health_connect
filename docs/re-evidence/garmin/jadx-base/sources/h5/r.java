package h5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lh5/r;", "", "Lg6/f;", TtmlNode.START, "top", TtmlNode.END, "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/j;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f81950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f81953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81954e;

    static {
        new a(null);
    }

    private r(float f14, float f15, float f16, float f17, boolean z14) {
        this.f81950a = f14;
        this.f81951b = f15;
        this.f81952c = f16;
        this.f81953d = f17;
        this.f81954e = z14;
        if (!(f14 >= 0.0f)) {
            e5.a.a("Left must be non-negative");
        }
        if (!(f15 >= 0.0f)) {
            e5.a.a("Top must be non-negative");
        }
        if (!(f16 >= 0.0f)) {
            e5.a.a("Right must be non-negative");
        }
        if (f17 >= 0.0f) {
            return;
        }
        e5.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return g6.f.c(this.f81950a, rVar.f81950a) && g6.f.c(this.f81951b, rVar.f81951b) && g6.f.c(this.f81952c, rVar.f81952c) && g6.f.c(this.f81953d, rVar.f81953d) && this.f81954e == rVar.f81954e;
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Boolean.hashCode(this.f81954e) + q6.f.d(this.f81953d, q6.f.d(this.f81952c, q6.f.d(this.f81951b, Float.hashCode(this.f81950a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DpTouchBoundsExpansion(start=");
        tn.k.l(this.f81950a, ", top=", sb3);
        tn.k.l(this.f81951b, ", end=", sb3);
        tn.k.l(this.f81952c, ", bottom=", sb3);
        tn.k.l(this.f81953d, ", isLayoutDirectionAware=", sb3);
        return am.j.t(sb3, this.f81954e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/r$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ r(float f14, float f15, float f16, float f17, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, z14);
    }
}
