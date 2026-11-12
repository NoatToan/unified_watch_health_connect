package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleSportDetailHR {
    public List<Item> items = new ArrayList();
    public List<PerKM> perKMs = new ArrayList();
    public List<PerLap> perLaps = new ArrayList();
    public List<PauseInfo> pauseInfos = new ArrayList();
    public List<MarathonInfo> marathonInfos = new ArrayList();

    public static class DataPoint {
        public short cadence;
        public int distance;
        public byte[] heartRate = new byte[2];
        public int offsetTime;
        public short pace;
        public int stepLength;
        public int steps;
    }

    public static class Item {
        public short altitude;
        public int offsetToStart;
        public List<Point> points = new ArrayList();

        public String toString() {
            return "<OffsetToStart: " + this.offsetToStart + ", Altitude: " + ((int) this.altitude) + ", Points: \n" + ArraysUtil.toString(this.points, "\n") + Typography.greater;
        }
    }

    public static class MarathonInfo {
        public short distance;
        public int duration;
        public byte halfOrFull;

        public String toString() {
            return "<HalfOrFull: " + ((int) this.halfOrFull) + ", Distance: " + ((int) this.distance) + ", Duration: " + this.duration + Typography.greater;
        }
    }

    public static class PauseInfo {
        public int offsetToStart;
        public int stopTime;
        public byte type;

        public String toString() {
            return "<OffsetToStart: " + this.offsetToStart + ", StopTime: " + this.stopTime + ", Type: " + ((int) this.type) + Typography.greater;
        }
    }

    public static class PerKM {
        public byte TE;
        public int distance;
        public int latitude;
        public int longitude;
        public int offsetToStart;
        public short speed;
        public byte state;
        public byte unit;

        public String toString() {
            return "<Distance: " + this.distance + ", OffsetToStart: " + this.offsetToStart + ", Longitude: " + this.longitude + ", Latitude: " + this.latitude + ", Speed: " + ((int) this.speed) + ", TE: " + ((int) this.TE) + ", State: " + ((int) this.state) + ", Unit: " + ((int) this.unit) + Typography.greater;
        }
    }

    public static class PerLap {
        public short SWOLF;
        public byte avgHR;
        public short calorie;
        public int climbDistance;
        public short climbDown;
        public short climbUp;
        public int costTime;
        public int distance;
        public short lapNum;
        public byte lapType;
        public int latitude;
        public int longitude;
        public short maxPace;
        public int offsetToStart;
        public short stepCadence;
        public byte subType;

        public String toString() {
            return "<OffsetToStart: " + this.offsetToStart + ", Distance: " + this.distance + ", SubType: " + ((int) this.subType) + ", Longitude: " + this.longitude + ", Latitude: " + this.latitude + ", LapNum: " + ((int) this.lapNum) + ", LapType: " + ((int) this.lapType) + ", AvgHR: " + ((int) this.avgHR) + ", Calorie: " + ((int) this.calorie) + ", StepCadence: " + ((int) this.stepCadence) + ", MaxPace: " + ((int) this.maxPace) + ", SWOLF: " + ((int) this.SWOLF) + ", ClimbUp: " + ((int) this.climbUp) + ", ClimbDown: " + ((int) this.climbDown) + ", ClimbDistance: " + this.climbDistance + ", CostTime: " + this.costTime + Typography.greater;
        }
    }

    public static class Point {
        public short cadence;
        public byte distance;
        public byte[] heartRate = new byte[2];
        public byte offsetAltitude;
        public byte offsetTime;
        public short pace;
        public byte stepLength;
        public byte steps;

        public String toString() {
            return "<OffsetTime: " + ((int) this.offsetTime) + ", OffsetAltitude: " + ((int) this.offsetAltitude) + ", Cadence: " + ((int) this.cadence) + ", Pace: " + ((int) this.pace) + ", HeartRate: " + Arrays.toString(this.heartRate) + ", StepLength: " + ((int) this.stepLength) + ", Steps: " + ((int) this.steps) + ", Distance: " + ((int) this.distance) + Typography.greater;
        }
    }

    private int a(ByteBuffer data) {
        byte[] bArr = {0, data.get(), data.get(), data.get()};
        data.get();
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    private void b(ByteBuffer data) {
        byte b = data.get();
        byte b2 = data.get();
        int i = b & 255;
        int i2 = (i << 8) | (b2 & 255);
        if (i2 == 61610) {
            Item item = new Item();
            item.offsetToStart = a(data);
            short s = data.getShort();
            item.altitude = data.getShort();
            Point point = new Point();
            point.offsetTime = (byte) 0;
            point.offsetAltitude = (byte) 0;
            point.cadence = s;
            item.points.add(point);
            this.items.add(item);
            return;
        }
        if (i2 == 61866) {
            if (this.items.size() > 0) {
                List<Item> list = this.items;
                Item item2 = list.get(list.size() - 1);
                short s2 = data.getShort();
                byte b3 = data.get();
                byte b4 = data.get();
                byte b5 = data.get();
                byte b6 = data.get();
                data.get();
                byte b7 = data.get();
                if (item2.points.size() == 1) {
                    Point point2 = item2.points.get(0);
                    point2.pace = s2;
                    byte[] bArr = point2.heartRate;
                    bArr[1] = b3;
                    bArr[0] = b4;
                    point2.stepLength = b5;
                    point2.steps = b6;
                    point2.distance = b7;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 61690) {
            PerKM perKM = new PerKM();
            perKM.distance = data.getInt();
            perKM.offsetToStart = a(data);
            this.perKMs.add(perKM);
            return;
        }
        if (i2 == 61946) {
            if (this.perKMs.size() > 0) {
                List<PerKM> list2 = this.perKMs;
                PerKM perKM2 = list2.get(list2.size() - 1);
                perKM2.longitude = data.getInt();
                perKM2.latitude = data.getInt();
                return;
            }
            return;
        }
        if (i2 == 62202) {
            if (this.perKMs.size() > 0) {
                List<PerKM> list3 = this.perKMs;
                PerKM perKM3 = list3.get(list3.size() - 1);
                perKM3.speed = data.getShort();
                perKM3.TE = data.get();
                perKM3.state = data.get();
                perKM3.unit = data.get();
                return;
            }
            return;
        }
        if (i2 == 41205) {
            PerLap perLap = new PerLap();
            perLap.offsetToStart = a(data);
            perLap.distance = data.getInt();
            perLap.subType = data.get();
            this.perLaps.add(perLap);
        }
        if (i2 == 41461 && this.perLaps.size() > 0) {
            List<PerLap> list4 = this.perLaps;
            PerLap perLap2 = list4.get(list4.size() - 1);
            perLap2.longitude = data.getInt();
            perLap2.latitude = data.getInt();
        }
        if (i2 == 41717 && this.perLaps.size() > 0) {
            List<PerLap> list5 = this.perLaps;
            PerLap perLap3 = list5.get(list5.size() - 1);
            perLap3.lapNum = data.getShort();
            perLap3.lapType = data.get();
            perLap3.avgHR = data.get();
            perLap3.calorie = data.getShort();
            perLap3.stepCadence = data.getShort();
        }
        if (i2 == 41973 && this.perLaps.size() > 0) {
            List<PerLap> list6 = this.perLaps;
            PerLap perLap4 = list6.get(list6.size() - 1);
            perLap4.maxPace = data.getShort();
            perLap4.SWOLF = data.getShort();
            perLap4.climbUp = data.getShort();
            perLap4.climbDown = data.getShort();
        }
        if (i2 == 42229 && this.perLaps.size() > 0) {
            List<PerLap> list7 = this.perLaps;
            PerLap perLap5 = list7.get(list7.size() - 1);
            perLap5.climbDistance = data.getInt();
            perLap5.costTime = data.getInt();
        }
        if (i2 == 61530) {
            PauseInfo pauseInfo = new PauseInfo();
            pauseInfo.offsetToStart = data.getInt();
            pauseInfo.stopTime = data.getInt();
            pauseInfo.type = data.get();
            this.pauseInfos.add(pauseInfo);
            return;
        }
        if (i2 == 41125) {
            MarathonInfo marathonInfo = new MarathonInfo();
            marathonInfo.halfOrFull = data.get();
            data.get();
            marathonInfo.distance = data.getShort();
            marathonInfo.duration = data.getInt();
            this.marathonInfos.add(marathonInfo);
        }
        if (i >= 128 || this.items.size() <= 0) {
            return;
        }
        List<Item> list8 = this.items;
        Item item3 = list8.get(list8.size() - 1);
        Point point3 = new Point();
        point3.offsetTime = b;
        point3.offsetAltitude = b2;
        point3.cadence = data.getShort();
        point3.pace = data.getShort();
        point3.heartRate[1] = data.get();
        point3.heartRate[0] = data.get();
        point3.stepLength = data.get();
        point3.steps = data.get();
        point3.distance = data.get();
        item3.points.add(point3);
    }

    public List<DataPoint> convert() {
        ArrayList arrayList = new ArrayList();
        int size = this.items.size();
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Item item = this.items.get(i2);
                int size2 = item.points.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Point point = item.points.get(i3);
                    DataPoint dataPoint = new DataPoint();
                    if (i3 == 0) {
                        dataPoint.offsetTime = item.offsetToStart - i;
                    } else {
                        dataPoint.offsetTime = point.offsetTime & 255;
                    }
                    dataPoint.pace = point.pace;
                    dataPoint.heartRate = point.heartRate;
                    dataPoint.distance = point.distance & 255;
                    dataPoint.steps = point.steps & 255;
                    dataPoint.stepLength = point.stepLength & 255;
                    dataPoint.cadence = point.cadence;
                    i += dataPoint.offsetTime;
                    arrayList.add(dataPoint);
                }
            }
        }
        return arrayList;
    }

    public void parse(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < bytes.length / 11; i++) {
            if (i > 0) {
                byteBufferWrap.position(i * 11);
            }
            b(byteBufferWrap);
        }
    }

    public String toShortString() {
        return toString();
    }

    public String toString() {
        return "<Items: \n" + ArraysUtil.toString(this.items, "\n") + ", PerKMs: \n" + ArraysUtil.toString(this.perKMs, "\n") + ", PerLaps: \n" + ArraysUtil.toString(this.perLaps, "\n") + ", PauseInfos: \n" + ArraysUtil.toString(this.pauseInfos, "\n") + ", MarathonInfos: \n" + ArraysUtil.toString(this.marathonInfos, "\n") + Typography.greater;
    }
}
