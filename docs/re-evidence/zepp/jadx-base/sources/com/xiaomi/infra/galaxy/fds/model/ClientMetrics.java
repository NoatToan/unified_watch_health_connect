package com.xiaomi.infra.galaxy.fds.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ClientMetrics {
    private List<MetricData> a = new ArrayList();

    public enum LatencyMetricType {
        ExecutionTime
    }

    public void add(MetricData metricData) {
        this.a.add(metricData);
    }

    public List<MetricData> getMetrics() {
        return this.a;
    }

    public void setMetrics(List<MetricData> list) {
        this.a = list;
    }
}
