package com.xiaomi.fitness.main.utils;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import defpackage.av6;
import defpackage.h0j;
import defpackage.hri;
import defpackage.nui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/main/utils/DialogHelper;", "", "<init>", "()V", "isDialogShowing", "", "boundEarPhone", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "scannedDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "callBack", "Lkotlin/Function0;", "getLastFourCharacters", "", "mac", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHelper.kt\ncom/xiaomi/fitness/main/utils/DialogHelper\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,65:1\n54#2,3:66\n24#2:69\n57#2,6:70\n63#2,2:77\n57#3:76\n*S KotlinDebug\n*F\n+ 1 DialogHelper.kt\ncom/xiaomi/fitness/main/utils/DialogHelper\n*L\n31#1:66,3\n31#1:69\n31#1:70,6\n31#1:77,2\n31#1:76\n*E\n"})
public final class DialogHelper {

    @NotNull
    public static final DialogHelper INSTANCE = new DialogHelper();
    private static boolean isDialogShowing;

    private DialogHelper() {
    }

    public final void boundEarPhone(@NotNull FragmentManager fragmentManager, @NotNull ScannedDeviceInfo scannedDeviceInfo, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(scannedDeviceInfo, "scannedDeviceInfo");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (isDialogShowing) {
            return;
        }
        CommonDialog.c cVar = new CommonDialog.c("boundEarPhone");
        View viewInflate = LayoutInflater.from(ApplicationExtKt.getApplication()).inflate(nui.c, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(hri.f20371a);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(scannedDeviceInfo.getDeviceinfo().getBigIcon()).target(imageView).build());
        CommonDialog commonDialogCreate = cVar.setCustomView(viewInflate).setDialogTitle(new DialogParams.DialogDescriptionString(scannedDeviceInfo.getDeviceinfo().getName())).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getLastFourCharacters(scannedDeviceInfo.getBleMac()))).setPositiveText(h0j.g).setNegativeText(h0j.h).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.main.utils.DialogHelper.boundEarPhone.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                DialogHelper.isDialogShowing = false;
                if (which == -1) {
                    callBack.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
        isDialogShowing = true;
    }

    @NotNull
    public final String getLastFourCharacters(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(mac, ":", "", false, 4, (Object) null);
        return strReplace$default.length() >= 4 ? StringsKt___StringsKt.takeLast(strReplace$default, 4) : strReplace$default;
    }
}
