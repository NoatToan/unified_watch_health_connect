package jr;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Ljr/f;", "", "", "_itemType", "Ljr/i;", "itemDetails", "<init>", "(Ljava/lang/String;Ljr/i;)V", "a", "Ljava/lang/String;", "b", "Ljr/i;", "()Ljr/i;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("itemType")
    private final String _itemType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("itemDetails")
    private final i itemDetails;

    public f(String str, i iVar) {
        str.getClass();
        this._itemType = str;
        this.itemDetails = iVar;
    }

    public static f a(f fVar, i iVar) {
        String str = fVar._itemType;
        str.getClass();
        return new f(str, iVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getItemDetails() {
        return this.itemDetails;
    }

    public final k c() {
        Object next;
        k.a aVar = k.f100166b;
        String str = this._itemType;
        aVar.getClass();
        str.getClass();
        Iterator<T> it = k.f100165a1.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((k) next).f100190a, str)) {
                return (k) next;
            }
        }
        next = null;
        return (k) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this._itemType, fVar._itemType) && p005kotlin.jvm.internal.s.g(this.itemDetails, fVar.itemDetails);
    }

    public final int hashCode() {
        int iHashCode = this._itemType.hashCode() * 31;
        i iVar = this.itemDetails;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Component(_itemType=" + this._itemType + ", itemDetails=" + this.itemDetails + ")";
    }
}
