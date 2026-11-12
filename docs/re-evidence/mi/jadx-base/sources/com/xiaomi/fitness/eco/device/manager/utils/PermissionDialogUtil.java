package com.xiaomi.fitness.eco.device.manager.utils;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.eco.device.manager.utils.PermissionDialogUtil;
import defpackage.av6;
import defpackage.yzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bJ)\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bH\u0002J'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002JH\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001428\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00050\u0016¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/utils/PermissionDialogUtil;", "", "<init>", "()V", "requestLocationIfNeed", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "showLocationTipDialogIfNeed", "requestLocationDialog", "isXiaoMiAlwaysAllow", "", "locationPermissionAlwaysAllow", "", "", "turnOnLocationPermissionFromSetting", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "callBack", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/content/Intent;", "data", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionDialogUtil {

    @NotNull
    public static final PermissionDialogUtil INSTANCE = new PermissionDialogUtil();

    private PermissionDialogUtil() {
    }

    private final boolean isXiaoMiAlwaysAllow() {
        return !AppUtil.INSTANCE.isPlayChannel() && RomUtils.isXiaomi() && Build.VERSION.SDK_INT >= 29;
    }

    private final List<String> locationPermissionAlwaysAllow() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add(ResourceExtKt.getString(yzi.W));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2(final PermissionBuilder pb, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: xrh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionDialogUtil.requestLocationDialog$lambda$2$lambda$0(pb, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: yrh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionDialogUtil.requestLocationDialog$lambda$2$lambda$1(pb, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2$lambda$0(PermissionBuilder pb, String it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getGranted().invoke2("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationDialog$lambda$2$lambda$1(PermissionBuilder pb, String it) {
        Intrinsics.checkNotNullParameter(pb, "$pb");
        Intrinsics.checkNotNullParameter(it, "it");
        pb.getDenied().invoke2("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    private final void showLocationTipDialogIfNeed(final FragmentActivity activity, final Function1<? super PermissionBuilder, Unit> extension) {
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            requestLocationDialog(activity, extension);
            return;
        }
        String string = ResourceExtKt.getString(yzi.V);
        SpannableString spannableString = new SpannableString(string + "\n\r\n\r" + ResourceExtKt.getString(yzi.X));
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 17);
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(yzi.R).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableString)).setPositiveText(yzi.f40721b).setNegativeText(yzi.L0).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.utils.PermissionDialogUtil.showLocationTipDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    PermissionDialogUtil.INSTANCE.requestLocationDialog(activity, extension);
                } else {
                    activity.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    public final void requestLocationDialog(@NotNull FragmentActivity activity, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        final PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        PermissionExtKt.permission(activity, "android.permission.ACCESS_FINE_LOCATION", ResourceExtKt.getString(yzi.K0), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: wrh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionDialogUtil.requestLocationDialog$lambda$2(permissionBuilder, (PermissionBuilder) obj);
            }
        });
    }

    public final void requestLocationIfNeed(@NotNull FragmentActivity activity, @NotNull Function1<? super PermissionBuilder, Unit> extension) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (!PermissionExtKt.isPermissionGranted(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            showLocationTipDialogIfNeed(activity, extension);
            return;
        }
        PermissionBuilder permissionBuilder = new PermissionBuilder();
        extension.invoke2(permissionBuilder);
        permissionBuilder.getGranted().invoke2("android.permission.ACCESS_FINE_LOCATION");
    }

    public final void turnOnLocationPermissionFromSetting(@NotNull final BaseActivity activity, @NotNull final Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogDescription(yzi.l0).setPositiveText(yzi.B0).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.utils.PermissionDialogUtil.turnOnLocationPermissionFromSetting.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    activity.startForActivityResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), callBack);
                } else {
                    callBack.invoke(0, null);
                }
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }
}
