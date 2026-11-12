package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class qrh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f46695b;

    public static boolean c() {
        return !TextUtils.equals("true", SharedPreferenceManager.e(BaseApplication.getContext(), "intelligentTrainingPlan", lua.d("trainingPlanPrivacy")));
    }

    public static boolean e() {
        return !TextUtils.equals("true", SharedPreferenceManager.e(BaseApplication.getContext(), "intelligentTrainingPlan", lua.d("competitionPrivacy")));
    }

    public static void a() {
        SharedPreferenceManager.b("intelligentTrainingPlan", lua.d("trainingPlanPrivacy"));
    }

    public static void e(final Context context, final DialogInterface.OnClickListener onClickListener) {
        if (context == null) {
            LogUtil.e("TrainingPlanDialogUtils", "showSmartTrainPrivacyDialog context is null");
            return;
        }
        f46695b = true;
        View viewInflate = View.inflate(context, R.layout.commonui_smart_train_privacy_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_health_info);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_sport_info);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_user_info);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_location_info);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.privacy_dialog_ai_info_layout);
        HealthTextView healthTextView5 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_ai_info);
        HealthTextView healthTextView6 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_competition_info);
        HealthTextView healthTextView7 = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_statement);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.privacy_dialog_health_info_layout);
        b(context, healthTextView);
        c(healthTextView2);
        healthTextView3.setText(d(R.string.IDS_train_plan_privacy_dialog_user_info, R.string.IDS_train_plan_privacy_dialog_user_info_content));
        healthTextView4.setText(d(R.string.IDS_train_plan_privacy_dialog_location_info, R.string.IDS_train_plan_privacy_dialog_location_info_content));
        healthTextView6.setText(d(R.string.IDS_train_plan_privacy_dialog_competition_info, R.string.IDS_train_plan_privacy_dialog_competition_info_content));
        int iJ = CommonUtil.j(LoginInit.getInstance(context).getAccountInfo(1009));
        if (1 == iJ) {
            linearLayout.setVisibility(0);
            Drawable drawableC = qre.c(R.drawable.ic_training_plan_ai);
            drawableC.setBounds(0, 0, drawableC.getMinimumWidth(), drawableC.getMinimumHeight());
            SpannableString spannableString = new SpannableString(String.format(" %s", qre.f(R.string.IDS_train_plan_privacy_dialog_ai_service_content)));
            spannableString.setSpan(new ImageSpan(drawableC), 0, 1, 1);
            healthTextView5.setText(spannableString);
        } else {
            linearLayout.setVisibility(8);
        }
        healthTextView7.setText(d(context, R.string.IDS_train_plan_privacy_dialog_statement));
        healthTextView7.setMovementMethod(LinkMovementMethod.getInstance());
        linearLayout2.setVisibility(8 != iJ ? 0 : 8);
        d(R.string.IDS_train_plan_privacy_dialog_title, context, viewInflate, new DialogInterface.OnClickListener() { // from class: qrl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qrh.e(context, onClickListener, dialogInterface, i);
            }
        });
    }

    static /* synthetic */ void e(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            SharedPreferenceManager.e(context, "intelligentTrainingPlan", lua.d("trainingPlanPrivacy"), "true", null);
        }
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    private static void b(Context context, HealthTextView healthTextView) {
        String strF = qre.f(R.string.IDS_train_plan_privacy_dialog_health_info_content);
        String strA = qre.a(R.string.IDS_train_plan_privacy_dialog_health_info, strF);
        String strA2 = qre.a(R.string.IDS_train_plan_privacy_dialog_health_info, "");
        SpannableString spannableString = new SpannableString(strA);
        a(spannableString, strA2);
        a(spannableString, strF);
        healthTextView.setPadding(0, qrs.d(context, 3.0f), 0, 0);
        healthTextView.setText(spannableString);
    }

    private static void c(HealthTextView healthTextView) {
        String strF = qre.f(R.string.IDS_train_plan_privacy_dialog_sport_info_text_motion_track);
        String strF2 = qre.f(R.string.IDS_train_plan_privacy_dialog_sport_info_text_vo2max);
        String strA = qre.a(R.string.IDS_train_plan_privacy_dialog_sport_info, qre.a(R.string.IDS_train_plan_privacy_dialog_sport_info_text, strF, strF2));
        String strA2 = qre.a(R.string.IDS_train_plan_privacy_dialog_sport_info, "");
        SpannableString spannableString = new SpannableString(strA);
        a(spannableString, strA2);
        a(spannableString, strF);
        a(spannableString, strF2);
        healthTextView.setText(spannableString);
    }

    private static void a(SpannableString spannableString, String str) {
        qri.b(spannableString, str, R.color.sleep_entry_card_text_color_90alpha);
        qri.a(spannableString, str);
    }

    public static void d(final Context context, final DialogInterface.OnClickListener onClickListener) {
        if (context == null) {
            LogUtil.e("TrainingPlanDialogUtils", "showCompetitionPrivacyDialog context is null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.commonui_competition_privacy_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.privacy_dialog_message);
        healthTextView.setText(d(context, R.string.IDS_event_privacy_dialog_content));
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        d(R.string.IDS_event_privacy_dialog_title, context, viewInflate, new DialogInterface.OnClickListener() { // from class: qrp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qrh.b(context, onClickListener, dialogInterface, i);
            }
        });
    }

    static /* synthetic */ void b(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            SharedPreferenceManager.e(context, "intelligentTrainingPlan", lua.d("competitionPrivacy"), "true", null);
        }
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    private static SpannableString b(int i, int i2) {
        SpannableString spannableString = new SpannableString(qre.a(i, qre.f(i2)));
        qri.b(spannableString, qre.a(i, ""), R.color.sleep_entry_card_text_color_90alpha);
        return spannableString;
    }

    private static SpannableString d(int i, int i2) {
        SpannableString spannableString = new SpannableString(qre.a(i, qre.f(i2)));
        a(spannableString, qre.a(i, ""));
        return spannableString;
    }

    private static void d(int i, Context context, View view, final DialogInterface.OnClickListener onClickListener) {
        if (!(context instanceof Activity)) {
            LogUtil.e("TrainingPlanDialogUtils", "showPrivacyDialog context instanceof activity false");
            return;
        }
        final Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("TrainingPlanDialogUtils", "showPrivacyDialog activity isFinishing or isDestroyed");
            return;
        }
        if (view == null) {
            LogUtil.e("TrainingPlanDialogUtils", "showPrivacyDialog contentView is null");
            return;
        }
        final CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(qre.f(i)).a(view).e(qre.f(R.string.IDS_device_release_user_profile_log_collect_agree).toUpperCase(), new DialogInterface.OnClickListener() { // from class: qrn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                qrh.e(onClickListener, dialogInterface, i2);
            }
        }).d(qre.f(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(), new DialogInterface.OnClickListener() { // from class: qro
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                qrh.a(onClickListener, dialogInterface, i2);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.setBottomPadding();
        customAlertDialogB.setColumnType((!qrs.ah(activity) || qrs.aa()) ? 20 : 12);
        final Observer[] observerArr = {new Observer() { // from class: qrq
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                qrh.c(customAlertDialogB, activity, str, objArr);
            }
        }};
        ObserverManagerUtil.d(observerArr[0], ObserveLabels.CONFIG_SCREEN_SIZE);
        customAlertDialogB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qrm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qrh.e(observerArr, dialogInterface);
            }
        });
        customAlertDialogB.show();
    }

    static /* synthetic */ void e(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    static /* synthetic */ void a(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    static /* synthetic */ void c(final CustomAlertDialog customAlertDialog, final Activity activity, String str, Object[] objArr) {
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        customAlertDialog.getBuildHandler().post(new Runnable() { // from class: qrv
            @Override // java.lang.Runnable
            public final void run() {
                qrh.c(activity, customAlertDialog);
            }
        });
    }

    static /* synthetic */ void c(Activity activity, CustomAlertDialog customAlertDialog) {
        if (activity == null) {
            LogUtil.a("TrainingPlanDialogUtils", "showPrivacyDialog activity is null, skip show");
        } else if (activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.a("TrainingPlanDialogUtils", "showPrivacyDialog activity is finishing or destroyed, skip show");
        } else {
            customAlertDialog.show();
        }
    }

    static /* synthetic */ void e(Observer[] observerArr, DialogInterface dialogInterface) {
        ObserverManagerUtil.c(observerArr[0]);
        observerArr[0] = null;
    }

    private static SpannableString d(final Context context, int i) {
        SpannableString spannableStringB = b(i, R.string.IDS_placeholders_hwh_privacy_statement);
        String strF = qre.f(R.string.IDS_placeholders_hwh_privacy_statement);
        qri.b(spannableStringB, strF, R.color.common_colorAccent);
        int iIndexOf = spannableStringB.toString().indexOf(strF);
        int length = strF.length() + iIndexOf;
        if (iIndexOf == -1) {
            return spannableStringB;
        }
        qri.d(spannableStringB, iIndexOf, length, new TypefaceSpan(Constants.FONT));
        qri.d(spannableStringB, iIndexOf, length, new ClickableSpan() { // from class: qrh.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("TrainingPlanDialogUtils", "getClickableSpan onClick");
                if (qrs.c(500)) {
                    LogUtil.a("TrainingPlanDialogUtils", "getClickableSpan isFastClick");
                    return;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity"));
                intent.putExtra("Agreement_key", "HealthPrivacy");
                intent.putExtra("Is_show_cancel_key", false);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(qre.e(R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        });
        return spannableStringB;
    }
}
