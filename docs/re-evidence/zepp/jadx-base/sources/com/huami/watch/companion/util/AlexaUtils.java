package com.huami.watch.companion.util;

import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.amazon.alexa.avs.AlexaSupportUtils;
import com.amazon.alexa.avs.util.I18nUtil;
import com.huami.account.service.AccountService;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.third.alexa.AlexaBind;
import com.huami.third.alexa.AuthCallback;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.ui.fragment.NewAlexaAuthTipDialogFragment;
import com.huami.watch.companion.util.AlexaUtils;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
public class AlexaUtils {
    public static final String KEY_ALEX_AUTH_TIP = "AlexaAuthTip";
    private static final String a = "AlexaUtils";
    private static final String b = "KEY_ALEXA_HAS_AUTHORIZED";
    private static SharedPreferences c;

    public class a implements AuthCallback {
        @Override // com.huami.third.alexa.AuthCallback
        public void onLoginFailed(@NotNull FragmentActivity fragmentActivity) {
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLoginSuccess(@NotNull FragmentActivity fragmentActivity, @NotNull String str) {
            AlexaUtils.setAlexaAuthorized(!TextUtils.isEmpty(str));
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLogoutFailed(@NotNull FragmentActivity fragmentActivity) {
        }

        @Override // com.huami.third.alexa.AuthCallback
        public void onLogoutSuccess(@NotNull FragmentActivity fragmentActivity) {
            Broadcaster.sendLocalBroadcast(fragmentActivity, ConstantsKt.LOGOUT_ACTION);
            AlexaUtils.setAlexaAuthorized(false);
        }
    }

    private static String c(Context context, int i) {
        return context.getResources().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        Box.get().put(KEY_ALEX_AUTH_TIP, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, DialogInterface dialogInterface, int i) {
        Box.get().put(KEY_ALEX_AUTH_TIP, false);
        AlexaBind.open(context, "", "", new a());
    }

    public static String getLoginCountry(Context context) {
        String value = ((AccountService) KoinJavaComponent.get(AccountService.class)).getUserArea().getValue();
        if (TextUtils.isEmpty(value) || value.equalsIgnoreCase("unknown")) {
            value = I18nUtil.getLocaleCountry(context);
        }
        Log.d(a, "Country : " + value, new Object[0]);
        return value;
    }

    public static boolean hasAlexaAuthorized() {
        SharedPreferences sharedPreferences = c;
        return sharedPreferences != null && sharedPreferences.getBoolean(b, false);
    }

    public static void init(SharedPreferences sharedPreferences) {
        c = sharedPreferences;
    }

    public static boolean isSupportLoginCountry(String str) {
        return AlexaSupportUtils.isSupportAlexa(str);
    }

    public static boolean needShowAlexa(Context context) {
        boolean zIsSupportAlexa;
        String loginCountry = getLoginCountry(context);
        if (TextUtils.isEmpty(loginCountry)) {
            return false;
        }
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null) {
            Log.e(a, "alexa get device is null", new Object[0]);
            return false;
        }
        if (DeviceUtil.isRomSupport(currentDevice, new String[]{"3", "2", "6", "0"})) {
            zIsSupportAlexa = AlexaSupportUtils.isSupportAlexa(loginCountry);
        } else {
            zIsSupportAlexa = "US".equalsIgnoreCase(loginCountry);
        }
        return zIsSupportAlexa && DeviceUtil.isSupportAlexa(context) && Config.isBuildOversea();
    }

    public static boolean needShowAlexaAuth(Context context) {
        boolean zNeedShowAlexa = needShowAlexa(context);
        boolean z = Box.get().getBoolean(KEY_ALEX_AUTH_TIP, true);
        boolean z2 = !((AuthApi) KoinJavaComponent.inject(AuthApi.class).getValue()).isLogin();
        Log.e("AmazonAccountUtil", "showTip :" + z + "   un_login: " + z2 + "  need show : " + zNeedShowAlexa, new Object[0]);
        return z && z2 && zNeedShowAlexa;
    }

    public static void setAlexaAuthorized(boolean z) {
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(b, z);
            editorEdit.apply();
        }
    }

    public static void showAlexaAuthDialog(final Context context, FragmentManager fragmentManager) {
        AlertDialog.setTitle(c(context, R.string.alexa_account_author)).setContent(new NewAlexaAuthTipDialogFragment()).setNegativeBtn(c(context, R.string.restore_no), new DialogInterface.OnClickListener() { // from class: ec
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlexaUtils.d(dialogInterface, i);
            }
        }).setPositiveBtn(c(context, R.string.alexa_login), new DialogInterface.OnClickListener() { // from class: dc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AlexaUtils.e(context, dialogInterface, i);
            }
        }).setCancelable(false).show(fragmentManager, "alexa-author");
    }
}
