package com.huami.watch.companion.account;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class CountryManager {
    private static final String a = "CountryManager";
    private static Map<String, Country> b = new LinkedHashMap();

    public class a extends TypeToken<ArrayList<Country>> {
    }

    private static void a(@NonNull ArrayList<Country> arrayList) {
        b.clear();
        for (Country country : arrayList) {
            b.put(country.getCode(), country);
        }
    }

    private static void b(@NonNull Context context) {
        if (b.isEmpty()) {
            try {
                ArrayList arrayList = (ArrayList) new Gson().fromJson(new InputStreamReader(context.getResources().getAssets().open("country.json")), new a().getType());
                if (ArraysUtil.isEmpty(arrayList)) {
                    b.clear();
                } else {
                    a(arrayList);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("init user country ");
                sb.append(!ArraysUtil.isEmpty(arrayList));
                Log.d(a, sb.toString(), new Object[0]);
            } catch (Exception e) {
                Log.e(a, "init country list error", e, new Object[0]);
                b.clear();
            }
        }
    }

    public static Country get(@NonNull Context context, String str) {
        b(context);
        Country country = b.containsKey(str) ? b.get(str) : null;
        Log.d(a, "get country info by code:%s result:%s", str, country);
        return country;
    }

    public static List<Country> getAll(@NonNull Context context) {
        b(context);
        return new ArrayList(b.values());
    }
}
