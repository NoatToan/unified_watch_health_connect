package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ibs {
    public static List<FitWorkout> d(int i) {
        String strE;
        String strE2;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            strE2 = buh.e("RECOMMEND_WORKOUT_CREATE_TIME_COURSE");
            strE = buh.e("RECOMMEND_WORKOUT_KEY_COURSE");
        } else {
            String strE3 = buh.e("RECOMMEND_WORKOUT_CREATE_TIME_COURSE" + i);
            strE = buh.e("RECOMMEND_WORKOUT_KEY_COURSE" + i);
            strE2 = strE3;
        }
        if (!TextUtils.isEmpty(strE2) && !TextUtils.isEmpty(strE)) {
            long jF = ltb.f() - CommonUtil.i(strE2);
            if (jF > 0 && jF < 86400000) {
                try {
                    return (List) new Gson().fromJson(strE, new TypeToken<List<FitWorkout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.helper.LocalDataUtil$1
                    }.getType());
                } catch (JsonSyntaxException e) {
                    LogUtil.j("LocalDataUtil", "parse RecommendData error ", e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static void d(final List<FitWorkout> list, final int i) {
        if (HandlerExecutor.d()) {
            lsy.a(new Runnable() { // from class: ibs.2
                @Override // java.lang.Runnable
                public void run() {
                    ibs.d(list, i);
                }
            });
            return;
        }
        long jF = ltb.f();
        if (i == 0) {
            buh.d("RECOMMEND_WORKOUT_KEY_COURSE", new Gson().toJson(list));
            buh.d("RECOMMEND_WORKOUT_CREATE_TIME_COURSE", Long.toString(jF));
            return;
        }
        buh.d("RECOMMEND_WORKOUT_KEY_COURSE" + i, new Gson().toJson(list));
        buh.d("RECOMMEND_WORKOUT_CREATE_TIME_COURSE" + i, Long.toString(jF));
    }
}
