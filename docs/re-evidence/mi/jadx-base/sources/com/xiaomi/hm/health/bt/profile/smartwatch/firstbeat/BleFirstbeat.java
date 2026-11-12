package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public class BleFirstbeat implements Serializable {
    private static final long serialVersionUID = 1;
    public byte TLTrend;
    public short currentDayTL;
    public short dayId;
    public byte fitness;
    public short fitnessLevelIncrease;
    public short sportVO2Max;
    public int updateTime;
    public byte vo2MaxTrend;
    public short walkVO2Max;
    public byte weeklyTLStatus;
    public short weeklyTLSum;
    public short weeklyTLSumOptimalMax;
    public short weeklyTLSumOptimalMin;
    public short weeklyTLSumOverreaching;
    public byte zone;

    public static class Config implements Serializable {
        private static final long serialVersionUID = 1;
        public short currentRunVO2Max;
        public short currentWalkingVO2Max;
        public short lastRunVO2Max;
        public short lastWalkingVO2Max;
        public int recoveryTime;
        public int sportFinishTime;

        public String toString() {
            return "<CurrentRunVO2Max: " + ((int) this.currentRunVO2Max) + ", CurrentWalkingVO2Max: " + ((int) this.currentWalkingVO2Max) + ", LastRunVO2Max: " + ((int) this.lastRunVO2Max) + ", LastWalkingVO2Max: " + ((int) this.lastWalkingVO2Max) + ", RecoveryTime: " + this.recoveryTime + ", SportFinishTime: " + this.sportFinishTime + Typography.greater;
        }
    }

    public static BleFirstbeat parse(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        BleFirstbeat bleFirstbeat = new BleFirstbeat();
        bleFirstbeat.dayId = byteBufferWrap.getShort();
        bleFirstbeat.currentDayTL = byteBufferWrap.getShort();
        bleFirstbeat.updateTime = byteBufferWrap.getInt();
        bleFirstbeat.weeklyTLSum = byteBufferWrap.getShort();
        bleFirstbeat.weeklyTLSumOptimalMax = byteBufferWrap.getShort();
        bleFirstbeat.weeklyTLSumOptimalMin = byteBufferWrap.getShort();
        bleFirstbeat.weeklyTLSumOverreaching = byteBufferWrap.getShort();
        bleFirstbeat.TLTrend = byteBufferWrap.get();
        bleFirstbeat.weeklyTLStatus = byteBufferWrap.get();
        bleFirstbeat.fitness = byteBufferWrap.get();
        byteBufferWrap.get();
        bleFirstbeat.fitnessLevelIncrease = byteBufferWrap.getShort();
        bleFirstbeat.sportVO2Max = byteBufferWrap.getShort();
        bleFirstbeat.walkVO2Max = byteBufferWrap.getShort();
        bleFirstbeat.vo2MaxTrend = byteBufferWrap.get();
        bleFirstbeat.zone = byteBufferWrap.get();
        return bleFirstbeat;
    }

    public static Config parseConfig(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        Config config = new Config();
        config.currentRunVO2Max = byteBufferWrap.getShort();
        config.currentWalkingVO2Max = byteBufferWrap.getShort();
        config.lastRunVO2Max = byteBufferWrap.getShort();
        config.lastWalkingVO2Max = byteBufferWrap.getShort();
        config.recoveryTime = byteBufferWrap.getInt();
        config.sportFinishTime = byteBufferWrap.getInt();
        return config;
    }

    public String toString() {
        return "<DayId: " + ((int) this.dayId) + ", CurrentDayTL: " + ((int) this.currentDayTL) + ", UpdateTime: " + this.updateTime + ", WeeklyTLSum: " + ((int) this.weeklyTLSum) + ", WeeklyTLSumOptimalMax: " + ((int) this.weeklyTLSumOptimalMax) + ", WeeklyTLSumOptimalMin: " + ((int) this.weeklyTLSumOptimalMin) + ", WeeklyTLSumOverreaching: " + ((int) this.weeklyTLSumOverreaching) + ", TLTrend: " + ((int) this.TLTrend) + ", WeeklyTLStatus: " + ((int) this.weeklyTLStatus) + ", Fitness: " + ((int) this.fitness) + ", FitnessLevelIncrease: " + ((int) this.fitnessLevelIncrease) + ", SportVO2Max: " + ((int) this.sportVO2Max) + ", WalkVO2Max: " + ((int) this.walkVO2Max) + ", Vo2MaxTrend: " + ((int) this.vo2MaxTrend) + ", Zone: " + ((int) this.zone) + Typography.greater;
    }
}
