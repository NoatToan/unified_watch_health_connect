package com.xiaomi.fitness.login.util;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.SelectMode;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.av6;
import defpackage.g0j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/login/util/LoginUtil;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isSupportMhsGoal", "", "checkDeviceSettingForSelectMode", "", "showLoginDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "onSwitchToErrorRegion", "", "countryCode", "findRegionByCountry", "context", "Landroid/content/Context;", "countyCode", "readJsonFromAsset", "assetFileName", "saveCurrentRegion", "region", "country", "saveInnerRegion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoginUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginUtil.kt\ncom/xiaomi/fitness/login/util/LoginUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,162:1\n1#2:163\n108#3:164\n80#3,22:165\n*S KotlinDebug\n*F\n+ 1 LoginUtil.kt\ncom/xiaomi/fitness/login/util/LoginUtil\n*L\n145#1:164\n145#1:165,22\n*E\n"})
public final class LoginUtil {

    @NotNull
    public static final LoginUtil INSTANCE = new LoginUtil();

    @NotNull
    private static final String TAG = "LoginUtil";

    private LoginUtil() {
    }

    private final String readJsonFromAsset(Context context, String assetFileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(assetFileName), StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                int length = line.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) line.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(line.subSequence(i, length + 1).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showLoginDialog$lambda$1(Ref.ObjectRef dialog, LifecycleOwner source, Lifecycle.Event event) {
        CommonDialog commonDialog;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY || (commonDialog = (CommonDialog) dialog.element) == null) {
            return;
        }
        commonDialog.dismissAllowingStateLoss();
    }

    public final int checkDeviceSettingForSelectMode() {
        SettingItemEntity settingItem = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_SELECT_MODE);
        if (settingItem.getValue() == null) {
            return CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getSelectMode();
        }
        Object objValueToObject = settingItem.valueToObject(SelectMode.class);
        Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.SelectMode");
        SelectMode selectMode = (SelectMode) objValueToObject;
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).setSelectMode(selectMode.getSelectMode());
        return selectMode.getSelectMode();
    }

    @Nullable
    public final String findRegionByCountry(@NotNull Context context, @NotNull String countyCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countyCode, "countyCode");
        try {
            JSONObject jSONObject = new JSONObject(readJsonFromAsset(context, "region.json"));
            String upperCase = countyCode.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return jSONObject.getString(upperCase);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final boolean isSupportMhsGoal() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(" Goal manager currentDeviceModel is " + wearableDeviceModel, new Object[0]);
        if (wearableDeviceModel != null && !DeviceModelExtKt.isKongMing(wearableDeviceModel) && !DeviceModelExtKt.isPanGu(wearableDeviceModel) && !SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).isDeviceSupportMhs()) {
            return false;
        }
        Logger.i(" Goal manager goal support mhs", new Object[0]);
        return true;
    }

    public final void onSwitchToErrorRegion(@Nullable String countryCode) {
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("switchRegion with countryCode:%s error", Arrays.copyOf(new Object[]{countryCode}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        Logger.i(str, str2);
    }

    public final void saveCurrentRegion(@NotNull String region, @NotNull String country) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(country, "country");
        RegionManager.Companion companion = RegionManager.INSTANCE;
        RegionExtKt.getInstance(companion).setCurrentRegion(region);
        RegionExtKt.getInstance(companion).setLocaleCountry(country);
    }

    public final void saveInnerRegion() {
        RegionManager.Companion companion = RegionManager.INSTANCE;
        RegionExtKt.getInstance(companion).setCurrentRegion("cn");
        RegionExtKt.getInstance(companion).setLocaleCountry(ServerConstants.NEW_CN_COUNTRY_CODE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog, java.lang.Object] */
    @NotNull
    public final CommonDialog<?> showLoginDialog(@NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = (CommonDialog) activity.getSupportFragmentManager().l0("login");
        objectRef.element = r1;
        if (r1 != 0 && r1.isShowing()) {
            return (CommonDialog) objectRef.element;
        }
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: hre
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LoginUtil.showLoginDialog$lambda$1(objectRef, lifecycleOwner, event);
            }
        };
        activity.getLifecycle().addObserver(lifecycleEventObserver);
        if (objectRef.element == 0) {
            ?? Create = new CommonDialog.c("login").setDialogDescription(g0j.c).setNegativeText(g0j.B).setPositiveText(g0j.p).create();
            objectRef.element = Create;
            Intrinsics.checkNotNull(Create);
            Create.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.util.LoginUtil.showLoginDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        dialog.dismiss();
                    } else {
                        if (which != -1) {
                            return;
                        }
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
                        dialog.dismiss();
                    }
                }

                @Override // defpackage.av6
                public void onDialogEvent(String dialogName, DialogInterface dialog, int what) {
                    super.onDialogEvent(dialogName, dialog, what);
                    if (what == 3) {
                        activity.getLifecycle().removeObserver(lifecycleEventObserver);
                    }
                }
            });
        }
        CommonDialog commonDialog = (CommonDialog) objectRef.element;
        if (commonDialog != null) {
            commonDialog.showIfNeed(activity.getSupportFragmentManager());
        }
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        return (CommonDialog) t;
    }
}
