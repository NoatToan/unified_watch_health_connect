package h2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh2/a;", "La5/a;", "Lh2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Lh2/j0;Ly1/b2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f80829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f80830b;

    public a(j0 j0Var, b2 b2Var) {
        this.f80829a = j0Var;
        this.f80830b = b2Var;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, t13.d<? super g6.s> dVar) {
        return g6.s.a(this.f80830b == b2.Vertical ? g6.s.b(0.0f, 0.0f, j14, 2) : g6.s.b(0.0f, 0.0f, j14, 1));
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        a5.j.f1233b.getClass();
        if (i14 == a5.j.f1235d) {
            if (Float.intBitsToFloat((int) (this.f80830b == b2.Horizontal ? j14 >> 32 : 4294967295L & j14)) != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        a5.j.f1233b.getClass();
        if (i14 == a5.j.f1234c) {
            j0 j0Var = this.f80829a;
            if (Math.abs(j0Var.m()) > 1.0E-6d) {
                b2 b2Var = b2.Horizontal;
                b2 b2Var2 = this.f80830b;
                if (Math.abs(Float.intBitsToFloat((int) (b2Var2 == b2Var ? j8 >> 32 : j8 & 4294967295L))) > 0.0f) {
                    float fM = j0Var.m() * j0Var.p();
                    float f80846c = ((j0Var.n().getF80846c() + j0Var.n().getF80845b()) * (-Math.signum(j0Var.m()))) + fM;
                    if (j0Var.m() > 0.0f) {
                        f80846c = fM;
                        fM = f80846c;
                    }
                    float fIntBitsToFloat = -j0Var.f80935k.d(-j23.t.d(Float.intBitsToFloat((int) (b2Var2 == b2Var ? j8 >> 32 : j8 & 4294967295L)), fM, f80846c));
                    float fIntBitsToFloat2 = b2Var2 == b2Var ? fIntBitsToFloat : Float.intBitsToFloat((int) (j8 >> 32));
                    if (b2Var2 != b2.Vertical) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (j8 & 4294967295L));
                    }
                    n4.c.a aVar = n4.c.f123541b;
                    return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                }
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }
}
