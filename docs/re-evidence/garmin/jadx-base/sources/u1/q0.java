package u1;

import android.content.Context;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu1/q0;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f167658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f167659b;

    public q0(Context context) {
        super(context);
        g6.e eVarB = xy2.b.b(context);
        g6.f.a aVar = g6.f.f75994b;
        this.f167658a = eVarB.f75991a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i14) {
        this.f167659b = 0.0f;
        super.onAbsorb(i14);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f14, float f15) {
        this.f167659b = 0.0f;
        super.onPull(f14, f15);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f167659b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f14) {
        this.f167659b = 0.0f;
        super.onPull(f14);
    }
}
