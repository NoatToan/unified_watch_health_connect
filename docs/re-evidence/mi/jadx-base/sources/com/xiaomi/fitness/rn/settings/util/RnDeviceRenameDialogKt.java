package com.xiaomi.fitness.rn.settings.util;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialogKt;
import com.xiaomi.fitness.rn.util.RnStringUtil;
import defpackage.v0j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000b\u001a\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"TAG", "", "ERROR_DEVICE_RENAME_OVER_MAX_LENGTH", "", "ERROR_DEVICE_RENAME_SPECIAL_CHAR", "requestRenameDevice", "", "did", "oldName", "inputName", "callBack", "Lkotlin/Function1;", "checkInputNameValid", "checkSpecialCharInDeviceName", "", "deviceName", "convertInputErrorMsgResId", "code", "settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RnDeviceRenameDialogKt {
    private static final int ERROR_DEVICE_RENAME_OVER_MAX_LENGTH = -1001;
    private static final int ERROR_DEVICE_RENAME_SPECIAL_CHAR = -1002;

    @NotNull
    private static final String TAG = "RnDeviceRename";

    public static final int checkInputNameValid(@NotNull String inputName) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        if (RnStringUtil.INSTANCE.getStringCharLen1(inputName) > 40) {
            Logger.i(TAG, "over max length(" + inputName + ")");
            return -1001;
        }
        if (!checkSpecialCharInDeviceName(inputName)) {
            return 0;
        }
        Logger.i(TAG, "has special char(" + inputName + ")");
        return -1002;
    }

    private static final boolean checkSpecialCharInDeviceName(String str) {
        if (str.length() == 0) {
            return false;
        }
        RnStringUtil rnStringUtil = RnStringUtil.INSTANCE;
        return rnStringUtil.isSpecialCharInName(str) || rnStringUtil.containsEmoji(str);
    }

    public static final int convertInputErrorMsgResId(int i) {
        if (i != -1002) {
            return i != -1001 ? v0j.z : v0j.u;
        }
        return v0j.t;
    }

    public static final void requestRenameDevice(@NotNull final String did, @Nullable String str, @NotNull String inputName, @NotNull final Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (inputName.length() == 0 || Intrinsics.areEqual(inputName, str)) {
            Logger.i(TAG, "renameDevice(" + did + "), not changed name(" + inputName + ")");
            callBack.invoke2(0);
            return;
        }
        int iCheckInputNameValid = checkInputNameValid(inputName);
        if (iCheckInputNameValid == 0) {
            MiJiaSDKCompat.INSTANCE.getInstance().renameDevice(did, inputName, new Function1() { // from class: ruk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnDeviceRenameDialogKt.requestRenameDevice$lambda$2(did, callBack, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: suk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnDeviceRenameDialogKt.requestRenameDevice$lambda$3(did, callBack, (ApiException) obj);
                }
            });
            return;
        }
        Logger.i(TAG, "renameDevice(" + did + "), invalid name(" + inputName + ")");
        callBack.invoke2(Integer.valueOf(iCheckInputNameValid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRenameDevice$lambda$2(String did, final Function1 callBack, boolean z) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Logger.i(TAG, "renameDevice(" + did + "): result(" + z + ")");
        if (z) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).requestDeviceList(new Function1() { // from class: tuk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnDeviceRenameDialogKt.requestRenameDevice$lambda$2$lambda$0(callBack, (List) obj);
                }
            }, new Function1() { // from class: uuk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnDeviceRenameDialogKt.requestRenameDevice$lambda$2$lambda$1(callBack, (ApiException) obj);
                }
            });
        } else {
            callBack.invoke2(10002);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRenameDevice$lambda$2$lambda$0(Function1 callBack, List it) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "requestDeviceList onSuccess");
        callBack.invoke2(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRenameDevice$lambda$2$lambda$1(Function1 callBack, ApiException it) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "requestDeviceList onFail");
        callBack.invoke2(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRenameDevice$lambda$3(String did, Function1 callBack, ApiException it) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "renameDevice(" + did + "): onFail", it);
        callBack.invoke2(Integer.valueOf(it.getErrorCode()));
        return Unit.INSTANCE;
    }
}
