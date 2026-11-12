package com.mi.health.shortcut;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.habit.export.HabitManagerKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceTabManager;
import com.xiaomi.fitness.device.manager.export.DeviceTabManagerExtKt;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mi/health/shortcut/LocaleChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocaleChangeReceiver extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "LanguageChangeReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.LOCALE_CHANGED")) {
            String language = ApplicationExtKt.getApplication().getResources().getConfiguration().getLocales().get(0).getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            String lowerCase = language.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Logger.i(TAG, "action=" + intent.getAction() + " language=" + lowerCase);
            HabitManagerKt.getHabitManager().addHabitPunchInShortcut();
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).addLaunchSportShortcut();
            MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).addMyCampaignsShortcut();
            DeviceTabManagerExtKt.getInstance(DeviceTabManager.INSTANCE).addMyDeviceShortcut();
        }
    }
}
