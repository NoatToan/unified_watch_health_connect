package com.xiaomi.fitness.sport_eco_manager.recorder.device;

import android.content.Context;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco_manager.recorder.device.FreeSportRecorder;
import com.xiaomi.fitness.sport_eco_manager.utils.SportUtilsKt;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import defpackage.aen;
import defpackage.fsc;
import defpackage.g2o;
import defpackage.kdn;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/recorder/device/FreeSportRecorder;", "Laen;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;", "sportReportData", "", "convertReportToBytes", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;)V", "sportRecordData", "", "convertRecordToBytes", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportData;)[B", "convertRecordPauseDataToBytes", "()[B", "getDataValidityForRecordHead", "getDataValidityForReport", "", SportConstants.KEY_TIMESTAMP, "I", "", "isHasHr", "Z", "Landroid/content/Context;", "context", "", "did", "startTime", "timeZone", DailyRecordKey.sportType, "isRecoverSport", "<init>", "(Landroid/content/Context;Ljava/lang/String;IIIZ)V", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FreeSportRecorder extends aen {
    public static final int FREE_REPORT = 72;
    public static final int REPORT_VERSION = 5;

    @NotNull
    public static final String TAG = "FreeSportRecorder";
    private boolean isHasHr;
    private int timeStamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeSportRecorder(@NotNull Context context, @NotNull String did, int i, int i2, int i3, boolean z) {
        super(context, did, i, i2, i3, z);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertReportToBytes$lambda$2() throws RemoteException {
        fsc fscVarH = kdn.f().h();
        if (fscVarH != null) {
            fscVarH.onSync(true, true, 0);
        }
    }

    @Override // defpackage.aen
    @NotNull
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.timeStamp;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        FitnessLogUtils.i("FreeSportRecorder", "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.timeStamp + " , recoverStartTime:" + this.recoverStartTime);
        this.timeStamp = 0;
        this.dataCount = 0;
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @Override // defpackage.aen
    @NotNull
    public byte[] convertRecordToBytes(@Nullable SportData sportRecordData) {
        FitnessLogUtils.i("FreeSportRecorder", "convertRecordToBytes");
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        if (sportRecordData != null) {
            if (!this.isHasHr) {
                this.isHasHr = sportRecordData.hrRate != 0;
            }
            byteBufferOrder.put(sportRecordData.hrRate);
            byteBufferOrder.put((byte) ((sportRecordData.calAndStep & 240) >> 4));
        }
        if (this.timeStamp == 0) {
            int i = this.restartTimeStamp;
            this.timeStamp = i;
            if (i == 0) {
                Intrinsics.checkNotNull(sportRecordData);
                this.timeStamp = sportRecordData.startTime;
            }
        }
        this.dataCount++;
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @Override // defpackage.aen
    public void convertReportToBytes(@Nullable SportData sportReportData) {
        FitnessLogUtils.i("FreeSportRecorder", "convertReportToBytes");
        FitnessDataId.Builder builder = new FitnessDataId.Builder();
        Intrinsics.checkNotNull(sportReportData);
        FitnessDataId fitnessDataIdBuild = builder.timeStampInSec(sportReportData.startTime).timeZoneIn15Min(this.timeZone).sportType(8).fileType(1).version(5).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(72).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportReportData.startTime);
        byteBufferOrder.putInt(sportReportData.endTime);
        byteBufferOrder.putInt(sportReportData.totalTime);
        FitnessLogUtils.i("FreeSportRecorder", "dataBuffer is " + byteBufferOrder);
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            SportCourse sportCourseB = g2o.s().B();
            if (sportCourseB != null) {
                byteBufferOrder.putShort((short) (SportUtilsKt.courseCal(sportCourseB, sportReportData.totalTime) / 1000));
            }
        } else {
            byteBufferOrder.putShort(sportReportData.cal);
        }
        byteBufferOrder.put(sportReportData.aveHrRate);
        byteBufferOrder.put(sportReportData.maxHrRate);
        byteBufferOrder.put(sportReportData.minHrRate);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(sportReportData.hrLimit);
        byteBufferOrder.putInt(sportReportData.hrAnaerobic);
        byteBufferOrder.putInt(sportReportData.hrAerobic);
        byteBufferOrder.putInt(sportReportData.hrFat);
        byteBufferOrder.putInt(sportReportData.hrWarm);
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel2 == null || !ecoDeviceModel2.getIsDeviceConnected()) {
            SportCourse sportCourseB2 = g2o.s().B();
            if (sportCourseB2 != null) {
                byteBufferOrder.putShort((short) (SportUtilsKt.courseCal(sportCourseB2, sportReportData.totalTime) / 1000));
            }
        } else {
            byteBufferOrder.putShort(sportReportData.cal);
        }
        byteBufferOrder.putInt(sportReportData.totalTime);
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) -1);
        SportCourse sportCourseB3 = g2o.s().B();
        byteBufferOrder.putLong(sportCourseB3 != null ? sportCourseB3.getCloudCourseId() : 0L);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array());
        FitnessLogUtils.i("BikOutDoorRecorder", "free sport recorder report");
        this.mMainHandler.postDelayed(new Runnable() { // from class: zoa
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                FreeSportRecorder.convertReportToBytes$lambda$2();
            }
        }, 500L);
    }

    @Override // defpackage.aen
    @NotNull
    public byte[] getDataValidityForRecordHead() {
        byte[] bArr = new byte[1];
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Boolean boolValueOf = ecoDeviceModel != null ? Boolean.valueOf(ecoDeviceModel.getIsDeviceConnected()) : null;
        FitnessLogUtils.i("FreeSportRecorder", "connect : " + boolValueOf + " , isHasHr:" + this.isHasHr);
        EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel2 != null && ecoDeviceModel2.getIsDeviceConnected() && this.isHasHr) {
            bArr[0] = -32;
        } else {
            bArr[0] = 0;
        }
        this.isHasHr = false;
        return bArr;
    }

    @Override // defpackage.aen
    @NotNull
    public byte[] getDataValidityForReport() {
        return new byte[]{-2, 63, -104};
    }
}
