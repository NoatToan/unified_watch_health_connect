package com.xiaomi.fitness.sport_eco.ftp.ui;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestIntroduceViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "mSportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getSportState", "", "disconnectOperate", "", "setGymFtpTest", "value", "", "callback", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtpTestIntroduceViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "FtpTestIntroduceViewModel";

    @NotNull
    private IEcoSportRemoteState mSportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    public final void disconnectOperate() {
        this.mSportStateCaller.abnormalChangeSportStateToFinish();
    }

    public final int getSportState() {
        return this.mSportStateCaller.getSportState();
    }

    public final void setGymFtpTest(boolean value, @NotNull RequestCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mSportStateCaller.setGymFtpTest(value, callback);
    }
}
