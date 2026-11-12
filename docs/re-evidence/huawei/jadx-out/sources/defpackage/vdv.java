package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.views.WeightViewDialog;
import defpackage.vdv;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class vdv {
    static /* synthetic */ void a(DialogInterface dialogInterface) {
    }

    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void b(DialogInterface dialogInterface) {
    }

    static /* synthetic */ void b(View view) {
    }

    static /* synthetic */ void d(View view) {
    }

    private static void e(Context context, a aVar, ResponseCallback<Integer> responseCallback) {
        b(context, aVar, responseCallback);
        e(aVar, 0);
    }

    private static void b(Context context, a aVar, ResponseCallback<Integer> responseCallback) {
        if (context == null || aVar == null) {
            LogUtil.j("WeightDialogUtil", "checkShowTargetDialog context is null");
        } else {
            i(context, aVar);
            d(context, aVar, responseCallback);
        }
    }

    public static void b(Context context, long j, long j2, a aVar, ResponseCallback<Integer> responseCallback) {
        int iD;
        if (context == null || aVar == null) {
            LogUtil.j("WeightDialogUtil", "showMotivatingDialog context is null");
            vls.a(responseCallback);
            return;
        }
        String strD = vng.d("weight_target_Id");
        if (TextUtils.isEmpty(strD)) {
            vls.a(responseCallback);
            return;
        }
        float fD = aVar.d();
        float fA = vng.a("last_percentage");
        boolean z = Math.round(fD) >= 100;
        boolean z2 = Math.round(fA) >= 100;
        vng.b("last_percentage", fD);
        LogUtil.a("WeightDialogUtil", "showMotivatingDialog percentage ", Float.valueOf(fD), " lastPercentage ", Float.valueOf(fA), " isComplete ", Boolean.valueOf(z), " isLastComplete ", Boolean.valueOf(z2));
        if (z) {
            if (z2) {
                vls.b(responseCallback, -1);
                return;
            } else {
                aVar.c(6);
                e(context, aVar, responseCallback);
                return;
            }
        }
        int iD2 = d(j, j2);
        if (iD2 == 0) {
            LogUtil.j("WeightDialogUtil", "showMotivatingDialog regionType is 0");
            vls.b(responseCallback, -1);
            return;
        }
        if (!TextUtils.isEmpty(strD) && a(iD2, strD)) {
            vls.b(responseCallback, -1);
            return;
        }
        if (iD2 == 1) {
            iD = d(25, aVar);
        } else if (iD2 == 2) {
            iD = d(50, aVar);
        } else if (iD2 == 3) {
            iD = d(75, aVar);
        } else if (iD2 != 4) {
            LogUtil.j("WeightDialogUtil", "showMotivatingDialog is default");
            iD = 5;
        } else {
            iD = 7;
        }
        aVar.c(iD);
        e(context, aVar, responseCallback);
        vng.d(strD + iD2, true);
    }

    private static int d(int i, a aVar) {
        if (Math.round(aVar.d()) >= 100) {
            return 6;
        }
        return (Math.round(aVar.d()) <= i || Math.round(aVar.d()) >= 100) ? 5 : 8;
    }

    private static void d(final Context context, final a aVar, final ResponseCallback<Integer> responseCallback) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        WeightViewDialog weightViewDialogE = e(context, aVar).b(aVar.g(), new View.OnClickListener() { // from class: vdv.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vdv.c(aVar, context, responseCallback, atomicBoolean);
            }
        }).d(aVar.f(), new View.OnClickListener() { // from class: vdv.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (aVar.a() == 6) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IS_SELECT_KEEP_WEIGHT", true);
                    vdv.e(aVar, 2);
                    iun.b(context, "#/AddTarget?tab=keep", bundle);
                    vls.b((ResponseCallback<Integer>) responseCallback, 2);
                    atomicBoolean.set(false);
                    return;
                }
                if (aVar.a() == 7) {
                    vdv.e(aVar, 4);
                } else {
                    LogUtil.d("WeightDialogUtil", "other dialog");
                }
            }
        }).a(aVar.j(), new View.OnClickListener() { // from class: vdx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.e(aVar, 4);
            }
        }).e();
        if (weightViewDialogE == null) {
            ReleaseLogUtil.d("WeightDialogUtil", "showDialog dialog is null");
            vls.a(responseCallback);
        } else {
            weightViewDialogE.show();
            weightViewDialogE.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vee
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    vdv.c(atomicBoolean, responseCallback, dialogInterface);
                }
            });
            vls.b(responseCallback, 0);
        }
    }

    static /* synthetic */ void c(AtomicBoolean atomicBoolean, ResponseCallback responseCallback, DialogInterface dialogInterface) {
        if (atomicBoolean.get()) {
            vls.b((ResponseCallback<Integer>) responseCallback, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(a aVar, Context context, ResponseCallback<Integer> responseCallback, AtomicBoolean atomicBoolean) {
        if (aVar.a() == 6 || aVar.a() == 7) {
            Bundle bundle = new Bundle();
            bundle.putInt("from", 1);
            e(aVar, 1);
            iun.b(context, aVar.k() == 2 ? "#/AddTarget?tab=reduce" : "#/AddTarget?tab=add", bundle);
            vls.b(responseCallback, 2);
            atomicBoolean.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(a aVar, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (aVar.k() == 2) {
            map.put("task", 0);
        } else {
            map.put("task", 1);
        }
        int iA = aVar.a();
        if (iA == 5) {
            map.put("type", 3);
        } else if (iA == 6) {
            map.put("type", 1);
        } else if (iA == 7) {
            map.put("type", -1);
        } else if (iA == 8) {
            map.put("type", 2);
        } else {
            LogUtil.j("WeightDialogUtil", "initTargetDialogBean is default");
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.WEIGHT_TARGET_MOMENTS_CLICK_2160123.value(), map, 0);
    }

    private static void i(Context context, a aVar) {
        int iA = aVar.a();
        if (iA == 1) {
            g(context, aVar);
            return;
        }
        if (iA == 2) {
            f(context, aVar);
            return;
        }
        if (iA == 3) {
            j(context, aVar);
            return;
        }
        if (iA == 4) {
            h(context, aVar);
        } else if (iA == 5) {
            c(context, aVar);
        } else {
            o(context, aVar);
        }
    }

    private static void o(Context context, a aVar) {
        int iA = aVar.a();
        if (iA == 6) {
            d(context, aVar);
            return;
        }
        if (iA == 7) {
            b(context, aVar);
        } else if (iA == 8) {
            a(context, aVar);
        } else {
            LogUtil.j("WeightDialogUtil", "initTargetDialogBean is default");
        }
    }

    private static void g(Context context, a aVar) {
        aVar.a(R.string.IDS_hwh_home_target_begins);
        aVar.e(R.drawable.target_begins);
        aVar.a(a(context, aVar, ""));
        aVar.e(context.getString(R.string.IDS_hwh_home_ok));
        aVar.d(1);
        aVar.a(true);
    }

    private static void f(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_go_beyond_the_goal);
        aVar.e(R.drawable.target_surpassing);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_go_beyond_the_goal_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_go_beyond_the_goal_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_ok));
        aVar.d(1);
        aVar.a(true);
    }

    private static void j(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_backward_target);
        aVar.e(R.drawable.target_backwards);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_backward_target_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_backward_target_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_ok));
        aVar.d(1);
        aVar.a(true);
    }

    private static void h(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_stable_progress);
        aVar.e(R.drawable.target_stable);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_stable_progress_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_stable_progress_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_ok));
        aVar.d(1);
        aVar.a(true);
    }

    private static void c(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_keep_pumping);
        aVar.e(R.drawable.motivating_discouraged);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_keep_pumping_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_keep_pumping_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_keep_up_good_work));
        aVar.d(1);
        aVar.a(false);
    }

    private static void a(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_winner_is_in_hand);
        aVar.e(R.drawable.motivating_come_on);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_keep_pumping_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_keep_pumping_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_keep_up_good_work));
        aVar.a(false);
        aVar.d(1);
    }

    private static void d(Context context, a aVar) {
        String string;
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_weight_reduction_goal_achievement_content);
            aVar.a(R.string.IDS_hwh_home_weight_reduction_goal_achievement);
        } else {
            aVar.a(R.string.IDS_hwh_home_weight_gain_goal_achievement);
            string = context.getString(R.string.IDS_hwh_home_weight_gain_goal_achievement_content);
        }
        aVar.e(R.drawable.motivating_complete);
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_challenge_new_goals));
        aVar.b(context.getString(R.string.IDS_health_hold_weight));
        aVar.c(context.getString(R.string.IDS_wl_food_cancel));
        aVar.a(false);
        aVar.d(3);
    }

    private static void b(Context context, a aVar) {
        String string;
        aVar.a(R.string.IDS_hwh_home_goal_was_not_achieved);
        aVar.e(R.drawable.motivating_not_achieved);
        if (aVar.k() == 2) {
            string = context.getString(R.string.IDS_hwh_home_goal_was_not_achieved_content);
        } else {
            string = context.getString(R.string.IDS_hwh_home_goal_was_not_achieved_increase_content);
        }
        aVar.a(a(context, aVar, string));
        aVar.e(context.getString(R.string.IDS_hwh_home_set_new_weight_goal));
        aVar.b(context.getString(R.string.IDS_wl_food_cancel));
        aVar.a(false);
        aVar.d(2);
    }

    private static WeightViewDialog.Builder e(Context context, a aVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.weight_target_view, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.motivating_iv);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.target_iv);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.title_text_tv);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.content_text_tv);
        healthTextView.setText(aVar.i());
        healthTextView2.setText(aVar.c());
        if (aVar.o()) {
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            imageView2.setBackgroundResource(aVar.b());
        } else {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setBackgroundResource(aVar.b());
        }
        WeightViewDialog.Builder builder = new WeightViewDialog.Builder(context);
        builder.a(true).a(aVar.h()).a(viewInflate);
        return builder;
    }

    private static String c(a aVar) {
        return vei.b(UnitUtil.a(aVar.e()), 1);
    }

    private static String d(a aVar) {
        if (aVar.d() == -1.0f) {
            LogUtil.a("WeightDialogUtil", "getBodyPercentage is -1");
            return "";
        }
        return UnitUtil.e(Math.max(aVar.d(), 0.0f), 2, 0);
    }

    public static String a(Context context, a aVar, String str) {
        if (context == null || aVar == null) {
            LogUtil.j("WeightDialogUtil", "getMotivatingConstr context or dialogBean is null");
            return "";
        }
        String strC = c(aVar);
        String strD = d(aVar);
        if (LanguageUtil.br(context) || LanguageUtil.x(context)) {
            strD = "\u200f" + strD;
        }
        switch (aVar.a()) {
            case 1:
                return context.getString(R.string.IDS_hwh_home_before_starting_target_towing);
            case 2:
            case 3:
            case 4:
                return String.format(Locale.ENGLISH, str, strC, strD);
            case 5:
            case 7:
            case 8:
                return String.format(Locale.ENGLISH, str, strC, strD);
            case 6:
                return String.format(Locale.ENGLISH, str, strC);
            default:
                LogUtil.j("WeightDialogUtil", "getDialogContent is default");
                return "";
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50982c;
        private boolean d;
        private int h;
        private int i;
        private int o = 1;
        private int k = 2;
        private float e = -1.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f50980a = -1.0f;
        private String f = "";
        private String g = "";
        private String j = "";

        public int a() {
            return this.f50981b;
        }

        public void c(int i) {
            this.f50981b = i;
        }

        public int b() {
            return this.i;
        }

        public void e(int i) {
            this.i = i;
        }

        public int i() {
            return this.h;
        }

        public void a(int i) {
            this.h = i;
        }

        public String c() {
            return this.f50982c;
        }

        public void a(String str) {
            this.f50982c = str;
        }

        public int h() {
            return this.o;
        }

        public void d(int i) {
            this.o = i;
        }

        public boolean o() {
            return this.d;
        }

        public void a(boolean z) {
            this.d = z;
        }

        public int k() {
            return this.k;
        }

        public void b(int i) {
            this.k = i;
        }

        public float e() {
            return this.e;
        }

        public void c(float f) {
            this.e = f;
        }

        public float d() {
            return this.f50980a;
        }

        public void a(float f) {
            this.f50980a = f;
        }

        public String g() {
            return this.f;
        }

        public void e(String str) {
            this.f = str;
        }

        public String f() {
            return this.g;
        }

        public void b(String str) {
            this.g = str;
        }

        public String j() {
            return this.j;
        }

        public void c(String str) {
            this.j = str;
        }
    }

    public static int d(long j, long j2) {
        double dCurrentTimeMillis = (System.currentTimeMillis() - j) / (j2 - j);
        if (dCurrentTimeMillis >= 1.0d) {
            return 4;
        }
        if (dCurrentTimeMillis >= 0.75d) {
            return 3;
        }
        if (dCurrentTimeMillis >= 0.5d) {
            return 2;
        }
        return dCurrentTimeMillis >= 0.25d ? 1 : 0;
    }

    public static void d(WeightTargetDifferences weightTargetDifferences) {
        if (weightTargetDifferences == null) {
            ReleaseLogUtil.d("WeightDialogUtil", "initTargetId differences is null");
            return;
        }
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null) {
            ReleaseLogUtil.d("WeightDialogUtil", "initTargetId user is null differences ", weightTargetDifferences);
            return;
        }
        String strD = vng.d("weight_target_Id");
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.c("WeightDialogUtil", "initTargetId targetId ", strD);
            c(weightTargetDifferences.b() + mainUser.i());
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WeightDialogUtil", "setNewTarget targetId is null");
            return;
        }
        String strD = vng.d("weight_target_Id");
        if (TextUtils.isEmpty(strD)) {
            vng.a("weight_target_Id", str);
            return;
        }
        vng.a(new String[]{strD + 1, strD + 2, strD + 3, strD + 4});
        vng.a("weight_target_Id", str);
    }

    public static boolean a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WeightDialogUtil", "checkingProgress targetId is null");
            return false;
        }
        return vng.e(str + i);
    }

    public static void c(final Context context, boolean z) {
        String string;
        if (context == null) {
            return;
        }
        boolean zF = UnitUtil.f();
        if (zF) {
            string = String.format(context.getString(R.string.IDS_hwh_home_weight_bmi_value_set_two_imp), 703);
        } else {
            string = context.getString(R.string.IDS_hwh_home_weight_bmi_value_set_two);
        }
        if (!z) {
            e(context, string);
            return;
        }
        View viewInflate = View.inflate(context, R.layout.activity_weight_goal_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_show_calibration_height);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.bmi_des);
        if (zF) {
            healthTextView2.setText(String.format(context.getResources().getString(R.string.IDS_hwh_home_weight_bmi_value_two_imp), 703));
        } else {
            healthTextView2.setText(context.getResources().getString(R.string.IDS_hwh_home_weight_bmi_value_two));
        }
        final NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).c(R.string.IDS_hw_pressure_known, new View.OnClickListener() { // from class: veg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.a(view);
            }
        }).c();
        RelativeLayout relativeLayout = (RelativeLayout) noTitleCustomAlertDialogC.findViewById(com.huawei.ui.commonui.R.id.dialog_rlyt_content);
        relativeLayout.removeAllViews();
        relativeLayout.addView(viewInflate);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: vej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.d(context, noTitleCustomAlertDialogC, view);
            }
        });
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void d(Context context, NoTitleCustomAlertDialog noTitleCustomAlertDialog, View view) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundleKeyJumpUserInfoActivity", true);
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").d(bundle).b(context);
        noTitleCustomAlertDialog.dismiss();
    }

    public static void a(Context context) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getString(R.string.IDS_hwh_home_weight_target_cannot_same_the_weight)).a(context.getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: veb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vea
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vdv.a(dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    private static void e(final Context context, String str) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(str).d(context.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: vec
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.d(view);
            }
        }).a(context.getString(R.string.IDS_fitness_weight_notice_go_to_set), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.util.WeightDialogUtil$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdv.e(context, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ved
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vdv.b(dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    public static /* synthetic */ void e(Context context, View view) {
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(context);
        wvf.e().d(false);
    }
}
