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
public class d1l extends zdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14965b;
    public volatile int c;
    public volatile boolean d;
    public SportData e;
    public boolean f;

    public d1l(Context context, String str, SportRequestData sportRequestData, Boolean bool) {
        super(context, str, sportRequestData, bool);
        this.f14965b = true;
        this.d = false;
    }

    @Override // defpackage.zdn
    public void abort() {
        super.abort();
        this.f = false;
    }

    @Override // defpackage.zdn
    public byte[] convertRecordPauseDataToBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(13).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(this.dataCount);
        int i = this.f14964a;
        if (i == 0) {
            i = this.recoverStartTime;
        }
        byteBufferOrder.putInt(i);
        byteBufferOrder.put((byte) 127);
        byteBufferOrder.putInt(0);
        FitnessLogUtils.i("RunInDoorRecorder", "pause the sport , dataCount : " + this.dataCount + " ,timeStamp :" + this.f14964a + ", recoverStartTime:" + this.recoverStartTime);
        this.dataCount = 0;
        this.f14964a = 0;
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        if (this.f14964a == 0) {
            int i = this.restartTimeStamp;
            this.f14964a = i;
            if (i == 0) {
                this.f14964a = sportData.startTime;
            }
        }
        this.dataCount++;
        this.totalCount++;
        byteBufferOrder.put(sportData.calAndStep);
        byteBufferOrder.put(sportData.hrRate);
        byteBufferOrder.put(sportData.addDis);
        byteBufferOrder.put(sportData.stride);
        byteBufferOrder.putInt(sportData.getOnOffGroundRecordValue());
        byteBufferOrder.put((byte) sportData.onOffRatio);
        byteBufferOrder.put((byte) sportData.avgFrequency);
        byteBufferOrder.putShort((short) sportData.currentPace);
        FitnessLogUtils.d("RunInDoorRecorder", "convertRecordToBytes:" + sportData.toString());
        this.f14965b = sportData.recordStepValid & this.f14965b;
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    public void convertReportToBytes(SportData sportData) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportData.startTime).timeZoneIn15Min(this.timeZone).sportType(3).fileType(1).version(13).build();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(229).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(sportData.startTime);
        byteBufferOrder.putInt(sportData.endTime);
        byteBufferOrder.putInt(sportData.totalTime);
        byteBufferOrder.putInt(sportData.distance);
        byteBufferOrder.putShort(sportData.cal);
        byteBufferOrder.putInt(sportData.avgPace);
        byteBufferOrder.putInt(sportData.fastestPace);
        byteBufferOrder.putInt(sportData.slowestPace);
        byteBufferOrder.putInt(sportData.totalStep);
        byteBufferOrder.putShort((short) sportData.avgStried);
        byteBufferOrder.putShort((short) sportData.avgFrequency);
        byteBufferOrder.putShort(isWearBeanMode() ? (short) sportData.maxFrequency : sportData.maxStepRate);
        byteBufferOrder.put(sportData.aveHrRate);
        byteBufferOrder.put(sportData.maxHrRate);
        byteBufferOrder.put(sportData.minHrRate);
        byteBufferOrder.putFloat(sportData.exercise);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(sportData.maxO);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put(sportData.expend);
        byteBufferOrder.putShort(sportData.recovery);
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
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 3);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(sportData.targetDurution);
        byteBufferOrder.putShort((short) sportData.targetCal);
        byteBufferOrder.putInt(sportData.targetDis);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putInt(this.c == sportData.distance ? 0 : this.c);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(0);
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
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putLong(sportData.planId);
        byteBufferOrder.putInt(0);
        syncSportDataFileToServer(fitnessDataIdBuild, this.mDid, byteBufferOrder.array(), sportData);
        FitnessLogUtils.i("RunInDoorRecorder", "sport recorder report , sportReportData:" + sportData.toString() + ",adjustmentDis:" + this.c);
    }

    public final byte f() {
        SportTarget sportTarget;
        SportRequestData sportRequestDataO = f2o.x().O();
        if (sportRequestDataO == null || (sportTarget = sportRequestDataO.sportTargetArr) == null) {
            return (byte) 32;
        }
        boolean z = sportTarget.getType() == 1;
        boolean z2 = sportRequestDataO.sportTargetArr.getType() == 2;
        boolean z3 = sportRequestDataO.sportTargetArr.getType() == 3;
        int i = z ? 36 : 32;
        if (z2) {
            i += 2;
        }
        if (z3) {
            i++;
        }
        return (byte) i;
    }

    public final byte g() {
        if (isWearBeanMode()) {
            return this.e.isHasDegree ? (byte) -1 : (byte) -65;
        }
        return (byte) 0;
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForRecordHead() {
        int i;
        byte[] bArr = new byte[4];
        if (isNotSupportHr()) {
            i = this.f14965b ? ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE : 200;
        } else {
            i = this.f14965b ? 236 : 204;
        }
        bArr[0] = (byte) i;
        bArr[1] = -52;
        bArr[2] = (byte) ((isWearBeanMode() && isBeanConnect()) ? 252 : 136);
        bArr[3] = (byte) ((isWearBeanMode() && isBeanConnect()) ? 204 : 136);
        return bArr;
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForReport(SportData sportData) {
        int i;
        boolean zIsNotSupportHr = isNotSupportHr();
        byte[] bArr = new byte[12];
        bArr[0] = -1;
        if (isWearBeanMode()) {
            i = zIsNotSupportHr ? 240 : 254;
        } else {
            i = zIsNotSupportHr ? 144 : 158;
        }
        bArr[1] = (byte) i;
        bArr[2] = (byte) (zIsNotSupportHr ? 0 : 7);
        bArr[3] = (byte) (zIsNotSupportHr ? 0 : 192);
        bArr[4] = 0;
        bArr[5] = f();
        bArr[6] = 16;
        bArr[7] = (byte) (isWearBeanMode() ? 3 : 0);
        bArr[8] = g();
        bArr[9] = (byte) (isWearBeanMode() ? 248 : 0);
        bArr[10] = 0;
        bArr[11] = -128;
        return bArr;
    }

    @Override // defpackage.zdn
    @SuppressLint({"WrongConstant"})
    public int getRecordSportType(int i) {
        return 3;
    }

    @Override // defpackage.zdn
    public int getRecordVersion() {
        return 6;
    }

    @Override // defpackage.zdn
    public String getType() {
        return "RunInDoorRecorder , this:" + this;
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onAdjustmentDis(int i) {
        FitnessLogUtils.i("RunInDoorRecorder", "adjustmentDis:" + i);
        this.c = i;
        this.d = true;
        syncSport(true, this.e);
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportStart() {
        super.onSportStart();
        this.f = true;
    }

    @Override // defpackage.zdn
    public void syncSport(boolean z, SportData sportData) {
        this.e = sportData;
        if (this.d || !(f2o.x().E() == null || this.f)) {
            super.syncSport(z, sportData);
            this.d = false;
        }
    }
}
