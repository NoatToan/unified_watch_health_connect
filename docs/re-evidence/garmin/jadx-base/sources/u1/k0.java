package u1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu1/k0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f167581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f167583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f167584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f167585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f167586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f167587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f167588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f167589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f167590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f167591k;

    public k0(Context context, int i14) {
        this.f167581a = context;
        this.f167582b = i14;
        g6.m.f76012b.getClass();
        this.f167583c = 0L;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        i0.f167546a.getClass();
        return !(i0.b(edgeEffect) == 0.0f);
    }

    public final EdgeEffect a(p008y1.b2 b2Var) {
        EdgeEffect q0Var;
        i0.f167546a.getClass();
        int i14 = Build.VERSION.SDK_INT;
        Context context = this.f167581a;
        if (i14 >= 31) {
            l.f167596a.getClass();
            q0Var = l.a(context);
        } else {
            q0Var = new q0(context);
        }
        q0Var.setColor(this.f167582b);
        long j8 = this.f167583c;
        g6.m.f76012b.getClass();
        if (!g6.m.c(j8, 0L)) {
            p008y1.b2 b2Var2 = p008y1.b2.Vertical;
            long j14 = this.f167583c;
            if (b2Var == b2Var2) {
                q0Var.setSize((int) (j14 >> 32), (int) (j14 & 4294967295L));
                return q0Var;
            }
            q0Var.setSize((int) (4294967295L & j14), (int) (j14 >> 32));
        }
        return q0Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f167585e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(p008y1.b2.Vertical);
        this.f167585e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f167586f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(p008y1.b2.Horizontal);
        this.f167586f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f167587g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(p008y1.b2.Horizontal);
        this.f167587g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f167584d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(p008y1.b2.Vertical);
        this.f167584d = edgeEffectA;
        return edgeEffectA;
    }
}
