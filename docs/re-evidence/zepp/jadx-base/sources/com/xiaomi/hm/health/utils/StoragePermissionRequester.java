package com.xiaomi.hm.health.utils;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import androidx.p008lifecycle.DefaultLifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContracts;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.utils.StoragePermissionRequester;
import defpackage.x51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u000e\u001eB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/utils/StoragePermissionRequester;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onCreate", "askReadStoragePermission", "askWriteStoragePermission", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "checkReadStoragePermission", "checkWriteStoragePermission", "Landroidx/activity/result/ActivityResultRegistry;", "a", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lcom/xiaomi/hm/health/utils/StoragePermissionRequester$IStoragePermissionCallback;", "b", "Lcom/xiaomi/hm/health/utils/StoragePermissionRequester$IStoragePermissionCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "c", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "<init>", "(Landroidx/activity/result/ActivityResultRegistry;Lcom/xiaomi/hm/health/utils/StoragePermissionRequester$IStoragePermissionCallback;)V", GoogleApiAvailabilityLight.a, "IStoragePermissionCallback", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StoragePermissionRequester implements DefaultLifecycleObserver {

    @NotNull
    private static final a d = new a(null);

    @Deprecated
    @NotNull
    private static final String e = "StoragePermissionRequester";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultRegistry registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IStoragePermissionCallback callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ActivityResultLauncher<String[]> launcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/utils/StoragePermissionRequester$IStoragePermissionCallback;", "", "", "granted", "", "onReadStorageGranted", "onWriteStorageGranted", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface IStoragePermissionCallback {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static void onReadStorageGranted(@NotNull IStoragePermissionCallback iStoragePermissionCallback, boolean z) {
            }

            public static void onWriteStorageGranted(@NotNull IStoragePermissionCallback iStoragePermissionCallback, boolean z) {
            }
        }

        void onReadStorageGranted(boolean granted);

        void onWriteStorageGranted(boolean granted);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/utils/StoragePermissionRequester$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkReadStoragePermission result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkWriteStoragePermission result: " + this.a;
        }
    }

    public StoragePermissionRequester(@NotNull ActivityResultRegistry activityResultRegistry, @NotNull IStoragePermissionCallback iStoragePermissionCallback) {
        this.registry = activityResultRegistry;
        this.callback = iStoragePermissionCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(StoragePermissionRequester storagePermissionRequester, Map map) {
        if (map.containsKey("android.permission.READ_EXTERNAL_STORAGE")) {
            Boolean bool = (Boolean) map.get("android.permission.READ_EXTERNAL_STORAGE");
            storagePermissionRequester.callback.onReadStorageGranted(bool == null ? false : bool.booleanValue());
        }
        if (map.containsKey("android.permission.WRITE_EXTERNAL_STORAGE")) {
            Boolean bool2 = (Boolean) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
            storagePermissionRequester.callback.onWriteStorageGranted(bool2 != null ? bool2.booleanValue() : false);
        }
    }

    public final void askReadStoragePermission() {
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    public final void askWriteStoragePermission() {
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public final boolean checkReadStoragePermission(@NotNull Context context) {
        int iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
        HMLog.info(e, new b(iCheckSelfPermission));
        return iCheckSelfPermission == 0;
    }

    public final boolean checkWriteStoragePermission(@NotNull Context context) {
        int iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        HMLog.info(e, new c(iCheckSelfPermission));
        return iCheckSelfPermission == 0;
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        x51.a(this, owner);
        this.launcher = this.registry.register(e, owner, new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: sg7
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                StoragePermissionRequester.b(this.a, (Map) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        x51.b(this, lifecycleOwner);
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        x51.c(this, lifecycleOwner);
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        x51.d(this, lifecycleOwner);
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        x51.e(this, lifecycleOwner);
    }

    @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        x51.f(this, lifecycleOwner);
    }
}
