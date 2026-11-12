package com.xiaomi.fitness.sport_manager.recorder.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.RemoteException;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_manager.recorder.device.FreeSportRecorder;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import com.xiaomi.fitness.sport_manager_export.data.SportCourse;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import defpackage.f2o;
import defpackage.jdn;
import defpackage.jxc;
import defpackage.zdn;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\nR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport_manager/recorder/device/FreeSportRecorder;", "Lzdn;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sportReportData", "", "convertReportToBytes", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "sportRecordData", "", "convertRecordToBytes", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)[B", "convertRecordPauseDataToBytes", "()[B", "", "getType", "()Ljava/lang/String;", "getDataValidityForRecordHead", "sportData", "getDataValidityForReport", "", SportConstants.KEY_TIMESTAMP, "I", "", "isHasHr", "Z", "Landroid/content/Context;", "context", "did", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "isRecoverSport", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Z)V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FreeSportRecorder extends zdn {
    public static final int FREE_REPORT = 130;
    public static final int REPORT_VERSION = 12;

    @NotNull
    public static final String TAG = "FreeSportRecorder";
    private boolean isHasHr;
    private int timeStamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeSportRecorder(@NotNull Context context, @NotNull String did, @NotNull SportRequestData requestData, boolean z) {
        super(context, did, requestData, Boolean.valueOf(z));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertReportToBytes$lambda$2() throws RemoteException {
        jxc jxcVarJ = jdn.h().j();
        if (jxcVarJ != null) {
            jxcVarJ.onSync(true, true, 0);
        }
    }

    @Override // defpackage.zdn
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

    @Override // defpackage.zdn
    @NotNull
    public byte[] convertRecordToBytes(@Nullable SportData sportRecordData) {
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
        this.totalCount++;
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public void convertReportToBytes(@Nullable SportData sportReportData) {
        FitnessDataId.Builder builder = new FitnessDataId.Builder();
        Intrinsics.checkNotNull(sportReportData);
        FitnessDataId fitnessDataIdBuild = builder.timeStampInSec(sportReportData.startTime).timeZoneIn15Min(this.timeZone).sportType(8).fileType(1).version(12).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(130).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportReportData.startTime);
        byteBufferOrder.putInt(sportReportData.endTime);
        byteBufferOrder.putInt(sportReportData.totalTime);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            SportCourse sportCourseG = f2o.x().G();
            if (sportCourseG != null) {
                byteBufferOrder.putShort((short) (SportUtilsKt.courseCal(sportCourseG, sportReportData.totalTime) / 1000));
            }
        } else {
            byteBufferOrder.putShort(sportReportData.cal);
        }
        byteBufferOrder.put(sportReportData.aveHrRate);
        byteBufferOrder.put(sportReportData.maxHrRate);
        byteBufferOrder.put(sportReportData.minHrRate);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(sportReportData.hrLimit);
        byteBufferOrder.putInt(sportReportData.hrAnaerobic);
        byteBufferOrder.putInt(sportReportData.hrAerobic);
        byteBufferOrder.putInt(sportReportData.hrFat);
        byteBufferOrder.putInt(sportReportData.hrWarm);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            SportCourse sportCourseG2 = f2o.x().G();
            if (sportCourseG2 != null) {
                byteBufferOrder.putShort((short) (SportUtilsKt.courseCal(sportCourseG2, sportReportData.totalTime) / 1000));
            }
        } else {
            byteBufferOrder.putShort(sportReportData.cal);
        }
        byteBufferOrder.putInt(sportReportData.totalTime);
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) -1);
        SportCourse sportCourseG3 = f2o.x().G();
        byteBufferOrder.putLong(sportCourseG3 != null ? sportCourseG3.getCloudCourseId() : 0L);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putLong(sportReportData.planId);
        byteBufferOrder.putInt(0);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array(), this.sportRecordData);
        FitnessLogUtils.i("FreeSportRecorder", "free sport recorder report");
        this.mMainHandler.postDelayed(new Runnable() { // from class: yoa
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                FreeSportRecorder.convertReportToBytes$lambda$2();
            }
        }, 500L);
    }

    @Override // defpackage.zdn
    @NotNull
    public byte[] getDataValidityForRecordHead() {
        byte[] bArr = new byte[1];
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Boolean boolValueOf = wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null;
        FitnessLogUtils.i("FreeSportRecorder", "connect : " + boolValueOf + " , isHasHr:" + this.isHasHr);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null && wearableDeviceModel2.getIsDeviceConnected() && this.isHasHr) {
            bArr[0] = -32;
        } else {
            bArr[0] = 0;
        }
        this.isHasHr = false;
        return bArr;
    }

    @Override // defpackage.zdn
    @NotNull
    public byte[] getDataValidityForReport(@NotNull SportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        return new byte[]{-2, 0, 124, 24, 48, 0, 4};
    }

    @Override // defpackage.zdn
    @NotNull
    public String getType() {
        return "FreeSportRecorder , this: " + this;
    }
}
