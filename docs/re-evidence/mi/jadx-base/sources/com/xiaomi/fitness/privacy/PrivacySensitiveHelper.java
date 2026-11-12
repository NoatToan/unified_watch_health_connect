package com.xiaomi.fitness.privacy;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PrivacySensitiveDialog;
import com.xiaomi.fitness.baseui.extension.ActivityExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.main.sharepreference.PrivacySensitivePreference;
import com.xiaomi.fitness.privacy.PrivacySensitiveHelper;
import com.xiaomi.fitness.privacy.export.IPrivacySensitive;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.PrivacySensitive;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.s0j;
import defpackage.uji;
import defpackage.wui;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/privacy/PrivacySensitiveHelper;", "", "<init>", "()V", "TAG", "", "showPrivacySensitiveDialogIfNeed", "", "context", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/privacy/export/IPrivacySensitive;", "showPrivacySensitiveDialog", "", "setPrivacySensitive", PrivacyAgreeModel.TYPE_ACCEPT, "HOST_REGION", "getUserSensitiveInfoUrlOnFirst", "locale", "model", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrivacySensitiveHelper {

    @NotNull
    private static final String HOST_REGION = "https://region.hlth.io.mi.com";

    @NotNull
    public static final PrivacySensitiveHelper INSTANCE = new PrivacySensitiveHelper();

    @NotNull
    private static final String TAG = "PrivacySensitiveHelper";

    private PrivacySensitiveHelper() {
    }

    private final String getUserSensitiveInfoUrlOnFirst(String locale, String model) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=user_sensitive_info&model=%s", Arrays.copyOf(new Object[]{HOST_REGION, locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPrivacySensitive(boolean accept) {
        Logger.i(TAG, "setPrivacySensitive " + accept);
        PrivacySensitive privacySensitive = new PrivacySensitive();
        privacySensitive.setAgreeSensitive(accept);
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_PRIVACY_SENSITIVE, privacySensitive, false);
    }

    private final void showPrivacySensitiveDialog(final FragmentActivity context, final IPrivacySensitive action) {
        ActivityExtKt.scopeDialogShow$default(context, "repeat", false, null, new av6() { // from class: com.xiaomi.fitness.privacy.PrivacySensitiveHelper$showPrivacySensitiveDialog$callback$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    PrivacySensitivePreference.INSTANCE.setKeyUserSetting(true);
                    action.onPrivacyDenied();
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    PrivacySensitiveHelper.INSTANCE.setPrivacySensitive(true);
                    action.onPrivacyAccepted();
                    PrivacySensitivePreference.INSTANCE.setKeyUserSetting(true);
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }, new Function1() { // from class: y9i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PrivacySensitiveHelper.showPrivacySensitiveDialog$lambda$1(context, (String) obj);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonDialog showPrivacySensitiveDialog$lambda$1(FragmentActivity context, String name) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(name, "name");
        PrivacySensitiveDialog privacySensitiveDialogCreate = new PrivacySensitiveDialog.a(name).setCustomLayoutId(wui.f38376a).setPositiveText(s0j.c).setNegativeText(s0j.e).create();
        if (privacySensitiveDialogCreate != null) {
            privacySensitiveDialogCreate.B(LinkSpanHelper.a(context, context.getResources().getString(s0j.F, INSTANCE.getUserSensitiveInfoUrlOnFirst(LocaleUtil.getCurrentLocale(), "app")), Integer.valueOf(uji.f35847a), new LinkSpanHelper.a() { // from class: z9i
                @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
                public final void onLinkClicked(View view, String str) {
                    PrivacySensitiveHelper.showPrivacySensitiveDialog$lambda$1$lambda$0(view, str);
                }
            }));
        }
        Intrinsics.checkNotNull(privacySensitiveDialogCreate);
        return privacySensitiveDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrivacySensitiveDialog$lambda$1$lambda$0(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    public final boolean showPrivacySensitiveDialogIfNeed(@NotNull FragmentActivity context, @NotNull IPrivacySensitive action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            action.onPrivacyAccepted();
            return false;
        }
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_PRIVACY_SENSITIVE).valueToObject(PrivacySensitive.class);
        PrivacySensitive privacySensitive = objValueToObject instanceof PrivacySensitive ? (PrivacySensitive) objValueToObject : null;
        if (privacySensitive == null || !privacySensitive.isAgreeSensitive()) {
            showPrivacySensitiveDialog(context, action);
            return true;
        }
        action.onPrivacyAccepted();
        return false;
    }
}
