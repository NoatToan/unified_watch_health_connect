package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qep {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private List<qer> f46067b;

    @SerializedName("healthLifeConfs")
    private List<qes> d;

    public long d() {
        if (njy.e(this.d)) {
            return System.currentTimeMillis();
        }
        return this.d.get(0).d();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[RETURN] */
    public Map<String, Integer> a() {
        Map<String, Integer> mapA;
        if (njy.e(this.f46067b)) {
            return new HashMap();
        }
        for (qer qerVar : this.f46067b) {
            if (qerVar != null && (mapA = qerVar.a()) != null) {
                if (mapA == null) {
                    return new HashMap();
                }
                return mapA;
            }
        }
        mapA = null;
        if (mapA == null) {
            return new HashMap();
        }
        return mapA;
    }

    public void a(Map<String, Integer> map) {
        if (njy.e(this.f46067b)) {
            return;
        }
        for (qer qerVar : this.f46067b) {
            if (qerVar != null) {
                qerVar.a(map);
                return;
            }
        }
    }

    public String toString() {
        return "MetaDataResp{healthLifeConfs=" + this.d + ", mStatusInfoList=" + this.f46067b + '}';
    }

    public List<qes> c() {
        return this.d;
    }

    public void d(List<qer> list) {
        this.f46067b = list;
    }
}
