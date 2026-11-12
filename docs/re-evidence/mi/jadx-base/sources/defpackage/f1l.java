package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class f1l extends zdn {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f17294k = "RunOutDoorRecorder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17296b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    public f1l(Context context, String str, SportRequestData sportRequestData, Boolean bool) {
        super(context, str, sportRequestData, bool);
        this.d = true;
        this.e = false;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.j = false;
        this.c = sportRequestData.sportType;
    }

    private byte i() {
        return (byte) (isNotSupportHr() ? 0 : 128);
    }

    @Override // defpackage.zdn
    public byte[] convertRecordPauseDataToBytes() {
        System.currentTimeMillis();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(27).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putFloat(this.f17295a);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.f17296b;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        int i2 = this.i;
        if (i2 != -1) {
            byteBufferOrder.put((byte) i2);
        } else {
            byteBufferOrder.put((byte) 127);
        }
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        byte[] bArrArray = byteBufferOrder.array();
        FitnessLogUtils.i(f17294k, "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.f17296b + " , altitude:" + this.f17295a + " , recoverStartTime:" + this.recoverStartTime);
        this.f17296b = 0;
        this.dataCount = 0;
        this.f17295a = 0.0f;
        this.g = 0;
        return bArrArray;
    }

    @Override // defpackage.zdn
    public byte[] convertRecordSegmentDataToBytes(int i, int i2) {
        this.canSetRecord.set(false);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i3 = iCurrentTimeMillis - this.h;
        short s = (short) (i3 / (this.f / 10000.0f));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(27).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putFloat(this.f17295a);
        byteBufferOrder.putInt(this.dataCount);
        if (this.j) {
            byteBufferOrder.putInt(this.restartTimeStamp);
        } else {
            byteBufferOrder.putInt(this.h);
        }
        byteBufferOrder.put((byte) (i | 128));
        byteBufferOrder.putInt(this.f / 10);
        byteBufferOrder.putInt(i3);
        byteBufferOrder.putInt(this.g);
        byteBufferOrder.putShort((short) 0);
        byte[] bArrArray = byteBufferOrder.array();
        FitnessLogUtils.i(f17294k, "training_plan_parse - convertRecordSegmentDataToBytes the sport , segmentType:" + i + ",dataCount : " + this.dataCount + " ,timeStamp :" + this.h + ", hasRestart:" + this.j + ",restartTimeStamp:" + this.restartTimeStamp + " , altitude:" + this.f17295a + " , recoverStartTime:" + this.recoverStartTime + ", segmentDuration:" + i3 + ", segmentTotalDistance:" + this.f + ", segmentTotalStep:" + this.g + ",avePace:" + ((int) s) + ",result-length:" + bArrArray.length);
        this.dataCount = 0;
        this.f17295a = 0.0f;
        this.f = 0;
        this.g = 0;
        this.j = false;
        this.h = iCurrentTimeMillis;
        this.i = i2;
        return bArrArray;
    }

    @Override // defpackage.zdn
    public byte[] convertRecordToBytes(SportData sportData) {
        isWearBeanMode();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(l()).order(ByteOrder.LITTLE_ENDIAN);
        if (this.f17295a == 0.0f) {
            this.f17295a = sportData.altitude;
        }
        if (this.f17296b == 0) {
            int i = this.restartTimeStamp;
            this.f17296b = i;
            if (i == 0) {
                this.f17296b = sportData.startTime;
            }
        }
        this.dataCount++;
        this.totalCount++;
        this.f += sportData.addDis;
        int i2 = this.g;
        byte b2 = sportData.calAndStep;
        this.g = i2 + (b2 & 15);
        byteBufferOrder.put(b2);
        byteBufferOrder.put(sportData.hrRate);
        byteBufferOrder.put(sportData.distanceInfo);
        byteBufferOrder.put(sportData.addDis);
        byteBufferOrder.put(sportData.stride);
        byteBufferOrder.putInt(sportData.getOnOffGroundRecordValue());
        byteBufferOrder.put((byte) sportData.onOffRatio);
        byteBufferOrder.put((byte) sportData.avgFrequency);
        byteBufferOrder.putShort((short) sportData.currentPace);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) sportData.verticalStrideRatio);
        byteBufferOrder.putShort((short) sportData.verticalAmplitude);
        this.d = sportData.recordStepValid & this.d;
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public void convertReportToBytes(SportData sportData) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(this.timeZone).sportType(22).fileType(1).version(9).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(262).order(ByteOrder.LITTLE_ENDIAN);
        if (this.c == 1) {
            byteBufferOrder.putShort((short) 1);
        }
        if (this.c == 2) {
            byteBufferOrder.putShort((short) 2);
        }
        byteBufferOrder.putInt(sportData.startTime);
        byteBufferOrder.putInt(sportData.endTime);
        byteBufferOrder.putInt(sportData.totalTime);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(sportData.distance);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putInt(sportData.avgPace);
        byteBufferOrder.putInt(sportData.fastestPace);
        byteBufferOrder.putInt(sportData.slowestPace);
        byteBufferOrder.putFloat(sportData.avgSpeed);
        byteBufferOrder.putFloat(sportData.fastestSpeed);
        byteBufferOrder.putInt(sportData.totalStep);
        byteBufferOrder.putShort((short) sportData.avgStried);
        byteBufferOrder.putShort((short) sportData.avgFrequency);
        byteBufferOrder.putShort((short) sportData.maxFrequency);
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
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putFloat(0.0f);
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
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(sportData.targetDurution);
        byteBufferOrder.putShort((short) sportData.targetCal);
        byteBufferOrder.putInt(sportData.targetDis);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) sportData.sportCourse);
        if (sportData.sportCourse == 255) {
            byteBufferOrder.putLong(sportData.courseId);
        }
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putFloat(0.0f);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(sportData.fullFootDurBySecond);
        byteBufferOrder.putInt(sportData.foreFootDurBySecond);
        byteBufferOrder.putInt(sportData.hindFootDurBySecond);
        byteBufferOrder.put(sportData.degree);
        byteBufferOrder.put((byte) sportData.mainRunStyle);
        byteBufferOrder.put((byte) sportData.forefootRatio);
        byteBufferOrder.put((byte) sportData.heelRatio);
        byteBufferOrder.put((byte) sportData.avgImpact);
        byteBufferOrder.put((byte) sportData.maxImpact);
        byteBufferOrder.putShort((short) sportData.avgOnGround);
        byteBufferOrder.putShort((short) sportData.minOnGround);
        byteBufferOrder.putShort((short) sportData.avgOffGround);
        byteBufferOrder.putShort((short) sportData.maxOffGround);
        byteBufferOrder.put((byte) sportData.avgOnOffRatio);
        byteBufferOrder.put((byte) sportData.minOnOffRatio);
        byteBufferOrder.putShort((short) sportData.avgVerticalStrideRatio);
        byteBufferOrder.putShort((short) sportData.minVerticalStrideRatio);
        byteBufferOrder.putShort((short) sportData.maxVerticalStrideRatio);
        byteBufferOrder.putShort((short) sportData.avgVerticalAmplitude);
        byteBufferOrder.putShort((short) sportData.minVerticalAmplitude);
        byteBufferOrder.putShort((short) sportData.maxVerticalAmplitude);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putLong(sportData.planId);
        byteBufferOrder.putInt(0);
        byte[] bArrArray = byteBufferOrder.array();
        this.e = sportData.isHasDegree;
        FitnessLogUtils.d(f17294k, "isNotSupportHr:" + isNotSupportHr());
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, bArrArray, sportData);
        FitnessLogUtils.i(f17294k, "sport recorder report : " + sportData.toString());
    }

    public final byte f() {
        if (SportStateUtilsKt.isSupportWristPosture(this.c) && isWearBeanMode()) {
            return (byte) -1;
        }
        if (isWearBeanMode()) {
            return (byte) -32;
        }
        return SportStateUtilsKt.isSupportWristPosture(this.c) ? (byte) 31 : (byte) 0;
    }

    public final byte g() {
        return SportStateUtilsKt.isSupportWristPosture(this.c) ? (byte) -32 : (byte) 0;
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForRecordHead() {
        FitnessLogUtils.i(f17294k, "record , app launch type : " + f2o.x().t());
        return new byte[]{k(0), k(1), k(2), k(3), k(4), k(5), k(6)};
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForReport(SportData sportData) {
        Logger.d(f17294k, "train-info:" + sportData.sportCourse + "-" + sportData.courseId + "-" + sportData.planId);
        boolean zIsNotSupportHr = isNotSupportHr();
        byte[] bArr = new byte[13];
        bArr[0] = -11;
        int i = 255;
        bArr[1] = (byte) (isWearBeanMode() ? 255 : 108);
        bArr[2] = (byte) (zIsNotSupportHr ? 131 : 243);
        bArr[3] = -128;
        bArr[4] = h();
        bArr[5] = i();
        bArr[6] = j();
        if (sportData.sportCourse == 255) {
            bArr[7] = 64;
        } else {
            bArr[7] = 0;
        }
        bArr[8] = (byte) (isWearBeanMode() ? 15 : 0);
        if (!isWearBeanMode()) {
            i = SportStateUtilsKt.isSupportWristPosture(this.c) ? 6 : 0;
        }
        bArr[9] = (byte) i;
        bArr[10] = f();
        bArr[11] = g();
        if (sportData.planId > 0) {
            bArr[12] = 64;
        } else {
            bArr[12] = 0;
        }
        return bArr;
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public int getRecordSportType(int i) {
        return 22;
    }

    @Override // defpackage.zdn
    public int getRecordVersion() {
        return 8;
    }

    @Override // defpackage.zdn
    public String getType() {
        return "RunOutDoorRecorder , this:" + this;
    }

    public final byte h() {
        return (byte) (isNotSupportHr() ? 0 : 15);
    }

    public final byte j() {
        SportTarget sportTarget;
        SportRequestData sportRequestDataO = f2o.x().O();
        if (sportRequestDataO == null || (sportTarget = sportRequestDataO.sportTargetArr) == null) {
            return (byte) 0;
        }
        boolean z = sportTarget.getType() == 1;
        boolean z2 = sportRequestDataO.sportTargetArr.getType() == 2;
        boolean z3 = sportRequestDataO.sportTargetArr.getType() == 3;
        int i = z ? 16 : 0;
        if (z2) {
            i |= 8;
        }
        if (z3) {
            i |= 4;
        }
        return (byte) i;
    }

    public final byte k(int i) {
        switch (i) {
            case 0:
                if (!isNotSupportHr()) {
                    return this.d ? (byte) -20 : (byte) -52;
                }
                if (this.d) {
                    return (byte) -24;
                }
                return (byte) -56;
            case 1:
                return (byte) -52;
            case 2:
                if (isWearBeanMode()) {
                    return this.c == 2 ? (byte) -50 : (byte) -49;
                }
                if (SportStateUtilsKt.isSupportWristPosture(this.c)) {
                    return (byte) -54;
                }
                return (byte) -56;
            case 3:
                if (!isWearBeanMode()) {
                    SportStateUtilsKt.isSupportWristPosture(this.c);
                } else if (this.c != 2) {
                    return (byte) -52;
                }
                return (byte) -116;
            case 4:
                if (!isWearBeanMode() && !SportStateUtilsKt.isSupportWristPosture(this.c)) {
                    return (byte) -120;
                }
                return (byte) -56;
            case 5:
                if (!SportStateUtilsKt.isSupportWristPosture(this.c)) {
                    return (byte) -120;
                }
                return (byte) -116;
            case 6:
                return SportStateUtilsKt.isSupportWristPosture(this.c) ? (byte) -64 : (byte) -128;
            default:
                Logger.i(f17294k, "get getDataValidForRecord with error position:" + i);
                return (byte) 0;
        }
    }

    public final int l() {
        return 21;
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportPaused(int i) {
        super.onSportPaused(i);
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportRestart(int i) {
        super.onSportRestart(i);
        this.j = true;
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportStart() {
        super.onSportStart();
        this.h = this.startTimeStame;
    }

    @Override // defpackage.zdn
    public void updateFirstSegmentInfo(int i) {
        this.i = i;
    }
}
