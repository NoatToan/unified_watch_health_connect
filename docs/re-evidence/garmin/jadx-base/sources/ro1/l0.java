package ro1;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lro1/l0;", "", "Lso1/e;", "stickerType", "", "timeLimited", "", "Lro1/k0;", "stickerImages", "<init>", "(Lso1/e;ZLjava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so1.e f153986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k0> f153988c;

    public l0(so1.e eVar, boolean z14, List<k0> list) {
        list.getClass();
        this.f153986a = eVar;
        this.f153987b = z14;
        this.f153988c = list;
    }

    public final boolean a() {
        List<k0> list = this.f153988c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f153983b.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f153986a == l0Var.f153986a && this.f153987b == l0Var.f153987b && p005kotlin.jvm.internal.s.g(this.f153988c, l0Var.f153988c);
    }

    public final int hashCode() {
        so1.e eVar = this.f153986a;
        return this.f153988c.hashCode() + q6.f.g((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f153987b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StickerModel(stickerType=");
        sb3.append(this.f153986a);
        sb3.append(", timeLimited=");
        sb3.append(this.f153987b);
        sb3.append(", stickerImages=");
        return u62.z.c(sb3, this.f153988c, ")");
    }

    public /* synthetic */ l0(so1.e eVar, boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, (i14 & 2) != 0 ? false : z14, list);
    }
}
