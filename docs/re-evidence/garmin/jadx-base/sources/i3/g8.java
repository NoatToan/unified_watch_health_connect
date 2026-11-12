package i3;

import android.content.Context;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/g8;", "Li5/a;", "Lk6/v;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g8 extends kotlin.a implements p004k6.v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f88202d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f88203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f88204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88205c;

    public g8(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f88203a = window;
        n2.f89051a.getClass();
        this.f88204b = p3.p0.n(n2.f89052b);
    }

    @Override // kotlin.a
    public final void Content(p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(576708319);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ((e23.p) this.f88204b.getF182175a()).invoke(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.l(this, i14, i16);
        }
    }

    @Override // kotlin.a
    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF88205c() {
        return this.f88205c;
    }

    @Override // p004k6.v
    /* JADX INFO: renamed from: getWindow, reason: from getter */
    public final Window getF88203a() {
        return this.f88203a;
    }
}
