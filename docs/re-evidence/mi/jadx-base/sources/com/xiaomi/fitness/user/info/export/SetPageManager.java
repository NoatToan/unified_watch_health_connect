package com.xiaomi.fitness.user.info.export;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000 12\u00020\u0001:\u00011J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\u0014\u001a\u00020\rH&J\b\u0010\u0015\u001a\u00020\rH&J\b\u0010\u0016\u001a\u00020\rH&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\rH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010!\u001a\u00020\"H&J\u0012\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u001cH&J\b\u0010%\u001a\u00020\rH&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\rH&J\u001c\u0010(\u001a\u00020\u00032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030*H&J\u001c\u0010+\u001a\u00020\u00032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030*H&J\u001c\u0010,\u001a\u00020\u00032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030*H&J\u001c\u0010-\u001a\u00020\u00032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030*H&J\u0016\u0010.\u001a\u00020\u00032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b00H&¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/SetPageManager;", "", "goFirstGuidPage", "", "referenceActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "index", "", "goNextGuidPage", "goSetThreeGoalPage", LifecycleConstantKt.TYPE_ACTIVITY, "isLastPage", "", "getFirstGuidPageIndex", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "onFinishClick", "destroyActivity", "startGoalManagerActivity", "isDeviceSupportMhs", "isDeviceSupportStand", "isDeviceSupportAll", "setDefaultSupport", "", "data", "supportMhs", "startUserIndicatorsActivity", "Landroid/content/Context;", "startUserIndicatorsActivityForCreateAbilityPlan", "showUserInfoDialog", "Landroidx/fragment/app/FragmentActivity;", "isFirstGoalGuidPage", "getMedicalIdHomePageIntent", "Landroid/content/Intent;", "goMedicalIdEditPage", "context", "getShowGuidePageFinish", "setShowGuidePageFinish", "finished", "addGuideFinishListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "removeGuideFinishListener", "addDeviceUpdateAllGoalSupportListener", "removeDeviceUpdateAllGoalSupportListener", "requestUserInfoGuide", "requestList", "", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SetPageManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/SetPageManager$Companion;", "", "<init>", "()V", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener);

    void addGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener);

    void destroyActivity();

    int getFirstGuidPageIndex(@NotNull UserProfile profile);

    @NotNull
    Intent getMedicalIdHomePageIntent();

    boolean getShowGuidePageFinish();

    void goFirstGuidPage(@Nullable WeakReference<Activity> referenceActivity, int index);

    void goMedicalIdEditPage(@Nullable Context context);

    void goNextGuidPage(@Nullable WeakReference<Activity> referenceActivity, int index);

    void goSetThreeGoalPage(@NotNull Activity activity);

    boolean isDeviceSupportAll();

    boolean isDeviceSupportMhs();

    boolean isDeviceSupportStand();

    boolean isFirstGoalGuidPage(int index);

    boolean isLastPage(int index);

    void onFinishClick();

    void removeDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener);

    void removeGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener);

    void requestUserInfoGuide(@NotNull List<Integer> requestList);

    @NotNull
    String setDefaultSupport(@NotNull UserProfile data, boolean supportMhs);

    void setShowGuidePageFinish(boolean finished);

    void showUserInfoDialog(@NotNull FragmentActivity activity);

    void startGoalManagerActivity(@NotNull Activity activity);

    void startUserIndicatorsActivity(@NotNull Context activity);

    void startUserIndicatorsActivityForCreateAbilityPlan(@NotNull Context activity);
}
