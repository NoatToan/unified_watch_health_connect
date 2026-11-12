package jr;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Ljr/r;", "", "", "_type", "", "zOrder", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private String _type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zOrder")
    private final Integer zOrder;

    public /* synthetic */ r(String str, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : num);
    }

    public final p a() {
        p.a aVar = p.f100243b;
        String str = this._type;
        aVar.getClass();
        return p.a.a(str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getZOrder() {
        return this.zOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this._type, rVar._type) && p005kotlin.jvm.internal.s.g(this.zOrder, rVar.zOrder);
    }

    public final int hashCode() {
        String str = this._type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.zOrder;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SectionStatType(_type=" + this._type + ", zOrder=" + this.zOrder + ")";
    }

    public r(String str, Integer num) {
        this._type = str;
        this.zOrder = num;
    }
}
