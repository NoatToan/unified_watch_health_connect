package iw0;

import b63.o;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pv0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liw0/a;", "", "Lb63/o;", "calendarDate", "", "", "yValues", "Lpv0/w;", "behaviour", "<init>", "(Lb63/o;Ljava/util/List;Lpv0/w;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f95276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Float> f95277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f95278c;

    public a(o oVar, List<Float> list, w wVar) {
        list.getClass();
        this.f95276a = oVar;
        this.f95277b = list;
        this.f95278c = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f95276a, aVar.f95276a) && this.f95277b.equals(aVar.f95277b) && this.f95278c == aVar.f95278c;
    }

    public final int hashCode() {
        o oVar = this.f95276a;
        int iB = u0.b((oVar == null ? 0 : oVar.f16206a.hashCode()) * 31, 31, this.f95277b);
        w wVar = this.f95278c;
        return iB + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "BehaviourDetailsEntry(calendarDate=" + this.f95276a + ", yValues=" + this.f95277b + ", behaviour=" + this.f95278c + ")";
    }
}
