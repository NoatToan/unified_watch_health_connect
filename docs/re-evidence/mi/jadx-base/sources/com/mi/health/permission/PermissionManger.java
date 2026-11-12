package com.mi.health.permission;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import androidx.core.app.a;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.permission.manager.export.IPermissionManager;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J(\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lcom/mi/health/permission/PermissionManger;", "Lcom/fitness/permission/manager/export/IPermissionManager;", "<init>", "()V", "showGuideSystemOpenPermissionWhenDeniedIfNeed", "", "targetPermission", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "deniedList", "", "excludeNonEssentialPermission", "notShowGuide", "Lkotlin/Function0;", "showGuide", "statisticAppPermission", "statisticPermission", "map", "", "", "statisticAppPermissionOnResult", "grantedList", "statisticNotificationListenPermission", "grant", "", "Companion", "permission-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionManger.kt\ncom/mi/health/permission/PermissionManger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,149:1\n1863#2,2:150\n1863#2,2:152\n1863#2,2:156\n1863#2,2:158\n216#3,2:154\n*S KotlinDebug\n*F\n+ 1 PermissionManger.kt\ncom/mi/health/permission/PermissionManger\n*L\n43#1:150,2\n102#1:152,2\n134#1:156,2\n137#1:158,2\n121#1:154,2\n*E\n"})
public final class PermissionManger implements IPermissionManager {

    @NotNull
    public static final String TAG = "PermissionBizManager";

    private final void statisticPermission(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tip", "56.68.0.1.28573");
            linkedHashMap.put("name", entry.getKey());
            linkedHashMap.put("status", entry.getValue());
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.toMap(linkedHashMap));
        }
    }

    @Override // com.fitness.permission.manager.export.IPermissionManager
    public void showGuideSystemOpenPermissionWhenDeniedIfNeed(@NotNull String targetPermission, @NotNull Activity activity, @NotNull List<String> deniedList, @Nullable List<String> excludeNonEssentialPermission, @NotNull Function0<Unit> notShowGuide, @NotNull Function0<Unit> showGuide) {
        boolean z;
        Intrinsics.checkNotNullParameter(targetPermission, "targetPermission");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deniedList, "deniedList");
        Intrinsics.checkNotNullParameter(notShowGuide, "notShowGuide");
        Intrinsics.checkNotNullParameter(showGuide, "showGuide");
        Logger.i(TAG, "showGuidePerWhenDenied target " + targetPermission + ",exclude " + excludeNonEssentialPermission);
        ArrayList arrayList = new ArrayList();
        for (String str : deniedList) {
            boolean z2 = a.z(activity, str);
            if (z2) {
                PermissionPreference.INSTANCE.removePermissionRejectStatus(str);
                z = false;
            } else {
                PermissionPreference permissionPreference = PermissionPreference.INSTANCE;
                boolean permissionRejectAndNotRemindStatus = permissionPreference.getPermissionRejectAndNotRemindStatus(str);
                if (!permissionRejectAndNotRemindStatus) {
                    permissionPreference.putPermissionRejectAndNotRemindStatus(str, true);
                }
                z = permissionRejectAndNotRemindStatus;
            }
            if (excludeNonEssentialPermission == null || !excludeNonEssentialPermission.contains(str)) {
                arrayList.add(Boolean.valueOf(z));
            }
            Logger.i(TAG, "showGuidePerWhenDenied shouldShow " + z2 + ";per is " + str + ";notRemindStatus " + z);
        }
        if (arrayList.isEmpty() || arrayList.contains(Boolean.FALSE)) {
            notShowGuide.invoke();
        } else {
            showGuide.invoke();
        }
    }

    @Override // com.fitness.permission.manager.export.IPermissionManager
    public void statisticAppPermission() {
        Logger.i(TAG, "statisticAppPermission");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_CONTACTS", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.SEND_SMS", "android.permission.RECORD_AUDIO", "android.permission.READ_CALL_LOG", "android.permission.READ_CALENDAR"});
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(listListOf);
        int i = Build.VERSION.SDK_INT;
        arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        if (i >= 29) {
            arrayList.add("android.permission.ACTIVITY_RECOGNITION");
            arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (i >= 31) {
            arrayList.add("android.permission.BLUETOOTH_SCAN");
            arrayList.add("android.permission.BLUETOOTH_CONNECT");
        }
        for (String str : arrayList) {
            linkedHashMap.put(str, PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), str) ? "true" : "false");
        }
        linkedHashMap.put("notification_do_not_disturb", Boolean.valueOf(NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()));
        linkedHashMap.put("notification_listen", Boolean.valueOf(NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()));
        linkedHashMap.put("app_auto_startup", Boolean.valueOf(AutoStarterImpl.INSTANCE.canAutoStart(ApplicationExtKt.getApplication())));
        BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        linkedHashMap.put("background_unLimit", Integer.valueOf(backgroundRestrictionUtil.queryRestrictionLevel(application, packageName)));
        statisticPermission(MapsKt__MapsKt.toMap(linkedHashMap));
        Logger.i(TAG, "trackAppPermissionGrantedStatus " + linkedHashMap);
    }

    @Override // com.fitness.permission.manager.export.IPermissionManager
    public void statisticAppPermissionOnResult(@Nullable List<String> grantedList, @Nullable List<String> deniedList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (grantedList != null) {
            Iterator<T> it = grantedList.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((String) it.next(), Boolean.TRUE);
            }
        }
        if (deniedList != null) {
            Iterator<T> it2 = deniedList.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put((String) it2.next(), Boolean.FALSE);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        statisticPermission(linkedHashMap);
        Logger.i(TAG, "trackAppPermissionOnResult " + linkedHashMap);
    }

    @Override // com.fitness.permission.manager.export.IPermissionManager
    public void statisticNotificationListenPermission(boolean grant) {
        statisticPermission(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("notification_listen", Boolean.valueOf(grant))));
        Logger.i(TAG, "statisticNotificationListenPermission " + grant);
    }
}
