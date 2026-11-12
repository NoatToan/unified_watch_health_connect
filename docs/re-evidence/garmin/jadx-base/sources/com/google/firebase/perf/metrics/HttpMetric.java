package com.google.firebase.perf.metrics;

import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class HttpMetric implements FirebasePerformanceAttributable {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Map<String, String> customAttributesMap;
    private boolean isDisabled;
    private boolean isStopped;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final Timer timer;

    public HttpMetric(String str, String str2, TransportManager transportManager, Timer timer) {
        this.isStopped = false;
        this.isDisabled = false;
        this.customAttributesMap = new ConcurrentHashMap();
        this.timer = timer;
        NetworkRequestMetricBuilder httpMethod = NetworkRequestMetricBuilder.builder(transportManager).setUrl(str).setHttpMethod(str2);
        this.networkMetricBuilder = httpMethod;
        httpMethod.setManualNetworkRequestMetric();
        if (ConfigResolver.getInstance().isPerformanceMonitoringEnabled()) {
            return;
        }
        logger.info("HttpMetric feature is disabled. URL %s", str);
        this.isDisabled = true;
    }

    private void checkAttribute(String str, String str2) {
        if (this.isStopped) {
            h.s("HttpMetric has been logged already so unable to modify attributes");
        } else if (this.customAttributesMap.containsKey(str) || this.customAttributesMap.size() < 5) {
            PerfMetricValidator.validateAttribute(str, str2);
        } else {
            Locale locale = Locale.ENGLISH;
            h.s("Exceeds max limit of number of attributes - 5");
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public String getAttribute(String str) {
        return this.customAttributesMap.get(str);
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public Map<String, String> getAttributes() {
        return new HashMap(this.customAttributesMap);
    }

    public void markRequestComplete() {
        this.networkMetricBuilder.setTimeToRequestCompletedMicros(this.timer.getDurationMicros());
    }

    public void markResponseStart() {
        this.networkMetricBuilder.setTimeToResponseInitiatedMicros(this.timer.getDurationMicros());
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void putAttribute(String str, String str2) {
        boolean z14;
        try {
            str = str.trim();
            str2 = str2.trim();
            checkAttribute(str, str2);
            logger.debug("Setting attribute '%s' to %s on network request '%s'", str, str2, this.networkMetricBuilder.getUrl());
            z14 = true;
        } catch (Exception e4) {
            logger.error("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e4.getMessage());
            z14 = false;
        }
        if (z14) {
            this.customAttributesMap.put(str, str2);
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void removeAttribute(String str) {
        if (this.isStopped) {
            logger.error("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.customAttributesMap.remove(str);
        }
    }

    public void setHttpResponseCode(int i14) {
        this.networkMetricBuilder.setHttpResponseCode(i14);
    }

    public void setRequestPayloadSize(long j8) {
        this.networkMetricBuilder.setRequestPayloadBytes(j8);
    }

    public void setResponseContentType(String str) {
        this.networkMetricBuilder.setResponseContentType(str);
    }

    public void setResponsePayloadSize(long j8) {
        this.networkMetricBuilder.setResponsePayloadBytes(j8);
    }

    public void start() {
        this.timer.reset();
        this.networkMetricBuilder.setRequestStartTimeMicros(this.timer.getMicros());
    }

    public void stop() {
        if (this.isDisabled) {
            return;
        }
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros()).setCustomAttributes(this.customAttributesMap).build();
        this.isStopped = true;
    }

    public HttpMetric(URL url, String str, TransportManager transportManager, Timer timer) {
        this(url.toString(), str, transportManager, timer);
    }
}
