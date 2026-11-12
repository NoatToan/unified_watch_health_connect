package com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter;

/* JADX INFO: loaded from: classes22.dex */
public interface TrackRecordManagerAdapter {

    public static class SimpleTrackRecord {
        private Long a;
        private Integer b;
        private Integer c;
        private Float d;
        private Integer e;
        private Integer f;
        private Integer g;
        private Integer h;
        private Integer i;
        private Integer j;
        private Integer k;
        private String l;

        public Integer getAltitudeAscend() {
            return this.i;
        }

        public Integer getAvgStrideLength() {
            return this.k;
        }

        public Integer getAvghr() {
            return this.f;
        }

        public Integer getCal() {
            return this.h;
        }

        public String getContoururi() {
            return this.l;
        }

        public Integer getCosttime() {
            return this.b;
        }

        public Integer getDistance() {
            return this.c;
        }

        public Integer getFfpercent() {
            return this.e;
        }

        public Float getPace() {
            return this.d;
        }

        public Integer getSfreq() {
            return this.g;
        }

        public Integer getTotalStep() {
            return this.j;
        }

        public Long getTrackid() {
            return this.a;
        }

        public void setAltitudeAscend(Integer num) {
            this.i = num;
        }

        public void setAvgStrideLength(Integer num) {
            this.k = num;
        }

        public void setAvghr(Integer num) {
            this.f = num;
        }

        public void setCal(Integer num) {
            this.h = num;
        }

        public void setContoururi(String str) {
            this.l = str;
        }

        public void setCosttime(Integer num) {
            this.b = num;
        }

        public void setDistance(Integer num) {
            this.c = num;
        }

        public void setFfpercent(Integer num) {
            this.e = num;
        }

        public void setPace(Float f) {
            this.d = f;
        }

        public void setSfreq(Integer num) {
            this.g = num;
        }

        public void setTotalStep(Integer num) {
            this.j = num;
        }

        public void setTrackid(Long l) {
            this.a = l;
        }
    }

    SimpleTrackRecord getTrackRecordById(long j, int i);
}
