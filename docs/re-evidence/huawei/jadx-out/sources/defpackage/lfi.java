package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.model.Subscription;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.hihealthkit.model.CloudSubscriber;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lfi {
    public boolean d(List<Subscription> list) {
        SharedPreferenceManager.c("preference_module_kit_subscribe", "subscription", HiJsonUtil.d(list));
        return true;
    }

    public List<Subscription> b() {
        String strB = SharedPreferenceManager.b("preference_module_kit_subscribe", "subscription", "");
        return !TextUtils.isEmpty(strB) ? (List) HiJsonUtil.d(strB, new TypeToken<List<Subscription>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.SubscribeDbHelper$1
        }.getType()) : new ArrayList(10);
    }

    public void c(Long l) {
        SharedPreferenceManager.c("preference_module_kit_subscribe", "lastSyncDate", l.longValue());
    }

    public Long c() {
        return Long.valueOf(SharedPreferenceManager.d("preference_module_kit_subscribe", "lastSyncDate", 0L));
    }

    public void b(List<CloudSubscriber> list) {
        SharedPreferenceManager.c("preference_module_kit_subscribe", "subscriber", HiJsonUtil.d(list));
    }

    public List<CloudSubscriber> d() {
        String strB = SharedPreferenceManager.b("preference_module_kit_subscribe", "subscriber", "");
        return !TextUtils.isEmpty(strB) ? (List) HiJsonUtil.d(strB, new TypeToken<List<CloudSubscriber>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.SubscribeDbHelper$2
        }.getType()) : new ArrayList(10);
    }

    public List<CloudSubscriber> c(String str) {
        ArrayList arrayList = new ArrayList(10);
        for (CloudSubscriber cloudSubscriber : d()) {
            if (cloudSubscriber.getAppId().equals(str)) {
                arrayList.add(cloudSubscriber);
            }
        }
        return arrayList;
    }

    public int e() {
        return SharedPreferenceManager.c("preference_module_kit_subscribe", "lastLoginUser", 0);
    }

    public void c(int i) {
        SharedPreferenceManager.c("preference_module_kit_subscribe", "lastLoginUser", i);
    }

    public void d(String str) {
        SharedPreferenceManager.c("preference_module_kit_subscribe", String.valueOf(kzw.c().i()), str);
    }

    public String a() {
        return SharedPreferenceManager.b("preference_module_kit_subscribe", String.valueOf(kzw.c().i()), "");
    }
}
