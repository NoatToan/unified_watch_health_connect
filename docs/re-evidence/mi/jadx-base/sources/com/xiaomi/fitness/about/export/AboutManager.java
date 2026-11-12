package com.xiaomi.fitness.about.export;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.p004activity.result.ActivityResultLauncher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.about.setting.SettingActivityKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH&J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H&J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/about/export/AboutManager;", "", "gotoAboutActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "gotoSettingActivity", SettingActivityKt.KEY_PARAMS_IS_V4, "", "gotoPluginVersionActivity", "isCoachMale", "getNotUploadGpsEnable", "addNotUploadGpsEnableListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "setNotUploadGpsEnable", "notUpload", "getPrivacyPageInfo", "Lkotlin/Pair;", "", "showHealthDeviceAccessSwitchDialog", "Landroidx/fragment/app/FragmentActivity;", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Companion", "about-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AboutManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/about/export/AboutManager$Companion;", "", "<init>", "()V", "about-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addNotUploadGpsEnableListener(@NotNull Function1<? super Boolean, Unit> listener);

    boolean getNotUploadGpsEnable();

    @NotNull
    Pair<String, String> getPrivacyPageInfo();

    void gotoAboutActivity(@NotNull Activity activity);

    void gotoPluginVersionActivity(@NotNull Activity activity);

    void gotoSettingActivity(@NotNull Activity activity, boolean isV4);

    boolean isCoachMale();

    void setNotUploadGpsEnable(boolean notUpload);

    void showHealthDeviceAccessSwitchDialog(@NotNull FragmentActivity activity, @NotNull ActivityResultLauncher<Intent> activityForResult);
}
