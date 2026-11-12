package com.huami.devicex.injection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.huami.devicex.injection.basic.FirstBeatManagerApi;
import com.huami.devicex.injection.basic.StressUserCaseApi;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u000eH&J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u000eH&J\b\u0010\u001e\u001a\u00020\u000eH&J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000eH&J\u0014\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010!\u001a\u00020\u000eH&J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u000bH&J\b\u0010&\u001a\u00020\u0002H&J\b\u0010'\u001a\u00020\u000eH&J\u0018\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000e0(j\b\u0012\u0004\u0012\u00020\u000e`)H&J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001aH&J\u0018\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000eH&J\b\u00102\u001a\u00020\u0002H&J\b\u00103\u001a\u00020\u0002H&J\b\u00104\u001a\u00020\u0002H&¨\u00065"}, d2 = {"Lcom/huami/devicex/injection/AppStateApi;", "", "", "isForeground", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "createMainTabActivityIntent", "", "jumpToDeviceDetailPage", "onDeviceDestroy", "Landroid/app/Activity;", "getTopActivity", "isLogData", "", "key", "", "getThreadPoolConst", "shouldInitMusic", "Lcom/huami/devicex/injection/RunningManagerApi;", "getRunningManagerApi", "Lcom/huami/devicex/injection/basic/StressUserCaseApi;", "getStressUseCaseApi", "Lcom/huami/devicex/injection/basic/FirstBeatManagerApi;", "getFirstBeatManagerApi", "getChannelName", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "showSelectImageFragment", "getAreaBySave", "getMainActivityName", "toolName", "createToolFn", "tag", "Ljava/lang/Class;", "getActivityClass", "activity", "isStartUpActivity", "hasSleepData", "getChannelProduction", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getIgnoreFwUpgradeList", "navigateActivityTo", "jumpToTreadmillSportPage", "jumpToDetailInfoActivity", "fragmentManager", "showAlexaLanguageSettingActivity", PointCategory.PERMISSION, "checkPermission", "isMiui", "isHK", "isFeedbackActivity", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AppStateApi {
    boolean checkPermission(@NotNull Context context, @NotNull String permission);

    @NotNull
    Intent createMainTabActivityIntent(@NotNull Context context);

    void createToolFn(@NotNull Context context, @NotNull String toolName);

    @NotNull
    Class<?> getActivityClass(@NotNull String tag);

    @NotNull
    String getAreaBySave();

    @NotNull
    String getChannelName();

    @NotNull
    String getChannelProduction();

    @NotNull
    FirstBeatManagerApi getFirstBeatManagerApi();

    @NotNull
    ArrayList<String> getIgnoreFwUpgradeList();

    @NotNull
    String getMainActivityName();

    @NotNull
    RunningManagerApi getRunningManagerApi();

    @NotNull
    StressUserCaseApi getStressUseCaseApi();

    int getThreadPoolConst(@NotNull String key);

    @Nullable
    Activity getTopActivity();

    boolean hasSleepData();

    boolean isFeedbackActivity();

    boolean isForeground();

    boolean isHK();

    boolean isLogData();

    boolean isMiui();

    boolean isStartUpActivity(@NotNull Activity activity);

    void jumpToDetailInfoActivity(@NotNull Context context);

    void jumpToDeviceDetailPage(@NotNull Context context);

    void jumpToTreadmillSportPage(@NotNull Context context);

    void navigateActivityTo(@NotNull Context context, @NotNull String key);

    void onDeviceDestroy();

    boolean shouldInitMusic();

    void showAlexaLanguageSettingActivity(@NotNull Context context, @NotNull FragmentManager fragmentManager);

    void showSelectImageFragment(@NotNull String key, @NotNull FragmentManager supportFragmentManager);
}
