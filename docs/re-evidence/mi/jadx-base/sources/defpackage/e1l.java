package defpackage;

import android.content.Context;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class e1l extends aen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16167b;

    public e1l(Context context, String str, int i, int i2, int i3, boolean z) {
        super(context, str, i, i2, i3, z);
        this.f16167b = true;
    }

    @Override // defpackage.aen
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.f16166a;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        FitnessLogUtils.i("RunInDoorRecorder", "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.f16166a + ", recoverStartTime:" + this.recoverStartTime);
        this.dataCount = 0;
        this.f16166a = 0;
        return byteBufferOrder.array();
    }

    @Override // defpackage.aen
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(3).order(ByteOrder.LITTLE_ENDIAN);
        if (this.f16166a == 0) {
            int i = this.restartTimeStamp;
            this.f16166a = i;
            if (i == 0) {
                this.f16166a = sportData.startTime;
            }
        }
        this.dataCount++;
        byteBufferOrder.put(sportData.calAndStep);
        byteBufferOrder.put(sportData.hrRate);
        byteBufferOrder.put(sportData.addDis);
        this.f16167b = sportData.recordStepValid & this.f16167b;
        return byteBufferOrder.array();
    }

    @Override // defpackage.aen
    public void convertReportToBytes(SportData sportData) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(this.timeZone).sportType(3).fileType(1).version(1).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(63).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportData.startTime);
        byteBufferOrder.putInt(sportData.endTime);
        byteBufferOrder.putInt(sportData.totalTime);
        byteBufferOrder.putInt(sportData.distance);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putInt(sportData.fastestPace);
        byteBufferOrder.putInt(sportData.slowestPace);
        byteBufferOrder.putInt(sportData.totalStep);
        byteBufferOrder.putShort(sportData.maxStepRate);
        byteBufferOrder.put(sportData.aveHrRate);
        byteBufferOrder.put(sportData.maxHrRate);
        byteBufferOrder.put(sportData.minHrRate);
        byteBufferOrder.putFloat(sportData.exercise);
        byteBufferOrder.put(sportData.maxO);
        byteBufferOrder.put(sportData.expend);
        byteBufferOrder.putShort(sportData.recovery);
        byteBufferOrder.putInt(sportData.hrLimit);
        byteBufferOrder.putInt(sportData.hrAnaerobic);
        byteBufferOrder.putInt(sportData.hrAerobic);
        byteBufferOrder.putInt(sportData.hrFat);
        byteBufferOrder.putInt(sportData.hrWarm);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array());
        FitnessLogUtils.i("RunInDoorRecorder", "sport recorder report , sportReportData:" + sportData.toString());
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForRecordHead() {
        byte[] bArr = new byte[2];
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("RunInDoorRecorder", "record , app launch type : " + g2o.s().n());
        SportData sportDataZ = g2o.s().z();
        if (sportDataZ == null || !this.isRecoverSport ? g2o.s().n() != 2 : sportDataZ.appLaunchType != 2) {
            bArr[0] = (byte) (this.f16167b ? 236 : 204);
            bArr[1] = -56;
        } else {
            bArr[0] = (byte) (this.f16167b ? ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE : 200);
            bArr[1] = -56;
        }
        return bArr;
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForReport() {
        byte[] bArr = new byte[3];
        FitnessLogUtils.i("RunInDoorRecorder", "report , app launch type : " + g2o.s().n());
        if (!this.isRecoverSport ? g2o.s().n() == 2 : g2o.s().z().appLaunchType == 2) {
            bArr[0] = -1;
            bArr[1] = -16;
            bArr[2] = -1;
        } else {
            bArr[0] = -1;
            bArr[1] = -128;
            bArr[2] = -1;
        }
        return bArr;
    }
}
