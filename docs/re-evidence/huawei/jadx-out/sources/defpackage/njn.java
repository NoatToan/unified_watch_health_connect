package defpackage;

import com.google.gson.annotations.SerializedName;
import health.compact.a.CommonUtils;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class njn implements Serializable {
    private static final long serialVersionUID = 6258534691956492071L;

    @SerializedName("mMap")
    private LinkedHashMap<String, String> d = new LinkedHashMap<>();

    @SerializedName("mTimestamp")
    private long e;

    public njn(String[] strArr) {
        if (strArr.length < 3) {
            return;
        }
        this.e = CommonUtils.i(strArr[1].split("=")[1]);
        for (int i = 2; i < strArr.length; i++) {
            this.d.put(strArr[i].split("=")[0], strArr[i].split("=")[1]);
        }
    }

    public String toString() {
        return "tp=ext;k=" + this.e + ";" + ((CharSequence) e()) + System.lineSeparator();
    }

    private StringBuilder e() {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<String, String> linkedHashMap = this.d;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
            }
        }
        return sb;
    }
}
