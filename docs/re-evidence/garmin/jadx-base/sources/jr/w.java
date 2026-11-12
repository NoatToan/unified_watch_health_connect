package jr;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljr/w;", "", "", "_type", "styleTypeKey", "", "Ljr/o;", "rows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "c", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String _type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("styleType")
    private final String styleTypeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rows")
    private final List<o> rows;

    public w(String str, String str2, List<o> list) {
        str.getClass();
        list.getClass();
        this._type = str;
        this.styleTypeKey = str2;
        this.rows = list;
    }

    public final List<o> a() {
        return this.rows;
    }

    public final t b() {
        Object next;
        t.a aVar = t.f100454b;
        String str = this.styleTypeKey;
        aVar.getClass();
        Iterator<T> it = t.f100468p.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((t) next).f100469a, str)) {
                return (t) next;
            }
        }
        next = null;
        return (t) next;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStyleTypeKey() {
        return this.styleTypeKey;
    }

    public final y d() {
        Object next;
        y.a aVar = y.f100499b;
        String str = this._type;
        aVar.getClass();
        str.getClass();
        Iterator<T> it = y.f100507j.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((y) next).f100508a, str)) {
                return (y) next;
            }
        }
        next = null;
        return (y) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this._type, wVar._type) && p005kotlin.jvm.internal.s.g(this.styleTypeKey, wVar.styleTypeKey) && p005kotlin.jvm.internal.s.g(this.rows, wVar.rows);
    }

    public final int hashCode() {
        int iHashCode = this._type.hashCode() * 31;
        String str = this.styleTypeKey;
        return this.rows.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this._type;
        String str2 = this.styleTypeKey;
        return z.c(p6.b.i("Template(_type=", str, ", styleTypeKey=", str2, ", rows="), this.rows, ")");
    }

    public /* synthetic */ w(String str, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, list);
    }
}
