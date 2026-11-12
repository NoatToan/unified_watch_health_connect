package wv2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwv2/a;", "", "", "listPosition", "", "text", "Lzw2/g$c;", "iconInfo", "Lxv2/d;", "options", "", "actionEnabled", "<init>", "(ILjava/lang/String;Lzw2/g$c;Lxv2/d;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zw2.g.c f187463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xv2.d f187464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f187465e;

    public a(int i14, String str, zw2.g.c cVar, xv2.d dVar, boolean z14) {
        str.getClass();
        cVar.getClass();
        dVar.getClass();
        this.f187461a = i14;
        this.f187462b = str;
        this.f187463c = cVar;
        this.f187464d = dVar;
        this.f187465e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f187461a == aVar.f187461a && this.f187462b.equals(aVar.f187462b) && this.f187463c.equals(aVar.f187463c) && this.f187464d.equals(aVar.f187464d) && this.f187465e == aVar.f187465e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f187465e) + ((this.f187464d.hashCode() + ((this.f187463c.hashCode() + wr.g.j(Integer.hashCode(this.f187461a) * 31, 31, this.f187462b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f187461a, "ReorderableItem(listPosition=", ", text=", this.f187462b, ", iconInfo=");
        sbR.append(this.f187463c);
        sbR.append(", options=");
        sbR.append(this.f187464d);
        sbR.append(", actionEnabled=");
        return hb.a.k(sbR, this.f187465e, ")");
    }
}
