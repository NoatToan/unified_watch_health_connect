package defpackage;

import android.content.Context;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class aj2 extends aen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1083b;

    public aj2(Context context, String str, int i, int i2, int i3, boolean z) {
        super(context, str, i, i2, i3, z);
    }

    @Override // defpackage.aen
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putFloat(this.f1083b);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.f1082a;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("BikOutDoorRecorder", "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.f1082a + " , altitude:" + this.f1083b + ", recoverStartTime:" + this.recoverStartTime);
        this.f1082a = 0;
        this.dataCount = 0;
        this.f1083b = 0.0f;
        FitnessLogUtils.i("BikOutDoorRecorder", "sport recorder pause");
        return byteBufferOrder.array();
    }

    @Override // defpackage.aen
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(3).order(ByteOrder.LITTLE_ENDIAN);
        if (this.f1083b == 0.0f) {
            this.f1083b = sportData.altitude;
        }
        if (this.f1082a == 0) {
            int i = this.restartTimeStamp;
            this.f1082a = i;
            if (i == 0) {
                this.f1082a = sportData.startTime;
            }
        }
        this.dataCount++;
        byteBufferOrder.put((byte) (sportData.calAndStep >> 4));
        byteBufferOrder.put(sportData.hrRate);
        byteBufferOrder.put(sportData.distanceInfo);
        return byteBufferOrder.array();
    }

    @Override // defpackage.aen
    public void convertReportToBytes(SportData sportData) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(this.timeZone).sportType(6).fileType(1).version(1).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(81).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportData.startTime);
        byteBufferOrder.putInt(sportData.endTime);
        byteBufferOrder.putInt(sportData.totalTime);
        byteBufferOrder.putInt(sportData.distance);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putInt(sportData.fastestPace);
        byteBufferOrder.putInt(sportData.slowestPace);
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
        byteBufferOrder.put(sportData.maxO);
        byteBufferOrder.put(sportData.expend);
        byteBufferOrder.putShort(sportData.recovery);
        byteBufferOrder.putInt(sportData.hrLimit);
        byteBufferOrder.putInt(sportData.hrAnaerobic);
        byteBufferOrder.putInt(sportData.hrAerobic);
        byteBufferOrder.putInt(sportData.hrFat);
        byteBufferOrder.putInt(sportData.hrWarm);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array());
        FitnessLogUtils.d("BikOutDoorRecorder", "sport recorder report");
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForRecordHead() {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("BikOutDoorRecorder", "record , app launch type : " + g2o.s().n());
        byte[] bArr = new byte[2];
        if (!this.isRecoverSport ? g2o.s().n() == 2 : g2o.s().z().appLaunchType == 2) {
            bArr[0] = -52;
            bArr[1] = -64;
        } else {
            bArr[0] = -56;
            bArr[1] = -64;
        }
        return bArr;
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForReport() {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("BikOutDoorRecorder", "report , app launch type : " + g2o.s().n());
        byte[] bArr = new byte[4];
        SportData sportDataZ = g2o.s().z();
        if (sportDataZ == null || !this.isRecoverSport ? g2o.s().n() != 2 : sportDataZ.appLaunchType != 2) {
            bArr[0] = -1;
            bArr[1] = -25;
            bArr[2] = 15;
            bArr[3] = -128;
        } else {
            bArr[0] = -1;
            bArr[1] = 7;
            bArr[2] = 15;
            bArr[3] = -128;
        }
        return bArr;
    }
}
