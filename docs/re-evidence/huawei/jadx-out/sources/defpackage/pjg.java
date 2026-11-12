package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class pjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45490a = String.valueOf(20006);

    private static void c(String str, String str2) {
        LogUtil.b("OperationCacheUtil", "setStringForSharedPreferences key ", str, " value ", str2);
        lua.f(f45490a, str, str2);
    }

    private static String e(String str) {
        String strE = lua.e(f45490a, str, "");
        LogUtil.b("OperationCacheUtil", "getStringForSharedPreferences key ", str, " json ", strE);
        return strE;
    }

    public static boolean b() {
        return lua.d(f45490a, "FUNCTION_ENTRANCE_INFO_LIST");
    }

    public static void b(List<pjd> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_OperationCacheUtil", "setFunctionEntranceInfoList list ", list);
        } else {
            c("FUNCTION_ENTRANCE_INFO_LIST", HiJsonUtil.d(list));
        }
    }

    public static String c() {
        return e("FUNCTION_ENTRANCE_INFO_LIST");
    }

    public static List<pjd> d() {
        String strE = e("FUNCTION_ENTRANCE_INFO_LIST");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("OperationCacheUtil", "getFunctionEntranceInfoList json ", strE);
            return Collections.EMPTY_LIST;
        }
        return (List) HiJsonUtil.d(strE, new TypeToken<List<pjd>>() { // from class: com.huawei.pluginoperation.util.OperationCacheUtil$1
        }.getType());
    }

    private static pjd d(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_OperationCacheUtil", "getFunctionEntranceInfo functionId ", str);
            return null;
        }
        return d(d(), str);
    }

    private static pjd d(List<pjd> list, String str) {
        if (TextUtils.isEmpty(str) || CollectionUtils.a(list)) {
            LogUtil.e("OperationCacheUtil", "getFunctionEntranceInfo functionId ", str, " list ", list);
            return null;
        }
        for (pjd pjdVar : list) {
            if (pjdVar != null && Objects.equals(str, pjdVar.d())) {
                return pjdVar;
            }
        }
        return null;
    }

    private static boolean c(pjd pjdVar) {
        if (pjdVar != null) {
            return pjdVar.b() == 1;
        }
        ReleaseLogUtil.d("R_OperationCacheUtil", "getFunctionEntranceInfoEnable functionEntranceInfo is null");
        return false;
    }

    public static boolean b(String str) {
        return c(d(str));
    }

    public static boolean c(List<pjd> list, String str) {
        return c(d(list, str));
    }
}
