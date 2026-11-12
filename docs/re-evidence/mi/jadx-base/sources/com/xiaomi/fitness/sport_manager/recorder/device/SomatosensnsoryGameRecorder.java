package com.xiaomi.fitness.sport_manager.recorder.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.RemoteException;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_manager.recorder.device.SomatosensnsoryGameRecorder;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/recorder/device/SomatosensnsoryGameRecorder;", "Lzdn;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportData;", "sportReportData", "", "convertReportToBytes", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)V", "", "getRecordVersion", "()I", DailyRecordKey.sportType, "getRecordSportType", "(I)I", "sportRecordData", "", "convertRecordToBytes", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportData;)[B", "convertRecordPauseDataToBytes", "()[B", "", "getType", "()Ljava/lang/String;", "getDataValidityForRecordHead", "sportData", "getDataValidityForReport", SportConstants.KEY_TIMESTAMP, "I", "Landroid/content/Context;", "context", "did", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "", "isRecoverSport", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Z)V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SomatosensnsoryGameRecorder extends zdn {
    public static final int REPORT_VERSION = 8;
    public static final int SOMATOSENSORY_GAME_REPORT = 99;

    @NotNull
    public static final String TAG = "SomatosensnsoryGameRecorder";
    private int timeStamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SomatosensnsoryGameRecorder(@NotNull Context context, @NotNull String did, @NotNull SportRequestData requestData, boolean z) {
        super(context, did, requestData, Boolean.valueOf(z));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convertReportToBytes$lambda$0() throws RemoteException {
        jxc jxcVarJ = jdn.h().j();
        if (jxcVarJ != null) {
            jxcVarJ.onSync(true, true, 0);
        }
    }

    @Override // defpackage.zdn
    @NotNull
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(9).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.timeStamp;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        byteBufferOrder.put((byte) 127);
        FitnessLogUtils.i(TAG, "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.timeStamp + " , recoverStartTime:" + this.recoverStartTime);
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
        FitnessDataId fitnessDataIdBuild = builder.timeStampInSec(sportReportData.startTime).timeZoneIn15Min(this.timeZone).sportType(8).fileType(1).version(8).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(99).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportReportData.startTime);
        byteBufferOrder.putInt(sportReportData.endTime);
        byteBufferOrder.putInt(sportReportData.totalTime);
        byteBufferOrder.putShort(sportReportData.cal);
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
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(sportReportData.totalTime);
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 810);
        byteBufferOrder.put((byte) -1);
        byteBufferOrder.putLong(sportReportData.courseId);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort(sportReportData.totalPunches);
        byteBufferOrder.putShort(sportReportData.perfect);
        byteBufferOrder.putShort(sportReportData.good);
        byteBufferOrder.putShort(sportReportData.miss);
        byteBufferOrder.putFloat(sportReportData.maxPushStrength);
        byteBufferOrder.putShort(sportReportData.maxHit);
        byteBufferOrder.put(sportReportData.hitRate);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array(), sportReportData);
        FitnessLogUtils.i(TAG, "free sport recorder report , sportReportData:" + sportReportData);
        this.mMainHandler.postDelayed(new Runnable() { // from class: l4n
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                SomatosensnsoryGameRecorder.convertReportToBytes$lambda$0();
            }
        }, 500L);
    }

    @Override // defpackage.zdn
    @NotNull
    public byte[] getDataValidityForRecordHead() {
        byte[] bArr = new byte[2];
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        FitnessLogUtils.i(TAG, "connect : " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null));
        bArr[0] = -52;
        bArr[1] = 0;
        return bArr;
    }

    @Override // defpackage.zdn
    @NotNull
    public byte[] getDataValidityForReport(@NotNull SportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        return new byte[]{-2, 0, 125, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, 127, -128};
    }

    @Override // defpackage.zdn
    public int getRecordSportType(int sportType) {
        return 8;
    }

    @Override // defpackage.zdn
    public int getRecordVersion() {
        return 3;
    }

    @Override // defpackage.zdn
    @NotNull
    public String getType() {
        return "SomatosensnsoryGameRecorder , this:" + this;
    }
}
