package com.xiaomi.fitness.sport_capture.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import com.xiaomi.fitness.sport_capture.ui.BaseVideoActivity;
import com.xiaomi.fitness.sport_capture.utils.DevicePreviewNotifyUtils;
import defpackage.aje;
import defpackage.d1j;
import defpackage.evi;
import defpackage.r72;
import defpackage.yri;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\t\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR \u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/ui/BaseVideoActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "getName", "", "hasPreviewSuccess", "", "previewSuccessReceiver", "com/xiaomi/fitness/sport_capture/ui/BaseVideoActivity$previewSuccessReceiver$1", "Lcom/xiaomi/fitness/sport_capture/ui/BaseVideoActivity$previewSuccessReceiver$1;", "deniedAction", "Lkotlin/Function1;", "", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, "checkPermissions", "showFragment", "getOutputDirectory", "Ljava/io/File;", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, "onSaveInstanceState", "outState", "onRestoreInstanceState", LifecycleConstantKt.ON_DESTROY, "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseVideoActivity extends FragmentActivity {

    @NotNull
    public static final String BACKGROUND_ACTION = "video_background_action";

    @NotNull
    public static final String KEY_HAS_PREVIEW = "key.has_preview_success";

    @NotNull
    public static final String PREVIEW_SUCCESS_ACTION = "sport_preview_success_action";

    @NotNull
    private static final String TAG = "BaseVideoActivity";
    private boolean hasPreviewSuccess;

    @NotNull
    private final BaseVideoActivity$previewSuccessReceiver$1 previewSuccessReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.sport_capture.ui.BaseVideoActivity$previewSuccessReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.hasPreviewSuccess = true;
        }
    };

    @NotNull
    private final Function1<List<String>, Unit> deniedAction = new Function1() { // from class: mf2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return BaseVideoActivity.deniedAction$lambda$0(this.f26093a, (List) obj);
        }
    };

    private final void checkPermissions() {
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 ? PermissionExtKt.checkPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA", "android.permission.RECORD_AUDIO") : PermissionExtKt.checkPermissions(this, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")).isEmpty()) {
            showFragment();
            return;
        }
        DevicePreviewNotifyUtils.notifyWaitPermission();
        if (i <= 28) {
            PermissionExtKt.permissions$default(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, (String[]) null, new Function1() { // from class: if2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseVideoActivity.checkPermissions$lambda$3(this.f21076a, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
        } else {
            PermissionExtKt.permissions$default(this, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, (String[]) null, new Function1() { // from class: jf2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseVideoActivity.checkPermissions$lambda$6(this.f22724a, (MultiplePermissionsBuilder) obj);
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$3(final BaseVideoActivity this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: gf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoActivity.checkPermissions$lambda$3$lambda$1();
            }
        });
        permissions.denied(new Function1() { // from class: hf2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseVideoActivity.checkPermissions$lambda$3$lambda$2(this.f20003a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$3$lambda$1() {
        Logger.i(TAG, "allGranted");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$3$lambda$2(BaseVideoActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.deniedAction.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$6(final BaseVideoActivity this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: kf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseVideoActivity.checkPermissions$lambda$6$lambda$4();
            }
        });
        permissions.denied(new Function1() { // from class: lf2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseVideoActivity.checkPermissions$lambda$6$lambda$5(this.f24997a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$6$lambda$4() {
        Logger.i(TAG, "allGranted");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermissions$lambda$6$lambda$5(BaseVideoActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.deniedAction.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deniedAction$lambda$0(BaseVideoActivity this$0, List permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        if (permissions.contains("android.permission.WRITE_EXTERNAL_STORAGE") || permissions.contains("android.permission.READ_EXTERNAL_STORAGE")) {
            ToastUtil.INSTANCE.showToast(d1j.v);
        } else if (permissions.contains("android.permission.CAMERA")) {
            ToastUtil.INSTANCE.showToast(d1j.f14962k);
        } else if (permissions.contains("android.permission.RECORD_AUDIO")) {
            ToastUtil.INSTANCE.showToast(d1j.g);
        }
        Logger.i(TAG, "denied " + CollectionsKt___CollectionsKt.joinToString$default(permissions, null, null, null, 0, null, null, 63, null));
        this$0.finish();
        DevicePreviewNotifyUtils.notifyFail();
        return Unit.INSTANCE;
    }

    @NotNull
    public String getName() {
        return "";
    }

    @NotNull
    public final File getOutputDirectory() {
        File fileM = r72.m("SportCapture");
        if (!fileM.exists()) {
            fileM.mkdirs();
        }
        Intrinsics.checkNotNull(fileM);
        return fileM;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(evi.f17106a);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.hideSystemUI(window);
        Logger.i(TAG, getName() + " screen orientation:" + getRequestedOrientation());
        aje.b(this).c(this.previewSuccessReceiver, new IntentFilter(PREVIEW_SUCCESS_ACTION));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        aje.b(this).e(this.previewSuccessReceiver);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(TAG, LifecycleConstantKt.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.getBoolean(KEY_HAS_PREVIEW)) {
            Logger.i(TAG, "can not restore from preview status!!");
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkPermissions();
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Logger.i(TAG, "onSaveInstanceState-" + this.hasPreviewSuccess + "!!");
        outState.putBoolean(KEY_HAS_PREVIEW, this.hasPreviewSuccess);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Logger.i(TAG, LifecycleConstantKt.ON_STOP);
        super.onStop();
        aje.b(getApplication()).d(new Intent(BACKGROUND_ACTION));
        SportCapturePreference.INSTANCE.setAppProjecting(false);
    }

    public final void showFragment() {
        getSupportFragmentManager().o().w(yri.c, VideoFragment.x0()).l();
    }
}
