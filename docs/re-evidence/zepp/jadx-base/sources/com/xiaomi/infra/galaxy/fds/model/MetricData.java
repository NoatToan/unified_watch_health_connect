package com.xiaomi.infra.galaxy.fds.model;

/* JADX INFO: loaded from: classes22.dex */
public class MetricData {
    private MetricType a;
    private String b;
    private long c;
    private long d;

    public enum MetricType {
        Latency,
        Throughput,
        Counter
    }

    public MetricData() {
    }

    public String getMetricName() {
        return this.b;
    }

    public MetricType getMetricType() {
        return this.a;
    }

    public long getTimestamp() {
        return this.d;
    }

    public long getValue() {
        return this.c;
    }

    public void setMetricName(String str) {
        this.b = str;
    }

    public void setMetricType(MetricType metricType) {
        this.a = metricType;
    }

    public void setTimestamp(long j) {
        this.d = j;
    }

    public void setValue(long j) {
        this.c = j;
    }

    public MetricData withMetricName(String str) {
        this.b = str;
        return this;
    }

    public MetricData withMetricType(MetricType metricType) {
        this.a = metricType;
        return this;
    }

    public MetricData withTimeStamp(long j) {
        this.d = j;
        return this;
    }

    public MetricData withValue(long j) {
        this.c = j;
        return this;
    }

    public MetricData(MetricType metricType, String str, long j, long j2) {
        this.a = metricType;
        this.b = str;
        this.c = j;
        this.d = j2;
    }
}
