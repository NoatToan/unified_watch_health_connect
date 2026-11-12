package xv2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxv2/d;", "", "", "rowId", "", "viewState", "<init>", "(ILjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f192282b;

    public d(int i14, String str) {
        str.getClass();
        this.f192281a = i14;
        this.f192282b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f192281a == dVar.f192281a && s.g(this.f192282b, dVar.f192282b);
    }

    public final int hashCode() {
        return this.f192282b.hashCode() + (Integer.hashCode(this.f192281a) * 31);
    }

    public final String toString() {
        return o2.c.e(this.f192281a, "ReorderableItemOptions(rowId=", ", viewState=", this.f192282b, ")");
    }

    public /* synthetic */ d(int i14, String str, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? "VISIBLE" : str);
    }
}
