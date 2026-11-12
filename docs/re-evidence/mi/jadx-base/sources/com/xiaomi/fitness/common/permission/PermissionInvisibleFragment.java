package com.xiaomi.fitness.common.permission;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.permission.PermissionInvisibleFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0010\u001a\u00020\u0015H\u0016J\u001e\u0010\u0018\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0002J,\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/common/permission/PermissionInvisibleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "handler", "Landroid/os/Handler;", "miuiPermission", "Lcom/xiaomi/fitness/common/permission/MiuiPermission;", "needSingleRequestBackgroundLocation", "", "backGroundLocationDesc", "", "tempGrantedList", "", "tempDeniedList", "onCreate", LifecycleConstantKt.ON_DESTROY, "requestMultiplePermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "requestBackgroundLocationLauncher", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestBackgroundLocationPermissionResult", "grantResultMap", "", "onRequestMultiplePermissionsResult", "postForResult", "callback", "Lkotlin/Function0;", "requestNow", "permission", "permissionList", "", "descList", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionInvisibleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionInvisibleFragment.kt\ncom/xiaomi/fitness/common/permission/PermissionInvisibleFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n216#2,2:182\n216#2,2:184\n1863#3,2:186\n37#4:188\n36#4,3:189\n*S KotlinDebug\n*F\n+ 1 PermissionInvisibleFragment.kt\ncom/xiaomi/fitness/common/permission/PermissionInvisibleFragment\n*L\n75#1:182,2\n89#1:184,2\n166#1:186,2\n178#1:188\n178#1:189,3\n*E\n"})
public final class PermissionInvisibleFragment extends Fragment {

    @NotNull
    public static final String TAG = "MiuiPermissionFragment";

    @Nullable
    private String backGroundLocationDesc;

    @Nullable
    private MiuiPermission miuiPermission;
    private boolean needSingleRequestBackgroundLocation;
    private boolean onCreate;
    private boolean onDestroy;
    private ActivityResultLauncher<String[]> requestBackgroundLocationLauncher;
    private ActivityResultLauncher<String[]> requestMultiplePermissionLauncher;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private List<String> tempGrantedList = new ArrayList();

    @NotNull
    private List<String> tempDeniedList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(final PermissionInvisibleFragment this$0, final Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postForResult(new Function0() { // from class: bsh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionInvisibleFragment.onCreate$lambda$1$lambda$0(this.f4562a, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(PermissionInvisibleFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRequestMultiplePermissionsResult(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(final PermissionInvisibleFragment this$0, final Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postForResult(new Function0() { // from class: ash
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionInvisibleFragment.onCreate$lambda$3$lambda$2(this.f3413a, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3$lambda$2(PermissionInvisibleFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRequestBackgroundLocationPermissionResult(map);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0058  */
    private final void onRequestBackgroundLocationPermissionResult(Map<String, Boolean> grantResultMap) {
        Logger.i(TAG, "onRequestBackgroundLocationPermissionResult granted: " + grantResultMap + " temp granted " + this.tempGrantedList + " tempDenied " + this.tempDeniedList);
        List<String> list = this.tempDeniedList;
        List<String> list2 = this.tempGrantedList;
        if (grantResultMap != null) {
            Iterator<Map.Entry<String, Boolean>> it = grantResultMap.entrySet().iterator();
            boolean zBooleanValue = false;
            while (it.hasNext()) {
                zBooleanValue = it.next().getValue().booleanValue();
            }
            if (zBooleanValue) {
                list2.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            } else {
                list.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
        } else {
            list.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        MiuiPermission miuiPermission = this.miuiPermission;
        if (miuiPermission != null) {
            miuiPermission.endRequest$common_release(list.isEmpty(), list2, list);
        }
    }

    private final void onRequestMultiplePermissionsResult(Map<String, Boolean> grantResultMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (grantResultMap != null) {
            for (Map.Entry<String, Boolean> entry : grantResultMap.entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().booleanValue()) {
                    ListExtKt.add(arrayList, key);
                } else {
                    ListExtKt.add(arrayList2, key);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (this.needSingleRequestBackgroundLocation && Build.VERSION.SDK_INT >= 30) {
                ListExtKt.add(arrayList2, "android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            MiuiPermission miuiPermission = this.miuiPermission;
            if (miuiPermission != null) {
                miuiPermission.endRequest$common_release(arrayList2.isEmpty(), arrayList, arrayList2);
                return;
            }
            return;
        }
        if (!this.needSingleRequestBackgroundLocation) {
            MiuiPermission miuiPermission2 = this.miuiPermission;
            if (miuiPermission2 != null) {
                miuiPermission2.endRequest$common_release(arrayList2.isEmpty(), arrayList, arrayList2);
                return;
            }
            return;
        }
        this.tempGrantedList.addAll(arrayList);
        this.tempDeniedList.addAll(arrayList2);
        String str = this.backGroundLocationDesc;
        ActivityResultLauncher<String[]> activityResultLauncher = null;
        if (str == null || str.length() == 0) {
            ActivityResultLauncher<String[]> activityResultLauncher2 = this.requestBackgroundLocationLauncher;
            if (activityResultLauncher2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestBackgroundLocationLauncher");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            activityResultLauncher.launch(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"});
            return;
        }
        ActivityResultLauncher<String[]> activityResultLauncher3 = this.requestBackgroundLocationLauncher;
        if (activityResultLauncher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBackgroundLocationLauncher");
        } else {
            activityResultLauncher = activityResultLauncher3;
        }
        String str2 = this.backGroundLocationDesc;
        Intrinsics.checkNotNull(str2);
        activityResultLauncher.launch(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", str2});
    }

    private final void postForResult(final Function0<Unit> callback) {
        this.handler.post(new Runnable() { // from class: csh
            @Override // java.lang.Runnable
            public final void run() {
                PermissionInvisibleFragment.postForResult$lambda$6(callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postForResult$lambda$6(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestNow$lambda$7(PermissionInvisibleFragment this$0, MiuiPermission permission, List permissionList, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$permission");
        Intrinsics.checkNotNullParameter(permissionList, "$permissionList");
        this$0.requestNow(permission, permissionList, list);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.i(TAG, "onCreate");
        this.onCreate = true;
        this.requestMultiplePermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: esh
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PermissionInvisibleFragment.onCreate$lambda$1(this.f17021a, (Map) obj);
            }
        });
        this.requestBackgroundLocationLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: fsh
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                PermissionInvisibleFragment.onCreate$lambda$3(this.f18160a, (Map) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        this.onCreate = false;
        this.onDestroy = true;
    }

    public final void requestNow(@NotNull final MiuiPermission permission, @NotNull final List<String> permissionList, @Nullable final List<String> descList) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(permissionList, "permissionList");
        if (!this.onCreate && !this.onDestroy) {
            Logger.i(TAG, "onCreate false post task delay");
            this.handler.postDelayed(new Runnable() { // from class: dsh
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionInvisibleFragment.requestNow$lambda$7(this.f15888a, permission, permissionList, descList);
                }
            }, 300L);
            return;
        }
        if (this.onDestroy) {
            return;
        }
        this.needSingleRequestBackgroundLocation = false;
        this.tempGrantedList.clear();
        this.tempDeniedList.clear();
        ActivityResultLauncher activityResultLauncher = null;
        this.backGroundLocationDesc = null;
        this.miuiPermission = permission;
        int size = descList != null ? descList.size() : 0;
        int size2 = permissionList.size();
        ArrayList arrayList = new ArrayList();
        if (size == size2 && PermissionExtKt.supportMiuiPermissionEnable()) {
            for (int i = 0; i < size; i++) {
                String str = permissionList.get(i);
                if (Intrinsics.areEqual(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    Intrinsics.checkNotNull(descList);
                    this.backGroundLocationDesc = descList.get(i);
                    this.needSingleRequestBackgroundLocation = true;
                } else {
                    ListExtKt.add(arrayList, str);
                    Intrinsics.checkNotNull(descList);
                    ListExtKt.add(arrayList, descList.get(i));
                }
            }
        } else {
            for (String str2 : permissionList) {
                if (Intrinsics.areEqual(str2, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    this.needSingleRequestBackgroundLocation = true;
                } else {
                    ListExtKt.add(arrayList, str2);
                }
            }
        }
        Logger.i(TAG, "requestNow requestList:" + arrayList + ";bgPermission:" + this.needSingleRequestBackgroundLocation + ";bgPermissionDesc:" + this.backGroundLocationDesc);
        ActivityResultLauncher<String[]> activityResultLauncher2 = this.requestMultiplePermissionLauncher;
        if (activityResultLauncher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMultiplePermissionLauncher");
        } else {
            activityResultLauncher = activityResultLauncher2;
        }
        activityResultLauncher.launch(arrayList.toArray(new String[0]));
    }
}
