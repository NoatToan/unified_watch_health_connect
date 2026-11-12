package com.xiaomi.fitness.sport_manager.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.sport_manager.utils.PermissionUtils;
import defpackage.av6;
import defpackage.g1j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J \u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/utils/PermissionUtils;", "", "<init>", "()V", "getLocation", "", "locationDialog", "permissions", "", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionUtils.kt\ncom/xiaomi/fitness/sport_manager/utils/PermissionUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n37#2:170\n36#2,3:171\n37#2:174\n36#2,3:175\n37#2:178\n36#2,3:179\n37#2:182\n36#2,3:183\n37#2:186\n36#2,3:187\n1557#3:190\n1628#3,3:191\n*S KotlinDebug\n*F\n+ 1 PermissionUtils.kt\ncom/xiaomi/fitness/sport_manager/utils/PermissionUtils\n*L\n72#1:170\n72#1:171,3\n80#1:174\n80#1:175,3\n81#1:178\n81#1:179,3\n86#1:182\n86#1:183,3\n99#1:186\n99#1:187,3\n100#1:190\n100#1:191,3\n*E\n"})
public final class PermissionUtils {

    @NotNull
    public static final PermissionUtils INSTANCE = new PermissionUtils();

    private PermissionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLocation$lambda$3(final Ref.ObjectRef activity, final List sportPermission, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.denied(new Function1() { // from class: nsh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PermissionUtils.getLocation$lambda$3$lambda$1(activity, sportPermission, (List) obj);
            }
        });
        permissions.allGranted(new Function0() { // from class: osh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getLocation$lambda$3$lambda$1(Ref.ObjectRef activity, List sportPermission, List it) {
        ArrayList arrayListArrayListOf;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(sportPermission, "$sportPermission");
        Intrinsics.checkNotNullParameter(it, "it");
        Activity activity2 = (Activity) activity.element;
        List list = sportPermission;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (PermissionExtKt.isPermissionDeniedForever(activity2, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            INSTANCE.locationDialog(CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(g1j.m), Integer.valueOf(g1j.l)), (FragmentActivity) activity.element);
            return Unit.INSTANCE;
        }
        Context context = (Context) activity.element;
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        List<String> listCheckPermissions = PermissionExtKt.checkPermissions(context, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listCheckPermissions, 10));
        for (String str : listCheckPermissions) {
            if (Intrinsics.areEqual(str, "android.permission.ACCESS_FINE_LOCATION")) {
                arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(g1j.m), Integer.valueOf(g1j.l));
            } else if (Intrinsics.areEqual(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                SportManagerPreference.INSTANCE.setKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION(false);
                arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(g1j.m), Integer.valueOf(g1j.l));
            } else {
                arrayListArrayListOf = null;
            }
            arrayList.add(arrayListArrayListOf);
        }
        INSTANCE.locationDialog((List) arrayList.get(0), (FragmentActivity) activity.element);
        return Unit.INSTANCE;
    }

    private final void locationDialog(List<Integer> permissions, final FragmentActivity activity) {
        if ((permissions != null ? permissions.get(0) : null) != null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(permissions.get(0).intValue()).setDialogDescription(permissions.get(1).intValue()).setPositiveText(g1j.c).setNegativeText(g1j.f18471b).create();
            commonDialogCreate.setCancelable(false);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_manager.utils.PermissionUtils.locationDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        SystemSetting.INSTANCE.goToSetting(activity);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.fragment.app.FragmentActivity] */
    public final void getLocation() {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Logger.i("PermissionUtils", "activity:" + currentActivity);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (currentActivity != null) {
            ?? r0 = (FragmentActivity) currentActivity;
            objectRef.element = r0;
            if (!LocationExtKt.supportsOutdoorSportPositionService((Context) r0)) {
                CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(g1j.q).setPositiveText(g1j.p).create();
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_manager.utils.PermissionUtils.getLocation.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        objectRef.element.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                });
                commonDialogCreate.showIfNeed(((FragmentActivity) objectRef.element).getSupportFragmentManager());
                return;
            }
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
                ListExtKt.add(arrayList2, ResourceExtKt.getString(g1j.e));
                ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
                ListExtKt.add(arrayList2, " ");
                ListExtKt.add(arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION");
                ListExtKt.add(arrayList2, ResourceExtKt.getString(g1j.d));
            } else {
                ListExtKt.add(arrayList, "android.permission.ACCESS_COARSE_LOCATION");
                ListExtKt.add(arrayList2, ResourceExtKt.getString(g1j.e));
                ListExtKt.add(arrayList, "android.permission.ACCESS_FINE_LOCATION");
                ListExtKt.add(arrayList2, " ");
            }
            Context context = (Context) objectRef.element;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (PermissionExtKt.isPermissionGranted(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) objectRef.element;
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            PermissionExtKt.permissions(fragmentActivity, (String[]) Arrays.copyOf(strArr2, strArr2.length), (String[]) arrayList2.toArray(new String[0]), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: msh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PermissionUtils.getLocation$lambda$3(objectRef, arrayList, (MultiplePermissionsBuilder) obj);
                }
            });
        }
    }
}
