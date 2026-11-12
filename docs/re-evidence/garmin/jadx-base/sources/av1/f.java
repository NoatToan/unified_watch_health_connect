package av1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lav1/f;", "", "Li53/d;", "Lhv1/b;", "Li53/c;", "Lav1/g;", "sortedMap", "", "shouldShowChipFiler", "<init>", "(Li53/d;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.d<hv1.b, i53.c<g>> f13268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13269b;

    public /* synthetic */ f(i53.d dVar, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f13268a, fVar.f13268a) && this.f13269b == fVar.f13269b;
    }

    public final int hashCode() {
        i53.d<hv1.b, i53.c<g>> dVar = this.f13268a;
        return Boolean.hashCode(this.f13269b) + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public final String toString() {
        return "FBTTrainingGuidanceUIModel(sortedMap=" + this.f13268a + ", shouldShowChipFiler=" + this.f13269b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(i53.d<hv1.b, ? extends i53.c<g>> dVar, boolean z14) {
        this.f13268a = dVar;
        this.f13269b = z14;
    }
}
