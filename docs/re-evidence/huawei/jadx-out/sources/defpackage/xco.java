package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xco {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, xco> f52704c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<Long> f52705a;
    private String e;

    public static xco a(String str) {
        xco xcoVar;
        if (f52704c.get(str) == null) {
            synchronized (xco.class) {
                if (f52704c.get(str) == null) {
                    f52704c.put(str, new xco(str));
                }
                xcoVar = f52704c.get(str);
            }
            return xcoVar;
        }
        return f52704c.get(str);
    }

    private xco(String str) {
        this.e = str;
    }

    public boolean b(HiHealthData hiHealthData) {
        return this.f52705a.contains(Long.valueOf(hiHealthData.getStartTime()));
    }

    public void d() {
        String value;
        if (this.f52705a != null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference(this.e);
        if (userPreference == null) {
            value = "";
        } else {
            value = userPreference.getValue();
        }
        if (TextUtils.isEmpty(value)) {
            this.f52705a = new HashSet<>();
        } else {
            d(value);
        }
    }

    private void d(String str) {
        try {
            Type type = new TypeToken<HashSet<Long>>(this) { // from class: com.huawei.ui.thirdpartservice.syncdata.util.SynchronizedDataTool$1
            }.getType();
            Gson gson = new Gson();
            LogUtil.d("SynchronizedDataTool", this.e, " :", str);
            HashSet<Long> hashSet = (HashSet) gson.fromJson(str, type);
            this.f52705a = hashSet;
            if (hashSet == null) {
                this.f52705a = new HashSet<>();
            }
        } catch (JsonSyntaxException unused) {
            this.f52705a = new HashSet<>();
        }
    }

    public void a(long j) {
        LogUtil.d("SynchronizedDataTool", "updateSyncTime ", this.e, " :", Long.valueOf(j));
        HashSet<Long> hashSet = this.f52705a;
        if (hashSet == null) {
            return;
        }
        hashSet.add(Long.valueOf(j));
        HiHealthManager.d(BaseApplication.b()).setUserPreference(new HiUserPreference(this.e, new Gson().toJson(this.f52705a)));
    }

    public void a() {
        f52704c.remove(this.e);
    }
}
