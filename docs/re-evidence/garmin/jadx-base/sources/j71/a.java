package j71;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o61.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lj71/a;", "", "", "userId", "", "_fromCalendarDate", "_toCalendarDate", "", "recordedDevices", "", "showSelector", "", "Lo61/n;", "reportData", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)V", "a", "I", "getUserId", "()I", "b", "Ljava/lang/String;", "c", "d", "Ljava/util/List;", "getRecordedDevices", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "f", "Ljava/util/Map;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final int userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fromCalendarDate")
    private final String _fromCalendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("toCalendarDate")
    private final String _toCalendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recordedDevices")
    private final List<Object> recordedDevices;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showSelector")
    private final Boolean showSelector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportData")
    private final Map<String, List<n>> reportData;

    /* JADX INFO: renamed from: j71.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1862a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((n) t7).getTimestamp()), Long.valueOf(((n) t14).getTimestamp()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i14, String str, String str2, List<Object> list, Boolean bool, Map<String, ? extends List<n>> map) {
        map.getClass();
        this.userId = i14;
        this._fromCalendarDate = str;
        this._toCalendarDate = str2;
        this.recordedDevices = list;
        this.showSelector = bool;
        this.reportData = map;
    }

    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.reportData.entrySet().iterator();
        while (it.hasNext()) {
            List<n> list = this.reportData.get(((Map.Entry) it.next()).getKey());
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((n) obj).j()) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(new ArrayList(arrayList2));
            }
        }
        return h0.N0(arrayList, new C1862a());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getShowSelector() {
        return this.showSelector;
    }

    public final List<n> c(String str) {
        List<n> list = this.reportData.get(str);
        return list == null ? j0.f134944a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.userId == aVar.userId && s.g(this._fromCalendarDate, aVar._fromCalendarDate) && s.g(this._toCalendarDate, aVar._toCalendarDate) && s.g(this.recordedDevices, aVar.recordedDevices) && s.g(this.showSelector, aVar.showSelector) && s.g(this.reportData, aVar.reportData);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.userId) * 31;
        String str = this._fromCalendarDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._toCalendarDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Object> list = this.recordedDevices;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showSelector;
        return this.reportData.hashCode() + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i14 = this.userId;
        String str = this._fromCalendarDate;
        String str2 = this._toCalendarDate;
        List<Object> list = this.recordedDevices;
        Boolean bool = this.showSelector;
        Map<String, List<n>> map = this.reportData;
        StringBuilder sbR = g.r(i14, "TrainingStatusDTO(userId=", ", _fromCalendarDate=", str, ", _toCalendarDate=");
        e0.o(str2, ", recordedDevices=", ", showSelector=", sbR, list);
        sbR.append(bool);
        sbR.append(", reportData=");
        sbR.append(map);
        sbR.append(")");
        return sbR.toString();
    }
}
