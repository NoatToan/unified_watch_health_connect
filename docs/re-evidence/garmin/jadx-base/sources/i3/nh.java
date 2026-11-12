package i3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/nh;", "Lh5/x0;", "Li3/oh;", "La2/i;", "interactionSource", "", "checked", "Ls1/f0;", "", "animationSpec", "<init>", "(La2/i;ZLs1/f0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class nh extends h5.x0<oh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.i f89103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<Float> f89105c;

    public nh(a2.i iVar, boolean z14, s1.f0<Float> f0Var) {
        this.f89103a = iVar;
        this.f89104b = z14;
        this.f89105c = f0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new oh(this.f89103a, this.f89104b, this.f89105c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return p005kotlin.jvm.internal.s.g(this.f89103a, nhVar.f89103a) && this.f89104b == nhVar.f89104b && p005kotlin.jvm.internal.s.g(this.f89105c, nhVar.f89105c);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f89105c.hashCode() + q6.f.g(this.f89103a.hashCode() * 31, 31, this.f89104b);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "switchThumb";
        kotlin.v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f89103a, "interactionSource");
        v3Var.c(Boolean.valueOf(this.f89104b), "checked");
        v3Var.c(this.f89105c, "animationSpec");
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f89103a + ", checked=" + this.f89104b + ", animationSpec=" + this.f89105c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        oh ohVar = (oh) cVar;
        ohVar.f89216a = this.f89103a;
        boolean z14 = ohVar.f89217b;
        boolean z15 = this.f89104b;
        if (z14 != z15) {
            h5.k.g(ohVar).T();
        }
        ohVar.f89217b = z15;
        ohVar.f89218c = this.f89105c;
        if (ohVar.f89221f == null && !Float.isNaN(ohVar.f89223h)) {
            ohVar.f89221f = s1.d.a(ohVar.f89223h, 0.01f);
        }
        if (ohVar.f89220e != null || Float.isNaN(ohVar.f89222g)) {
            return;
        }
        ohVar.f89220e = s1.d.a(ohVar.f89222g, 0.01f);
    }
}
