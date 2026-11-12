package com.huami.module.homepage.cards.service;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\b\u0010\u0015\u001a\u00020\u0014H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\u0017\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H&¨\u0006\u001b"}, d2 = {"Lcom/huami/module/homepage/cards/service/CardAssistService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/flow/Flow;", "", "isPaiEnabled", "", "openPaiSetting", "openHeartRateSetting", "getPaiEnabled", "fullHeartRateIsOpen", "isOpenFullHeartRate", "deviceBindNotifiers", "loginNotifier", "unitChangeNotifier", "timeChangeNotifier", "loginOrDeviceBindListener", "personInfoChangeNotifier", "dataDownloadFinishedNotifier", "", "getTempUnit", "stressSwitchChangeNotifier", "currentBindDeviceIsL66", "Landroid/app/Activity;", "activity", "checkAppUpdate", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface CardAssistService {
    void checkAppUpdate(@NotNull Activity activity);

    boolean currentBindDeviceIsL66();

    @NotNull
    Flow<Unit> dataDownloadFinishedNotifier();

    @NotNull
    Flow<Unit> deviceBindNotifiers();

    boolean fullHeartRateIsOpen(@NotNull Context context);

    @WorkerThread
    boolean getPaiEnabled(@NotNull Context context);

    int getTempUnit();

    @NotNull
    Flow<Boolean> isOpenFullHeartRate(@NotNull Context context);

    @NotNull
    Flow<Boolean> isPaiEnabled(@NotNull Context context);

    @NotNull
    Flow<Unit> loginNotifier();

    @NotNull
    Flow<Unit> loginOrDeviceBindListener();

    void openHeartRateSetting(@NotNull Context context);

    void openPaiSetting(@NotNull Context context);

    @NotNull
    Flow<Unit> personInfoChangeNotifier();

    @NotNull
    Flow<Boolean> stressSwitchChangeNotifier();

    @NotNull
    Flow<Unit> timeChangeNotifier();

    @NotNull
    Flow<Unit> unitChangeNotifier();
}
