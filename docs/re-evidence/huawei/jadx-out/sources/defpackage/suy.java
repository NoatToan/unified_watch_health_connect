package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class suy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static suy f48719c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48720a = BaseApplication.getContext();

    private suy() {
    }

    public static suy b() {
        suy suyVar;
        synchronized (suy.class) {
            if (f48719c == null) {
                f48719c = new suy();
            }
            suyVar = f48719c;
        }
        return suyVar;
    }

    public void a(List<String> list) {
        if (list == null) {
            LogUtil.a("QuickEntryCacheManager", "saveQuickEntryCache entryIds is empty");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("uniqueIds", jsonArray);
        String string = jsonObject.toString();
        lua.a("quick_entry", "quickEntrySelectedIds", string);
        LogUtil.a("QuickEntryCacheManager", "saveQuickEntryCache success, data: " + string);
    }

    public List<String> e() {
        String strH = lua.h("quick_entry", "quickEntrySelectedIds");
        if (TextUtils.isEmpty(strH)) {
            LogUtil.a("QuickEntryCacheManager", "readQuickEntryCache cache is empty");
            return null;
        }
        try {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(strH, JsonObject.class);
            if (jsonObject != null && jsonObject.has("uniqueIds")) {
                JsonArray asJsonArray = jsonObject.getAsJsonArray("uniqueIds");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    arrayList.add(asJsonArray.get(i).getAsString());
                }
                LogUtil.a("QuickEntryCacheManager", "readQuickEntryCache success, size: " + arrayList.size());
                return arrayList;
            }
        } catch (Exception e) {
            LogUtil.e("QuickEntryCacheManager", "readQuickEntryCache parse error: " + e.getMessage());
        }
        LogUtil.a("QuickEntryCacheManager", "readQuickEntryCache cache is empty or invalid");
        return null;
    }

    public void d(boolean z) {
        lua.a("quick_entry", "has_preset_entries", String.valueOf(z));
        if (z) {
            lua.a("quick_entry", "preset_time", String.valueOf(System.currentTimeMillis()));
        }
        LogUtil.a("QuickEntryCacheManager", "setHasPresetEntries: " + z);
    }

    public boolean d() {
        return lua.a("quick_entry", "isEditQuickEntry", false);
    }

    public void e(boolean z) {
        lua.d("quick_entry", "isEditQuickEntry", z);
        LogUtil.a("QuickEntryCacheManager", "setHasEditedEntries: " + z);
    }
}
