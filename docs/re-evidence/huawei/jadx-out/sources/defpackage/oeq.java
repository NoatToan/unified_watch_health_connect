package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class oeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Gson f44239a = new GsonBuilder().create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f44240b;
    private final byte[] d;
    private int e;

    public oeq() {
        this.f44240b = null;
        this.d = null;
        this.e = 0;
    }

    public oeq(Map<String, List<String>> map, byte[] bArr) {
        this.f44240b = map;
        this.d = bArr;
    }

    public oeq(Map<String, List<String>> map, byte[] bArr, int i) {
        this.f44240b = map;
        this.d = bArr;
        this.e = i;
    }

    public int b() {
        return this.e;
    }

    public byte[] a() {
        return this.d;
    }

    public String e() {
        Map<String, List<String>> map = this.f44240b;
        if (map == null || map.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : this.f44240b.entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                if (value.size() == 1) {
                    linkedHashMap.put(entry.getKey(), value.get(0));
                } else {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        return f44239a.toJson(linkedHashMap);
    }

    public String toString() {
        return "ApiResponse{headers=" + this.f44240b + ", body=" + this.d + '}';
    }
}
