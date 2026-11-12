package com.xiaomi.fitness.privacy;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.main.sharepreference.PrivacySensitivePreference;
import com.xiaomi.fitness.privacy.export.IPrivacySensitive;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.logoff.PassportWebActivity;
import com.xiaomi.fitness.privacy.permission.SystemPermissionFragment;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/privacy/PrivacyHelperImpl;", "Lcom/xiaomi/fitness/privacy/export/PrivacyHelper;", "<init>", "()V", "startPassportWebActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "startPassportWebActivityForLogoff", "startSystemPermissionPage", "context", "Landroid/content/Context;", "showPrivacySensitiveDialogIfNeed", "", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/privacy/export/IPrivacySensitive;", "getKeyUserSetting", "setKeyUserSetting", "value", "addUserSettingFinishedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrivacyHelperImpl implements PrivacyHelper {
    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public void addUserSettingFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PrivacySensitivePreference.INSTANCE.addUserSettingFinishedListener(listener);
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public boolean getKeyUserSetting() {
        return PrivacySensitivePreference.INSTANCE.getKeyUserSetting();
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public void setKeyUserSetting(boolean value) {
        PrivacySensitivePreference.INSTANCE.setKeyUserSetting(value);
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public boolean showPrivacySensitiveDialogIfNeed(@NotNull FragmentActivity context, @NotNull IPrivacySensitive action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        return PrivacySensitiveHelper.INSTANCE.showPrivacySensitiveDialogIfNeed(context, action);
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public void startPassportWebActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PassportWebActivity.INSTANCE.show(activity);
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public void startPassportWebActivityForLogoff(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PassportWebActivity.INSTANCE.showLogoffWebActivity(activity);
    }

    @Override // com.xiaomi.fitness.privacy.export.PrivacyHelper
    public void startSystemPermissionPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        dih.a().e(context, new FragmentParams.b().e(SystemPermissionFragment.class).b());
    }
}
