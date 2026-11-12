package defpackage;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class odg extends uzo {
    public odg(Map<String, Object> map) {
        super(map);
    }

    public static odg f() {
        return new odg(new ArrayMap());
    }

    public static odg g(uzo uzoVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : uzoVar.d()) {
            arrayMap.put(str, uzoVar.c(str));
        }
        return new odg(arrayMap);
    }

    public void e(uzo uzoVar) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f36329a;
        if (map2 == null || (map = uzoVar.f36329a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void h(String str, Object obj) {
        this.f36329a.put(str, obj);
    }
}
