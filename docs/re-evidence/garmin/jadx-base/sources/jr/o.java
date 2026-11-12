package jr;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljr/o;", "", "", "_rowType", "", "hasHelp", "_navigationEvent", "", "zOrder", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rowType")
    private String _rowType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("help")
    private final Boolean hasHelp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("navigationEvent")
    private final String _navigationEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zOrder")
    private final Integer zOrder;

    public /* synthetic */ o(String str, Boolean bool, String str2, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? Boolean.FALSE : bool, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : num);
    }

    public final n a() {
        String str = this._navigationEvent;
        if (str != null) {
            n.f100199b.getClass();
            str.getClass();
            for (n nVar : n.values()) {
                if (p005kotlin.jvm.internal.s.g(nVar.f100231a, str)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public final p b() {
        p.a aVar = p.f100243b;
        String str = this._rowType;
        aVar.getClass();
        return p.a.a(str);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getZOrder() {
        return this.zOrder;
    }

    public final void d(p pVar) {
        this._rowType = pVar != null ? pVar.f100439a : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this._rowType, oVar._rowType) && p005kotlin.jvm.internal.s.g(this.hasHelp, oVar.hasHelp) && p005kotlin.jvm.internal.s.g(this._navigationEvent, oVar._navigationEvent) && p005kotlin.jvm.internal.s.g(this.zOrder, oVar.zOrder);
    }

    public final int hashCode() {
        String str = this._rowType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasHelp;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this._navigationEvent;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.zOrder;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Row(_rowType=" + this._rowType + ", hasHelp=" + this.hasHelp + ", _navigationEvent=" + this._navigationEvent + ", zOrder=" + this.zOrder + ")";
    }

    public o(String str, Boolean bool, String str2, Integer num) {
        this._rowType = str;
        this.hasHelp = bool;
        this._navigationEvent = str2;
        this.zOrder = num;
    }
}
