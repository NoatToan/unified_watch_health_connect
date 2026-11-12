package com.xiaomi.fitness.sport_manager.receiver;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.receiver.data.IDataProcesser;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import defpackage.arc;
import defpackage.f2o;
import defpackage.x7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u000f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b7\u00108J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J+\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010*R\u0018\u00100\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/FreeTrainingDataProcesser;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "Larc;", "Landroid/os/Handler$Callback;", "", "computeDataOfFreeTraining", "()V", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIIII)V", "onSportRestarted", "onSportPaused", "", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;", "sportSensorResult", "onReceivePhoneSensorData", "(Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;)V", "Lx7r;", "sportData", "onReceiveWearData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "locationResult", "onReceivePhoneLocationData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)Z", "FREE_HEART_RATE_WINDOW", "I", "curFreeHeartRateWindow", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IDataProcesser;", "iDataProcesser", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IDataProcesser;", "LOOP", "wearSportData", "Lx7r;", "isPause", "Z", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/sport_manager/receiver/data/IDataProcesser;)V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FreeTrainingDataProcesser implements ISportStateChangedListener, arc, Handler.Callback {

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
    private x7r wearSportData;

    public FreeTrainingDataProcesser(@NotNull IDataProcesser iDataProcesser) {
        Intrinsics.checkNotNullParameter(iDataProcesser, "iDataProcesser");
        this.FREE_HEART_RATE_WINDOW = 20;
        this.curFreeHeartRateWindow = 20;
        this.iDataProcesser = iDataProcesser;
        this.LOOP = 1;
    }

    private final void computeDataOfFreeTraining() {
        int i;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = SportDeviceModel.INSTANCE.curDeviceModel();
        if (wearableDeviceModelCurDeviceModel == null || !wearableDeviceModelCurDeviceModel.getIsDeviceConnected() || (i = this.curFreeHeartRateWindow) <= 0) {
            SportCourse sportCourseG = f2o.x().G();
            if (sportCourseG != null) {
                float fCourseCal = SportUtilsKt.courseCal(sportCourseG, (int) f2o.x().J());
                this.iDataProcesser.setCal(fCourseCal);
                FitnessLogUtils.i("FreeTrainingDataProcesser", "cal : " + fCourseCal);
                this.iDataProcesser.sendPhoneSportData();
                return;
            }
            return;
        }
        x7r x7rVar = this.wearSportData;
        if (x7rVar == null || (x7rVar != null && x7rVar.c == 0)) {
            this.curFreeHeartRateWindow = i - 1;
        } else {
            this.iDataProcesser.calculateInfoWithSportData(false);
        }
        int i2 = this.curFreeHeartRateWindow;
        x7r x7rVar2 = this.wearSportData;
        FitnessLogUtils.i("FreeTrainingDataProcesser", "curFreeHeartRateWindow : " + i2 + " , hr : " + (x7rVar2 != null ? Integer.valueOf(x7rVar2.c) : null) + " ");
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
        FitnessLogUtils.i("FreeTrainingDataProcesser", "isPause : " + this.isPause + " , sportType:" + f2o.x().T());
        if (this.isPause || f2o.x().T() != 8) {
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

    @Override // defpackage.arc
    public void onReceivePhoneLocationData(@NotNull SportLocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
    }

    @Override // defpackage.arc
    public void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult) {
        Intrinsics.checkNotNullParameter(sportSensorResult, "sportSensorResult");
    }

    @Override // defpackage.arc
    public void onReceiveWearData(@NotNull x7r sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        this.wearSportData = sportData;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(this.LOOP);
        }
        this.handler = null;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.isPause = true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        this.isPause = false;
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendEmptyMessage(this.LOOP);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        this.sportType = sportType;
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.handler = handler;
        handler.sendEmptyMessage(this.LOOP);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }
}
