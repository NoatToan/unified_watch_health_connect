package g2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg2/w0;", "Lf5/t1;", "Lf5/t1$a;", "Lg2/y0$a;", "", Action.KEY_ATTRIBUTE, "Lg2/y0;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Lg2/y0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 implements f5.t1, f5.t1.a, y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f75291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f75292b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f5.t1.a f75295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75296f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75293c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f75297g = p3.p0.n(null);

    public w0(Object obj, y0 y0Var) {
        this.f75291a = obj;
        this.f75292b = y0Var;
    }

    @Override // f5.t1
    public final w0 a() {
        if (this.f75296f) {
            b2.e.c("Pin should not be called on an already disposed item ");
        }
        if (this.f75294d == 0) {
            this.f75292b.f75308a.add(this);
            f5.t1 t1Var = (f5.t1) this.f75297g.getValue();
            this.f75295e = t1Var != null ? t1Var.a() : null;
        }
        this.f75294d++;
        return this;
    }

    @Override // g2.y0.a
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF75293c() {
        return this.f75293c;
    }

    @Override // g2.y0.a
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF75291a() {
        return this.f75291a;
    }

    @Override // f5.t1.a
    public final void release() {
        if (this.f75296f) {
            return;
        }
        if (this.f75294d <= 0) {
            b2.e.c("Release should only be called once");
        }
        int i14 = this.f75294d - 1;
        this.f75294d = i14;
        if (i14 == 0) {
            this.f75292b.f75308a.remove(this);
            f5.t1.a aVar = this.f75295e;
            if (aVar != null) {
                aVar.release();
            }
            this.f75295e = null;
        }
    }
}
