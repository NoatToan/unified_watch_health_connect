package y10;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly10/o0;", "", "", "fromPosition", "toPosition", "", "itemName", "<init>", "(IILjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f193972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f193973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193974c;

    public o0(int i14, int i15, String str) {
        str.getClass();
        this.f193972a = i14;
        this.f193973b = i15;
        this.f193974c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f193972a == o0Var.f193972a && this.f193973b == o0Var.f193973b && this.f193974c.equals(o0Var.f193974c);
    }

    public final int hashCode() {
        return this.f193974c.hashCode() + q2.d(this.f193973b, Integer.hashCode(this.f193972a) * 31, 31);
    }

    public final String toString() {
        return am.j.o(this.f193974c, ")", e5.j(this.f193972a, this.f193973b, "OnItemMoveTalkback(fromPosition=", ", toPosition=", ", itemName="));
    }
}
