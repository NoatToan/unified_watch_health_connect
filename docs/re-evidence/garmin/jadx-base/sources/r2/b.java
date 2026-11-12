package r2;

import android.content.Context;
import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr2/b;", "Lh5/x0;", "Lr2/c;", "Lkotlin/Function2;", "Ln2/a;", "Landroid/content/Context;", "", "builder", "<init>", "(Le23/p;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b extends x0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<n2.a, Context, Unit> f149432a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.p<? super n2.a, ? super Context, Unit> pVar) {
        this.f149432a = pVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new c(this.f149432a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f149432a == ((b) obj).f149432a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f149432a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "addTextContextMenuDataComponentsWithResources";
        m2Var.f91343c.c(this.f149432a, "builder");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((c) cVar).f149433c = this.f149432a;
    }
}
