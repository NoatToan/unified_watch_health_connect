package defpackage;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class tat {
    public static void b(Context context, String str) {
        List<String> listA = a(context);
        listA.remove(str);
        listA.add(0, str);
        while (listA.size() > 0 && listA.size() > 10) {
            listA.remove(listA.size() - 1);
        }
        e(context, listA);
    }

    public static List<String> a(Context context) {
        List arrayList = (List) nlu.c(SharedPreferenceManager.e(context, String.valueOf(12000), "recent_search"), new TypeToken<List<String>>() { // from class: com.huawei.ui.homehealth.search.utils.SharedPreferenceUtil$1
        }.getType());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static void e(Context context, List<String> list) {
        SharedPreferenceManager.e(context, String.valueOf(12000), "recent_search", nlu.b(list, new TypeToken<List<String>>() { // from class: com.huawei.ui.homehealth.search.utils.SharedPreferenceUtil$2
        }.getType()), new StorageParams());
    }

    public static List<String> b(List<String> list) {
        if (list == null) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
