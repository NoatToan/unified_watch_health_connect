package kf;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkf/b;", "", ModelSourceWrapper.TYPE, "Ljf/c;", "modelEqualityDelegate", "Lhf/j;", "imageLoader", "<init>", "(Ljava/lang/Object;Ljf/c;Lhf/j;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f104561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf.c f104562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf.j f104563c;

    public b(Object obj, jf.c cVar, hf.j jVar) {
        this.f104561a = obj;
        this.f104562b = cVar;
        this.f104563c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        jf.c cVar = bVar.f104562b;
        jf.c cVar2 = this.f104562b;
        return s.g(cVar2, cVar) && cVar2.equals(this.f104561a, bVar.f104561a) && s.g(this.f104563c, bVar.f104563c);
    }

    public final int hashCode() {
        jf.c cVar = this.f104562b;
        return this.f104563c.hashCode() + ((cVar.hashCode(this.f104561a) + (cVar.hashCode() * 31)) * 31);
    }
}
