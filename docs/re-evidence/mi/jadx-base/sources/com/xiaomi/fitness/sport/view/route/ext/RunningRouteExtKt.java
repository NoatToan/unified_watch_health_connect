package com.xiaomi.fitness.sport.view.route.ext;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.utils.SportPermissionsUtilKt;
import com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.av6;
import defpackage.c1j;
import defpackage.xr5;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u001a8\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u001a \u0010\u0016\u001a\u00020\u00012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0019"}, d2 = {"bindRouteItemData", "", "routeIcon", "Landroid/widget/ImageView;", "name", "Landroid/widget/TextView;", "distance", "startPointDis", "routeType", "data", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeCheckPermission", "allPermissionGranted", "Lkotlin/Function0;", "requestPermissions", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "sportPermission", "", "", "sportPermissionDesc", "granted", "locationDialog", "permissions", "", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRunningRouteExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteExt.kt\ncom/xiaomi/fitness/sport/view/route/ext/RunningRouteExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,171:1\n54#2,3:172\n24#2:175\n59#2,6:176\n37#3:182\n36#3,3:183\n37#3:186\n36#3,3:187\n37#3:190\n36#3,3:191\n*S KotlinDebug\n*F\n+ 1 RunningRouteExt.kt\ncom/xiaomi/fitness/sport/view/route/ext/RunningRouteExtKt\n*L\n37#1:172,3\n37#1:175\n37#1:176,6\n103#1:182\n103#1:183,3\n112#1:186\n112#1:187,3\n113#1:190\n113#1:191,3\n*E\n"})
public final class RunningRouteExtKt {
    public static final void bindRouteItemData(@NotNull ImageView routeIcon, @NotNull TextView name, @NotNull TextView distance, @NotNull TextView startPointDis, @NotNull TextView routeType, @NotNull RouteInfo data) {
        Intrinsics.checkNotNullParameter(routeIcon, "routeIcon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(startPointDis, "startPointDis");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        Intrinsics.checkNotNullParameter(data, "data");
        String icon = data.getIcon();
        ImageLoader imageLoader = Coil.imageLoader(routeIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeIcon.getContext()).data(icon).target(routeIcon);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(15)));
        imageLoader.enqueue(builderTarget.build());
        name.setText(data.getName());
        distance.setText(AppUtil.getApp().getResources().getQuantityString(zxi.i, (int) data.getLength(), Double.valueOf(data.getLength())));
        startPointDis.setText(AppUtil.getApp().getResources().getQuantityString(zxi.m, (int) data.getDistance(), xr5.d(2, data.getDistance())));
        RouteDetailExtKt.showRouteTypeTag(routeType, Integer.valueOf(data.getCategory()));
    }

    private static final void locationDialog(List<Integer> list, final FragmentActivity fragmentActivity) {
        if ((list != null ? list.get(0) : null) != null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(list.get(0).intValue()).setDialogDescription(list.get(1).intValue()).setPositiveText(c1j.Z).setNegativeText(c1j.w3).create();
            commonDialogCreate.setCancelable(false);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt.locationDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        SystemSetting.INSTANCE.goToSetting(fragmentActivity);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(fragmentActivity.getSupportFragmentManager());
        }
    }

    public static final void requestPermissions(@NotNull final FragmentActivity activity, @NotNull final List<String> sportPermission, @NotNull List<String> sportPermissionDesc, @NotNull final Function0<Unit> granted) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sportPermission, "sportPermission");
        Intrinsics.checkNotNullParameter(sportPermissionDesc, "sportPermissionDesc");
        Intrinsics.checkNotNullParameter(granted, "granted");
        List<String> list = sportPermission;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (PermissionExtKt.isPermissionGranted(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            granted.invoke();
        } else {
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            PermissionExtKt.permissions(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length), (String[]) sportPermissionDesc.toArray(new String[0]), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: b3l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningRouteExtKt.requestPermissions$lambda$6(sportPermission, activity, granted, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$6(final List sportPermission, final FragmentActivity activity, final Function0 granted, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(granted, "$granted");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.denied(new Function1() { // from class: c3l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteExtKt.requestPermissions$lambda$6$lambda$4(sportPermission, activity, (List) obj);
            }
        });
        permissions.allGranted(new Function0() { // from class: d3l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteExtKt.requestPermissions$lambda$6$lambda$5(granted);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$6$lambda$4(final List sportPermission, final FragmentActivity activity, List it) {
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) sportPermission.get(0), activity, it, null, null, new Function0() { // from class: e3l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteExtKt.requestPermissions$lambda$6$lambda$4$lambda$3(sportPermission, activity);
            }
        }, 16, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$6$lambda$4$lambda$3(List sportPermission, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (Intrinsics.areEqual((String) sportPermission.get(0), "android.permission.ACCESS_FINE_LOCATION")) {
            SportPermissionsUtilKt.locationDialog(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(c1j.E2), Integer.valueOf(c1j.D1)), activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissions$lambda$6$lambda$5(Function0 granted) {
        Intrinsics.checkNotNullParameter(granted, "$granted");
        granted.invoke();
        return Unit.INSTANCE;
    }

    public static final void routeCheckPermission(@NotNull final Function0<Unit> allPermissionGranted) {
        Intrinsics.checkNotNullParameter(allPermissionGranted, "allPermissionGranted");
        AppManager.Companion companion = AppManager.INSTANCE;
        if (companion.getInstance().getCurrentActivity() == null) {
            return;
        }
        Activity currentActivity = companion.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        final FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
        if (!LocationExtKt.supportsOutdoorSportPositionService(fragmentActivity)) {
            CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(c1j.j3).setPositiveText(c1j.Z2).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt.routeCheckPermission.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    fragmentActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(fragmentActivity.getSupportFragmentManager());
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
        ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
        ListExtKt.add(arrayList2, ResourceExtKt.getString(c1j.P));
        ListExtKt.add(arrayList2, " ");
        requestPermissions(fragmentActivity, arrayList, arrayList2, new Function0() { // from class: a3l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteExtKt.routeCheckPermission$lambda$2(allPermissionGranted);
            }
        });
    }

    public static /* synthetic */ void routeCheckPermission$default(Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: f3l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        routeCheckPermission(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeCheckPermission$lambda$2(Function0 allPermissionGranted) {
        Intrinsics.checkNotNullParameter(allPermissionGranted, "$allPermissionGranted");
        allPermissionGranted.invoke();
        return Unit.INSTANCE;
    }
}
