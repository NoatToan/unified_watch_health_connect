package com.xiaomi.fitness.sport_eco_manager.receiver;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.receiver.data.IDataProcesser;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_eco_manager.utils.SportUtilsKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import defpackage.brc;
import defpackage.g2o;
import defpackage.y7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b0\u00101J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010#R\u0018\u0010)\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/receiver/FreeTrainingDataProcesser;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lbrc;", "Landroid/os/Handler$Callback;", "", "computeDataOfFreeTraining", "()V", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Lcom/xiaomi/fitness/sport_eco_manager/sensor/SportSensorResult;", "sportSensorResult", "onReceivePhoneSensorData", "(Lcom/xiaomi/fitness/sport_eco_manager/sensor/SportSensorResult;)V", "Ly7r;", "sportData", "onReceiveWearData", "(Ly7r;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)Z", "FREE_HEART_RATE_WINDOW", "I", "curFreeHeartRateWindow", "Lcom/xiaomi/fitness/sport_eco_manager/receiver/data/IDataProcesser;", "iDataProcesser", "Lcom/xiaomi/fitness/sport_eco_manager/receiver/data/IDataProcesser;", "LOOP", "wearSportData", "Ly7r;", "isPause", "Z", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/receiver/data/IDataProcesser;)V", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FreeTrainingDataProcesser implements ISportStateChangedListener, brc, Handler.Callback {

    @NotNull
    public static final String TAG = "FreeTrainingDataProcesser";
    private final int FREE_HEART_RATE_WINDOW;
    private final int LOOP;
    private int curFreeHeartRateWindow;

    @Nullable
    private Handler handler;

    @NotNull
    private IDataProcesser iDataProcesser;
    private boolean isPause;
    private int sportType;

    @Nullable
    private y7r wearSportData;

    public FreeTrainingDataProcesser(@NotNull IDataProcesser iDataProcesser) {
        Intrinsics.checkNotNullParameter(iDataProcesser, "iDataProcesser");
        this.FREE_HEART_RATE_WINDOW = 20;
        this.curFreeHeartRateWindow = 20;
        this.iDataProcesser = iDataProcesser;
        this.LOOP = 1;
    }

    private final void computeDataOfFreeTraining() {
        int i;
        EcoDeviceModel ecoDeviceModelCurDeviceModel = SportDeviceModel.INSTANCE.curDeviceModel();
        if (ecoDeviceModelCurDeviceModel == null || !ecoDeviceModelCurDeviceModel.getIsDeviceConnected() || (i = this.curFreeHeartRateWindow) <= 0) {
            SportCourse sportCourseB = g2o.s().B();
            if (sportCourseB != null) {
                float fCourseCal = SportUtilsKt.courseCal(sportCourseB, (int) g2o.s().E());
                this.iDataProcesser.setCal(fCourseCal);
                FitnessLogUtils.i("FreeTrainingDataProcesser", "cal : " + fCourseCal);
                this.iDataProcesser.sendPhoneSportData();
                return;
            }
            return;
        }
        y7r y7rVar = this.wearSportData;
        if (y7rVar == null || (y7rVar != null && y7rVar.c == 0)) {
            this.curFreeHeartRateWindow = i - 1;
        } else {
            this.iDataProcesser.calculateInfoWithSportData(false);
        }
        int i2 = this.curFreeHeartRateWindow;
        y7r y7rVar2 = this.wearSportData;
        FitnessLogUtils.i("FreeTrainingDataProcesser", "curFreeHeartRateWindow : " + i2 + " , hr : " + (y7rVar2 != null ? Integer.valueOf(y7rVar2.c) : null) + " ");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        int i2 = this.LOOP;
        if (i != i2) {
            return false;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(i2);
        }
        FitnessLogUtils.i("FreeTrainingDataProcesser", "isPause : " + this.isPause);
        if (this.isPause || this.sportType != 8) {
            return false;
        }
        computeDataOfFreeTraining();
        this.iDataProcesser.sendPhoneSportData();
        Handler handler2 = this.handler;
        if (handler2 == null) {
            return false;
        }
        handler2.sendEmptyMessageDelayed(this.LOOP, 1000L);
        return false;
    }

    @Override // defpackage.brc
    public void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult) {
        Intrinsics.checkNotNullParameter(sportSensorResult, "sportSensorResult");
    }

    @Override // defpackage.brc
    public void onReceiveWearData(@NotNull y7r sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        this.wearSportData = sportData;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(this.LOOP);
        }
        this.handler = null;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.isPause = true;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.isPause = false;
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendEmptyMessage(this.LOOP);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        this.sportType = sportType;
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.handler = handler;
        handler.sendEmptyMessage(this.LOOP);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }
}
