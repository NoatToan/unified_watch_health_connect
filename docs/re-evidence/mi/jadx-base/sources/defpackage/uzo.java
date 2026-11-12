package defpackage;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class uzo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uzo f36328b = new uzo(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f36329a;

    public uzo(Map<String, Object> map) {
        this.f36329a = map;
    }

    public static uzo a() {
        return f36328b;
    }

    public static uzo b(uzo uzoVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : uzoVar.d()) {
            arrayMap.put(str, uzoVar.c(str));
        }
        return new uzo(arrayMap);
    }

    public Object c(String str) {
        return this.f36329a.get(str);
    }

    public Set<String> d() {
        return this.f36329a.keySet();
    }
}
