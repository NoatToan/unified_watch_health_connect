package xv2;

import p005kotlin.Metadata;
import zw2.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxv2/e;", "", "", "rowId", "Ltv2/c;", "title", "Lzw2/g$c;", "iconInfo", "", "actionEnabled", "<init>", "(ILtv2/c;Lzw2/g$c;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f192284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.c f192285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f192286d;

    public e(int i14, tv2.c cVar, g.c cVar2, boolean z14) {
        cVar.getClass();
        cVar2.getClass();
        this.f192283a = i14;
        this.f192284b = cVar;
        this.f192285c = cVar2;
        this.f192286d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f192283a == eVar.f192283a && this.f192284b.equals(eVar.f192284b) && this.f192285c.equals(eVar.f192285c) && this.f192286d == eVar.f192286d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192286d) + ((this.f192285c.hashCode() + wr.g.l(this.f192284b, Integer.hashCode(this.f192283a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ReorderableListItem(rowId=" + this.f192283a + ", title=" + this.f192284b + ", iconInfo=" + this.f192285c + ", actionEnabled=" + this.f192286d + ")";
    }
}
