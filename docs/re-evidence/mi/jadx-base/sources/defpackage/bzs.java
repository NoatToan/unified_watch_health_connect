package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class bzs {
    public static HashMap<String, ArrayList<Cif>> a(Context context, List<Cif> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<Cif>> map = new HashMap<>();
        for (Cif cif : list) {
            b(context, cif);
            ArrayList<Cif> arrayList = map.get(cif.c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(cif.c(), arrayList);
            }
            arrayList.add(cif);
        }
        return map;
    }

    public static void b(Context context, Cif cif) {
        if (cif.f100a) {
            cif.a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(cif.d())) {
            cif.f(jfs.b());
        }
        cif.b(System.currentTimeMillis());
        if (TextUtils.isEmpty(cif.e())) {
            cif.e(context.getPackageName());
        }
        if (TextUtils.isEmpty(cif.c())) {
            cif.e(cif.e());
        }
    }

    public static void c(Context context, rzs rzsVar, HashMap<String, ArrayList<Cif>> map) {
        for (Map.Entry<String, ArrayList<Cif>> entry : map.entrySet()) {
            try {
                ArrayList<Cif> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    rzsVar.a(value, value.get(0).e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Context context, rzs rzsVar, List<Cif> list) {
        HashMap<String, ArrayList<Cif>> mapA = a(context, list);
        if (mapA != null && mapA.size() != 0) {
            c(context, rzsVar, mapA);
            return;
        }
        x9s.o("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }
}
