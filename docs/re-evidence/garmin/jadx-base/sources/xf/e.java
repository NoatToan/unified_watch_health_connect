package xf;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxf/e;", "Landroid/view/View;", "T", "Lxf/k;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e<T extends View> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f190613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f190614b;

    public e(T t7, boolean z14) {
        this.f190613a = t7;
        this.f190614b = z14;
    }

    @Override // xf.k
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF190614b() {
        return this.f190614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f190613a, eVar.f190613a) && this.f190614b == eVar.f190614b;
    }

    @Override // xf.k
    public final T getView() {
        return this.f190613a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190614b) + (this.f190613a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RealViewSizeResolver(view=");
        sb3.append(this.f190613a);
        sb3.append(", subtractPadding=");
        return am.j.t(sb3, this.f190614b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
