package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class jxk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Pair<Boolean, Boolean> f39164c = new Pair<>(false, false);
    public static Pair<Boolean, Boolean> e = new Pair<>(true, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Pair<Boolean, Boolean> f39163b = new Pair<>(false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pair<Boolean, Boolean> f39162a = new Pair<>(false, false);

    public static boolean a(int i) {
        return i == 259;
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("duration", UnitUtil.e(Math.round(0.0f)));
        bundle.putString("distance", qre.f(R.string.IDS_motiontrack_targetvalue_defult));
        return bundle;
    }

    public static String d(int i, float f) {
        if (i == -1) {
            return "";
        }
        if (i == 0) {
            double d = f / 60.0f;
            return qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_min_2, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(d, 1, 0));
        }
        if (i != 1) {
            if (i == 2) {
                double d2 = f / 1000.0f;
                return qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_kcal, UnitUtil.b(d2, Locale.getDefault()), UnitUtil.e(d2, 1, 0));
            }
            return "";
        }
        if (UnitUtil.f()) {
            double dE = (float) UnitUtil.e(f, 3);
            return qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_en, UnitUtil.b(dE, Locale.getDefault()), UnitUtil.e(dE, 1, 2));
        }
        return c(f);
    }

    private static int e(float f) {
        int length = (Float.toString(Math.abs(f)).length() - Integer.toString(Math.abs(Math.round(f))).length()) - 1;
        LogUtil.a("Track_SportingUtils", "getNumberOfDigits is ", Integer.valueOf(length));
        return length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    private static String c(float f) {
        double d = f;
        int i = 4;
        if (Math.abs(d - 21.0975d) >= 1.0E-6d) {
            if (Math.abs(d - 42.195d) < 1.0E-6d) {
                i = 3;
            } else if (e(f) < 4) {
                if (e(f) == 3) {
                    i = 3;
                } else {
                    LogUtil.d("Track_SportingUtils", "Distance is normal");
                    i = 2;
                }
            }
        }
        return qre.e(R.plurals.IDS_hwh_motiontrack_start_track_sport_km, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(d, 1, i));
    }

    public static int b() {
        return lua.b(Integer.toString(20002), "sport_dark_mode", 2);
    }

    public static void e(int i) {
        lua.c(Integer.toString(20002), "sport_dark_mode", i);
    }

    public static boolean b(int i, int i2) {
        return lua.a(Integer.toString(20002), e("sport_show_heart_rate_area", i, i2), true);
    }

    public static void d(boolean z, int i, int i2) {
        lua.d(Integer.toString(20002), e("sport_show_heart_rate_area", i, i2), z);
    }

    public static boolean d(int i, int i2) {
        return lua.a(Integer.toString(20002), e("sport_show_power_area", i, i2), true);
    }

    public static void e(boolean z, int i, int i2) {
        lua.d(Integer.toString(20002), e("sport_show_power_area", i, i2), z);
    }

    private static String e(String str, int i, int i2) {
        if (i2 == 100) {
            return str + "_" + i + "_" + i2;
        }
        return str + "_" + i;
    }

    public static Typeface d() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/Harmony-Heavy.ttf");
    }

    public static void e(Context context, View view, int i) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(qre.e(context, i));
    }

    public static void c(Context context, View view, int i) {
        if (view == null) {
            return;
        }
        view.setBackground(qre.d(context, i));
    }

    public static void b(Context context, View view, int i) {
        c(context, view, i);
        e(context, view);
    }

    public static void b(Context context, ImageView imageView, int i) {
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(qre.d(context, i));
    }

    public static void d(Context context, ImageView imageView, int i) {
        b(context, imageView, i);
        e(context, imageView);
    }

    public static void e(Context context, HealthTextView healthTextView, int i) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTextColor(qre.e(context, i));
    }

    public static void a(Context context, HealthTextView healthTextView, int i) {
        e(context, healthTextView, i);
        e(context, healthTextView);
    }

    private static void e(Context context, View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.setAlpha(qqs.e(context) ? 0.0f : 0.6f);
        view.animate().alpha(1.0f).setDuration(1000L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public static void a(final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("Track_SportingUtils", "callback is null in getCycleAutoPauseSwitchStatus");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200038");
        qhq.b("9002", arrayList, new HiDataReadResultListener() { // from class: jxk.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.d("Track_SportingUtils", "getAutoSwitch isListTypeMatch false ");
                    responseCallback.onResponse(-1, true);
                } else {
                    jxk.d((List<HiSampleConfig>) obj, (ResponseCallback<Boolean>) responseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<HiSampleConfig> list, ResponseCallback<Boolean> responseCallback) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("Track_SportingUtils", "getAutoSwitch list is empty ");
            responseCallback.onResponse(-1, true);
            return;
        }
        Iterator<HiSampleConfig> it = list.iterator();
        if (it.hasNext()) {
            HiSampleConfig next = it.next();
            if (next == null) {
                ReleaseLogUtil.b("Track_SportingUtils", "hiSampleConfig is null ");
                responseCallback.onResponse(-1, true);
                return;
            }
            String configData = next.getConfigData();
            if (TextUtils.isEmpty(configData)) {
                ReleaseLogUtil.b("Track_SportingUtils", "configData is null ");
                responseCallback.onResponse(-1, true);
                return;
            }
            jbf jbfVar = (jbf) HiJsonUtil.d(configData, jbf.class);
            if (jbfVar == null) {
                ReleaseLogUtil.b("Track_SportingUtils", "switchInfo is null ");
                responseCallback.onResponse(-1, true);
            } else {
                responseCallback.onResponse(0, Boolean.valueOf(jbfVar.a()));
            }
        }
    }

    public static boolean e(TrackMainFragmentShowType trackMainFragmentShowType) {
        return TrackMainFragmentShowType.POWER.equals(trackMainFragmentShowType) || TrackMainFragmentShowType.CADENCE.equals(trackMainFragmentShowType) || TrackMainFragmentShowType.SLOPE.equals(trackMainFragmentShowType);
    }

    public static boolean c(TrackMainFragmentShowType trackMainFragmentShowType) {
        return TrackMainFragmentShowType.POWER.equals(trackMainFragmentShowType);
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT <= 28) {
            return false;
        }
        return lro.d(BaseApplication.getContext());
    }

    public static void b(Context context, String str) {
        if (context == null) {
            LogUtil.a("Track_SportingUtils", "mContext is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.c("Track_SportingUtils", "mTwoStepsRoadDeeplink is empty");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setFlags(268435456);
            iov.d(context, intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_SportingUtils", "queryBankIssuerInfoCallback ActivityNotFoundException");
        }
    }

    public static void b(HealthTextView healthTextView, HealthTextView healthTextView2, double d, int i) {
        String strF;
        String strF2;
        String strF3;
        String strB;
        if (jpq.g(i)) {
            if (CommonUtil.b(d)) {
                strB = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strB = UnitUtil.c(d, 1, 0, false);
            }
            strF3 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
        } else if (i != 266 && i != 262) {
            if (CommonUtil.b(d)) {
                strB = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strB = jpq.b(d);
            }
            if (UnitUtil.f()) {
                strF3 = qre.f(R.string.IDS_motiontrack_show_sport_unit_mi);
            } else {
                strF3 = qre.f(R.string.IDS_motiontrack_show_sport_unit_km);
            }
        } else {
            if (CommonUtil.b(d)) {
                strF = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strF = jpq.f((float) d);
            }
            if (UnitUtil.f()) {
                strF2 = qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(UnitUtil.e(d, 2)), new Object[0]);
            } else {
                strF2 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
            }
            strF3 = strF2;
            strB = strF;
        }
        if (healthTextView != null) {
            healthTextView.setText(strB);
        }
        if (healthTextView2 != null) {
            healthTextView2.setText(strF3);
        }
    }
}
