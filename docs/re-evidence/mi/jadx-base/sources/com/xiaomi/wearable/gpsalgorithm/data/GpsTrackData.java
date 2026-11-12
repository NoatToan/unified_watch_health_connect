package com.xiaomi.wearable.gpsalgorithm.data;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GpsTrackData {
    public final long endTime;
    public final boolean gpsSourceValid;
    public final boolean hAccValid;
    public final List<Location> locationList;
    public final boolean speedValid;
    public final int sportType;
    public final long startTime;
    public final byte[] tgcBytes;
    public final long timeStamp;

    public static class Builder {
        private long endTime;
        public boolean gpsSourceValid;
        private boolean hAccValid;
        public List<Location> locationList;
        private boolean speedValid;
        private int sportType;
        private long startTime;
        public byte[] tgcBytes;
        private long timeStamp;

        public GpsTrackData build() {
            return new GpsTrackData(this);
        }

        public Builder endTime(long j) {
            this.endTime = j;
            return this;
        }

        public Builder gpsSourceValid(boolean z) {
            this.gpsSourceValid = z;
            return this;
        }

        public Builder hAccValid(boolean z) {
            this.hAccValid = z;
            return this;
        }

        public Builder locationList(List<Location> list) {
            this.locationList = list;
            return this;
        }

        public Builder speedValid(boolean z) {
            this.speedValid = z;
            return this;
        }

        public Builder sportReport(SportBasicReport sportBasicReport) {
            this.sportType = sportBasicReport.getSportType();
            this.startTime = sportBasicReport.getStartTime();
            this.endTime = sportBasicReport.getEndTime();
            this.hAccValid = sportBasicReport.getHAccValid();
            this.speedValid = sportBasicReport.getSpeedValid();
            this.gpsSourceValid = sportBasicReport.getGpsSourceValid();
            return this;
        }

        public Builder sportType(int i) {
            this.sportType = i;
            return this;
        }

        public Builder startTime(long j) {
            this.startTime = j;
            return this;
        }

        public Builder tgcData(byte[] bArr) {
            this.tgcBytes = bArr;
            return this;
        }

        public Builder timeStamp(long j) {
            this.timeStamp = j;
            return this;
        }
    }

    public GpsTrackData(Builder builder) {
        this.timeStamp = builder.timeStamp;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.sportType = builder.sportType;
        this.hAccValid = builder.hAccValid;
        this.speedValid = builder.speedValid;
        this.gpsSourceValid = builder.gpsSourceValid;
        this.locationList = builder.locationList;
        this.tgcBytes = builder.tgcBytes;
    }
}
