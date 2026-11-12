package com.xiaomi.fitness.rn.share.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.DeviceShareManagerExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.share.request.MijiaRequest;
import com.xiaomi.fitness.rn.share.ui.DeviceShareDialogActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/DeviceShareDialogActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "healthDeviceAccessSwitch", "", "getHealthDeviceAccessSwitch", "()Z", "healthDeviceAccessSwitch$delegate", "Lkotlin/Lazy;", "shareAccept", "getShareAccept", "shareAccept$delegate", PkConstants.PARAM_INVITE_ID, "", "getInviteId", "()Ljava/lang/String;", "inviteId$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "acceptShare", LifecycleConstantKt.TYPE_ACTIVITY, "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceShareDialogActivity extends FragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_HEALTH_DEVICE_ACCESS_SWITCH = "KEY_HEALTH_DEVICE_ACCESS_SWITCH";

    @NotNull
    private static final String KEY_INVITE_ID = "KEY_INVITE_ID";

    @NotNull
    private static final String KEY_SHARE_ACCEPT = "KEY_SHARE_ACCEPT";

    @NotNull
    private final ActivityResultLauncher<Intent> activityForResult;

    /* JADX INFO: renamed from: healthDeviceAccessSwitch$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthDeviceAccessSwitch = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: po6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(DeviceShareDialogActivity.healthDeviceAccessSwitch_delegate$lambda$0(this.f30581a));
        }
    });

    /* JADX INFO: renamed from: shareAccept$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareAccept = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qo6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(DeviceShareDialogActivity.shareAccept_delegate$lambda$1(this.f31692a));
        }
    });

    /* JADX INFO: renamed from: inviteId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inviteId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ro6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceShareDialogActivity.inviteId_delegate$lambda$2(this.f32742a);
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/DeviceShareDialogActivity$Companion;", "", "<init>", "()V", DeviceShareDialogActivity.KEY_HEALTH_DEVICE_ACCESS_SWITCH, "", DeviceShareDialogActivity.KEY_SHARE_ACCEPT, DeviceShareDialogActivity.KEY_INVITE_ID, "launch", "", "context", "Landroid/content/Context;", "healthDeviceAccessSwitch", "", "shareAccept", PkConstants.PARAM_INVITE_ID, "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launch$lambda$0(boolean z, boolean z2, String inviteId, Intent it) {
            Intrinsics.checkNotNullParameter(inviteId, "$inviteId");
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtra(DeviceShareDialogActivity.KEY_HEALTH_DEVICE_ACCESS_SWITCH, z);
            it.putExtra(DeviceShareDialogActivity.KEY_SHARE_ACCEPT, z2);
            it.putExtra(DeviceShareDialogActivity.KEY_INVITE_ID, inviteId);
            return Unit.INSTANCE;
        }

        public final void launch(@NotNull Context context, final boolean healthDeviceAccessSwitch, final boolean shareAccept, @NotNull final String inviteId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inviteId, "inviteId");
            LaunchExtensionKt.startActivity(context, (Class<?>) DeviceShareDialogActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: uo6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareDialogActivity.Companion.launch$lambda$0(healthDeviceAccessSwitch, shareAccept, inviteId, (Intent) obj);
                }
            });
        }
    }

    public DeviceShareDialogActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: so6
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                DeviceShareDialogActivity.activityForResult$lambda$3(this.f33833a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityForResult = activityResultLauncherRegisterForActivityResult;
    }

    private final void acceptShare(boolean shareAccept, String inviteId, FragmentActivity activity) {
        if (shareAccept) {
            MijiaRequest.INSTANCE.accept(inviteId, true, new Function1() { // from class: no6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareDialogActivity.acceptShare$lambda$5(this.f28194a, ((Boolean) obj).booleanValue());
                }
            }, new Function2() { // from class: oo6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceShareDialogActivity.acceptShare$lambda$6(this.f29333a, ((Integer) obj).intValue(), (String) obj2);
                }
            });
        } else {
            DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE).gotoDeviceShareListActivity(activity, DeviceShareActivity.sPageAcceptList);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptShare$lambda$5(DeviceShareDialogActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceManager.DefaultImpls.requestDeviceList$default(RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE), null, new Function1() { // from class: to6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDialogActivity.acceptShare$lambda$5$lambda$4((ApiException) obj);
            }
        }, 1, null);
        AnyExtKt.main$default(null, new DeviceShareDialogActivity$acceptShare$1$2(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptShare$lambda$5$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptShare$lambda$6(DeviceShareDialogActivity this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new DeviceShareDialogActivity$acceptShare$2$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityForResult$lambda$3(DeviceShareDialogActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (RegionPreference.INSTANCE.getHEALTH_DEVICE_ACCESS_SWITCH()) {
            this$0.acceptShare(this$0.getShareAccept(), this$0.getInviteId(), this$0);
        }
        this$0.finish();
    }

    private final boolean getHealthDeviceAccessSwitch() {
        return ((Boolean) this.healthDeviceAccessSwitch.getValue()).booleanValue();
    }

    private final String getInviteId() {
        return (String) this.inviteId.getValue();
    }

    private final boolean getShareAccept() {
        return ((Boolean) this.shareAccept.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean healthDeviceAccessSwitch_delegate$lambda$0(DeviceShareDialogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getBooleanExtra(KEY_HEALTH_DEVICE_ACCESS_SWITCH, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String inviteId_delegate$lambda$2(DeviceShareDialogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String stringExtra = this$0.getIntent().getStringExtra(KEY_INVITE_ID);
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareAccept_delegate$lambda$1(DeviceShareDialogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getBooleanExtra(KEY_SHARE_ACCEPT, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getHealthDeviceAccessSwitch()) {
            acceptShare(getShareAccept(), getInviteId(), this);
        } else {
            AboutManagerExtKt.getInstance(AboutManager.INSTANCE).showHealthDeviceAccessSwitchDialog(this, this.activityForResult);
        }
    }
}
