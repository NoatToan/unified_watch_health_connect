package defpackage;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class jho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<String> f38636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseArray<String> f38637b;
    private static final jre e = new jre(0.0f, 0.2f, 0.2f, 1.0f);

    public static boolean b() {
        return true;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f38637b = sparseArray;
        sparseArray.put(1, "map_type_key");
        f38637b.put(2, "google_map_type_key");
        f38637b.put(3, "huawei_map_type_key");
        SparseArray<String> sparseArray2 = new SparseArray<>();
        f38636a = sparseArray2;
        sparseArray2.put(1, "map_type_satellite");
        f38636a.put(2, "map_type_normal");
        f38636a.put(3, "map_type_normal");
    }

    public static void c(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static String e(String str, double d) {
        String strE;
        try {
            double d2 = Double.parseDouble(str);
            if (d2 >= 100.0d) {
                strE = UnitUtil.e(d2, 1, 1);
            } else {
                strE = UnitUtil.e(d2, 1, 2);
            }
            return Double.parseDouble(strE) <= Double.parseDouble(jpq.b(d)) ? strE : jpq.b(d);
        } catch (NumberFormatException e2) {
            LogUtil.e("DynamicTrackUiUtils", LogAnonymous.b(e2));
            return str;
        }
    }

    public static int h(int i) {
        if (i == 222) {
            return R.drawable.retrack_sport_type_exp;
        }
        if (i == 233) {
            return R.drawable.retrack_sport_type_ski_mountaineering;
        }
        if (i == 280) {
            return R.drawable.retrack_sport_type_cross_country;
        }
        if (i == 282) {
            return R.drawable.retrack_sport_type_onfoot;
        }
        switch (i) {
            case 257:
                return R.drawable.retrack_sport_type_walking_outdoors;
            case 258:
                return R.drawable.retrack_sport_type_outdoor_running;
            case 259:
                return R.drawable.retrack_sport_type_cycling;
            case 260:
                return R.drawable.retrack_sport_type_mountain_climbing;
            default:
                return R.drawable.retrack_sport_type_outdoor_running;
        }
    }

    public static String c(Context context, int i) {
        if (context == null || i < 0) {
            LogUtil.e("DynamicTrackUiUtils", "getPaceUnit input data error.");
            return "";
        }
        if (i == 16) {
            return c(context);
        }
        if (i == 18) {
            return context.getResources().getString(R.string.IDS_motiontrack_show_detail_stempsmin);
        }
        return a(context);
    }

    public static String b(double d) {
        if (Math.abs(1.0d + d) < 1.0E-6d) {
            return "";
        }
        if (UnitUtil.f()) {
            return qre.e(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(UnitUtil.e(d, 1)), new Object[0]);
        }
        return qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    public static String b(int i) {
        if (i >= 0 && i <= 100) {
            return UnitUtil.e(i, 2, 0);
        }
        return "";
    }

    public static Double b(double d, boolean z) {
        if (d > 1.0d || (z && d >= 0.0d)) {
            return Double.valueOf(d);
        }
        return Double.valueOf(-1.0d);
    }

    public static String d(double d) {
        if (Math.abs(1.0d + d) < 1.0E-6d) {
            return "";
        }
        if (UnitUtil.f()) {
            d = UnitUtil.e(d, 1);
        }
        return UnitUtil.e(d, 1, 1);
    }

    public static String d(int i, float f) {
        if (i < 0 || f < 0.0f) {
            LogUtil.e("DynamicTrackUiUtils", "getPaceValue input data error.");
            return "";
        }
        if (i == 16) {
            return jpq.e(f);
        }
        if (i == 17) {
            return a(f);
        }
        return i(f);
    }

    public static void a(View view) {
        TranslateAnimation translateAnimation;
        if (view == null) {
            return;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            translateAnimation = new TranslateAnimation(-558.0f, 0.0f, 0.0f, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(558.0f, 0.0f, 0.0f, 0.0f);
        }
        translateAnimation.setInterpolator(e);
        translateAnimation.setDuration(400L);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    public static void a(LinearLayout linearLayout, boolean z) {
        if (linearLayout == null) {
            LogUtil.e("DynamicTrackUiUtils", "initBarrageAnimation error layout");
            return;
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat((Object) null, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat((Object) null, "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat((Object) null, "pivotX", 0.0f), ObjectAnimator.ofFloat((Object) null, "pivotY", 0.0f), ObjectAnimator.ofFloat((Object) null, "Alpha", 0.0f, 1.0f));
        layoutTransition.setAnimator(2, animatorSet);
        layoutTransition.setStartDelay(2, 0L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat((Object) null, "Alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat((Object) null, "translationY", 0.0f, 200.0f));
        animatorSet2.setDuration(350L);
        layoutTransition.setAnimator(3, animatorSet2);
        layoutTransition.setStartDelay(3, 0L);
        e(linearLayout, z, layoutTransition);
        linearLayout.setLayoutTransition(layoutTransition);
    }

    private static void e(final LinearLayout linearLayout, final boolean z, LayoutTransition layoutTransition) {
        layoutTransition.addTransitionListener(new LayoutTransition.TransitionListener() { // from class: jho.2
            @Override // android.animation.LayoutTransition.TransitionListener
            public void endTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view, int i) {
            }

            @Override // android.animation.LayoutTransition.TransitionListener
            public void startTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view, int i) {
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                if (view == null) {
                    LogUtil.e("DynamicTrackUiUtils", "transition view is null");
                    return;
                }
                Context context = view.getContext();
                if (context == null) {
                    LogUtil.e("DynamicTrackUiUtils", "transition context is null");
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (i == 2) {
                    if (LanguageUtil.ba(applicationContext)) {
                        if (z) {
                            drawable3 = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_new_features_tip_up_dark);
                        } else {
                            drawable3 = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_new_features_tip_up);
                        }
                        view.setBackground(drawable3);
                    } else {
                        if (z) {
                            drawable = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_rtl_new_features_tip_up_dark);
                        } else {
                            drawable = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_rtl_new_features_tip_up);
                        }
                        view.setBackground(drawable);
                    }
                    if (linearLayout.getChildCount() > 0) {
                        View childAt = linearLayout.getChildAt(0);
                        if (z) {
                            drawable2 = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_new_features_tip_body_dark);
                        } else {
                            drawable2 = applicationContext.getResources().getDrawable(R.drawable.retrack_ic_new_features_tip_body);
                        }
                        childAt.setBackground(drawable2);
                    }
                }
            }
        });
    }

    public static void e(View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(e);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void c(View view) {
        TranslateAnimation translateAnimation;
        if (view == null) {
            return;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            translateAnimation = new TranslateAnimation(0.0f, -558.0f, 0.0f, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(0.0f, 558.0f, 0.0f, 0.0f);
        }
        translateAnimation.setInterpolator(e);
        translateAnimation.setDuration(400L);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    public static String d() {
        return ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).getShareNickName();
    }

    public static Bitmap e(Context context) {
        if (context == null) {
            LogUtil.e("DynamicTrackUiUtils", "getUserHeader context null.");
            return null;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi != null) {
            UserInfomation userInfo = userProfileMgrApi.getUserInfo();
            String picPath = userInfo != null ? userInfo.getPicPath() : null;
            if (!TextUtils.isEmpty(picPath)) {
                return qqf.a(context, picPath);
            }
        }
        return null;
    }

    public static void a(int i, Object obj, int i2, Handler handler) {
        if (i < 0 || obj == null || i2 < 0 || handler == null) {
            LogUtil.e("DynamicTrackUiUtils", "sendMessage error input data.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = obj;
        handler.sendMessageDelayed(messageObtain, i2);
    }

    public static void d(int i, int i2, Handler handler) {
        if (i < 0 || i2 < 0 || handler == null) {
            LogUtil.e("DynamicTrackUiUtils", "sendMessage error input data.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        handler.sendMessageDelayed(messageObtain, i2);
    }

    public static void e(int i, int i2, Handler handler, String str) {
        if (i < 0 || i2 < 0 || handler == null || str == null) {
            LogUtil.e("DynamicTrackUiUtils", "sendMessage error input data.");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = str;
        handler.sendMessageDelayed(messageObtain, i2);
    }

    public static MapTypeDescription.MapType d(String str) {
        if ("map_type_normal".equals(str)) {
            return MapTypeDescription.MapType.MAP_TYPE_NORMAL;
        }
        if ("map_type_night".equals(str)) {
            return MapTypeDescription.MapType.MAP_TYPE_NIGHT;
        }
        if ("map_type_navi".equals(str)) {
            return MapTypeDescription.MapType.MAP_TYPE_NAVI;
        }
        if ("map_type_custom".equals(str)) {
            return MapTypeDescription.MapType.MAP_TYPE_CUSTOM;
        }
        return MapTypeDescription.MapType.MAP_TYPE_SATELLITE;
    }

    public static String d(MapTypeDescription.MapType mapType) {
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_SATELLITE) {
            return "map_type_satellite";
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            return "map_type_night";
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NAVI) {
            return "map_type_navi";
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL) {
            return "map_type_normal";
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_CUSTOM) {
            return "map_type_custom";
        }
        LogUtil.a("DynamicTrackUiUtils", "error inMapType");
        return "map_type_satellite";
    }

    public static MapTypeDescription.MapType c(int i) {
        if (i == 1) {
            return MapTypeDescription.MapType.MAP_TYPE_NORMAL;
        }
        if (i == 3) {
            return MapTypeDescription.MapType.MAP_TYPE_NIGHT;
        }
        if (i == 4) {
            return MapTypeDescription.MapType.MAP_TYPE_NAVI;
        }
        if (i == 2) {
            return MapTypeDescription.MapType.MAP_TYPE_SATELLITE;
        }
        if (i == 5) {
            return MapTypeDescription.MapType.DEFAULT_MAP_THREE_D;
        }
        return MapTypeDescription.MapType.MAP_TYPE_CUSTOM;
    }

    public static String e(int i) {
        if (i == 1) {
            return "custom_gaode_map_information_69";
        }
        if (i == 2) {
            return "new_custom_google_map_information";
        }
        if (i == 3) {
            return "new_custom_hsm_map_information";
        }
        LogUtil.e("DynamicTrackUiUtils", "type error");
        return null;
    }

    public static String a(double d) {
        if (d < 0.0d) {
            LogUtil.e("DynamicTrackUiUtils", "requestSpeed input data error.");
            return "";
        }
        if (UnitUtil.f()) {
            d = UnitUtil.e(d, 3);
        }
        return UnitUtil.e(d, 1, 2);
    }

    public static String i(double d) {
        if (d < 0.0d) {
            LogUtil.e("DynamicTrackUiUtils", "inputStepsMin input data error.");
            return "";
        }
        return UnitUtil.e(d, 1, 0);
    }

    public static String a(Context context) {
        if (context == null) {
            LogUtil.e("DynamicTrackUiUtils", "requestSpeedUnit context is null.");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return context.getString(R.string.IDS_motiontrack_show_detail_average_speed);
    }

    public static String c(Context context) {
        if (context == null) {
            LogUtil.e("DynamicTrackUiUtils", "requestPaceUnit context is null.");
            return "";
        }
        if (UnitUtil.f()) {
            return "/" + context.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_retrack_pace_unit, 1, "");
    }

    public static String c(double d) {
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(d, 1), 1, 2);
        }
        return UnitUtil.e(d, 1, 1);
    }

    public static String b(Context context) {
        if (context == null) {
            LogUtil.e("DynamicTrackUiUtils", "requestAltitudeUnit context is null.");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_ft_string, 1, "");
        }
        return context.getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    public static String b(double d, Context context) {
        if (d < 0.0d || context == null) {
            LogUtil.e("DynamicTrackUiUtils", "requestTotalDistance input data error.");
            return "";
        }
        if (d == 0.0d) {
            return context.getString(R.string.IDS_motiontrack_show_invalid_data);
        }
        return jpq.b(d);
    }

    public static String d(Context context) {
        if (context == null) {
            LogUtil.e("DynamicTrackUiUtils", "requestDistanceUnit context is null.");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    public static String e(double d) {
        if (d < 0.0d) {
            LogUtil.e("DynamicTrackUiUtils", "requestHeartRate input data error.");
            return "";
        }
        return UnitUtil.e(d, 1, 0);
    }

    public static String d(int i) {
        return f38637b.get(i);
    }

    public static String a(int i) {
        return f38636a.get(i);
    }

    public static Bitmap c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DynamicTrackUiUtils", "createBitmap:context is null or path is empty!");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                fileInputStream.close();
                return bitmapDecodeStream;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.j("DynamicTrackUiUtils", "createBitmap:IOException");
            return null;
        } catch (OutOfMemoryError unused2) {
            LogUtil.j("DynamicTrackUiUtils", "createBitmap:OutOfMemoryError");
            return null;
        }
    }
}
