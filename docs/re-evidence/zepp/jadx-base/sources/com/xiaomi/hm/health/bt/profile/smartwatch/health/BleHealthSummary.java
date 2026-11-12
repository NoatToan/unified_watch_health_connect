package com.xiaomi.hm.health.bt.profile.smartwatch.health;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.TimeUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Calendar;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleHealthSummary {
    public short activeMinutes;
    public short calorieGoal;
    public byte count;
    public short dayId;
    public short floorCount;
    public PerHour[] perHours;
    public short sitMinutes;
    public short stepGoal;
    public Calendar timestamp;

    public static class PerHour {
        public short calorie;
        public short distance;
        public byte hourIndex;
        public short step;

        public String toString() {
            return "<Step: " + ((int) this.step) + ", Calorie: " + ((int) this.calorie) + ", Distance: " + ((int) this.distance) + ", HourIndex: " + ((int) this.hourIndex) + Typography.greater;
        }
    }

    public static BleHealthSummary parse(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        BleHealthSummary bleHealthSummary = new BleHealthSummary();
        byteBufferWrap.get();
        bleHealthSummary.count = byteBufferWrap.get();
        bleHealthSummary.stepGoal = byteBufferWrap.getShort();
        bleHealthSummary.calorieGoal = byteBufferWrap.getShort();
        bleHealthSummary.activeMinutes = byteBufferWrap.getShort();
        bleHealthSummary.sitMinutes = byteBufferWrap.getShort();
        bleHealthSummary.floorCount = byteBufferWrap.getShort();
        bleHealthSummary.dayId = byteBufferWrap.getShort();
        int i = bleHealthSummary.count;
        if (i > 0) {
            bleHealthSummary.perHours = new PerHour[i];
            for (int i2 = 0; i2 < bleHealthSummary.count; i2++) {
                PerHour perHour = new PerHour();
                perHour.step = byteBufferWrap.getShort();
                perHour.calorie = byteBufferWrap.getShort();
                perHour.distance = byteBufferWrap.getShort();
                perHour.hourIndex = byteBufferWrap.get();
                byteBufferWrap.get();
                bleHealthSummary.perHours[i2] = perHour;
            }
        }
        return bleHealthSummary;
    }

    public String toString() {
        return "<Count: " + ((int) this.count) + ", Goal: " + ((int) this.stepGoal) + ", CalorieGoal: " + ((int) this.calorieGoal) + ", ActiveMinutes: " + ((int) this.activeMinutes) + ", SitMinutes: " + ((int) this.sitMinutes) + ", FloorCount: " + ((int) this.floorCount) + ", DayId: " + ((int) this.dayId) + ", PerHours: " + ArraysUtil.toString(this.perHours) + ", Timestamp: " + this.timestamp + ", " + TimeUtil.formatDateTime(this.timestamp) + Typography.greater;
    }
}
