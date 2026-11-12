package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.common.C;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes9.dex */
public class ipu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Float f37944a = Float.valueOf(38.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Float f37945c = Float.valueOf(32.0f);
    private static int[] d = {R.style.setting_goal_sport_target_text, R.style.settarget_unit_text_style, R.style.setting_goal_sport_target_bigger, R.style.settarget_unit_text_style_bigger};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37946b;
    private a e;
    private HealthTextView g;
    private HealthTextView h;
    private MotionGoal j = new MotionGoal();
    private boolean f = false;
    private HealthOpenSDK i = null;
    private HealthSeekBar.OnSeekBarChangeListener k = new HealthSeekBar.OnSeekBarChangeListener() { // from class: ipu.5
        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
            LogUtil.a("Step_GoalSettingDialogUtil", "onProgressChanged() value:", Integer.valueOf(i));
            int i2 = ((i / 1000) * 1000) + 2000;
            ipu.this.e(i2);
            ipu.this.j.setGoalType(1);
            ipu.this.j.setStepGoal(i2);
        }
    };

    public void e(Handler handler) {
        String strE = buh.e("is_goal_setting_dialog_show");
        LogUtil.a("Step_GoalSettingDialogUtil", "goalFirstInit ", strE, "mGoalStep ", Integer.valueOf(this.f37946b));
        if ("".equals(strE)) {
            qgm.c("900200006", new c(this, handler));
        }
    }

    public void a(Context context, Handler handler) {
        LogUtil.a("Step_GoalSettingDialogUtil", "mGoalStep ", Integer.valueOf(this.f37946b));
        if (this.f37946b == -1) {
            handler.sendEmptyMessageDelayed(4022, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ipu> f37949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Handler> f37950c;

        public c(ipu ipuVar, Handler handler) {
            this.f37949b = new WeakReference<>(ipuVar);
            this.f37950c = new WeakReference<>(handler);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Step_GoalSettingDialogUtil", "GoalInfoCommonListener Enter");
            ipu ipuVar = this.f37949b.get();
            Handler handler = this.f37950c.get();
            if (!(obj instanceof Integer)) {
                LogUtil.j("Step_GoalSettingDialogUtil", "data not inatnceOf integer");
                return;
            }
            if (ipuVar != null) {
                ipuVar.f37946b = ((Integer) obj).intValue();
                if (handler == null) {
                    LogUtil.e("Step_GoalSettingDialogUtil", "GoalInfoCommonListener mHandler == null");
                    return;
                } else {
                    handler.sendEmptyMessage(4023);
                    return;
                }
            }
            LogUtil.e("Step_GoalSettingDialogUtil", "GoalInfoCommonListener mainActivity == null");
        }
    }

    public void e(final Context context) {
        buh.d("is_goal_setting_dialog_show", String.valueOf(false));
        this.j.setStepGoal(10000);
        this.i = fga.d(BaseApplication.getContext()).e();
        this.e = new a("getGoalNotifiState");
        View viewB = b(context);
        e(this.j.getStepGoal());
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.d(viewB).d(R.string.IDS_social_clearup_storage_button_finish, new View.OnClickListener() { // from class: ipu.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Step_GoalSettingDialogUtil", "mGoalsInfo ", Integer.valueOf(ipu.this.j.getStepGoal()));
                if (ipu.this.e != null) {
                    ipu.this.i.e(ipu.this.e);
                }
                ipu.this.e();
                LogUtil.a("Step_GoalSettingDialogUtil", "buildGoalStepDialog mIsOpenCompleteGoad ", Boolean.valueOf(ipu.this.f));
                ipu.this.b();
                ipu.this.d(context);
            }
        }).c(R.string.IDS_track_not_edit, new View.OnClickListener() { // from class: ipu.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HashMap map = new HashMap(2);
                map.put("click", 1);
                map.put("type", 1);
                lmf.d().c(context, AnalyticsValue.REMIND_DIALOG_SELECT_BUTTON_DO_NOT_SET.value(), map, 0);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        customViewDialogD.show();
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 1);
        lmf.d().c(context, AnalyticsValue.REMIND_DIALOG_SHOW_COUNT.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        qgm.b("900200006", this.j.getStepGoal());
        LogUtil.a("Step_GoalSettingDialogUtil", "saveStepGoalValue step is ", Integer.valueOf(this.j.getStepGoal()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 20);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (System.currentTimeMillis() > timeInMillis) {
            calendar.add(5, 1);
            timeInMillis = calendar.getTimeInMillis();
        }
        LogUtil.a("Step_GoalSettingDialogUtil", "setting time ", ltb.e(timeInMillis));
        if (this.f) {
            vym.a(1000, timeInMillis, 86400000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 1);
        lmf.d().c(context, AnalyticsValue.REMIND_DIALOG_SELECT_BUTTON_DONE.value(), map, 0);
        HashMap map2 = new HashMap(2);
        map2.put("click", 1);
        map2.put(MedalConstants.EVENT_STEPS, Integer.valueOf(this.j.getStepGoal()));
        lmf.d().c(context, AnalyticsValue.REMIND_DIALOG_SELECT_STEP_COUNT.value(), map2, 0);
    }

    private View b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(com.huawei.health.R.layout.dialog_target_setting_view, (ViewGroup) null);
        this.g = (HealthTextView) viewInflate.findViewById(com.huawei.health.R.id.step_target_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(com.huawei.health.R.id.calorie_transfer_img);
        this.h = (HealthTextView) viewInflate.findViewById(com.huawei.health.R.id.target_calorie_exchange);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(com.huawei.health.R.id.goal_setting_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(com.huawei.health.R.id.goal_setting_tip);
        if (qrs.ac()) {
            HealthTextView healthTextView3 = this.h;
            Float f = f37945c;
            healthTextView3.setTextSize(1, f.floatValue());
            healthTextView.setTextSize(1, f37944a.floatValue());
            healthTextView2.setTextSize(1, f.floatValue());
        }
        if (LanguageUtil.ba(context)) {
            BitmapDrawable bitmapDrawableE = qqz.e(context, com.huawei.health.R.drawable.img_running);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
            }
        } else {
            imageView.setImageResource(com.huawei.health.R.drawable.img_running);
        }
        HealthSeekBar healthSeekBar = (HealthSeekBar) viewInflate.findViewById(com.huawei.health.R.id.target_setting_dialog_progressbar);
        healthSeekBar.setTouchable(true);
        healthSeekBar.setOnSeekBarChangeListener(this.k);
        healthSeekBar.setMax(18000);
        int stepGoal = this.j.getStepGoal() - 2000;
        LogUtil.a("Step_GoalSettingDialogUtil", "mStepGoalSeekbar.setProgress: ", Integer.valueOf(stepGoal), " mGoalsInfo.getStepGoal() ", Integer.valueOf(this.j.getStepGoal()));
        healthSeekBar.setProgress(stepGoal);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        float fD = ((float) uhv.d(i)) / 1000.0f;
        String strE = UnitUtil.e(Math.round(fD), 1, 0);
        int iB = uhv.b(fD, 258, 1);
        LogUtil.a("Step_GoalSettingDialogUtil", "calorieValue=", strE, " duration= ", Integer.valueOf(iB));
        double d2 = iB;
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.health.R.plurals.IDS_track_run_time, Integer.parseInt(UnitUtil.e(d2, 1, 0)), UnitUtil.e(d2, 1, 0));
        HealthTextView healthTextView = this.h;
        if (healthTextView != null) {
            healthTextView.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_track_cal_exchange), strE, quantityString));
        } else {
            LogUtil.j("Step_GoalSettingDialogUtil", "mRunSportTimeString == null");
        }
        try {
            String quantityString2 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_me_other_target_steps, this.j.getStepGoal(), String.valueOf(this.j.getStepGoal()));
            HealthTextView healthTextView2 = this.g;
            if (healthTextView2 != null) {
                healthTextView2.setText(quantityString2);
                b(this.g, R.plurals.IDS_hwh_me_other_target_steps, i);
            } else {
                LogUtil.j("Step_GoalSettingDialogUtil", "mGoalValue == null");
            }
        } catch (MissingFormatArgumentException e) {
            LogUtil.e("Step_GoalSettingDialogUtil", "refreshStepGoalView exception: ", LogAnonymous.b(e));
        }
    }

    private void b(HealthTextView healthTextView, int i, int i2) {
        LogUtil.a("Step_GoalSettingDialogUtil", "setDifferentTextSize() ");
        String strE = UnitUtil.e(i2, 1, 0);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(i, i2, strE);
        SpannableString spannableString = new SpannableString(quantityString);
        if (qrs.ac()) {
            qri.a(spannableString, quantityString, new TextAppearanceSpan(BaseApplication.getContext(), d[2]));
            qri.a(spannableString, strE, new TextAppearanceSpan(BaseApplication.getContext(), d[3]));
        } else {
            qri.a(spannableString, quantityString, new TextAppearanceSpan(BaseApplication.getContext(), d[0]));
            qri.a(spannableString, strE, new TextAppearanceSpan(BaseApplication.getContext(), d[1]));
        }
        healthTextView.setText(spannableString);
    }

    class a implements IExecuteResult {
        String d;

        a(String str) {
            this.d = str;
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("Step_GoalSettingDialogUtil", "onSuccess initSDK ", this.d);
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                String str = this.d;
                if (str == null || !str.equals("getGoalNotifiState")) {
                    return;
                }
                ipu.this.f = bundle.getBoolean("goalNotifiState");
                LogUtil.a("Step_GoalSettingDialogUtil", "onSuccess isOpenCompleteGoad :", Boolean.valueOf(ipu.this.f));
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.j("Step_GoalSettingDialogUtil", "OpenSdkCommonCallback onFailed ", this.d);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.j("Step_GoalSettingDialogUtil", "OpenSdkCommonCallback onServiceException ", this.d);
        }
    }
}
