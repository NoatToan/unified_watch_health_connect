package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class gzx {
    public static String a(List<Attribute> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (njy.b(list)) {
            for (Attribute attribute : list) {
                if (attribute != null) {
                    stringBuffer = stringBuffer.append(attribute.getName().concat(","));
                }
            }
            return stringBuffer.substring(0, stringBuffer.length() - 1);
        }
        return "";
    }

    public static String d(List<Attribute> list) {
        String string = "";
        if (njy.e(list)) {
            return "";
        }
        int i = 0;
        for (Attribute attribute : list) {
            i++;
            if (attribute != null) {
                if (i < list.size()) {
                    string = BaseApplication.getContext().getString(R.string.sug_coach_training_point_content, attribute.getName(), string);
                } else {
                    string = BaseApplication.getContext().getString(R.string.IDS_sug_min_sec, string, attribute.getName());
                }
            }
        }
        return string;
    }

    public static String c(Context context, int i) {
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getDifficulty context == null");
            return "";
        }
        if (i == 2) {
            return context.getResources().getString(R.string.sug_weight_advanced);
        }
        if (i == 1) {
            return context.getResources().getString(R.string.sug_weight_intermediate);
        }
        return context.getResources().getString(R.string.sug_weight_beginner);
    }

    public static String c(Context context, int i, Object... objArr) {
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getString context == null");
            return "";
        }
        return String.format(context.getApplicationContext().getResources().getString(i), objArr);
    }

    public static String d(int i, int i2, Object... objArr) {
        return BaseApplication.getContext().getResources().getQuantityString(i, i2, objArr);
    }

    public static String e(List<Attribute> list) {
        if (njy.b(list)) {
            StringBuffer stringBuffer = new StringBuffer();
            for (Attribute attribute : list) {
                if (attribute != null && attribute.getName() != null) {
                    stringBuffer = stringBuffer.append(attribute.getName().concat(","));
                }
            }
            return stringBuffer.substring(0, stringBuffer.length() - 1);
        }
        return "";
    }

    public static String c(List<Classify> list) {
        if (njy.b(list)) {
            StringBuffer stringBuffer = new StringBuffer();
            for (Classify classify : list) {
                if (classify != null && classify.getClassifyName() != null) {
                    stringBuffer = stringBuffer.append(classify.getClassifyName().concat(","));
                }
            }
            return stringBuffer.substring(0, stringBuffer.length() - 1);
        }
        return "";
    }

    public static SpannableString e(Context context, String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_FitnessHelper", "getSpannableString, originMessage is empty.");
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getSpannableString, context is null.");
            return spannableString;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            spannableString.setSpan(new pcm(context, i), matcher.start(), matcher.end(), 33);
        }
        return spannableString;
    }

    public static SpannableString e(Context context, SpannableString spannableString, String str, int i) {
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getSpannableString context == null");
            return spannableString;
        }
        Matcher matcher = Pattern.compile(str).matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new pcm(context, i), matcher.start(), matcher.end(), 33);
        }
        return spannableString;
    }

    public static SpannableString c(Context context, String str, String str2, int i, int i2) {
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getSpannableString context == null");
            return null;
        }
        return UnitUtil.b(context, str, str2, i, i2);
    }

    public static String b(Context context, int i, int i2, int i3) {
        if (context == null) {
            LogUtil.j("Suggestion_FitnessHelper", "getTimesMsg context == null");
            return "";
        }
        if (i3 == 0) {
            return c(context, R.string.sug_myplan_0daymsg, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
        }
        if (i3 == 1) {
            return c(context, R.string.sug_myplan_0runmsg, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
        }
        return c(context, R.string.sug_myplan_0trainmsg, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
    }

    public static Bitmap e(View view) {
        Bitmap bitmapCreateBitmap;
        if (view == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout((int) view.getX(), (int) view.getY(), ((int) view.getX()) + view.getMeasuredWidth(), ((int) view.getY()) + view.getMeasuredHeight());
        if (view.getDrawingCache() == null) {
            bitmapCreateBitmap = null;
        } else if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache(), 0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        }
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    public static boolean e(Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static int c(float f) {
        if (f < 1.0f) {
            return 1;
        }
        return (((int) (f + 2.0f)) / 2) * 2;
    }

    public static int b(float f) {
        return (((int) (f + 1.0f)) / 2) * 2;
    }

    public static List<FitWorkout> b(List<FitWorkout> list, int i, int i2, int i3) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessHelper", "getRecommendWorkoutsLimit CollectionUtils.isEmpty(workouts)");
            return null;
        }
        int size = list.size();
        LogUtil.d("Suggestion_FitnessHelper", "getRecommendWorkoutsLimit----", Integer.valueOf(i3), "---", Integer.valueOf(size), "---", Integer.valueOf(i), "---", Integer.valueOf(i2));
        int i4 = (int) (i3 * 0.2f);
        if (i4 < 8) {
            i4 = size < 8 ? size : 8;
        }
        if (i4 <= i) {
            return null;
        }
        int i5 = i4 - i;
        LogUtil.d("Suggestion_FitnessHelper", "getRecommendWorkoutsLimit last----", Integer.valueOf(i5), "---", Integer.valueOf(size), "---", Integer.valueOf(i), "---", Integer.valueOf(i2));
        return size <= i5 ? list : list.subList(0, i5);
    }

    public static String b(double d) {
        if (d < 60.0d) {
            return d(R.plurals.IDS_second_single_unit, (int) d, UnitUtil.e(d, 1, 0));
        }
        if (d < 3600.0d) {
            int i = (int) d;
            int i2 = i % 60;
            int i3 = i / 60;
            String strD = d(R.plurals.IDS_min_single_unit, i3, UnitUtil.e(i3, 1, 0));
            String strD2 = d(R.plurals.IDS_second_single_unit, i2, UnitUtil.e(i2, 1, 0));
            if (i2 == 0) {
                strD = d(R.plurals.sug_fitness_train_minutes, i3, Integer.valueOf(i3));
                strD2 = "";
            }
            return c(BaseApplication.getContext(), R.string.IDS_indoor_skipper_minute_and_second, strD, strD2);
        }
        boolean zB = CommonUtil.b(d % 3600.0d);
        double d2 = d / 3600.0d;
        return d(R.plurals.IDS_hour_unit, (int) d2, UnitUtil.e(d2, 1, !zB ? 1 : 0));
    }
}
