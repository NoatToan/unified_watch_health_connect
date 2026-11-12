package xv2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxv2/c;", "", "", "rowId", "newListPosition", "", "isDelete", "<init>", "(ILjava/lang/Integer;Ljava/lang/Boolean;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f192279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f192280c;

    public c(int i14, Integer num, Boolean bool) {
        this.f192278a = i14;
        this.f192279b = num;
        this.f192280c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f192278a == cVar.f192278a && s.g(this.f192279b, cVar.f192279b) && s.g(this.f192280c, cVar.f192280c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f192278a) * 31;
        Integer num = this.f192279b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f192280c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReorderableItemChange(rowId=");
        sb3.append(this.f192278a);
        sb3.append(", newListPosition=");
        sb3.append(this.f192279b);
        sb3.append(", isDelete=");
        return p6.b.f(sb3, this.f192280c, ")");
    }
}
