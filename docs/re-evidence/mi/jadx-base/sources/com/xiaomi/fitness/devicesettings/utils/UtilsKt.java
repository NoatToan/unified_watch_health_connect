package com.xiaomi.fitness.devicesettings.utils;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.av6;
import defpackage.wzi;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\t\u001a\\\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t\u001af\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015\u001a\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0006\u0010\u0019\u001a\u00020\u0018\u001a\"\u0010\u001a\u001a\u00020\u0018*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u0003\u001a\"\u0010\u001f\u001a\u00020\u0018*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u0003\u001a\u0006\u0010 \u001a\u00020!\u001a\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011\u001a\u000e\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¨\u0006%"}, d2 = {"showEnsureDialog", "", "titleRes", "", "msgRes", "positionCallback", "Lkotlin/Function0;", "negativeCallback", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showAlertDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "positiveBtnRes", "negativeBtnRes", "positiveCallback", "showMsgDialog", "title", "", "msg", "positiveResId", "negativeResId", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "isDeviceConnection", "", "isDeviceNotConnection", "isSupportCapability", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", DevInfoKeys.CAPABILITY, "isSupportCapabilityV2", "getWatchShape", "Lcom/xiaomi/fitness/devicesettings/utils/WatchType;", "simpleRecordFileName", "name", "simpleRecordFileRawName", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    @NotNull
    public static final WatchType getWatchShape() {
        Product product;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Product.Size size = (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? null : product.getSize();
        if (size == null) {
            return WatchType.TYPE_ROUND_WATCH;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        int radius = size.getRadius();
        double d = width;
        if ((d * 1.0d) / ((double) height) >= 0.8d) {
            return width == radius * 2 ? WatchType.TYPE_ROUND_WATCH : WatchType.TYPE_SQUARE_WATCH;
        }
        return (((double) radius) * 1.0d) / d >= 0.5d ? WatchType.TYPE_ROUND_BAND : WatchType.TYPE_SQUARE_BAND;
    }

    public static final boolean isDeviceConnection() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected();
    }

    public static final boolean isDeviceNotConnection() {
        return !isDeviceConnection();
    }

    public static final boolean isSupportCapability(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel, int i) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(deviceModel.getDid()) & i) == i;
    }

    public static final boolean isSupportCapabilityV2(@NotNull DeviceModel<? extends DeviceInfo<? extends Device>> deviceModel, int i) {
        Intrinsics.checkNotNullParameter(deviceModel, "<this>");
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(deviceModel.getDid()) & i) == i;
    }

    @Nullable
    public static final CommonDialog<?> showAlertDialog(int i, int i2, int i3, int i4, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("alert").setDialogTitle(i).setDialogDescription(i2).setPositiveText(i3).setNegativeText(i4).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.utils.UtilsKt.showAlertDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function0<Unit> function2;
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which == -1 && (function2 = function0) != null) {
                        function2.invoke();
                        return;
                    }
                    return;
                }
                Function0<Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
        return commonDialogCreate;
    }

    public static /* synthetic */ CommonDialog showAlertDialog$default(int i, int i2, int i3, int i4, Function0 function0, Function0 function1, FragmentManager fragmentManager, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = wzi.g;
        }
        int i6 = i3;
        if ((i5 & 8) != 0) {
            i4 = wzi.e;
        }
        return showAlertDialog(i, i2, i6, i4, (i5 & 16) != 0 ? null : function0, (i5 & 32) != 0 ? null : function1, fragmentManager);
    }

    public static final void showEnsureDialog(int i, int i2, @NotNull final Function0<Unit> positionCallback, @NotNull final Function0<Unit> negativeCallback, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(positionCallback, "positionCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog commonDialogCreate = new CommonDialog.c("ensure").setCancelable(false).setDialogTitle(i).setDialogDescription(i2).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.utils.UtilsKt.showEnsureDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    negativeCallback.invoke();
                } else if (which == -1) {
                    positionCallback.invoke();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static final void showMsgDialog(@Nullable String str, @NotNull String msg, int i, @NotNull FragmentManager fragmentManager, int i2, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c dialogDescriptionString = new CommonDialog.c("CardManagerFragment.delete.mi").setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg));
        if (str != null) {
            dialogDescriptionString.setDialogTitle(new DialogParams.DialogDescriptionString(str));
        }
        dialogDescriptionString.setPositiveText(i);
        if (i2 != -1) {
            dialogDescriptionString.setNegativeText(i2);
        }
        CommonDialog commonDialogCreate = dialogDescriptionString.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.utils.UtilsKt.showMsgDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function1<DialogInterface, Unit> function3;
                if (which == -2) {
                    Function1<DialogInterface, Unit> function4 = function2;
                    if (function4 != null) {
                        function4.invoke2(dialog);
                    }
                } else if (which == -1 && (function3 = function1) != null) {
                    function3.invoke2(dialog);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public static /* synthetic */ void showMsgDialog$default(String str, String str2, int i, FragmentManager fragmentManager, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        showMsgDialog(str, str2, i, fragmentManager, i2, (i3 & 32) != 0 ? null : function1, (i3 & 64) != 0 ? null : function2);
    }

    @NotNull
    public static final String simpleRecordFileName(@NotNull String name) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "/", false, 2, (Object) null)) {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, "/", 0, false, 6, (Object) null);
            if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
                strSubstring = name.substring(iLastIndexOf$default + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = name.substring(iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
        } else {
            if (!StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
                return name;
            }
            strSubstring = name.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(strSubstring, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, " ", false, 4, (Object) null);
        xc6.d("simpleRecordFileName  " + name + " " + strReplace$default);
        return strReplace$default;
    }

    @NotNull
    public static final String simpleRecordFileRawName(@NotNull String name) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "/", false, 2, (Object) null)) {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, "/", 0, false, 6, (Object) null);
            if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
                strSubstring = name.substring(iLastIndexOf$default + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = name.substring(iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
        } else {
            if (!StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
                return name;
            }
            strSubstring = name.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        xc6.d("simpleRecordFileName  " + name + " " + strSubstring);
        return strSubstring;
    }
}
