package nt2;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnt2/i;", "", "Lnt2/d;", "overline", "title", "fallbackTitle", "", "subtitles", "Lnt2/c;", "unitMetadata", "<init>", "(Lnt2/d;Lnt2/d;Lnt2/d;Ljava/util/List;Lnt2/c;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f127865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f127866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f127867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d> f127868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f127869e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(d dVar, d dVar2, d dVar3, List<? extends d> list, c cVar) {
        dVar2.getClass();
        dVar3.getClass();
        list.getClass();
        cVar.getClass();
        this.f127865a = dVar;
        this.f127866b = dVar2;
        this.f127867c = dVar3;
        this.f127868d = list;
        this.f127869e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f127865a == iVar.f127865a && this.f127866b == iVar.f127866b && this.f127867c == iVar.f127867c && this.f127868d.equals(iVar.f127868d) && this.f127869e.equals(iVar.f127869e);
    }

    public final int hashCode() {
        d dVar = this.f127865a;
        return this.f127869e.f127834a.hashCode() + u0.b((this.f127867c.hashCode() + ((this.f127866b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31)) * 31, 31, this.f127868d);
    }

    public final String toString() {
        return "WorkoutCardStringsLayout(overline=" + this.f127865a + ", title=" + this.f127866b + ", fallbackTitle=" + this.f127867c + ", subtitles=" + this.f127868d + ", unitMetadata=" + this.f127869e + ")";
    }
}
