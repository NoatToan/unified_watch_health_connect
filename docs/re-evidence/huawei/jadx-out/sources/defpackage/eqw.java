package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class eqw {
    static /* synthetic */ void b(View view) {
    }

    public static void b(Context context) {
        LogUtil.a("DialogUtils", "showNotSupportMeasureDialog() enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_device_wifi_measure_not_support_prompt_msg).c(R.string.IDS_device_measureactivity_result_confirm, new View.OnClickListener() { // from class: eqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eqw.b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void e(Context context, View view, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || view == null) {
            iBaseResponseCallback.a(-1, "show dialog fail");
            return;
        }
        c(view);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.b(R.string.IDS_device_wifi_user_permission_dialog_title);
        builder.d(view);
        builder.a(context.getString(R.string.IDS_user_permission_ok).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: erk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iBaseResponseCallback.a(0, "click position button");
            }
        });
        builder.c(context.getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: eri
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iBaseResponseCallback.a(-1, "click negative button");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    private static void c(final View view) {
        if (view == null) {
            LogUtil.j("DialogUtils", "onDialogSizeChanged, dialogView is null");
        } else {
            view.post(new Runnable() { // from class: eqx
                @Override // java.lang.Runnable
                public final void run() {
                    eqw.a(view);
                }
            });
        }
    }

    static /* synthetic */ void a(View view) {
        int measuredHeight = view.getMeasuredHeight();
        int iB = (((int) (qqv.b(BaseApplication.getContext()) * 0.8f)) - view.getRootView().findViewById(R.id.custom_view_dialog_title_layout).getHeight()) - view.getRootView().findViewById(R.id.dialog_linearlayout1).getHeight();
        if (measuredHeight > iB) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iB;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    public static void d(Activity activity, boolean z, final IdialogButtonClickCallback idialogButtonClickCallback) {
        CustomTextAlertDialog customTextAlertDialogB;
        if (activity == null || !z) {
            customTextAlertDialogB = null;
        } else {
            CustomTextAlertDialog.Builder builderB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_btsdk_turn_on_location_new);
            String string = activity.getString(R.string.IDS_settings_button_cancal);
            Objects.requireNonNull(idialogButtonClickCallback);
            CustomTextAlertDialog.Builder builderA = builderB.a(string, new View.OnClickListener() { // from class: erd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    idialogButtonClickCallback.onCancelClick(view);
                }
            });
            String string2 = activity.getString(R.string.IDS_user_permission_ok);
            Objects.requireNonNull(idialogButtonClickCallback);
            customTextAlertDialogB = builderA.b(string2, new View.OnClickListener() { // from class: erb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    idialogButtonClickCallback.onClick(view);
                }
            }).b();
        }
        if (customTextAlertDialogB != null) {
            customTextAlertDialogB.setCancelable(false);
            if (customTextAlertDialogB.isShowing()) {
                return;
            }
            customTextAlertDialogB.show();
        }
    }

    public static void e(Context context, final IdialogButtonClickCallback idialogButtonClickCallback) {
        if (context == null) {
            return;
        }
        int i = R.string.IDS_open_network_and_bluetooth;
        if (qrs.ah(context)) {
            i = R.string.IDS_open_pad_network_and_bluetooth;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(i).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ere
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eqw.c(idialogButtonClickCallback, view);
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: erc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eqw.d(idialogButtonClickCallback, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void c(IdialogButtonClickCallback idialogButtonClickCallback, View view) {
        if (idialogButtonClickCallback != null) {
            idialogButtonClickCallback.onCancelClick(view);
        }
    }

    static /* synthetic */ void d(IdialogButtonClickCallback idialogButtonClickCallback, View view) {
        if (idialogButtonClickCallback != null) {
            idialogButtonClickCallback.onClick(view);
        }
    }

    public static void b() {
        LogUtil.a("DialogUtils", "showUnBindDeviceDialog in");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getContext());
        builder.b(R.string.IDS_device_wifi_release_auth_msg);
        builder.c(R.string.IDS_device_measureactivity_result_confirm, new View.OnClickListener() { // from class: erf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseApplication.getActivity().finish();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void c(Context context, final IdialogButtonClickCallback idialogButtonClickCallback) {
        if (context == null) {
            LogUtil.j("DialogUtils", "showUnbindThirdPartyDeviceDilog context is null");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(R.string.IDS_hw_health_wear_connect_device_unpair_button, new View.OnClickListener() { // from class: erg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eqw.a(idialogButtonClickCallback, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: eqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eqw.e(idialogButtonClickCallback, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    static /* synthetic */ void a(IdialogButtonClickCallback idialogButtonClickCallback, View view) {
        if (idialogButtonClickCallback != null) {
            idialogButtonClickCallback.onClick(view);
        }
    }

    static /* synthetic */ void e(IdialogButtonClickCallback idialogButtonClickCallback, View view) {
        if (idialogButtonClickCallback != null) {
            idialogButtonClickCallback.onCancelClick(view);
        }
    }
}
