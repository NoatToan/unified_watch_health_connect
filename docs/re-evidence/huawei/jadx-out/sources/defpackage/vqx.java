package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vqx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51496b = Color.argb(153, 0, 0, 0);
    private static final int e = Color.argb(153, 255, 255, 255);

    public static String e(vre vreVar) {
        if (vreVar == null) {
            LogUtil.j("SportMotionStringUtils", "itemData is null ");
            return "";
        }
        if (vreVar.b() == 0) {
            return "";
        }
        return BaseApplication.getContext().getResources().getString(vreVar.b());
    }

    public static int c(String str) {
        int iD = !TextUtils.isEmpty(str) ? jby.d(str, BaseApplication.getContext()) : 0;
        LogUtil.a("SportMotionStringUtils", "sportTypeRes:", str, "sportTypeNameId:", Integer.valueOf(iD));
        return iD;
    }

    public static Drawable e(Drawable drawable, int i) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return qqf.c(qqz.e(BaseApplication.getContext(), drawable), i);
        }
        return qqf.c(drawable, i);
    }

    public static void b(int i) {
        List arrayList;
        boolean zE;
        try {
            arrayList = (List) new Gson().fromJson(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20002), "recentlyAdded"), new TypeToken<List<Integer>>() { // from class: com.huawei.ui.main.stories.history.model.SportMotionStringUtils$1
            }.getType());
            try {
                zE = e((List<Integer>) arrayList, i);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("SportMotionStringUtils", "updateSportTypeId jsonSyntaxException ");
                zE = true;
            }
        } catch (JsonSyntaxException unused2) {
            arrayList = null;
        }
        if (arrayList == null) {
            LogUtil.j("SportMotionStringUtils", "sportTypeIdList is null");
            arrayList = new ArrayList();
        }
        if (zE) {
            LogUtil.a("SportMotionStringUtils", "add sportTypeId:", Integer.valueOf(i));
            arrayList.add(0, Integer.valueOf(i));
            if (arrayList.size() > 6) {
                LogUtil.a("SportMotionStringUtils", "sportTypeId enter remove");
                arrayList.remove(6);
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20002), "recentlyAdded", new Gson().toJson(arrayList), new StorageParams());
            return;
        }
        LogUtil.a("SportMotionStringUtils", "sportTypeId is already added");
    }

    private static boolean e(List<Integer> list, int i) {
        if (coq.d(list)) {
            LogUtil.j("SportMotionStringUtils", "handleSportTypeIdList sportTypeIdList is null");
            return true;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return false;
            }
        }
        return true;
    }

    public static List<vre> e(int i, String str) {
        List list;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportMotionStringUtils", "sportGroupTypeId is null");
            return arrayList;
        }
        try {
            list = (List) new Gson().fromJson(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20002), "recentlyAdded"), new TypeToken<List<Integer>>() { // from class: com.huawei.ui.main.stories.history.model.SportMotionStringUtils$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("SportMotionStringUtils", "getSportTypeIdList jsonSyntaxException");
            list = null;
        }
        if (coq.d(list)) {
            LogUtil.j("SportMotionStringUtils", "sportTypeIds is null");
            return arrayList;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            HwSportTypeInfo hwSportTypeInfoB = jry.a(BaseApplication.getContext()).b(((Integer) list.get(i2)).intValue());
            vre vreVar = new vre();
            vreVar.c("recentlyAdded");
            vreVar.a(hwSportTypeInfoB.getSportTypeId());
            vreVar.d(hwSportTypeInfoB.getMet());
            vreVar.c(hwSportTypeInfoB.getSportTypeId() == i && str.equals("recentlyAdded"));
            vreVar.c(c(hwSportTypeInfoB.getSportTypeRes()));
            vreVar.a(hwSportTypeInfoB.getHistoryList().getItemImg());
            vreVar.a(hwSportTypeInfoB.getHistoryList().getItemDrawable());
            vreVar.b(jqq.d(hwSportTypeInfoB.getSportTypeId()));
            arrayList.add(vreVar);
        }
        return arrayList;
    }

    public static int d() {
        if (qqs.e(BaseApplication.getContext())) {
            return e;
        }
        return f51496b;
    }

    public static Drawable c(Drawable drawable, int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    public static boolean e(int i) {
        return Arrays.asList(263, 286, 287, 288, 289, 283, 512, 0, Integer.valueOf(a.z), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT), 10001, 290, Integer.valueOf(ComponentInfo.PluginPay_A_N), 222, 226, 227, 228, 229, 230, 231, 232, 233).contains(Integer.valueOf(i));
    }
}
