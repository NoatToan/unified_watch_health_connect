package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.HealthDataInputDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import defpackage.qra;
import defpackage.qre;
import defpackage.vng;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes43.dex */
public class vls {
    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void c(View view) {
    }

    static /* synthetic */ void e(DialogInterface dialogInterface, int i) {
    }

    public static void a(ResponseCallback<Integer> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "callbackError callback is null");
        } else {
            responseCallback.onResponse(-1, -1);
        }
    }

    public static void b(ResponseCallback<Integer> responseCallback, int i) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "callbackSuccess callback is null state ", Integer.valueOf(i));
        } else {
            responseCallback.onResponse(0, Integer.valueOf(i));
        }
    }

    private static void a(final ResponseCallback<Integer> responseCallback, final AtomicInteger atomicInteger, BaseDialog baseDialog) {
        baseDialog.show();
        baseDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vmu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vls.b((ResponseCallback<Integer>) responseCallback, atomicInteger.get());
            }
        });
        b(responseCallback, 0);
    }

    public static void i(final Context context, final ResponseCallback<Integer> responseCallback) {
        LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: vme
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                vls.d(responseCallback, context, i, obj);
            }
        }, "");
    }

    static /* synthetic */ void d(final ResponseCallback responseCallback, final Context context, int i, Object obj) {
        ReleaseLogUtil.c("HealthWeight_WeightDialogUtils", "showUserInfoDialog onResponse result ", Integer.valueOf(i));
        if (i != 0) {
            a((ResponseCallback<Integer>) responseCallback);
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: vmq
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i2, Object obj2) {
                    vls.d(responseCallback, context, i2, (dnj) obj2);
                }
            });
        }
    }

    static /* synthetic */ void d(final ResponseCallback responseCallback, final Context context, int i, dnj dnjVar) {
        LogUtil.b("HealthWeight_WeightDialogUtils", "showUserInfoDialog onResponse errorCode ", Integer.valueOf(i), " user ", dnjVar);
        if (i == 0 && dnjVar != null && dnjVar.t()) {
            b((ResponseCallback<Integer>) responseCallback, -1);
        } else {
            HandlerExecutor.b(new Runnable() { // from class: vml
                @Override // java.lang.Runnable
                public final void run() {
                    qra.c(vng.a(context), false, new IBaseResponseCallback() { // from class: vmk
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i2, Object obj) {
                            vls.c(responseCallback, i2, obj);
                        }
                    }, qre.e(R.color.light_fasting_body_state_bg));
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.b("HealthWeight_WeightDialogUtils", "showUserInfoDialog onResponse resultCode ", Integer.valueOf(i), " object ", obj);
        iuo.y();
        if (i == -1) {
            b((ResponseCallback<Integer>) responseCallback, 1);
        } else if (i == 0) {
            b((ResponseCallback<Integer>) responseCallback, 2);
        } else {
            b((ResponseCallback<Integer>) responseCallback, -1);
        }
    }

    public static void h(Context context, ResponseCallback<Integer> responseCallback) {
        final Context contextA = vng.a(context);
        final dnb dnbVar = new dnb();
        final HealthDataInputDialog healthDataInputDialogA = new HealthDataInputDialog(contextA).e(qre.e(R.color.weight_primary_color)).c(qre.f(R.string.IDS_hwh_home_weight_guide_title)).b(qre.f(R.string.IDS_hwh_home_weight_guide_desc)).a(b(dnbVar));
        if (LanguageUtil.j(BaseApplication.b())) {
            healthDataInputDialogA.b(true);
        }
        healthDataInputDialogA.d(new HealthDataInputDialog.PositiveBtnClickListener() { // from class: vlw
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.PositiveBtnClickListener
            public final void onClick(List list) {
                vls.e(contextA, healthDataInputDialogA, dnbVar);
            }
        }).c(new View.OnClickListener() { // from class: vmb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.a(healthDataInputDialogA, view);
            }
        });
        a(responseCallback, new AtomicInteger(1), healthDataInputDialogA);
        vlt.d(0);
    }

    static /* synthetic */ void a(HealthDataInputDialog healthDataInputDialog, View view) {
        healthDataInputDialog.dismiss();
        vlt.d(1);
    }

    private static HealthDataInputDialog.e b(final dnb dnbVar) {
        HealthDataInputDialog.e eVarE;
        HealthDataInputDialog.DataSetFormatter dataSetFormatter = new HealthDataInputDialog.DataSetFormatter() { // from class: vlx
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.DataSetFormatter
            public final String format(int i) {
                return UnitUtil.e(i, 1, 0);
            }
        };
        HealthDataInputDialog.SelectedValueProcessor selectedValueProcessor = new HealthDataInputDialog.SelectedValueProcessor() { // from class: vls.4
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public int process(int i, int i2) {
                return i;
            }

            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public String format(int i) {
                double dC = vng.c(i);
                int iE = UnitUtil.e();
                if (iE == 1) {
                    dnbVar.af(UnitUtil.b(dC));
                } else if (iE == 3) {
                    dnbVar.af(UnitUtil.i(dC));
                } else {
                    dnbVar.af(dC);
                }
                return UnitUtil.e(dC, 1, 1);
            }
        };
        String strE = vei.e(-1.0d, false);
        int iE = UnitUtil.e();
        if (iE == 1) {
            eVarE = new HealthDataInputDialog.e((int) UnitUtil.j(10.0d), (int) UnitUtil.j(251.0d), dataSetFormatter, selectedValueProcessor).e(strE);
        } else if (iE == 3) {
            eVarE = new HealthDataInputDialog.e(22, 552, dataSetFormatter, selectedValueProcessor).e(strE);
        } else {
            eVarE = new HealthDataInputDialog.e(10, 251, dataSetFormatter, selectedValueProcessor).e(strE);
        }
        eVarE.e(1);
        eVarE.d(vng.e(65.0d));
        return eVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Context context, final HealthDataInputDialog healthDataInputDialog, final dnb dnbVar) {
        vlt.d(2);
        LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: vly
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                vls.c(healthDataInputDialog, context, dnbVar, i, obj);
            }
        }, "");
    }

    static /* synthetic */ void c(final HealthDataInputDialog healthDataInputDialog, final Context context, final dnb dnbVar, int i, Object obj) {
        ReleaseLogUtil.c("HealthWeight_WeightDialogUtils", "showInputDialogLogin onResponse result ", Integer.valueOf(i));
        if (i != 0) {
            return;
        }
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: vmp
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i2, Object obj2) {
                vls.b(healthDataInputDialog, context, dnbVar, i2, (dnj) obj2);
            }
        });
    }

    static /* synthetic */ void b(HealthDataInputDialog healthDataInputDialog, final Context context, dnb dnbVar, int i, dnj dnjVar) {
        ReleaseLogUtil.c("HealthWeight_WeightDialogUtils", "showInputDialogLogin onResponse errorCode ", Integer.valueOf(i));
        healthDataInputDialog.dismiss();
        if (i != 0 || dnjVar == null) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.health.weight.util.WeightDialogUtils$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    qra.c(context, false, null, qre.e(R.color.light_fasting_body_state_bg));
                }
            });
            return;
        }
        dso dsoVar = new dso();
        dsoVar.setBodyFatRat(20.0f);
        dsoVar.setWeight((float) dnbVar.av());
        dsoVar.d(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        dsoVar.setStartTime(jCurrentTimeMillis);
        dsoVar.setEndTime(jCurrentTimeMillis);
        enw enwVar = new enw(10006);
        enwVar.b(dnjVar);
        enwVar.onDataChanged(vng.a(), dsoVar);
        vlt.a(2, 4, new String[]{"weight"});
    }

    public static void a(final Context context, final ResponseCallback<Integer> responseCallback) {
        if (!TextUtils.isEmpty(vng.b(10006, "health_weight_upto_user_info_dialog")) || !Utils.h()) {
            b(responseCallback, -1);
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vmr
                @Override // java.lang.Runnable
                public final void run() {
                    vls.a(context, (ResponseCallback<Integer>) responseCallback);
                }
            });
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.weight_auto_update_status");
        if (userPreference != null && "1".equals(userPreference.getValue())) {
            b(responseCallback, -1);
        } else {
            HandlerExecutor.b(new Runnable() { // from class: vmv
                @Override // java.lang.Runnable
                public final void run() {
                    vls.d(context, responseCallback);
                }
            });
        }
    }

    static /* synthetic */ void d(Context context, final ResponseCallback responseCallback) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(vng.a(context)).a(qre.f(R.string.IDS_smartcard_auto_update_weight_content)).a(qre.f(R.string.IDS_common_notification_know_tips).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: vmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.b(view);
            }
        }).c();
        if (noTitleCustomAlertDialogC == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showAutoUpdateWeightDialog dialog is null activity ", context, " callback ", responseCallback);
            a((ResponseCallback<Integer>) responseCallback);
        } else {
            noTitleCustomAlertDialogC.show();
            noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vlz
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    vls.e(responseCallback, dialogInterface);
                }
            });
            b((ResponseCallback<Integer>) responseCallback, 0);
        }
    }

    static /* synthetic */ void b(View view) {
        vng.a(10006, "health_weight_upto_user_info_dialog", String.valueOf(true));
        vng.a(10000, "health_weight_auto_update", "1");
        ThreadPoolManager.c().execute(new Runnable() { // from class: vma
            @Override // java.lang.Runnable
            public final void run() {
                vls.c();
            }
        });
    }

    static /* synthetic */ void c() {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_auto_update_status");
        hiUserPreference.setValue("1");
        HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, DialogInterface dialogInterface) {
        vng.a(10006, "health_weight_upto_user_info_dialog", String.valueOf(false));
        b((ResponseCallback<Integer>) responseCallback, 1);
    }

    public static void f(final Context context, final ResponseCallback<Integer> responseCallback) {
        if (!wvf.a(Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "WEIGHT_SET_GOAL_DIALOG", 2419200000L)) {
            b(responseCallback, -1);
            return;
        }
        View viewA = qre.a(BaseApplication.b(), R.layout.weight_set_goal_dialog, (ViewGroup) null);
        if (viewA == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showSetGoalDialog rootView is null activity ", context, " callback ", responseCallback);
            a(responseCallback);
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        final CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(vng.a(context)).a(viewA).b();
        viewA.findViewById(R.id.set_goal).setOnClickListener(new View.OnClickListener() { // from class: vmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.a(atomicInteger, context, customAlertDialogB, responseCallback, view);
            }
        });
        viewA.findViewById(R.id.next_show).setOnClickListener(new View.OnClickListener() { // from class: vmi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.c(customAlertDialogB, context, responseCallback, view);
            }
        });
        if (customAlertDialogB == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showSetGoalDialog dialog is null activity ", context, " callback ", responseCallback);
            a(responseCallback);
        } else {
            a(responseCallback, atomicInteger, customAlertDialogB);
        }
    }

    static /* synthetic */ void a(AtomicInteger atomicInteger, Context context, CustomAlertDialog customAlertDialog, ResponseCallback responseCallback, View view) {
        atomicInteger.set(2);
        iun.b(context, "#/AddTarget", (Bundle) null);
        if (customAlertDialog == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showSetGoalDialog dialog is null view ", view, " activity ", context, " callback ", responseCallback);
        } else {
            customAlertDialog.dismiss();
        }
    }

    static /* synthetic */ void c(CustomAlertDialog customAlertDialog, Context context, ResponseCallback responseCallback, View view) {
        if (customAlertDialog == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showSetGoalDialog dialog is null view ", view, " activity ", context, " callback ", responseCallback);
        } else {
            customAlertDialog.dismiss();
        }
    }

    public static void b(Context context, ResponseCallback<Integer> responseCallback) {
        final Context contextA = vng.a(context);
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(contextA).a(qre.f(R.string.IDS_hw_plugin_device_selection_click_bind_my_device_select)).a(qre.f(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: vmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.c(atomicInteger, contextA, view);
            }
        }).d(qre.f(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: vmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.a(view);
            }
        }).c();
        if (noTitleCustomAlertDialogC == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showBindDeviceDialog dialog is null activity ", context, " callback ", responseCallback);
            a(responseCallback);
        } else {
            a(responseCallback, atomicInteger, noTitleCustomAlertDialogC);
        }
    }

    static /* synthetic */ void c(AtomicInteger atomicInteger, Context context, View view) {
        atomicInteger.set(2);
        vlt.b();
        etn.a(context, "HDK_WEIGHT");
    }

    public static void g(final Context context, final ResponseCallback<Integer> responseCallback) {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            a(context, responseCallback, currentUser);
        } else {
            HiHealthManager.d(BaseApplication.b()).fetchUserData(new HiCommonListener() { // from class: vls.1
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), CommonUtils.j("0"));
                    if (!njy.b(obj, HiUserInfo.class)) {
                        vls.a(context, (ResponseCallback<Integer>) responseCallback, (Object) null);
                        return;
                    }
                    for (HiUserInfo hiUserInfo : (List) obj) {
                        if (hiUserInfo != null && hiUserInfo.getRelateType() == 0) {
                            vls.a(context, (ResponseCallback<Integer>) responseCallback, hiUserInfo);
                            return;
                        }
                    }
                    vls.a(context, (ResponseCallback<Integer>) responseCallback, (Object) null);
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), i);
                    vls.a(context, (ResponseCallback<Integer>) responseCallback, (Object) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, final ResponseCallback<Integer> responseCallback, final Object obj) {
        if (etn.d(obj) || !qra.c()) {
            b(responseCallback, -1);
            return;
        }
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: vmc
                @Override // java.lang.Runnable
                public final void run() {
                    vls.a(context, (ResponseCallback<Integer>) responseCallback, obj);
                }
            });
            return;
        }
        final Context contextA = vng.a(context);
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(contextA).a(R.string.IDS_profile_dialog_title).b(R.string.IDS_profile_dialog_content).a(R.string.IDS_profile_dialog_go_perfect, new View.OnClickListener() { // from class: vmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.b(atomicInteger, contextA, view);
            }
        }).e(R.string.IDS_main_btn_state_ignore, new View.OnClickListener() { // from class: vmd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vls.c(view);
            }
        }).b();
        if (customTextAlertDialogB == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showUserInfoDialogForMeasureStart dialog is null activity ", context, " callback ", responseCallback, " object ", obj);
            a(responseCallback);
        } else {
            customTextAlertDialogB.setCancelable(false);
            a(responseCallback, atomicInteger, customTextAlertDialogB);
            etn.b();
        }
    }

    static /* synthetic */ void b(AtomicInteger atomicInteger, Context context, View view) {
        atomicInteger.set(2);
        etn.e(context, true);
    }

    public static void j(Context context, ResponseCallback<Integer> responseCallback) {
        if (!qra.c() || etn.d(MultiUsersManager.INSTANCE.getCurrentUser()) || qra.e("key_person_info_setting_dialog_show_count_") > 2) {
            b(responseCallback, -1);
            return;
        }
        String strB = vng.b(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "isShowDetailDialog");
        if (TextUtils.isEmpty(strB)) {
            strB = String.valueOf(true);
        }
        if (!String.valueOf(true).equals(strB)) {
            b(responseCallback, -1);
            return;
        }
        View viewA = qre.a(BaseApplication.b(), R.layout.dialog_perfected_user_info, (ViewGroup) null);
        if (viewA == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showUserInfoDialogForMeasureFinish rootView is null activity ", context, " callback ", responseCallback);
            a(responseCallback);
            return;
        }
        final Context contextA = vng.a(context);
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(contextA).a(viewA).d(R.string.IDS_userInfo_dialog_title).d(R.string.IDS_profile_dialog_go_perfect, new DialogInterface.OnClickListener() { // from class: vmh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                vls.e(atomicInteger, contextA, dialogInterface, i);
            }
        }).a(R.string.IDS_settings_button_cancal_ios_btn, new DialogInterface.OnClickListener() { // from class: vmm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                vls.e(dialogInterface, i);
            }
        }).b();
        if (customAlertDialogB == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showUserInfoDialogForMeasureFinish dialog is null activity ", context, " callback ", responseCallback);
            a(responseCallback);
        } else {
            customAlertDialogB.setCancelable(false);
            ((HealthCheckBox) viewA.findViewById(R.id.remind_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.weight.util.WeightDialogUtils$$ExternalSyntheticLambda4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    vng.a(OrderStatusCode.ORDER_STATE_PARAM_ERROR, "isShowDetailDialog", String.valueOf(!z));
                }
            });
            a(responseCallback, atomicInteger, customAlertDialogB);
        }
    }

    static /* synthetic */ void e(AtomicInteger atomicInteger, Context context, DialogInterface dialogInterface, int i) {
        atomicInteger.set(2);
        etn.e(context, false);
    }

    public static void b(Context context, ResponseCallback<Integer> responseCallback, float f, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showGoalMotivationDialog json ", str, " activity ", context, " callback ", responseCallback, " bodyWeightDiff ", Float.valueOf(f), " progress ", Integer.valueOf(i));
            a(responseCallback);
            return;
        }
        WeightTargetDifferences weightTargetDifferences = (WeightTargetDifferences) HiJsonUtil.d(str, WeightTargetDifferences.class);
        if (weightTargetDifferences == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDialogUtils", "showGoalMotivationDialog differences is null activity ", context, " callback ", responseCallback, " bodyWeightDiff ", Float.valueOf(f), " progress ", Integer.valueOf(i), " json ", str);
            a(responseCallback);
            return;
        }
        long jA = weightTargetDifferences.a();
        long jB = weightTargetDifferences.b();
        LogUtil.b("HealthWeight_WeightDialogUtils", "showGoalMotivationDialog beginDate ", Long.valueOf(jA), " finishDate ", Long.valueOf(jB), " activity ", context, " callback ", responseCallback, " bodyWeightDiff ", Float.valueOf(f), " progress ", Integer.valueOf(i), " json ", str);
        if (jA <= 0 || jB <= 0) {
            a(responseCallback);
            return;
        }
        vdv.a aVar = new vdv.a();
        aVar.b(weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS ? 2 : 1);
        aVar.c(f);
        aVar.a(i);
        vdv.b(vng.a(context), jA, jB, aVar, responseCallback);
    }
}
