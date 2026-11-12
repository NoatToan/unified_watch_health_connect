package com.xiaomi.fitness.login.export;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 '2\u00020\u0001:\u0001'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u001c\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\rH&J\u001c\u0010\u000e\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\bH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0014\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&J\u001c\u0010\u001c\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\rH&J\u001c\u0010\u001d\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0005H&J!\u0010\"\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0003H&¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/login/export/CheckerUserSettingManager;", "", "checkUserProfile", "", "isShowGuide", "", "accountLogin", "getSelectMode", "", "setSelectMode", DeviceSettingConfigKey.KEY_SELECT_MODE, "addSelectModeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "removeSelectModeListener", "setSelectModeToWeb", "select", "checkDeviceSettingForSelectMode", Constants.KEY_REQUEST_DATA, LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "showLoginDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setPrivacyAgreeTag", CommonConstants.KEY_AGREE, "setPrivacyDialogFinished", "finished", "getPrivacyDialogFinished", "addPrivacyDialogFinishedListener", "removePrivacyDialogFinishedListener", "getUserInfoFromWeb", "getIntentStartApp", "setIntentStartApp", "value", "startSplashActivity", "Landroid/app/Activity;", "flag", "(Landroid/app/Activity;Ljava/lang/Boolean;)V", "reportRemovePrivacyAgreeTime", "Companion", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CheckerUserSettingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/login/export/CheckerUserSettingManager$Companion;", "", "<init>", "()V", "VITALITY_MODE", "", "getVITALITY_MODE", "()I", "CONCISE_MODE", "getCONCISE_MODE", "UNKOWN_MODE", "getUNKOWN_MODE", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int VITALITY_MODE = 1;
        private static final int CONCISE_MODE = 2;
        private static final int UNKOWN_MODE = -1;

        private Companion() {
        }

        public final int getCONCISE_MODE() {
            return CONCISE_MODE;
        }

        public final int getUNKOWN_MODE() {
            return UNKOWN_MODE;
        }

        public final int getVITALITY_MODE() {
            return VITALITY_MODE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startSplashActivity$default(CheckerUserSettingManager checkerUserSettingManager, Activity activity, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSplashActivity");
            }
            if ((i & 2) != 0) {
                bool = Boolean.TRUE;
            }
            checkerUserSettingManager.startSplashActivity(activity, bool);
        }
    }

    void accountLogin();

    void addPrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener);

    void addSelectModeListener(@NotNull Function1<? super Integer, Unit> listener);

    int checkDeviceSettingForSelectMode();

    void checkUserProfile(boolean isShowGuide);

    boolean getIntentStartApp();

    boolean getPrivacyDialogFinished();

    int getSelectMode();

    void getUserInfoFromWeb();

    void removePrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener);

    void removeSelectModeListener(@NotNull Function1<? super Integer, Unit> listener);

    void reportRemovePrivacyAgreeTime();

    void requestData(@NotNull FragmentActivity activity);

    void setIntentStartApp(boolean value);

    void setPrivacyAgreeTag(boolean agree);

    void setPrivacyDialogFinished(boolean finished);

    void setSelectMode(int selectMode);

    void setSelectModeToWeb(int select);

    @NotNull
    CommonDialog<?> showLoginDialog(@NotNull FragmentActivity activity);

    void startSplashActivity(@NotNull Activity activity, @Nullable Boolean flag);
}
