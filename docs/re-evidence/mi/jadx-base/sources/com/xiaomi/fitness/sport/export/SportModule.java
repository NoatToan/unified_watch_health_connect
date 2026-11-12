package com.xiaomi.fitness.sport.export;

import com.xiaomi.fitness.sport.view.justdance.JustDanceImpl;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAidongGameApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/export/SportModule;", "", "<init>", "()V", "bindSportAccessApi", "Lcom/xiaomi/fitness/sport_export/ISportAccessApi;", "sportApi", "Lcom/xiaomi/fitness/sport/export/SportAccessApiImp;", "bindRunningRouteApi", "Lcom/xiaomi/fitness/sport_export/IRunningRouteApi;", "runningRouteApi", "Lcom/xiaomi/fitness/sport/export/RunningRouteApiImpl;", "bindJustDanceApi", "Lcom/xiaomi/fitness/sport_export/IJustDanceApi;", "justDanceApi", "Lcom/xiaomi/fitness/sport/view/justdance/JustDanceImpl;", "bindSportAidongGameApi", "Lcom/xiaomi/fitness/sport_export/SportAidongGameApi;", "sportAidongGameApi", "Lcom/xiaomi/fitness/sport/export/SportAidongGameApiImpl;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SportModule {
    @NotNull
    public abstract IJustDanceApi bindJustDanceApi(@NotNull JustDanceImpl justDanceApi);

    @NotNull
    public abstract IRunningRouteApi bindRunningRouteApi(@NotNull RunningRouteApiImpl runningRouteApi);

    @NotNull
    public abstract ISportAccessApi bindSportAccessApi(@NotNull SportAccessApiImp sportApi);

    @NotNull
    public abstract SportAidongGameApi bindSportAidongGameApi(@NotNull SportAidongGameApiImpl sportAidongGameApi);
}
