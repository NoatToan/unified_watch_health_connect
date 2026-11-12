package com.xiaomi.fitness.privacy.export;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH&J\u001c\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/privacy/export/PrivacyHelper;", "", "startPassportWebActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "startPassportWebActivityForLogoff", "startSystemPermissionPage", "context", "Landroid/content/Context;", "showPrivacySensitiveDialogIfNeed", "", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/privacy/export/IPrivacySensitive;", "getKeyUserSetting", "setKeyUserSetting", "value", "addUserSettingFinishedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Companion", "privacy-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PrivacyHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/privacy/export/PrivacyHelper$Companion;", "", "<init>", "()V", "privacy-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addUserSettingFinishedListener(@NotNull Function1<? super Boolean, Unit> listener);

    boolean getKeyUserSetting();

    void setKeyUserSetting(boolean value);

    boolean showPrivacySensitiveDialogIfNeed(@NotNull FragmentActivity context, @NotNull IPrivacySensitive action);

    void startPassportWebActivity(@NotNull Activity activity);

    void startPassportWebActivityForLogoff(@NotNull Activity activity);

    void startSystemPermissionPage(@NotNull Context context);
}
