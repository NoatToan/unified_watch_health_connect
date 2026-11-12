package com.xiaomi.fitness.sport.eco.export;

import android.app.ActivityOptions;
import android.content.Context;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import defpackage.fw7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager;", "", "Landroid/content/Context;", "context", "Landroid/app/ActivityOptions;", "activityOptions", "", "goToGymLaunchSportActivity", "(Landroid/content/Context;Landroid/app/ActivityOptions;)V", "", "did", "", "timestamp", "", DailyRecordKey.sportType, "Lfw7;", "callback", "openSportReport", "(Landroid/content/Context;Ljava/lang/String;JILfw7;)V", "Companion", "sport-eco-export_release"}, k = 1, mv = {2, 0, 0})
public interface EcoSportManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager$Companion;", "", "<init>", "()V", "sport-eco-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void goToGymLaunchSportActivity(@NotNull Context context, @Nullable ActivityOptions activityOptions);

    void openSportReport(@NotNull Context context, @NotNull String did, long timestamp, int sportType, @NotNull fw7 callback);
}
