package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class zi2 extends zdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41306b;

    public zi2(Context context, String str, SportRequestData sportRequestData, Boolean bool) {
        super(context, str, sportRequestData, bool);
    }

    @Override // defpackage.zdn
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(17).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putFloat(this.f41306b);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.f41305a;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        byteBufferOrder.put((byte) 127);
        byteBufferOrder.putInt(0);
        FitnessLogUtils.d("BikOutDoorRecorder", "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.f41305a + " , altitude:" + this.f41306b + ", recoverStartTime:" + this.recoverStartTime);
        this.f41305a = 0;
        this.dataCount = 0;
        this.f41306b = 0.0f;
        FitnessLogUtils.i("BikOutDoorRecorder", "sport recorder pause");
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(7).order(ByteOrder.LITTLE_ENDIAN);
        if (this.f41306b == 0.0f) {
            this.f41306b = sportData.altitude;
        }
        if (this.f41305a == 0) {
            int i = this.restartTimeStamp;
            this.f41305a = i;
            if (i == 0) {
                this.f41305a = sportData.startTime;
            }
        }
        this.dataCount++;
        this.totalCount++;
        byteBufferOrder.put((byte) (sportData.calAndStep >> 4));
        byteBufferOrder.put(sportData.hrRate);
        byteBufferOrder.put(sportData.distanceInfo);
        byteBufferOrder.put(sportData.addDis);
        byteBufferOrder.putShort((short) sportData.currentSpeed);
        byteBufferOrder.put((byte) sportData.avgFrequency);
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public void convertReportToBytes(SportData sportData) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(this.timeZone).sportType(23).fileType(1).version(5).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(138).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) 6);
        byteBufferOrder.putInt(sportData.startTime);
        byteBufferOrder.putInt(sportData.endTime);
        byteBufferOrder.putInt(sportData.totalTime);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(sportData.distance);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putInt(sportData.fastestPace);
        byteBufferOrder.putInt(sportData.slowestPace);
        byteBufferOrder.putFloat(sportData.avgSpeed);
        byteBufferOrder.putFloat(sportData.fastestSpeed);
        byteBufferOrder.put(sportData.aveHrRate);
        byteBufferOrder.put(sportData.maxHrRate);
        byteBufferOrder.put(sportData.minHrRate);
        byteBufferOrder.putFloat(sportData.rise);
        byteBufferOrder.putFloat(sportData.drop);
        byteBufferOrder.putFloat(sportData.aveHeight);
        byteBufferOrder.putFloat(sportData.maxHeight);
        byteBufferOrder.putFloat(sportData.minHeight);
        byteBufferOrder.putFloat(sportData.exercise);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(sportData.maxO);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(sportData.expend);
        byteBufferOrder.putShort(sportData.recovery);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(sportData.hrLimit);
        byteBufferOrder.putInt(sportData.hrAnaerobic);
        byteBufferOrder.putInt(sportData.hrAerobic);
        byteBufferOrder.putInt(sportData.hrFat);
        byteBufferOrder.putInt(sportData.hrWarm);
        byteBufferOrder.putInt(sportData.targetDurution);
        byteBufferOrder.putShort((short) sportData.targetCal);
        byteBufferOrder.putInt(sportData.targetDis);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) sportData.avgFrequency);
        byteBufferOrder.putShort((short) sportData.maxFrequency);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array(), sportData);
        FitnessLogUtils.i("BikOutDoorRecorder", "sport recorder report:" + sportData.toString());
    }

    public final byte f(boolean z) {
        SportTarget sportTarget;
        SportRequestData sportRequestDataO = f2o.x().O();
        int i = !z ? 192 : 0;
        if (sportRequestDataO != null && (sportTarget = sportRequestDataO.sportTargetArr) != null) {
            boolean z2 = sportTarget.getType() == 1;
            boolean z3 = sportRequestDataO.sportTargetArr.getType() == 2;
            boolean z4 = sportRequestDataO.sportTargetArr.getType() == 3;
            if (z2) {
                i += 32;
            }
            if (z3) {
                i += 16;
            }
            if (z4) {
                i += 8;
            }
        }
        return (byte) i;
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForRecordHead() {
        byte[] bArr = new byte[3];
        bArr[0] = (byte) (isNotSupportHr() ? ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE : 236);
        bArr[1] = -52;
        bArr[2] = (byte) (isWearBeanMode() ? 204 : 200);
        return bArr;
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForReport(SportData sportData) {
        boolean zIsNotSupportHr = isNotSupportHr();
        byte[] bArr = new byte[6];
        bArr[0] = -11;
        isWearBeanMode();
        bArr[1] = (byte) (zIsNotSupportHr ? 16 : 30);
        bArr[2] = 0;
        bArr[3] = (byte) (zIsNotSupportHr ? 0 : 7);
        bArr[4] = f(zIsNotSupportHr);
        bArr[5] = (byte) (isWearBeanMode() ? 6 : 0);
        return bArr;
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public int getRecordSportType(int i) {
        return 23;
    }

    @Override // defpackage.zdn
    public int getRecordVersion() {
        return 3;
    }

    @Override // defpackage.zdn
    public String getType() {
        return "BikOutDoorRecorder , this:" + this;
    }
}
