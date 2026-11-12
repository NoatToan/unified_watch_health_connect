package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleSportSummary {
    public byte TE;
    public byte avgHeartRate;
    public short avgStride;
    public short calorie;
    public short[] childSportTypes;
    public int[] childTrackIds;
    public int climbAscendDis;
    public int climbAscendDuration;
    public int climbDescendDis;
    public int climbDescentDuration;
    public short climbDown;
    public short climbUp;
    public int distance;
    public int distancePerLap;
    public short downhillCount;
    public short downhillMaxDrop;
    public int duration;
    public int endTime;
    public short highestAltitude;
    public byte intervalType;
    public int latitude;
    public int longitude;
    public short lowestAltitude;
    public byte maxHeartRate;
    public short maxSpeed;
    public short maxStepFreq;
    public byte minHeartRate;
    public int parentTrackId;
    public short ropeSkippingAvgFreq;
    public short ropeSkippingMaxFreq;
    public int ropeSkippingRestTime;
    public short ropeSkippingTotalCount;
    public short speed;
    public short sportType;
    public int stepCount;
    public short stepFreq;
    public short swimAvgDistancePerStroke;
    public short swimAvgStokeSpeed;
    public short swimMaxStrokeSpeed;
    public byte swimPoolLength;
    public byte swimStyle;
    public short swimSwolfPerFixedMeters;
    public short swimTotalStrokes;
    public short swimTotalTrips;
    public short tennisBackhand;
    public short tennisForehand;
    public short tennisSecondHalfStartTime;
    public short tennisServeCount;
    public short tennisStrokes;
    public int trackId;
    public byte unit;
    public byte version;
    public byte weatherFrom;
    public byte weatherMaxTemperature;
    public byte weatherMinTemperature;
    public byte weatherTo;
    public byte zone;

    public static BleSportSummary parse(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        BleSportSummary bleSportSummary = new BleSportSummary();
        bleSportSummary.trackId = byteBufferWrap.getInt();
        bleSportSummary.version = byteBufferWrap.get();
        byteBufferWrap.get();
        bleSportSummary.sportType = byteBufferWrap.getShort();
        bleSportSummary.intervalType = byteBufferWrap.get();
        bleSportSummary.avgHeartRate = byteBufferWrap.get();
        bleSportSummary.maxHeartRate = byteBufferWrap.get();
        bleSportSummary.minHeartRate = byteBufferWrap.get();
        byteBufferWrap.getInt();
        bleSportSummary.endTime = byteBufferWrap.getInt();
        bleSportSummary.duration = byteBufferWrap.getInt();
        bleSportSummary.distance = byteBufferWrap.getInt();
        bleSportSummary.speed = byteBufferWrap.getShort();
        bleSportSummary.maxSpeed = byteBufferWrap.getShort();
        bleSportSummary.calorie = byteBufferWrap.getShort();
        bleSportSummary.stepFreq = byteBufferWrap.getShort();
        bleSportSummary.maxStepFreq = byteBufferWrap.getShort();
        bleSportSummary.avgStride = byteBufferWrap.getShort();
        bleSportSummary.stepCount = byteBufferWrap.getInt();
        bleSportSummary.highestAltitude = byteBufferWrap.getShort();
        bleSportSummary.lowestAltitude = byteBufferWrap.getShort();
        bleSportSummary.climbUp = byteBufferWrap.getShort();
        bleSportSummary.climbDown = byteBufferWrap.getShort();
        bleSportSummary.climbAscendDis = byteBufferWrap.getInt();
        bleSportSummary.climbDescendDis = byteBufferWrap.getInt();
        bleSportSummary.climbAscendDuration = byteBufferWrap.getInt();
        bleSportSummary.climbDescentDuration = byteBufferWrap.getInt();
        bleSportSummary.TE = byteBufferWrap.get();
        bleSportSummary.swimPoolLength = byteBufferWrap.get();
        bleSportSummary.swimStyle = byteBufferWrap.get();
        bleSportSummary.unit = byteBufferWrap.get();
        bleSportSummary.parentTrackId = byteBufferWrap.getInt();
        bleSportSummary.childTrackIds = new int[5];
        for (int i = 0; i < 5; i++) {
            bleSportSummary.childTrackIds[i] = byteBufferWrap.getInt();
        }
        bleSportSummary.childSportTypes = new short[5];
        for (int i2 = 0; i2 < 5; i2++) {
            bleSportSummary.childSportTypes[i2] = byteBufferWrap.getShort();
        }
        byteBufferWrap.getShort();
        bleSportSummary.longitude = byteBufferWrap.getInt();
        bleSportSummary.latitude = byteBufferWrap.getInt();
        bleSportSummary.swimSwolfPerFixedMeters = byteBufferWrap.getShort();
        bleSportSummary.swimTotalStrokes = byteBufferWrap.getShort();
        bleSportSummary.swimTotalTrips = byteBufferWrap.getShort();
        bleSportSummary.swimAvgStokeSpeed = byteBufferWrap.getShort();
        bleSportSummary.swimMaxStrokeSpeed = byteBufferWrap.getShort();
        bleSportSummary.swimAvgDistancePerStroke = byteBufferWrap.getShort();
        bleSportSummary.downhillCount = byteBufferWrap.getShort();
        bleSportSummary.downhillMaxDrop = byteBufferWrap.getShort();
        bleSportSummary.tennisStrokes = byteBufferWrap.getShort();
        bleSportSummary.tennisForehand = byteBufferWrap.getShort();
        bleSportSummary.tennisBackhand = byteBufferWrap.getShort();
        bleSportSummary.tennisServeCount = byteBufferWrap.getShort();
        bleSportSummary.tennisSecondHalfStartTime = byteBufferWrap.getShort();
        bleSportSummary.ropeSkippingTotalCount = byteBufferWrap.getShort();
        bleSportSummary.ropeSkippingAvgFreq = byteBufferWrap.getShort();
        bleSportSummary.ropeSkippingMaxFreq = byteBufferWrap.getShort();
        bleSportSummary.ropeSkippingRestTime = byteBufferWrap.getInt();
        bleSportSummary.weatherMaxTemperature = byteBufferWrap.get();
        bleSportSummary.weatherMinTemperature = byteBufferWrap.get();
        bleSportSummary.weatherFrom = byteBufferWrap.get();
        bleSportSummary.weatherTo = byteBufferWrap.get();
        return bleSportSummary;
    }

    public String toString() {
        return "<TrackId: " + this.trackId + ", Version: " + ((int) this.version) + ", Zone: " + ((int) this.zone) + ", SportType: " + ((int) this.sportType) + ", IntervalType: " + ((int) this.intervalType) + ", AvgHeartRate: " + ((int) this.avgHeartRate) + ", MaxHeartRate: " + ((int) this.maxHeartRate) + ", MinHeartRate: " + ((int) this.minHeartRate) + ", DistancePerLap: " + this.distancePerLap + ", EndTime: " + this.endTime + ", Duration: " + this.duration + ", Distance: " + this.distance + ", Speed: " + ((int) this.speed) + ", MaxSpeed: " + ((int) this.maxSpeed) + ", Calorie: " + ((int) this.calorie) + ", StepFreq: " + ((int) this.stepFreq) + ", MaxStepFreq: " + ((int) this.maxStepFreq) + ", AvgStride: " + ((int) this.avgStride) + ", StepCount: " + this.stepCount + ", HighestAltitude: " + ((int) this.highestAltitude) + ", LowestAltitude: " + ((int) this.lowestAltitude) + ", ClimbUp: " + ((int) this.climbUp) + ", ClimbDown: " + ((int) this.climbDown) + ", ClimbAscendDis: " + this.climbAscendDis + ", ClimbDescendDis: " + this.climbDescendDis + ", ClimbAscendDur: " + this.climbAscendDuration + ", ClimbDescentDur: " + this.climbDescentDuration + ", TE: " + ((int) this.TE) + ", SwimPoolLength: " + ((int) this.swimPoolLength) + ", SwimStyle: " + ((int) this.swimStyle) + ", Unit: " + ((int) this.unit) + ", ParentTrackId: " + this.parentTrackId + ", ChildTrackId: " + Arrays.toString(this.childTrackIds) + ", ChildSportType: " + Arrays.toString(this.childSportTypes) + ", Longitude: " + this.longitude + ", Latitude: " + this.latitude + ", SwimSwolfPerFixedMeters: " + ((int) this.swimSwolfPerFixedMeters) + ", SwimTotalStokes: " + ((int) this.swimTotalStrokes) + ", SwimTotalTrips: " + ((int) this.swimTotalTrips) + ", SwimAvgStokeSpeed: " + ((int) this.swimAvgStokeSpeed) + ", SwimMaxStrokeSpeed: " + ((int) this.swimMaxStrokeSpeed) + ", SwimAvgDistancePerStroke: " + ((int) this.swimAvgDistancePerStroke) + ", DownhillCount: " + ((int) this.downhillCount) + ", DownhillMax: " + ((int) this.downhillMaxDrop) + ", TennisStrokes: " + ((int) this.tennisStrokes) + ", TennisForehand: " + ((int) this.tennisForehand) + ", TennisBackhand: " + ((int) this.tennisBackhand) + ", TennisServeCount: " + ((int) this.tennisServeCount) + ", TennisSecondHalfStartTime: " + ((int) this.tennisSecondHalfStartTime) + ", RopeSkippingTotalCount: " + ((int) this.ropeSkippingTotalCount) + ", RopeSkippingAvgFreq: " + ((int) this.ropeSkippingAvgFreq) + ", RopeSkippingMaxFreq: " + ((int) this.ropeSkippingMaxFreq) + ", RopeSkippingRestTime: " + this.ropeSkippingRestTime + ", WeatherMaxTemperature: " + ((int) this.weatherMaxTemperature) + ", WeatherMinTemperature: " + ((int) this.weatherMinTemperature) + ", WeatherFrom: " + ((int) this.weatherFrom) + ", WeatherTo: " + ((int) this.weatherTo) + Typography.greater;
    }
}
