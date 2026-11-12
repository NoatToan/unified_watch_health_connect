package g2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg2/i1;", "Lh5/x0;", "Lg2/l1;", "Lkotlin/Function0;", "Lg2/i0;", "itemProviderLambda", "Lg2/h1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "userScrollEnabled", "reverseScrolling", "<init>", "(Le23/a;Lg2/h1;Ly1/b2;ZZ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i1 extends h5.x0<l1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<i0> f75133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f75134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p008y1.b2 f75135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f75137e;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(e23.a<? extends i0> aVar, h1 h1Var, p008y1.b2 b2Var, boolean z14, boolean z15) {
        this.f75133a = aVar;
        this.f75134b = h1Var;
        this.f75135c = b2Var;
        this.f75136d = z14;
        this.f75137e = z15;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new l1(this.f75133a, this.f75134b, this.f75135c, this.f75136d, this.f75137e);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f75133a == i1Var.f75133a && p005kotlin.jvm.internal.s.g(this.f75134b, i1Var.f75134b) && this.f75135c == i1Var.f75135c && this.f75136d == i1Var.f75136d && this.f75137e == i1Var.f75137e;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f75137e) + q6.f.g((this.f75135c.hashCode() + ((this.f75134b.hashCode() + (this.f75133a.hashCode() * 31)) * 31)) * 31, 31, this.f75136d);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        l1 l1Var = (l1) cVar;
        l1Var.f75156a = this.f75133a;
        l1Var.f75157b = this.f75134b;
        p008y1.b2 b2Var = l1Var.f75158c;
        p008y1.b2 b2Var2 = this.f75135c;
        if (b2Var != b2Var2) {
            l1Var.f75158c = b2Var2;
            h5.k.g(l1Var).U();
        }
        boolean z14 = l1Var.f75159d;
        boolean z15 = this.f75136d;
        boolean z16 = this.f75137e;
        if (z14 == z15 && l1Var.f75160e == z16) {
            return;
        }
        l1Var.f75159d = z15;
        l1Var.f75160e = z16;
        l1Var.U1();
        h5.k.g(l1Var).U();
    }
}
