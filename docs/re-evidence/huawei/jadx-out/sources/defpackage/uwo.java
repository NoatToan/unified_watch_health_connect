package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uwo {
    public static void e(List<dnb> list) {
        c(list, "CACHE_LAST_WEIGHT");
    }

    public static <T> void c(List<T> list, String str) {
        Context contextB = BaseApplication.b();
        String strA = a(contextB);
        SharedPreferenceManager.e(contextB, "day_weight_cache", str + strA, HiJsonUtil.d(list), null);
    }

    public static ArrayList<dnb> a() {
        return e(a("CACHE_LAST_WEIGHT", new TypeToken<List<dnb>>() { // from class: com.huawei.ui.main.stories.health.interactors.healthdata.WeightDataCache$1
        }.getType()), MultiUsersManager.INSTANCE.getCurrentUser());
    }

    private static <T> ArrayList<T> a(String str, Type type) {
        ArrayList<T> arrayList;
        Context contextB = BaseApplication.b();
        String strE = SharedPreferenceManager.e(contextB, "day_weight_cache", str + a(contextB));
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("WeightDataCache", "start load data animal");
            return new ArrayList<>();
        }
        try {
            arrayList = (ArrayList) HiJsonUtil.d(strE, type);
        } catch (JsonIOException | JsonSyntaxException | IllegalStateException | NumberFormatException e) {
            LogUtil.e("WeightDataCache", "getCacheData catch all Exception ", LogAnonymous.b(e));
            arrayList = null;
        }
        if (!njy.e(arrayList)) {
            return arrayList;
        }
        LogUtil.a("WeightDataCache", "getCacheData error");
        return new ArrayList<>();
    }

    private static ArrayList<dnb> e(ArrayList<dnb> arrayList, dnj dnjVar) {
        ArrayList<dnb> arrayList2 = new ArrayList<>();
        Iterator<dnb> it = arrayList.iterator();
        while (it.hasNext()) {
            dnb dnbVarA = vei.a(it.next(), Utils.o(), dnjVar);
            if (dnbVarA != null) {
                arrayList2.add(dnbVarA);
            }
        }
        return arrayList2;
    }

    public static <T> boolean a(List<T> list, List<T> list2) {
        if (list.size() == 0) {
            return true;
        }
        return !HiJsonUtil.d(list).equals(HiJsonUtil.d(list2));
    }

    private static String a(Context context) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            return SecurityUtils.c(accountInfo);
        }
        return "";
    }
}
