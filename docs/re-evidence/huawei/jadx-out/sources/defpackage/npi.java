package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huawei.android.hms.hwid.R;
import com.huawei.android.os.SystemPropertiesEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.openalliance.ad.constant.ParamConstants;

/* JADX INFO: loaded from: classes3.dex */
public class npi {
    public static int d(Context context) {
        if (!b()) {
            return a(context);
        }
        if (context == null) {
            nox.b("UIUtil", "getDialogThemeId, context is null", true);
            return 3;
        }
        if (b(context) != 0) {
            nox.b("UIUtil", "getDialogThemeId, NEEDLESS_SETTING_THEME", true);
            return 0;
        }
        nox.b("UIUtil", "getDialogThemeId, THEME_HOLO_LIGHT", true);
        return 3;
    }

    public static int b(Context context) {
        if (!b()) {
            return a(context);
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public static int a(Context context) {
        nox.b("UIUtil", "getDialogThemeId, non huawei rom", true);
        if (c(context)) {
            nox.b("UIUtil", "getDialogThemeId, non huawei rom , is DarkTheme", true);
            return 4;
        }
        nox.b("UIUtil", "getDialogThemeId, non huawei rom , is not DarkTheme", true);
        return 5;
    }

    private static boolean b() {
        boolean z = !TextUtils.isEmpty(nom.y());
        nox.b("UIUtil", "isHuawei " + z, true);
        return z;
    }

    public static void e(Dialog dialog) {
        if (nos.b()) {
            try {
                dialog.getWindow().getAttributes().getClass().getDeclaredField(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE).set(dialog.getWindow().getAttributes(), 1);
            } catch (RuntimeException e) {
                nox.a("UIUtil", "RuntimeException: " + e.getClass().getSimpleName(), true);
            } catch (Exception e2) {
                nox.a("UIUtil", "Exception: " + e2.getClass().getSimpleName(), true);
            }
        }
    }

    public static AlertDialog.Builder b(final Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        nox.b("UIUtil", "createRefusePermissionBuild", true);
        noi.d dVar = new noi.d(context, d(context));
        View viewInflate = View.inflate(context, R.layout.hwid_auth_refuse_permission_dialog, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        if (nos.e()) {
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline7));
        }
        textView.setText(str);
        ((TextView) viewInflate.findViewById(R.id.text2)).setText(str2);
        dVar.setView(viewInflate).setPositiveButton(R.string.CS_go_settings, new DialogInterface.OnClickListener() { // from class: npi.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                npi.f(context);
            }
        }).setNegativeButton(android.R.string.cancel, onClickListener);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (context == null) {
            nox.a("UIUtil", "context is null.", true);
        } else {
            b(context, Integer.MIN_VALUE);
        }
    }

    private static void b(Context context, int i) {
        if (context == null) {
            nox.a("UIUtil", "context is null.", true);
            return;
        }
        try {
            nox.b("UIUtil", "gotoAppDetailForResult", true);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            if (i < 0) {
                context.startActivity(intent);
            } else {
                ((Activity) context).startActivityForResult(intent, i);
            }
        } catch (Exception e) {
            nox.a("UIUtil", e.getClass().getSimpleName(), true);
        }
    }

    public static AlertDialog.Builder e(Context context) {
        if (context == null) {
            nox.a("UIUtil", "createNoNetDialog context is null", true);
            return null;
        }
        noi.d dVar = new noi.d(context, d(context));
        dVar.setMessage(R.string.CS_network_connect_error);
        dVar.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: npi.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return dVar;
    }

    public static boolean c(Context context) {
        Resources resources;
        return (context == null || (resources = context.getResources()) == null || b(context, "hwid_check_theme_color") != resources.getColor(R.color.hwid_check_theme_dark_color)) ? false : true;
    }

    private static int b(Context context, String str) {
        return context.getResources().getColor(context.getResources().getIdentifier(context.getPackageName() + ":color/" + str, null, null));
    }

    public static String g(Context context) {
        if (h(context.getApplicationContext())) {
            return "&themeName=dark";
        }
        return "&themeName=huawei";
    }

    private static boolean h(Context context) {
        boolean zJ = j(context);
        boolean zC = c(context);
        boolean zM = m(context);
        nox.b("UIUtil", "isHonorNight: " + zJ, true);
        nox.b("UIUtil", "isDarkTheme: " + zC, true);
        nox.b("UIUtil", "isNightMode: " + zM, true);
        return zJ || zC || zM;
    }

    private static boolean j(Context context) {
        if (nos.e()) {
            String str = SystemPropertiesEx.get(SystemUtils.PRODUCT_BRAND);
            boolean z = SystemPropertiesEx.getBoolean("ro.config.hw_themeInsulate", false);
            if ("honor".equalsIgnoreCase(str) && !z && ((UiModeManager) context.getSystemService(UiModeManager.class)).getNightMode() == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(Context context) {
        Resources resources;
        Configuration configuration;
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (configuration.uiMode & 48) != 32) ? false : true;
    }
}
