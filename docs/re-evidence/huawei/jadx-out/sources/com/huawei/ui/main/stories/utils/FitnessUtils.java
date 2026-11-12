package com.huawei.ui.main.stories.utils;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.iov;
import defpackage.uig;
import health.compact.a.LanguageUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FitnessUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f29073a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29074c;

    public FitnessUtils(Context context) {
        this.f29074c = context;
    }

    public static String b(String str) {
        if ("FitnessStepDetailActivity".equals(str)) {
            return "Step";
        }
        if ("FitnessCalorieDetailActivity".equals(str)) {
            return "Calorie";
        }
        if ("FitnessDistanceDetailActivity".equals(str)) {
            return "Distance";
        }
        if ("FitnessClimbDetailActivity".equals(str)) {
            return "Climb";
        }
        return "";
    }

    public static boolean a(long j, long j2) {
        if (j2 == -1 || j == -1) {
            LogUtil.a("SCUI_FitnessUtils", "isSameDay return false");
            return false;
        }
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String str = simpleDateFormat.format(date);
        String str2 = simpleDateFormat.format(date2);
        LogUtil.a("SCUI_FitnessUtils", "orgString=", str, "cmpString=", str2);
        return str.equals(str2);
    }

    public static List<Double> a(List<uig> list) {
        synchronized (f29073a) {
            ArrayList arrayList = new ArrayList();
            if (list != null && list.size() != 0) {
                arrayList.addAll(list);
                ArrayList arrayList2 = new ArrayList();
                LogUtil.a("SCUI_FitnessUtils", "parseToBarChartData fitness.size() = ", Integer.valueOf(arrayList.size()));
                LogUtil.a("SCUI_FitnessUtils", "parseToBarChartData fitness = ", arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        arrayList2.add(Double.valueOf(((uig) arrayList.get(i)).e()));
                    } else {
                        arrayList2.add(Double.valueOf(0.0d));
                    }
                }
                return arrayList2;
            }
            return null;
        }
    }

    public void d(ImageView... imageViewArr) {
        LogUtil.d("SCUI_FitnessUtils", "setBackground");
        for (ImageView imageView : imageViewArr) {
            if (LanguageUtil.ba(this.f29074c)) {
                LogUtil.d("SCUI_FitnessUtils", "-----------common_ui_arrow_left");
                imageView.setBackgroundResource(R.drawable.common_ui_arrow_left);
            } else {
                LogUtil.d("SCUI_FitnessUtils", "----------arrow_right_normal");
                imageView.setBackgroundResource(R.drawable.common_ui_arrow_right);
            }
        }
    }

    public static int d(int i) {
        int i2;
        LogUtil.d("SCUI_FitnessUtils", "getRegularityScore");
        if (i < 30) {
            i2 = 100 - ((i * 2) / 3);
        } else {
            i2 = i < 190 ? 95 - (i / 2) : 0;
        }
        LogUtil.d("SCUI_FitnessUtils", "score = " + i2);
        return i2;
    }

    public static void b(Context context, Class<?> cls, long j) {
        if (context == null) {
            return;
        }
        if (j <= 0) {
            j = 0;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("key_bundle_health_last_data_time", j);
        iov.d(context, intent);
    }
}
