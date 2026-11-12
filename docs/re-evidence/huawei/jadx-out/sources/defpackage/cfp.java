package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.bean.ConfigDetailBean;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cfp;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1546a;
    private static final int ab;
    private static final int ac;
    private static final int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1547b;
    private static final int d;
    private static final int[] e;
    private static final int f;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int[] m;
    private static final int[][] n;
    private static final int o;
    private static final int[] p;
    private static final int[][] q;
    private static final int[] r;
    private static final int s;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final int z;
    private static final int y = R.drawable.icon_running;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1548c = R.drawable.icon_full_fitness;
    private static final int g = R.drawable.icon_jump_rope;

    public static int a(int i2, int i3) {
        if (i2 <= 0) {
            return 0;
        }
        if (i3 == 1) {
            return 1;
        }
        return i2 == 3 ? 3 : 200;
    }

    static {
        int i2 = R.string.IDS_health_model_card_dialog_go_exercise;
        i = i2;
        int i3 = R.string.IDS_health_model_card_dialog_to_train;
        ac = i3;
        int i4 = R.string.IDS_health_model_card_dialog_take_a_break;
        v = i4;
        int i5 = R.string.IDS_health_model_card_dialog_punch;
        s = i5;
        int i6 = R.string.IDS_health_model_card_dialog_start_to_sleep;
        ab = i6;
        int i7 = R.string.IDS_health_model_card_dialog_start_to_sleep_check;
        z = i7;
        int i8 = R.string.IDS_card_to_walk;
        ad = i8;
        x = R.string.IDS_card_running;
        f = R.string.IDS_card_energetic_workout;
        j = com.huawei.ui.commonui.R.string.IDS_indoor_skipper_rope_sport_type;
        int i9 = R.string.IDS_card_start_mindfulness;
        w = i9;
        int i10 = R.string.IDS_card_keep_on_mindfulness;
        h = i10;
        int i11 = R.string.IDS_card_drink_water;
        d = i11;
        int i12 = R.string.IDS_card_medicine;
        l = i12;
        int i13 = R.string.IDS_card_dialog_tool_measurement;
        u = i13;
        int i14 = R.string.IDS_card_dialog_manual_input;
        k = i14;
        int i15 = R.string.IDS_card_dialog_record;
        t = i15;
        int i16 = R.string.IDS_intensity_detail_view;
        f1546a = i16;
        int i17 = R.string.IDS_health_life_view_pressure;
        f1547b = i17;
        int i18 = R.string.IDS_health_model_card_dialog_understood;
        o = i18;
        r = new int[]{-1, i2, i3, i3, -1, -1, i5, -1, -1, -1, -1, -1, -1};
        q = new int[][]{new int[]{i8, -1, -1, i3, -1, -1, i5, i9, -1, -1, -1, i15, i13}, new int[]{i8, -1, -1, i3, -1, -1, i5, i10, -1, -1, -1, i15, i13}};
        p = new int[]{-1, -1, -1, -1, i5, i6, -1, -1, -1, -1, i14, -1, i14};
        n = new int[][]{new int[]{-1, i4, i4, -1, i14, i7, -1, -1, i11, i12, -1, -1, i4}, new int[]{-1, -1, -1, -1, i14, -1, -1, -1, i11, -1, -1, -1, -1}};
        e = new int[]{-1, i16, -1, i17, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        m = new int[]{i18, i18, i18, i18, i18, i18, i18, i18, i18, i18, i18, i18, i18};
    }

    private static Drawable a(int i2) {
        Resources resources = BaseApplication.b().getResources();
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(resources, qqf.b(qqf.c(com.huawei.ui.commonui.R.drawable.health_life_background), new int[]{i2}, true));
        roundedBitmapDrawableCreate.setAntiAlias(true);
        roundedBitmapDrawableCreate.setDither(true);
        roundedBitmapDrawableCreate.setCornerRadius(resources.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.emui_corner_radius_dialog));
        return roundedBitmapDrawableCreate;
    }

    private static Drawable a() {
        return a(ContextCompat.getColor(BaseApplication.b(), R.color.dialog_background));
    }

    public static Drawable c(Drawable drawable, boolean z2) {
        if (!z2) {
            return drawable;
        }
        if (!(drawable instanceof RoundedBitmapDrawable)) {
            LogUtil.j("HL_TaskDialogUtils", "getBackground drawable ", drawable);
            return a();
        }
        RoundedBitmapDrawable roundedBitmapDrawable = (RoundedBitmapDrawable) drawable;
        Bitmap bitmap = roundedBitmapDrawable.getBitmap();
        if (bitmap == null) {
            LogUtil.j("HL_TaskDialogUtils", "getBackground bitmap is null");
            return a();
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int cornerRadius = (int) roundedBitmapDrawable.getCornerRadius();
        LogUtil.a("HL_TaskDialogUtils", "getBackground width ", Integer.valueOf(width), " height ", Integer.valueOf(height), " cornerRadius ", Integer.valueOf(cornerRadius));
        if (width <= cornerRadius || height <= cornerRadius) {
            return a();
        }
        return a(bitmap.getPixel(width - cornerRadius, height - cornerRadius));
    }

    private static int g(HealthLifeBean healthLifeBean) {
        int complete = healthLifeBean.getComplete();
        int id = healthLifeBean.getId();
        if (complete <= 0) {
            return 0;
        }
        int iA = qrs.a(healthLifeBean.getResult());
        if (complete == 4) {
            if ((id == 6 || id == 7) && !cbg.i(healthLifeBean)) {
                return 0;
            }
            if (id == 9 && iA <= 0) {
                return 0;
            }
        }
        return (id != 11 || iA >= qrs.a(healthLifeBean.getTarget())) ? 1 : 0;
    }

    public static List<bwc> a(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getEventListForRecycler bean is null");
            return Collections.EMPTY_LIST;
        }
        if (healthLifeBean.getId() == 3) {
            return e();
        }
        return Collections.EMPTY_LIST;
    }

    private static List<bwc> e() {
        ArrayList arrayList = new ArrayList();
        if (SportSupportUtil.l()) {
            arrayList.add(new bwc(1, x, y));
        }
        if (SportSupportUtil.b()) {
            arrayList.add(new bwc(2, f, f1548c));
        }
        if (SportSupportUtil.k()) {
            arrayList.add(new bwc(3, j, g));
        }
        return arrayList;
    }

    public static String j(HealthLifeBean healthLifeBean) {
        ConfigDetailBean detailEntity;
        String uri;
        String url;
        String h5PackageName;
        int i2;
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getPositiveText bean is null");
            return "";
        }
        int id = healthLifeBean.getId();
        boolean z2 = false;
        boolean z3 = id == 5;
        boolean z4 = id == 9;
        if ((!z3 && !z4) || (detailEntity = cbg.d(byu.c(), id).getDetailEntity()) == null) {
            h5PackageName = "";
            uri = h5PackageName;
            url = uri;
        } else {
            uri = detailEntity.getUri();
            url = detailEntity.getUrl();
            h5PackageName = detailEntity.getH5PackageName();
        }
        boolean z5 = SportSupportUtil.l() || !(id == 2 || id == 3);
        if (!TextUtils.isEmpty(uri) || !TextUtils.isEmpty(url) || !TextUtils.isEmpty(h5PackageName) || (!z3 && !z4)) {
            z2 = true;
        }
        if (!z5 || !z2) {
            return "";
        }
        int iW = cbg.w();
        if (id == 12 && cbg.ad()) {
            return "";
        }
        if (iW >= 0 && iW <= healthLifeBean.getRecordDay()) {
            i2 = q[g(healthLifeBean)][cbg.d(id)];
        } else {
            i2 = r[cbg.d(id)];
        }
        if (i2 <= 0) {
            return "";
        }
        return qre.f(i2);
    }

    public static String c(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getNeutralText bean is null");
            return "";
        }
        int iW = cbg.w();
        int id = healthLifeBean.getId();
        if ((id == 3 && Utils.o()) || (id == 12 && cbg.ad())) {
            return "";
        }
        int iD = cbg.d(id);
        if ((id == 6 || id == 7) && (cbg.a(healthLifeBean) != 1 || healthLifeBean.getComplete() > 0)) {
            return "";
        }
        int i2 = (iW < 0 || iW > healthLifeBean.getRecordDay()) ? -1 : p[iD];
        if (i2 <= 0) {
            return "";
        }
        return qre.f(i2);
    }

    public static String d(HealthLifeBean healthLifeBean, int i2) {
        int i3;
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getNegativeText bean is null");
            return "";
        }
        int complete = healthLifeBean.getComplete();
        int id = healthLifeBean.getId();
        if (healthLifeBean.getId() == 12) {
            if (!cbg.ad()) {
                return "";
            }
            return qre.f(R.string.IDS_blood_pressure_lookup);
        }
        if (cbg.d(byu.c(), id).getGoalCycleType() == 2 && i2 <= 0) {
            return "";
        }
        if (id == 6 && !TextUtils.isEmpty(healthLifeBean.getResult())) {
            return "";
        }
        if (id == 7 && (complete > 0 || cbg.a(healthLifeBean) != 1 || !fua.c(BaseApplication.b()))) {
            return "";
        }
        if ((id == 10 && qrs.a(healthLifeBean.getResult()) >= 6000) || (i3 = n[g(healthLifeBean)][cbg.d(id)]) <= 0) {
            return "";
        }
        return qre.f(i3);
    }

    public static String d(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getDetailText bean is null");
            return "";
        }
        int i2 = e[cbg.d(healthLifeBean.getId())];
        if (i2 <= 0) {
            return "";
        }
        return qre.f(i2);
    }

    public static String b(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getKnowButtonText bean is null");
            return "";
        }
        int id = healthLifeBean.getId();
        int i2 = m[cbg.d(id)];
        int complete = healthLifeBean.getComplete();
        if ((id == 7 && (cbg.a(healthLifeBean) != 1 || (complete > 0 && complete != 4))) || (complete == 4 && cbg.i(healthLifeBean))) {
            i2 = o;
        }
        return qre.f(i2);
    }

    public static void e(HealthTextView healthTextView, String str) {
        if (healthTextView == null) {
            LogUtil.j("HL_TaskDialogUtils", "setText textView is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
            lrd.d(healthTextView, lrd.b(str), false);
        }
    }

    public static String h(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getTitle bean is null");
            return "";
        }
        int iA = a(healthLifeBean.getComplete(), healthLifeBean.getRest());
        if (iA == 1) {
            return qre.f(R.string.IDS_health_model_today_rest);
        }
        if (iA == 3) {
            return qre.f(R.string.IDS_make_up_success);
        }
        if (iA == 200) {
            int id = healthLifeBean.getId();
            ArrayList<String> arrayListE = cfh.e(cfh.d(id).e(), (HashMap<String, String>) null);
            if (njy.b(arrayListE)) {
                return arrayListE.get(qrf.d(arrayListE.size()));
            }
            return qre.f(ffv.i().get(id));
        }
        return qre.f(ffv.i().get(healthLifeBean.getId()));
    }

    public static String e(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getContent bean is null");
            return "";
        }
        if (healthLifeBean.getComplete() > 0) {
            return i(healthLifeBean);
        }
        int id = healthLifeBean.getId();
        int iA = cbg.a(healthLifeBean);
        if (iA == 0) {
            if (id == 6) {
                return qre.f(R.string.IDS_health_model_wake_up_early);
            }
            if (id == 7) {
                return qre.f(R.string.IDS_health_model_sleep_early);
            }
            LogUtil.j("HL_TaskDialogUtils", "getContent TIME_LIMIT_BEFORE id ", Integer.valueOf(id));
            return "";
        }
        if (iA != 2) {
            return d(id, healthLifeBean.getChallengeId(), true);
        }
        if (id == 6) {
            return qre.f(R.string.IDS_health_model_wake_up_late);
        }
        if (id == 7) {
            return qre.f(R.string.IDS_health_model_sleep_late);
        }
        LogUtil.j("HL_TaskDialogUtils", "getContent TIME_LIMIT_AFTER id ", Integer.valueOf(id));
        return "";
    }

    private static String i(HealthLifeBean healthLifeBean) {
        int id = healthLifeBean.getId();
        if (id != 10) {
            return "";
        }
        int iJ = CommonUtils.j(healthLifeBean.getResult());
        if (iJ >= 6000) {
            ArrayList<String> arrayListE = cfh.e(cfh.c(BleConstants.LIMIT, id).e(), (HashMap<String, String>) null);
            if (njy.b(arrayListE)) {
                return arrayListE.get(qrf.d(arrayListE.size()));
            }
        } else if (iJ > CommonUtils.j(healthLifeBean.getTarget())) {
            ArrayList<String> arrayListE2 = cfh.e(cfh.c("exceed_target", id).e(), (HashMap<String, String>) null);
            if (njy.b(arrayListE2)) {
                return arrayListE2.get(qrf.d(arrayListE2.size()));
            }
        } else {
            LogUtil.d("HL_TaskDialogUtils", "getSemanticForDrinkWater bean ", healthLifeBean);
        }
        return "";
    }

    public static String d(int i2, int i3, boolean z2) {
        if (i3 <= 0 || !cda.d().contains(Integer.valueOf(i3))) {
            i3 = ccg.a();
        }
        if (i3 == 200003 && i2 == 9) {
            String[] strArrG = qre.g(R.array.IDS_benefits_9_200003);
            String str = strArrG[qrf.d(strArrG.length)];
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        ArrayList<String> arrayListE = cfh.e(cfh.c(i2, i3).e(), (HashMap<String, String>) null);
        if (z2 && njy.e(arrayListE)) {
            arrayListE = cfh.e(cfh.c("", i2).e(), (HashMap<String, String>) null);
        }
        if (!njy.b(arrayListE)) {
            return "";
        }
        return arrayListE.get(qrf.d(arrayListE.size()));
    }

    public static String f(HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "getRule bean is null");
            return "";
        }
        if (healthLifeBean.getId() != 5) {
            return "";
        }
        Context contextB = BaseApplication.b();
        return contextB.getResources().getString(R.string.IDS_breath_achieved_dialog, 1, qrk.a(contextB, cbg.c(18, 0), 1), 60);
    }

    public static void d(HealthLifeBean healthLifeBean, Context context) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskDialogUtils", "setAboutEvent bean is null");
        } else {
            e(healthLifeBean.getId(), context);
        }
    }

    public static void e(int i2, Context context) {
        if (context == null) {
            LogUtil.j("HL_TaskDialogUtils", "setAboutEvent bean activity is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("targetId", i2);
        AppRouter.c("/PluginHealthModel/HealthModelMissionDetails").e(268435456).d(bundle).b(context);
    }

    public static void a(HealthLifeBean healthLifeBean, Context context) {
        ConfigDetailBean detailEntity;
        String uri;
        String h5PackageName;
        String str;
        if (healthLifeBean == null || context == null) {
            LogUtil.j("HL_TaskDialogUtils", "setPositiveEvent bean ", healthLifeBean, " activity ", context);
            return;
        }
        int id = healthLifeBean.getId();
        boolean z2 = false;
        boolean z3 = id == 5;
        boolean z4 = id == 9;
        if ((!z3 && !z4) || (detailEntity = cbg.d(byu.c(), id).getDetailEntity()) == null) {
            str = "";
            uri = "";
            h5PackageName = uri;
        } else {
            uri = detailEntity.getUri();
            String url = detailEntity.getUrl();
            h5PackageName = detailEntity.getH5PackageName();
            str = url;
        }
        boolean z5 = SportSupportUtil.l() || !(id == 2 || id == 3);
        if (!TextUtils.isEmpty(uri) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(h5PackageName) || (!z3 && !z4)) {
            z2 = true;
        }
        if (z5 && z2) {
            if (id == 3) {
                a(context);
                return;
            }
            if (id != 5) {
                if (id == 13) {
                    e(context);
                    return;
                } else if (id == 8) {
                    b(healthLifeBean, context);
                    return;
                } else if (id != 9) {
                    LogUtil.j("HL_TaskDialogUtils", "setPositiveEvent bean ", healthLifeBean);
                    return;
                }
            }
            c(uri, str, h5PackageName, context);
        }
    }

    public static void a(Context context) {
        if (context == null) {
            LogUtil.j("HL_TaskDialogUtils", "jumpRunning activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.b(), "com.huawei.health.MainActivity");
        intent.setFlags(131072);
        intent.putExtra("mLaunchSource", 6);
        intent.putExtra(BleConstants.SPORT_TYPE, 258);
        intent.putExtra("isToSportTab", true);
        iov.d(context, intent);
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.j("HL_TaskDialogUtils", "jumpAllCourse activity is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").e(268435456).d(bundle).b(context);
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.j("HL_TaskDialogUtils", "jumpRope activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.b(), "com.huawei.health.MainActivity");
        intent.setFlags(131072);
        intent.putExtra("mLaunchSource", 6);
        intent.putExtra(BleConstants.SPORT_TYPE, 283);
        intent.putExtra("isToSportTab", true);
        iov.d(context, intent);
    }

    private static void c(String str, String str2, String str3, Context context) {
        if (!TextUtils.isEmpty(str)) {
            iov.d(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            ddv.b().loadH5ProApp(context, str3, null);
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("OperationBundle", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.j("HL_TaskDialogUtils", "setPositiveEventForLink api is null url ", str2);
        } else {
            marketRouterApi.router(str2, new IBaseResponseCallback() { // from class: cfs
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    LogUtil.a("HL_TaskDialogUtils", "setPositiveEventForLink errorCode ", Integer.valueOf(i2));
                }
            });
        }
    }

    private static void b(HealthLifeBean healthLifeBean, final Context context) {
        Intent intent = new Intent();
        intent.putExtra("taskRecord", healthLifeBean);
        intent.putExtra("moduleName", "PluginHiAiEngine");
        AppBundle.d().launchActivity(context, intent, new AppBundleLauncher.InstallCallback() { // from class: com.huawei.basichealthmodel.util.TaskDialogUtils$$ExternalSyntheticLambda1
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context2, Intent intent2) {
                return cfp.c(context, context2, intent2);
            }
        });
    }

    public static /* synthetic */ boolean c(Context context, Context context2, Intent intent) {
        AppRouter.c("/PluginHealthModel/DailySmileActivity").e(268435456).d(new Bundle()).b(context);
        return false;
    }

    private static void e(Context context) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/diet_recording_tool?from=5");
        ddv.b().loadH5ProApp(context, ddx.e, builder);
    }

    public static void b(HealthLifeBean healthLifeBean, Context context, String str) {
        if (healthLifeBean == null || context == null) {
            LogUtil.j("HL_TaskDialogUtils", "setNeutralEvent bean ", healthLifeBean, " activity ", context);
            return;
        }
        int id = healthLifeBean.getId();
        if (id == 3) {
            d(context);
            return;
        }
        if (id != 12) {
            LogUtil.j("HL_TaskDialogUtils", "setNeutralEvent bean ", healthLifeBean);
            return;
        }
        if (dfr.b()) {
            dfi dfiVar = new dfi();
            dfiVar.a(true);
            dfiVar.e(str);
            dfiVar.e(true);
            dfr.c(context, dfiVar);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isShowInput", true);
        bundle.putBoolean("isStartNewActivity", true);
        bundle.putString("from", str);
        AppRouter.c("/Main/InputBloodPressureActivity").e(268435456).d(bundle).b(context);
    }

    public static void d(final HealthLifeTaskBean healthLifeTaskBean, Context context, final ResponseCallback<HealthLifeTaskBean> responseCallback) {
        if (healthLifeTaskBean == null || context == null) {
            LogUtil.j("HL_TaskDialogUtils", "setNegativeEvent bean ", healthLifeTaskBean, " activity ", context);
            return;
        }
        int id = healthLifeTaskBean.getId();
        byu byuVarC = byu.c();
        if (cbg.d(byuVarC, id).getGoalCycleType() == 2) {
            byuVarC.e(3, String.valueOf(0), healthLifeTaskBean.getHealthLifeBean(), new TaskDayDataListener() { // from class: cfp.2
                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onAllDataChange(int i2, List<HealthLifeBean> list) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
                public void onDataChange(int i2, HealthLifeBean healthLifeBean) {
                    LogUtil.a("HL_TaskDialogUtils", "setNegativeEvent onOneTaskDataChange result ", Integer.valueOf(i2), " lifeBean ", healthLifeBean);
                    if (responseCallback == null) {
                        return;
                    }
                    if (healthLifeBean != null) {
                        healthLifeTaskBean.setHealthLifeBean(healthLifeBean);
                    }
                    responseCallback.onResponse(i2 == 0 ? 3 : -1, healthLifeTaskBean);
                }
            });
        }
        if (id == 6) {
            cbg.d(context, 0L, 0L);
        } else if (id != 12) {
            LogUtil.j("HL_TaskDialogUtils", "setNegativeEvent bean ", healthLifeTaskBean);
        } else {
            c(context);
        }
    }

    public static void c(Context context) {
        if (fua.p()) {
            Bundle bundle = new Bundle();
            bundle.putString("page_id", ArkUIXConstants.KNIT_BLOOD_PRESSURE);
            bundle.putInt("module_type", 6);
            iov.c(context, fti.c(context, bundle));
            return;
        }
        AppRouter.c("/Main/KnitBloodPressureActivity").e(268435456).b(context);
    }

    public static void e(HealthLifeBean healthLifeBean, Context context) {
        if (healthLifeBean == null || context == null) {
            LogUtil.j("HL_TaskDialogUtils", "setDetailEvent bean ", healthLifeBean, " activity ", context);
            return;
        }
        int id = healthLifeBean.getId();
        if (id == 3) {
            AppRouter.c("/Main/FitnessSportIntensityDetailActivity").e(268435456).a("today_current_middle_and_high_total", CommonUtil.j(healthLifeBean.getResult())).b(context);
        } else {
            if (id != 5) {
                LogUtil.j("HL_TaskDialogUtils", "setDetailEvent bean ", healthLifeBean);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("type", 2);
            gry.a(context, bundle);
        }
    }

    public static SparseIntArray c(SparseArray<List<HealthLifeBean>> sparseArray, int i2) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HL_TaskDialogUtils", "getWeeklyTaskStatus sparseArray ", sparseArray);
            return new SparseIntArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i3)));
        }
        if (njy.e(arrayList, 0)) {
            return new SparseIntArray();
        }
        Collections.sort(arrayList);
        List<Integer> listJ = cbg.j(sparseArray.keyAt(0));
        SparseIntArray sparseIntArray = new SparseIntArray();
        Iterator<Integer> it = listJ.iterator();
        while (it.hasNext()) {
            sparseIntArray.append(it.next().intValue(), 0);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (HealthLifeBean healthLifeBean : new ArrayList(sparseArray.get(iIntValue))) {
                if (healthLifeBean != null && healthLifeBean.getId() == i2) {
                    sparseIntArray.append(iIntValue, a(healthLifeBean.getComplete(), healthLifeBean.getRest()));
                }
            }
        }
        return sparseIntArray;
    }

    public static ArrayList<Integer> b(SparseArray<List<HealthLifeBean>> sparseArray, int i2) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HL_TaskDialogUtils", "getWeeklyTaskRecords sparseArray ", sparseArray);
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            List<HealthLifeBean> list = sparseArray.get(iKeyAt);
            if (!njy.e(list)) {
                for (HealthLifeBean healthLifeBean : list) {
                    if (healthLifeBean != null && healthLifeBean.getId() == i2 && healthLifeBean.getComplete() > 0) {
                        arrayList.add(Integer.valueOf(iKeyAt));
                        LogUtil.d("HL_TaskDialogUtils", "getWeeklyTaskRecords recordDay ", Integer.valueOf(iKeyAt));
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int d(SparseArray<List<HealthLifeBean>> sparseArray, int i2) {
        SparseIntArray sparseIntArrayC = c(sparseArray, i2);
        int size = sparseIntArrayC.size();
        int iA = cgi.a(i2, cbg.a(i2, sparseArray));
        for (int i3 = 0; i3 < size; i3++) {
            if (sparseIntArrayC.get(sparseIntArrayC.keyAt(i3)) == 1) {
                iA--;
            }
        }
        return Math.max(iA, 0);
    }
}
