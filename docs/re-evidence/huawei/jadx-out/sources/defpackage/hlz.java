package defpackage;

import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hlz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("negativeStretchedMap")
    private Map<String, Integer> f36887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("positiveStretchedMap")
    private Map<String, Integer> f36888b;

    public SparseArray<Integer> e() {
        return b(this.f36888b);
    }

    public SparseArray<Integer> c() {
        return b(this.f36887a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("MuscleStretchingBean{positiveStretchedMap=");
        stringBuffer.append(this.f36888b);
        stringBuffer.append(", negativeStretchedMap=").append(this.f36887a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private SparseArray<Integer> b(Map<String, Integer> map) {
        if (map == null) {
            return new SparseArray<>(0);
        }
        SparseArray<Integer> sparseArray = new SparseArray<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sparseArray.put(qrs.a(entry.getKey()), entry.getValue());
        }
        return sparseArray;
    }
}
